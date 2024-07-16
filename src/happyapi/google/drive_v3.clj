(ns happyapi.google.drive-v3
  "Google Drive API
The Google Drive API allows clients to access resources from Google Drive.
See: https://developers.google.com/drive/"
  (:require [happyapi.providers.google :as client]))

(defn permissions-create
  "Creates a permission for a file or shared drive. **Warning:** Concurrent permissions operations on the same file are not supported; only the last update is applied.
https://developers.google.com/drive/v3/reference/rest/v3/permissions/create

fileId <> 
Permission:
Permission

optional:
moveToNewOwnersRoot <boolean> This parameter will only take effect if the item is not in a shared drive and the request is attempting to transfer the ownership of the item. If set to `true`, the item will be moved to the new owner's My Drive root folder and all prior parents removed. If set to `false`, parents are not changed.
enforceSingleParent <boolean> Deprecated: See `moveToNewOwnersRoot` for details.
sendNotificationEmail <boolean> Whether to send a notification email when sharing to users or groups. This defaults to true for users and groups, and is not allowed for other requests. It must not be disabled for ownership transfers.
transferOwnership <boolean> Whether to transfer ownership to the specified user and downgrade the current owner to a writer. This parameter is required as an acknowledgement of the side effect.
emailMessage <string> A plain text custom message to include in the notification email.
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
useDomainAdminAccess <boolean> Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared drive and the requester is an administrator of the domain to which the shared drive belongs.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead."
  ([fileId Permission] (permissions-create fileId Permission nil))
  ([fileId Permission optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}/permissions",
       :uri-template-args {"fileId" fileId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"],
       :body Permission})))

