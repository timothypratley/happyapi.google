(ns happyapi.google.chat-v1
  "Google Chat API
The Google Chat API lets you build Chat apps to integrate your services with Google Chat and manage Chat resources such as spaces, members, and messages.
See: https://developers.google.com/workspace/chat"
  (:require [happyapi.providers.google :as client]))

(defn media-download
  "Downloads media. Download is supported on the URI `/v1/media/{+name}?alt=media`.
https://developers.google.com/workspace/chat/v1/reference/rest/v1/media/download

resourceName <> "
  [resourceName]
  (client/api-request
    {:method :get,
     :uri-template
     "https://chat.googleapis.com/v1/media/{+resourceName}",
     :uri-template-args {"resourceName" resourceName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.bot"
      "https://www.googleapis.com/auth/chat.messages"
      "https://www.googleapis.com/auth/chat.messages.readonly"]}))

(defn media-upload
  "Uploads an attachment. For an example, see [Upload media as a file attachment](https://developers.google.com/workspace/chat/upload-media-attachments). Requires user [authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user). You can upload attachments up to 200 MB. Certain file types aren't supported. For details, see [File types blocked by Google Chat](https://support.google.com/chat/answer/7651457?&co=GENIE.Platform%3DDesktop#File%20types%20blocked%20in%20Google%20Chat).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/media/upload

parent <> 
UploadAttachmentRequest:
UploadAttachmentRequest"
  [parent UploadAttachmentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://chat.googleapis.com/v1/{+parent}/attachments:upload",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.import"
      "https://www.googleapis.com/auth/chat.messages"
      "https://www.googleapis.com/auth/chat.messages.create"],
     :body UploadAttachmentRequest}))

(defn spaces-list
  "Lists spaces the caller is a member of. Group chats and DMs aren't listed until the first message is sent. For an example, see [List spaces](https://developers.google.com/workspace/chat/list-spaces). Requires [authentication](https://developers.google.com/workspace/chat/authenticate-authorize). Supports [app authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-app) and [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user). Lists spaces visible to the caller or authenticated user. Group chats and DMs aren't listed until the first message is sent. To list all named spaces by Google Workspace organization, use the [`spaces.search()`](https://developers.google.com/workspace/chat/api/reference/rest/v1/spaces/search) method using Workspace administrator privileges instead.
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/list

optional:
pageSize <integer> Optional. The maximum number of spaces to return. The service might return fewer than this value. If unspecified, at most 100 spaces are returned. The maximum value is 1000. If you use a value more than 1000, it's automatically changed to 1000. Negative values return an `INVALID_ARGUMENT` error.
filter <string> Optional. A query filter. You can filter spaces by the space type ([`space_type`](https://developers.google.com/workspace/chat/api/reference/rest/v1/spaces#spacetype)). To filter by space type, you must specify valid enum value, such as `SPACE` or `GROUP_CHAT` (the `space_type` can't be `SPACE_TYPE_UNSPECIFIED`). To query for multiple space types, use the `OR` operator. For example, the following queries are valid: ``` space_type = \"SPACE\" spaceType = \"GROUP_CHAT\" OR spaceType = \"DIRECT_MESSAGE\" ``` Invalid queries are rejected by the server with an `INVALID_ARGUMENT` error."
  ([] (spaces-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template "https://chat.googleapis.com/v1/spaces",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.bot"
        "https://www.googleapis.com/auth/chat.spaces"
        "https://www.googleapis.com/auth/chat.spaces.readonly"]})))

(defn spaces-get
  "Returns details about a space. For an example, see [Get details about a space](https://developers.google.com/workspace/chat/get-spaces). Requires [authentication](https://developers.google.com/workspace/chat/authenticate-authorize). Supports [app authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-app) and [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://chat.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.admin.spaces"
      "https://www.googleapis.com/auth/chat.admin.spaces.readonly"
      "https://www.googleapis.com/auth/chat.bot"
      "https://www.googleapis.com/auth/chat.spaces"
      "https://www.googleapis.com/auth/chat.spaces.readonly"]}))

(defn spaces-create
  "Creates a named space. Spaces grouped by topics aren't supported. For an example, see [Create a space](https://developers.google.com/workspace/chat/create-spaces). If you receive the error message `ALREADY_EXISTS` when creating a space, try a different `displayName`. An existing space within the Google Workspace organization might already use this display name. Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/create

Space:
Space

optional:
requestId <string> Optional. A unique identifier for this request. A random UUID is recommended. Specifying an existing request ID returns the space created with that ID instead of creating a new space. Specifying an existing request ID from the same Chat app with a different authenticated user returns an error."
  ([Space] (spaces-create Space nil))
  ([Space optional]
    (client/api-request
      {:method :post,
       :uri-template "https://chat.googleapis.com/v1/spaces",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.import"
        "https://www.googleapis.com/auth/chat.spaces"
        "https://www.googleapis.com/auth/chat.spaces.create"],
       :body Space})))

