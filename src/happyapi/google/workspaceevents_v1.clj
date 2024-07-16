(ns happyapi.google.workspaceevents-v1
  "Google Workspace Events API
The Google Workspace Events API lets you subscribe to events and manage change notifications across Google Workspace applications.
See: https://developers.google.com/workspace/events"
  (:require [happyapi.providers.google :as client]))

(defn operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://developers.google.com/workspace/events/v1/reference/rest/v1/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://workspaceevents.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.bot"
      "https://www.googleapis.com/auth/chat.memberships"
      "https://www.googleapis.com/auth/chat.memberships.readonly"
      "https://www.googleapis.com/auth/chat.messages"
      "https://www.googleapis.com/auth/chat.messages.reactions"
      "https://www.googleapis.com/auth/chat.messages.reactions.readonly"
      "https://www.googleapis.com/auth/chat.messages.readonly"
      "https://www.googleapis.com/auth/chat.spaces"
      "https://www.googleapis.com/auth/chat.spaces.readonly"
      "https://www.googleapis.com/auth/meetings.space.created"
      "https://www.googleapis.com/auth/meetings.space.readonly"]}))

(defn subscriptions-reactivate
  "[Developer Preview](https://developers.google.com/workspace/preview): Reactivates a suspended Google Workspace subscription. This method resets your subscription's `State` field to `ACTIVE`. Before you use this method, you must fix the error that suspended the subscription. To learn how to use this method, see [Reactivate a Google Workspace subscription](https://developers.google.com/workspace/events/guides/reactivate-subscription).
https://developers.google.com/workspace/events/v1/reference/rest/v1/subscriptions/reactivate

name <> 
ReactivateSubscriptionRequest:
ReactivateSubscriptionRequest"
  [name ReactivateSubscriptionRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://workspaceevents.googleapis.com/v1/{+name}:reactivate",
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
      "https://www.googleapis.com/auth/chat.spaces.readonly"
      "https://www.googleapis.com/auth/meetings.space.created"
      "https://www.googleapis.com/auth/meetings.space.readonly"],
     :body ReactivateSubscriptionRequest}))

(defn subscriptions-patch
  "[Developer Preview](https://developers.google.com/workspace/preview): Updates or renews a Google Workspace subscription. To learn how to use this method, see [Update or renew a Google Workspace subscription](https://developers.google.com/workspace/events/guides/update-subscription).
https://developers.google.com/workspace/events/v1/reference/rest/v1/subscriptions/patch

name <> 
Subscription:
Subscription

optional:
validateOnly <boolean> Optional. If set to `true`, validates and previews the request, but doesn't update the subscription.
updateMask <string> Optional. The field to update. If omitted, updates any fields included in the request. You can update one of the following fields in a subscription: * `expire_time`: The timestamp when the subscription expires. * `ttl`: The time-to-live (TTL) or duration of the subscription. To fully replace the subscription (the equivalent of `PUT`), use `*`. Any omitted fields are updated with empty values."
  ([name Subscription] (subscriptions-patch name Subscription nil))
  ([name Subscription optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://workspaceevents.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.memberships"
        "https://www.googleapis.com/auth/chat.memberships.readonly"
        "https://www.googleapis.com/auth/chat.messages"
        "https://www.googleapis.com/auth/chat.messages.reactions"
        "https://www.googleapis.com/auth/chat.messages.reactions.readonly"
        "https://www.googleapis.com/auth/chat.messages.readonly"
        "https://www.googleapis.com/auth/chat.spaces"
        "https://www.googleapis.com/auth/chat.spaces.readonly"
        "https://www.googleapis.com/auth/meetings.space.created"
        "https://www.googleapis.com/auth/meetings.space.readonly"],
       :body Subscription})))

(defn subscriptions-create
  "[Developer Preview](https://developers.google.com/workspace/preview): Creates a Google Workspace subscription. To learn how to use this method, see [Create a Google Workspace subscription](https://developers.google.com/workspace/events/guides/create-subscription).
https://developers.google.com/workspace/events/v1/reference/rest/v1/subscriptions/create

Subscription:
Subscription

optional:
validateOnly <boolean> Optional. If set to `true`, validates and previews the request, but doesn't create the subscription."
  ([Subscription] (subscriptions-create Subscription nil))
  ([Subscription optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://workspaceevents.googleapis.com/v1/subscriptions",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.memberships"
        "https://www.googleapis.com/auth/chat.memberships.readonly"
        "https://www.googleapis.com/auth/chat.messages"
        "https://www.googleapis.com/auth/chat.messages.reactions"
        "https://www.googleapis.com/auth/chat.messages.reactions.readonly"
        "https://www.googleapis.com/auth/chat.messages.readonly"
        "https://www.googleapis.com/auth/chat.spaces"
        "https://www.googleapis.com/auth/chat.spaces.readonly"
        "https://www.googleapis.com/auth/meetings.space.created"
        "https://www.googleapis.com/auth/meetings.space.readonly"],
       :body Subscription})))

