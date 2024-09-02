(ns happyapi.google.mybusinessnotifications-v1
  "My Business Notifications API
The My Business Notification Settings API enables managing notification settings for business accounts. Note - If you have a quota of 0 after enabling the API, please request for GBP API access.
See: https://developers.google.com/my-business/"
  (:require [happyapi.providers.google :as client]))

(defn accounts-getNotificationSetting
  "Returns the pubsub notification settings for the account.
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/getNotificationSetting

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://mybusinessnotifications.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes nil}))

(defn accounts-updateNotificationSetting
  "Sets the pubsub notification setting for the account informing Google which topic to send pubsub notifications for. Use the notification_types field within notification_setting to manipulate the events an account wants to subscribe to. An account will only have one notification setting resource, and only one pubsub topic can be set. To delete the setting, update with an empty notification_types
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/updateNotificationSetting

name <> 
NotificationSetting:
NotificationSetting

optional:
updateMask <string> Required. The specific fields that should be updated. The only editable field is notification_setting."
  ([name NotificationSetting]
    (accounts-updateNotificationSetting name NotificationSetting nil))
  ([name NotificationSetting optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://mybusinessnotifications.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes nil,
       :body NotificationSetting})))