(defn spaces-setup
  "Creates a space and adds specified users to it. The calling user is automatically added to the space, and shouldn't be specified as a membership in the request. For an example, see [Set up a space with initial members](https://developers.google.com/workspace/chat/set-up-spaces). To specify the human members to add, add memberships with the appropriate `membership.member.name`. To add a human user, use `users/{user}`, where `{user}` can be the email address for the user. For users in the same Workspace organization `{user}` can also be the `id` for the person from the People API, or the `id` for the user in the Directory API. For example, if the People API Person profile ID for `user@example.com` is `123456789`, you can add the user to the space by setting the `membership.member.name` to `users/user@example.com` or `users/123456789`. To specify the Google groups to add, add memberships with the appropriate `membership.group_member.name`. To add or invite a Google group, use `groups/{group}`, where `{group}` is the `id` for the group from the Cloud Identity Groups API. For example, you can use [Cloud Identity Groups lookup API](https://cloud.google.com/identity/docs/reference/rest/v1/groups/lookup) to retrieve the ID `123456789` for group email `group@example.com`, then you can add the group to the space by setting the `membership.group_member.name` to `groups/123456789`. Group email is not supported, and Google groups can only be added as members in named spaces. For a named space or group chat, if the caller blocks, or is blocked by some members, or doesn't have permission to add some members, then those members aren't added to the created space. To create a direct message (DM) between the calling user and another human user, specify exactly one membership to represent the human user. If one user blocks the other, the request fails and the DM isn't created. To create a DM between the calling user and the calling app, set `Space.singleUserBotDm` to `true` and don't specify any memberships. You can only use this method to set up a DM with the calling app. To add the calling app as a member of a space or an existing DM between two human users, see [Invite or add a user or app to a space](https://developers.google.com/workspace/chat/create-members). If a DM already exists between two users, even when one user blocks the other at the time a request is made, then the existing DM is returned. Spaces with threaded replies aren't supported. If you receive the error message `ALREADY_EXISTS` when setting up a space, try a different `displayName`. An existing space within the Google Workspace organization might already use this display name. Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/setup

SetUpSpaceRequest:
SetUpSpaceRequest"
  [SetUpSpaceRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://chat.googleapis.com/v1/spaces:setup",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.spaces"
      "https://www.googleapis.com/auth/chat.spaces.create"],
     :body SetUpSpaceRequest}))

(defn spaces-patch
  "Updates a space. For an example, see [Update a space](https://developers.google.com/workspace/chat/update-spaces). If you're updating the `displayName` field and receive the error message `ALREADY_EXISTS`, try a different display name.. An existing space within the Google Workspace organization might already use this display name. Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/patch

name <> 
Space:
Space

optional:
updateMask <string> Required. The updated field paths, comma separated if there are multiple. You can update the following fields for a space: - `space_details` - `display_name`: Only supports updating the display name for spaces where `spaceType` field is `SPACE`. If you receive the error message `ALREADY_EXISTS`, try a different value. An existing space within the Google Workspace organization might already use this display name. - `space_type`: Only supports changing a `GROUP_CHAT` space type to `SPACE`. Include `display_name` together with `space_type` in the update mask and ensure that the specified space has a non-empty display name and the `SPACE` space type. Including the `space_type` mask and the `SPACE` type in the specified space when updating the display name is optional if the existing space already has the `SPACE` type. Trying to update the space type in other ways results in an invalid argument error. `space_type` is not supported with admin access. - `space_history_state`: Updates [space history settings](https://support.google.com/chat/answer/7664687) by turning history on or off for the space. Only supported if history settings are enabled for the Google Workspace organization. To update the space history state, you must omit all other field masks in your request. `space_history_state` is not supported with admin access. - `access_settings.audience`: Updates the [access setting](https://support.google.com/chat/answer/11971020) of who can discover the space, join the space, and preview the messages in named space where `spaceType` field is `SPACE`. If the existing space has a target audience, you can remove the audience and restrict space access by omitting a value for this field mask. To update access settings for a space, the authenticating user must be a space manager and omit all other field masks in your request. You can't update this field if the space is in [import mode](https://developers.google.com/workspace/chat/import-data-overview). To learn more, see [Make a space discoverable to specific users](https://developers.google.com/workspace/chat/space-target-audience). `access_settings.audience` is not supported with admin access. - Developer Preview: Supports changing the [permission settings](https://support.google.com/chat/answer/13340792) of a space, supported field paths include: `permission_settings.manage_members_and_groups`, `permission_settings.modify_space_details`, `permission_settings.toggle_history`, `permission_settings.use_at_mention_all`, `permission_settings.manage_apps`, `permission_settings.manage_webhooks`, `permission_settings.reply_messages` (Warning: mutually exclusive with all other non-permission settings field paths). `permission_settings` is not supported with admin access."
  ([name Space] (spaces-patch name Space nil))
  ([name Space optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://chat.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.admin.spaces"
        "https://www.googleapis.com/auth/chat.import"
        "https://www.googleapis.com/auth/chat.spaces"],
       :body Space})))

