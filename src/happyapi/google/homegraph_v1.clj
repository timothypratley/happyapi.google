(ns happyapi.google.homegraph-v1
  "HomeGraph API

See: https://developers.home.google.com/cloud-to-cloud/get-started"
  (:require [happyapi.providers.google :as client]))

(defn agentUsers-delete
  "Unlinks the given third-party user from your smart home Action. All data related to this user will be deleted. For more details on how users link their accounts, see [fulfillment and authentication](https://developers.home.google.com/cloud-to-cloud/primer/fulfillment). The third-party user's identity is passed in via the `agent_user_id` (see DeleteAgentUserRequest). This request must be authorized using service account credentials from your Actions console project.
https://developers.home.google.com/cloud-to-cloud/get-started/v1/reference/rest/v1/agentUsers/delete

agentUserId <> 

optional:
requestId <string> Request ID used for debugging."
  ([agentUserId] (agentUsers-delete agentUserId nil))
  ([agentUserId optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://homegraph.googleapis.com/v1/{+agentUserId}",
       :uri-template-args {"agentUserId" agentUserId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/homegraph"]})))

(defn devices-requestSync
  "Requests Google to send an `action.devices.SYNC` [intent](https://developers.home.google.com/cloud-to-cloud/intents/sync) to your smart home Action to update device metadata for the given user. The third-party user's identity is passed via the `agent_user_id` (see RequestSyncDevicesRequest). This request must be authorized using service account credentials from your Actions console project.
https://developers.home.google.com/cloud-to-cloud/get-started/v1/reference/rest/v1/devices/requestSync

RequestSyncDevicesRequest:
RequestSyncDevicesRequest"
  [RequestSyncDevicesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://homegraph.googleapis.com/v1/devices:requestSync",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/homegraph"],
     :body RequestSyncDevicesRequest}))

(defn devices-sync
  "Gets all the devices associated with the given third-party user. The third-party user's identity is passed in via the `agent_user_id` (see SyncRequest). This request must be authorized using service account credentials from your Actions console project.
https://developers.home.google.com/cloud-to-cloud/get-started/v1/reference/rest/v1/devices/sync

SyncRequest:
SyncRequest"
  [SyncRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://homegraph.googleapis.com/v1/devices:sync",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/homegraph"],
     :body SyncRequest}))

(defn devices-reportStateAndNotification
  "Reports device state and optionally sends device notifications. Called by your smart home Action when the state of a third-party device changes or you need to send a notification about the device. See [Implement Report State](https://developers.home.google.com/cloud-to-cloud/integration/report-state) for more information. This method updates the device state according to its declared [traits](https://developers.home.google.com/cloud-to-cloud/primer/device-types-and-traits). Publishing a new state value outside of these traits will result in an `INVALID_ARGUMENT` error response. The third-party user's identity is passed in via the `agent_user_id` (see ReportStateAndNotificationRequest). This request must be authorized using service account credentials from your Actions console project.
https://developers.home.google.com/cloud-to-cloud/get-started/v1/reference/rest/v1/devices/reportStateAndNotification

ReportStateAndNotificationRequest:
ReportStateAndNotificationRequest"
  [ReportStateAndNotificationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://homegraph.googleapis.com/v1/devices:reportStateAndNotification",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/homegraph"],
     :body ReportStateAndNotificationRequest}))

(defn devices-query
  "Gets the current states in Home Graph for the given set of the third-party user's devices. The third-party user's identity is passed in via the `agent_user_id` (see QueryRequest). This request must be authorized using service account credentials from your Actions console project.
https://developers.home.google.com/cloud-to-cloud/get-started/v1/reference/rest/v1/devices/query

QueryRequest:
QueryRequest"
  [QueryRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://homegraph.googleapis.com/v1/devices:query",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/homegraph"],
     :body QueryRequest}))