(defn permissions-delete
  "Deletes a permission. **Warning:** Concurrent permissions operations on the same file are not supported; only the last update is applied.
https://developers.google.com/drive/v3/reference/rest/v3/permissions/delete

fileId <> 
permissionId <> 

optional:
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead.
useDomainAdminAccess <boolean> Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared drive and the requester is an administrator of the domain to which the shared drive belongs."
  ([fileId permissionId] (permissions-delete fileId permissionId nil))
  ([fileId permissionId optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}/permissions/{permissionId}",
       :uri-template-args
       {"fileId" fileId, "permissionId" permissionId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"]})))

(defn permissions-get
  "Gets a permission by ID.
https://developers.google.com/drive/v3/reference/rest/v3/permissions/get

fileId <> 
permissionId <> 

optional:
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead.
useDomainAdminAccess <boolean> Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared drive and the requester is an administrator of the domain to which the shared drive belongs."
  ([fileId permissionId] (permissions-get fileId permissionId nil))
  ([fileId permissionId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}/permissions/{permissionId}",
       :uri-template-args
       {"fileId" fileId, "permissionId" permissionId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.metadata"
        "https://www.googleapis.com/auth/drive.metadata.readonly"
        "https://www.googleapis.com/auth/drive.photos.readonly"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn permissions-list
  "Lists a file's or shared drive's permissions.
https://developers.google.com/drive/v3/reference/rest/v3/permissions/list

fileId <> 

optional:
pageSize <integer> The maximum number of permissions to return per page. When not set for files in a shared drive, at most 100 results will be returned. When not set for files that are not in a shared drive, the entire list will be returned.
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead.
useDomainAdminAccess <boolean> Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared drive and the requester is an administrator of the domain to which the shared drive belongs.
includePermissionsForView <string> Specifies which additional view's permissions to include in the response. Only 'published' is supported."
  ([fileId] (permissions-list fileId nil))
  ([fileId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}/permissions",
       :uri-template-args {"fileId" fileId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.metadata"
        "https://www.googleapis.com/auth/drive.metadata.readonly"
        "https://www.googleapis.com/auth/drive.photos.readonly"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn permissions-update
  "Updates a permission with patch semantics. **Warning:** Concurrent permissions operations on the same file are not supported; only the last update is applied.
https://developers.google.com/drive/v3/reference/rest/v3/permissions/update

fileId <> 
permissionId <> 
Permission:
Permission

optional:
removeExpiration <boolean> Whether to remove the expiration date.
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead.
transferOwnership <boolean> Whether to transfer ownership to the specified user and downgrade the current owner to a writer. This parameter is required as an acknowledgement of the side effect.
useDomainAdminAccess <boolean> Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared drive and the requester is an administrator of the domain to which the shared drive belongs."
  ([fileId permissionId Permission]
    (permissions-update fileId permissionId Permission nil))
  ([fileId permissionId Permission optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}/permissions/{permissionId}",
       :uri-template-args
       {"fileId" fileId, "permissionId" permissionId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"],
       :body Permission})))

(defn drives-create
  "Creates a shared drive.
https://developers.google.com/drive/v3/reference/rest/v3/drives/create

requestId <> 
Drive:
Drive"
  [requestId Drive]
  (client/api-request
    {:method :post,
     :uri-template "https://www.googleapis.com/drive/v3/drives",
     :uri-template-args {},
     :query-params {"requestId" requestId},
     :scopes ["https://www.googleapis.com/auth/drive"],
     :body Drive}))

(defn drives-delete
  "Permanently deletes a shared drive for which the user is an `organizer`. The shared drive cannot contain any untrashed items.
https://developers.google.com/drive/v3/reference/rest/v3/drives/delete

driveId <> 

optional:
useDomainAdminAccess <boolean> Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the shared drive belongs.
allowItemDeletion <boolean> Whether any items inside the shared drive should also be deleted. This option is only supported when `useDomainAdminAccess` is also set to `true`."
  ([driveId] (drives-delete driveId nil))
  ([driveId optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://www.googleapis.com/drive/v3/drives/{driveId}",
       :uri-template-args {"driveId" driveId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/drive"]})))

(defn drives-get
  "Gets a shared drive's metadata by ID.
https://developers.google.com/drive/v3/reference/rest/v3/drives/get

driveId <> 

optional:
useDomainAdminAccess <boolean> Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the shared drive belongs."
  ([driveId] (drives-get driveId nil))
  ([driveId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/drive/v3/drives/{driveId}",
       :uri-template-args {"driveId" driveId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn drives-hide
  "Hides a shared drive from the default view.
https://developers.google.com/drive/v3/reference/rest/v3/drives/hide

driveId <> "
  [driveId]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/drive/v3/drives/{driveId}/hide",
     :uri-template-args {"driveId" driveId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/drive"]}))

(defn drives-list
  " Lists the user's shared drives. This method accepts the `q` parameter, which is a search query combining one or more search terms. For more information, see the [Search for shared drives](/drive/api/guides/search-shareddrives) guide.
https://developers.google.com/drive/v3/reference/rest/v3/drives/list

optional:
pageSize <integer> Maximum number of shared drives to return per page.
q <string> Query string for searching shared drives.
useDomainAdminAccess <boolean> Issue the request as a domain administrator; if set to true, then all shared drives of the domain in which the requester is an administrator are returned."
  ([] (drives-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template "https://www.googleapis.com/drive/v3/drives",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn drives-unhide
  "Restores a shared drive to the default view.
https://developers.google.com/drive/v3/reference/rest/v3/drives/unhide

driveId <> "
  [driveId]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/drive/v3/drives/{driveId}/unhide",
     :uri-template-args {"driveId" driveId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/drive"]}))

(defn drives-update
  "Updates the metadata for a shared drive.
https://developers.google.com/drive/v3/reference/rest/v3/drives/update

driveId <> 
Drive:
Drive

optional:
useDomainAdminAccess <boolean> Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the shared drive belongs."
  ([driveId Drive] (drives-update driveId Drive nil))
  ([driveId Drive optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://www.googleapis.com/drive/v3/drives/{driveId}",
       :uri-template-args {"driveId" driveId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/drive"],
       :body Drive})))

(defn about-get
  "Gets information about the user, the user's Drive, and system capabilities.
https://developers.google.com/drive/v3/reference/rest/v3/about/get"
  []
  (client/api-request
    {:method :get,
     :uri-template "https://www.googleapis.com/drive/v3/about",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.appdata"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/drive.metadata"
      "https://www.googleapis.com/auth/drive.metadata.readonly"
      "https://www.googleapis.com/auth/drive.photos.readonly"
      "https://www.googleapis.com/auth/drive.readonly"]}))

(defn files-generateIds
  "Generates a set of file IDs which can be provided in create or copy requests.
https://developers.google.com/drive/v3/reference/rest/v3/files/generateIds

optional:
count <integer> The number of IDs to return.
space <string> The space in which the IDs can be used to create new files. Supported values are 'drive' and 'appDataFolder'. (Default: 'drive')
type <string> The type of items which the IDs can be used for. Supported values are 'files' and 'shortcuts'. Note that 'shortcuts' are only supported in the `drive` 'space'. (Default: 'files')"
  ([] (files-generateIds nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/generateIds",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.appdata"
        "https://www.googleapis.com/auth/drive.file"]})))

(defn files-list
  " Lists the user's files. This method accepts the `q` parameter, which is a search query combining one or more search terms. For more information, see the [Search for files & folders](/drive/api/guides/search-files) guide. *Note:* This method returns *all* files by default, including trashed files. If you don't want trashed files to appear in the list, use the `trashed=false` query parameter to remove trashed files from the results.
https://developers.google.com/drive/v3/reference/rest/v3/files/list

optional:
q <string> A query for filtering the file results. See the \"Search for files & folders\" guide for supported syntax.
includeItemsFromAllDrives <boolean> Whether both My Drive and shared drive items should be included in results.
pageSize <integer> The maximum number of files to return per page. Partial or empty result pages are possible even before the end of the files list has been reached.
driveId <string> ID of the shared drive to search.
corpora <string> Bodies of items (files/documents) to which the query applies. Supported bodies are 'user', 'domain', 'drive', and 'allDrives'. Prefer 'user' or 'drive' to 'allDrives' for efficiency. By default, corpora is set to 'user'. However, this can change depending on the filter set through the 'q' parameter.
spaces <string> A comma-separated list of spaces to query within the corpora. Supported values are 'drive' and 'appDataFolder'.
orderBy <string> A comma-separated list of sort keys. Valid keys are 'createdTime', 'folder', 'modifiedByMeTime', 'modifiedTime', 'name', 'name_natural', 'quotaBytesUsed', 'recency', 'sharedWithMeTime', 'starred', and 'viewedByMeTime'. Each key sorts ascending by default, but can be reversed with the 'desc' modifier. Example usage: ?orderBy=folder,modifiedTime desc,name.
includeTeamDriveItems <boolean> Deprecated: Use `includeItemsFromAllDrives` instead.
teamDriveId <string> Deprecated: Use `driveId` instead.
includeLabels <string> A comma-separated list of IDs of labels to include in the `labelInfo` part of the response.
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
corpus <string> Deprecated: The source of files to list. Use 'corpora' instead.
includePermissionsForView <string> Specifies which additional view's permissions to include in the response. Only 'published' is supported.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead."
  ([] (files-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template "https://www.googleapis.com/drive/v3/files",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.appdata"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.metadata"
        "https://www.googleapis.com/auth/drive.metadata.readonly"
        "https://www.googleapis.com/auth/drive.photos.readonly"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn files-copy
  "Creates a copy of a file and applies any requested updates with patch semantics.
https://developers.google.com/drive/v3/reference/rest/v3/files/copy

fileId <> 
File:
File

optional:
enforceSingleParent <boolean> Deprecated. Copying files into multiple folders is no longer supported. Use shortcuts instead.
ignoreDefaultVisibility <boolean> Whether to ignore the domain's default visibility settings for the created file. Domain administrators can choose to make all uploaded files visible to the domain by default; this parameter bypasses that behavior for the request. Permissions are still inherited from parent folders.
keepRevisionForever <boolean> Whether to set the 'keepForever' field in the new head revision. This is only applicable to files with binary content in Google Drive. Only 200 revisions for the file can be kept forever. If the limit is reached, try deleting pinned revisions.
includeLabels <string> A comma-separated list of IDs of labels to include in the `labelInfo` part of the response.
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
includePermissionsForView <string> Specifies which additional view's permissions to include in the response. Only 'published' is supported.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead.
ocrLanguage <string> A language hint for OCR processing during image import (ISO 639-1 code)."
  ([fileId File] (files-copy fileId File nil))
  ([fileId File optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}/copy",
       :uri-template-args {"fileId" fileId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.appdata"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.photos.readonly"],
       :body File})))

(defn files-delete
  "Permanently deletes a file owned by the user without moving it to the trash. If the file belongs to a shared drive, the user must be an `organizer` on the parent folder. If the target is a folder, all descendants owned by the user are also deleted.
https://developers.google.com/drive/v3/reference/rest/v3/files/delete

fileId <> 

optional:
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead.
enforceSingleParent <boolean> Deprecated: If an item is not in a shared drive and its last parent is deleted but the item itself is not, the item will be placed under its owner's root."
  ([fileId] (files-delete fileId nil))
  ([fileId optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}",
       :uri-template-args {"fileId" fileId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.appdata"
        "https://www.googleapis.com/auth/drive.file"]})))

(defn files-export
  "Exports a Google Workspace document to the requested MIME type and returns exported byte content. Note that the exported content is limited to 10MB.
https://developers.google.com/drive/v3/reference/rest/v3/files/export

fileId <> 
mimeType <> "
  [fileId mimeType]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/drive/v3/files/{fileId}/export",
     :uri-template-args {"fileId" fileId},
     :query-params {"mimeType" mimeType},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/drive.meet.readonly"
      "https://www.googleapis.com/auth/drive.readonly"]}))

(defn files-modifyLabels
  "Modifies the set of labels applied to a file. Returns a list of the labels that were added or modified.
https://developers.google.com/drive/v3/reference/rest/v3/files/modifyLabels

fileId <> 
ModifyLabelsRequest:
ModifyLabelsRequest"
  [fileId ModifyLabelsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/drive/v3/files/{fileId}/modifyLabels",
     :uri-template-args {"fileId" fileId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/drive.metadata"],
     :body ModifyLabelsRequest}))

(defn files-update
  " Updates a file's metadata and/or content. When calling this method, only populate fields in the request that you want to modify. When updating fields, some fields might be changed automatically, such as `modifiedDate`. This method supports patch semantics. This method supports an */upload* URI and accepts uploaded media with the following characteristics: - *Maximum file size:* 5,120 GB - *Accepted Media MIME types:*`*/*` Note: Specify a valid MIME type, rather than the literal `*/*` value. The literal `*/*` is only used to indicate that any valid MIME type can be uploaded. For more information on uploading files, see [Upload file data](/drive/api/guides/manage-uploads).
https://developers.google.com/drive/v3/reference/rest/v3/files/update

fileId <> 
File:
File

optional:
enforceSingleParent <boolean> Deprecated: Adding files to multiple folders is no longer supported. Use shortcuts instead.
removeParents <string> A comma-separated list of parent IDs to remove.
keepRevisionForever <boolean> Whether to set the 'keepForever' field in the new head revision. This is only applicable to files with binary content in Google Drive. Only 200 revisions for the file can be kept forever. If the limit is reached, try deleting pinned revisions.
addParents <string> A comma-separated list of parent IDs to add.
useContentAsIndexableText <boolean> Whether to use the uploaded content as indexable text.
includeLabels <string> A comma-separated list of IDs of labels to include in the `labelInfo` part of the response.
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
includePermissionsForView <string> Specifies which additional view's permissions to include in the response. Only 'published' is supported.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead.
ocrLanguage <string> A language hint for OCR processing during image import (ISO 639-1 code)."
  ([fileId File] (files-update fileId File nil))
  ([fileId File optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}",
       :uri-template-args {"fileId" fileId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.appdata"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.metadata"
        "https://www.googleapis.com/auth/drive.scripts"],
       :body File})))

(defn files-watch
  "Subscribes to changes to a file.
https://developers.google.com/drive/v3/reference/rest/v3/files/watch

fileId <> 
Channel:
Channel

optional:
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead.
acknowledgeAbuse <boolean> Whether the user is acknowledging the risk of downloading known malware or other abusive files. This is only applicable when alt=media.
includePermissionsForView <string> Specifies which additional view's permissions to include in the response. Only 'published' is supported.
includeLabels <string> A comma-separated list of IDs of labels to include in the `labelInfo` part of the response."
  ([fileId Channel] (files-watch fileId Channel nil))
  ([fileId Channel optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}/watch",
       :uri-template-args {"fileId" fileId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.appdata"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.metadata"
        "https://www.googleapis.com/auth/drive.metadata.readonly"
        "https://www.googleapis.com/auth/drive.photos.readonly"
        "https://www.googleapis.com/auth/drive.readonly"],
       :body Channel})))

(defn files-create
  " Creates a new file. This method supports an */upload* URI and accepts uploaded media with the following characteristics: - *Maximum file size:* 5,120 GB - *Accepted Media MIME types:*`*/*` Note: Specify a valid MIME type, rather than the literal `*/*` value. The literal `*/*` is only used to indicate that any valid MIME type can be uploaded. For more information on uploading files, see [Upload file data](/drive/api/guides/manage-uploads). Apps creating shortcuts with `files.create` must specify the MIME type `application/vnd.google-apps.shortcut`. Apps should specify a file extension in the `name` property when inserting files with the API. For example, an operation to insert a JPEG file should specify something like `\"name\": \"cat.jpg\"` in the metadata. Subsequent `GET` requests include the read-only `fileExtension` property populated with the extension originally specified in the `title` property. When a Google Drive user requests to download a file, or when the file is downloaded through the sync client, Drive builds a full filename (with extension) based on the title. In cases where the extension is missing, Drive attempts to determine the extension based on the file's MIME type.
https://developers.google.com/drive/v3/reference/rest/v3/files/create

File:
File

optional:
enforceSingleParent <boolean> Deprecated. Creating files in multiple folders is no longer supported.
ignoreDefaultVisibility <boolean> Whether to ignore the domain's default visibility settings for the created file. Domain administrators can choose to make all uploaded files visible to the domain by default; this parameter bypasses that behavior for the request. Permissions are still inherited from parent folders.
keepRevisionForever <boolean> Whether to set the 'keepForever' field in the new head revision. This is only applicable to files with binary content in Google Drive. Only 200 revisions for the file can be kept forever. If the limit is reached, try deleting pinned revisions.
useContentAsIndexableText <boolean> Whether to use the uploaded content as indexable text.
includeLabels <string> A comma-separated list of IDs of labels to include in the `labelInfo` part of the response.
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
includePermissionsForView <string> Specifies which additional view's permissions to include in the response. Only 'published' is supported.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead.
ocrLanguage <string> A language hint for OCR processing during image import (ISO 639-1 code)."
  ([File] (files-create File nil))
  ([File optional]
    (client/api-request
      {:method :post,
       :uri-template "https://www.googleapis.com/drive/v3/files",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.appdata"
        "https://www.googleapis.com/auth/drive.file"],
       :body File})))

(defn files-get
  " Gets a file's metadata or content by ID. If you provide the URL parameter `alt=media`, then the response includes the file contents in the response body. Downloading content with `alt=media` only works if the file is stored in Drive. To download Google Docs, Sheets, and Slides use [`files.export`](/drive/api/reference/rest/v3/files/export) instead. For more information, see [Download & export files](/drive/api/guides/manage-downloads).
https://developers.google.com/drive/v3/reference/rest/v3/files/get

fileId <> 

optional:
acknowledgeAbuse <boolean> Whether the user is acknowledging the risk of downloading known malware or other abusive files. This is only applicable when alt=media.
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead.
includePermissionsForView <string> Specifies which additional view's permissions to include in the response. Only 'published' is supported.
includeLabels <string> A comma-separated list of IDs of labels to include in the `labelInfo` part of the response."
  ([fileId] (files-get fileId nil))
  ([fileId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}",
       :uri-template-args {"fileId" fileId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.appdata"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.metadata"
        "https://www.googleapis.com/auth/drive.metadata.readonly"
        "https://www.googleapis.com/auth/drive.photos.readonly"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn files-emptyTrash
  "Permanently deletes all of the user's trashed files.
https://developers.google.com/drive/v3/reference/rest/v3/files/emptyTrash

optional:
enforceSingleParent <boolean> Deprecated: If an item is not in a shared drive and its last parent is deleted but the item itself is not, the item will be placed under its owner's root.
driveId <string> If set, empties the trash of the provided shared drive."
  ([] (files-emptyTrash nil))
  ([optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://www.googleapis.com/drive/v3/files/trash",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/drive"]})))

(defn files-listLabels
  "Lists the labels on a file.
https://developers.google.com/drive/v3/reference/rest/v3/files/listLabels

fileId <> 

optional:
maxResults <integer> The maximum number of labels to return per page. When not set, defaults to 100."
  ([fileId] (files-listLabels fileId nil))
  ([fileId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}/listLabels",
       :uri-template-args {"fileId" fileId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.metadata"
        "https://www.googleapis.com/auth/drive.metadata.readonly"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn teamdrives-create
  "Deprecated: Use `drives.create` instead.
https://developers.google.com/drive/v3/reference/rest/v3/teamdrives/create

requestId <> 
TeamDrive:
TeamDrive"
  [requestId TeamDrive]
  (client/api-request
    {:method :post,
     :uri-template "https://www.googleapis.com/drive/v3/teamdrives",
     :uri-template-args {},
     :query-params {"requestId" requestId},
     :scopes ["https://www.googleapis.com/auth/drive"],
     :body TeamDrive}))

(defn teamdrives-delete
  "Deprecated: Use `drives.delete` instead.
https://developers.google.com/drive/v3/reference/rest/v3/teamdrives/delete

teamDriveId <> "
  [teamDriveId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/drive/v3/teamdrives/{teamDriveId}",
     :uri-template-args {"teamDriveId" teamDriveId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/drive"]}))

(defn teamdrives-get
  "Deprecated: Use `drives.get` instead.
https://developers.google.com/drive/v3/reference/rest/v3/teamdrives/get

teamDriveId <> 

optional:
useDomainAdminAccess <boolean> Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the Team Drive belongs."
  ([teamDriveId] (teamdrives-get teamDriveId nil))
  ([teamDriveId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/drive/v3/teamdrives/{teamDriveId}",
       :uri-template-args {"teamDriveId" teamDriveId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn teamdrives-list
  "Deprecated: Use `drives.list` instead.
https://developers.google.com/drive/v3/reference/rest/v3/teamdrives/list

optional:
pageSize <integer> Maximum number of Team Drives to return.
q <string> Query string for searching Team Drives.
useDomainAdminAccess <boolean> Issue the request as a domain administrator; if set to true, then all Team Drives of the domain in which the requester is an administrator are returned."
  ([] (teamdrives-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template "https://www.googleapis.com/drive/v3/teamdrives",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn teamdrives-update
  "Deprecated: Use `drives.update` instead.
https://developers.google.com/drive/v3/reference/rest/v3/teamdrives/update

teamDriveId <> 
TeamDrive:
TeamDrive

optional:
useDomainAdminAccess <boolean> Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the Team Drive belongs."
  ([teamDriveId TeamDrive]
    (teamdrives-update teamDriveId TeamDrive nil))
  ([teamDriveId TeamDrive optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://www.googleapis.com/drive/v3/teamdrives/{teamDriveId}",
       :uri-template-args {"teamDriveId" teamDriveId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/drive"],
       :body TeamDrive})))

(defn changes-getStartPageToken
  "Gets the starting pageToken for listing future changes.
https://developers.google.com/drive/v3/reference/rest/v3/changes/getStartPageToken

optional:
driveId <string> The ID of the shared drive for which the starting pageToken for listing future changes from that shared drive will be returned.
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead.
teamDriveId <string> Deprecated: Use `driveId` instead."
  ([] (changes-getStartPageToken nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/drive/v3/changes/startPageToken",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.appdata"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.metadata"
        "https://www.googleapis.com/auth/drive.metadata.readonly"
        "https://www.googleapis.com/auth/drive.photos.readonly"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn changes-list
  "Lists the changes for a user or shared drive.
https://developers.google.com/drive/v3/reference/rest/v3/changes/list

pageToken <> 

optional:
includeItemsFromAllDrives <boolean> Whether both My Drive and shared drive items should be included in results.
includeRemoved <boolean> Whether to include changes indicating that items have been removed from the list of changes, for example by deletion or loss of access.
pageSize <integer> The maximum number of changes to return per page.
driveId <string> The shared drive from which changes will be returned. If specified the change IDs will be reflective of the shared drive; use the combined drive ID and change ID as an identifier.
spaces <string> A comma-separated list of spaces to query within the corpora. Supported values are 'drive' and 'appDataFolder'.
includeTeamDriveItems <boolean> Deprecated: Use `includeItemsFromAllDrives` instead.
includeCorpusRemovals <boolean> Whether changes should include the file resource if the file is still accessible by the user at the time of the request, even when a file was removed from the list of changes and there will be no further change entries for this file.
teamDriveId <string> Deprecated: Use `driveId` instead.
includeLabels <string> A comma-separated list of IDs of labels to include in the `labelInfo` part of the response.
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
includePermissionsForView <string> Specifies which additional view's permissions to include in the response. Only 'published' is supported.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead.
restrictToMyDrive <boolean> Whether to restrict the results to changes inside the My Drive hierarchy. This omits changes to files such as those in the Application Data folder or shared files which have not been added to My Drive."
  ([pageToken] (changes-list pageToken nil))
  ([pageToken optional]
    (client/api-request
      {:method :get,
       :uri-template "https://www.googleapis.com/drive/v3/changes",
       :uri-template-args {},
       :query-params (merge {"pageToken" pageToken} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.appdata"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.metadata"
        "https://www.googleapis.com/auth/drive.metadata.readonly"
        "https://www.googleapis.com/auth/drive.photos.readonly"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn changes-watch
  "Subscribes to changes for a user.
https://developers.google.com/drive/v3/reference/rest/v3/changes/watch

pageToken <> 
Channel:
Channel

optional:
includeItemsFromAllDrives <boolean> Whether both My Drive and shared drive items should be included in results.
includeRemoved <boolean> Whether to include changes indicating that items have been removed from the list of changes, for example by deletion or loss of access.
pageSize <integer> The maximum number of changes to return per page.
driveId <string> The shared drive from which changes will be returned. If specified the change IDs will be reflective of the shared drive; use the combined drive ID and change ID as an identifier.
spaces <string> A comma-separated list of spaces to query within the corpora. Supported values are 'drive' and 'appDataFolder'.
includeTeamDriveItems <boolean> Deprecated: Use `includeItemsFromAllDrives` instead.
includeCorpusRemovals <boolean> Whether changes should include the file resource if the file is still accessible by the user at the time of the request, even when a file was removed from the list of changes and there will be no further change entries for this file.
teamDriveId <string> Deprecated: Use `driveId` instead.
includeLabels <string> A comma-separated list of IDs of labels to include in the `labelInfo` part of the response.
supportsAllDrives <boolean> Whether the requesting application supports both My Drives and shared drives.
includePermissionsForView <string> Specifies which additional view's permissions to include in the response. Only 'published' is supported.
supportsTeamDrives <boolean> Deprecated: Use `supportsAllDrives` instead.
restrictToMyDrive <boolean> Whether to restrict the results to changes inside the My Drive hierarchy. This omits changes to files such as those in the Application Data folder or shared files which have not been added to My Drive."
  ([pageToken Channel] (changes-watch pageToken Channel nil))
  ([pageToken Channel optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://www.googleapis.com/drive/v3/changes/watch",
       :uri-template-args {},
       :query-params (merge {"pageToken" pageToken} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.appdata"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.metadata"
        "https://www.googleapis.com/auth/drive.metadata.readonly"
        "https://www.googleapis.com/auth/drive.photos.readonly"
        "https://www.googleapis.com/auth/drive.readonly"],
       :body Channel})))

(defn apps-get
  "Gets a specific app.
https://developers.google.com/drive/v3/reference/rest/v3/apps/get

appId <> "
  [appId]
  (client/api-request
    {:method :get,
     :uri-template "https://www.googleapis.com/drive/v3/apps/{appId}",
     :uri-template-args {"appId" appId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.appdata"
      "https://www.googleapis.com/auth/drive.apps.readonly"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/drive.metadata"
      "https://www.googleapis.com/auth/drive.metadata.readonly"
      "https://www.googleapis.com/auth/drive.readonly"]}))

(defn apps-list
  "Lists a user's installed apps.
https://developers.google.com/drive/v3/reference/rest/v3/apps/list

optional:
appFilterExtensions <string> A comma-separated list of file extensions to limit returned results. All results within the given app query scope which can open any of the given file extensions are included in the response. If `appFilterMimeTypes` are provided as well, the result is a union of the two resulting app lists.
appFilterMimeTypes <string> A comma-separated list of file extensions to limit returned results. All results within the given app query scope which can open any of the given MIME types will be included in the response. If `appFilterExtensions` are provided as well, the result is a union of the two resulting app lists.
languageCode <string> A language or locale code, as defined by BCP 47, with some extensions from Unicode's LDML format (http://www.unicode.org/reports/tr35/)."
  ([] (apps-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template "https://www.googleapis.com/drive/v3/apps",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive.apps.readonly"]})))

(defn comments-create
  "Creates a comment on a file.
https://developers.google.com/drive/v3/reference/rest/v3/comments/create

fileId <> 
Comment:
Comment"
  [fileId Comment]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/drive/v3/files/{fileId}/comments",
     :uri-template-args {"fileId" fileId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"],
     :body Comment}))

(defn comments-delete
  "Deletes a comment.
https://developers.google.com/drive/v3/reference/rest/v3/comments/delete

fileId <> 
commentId <> "
  [fileId commentId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/drive/v3/files/{fileId}/comments/{commentId}",
     :uri-template-args {"fileId" fileId, "commentId" commentId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"]}))

(defn comments-get
  "Gets a comment by ID.
https://developers.google.com/drive/v3/reference/rest/v3/comments/get

fileId <> 
commentId <> 

optional:
includeDeleted <boolean> Whether to return deleted comments. Deleted comments will not include their original content."
  ([fileId commentId] (comments-get fileId commentId nil))
  ([fileId commentId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}/comments/{commentId}",
       :uri-template-args {"fileId" fileId, "commentId" commentId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn comments-list
  "Lists a file's comments.
https://developers.google.com/drive/v3/reference/rest/v3/comments/list

fileId <> 

optional:
includeDeleted <boolean> Whether to include deleted comments. Deleted comments will not include their original content.
pageSize <integer> The maximum number of comments to return per page.
startModifiedTime <string> The minimum value of 'modifiedTime' for the result comments (RFC 3339 date-time)."
  ([fileId] (comments-list fileId nil))
  ([fileId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}/comments",
       :uri-template-args {"fileId" fileId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn comments-update
  "Updates a comment with patch semantics.
https://developers.google.com/drive/v3/reference/rest/v3/comments/update

fileId <> 
commentId <> 
Comment:
Comment"
  [fileId commentId Comment]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://www.googleapis.com/drive/v3/files/{fileId}/comments/{commentId}",
     :uri-template-args {"fileId" fileId, "commentId" commentId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"],
     :body Comment}))

(defn revisions-delete
  "Permanently deletes a file version. You can only delete revisions for files with binary content in Google Drive, like images or videos. Revisions for other files, like Google Docs or Sheets, and the last remaining file version can't be deleted.
https://developers.google.com/drive/v3/reference/rest/v3/revisions/delete

fileId <> 
revisionId <> "
  [fileId revisionId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/drive/v3/files/{fileId}/revisions/{revisionId}",
     :uri-template-args {"fileId" fileId, "revisionId" revisionId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.appdata"
      "https://www.googleapis.com/auth/drive.file"]}))

(defn revisions-get
  "Gets a revision's metadata or content by ID.
https://developers.google.com/drive/v3/reference/rest/v3/revisions/get

fileId <> 
revisionId <> 

optional:
acknowledgeAbuse <boolean> Whether the user is acknowledging the risk of downloading known malware or other abusive files. This is only applicable when alt=media."
  ([fileId revisionId] (revisions-get fileId revisionId nil))
  ([fileId revisionId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}/revisions/{revisionId}",
       :uri-template-args {"fileId" fileId, "revisionId" revisionId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.appdata"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.metadata"
        "https://www.googleapis.com/auth/drive.metadata.readonly"
        "https://www.googleapis.com/auth/drive.photos.readonly"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn revisions-list
  "Lists a file's revisions.
https://developers.google.com/drive/v3/reference/rest/v3/revisions/list

fileId <> 

optional:
pageSize <integer> The maximum number of revisions to return per page."
  ([fileId] (revisions-list fileId nil))
  ([fileId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}/revisions",
       :uri-template-args {"fileId" fileId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.appdata"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.metadata"
        "https://www.googleapis.com/auth/drive.metadata.readonly"
        "https://www.googleapis.com/auth/drive.photos.readonly"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn revisions-update
  "Updates a revision with patch semantics.
https://developers.google.com/drive/v3/reference/rest/v3/revisions/update

fileId <> 
revisionId <> 
Revision:
Revision"
  [fileId revisionId Revision]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://www.googleapis.com/drive/v3/files/{fileId}/revisions/{revisionId}",
     :uri-template-args {"fileId" fileId, "revisionId" revisionId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.appdata"
      "https://www.googleapis.com/auth/drive.file"],
     :body Revision}))

(defn replies-create
  "Creates a reply to a comment.
https://developers.google.com/drive/v3/reference/rest/v3/replies/create

fileId <> 
commentId <> 
Reply:
Reply"
  [fileId commentId Reply]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/drive/v3/files/{fileId}/comments/{commentId}/replies",
     :uri-template-args {"fileId" fileId, "commentId" commentId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"],
     :body Reply}))

(defn replies-delete
  "Deletes a reply.
https://developers.google.com/drive/v3/reference/rest/v3/replies/delete

fileId <> 
commentId <> 
replyId <> "
  [fileId commentId replyId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/drive/v3/files/{fileId}/comments/{commentId}/replies/{replyId}",
     :uri-template-args
     {"fileId" fileId, "commentId" commentId, "replyId" replyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"]}))

(defn replies-get
  "Gets a reply by ID.
https://developers.google.com/drive/v3/reference/rest/v3/replies/get

fileId <> 
commentId <> 
replyId <> 

optional:
includeDeleted <boolean> Whether to return deleted replies. Deleted replies will not include their original content."
  ([fileId commentId replyId]
    (replies-get fileId commentId replyId nil))
  ([fileId commentId replyId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}/comments/{commentId}/replies/{replyId}",
       :uri-template-args
       {"fileId" fileId, "commentId" commentId, "replyId" replyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn replies-list
  "Lists a comment's replies.
https://developers.google.com/drive/v3/reference/rest/v3/replies/list

fileId <> 
commentId <> 

optional:
includeDeleted <boolean> Whether to include deleted replies. Deleted replies will not include their original content.
pageSize <integer> The maximum number of replies to return per page."
  ([fileId commentId] (replies-list fileId commentId nil))
  ([fileId commentId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/drive/v3/files/{fileId}/comments/{commentId}/replies",
       :uri-template-args {"fileId" fileId, "commentId" commentId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.meet.readonly"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn replies-update
  "Updates a reply with patch semantics.
https://developers.google.com/drive/v3/reference/rest/v3/replies/update

fileId <> 
commentId <> 
replyId <> 
Reply:
Reply"
  [fileId commentId replyId Reply]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://www.googleapis.com/drive/v3/files/{fileId}/comments/{commentId}/replies/{replyId}",
     :uri-template-args
     {"fileId" fileId, "commentId" commentId, "replyId" replyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"],
     :body Reply}))

(defn channels-stop
  "Stops watching resources through this channel.
https://developers.google.com/drive/v3/reference/rest/v3/channels/stop

Channel:
Channel"
  [Channel]
  (client/api-request
    {:method :post,
     :uri-template "https://www.googleapis.com/drive/v3/channels/stop",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.appdata"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/drive.meet.readonly"
      "https://www.googleapis.com/auth/drive.metadata"
      "https://www.googleapis.com/auth/drive.metadata.readonly"
      "https://www.googleapis.com/auth/drive.photos.readonly"
      "https://www.googleapis.com/auth/drive.readonly"],
     :body Channel}))