(defn spaces-delete
  "Deletes a named space. Always performs a cascading delete, which means that the space's child resources—like messages posted in the space and memberships in the space—are also deleted. For an example, see [Delete a space](https://developers.google.com/workspace/chat/delete-spaces). Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user) from a user who has permission to delete the space.
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://chat.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.admin.delete"
      "https://www.googleapis.com/auth/chat.delete"
      "https://www.googleapis.com/auth/chat.import"]}))

(defn spaces-completeImport
  "Completes the [import process](https://developers.google.com/workspace/chat/import-data) for the specified space and makes it visible to users. Requires app authentication and domain-wide delegation. For more information, see [Authorize Google Chat apps to import data](https://developers.google.com/workspace/chat/authorize-import).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/completeImport

name <> 
CompleteImportSpaceRequest:
CompleteImportSpaceRequest"
  [name CompleteImportSpaceRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://chat.googleapis.com/v1/{+name}:completeImport",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/chat.import"],
     :body CompleteImportSpaceRequest}))

(defn spaces-findDirectMessage
  "Returns the existing direct message with the specified user. If no direct message space is found, returns a `404 NOT_FOUND` error. For an example, see [Find a direct message](/chat/api/guides/v1/spaces/find-direct-message). With [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user), returns the direct message space between the specified user and the authenticated user. With [app authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-app), returns the direct message space between the specified user and the calling Chat app. Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user) or [app authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-app).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/findDirectMessage

optional:
name <string> Required. Resource name of the user to find direct message with. Format: `users/{user}`, where `{user}` is either the `id` for the [person](https://developers.google.com/people/api/rest/v1/people) from the People API, or the `id` for the [user](https://developers.google.com/admin-sdk/directory/reference/rest/v1/users) in the Directory API. For example, if the People API profile ID is `123456789`, you can find a direct message with that person by using `users/123456789` as the `name`. When [authenticated as a user](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user), you can use the email as an alias for `{user}`. For example, `users/example@gmail.com` where `example@gmail.com` is the email of the Google Chat user."
  ([] (spaces-findDirectMessage nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://chat.googleapis.com/v1/spaces:findDirectMessage",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.bot"
        "https://www.googleapis.com/auth/chat.spaces"
        "https://www.googleapis.com/auth/chat.spaces.readonly"]})))

(defn spaces-messages-create
  "Creates a message in a Google Chat space. The maximum message size, including text and cards, is 32,000 bytes. For an example, see [Send a message](https://developers.google.com/workspace/chat/create-messages). Calling this method requires [authentication](https://developers.google.com/workspace/chat/authenticate-authorize) and supports the following authentication types: - For text messages, user authentication or app authentication are supported. - For card messages, only app authentication is supported. (Only Chat apps can create card messages.)
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/messages/create

parent <> 
Message:
Message

optional:
threadKey <string> Optional. Deprecated: Use thread.thread_key instead. ID for the thread. Supports up to 4000 characters. To start or add to a thread, create a message and specify a `threadKey` or the thread.name. For example usage, see [Start or reply to a message thread](https://developers.google.com/workspace/chat/create-messages#create-message-thread).
requestId <string> Optional. A unique request ID for this message. Specifying an existing request ID returns the message created with that ID instead of creating a new message.
messageReplyOption <string> Optional. Specifies whether a message starts a thread or replies to one. Only supported in named spaces.
messageId <string> Optional. A custom ID for a message. Lets Chat apps get, update, or delete a message without needing to store the system-assigned ID in the message's resource name (represented in the message `name` field). The value for this field must meet the following requirements: * Begins with `client-`. For example, `client-custom-name` is a valid custom ID, but `custom-name` is not. * Contains up to 63 characters and only lowercase letters, numbers, and hyphens. * Is unique within a space. A Chat app can't use the same custom ID for different messages. For details, see [Name a message](https://developers.google.com/workspace/chat/create-messages#name_a_created_message)."
  ([parent Message] (spaces-messages-create parent Message nil))
  ([parent Message optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://chat.googleapis.com/v1/{+parent}/messages",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.bot"
        "https://www.googleapis.com/auth/chat.import"
        "https://www.googleapis.com/auth/chat.messages"
        "https://www.googleapis.com/auth/chat.messages.create"],
       :body Message})))

