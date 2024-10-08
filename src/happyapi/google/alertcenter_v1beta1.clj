(ns happyapi.google.alertcenter-v1beta1
  "Google Workspace Alert Center API
Manages alerts on issues affecting your domain. Note: The current version of this API (v1beta1) is available to all Google Workspace customers. 
See: https://developers.google.com/admin-sdk/alertcenter/guides")

(defn alerts-list
  "Lists the alerts.
https://developers.google.com/admin-sdk/alertcenter/guides/v1beta1/reference/rest/v1beta1/alerts/list

optional:
customerId <string> Optional. The unique identifier of the Google Workspace account of the customer the alerts are associated with. The `customer_id` must have the initial \"C\" stripped (for example, `046psxkn`). Inferred from the caller identity if not provided. [Find your customer ID](https://support.google.com/cloudidentity/answer/10070793).
pageSize <integer> Optional. The requested page size. Server may return fewer items than requested. If unspecified, server picks an appropriate default.
filter <string> Optional. A query string for filtering alert results. For more details, see [Query filters](https://developers.google.com/admin-sdk/alertcenter/guides/query-filters) and [Supported query filter fields](https://developers.google.com/admin-sdk/alertcenter/reference/filter-fields#alerts.list).
orderBy <string> Optional. The sort order of the list results. If not specified results may be returned in arbitrary order. You can sort the results in descending order based on the creation timestamp using `order_by=\"create_time desc\"`. Currently, supported sorting are `create_time asc`, `create_time desc`, `update_time desc`"
  ([] (alerts-list nil))
  ([optional]
    {:method :get,
     :uri-template "https://alertcenter.googleapis.com/v1beta1/alerts",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.alerts"]}))

(defn alerts-get
  "Gets the specified alert. Attempting to get a nonexistent alert returns `NOT_FOUND` error.
https://developers.google.com/admin-sdk/alertcenter/guides/v1beta1/reference/rest/v1beta1/alerts/get

alertId <> 

optional:
customerId <string> Optional. The unique identifier of the Google Workspace account of the customer the alert is associated with. The `customer_id` must have the initial \"C\" stripped (for example, `046psxkn`). Inferred from the caller identity if not provided. [Find your customer ID](https://support.google.com/cloudidentity/answer/10070793)."
  ([alertId] (alerts-get alertId nil))
  ([alertId optional]
    {:method :get,
     :uri-template
     "https://alertcenter.googleapis.com/v1beta1/alerts/{alertId}",
     :uri-template-args {"alertId" alertId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.alerts"]}))

(defn alerts-delete
  "Marks the specified alert for deletion. An alert that has been marked for deletion is removed from Alert Center after 30 days. Marking an alert for deletion has no effect on an alert which has already been marked for deletion. Attempting to mark a nonexistent alert for deletion results in a `NOT_FOUND` error.
https://developers.google.com/admin-sdk/alertcenter/guides/v1beta1/reference/rest/v1beta1/alerts/delete

alertId <> 

optional:
customerId <string> Optional. The unique identifier of the Google Workspace account of the customer the alert is associated with. The `customer_id` must have the initial \"C\" stripped (for example, `046psxkn`). Inferred from the caller identity if not provided. [Find your customer ID](https://support.google.com/cloudidentity/answer/10070793)."
  ([alertId] (alerts-delete alertId nil))
  ([alertId optional]
    {:method :delete,
     :uri-template
     "https://alertcenter.googleapis.com/v1beta1/alerts/{alertId}",
     :uri-template-args {"alertId" alertId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.alerts"]}))

(defn alerts-undelete
  "Restores, or \"undeletes\", an alert that was marked for deletion within the past 30 days. Attempting to undelete an alert which was marked for deletion over 30 days ago (which has been removed from the Alert Center database) or a nonexistent alert returns a `NOT_FOUND` error. Attempting to undelete an alert which has not been marked for deletion has no effect.
https://developers.google.com/admin-sdk/alertcenter/guides/v1beta1/reference/rest/v1beta1/alerts/undelete

alertId <> 
UndeleteAlertRequest:
UndeleteAlertRequest"
  [alertId UndeleteAlertRequest]
  {:method :post,
   :uri-template
   "https://alertcenter.googleapis.com/v1beta1/alerts/{alertId}:undelete",
   :uri-template-args {"alertId" alertId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.alerts"],
   :body UndeleteAlertRequest})

(defn alerts-getMetadata
  "Returns the metadata of an alert. Attempting to get metadata for a non-existent alert returns `NOT_FOUND` error.
https://developers.google.com/admin-sdk/alertcenter/guides/v1beta1/reference/rest/v1beta1/alerts/getMetadata

alertId <> 

optional:
customerId <string> Optional. The unique identifier of the Google Workspace account of the customer the alert metadata is associated with. The `customer_id` must have the initial \"C\" stripped (for example, `046psxkn`). Inferred from the caller identity if not provided. [Find your customer ID](https://support.google.com/cloudidentity/answer/10070793)."
  ([alertId] (alerts-getMetadata alertId nil))
  ([alertId optional]
    {:method :get,
     :uri-template
     "https://alertcenter.googleapis.com/v1beta1/alerts/{alertId}/metadata",
     :uri-template-args {"alertId" alertId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.alerts"]}))

(defn alerts-batchDelete
  "Performs batch delete operation on alerts.
https://developers.google.com/admin-sdk/alertcenter/guides/v1beta1/reference/rest/v1beta1/alerts/batchDelete

BatchDeleteAlertsRequest:
BatchDeleteAlertsRequest"
  [BatchDeleteAlertsRequest]
  {:method :post,
   :uri-template
   "https://alertcenter.googleapis.com/v1beta1/alerts:batchDelete",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.alerts"],
   :body BatchDeleteAlertsRequest})

(defn alerts-batchUndelete
  "Performs batch undelete operation on alerts.
https://developers.google.com/admin-sdk/alertcenter/guides/v1beta1/reference/rest/v1beta1/alerts/batchUndelete

BatchUndeleteAlertsRequest:
BatchUndeleteAlertsRequest"
  [BatchUndeleteAlertsRequest]
  {:method :post,
   :uri-template
   "https://alertcenter.googleapis.com/v1beta1/alerts:batchUndelete",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.alerts"],
   :body BatchUndeleteAlertsRequest})

(defn alerts-feedback-create
  "Creates new feedback for an alert. Attempting to create a feedback for a non-existent alert returns `NOT_FOUND` error. Attempting to create a feedback for an alert that is marked for deletion returns `FAILED_PRECONDITION' error.
https://developers.google.com/admin-sdk/alertcenter/guides/v1beta1/reference/rest/v1beta1/alerts/feedback/create

alertId <> 
AlertFeedback:
AlertFeedback

optional:
customerId <string> Optional. The unique identifier of the Google Workspace account of the customer the alert is associated with. The `customer_id` must have the initial \"C\" stripped (for example, `046psxkn`). Inferred from the caller identity if not provided. [Find your customer ID](https://support.google.com/cloudidentity/answer/10070793)."
  ([alertId AlertFeedback]
    (alerts-feedback-create alertId AlertFeedback nil))
  ([alertId AlertFeedback optional]
    {:method :post,
     :uri-template
     "https://alertcenter.googleapis.com/v1beta1/alerts/{alertId}/feedback",
     :uri-template-args {"alertId" alertId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.alerts"],
     :body AlertFeedback}))

(defn alerts-feedback-list
  "Lists all the feedback for an alert. Attempting to list feedbacks for a non-existent alert returns `NOT_FOUND` error.
https://developers.google.com/admin-sdk/alertcenter/guides/v1beta1/reference/rest/v1beta1/alerts/feedback/list

alertId <> 

optional:
customerId <string> Optional. The unique identifier of the Google Workspace account of the customer the alert is associated with. The `customer_id` must have the initial \"C\" stripped (for example, `046psxkn`). Inferred from the caller identity if not provided. [Find your customer ID](https://support.google.com/cloudidentity/answer/10070793).
filter <string> Optional. A query string for filtering alert feedback results. For more details, see [Query filters](https://developers.google.com/admin-sdk/alertcenter/guides/query-filters) and [Supported query filter fields](https://developers.google.com/admin-sdk/alertcenter/reference/filter-fields#alerts.feedback.list)."
  ([alertId] (alerts-feedback-list alertId nil))
  ([alertId optional]
    {:method :get,
     :uri-template
     "https://alertcenter.googleapis.com/v1beta1/alerts/{alertId}/feedback",
     :uri-template-args {"alertId" alertId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.alerts"]}))

(defn getSettings
  "Returns customer-level settings.
https://developers.google.com/admin-sdk/alertcenter/guides/v1beta1/reference/rest/v1beta1/getSettings

optional:
customerId <string> Optional. The unique identifier of the Google Workspace account of the customer the alert settings are associated with. The `customer_id` must/ have the initial \"C\" stripped (for example, `046psxkn`). Inferred from the caller identity if not provided. [Find your customer ID](https://support.google.com/cloudidentity/answer/10070793)."
  ([] (getSettings nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://alertcenter.googleapis.com/v1beta1/settings",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.alerts"]}))

(defn updateSettings
  "Updates the customer-level settings.
https://developers.google.com/admin-sdk/alertcenter/guides/v1beta1/reference/rest/v1beta1/updateSettings

Settings:
Settings

optional:
customerId <string> Optional. The unique identifier of the Google Workspace account of the customer the alert settings are associated with. The `customer_id` must have the initial \"C\" stripped (for example, `046psxkn`). Inferred from the caller identity if not provided. [Find your customer ID](https://support.google.com/cloudidentity/answer/10070793)."
  ([Settings] (updateSettings Settings nil))
  ([Settings optional]
    {:method :patch,
     :uri-template
     "https://alertcenter.googleapis.com/v1beta1/settings",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.alerts"],
     :body Settings}))