(defn subscriptions-get
  "[Developer Preview](https://developers.google.com/workspace/preview): Gets details about a Google Workspace subscription. To learn how to use this method, see [Get details about a Google Workspace subscription](https://developers.google.com/workspace/events/guides/get-subscription).
https://developers.google.com/workspace/events/v1/reference/rest/v1/subscriptions/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://workspaceevents.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chat.bot"
      "https://www.googleapis.com/auth/chat.memberships"
      "https://www.googleapis.com/auth/chat.memberships.readonly"
      "https://www.googleapis.com/auth/chat.messages"
      "https://www.googleapis.com/auth/chat.messages.reactions"
      "https://www.googleapis.com/auth/chat.messages.reactions.readonly"
      "https://www.googleapis.com/auth/chat.messages.readonly"
      "https://www.googleapis.com/auth/chat.spaces"
      "https://www.googleapis.com/auth/chat.spaces.readonly"
      "https://www.googleapis.com/auth/meetings.space.created"
      "https://www.googleapis.com/auth/meetings.space.readonly"]}))

(defn subscriptions-delete
  "[Developer Preview](https://developers.google.com/workspace/preview): Deletes a Google Workspace subscription. To learn how to use this method, see [Delete a Google Workspace subscription](https://developers.google.com/workspace/events/guides/delete-subscription).
https://developers.google.com/workspace/events/v1/reference/rest/v1/subscriptions/delete

name <> 

optional:
etag <string> Optional. Etag of the subscription. If present, it must match with the server's etag. Otherwise, request fails with the status `ABORTED`.
allowMissing <boolean> Optional. If set to `true` and the subscription isn't found, the request succeeds but doesn't delete the subscription.
validateOnly <boolean> Optional. If set to `true`, validates and previews the request, but doesn't delete the subscription."
  ([name] (subscriptions-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://workspaceevents.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.bot"
        "https://www.googleapis.com/auth/chat.memberships"
        "https://www.googleapis.com/auth/chat.memberships.readonly"
        "https://www.googleapis.com/auth/chat.messages"
        "https://www.googleapis.com/auth/chat.messages.reactions"
        "https://www.googleapis.com/auth/chat.messages.reactions.readonly"
        "https://www.googleapis.com/auth/chat.messages.readonly"
        "https://www.googleapis.com/auth/chat.spaces"
        "https://www.googleapis.com/auth/chat.spaces.readonly"
        "https://www.googleapis.com/auth/meetings.space.created"
        "https://www.googleapis.com/auth/meetings.space.readonly"]})))

(defn subscriptions-list
  "[Developer Preview](https://developers.google.com/workspace/preview): Lists Google Workspace subscriptions. To learn how to use this method, see [List Google Workspace subscriptions](https://developers.google.com/workspace/events/guides/list-subscriptions).
https://developers.google.com/workspace/events/v1/reference/rest/v1/subscriptions/list

optional:
filter <string> Required. A query filter. You can filter subscriptions by event type (`event_types`) and target resource (`target_resource`). You must specify at least one event type in your query. To filter for multiple event types, use the `OR` operator. To filter by both event type and target resource, use the `AND` operator and specify the full resource name, such as `//chat.googleapis.com/spaces/{space}`. For example, the following queries are valid: ``` event_types:\"google.workspace.chat.membership.v1.updated\" OR event_types:\"google.workspace.chat.message.v1.created\" event_types:\"google.workspace.chat.message.v1.created\" AND target_resource=\"//chat.googleapis.com/spaces/{space}\" ( event_types:\"google.workspace.chat.membership.v1.updated\" OR event_types:\"google.workspace.chat.message.v1.created\" ) AND target_resource=\"//chat.googleapis.com/spaces/{space}\" ``` The server rejects invalid queries with an `INVALID_ARGUMENT` error.
pageSize <integer> Optional. The maximum number of subscriptions to return. The service might return fewer than this value. If unspecified or set to `0`, up to 50 subscriptions are returned. The maximum value is 100. If you specify a value more than 100, the system only returns 100 subscriptions."
  ([] (subscriptions-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://workspaceevents.googleapis.com/v1/subscriptions",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chat.bot"
        "https://www.googleapis.com/auth/chat.memberships"
        "https://www.googleapis.com/auth/chat.memberships.readonly"
        "https://www.googleapis.com/auth/chat.messages"
        "https://www.googleapis.com/auth/chat.messages.reactions"
        "https://www.googleapis.com/auth/chat.messages.reactions.readonly"
        "https://www.googleapis.com/auth/chat.messages.readonly"
        "https://www.googleapis.com/auth/chat.spaces"
        "https://www.googleapis.com/auth/chat.spaces.readonly"
        "https://www.googleapis.com/auth/meetings.space.created"
        "https://www.googleapis.com/auth/meetings.space.readonly"]})))