(defn spaces-messages-list
  "Lists messages in a space that the caller is a member of, including messages from blocked members and spaces. For an example, see [List messages](/chat/api/guides/v1/messages/list). Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/messages/list

parent <> 

optional:
pageSize <integer> The maximum number of messages returned. The service might return fewer messages than this value. If unspecified, at most 25 are returned. The maximum value is 1000. If you use a value more than 1000, it's automatically changed to 1000. Negative values return an `INVALID_ARGUMENT` error.
filter <string> A query filter. You can filter messages by date (`create_time`) and thread (`thread.name`). To filter messages by the date they were created, specify the `create_time` with a timestamp in [RFC-3339](https://www.rfc-editor.org/rfc/rfc3339) format and double quotation marks. For example, `\"2023-04-21T11:30:00-04:00\"`. You can use the greater than operator `>` to list messages that were created after a timestamp, or the less than operator `<` to list messages that were created before a timestamp. To filter messages within a time interval, use the `AND` operator between two timestamps. To filter by thread, specify the `thread.name`, formatted as `spaces/{space}/threads/{thread}`. You can only specify one `thread.name` per query. To filter by both thread and date, use the `AND` operator in your query. For example, the following queries are valid: ``` create_time > \"2012-04-21T11:30:00-04:00\" create_time > \"2012-04-21T11:30:00-04:00\" AND thread.name = spaces/AAAAAAAAAAA/threads/123 create_time > \"2012-04-21T11:30:00+00:00\" AND create_time < \"2013-01-01T00:00:00+00:00\" AND thread.name = spaces/AAAAAAAAAAA/threads/123 thread.name = spaces/AAAAAAAAAAA/threads/123 ``` Invalid queries are rejected by the server with an `INVALID_ARGUMENT` error.
orderBy <string> Optional, if resuming from a previous query. How the list of messages is ordered. Specify a value to order by an ordering operation. Valid ordering operation values are as follows: - `ASC` for ascending. - `DESC` for descending. The default ordering is `create_time ASC`.
showDeleted <boolean> Whether to include deleted messages. Deleted messages include deleted time and metadata about their deletion, but message content is unavailable."
  ([parent] (spaces-messages-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://chat.googleapis.com/v1/{+parent}/messages",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.import"
        "https://www.googleapis.com/auth/chat.messages"
        "https://www.googleapis.com/auth/chat.messages.readonly"]})))

(defn spaces-messages-get
  "Returns details about a message. For an example, see [Get details about a message](https://developers.google.com/workspace/chat/get-messages). Requires [authentication](https://developers.google.com/workspace/chat/authenticate-authorize). Supports [app authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-app) and [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user). Note: Might return a message from a blocked member or space.
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/messages/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://chat.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.bot"
      "https://www.googleapis.com/auth/chat.messages"
      "https://www.googleapis.com/auth/chat.messages.readonly"]}))

(defn spaces-messages-update
  "Updates a message. There's a difference between the `patch` and `update` methods. The `patch` method uses a `patch` request while the `update` method uses a `put` request. We recommend using the `patch` method. For an example, see [Update a message](https://developers.google.com/workspace/chat/update-messages). Requires [authentication](https://developers.google.com/workspace/chat/authenticate-authorize). Supports [app authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-app) and [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user). When using app authentication, requests can only update messages created by the calling Chat app.
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/messages/update

name <> 
Message:
Message

optional:
updateMask <string> Required. The field paths to update. Separate multiple values with commas or use `*` to update all field paths. Currently supported field paths: - `text` - `attachment` - `cards` (Requires [app authentication](/chat/api/guides/auth/service-accounts).) - `cards_v2` (Requires [app authentication](/chat/api/guides/auth/service-accounts).) - `accessory_widgets` (Requires [app authentication](/chat/api/guides/auth/service-accounts).)
allowMissing <boolean> Optional. If `true` and the message isn't found, a new message is created and `updateMask` is ignored. The specified message ID must be [client-assigned](https://developers.google.com/workspace/chat/create-messages#name_a_created_message) or the request fails."
  ([name Message] (spaces-messages-update name Message nil))
  ([name Message optional]
    (client/api-request
      {:method :put,
       :uri-template "https://chat.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.bot"
        "https://www.googleapis.com/auth/chat.import"
        "https://www.googleapis.com/auth/chat.messages"],
       :body Message})))

(defn spaces-messages-patch
  "Updates a message. There's a difference between the `patch` and `update` methods. The `patch` method uses a `patch` request while the `update` method uses a `put` request. We recommend using the `patch` method. For an example, see [Update a message](https://developers.google.com/workspace/chat/update-messages). Requires [authentication](https://developers.google.com/workspace/chat/authenticate-authorize). Supports [app authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-app) and [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user). When using app authentication, requests can only update messages created by the calling Chat app.
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/messages/patch

name <> 
Message:
Message

optional:
updateMask <string> Required. The field paths to update. Separate multiple values with commas or use `*` to update all field paths. Currently supported field paths: - `text` - `attachment` - `cards` (Requires [app authentication](/chat/api/guides/auth/service-accounts).) - `cards_v2` (Requires [app authentication](/chat/api/guides/auth/service-accounts).) - `accessory_widgets` (Requires [app authentication](/chat/api/guides/auth/service-accounts).)
allowMissing <boolean> Optional. If `true` and the message isn't found, a new message is created and `updateMask` is ignored. The specified message ID must be [client-assigned](https://developers.google.com/workspace/chat/create-messages#name_a_created_message) or the request fails."
  ([name Message] (spaces-messages-patch name Message nil))
  ([name Message optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://chat.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.bot"
        "https://www.googleapis.com/auth/chat.import"
        "https://www.googleapis.com/auth/chat.messages"],
       :body Message})))

(defn spaces-messages-delete
  "Deletes a message. For an example, see [Delete a message](https://developers.google.com/workspace/chat/delete-messages). Requires [authentication](https://developers.google.com/workspace/chat/authenticate-authorize). Supports [app authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-app) and [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user). When using app authentication, requests can only delete messages created by the calling Chat app.
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/messages/delete

name <> 

optional:
force <boolean> When `true`, deleting a message also deletes its threaded replies. When `false`, if a message has threaded replies, deletion fails. Only applies when [authenticating as a user](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user). Has no effect when [authenticating as a Chat app] (https://developers.google.com/workspace/chat/authenticate-authorize-chat-app)."
  ([name] (spaces-messages-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://chat.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.bot"
        "https://www.googleapis.com/auth/chat.import"
        "https://www.googleapis.com/auth/chat.messages"]})))

(defn spaces-messages-attachments-get
  "Gets the metadata of a message attachment. The attachment data is fetched using the [media API](https://developers.google.com/workspace/chat/api/reference/rest/v1/media/download). For an example, see [Get metadata about a message attachment](https://developers.google.com/workspace/chat/get-media-attachments). Requires [app authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-app).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/messages/attachments/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://chat.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/chat.bot"]}))

(defn spaces-messages-reactions-create
  "Creates a reaction and adds it to a message. Only unicode emojis are supported. For an example, see [Add a reaction to a message](https://developers.google.com/workspace/chat/create-reactions). Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/messages/reactions/create

parent <> 
Reaction:
Reaction"
  [parent Reaction]
  (client/api-request
    {:method :post,
     :uri-template
     "https://chat.googleapis.com/v1/{+parent}/reactions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.import"
      "https://www.googleapis.com/auth/chat.messages"
      "https://www.googleapis.com/auth/chat.messages.reactions"
      "https://www.googleapis.com/auth/chat.messages.reactions.create"],
     :body Reaction}))

(defn spaces-messages-reactions-list
  "Lists reactions to a message. For an example, see [List reactions for a message](https://developers.google.com/workspace/chat/list-reactions). Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/messages/reactions/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of reactions returned. The service can return fewer reactions than this value. If unspecified, the default value is 25. The maximum value is 200; values above 200 are changed to 200.
filter <string> Optional. A query filter. You can filter reactions by [emoji](https://developers.google.com/workspace/chat/api/reference/rest/v1/Emoji) (either `emoji.unicode` or `emoji.custom_emoji.uid`) and [user](https://developers.google.com/workspace/chat/api/reference/rest/v1/User) (`user.name`). To filter reactions for multiple emojis or users, join similar fields with the `OR` operator, such as `emoji.unicode = \"🙂\" OR emoji.unicode = \"👍\"` and `user.name = \"users/AAAAAA\" OR user.name = \"users/BBBBBB\"`. To filter reactions by emoji and user, use the `AND` operator, such as `emoji.unicode = \"🙂\" AND user.name = \"users/AAAAAA\"`. If your query uses both `AND` and `OR`, group them with parentheses. For example, the following queries are valid: ``` user.name = \"users/{user}\" emoji.unicode = \"🙂\" emoji.custom_emoji.uid = \"{uid}\" emoji.unicode = \"🙂\" OR emoji.unicode = \"👍\" emoji.unicode = \"🙂\" OR emoji.custom_emoji.uid = \"{uid}\" emoji.unicode = \"🙂\" AND user.name = \"users/{user}\" (emoji.unicode = \"🙂\" OR emoji.custom_emoji.uid = \"{uid}\") AND user.name = \"users/{user}\" ``` The following queries are invalid: ``` emoji.unicode = \"🙂\" AND emoji.unicode = \"👍\" emoji.unicode = \"🙂\" AND emoji.custom_emoji.uid = \"{uid}\" emoji.unicode = \"🙂\" OR user.name = \"users/{user}\" emoji.unicode = \"🙂\" OR emoji.custom_emoji.uid = \"{uid}\" OR user.name = \"users/{user}\" emoji.unicode = \"🙂\" OR emoji.custom_emoji.uid = \"{uid}\" AND user.name = \"users/{user}\" ``` Invalid queries are rejected by the server with an `INVALID_ARGUMENT` error."
  ([parent] (spaces-messages-reactions-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://chat.googleapis.com/v1/{+parent}/reactions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.messages"
        "https://www.googleapis.com/auth/chat.messages.reactions"
        "https://www.googleapis.com/auth/chat.messages.reactions.readonly"
        "https://www.googleapis.com/auth/chat.messages.readonly"]})))

(defn spaces-messages-reactions-delete
  "Deletes a reaction to a message. Only unicode emojis are supported. For an example, see [Delete a reaction](https://developers.google.com/workspace/chat/delete-reactions). Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/messages/reactions/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://chat.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.import"
      "https://www.googleapis.com/auth/chat.messages"
      "https://www.googleapis.com/auth/chat.messages.reactions"]}))

(defn spaces-members-list
  "Lists memberships in a space. For an example, see [List users and Google Chat apps in a space](https://developers.google.com/workspace/chat/list-members). Listing memberships with [app authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-app) lists memberships in spaces that the Chat app has access to, but excludes Chat app memberships, including its own. Listing memberships with [User authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user) lists memberships in spaces that the authenticated user has access to. Requires [authentication](https://developers.google.com/workspace/chat/authenticate-authorize). Supports [app authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-app) and [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/members/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of memberships to return. The service might return fewer than this value. If unspecified, at most 100 memberships are returned. The maximum value is 1000. If you use a value more than 1000, it's automatically changed to 1000. Negative values return an `INVALID_ARGUMENT` error.
filter <string> Optional. A query filter. You can filter memberships by a member's role ([`role`](https://developers.google.com/workspace/chat/api/reference/rest/v1/spaces.members#membershiprole)) and type ([`member.type`](https://developers.google.com/workspace/chat/api/reference/rest/v1/User#type)). To filter by role, set `role` to `ROLE_MEMBER` or `ROLE_MANAGER`. To filter by type, set `member.type` to `HUMAN` or `BOT`. Developer Preview: You can also filter for `member.type` using the `!=` operator. To filter by both role and type, use the `AND` operator. To filter by either role or type, use the `OR` operator. Either `member.type = \"HUMAN\"` or `member.type != \"BOT\"` is required when `use_admin_access` is set to true. Other member type filters will be rejected. For example, the following queries are valid: ``` role = \"ROLE_MANAGER\" OR role = \"ROLE_MEMBER\" member.type = \"HUMAN\" AND role = \"ROLE_MANAGER\" member.type != \"BOT\" ``` The following queries are invalid: ``` member.type = \"HUMAN\" AND member.type = \"BOT\" role = \"ROLE_MANAGER\" AND role = \"ROLE_MEMBER\" ``` Invalid queries are rejected by the server with an `INVALID_ARGUMENT` error.
showGroups <boolean> Optional. When `true`, also returns memberships associated with a Google Group, in addition to other types of memberships. If a filter is set, Google Group memberships that don't match the filter criteria aren't returned.
showInvited <boolean> Optional. When `true`, also returns memberships associated with invited members, in addition to other types of memberships. If a filter is set, invited memberships that don't match the filter criteria aren't returned. Currently requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user)."
  ([parent] (spaces-members-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://chat.googleapis.com/v1/{+parent}/members",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.admin.memberships"
        "https://www.googleapis.com/auth/chat.admin.memberships.readonly"
        "https://www.googleapis.com/auth/chat.bot"
        "https://www.googleapis.com/auth/chat.import"
        "https://www.googleapis.com/auth/chat.memberships"
        "https://www.googleapis.com/auth/chat.memberships.readonly"]})))

(defn spaces-members-get
  "Returns details about a membership. For an example, see [Get details about a user's or Google Chat app's membership](https://developers.google.com/workspace/chat/get-members). Requires [authentication](https://developers.google.com/workspace/chat/authenticate-authorize). Supports [app authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-app) and [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/members/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://chat.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.admin.memberships"
      "https://www.googleapis.com/auth/chat.admin.memberships.readonly"
      "https://www.googleapis.com/auth/chat.bot"
      "https://www.googleapis.com/auth/chat.memberships"
      "https://www.googleapis.com/auth/chat.memberships.readonly"]}))

(defn spaces-members-create
  "Creates a human membership or app membership for the calling app. Creating memberships for other apps isn't supported. For an example, see [Invite or add a user or a Google Chat app to a space](https://developers.google.com/workspace/chat/create-members). When creating a membership, if the specified member has their auto-accept policy turned off, then they're invited, and must accept the space invitation before joining. Otherwise, creating a membership adds the member directly to the specified space. Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user). To specify the member to add, set the `membership.member.name` for the human or app member, or set the `membership.group_member.name` for the group member. - To add the calling app to a space or a direct message between two human users, use `users/app`. Unable to add other apps to the space. - To add a human user, use `users/{user}`, where `{user}` can be the email address for the user. For users in the same Workspace organization `{user}` can also be the `id` for the person from the People API, or the `id` for the user in the Directory API. For example, if the People API Person profile ID for `user@example.com` is `123456789`, you can add the user to the space by setting the `membership.member.name` to `users/user@example.com` or `users/123456789`. - To add or invite a Google group in a named space, use `groups/{group}`, where `{group}` is the `id` for the group from the Cloud Identity Groups API. For example, you can use [Cloud Identity Groups lookup API](https://cloud.google.com/identity/docs/reference/rest/v1/groups/lookup) to retrieve the ID `123456789` for group email `group@example.com`, then you can add or invite the group to a named space by setting the `membership.group_member.name` to `groups/123456789`. Group email is not supported, and Google groups can only be added as members in named spaces.
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/members/create

parent <> 
Membership:
Membership"
  [parent Membership]
  (client/api-request
    {:method :post,
     :uri-template "https://chat.googleapis.com/v1/{+parent}/members",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.admin.memberships"
      "https://www.googleapis.com/auth/chat.import"
      "https://www.googleapis.com/auth/chat.memberships"
      "https://www.googleapis.com/auth/chat.memberships.app"],
     :body Membership}))

(defn spaces-members-patch
  "Updates a membership. For an example, see [Update a user's membership in a space](https://developers.google.com/workspace/chat/update-members). Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/members/patch

name <> 
Membership:
Membership

optional:
updateMask <string> Required. The field paths to update. Separate multiple values with commas or use `*` to update all field paths. Currently supported field paths: - `role`"
  ([name Membership] (spaces-members-patch name Membership nil))
  ([name Membership optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://chat.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.admin.memberships"
        "https://www.googleapis.com/auth/chat.import"
        "https://www.googleapis.com/auth/chat.memberships"],
       :body Membership})))

(defn spaces-members-delete
  "Deletes a membership. For an example, see [Remove a user or a Google Chat app from a space](https://developers.google.com/workspace/chat/delete-members). Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/members/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://chat.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.admin.memberships"
      "https://www.googleapis.com/auth/chat.import"
      "https://www.googleapis.com/auth/chat.memberships"
      "https://www.googleapis.com/auth/chat.memberships.app"]}))

(defn spaces-spaceEvents-get
  "Returns an event from a Google Chat space. The [event payload](https://developers.google.com/workspace/chat/api/reference/rest/v1/spaces.spaceEvents#SpaceEvent.FIELDS.oneof_payload) contains the most recent version of the resource that changed. For example, if you request an event about a new message but the message was later updated, the server returns the updated `Message` resource in the event payload. Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user). To get an event, the authenticated user must be a member of the space. For an example, see [Get details about an event from a Google Chat space](https://developers.google.com/workspace/chat/get-space-event).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/spaceEvents/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://chat.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.memberships"
      "https://www.googleapis.com/auth/chat.memberships.readonly"
      "https://www.googleapis.com/auth/chat.messages"
      "https://www.googleapis.com/auth/chat.messages.reactions"
      "https://www.googleapis.com/auth/chat.messages.reactions.readonly"
      "https://www.googleapis.com/auth/chat.messages.readonly"
      "https://www.googleapis.com/auth/chat.spaces"
      "https://www.googleapis.com/auth/chat.spaces.readonly"]}))

(defn spaces-spaceEvents-list
  "Lists events from a Google Chat space. For each event, the [payload](https://developers.google.com/workspace/chat/api/reference/rest/v1/spaces.spaceEvents#SpaceEvent.FIELDS.oneof_payload) contains the most recent version of the Chat resource. For example, if you list events about new space members, the server returns `Membership` resources that contain the latest membership details. If new members were removed during the requested period, the event payload contains an empty `Membership` resource. Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user). To list events, the authenticated user must be a member of the space. For an example, see [List events from a Google Chat space](https://developers.google.com/workspace/chat/list-space-events).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/spaces/spaceEvents/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of space events returned. The service might return fewer than this value. Negative values return an `INVALID_ARGUMENT` error.
filter <string> Required. A query filter. You must specify at least one event type (`event_type`) using the has `:` operator. To filter by multiple event types, use the `OR` operator. Omit batch event types in your filter. The request automatically returns any related batch events. For example, if you filter by new reactions (`google.workspace.chat.reaction.v1.created`), the server also returns batch new reactions events (`google.workspace.chat.reaction.v1.batchCreated`). For a list of supported event types, see the [`SpaceEvents` reference documentation](https://developers.google.com/workspace/chat/api/reference/rest/v1/spaces.spaceEvents#SpaceEvent.FIELDS.event_type). Optionally, you can also filter by start time (`start_time`) and end time (`end_time`): * `start_time`: Exclusive timestamp from which to start listing space events. You can list events that occurred up to 28 days ago. If unspecified, lists space events from the past 28 days. * `end_time`: Inclusive timestamp until which space events are listed. If unspecified, lists events up to the time of the request. To specify a start or end time, use the equals `=` operator and format in [RFC-3339](https://www.rfc-editor.org/rfc/rfc3339). To filter by both `start_time` and `end_time`, use the `AND` operator. For example, the following queries are valid: ``` start_time=\"2023-08-23T19:20:33+00:00\" AND end_time=\"2023-08-23T19:21:54+00:00\" ``` ``` start_time=\"2023-08-23T19:20:33+00:00\" AND (event_types:\"google.workspace.chat.space.v1.updated\" OR event_types:\"google.workspace.chat.message.v1.created\") ``` The following queries are invalid: ``` start_time=\"2023-08-23T19:20:33+00:00\" OR end_time=\"2023-08-23T19:21:54+00:00\" ``` ``` event_types:\"google.workspace.chat.space.v1.updated\" AND event_types:\"google.workspace.chat.message.v1.created\" ``` Invalid queries are rejected by the server with an `INVALID_ARGUMENT` error."
  ([parent] (spaces-spaceEvents-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://chat.googleapis.com/v1/{+parent}/spaceEvents",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.memberships"
        "https://www.googleapis.com/auth/chat.memberships.readonly"
        "https://www.googleapis.com/auth/chat.messages"
        "https://www.googleapis.com/auth/chat.messages.reactions"
        "https://www.googleapis.com/auth/chat.messages.reactions.readonly"
        "https://www.googleapis.com/auth/chat.messages.readonly"
        "https://www.googleapis.com/auth/chat.spaces"
        "https://www.googleapis.com/auth/chat.spaces.readonly"]})))

(defn users-spaces-getSpaceReadState
  "Returns details about a user's read state within a space, used to identify read and unread messages. For an example, see [Get details about a user's space read state](https://developers.google.com/workspace/chat/get-space-read-state). Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/users/spaces/getSpaceReadState

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://chat.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.users.readstate"
      "https://www.googleapis.com/auth/chat.users.readstate.readonly"]}))

(defn users-spaces-updateSpaceReadState
  "Updates a user's read state within a space, used to identify read and unread messages. For an example, see [Update a user's space read state](https://developers.google.com/workspace/chat/update-space-read-state). Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/users/spaces/updateSpaceReadState

name <> 
SpaceReadState:
SpaceReadState

optional:
updateMask <string> Required. The field paths to update. Currently supported field paths: - `last_read_time` When the `last_read_time` is before the latest message create time, the space appears as unread in the UI. To mark the space as read, set `last_read_time` to any value later (larger) than the latest message create time. The `last_read_time` is coerced to match the latest message create time. Note that the space read state only affects the read state of messages that are visible in the space's top-level conversation. Replies in threads are unaffected by this timestamp, and instead rely on the thread read state."
  ([name SpaceReadState]
    (users-spaces-updateSpaceReadState name SpaceReadState nil))
  ([name SpaceReadState optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://chat.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.users.readstate"],
       :body SpaceReadState})))

(defn users-spaces-threads-getThreadReadState
  "Returns details about a user's read state within a thread, used to identify read and unread messages. For an example, see [Get details about a user's thread read state](https://developers.google.com/workspace/chat/get-thread-read-state). Requires [user authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
https://developers.google.com/workspace/chat/v1/reference/rest/v1/users/spaces/threads/getThreadReadState

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://chat.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.users.readstate"
      "https://www.googleapis.com/auth/chat.users.readstate.readonly"]}))
