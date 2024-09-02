(ns happyapi.google.contactcenterinsights-v1
  "Contact Center AI Insights API

See: https://cloud.google.com/contact-center/insights/docs"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-getEncryptionSpec
  "Gets location-level encryption key specification.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/getEncryptionSpec

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-updateSettings
  "Updates project-level settings.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/updateSettings

name <> 
GoogleCloudContactcenterinsightsV1Settings:
GoogleCloudContactcenterinsightsV1Settings

optional:
updateMask <string> Required. The list of fields to be updated."
  ([name GoogleCloudContactcenterinsightsV1Settings]
    (projects-locations-updateSettings
      name
      GoogleCloudContactcenterinsightsV1Settings
      nil))
  ([name GoogleCloudContactcenterinsightsV1Settings optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudContactcenterinsightsV1Settings})))

(defn projects-locations-getSettings
  "Gets project-level settings.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/getSettings

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-views-delete
  "Deletes a view.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/views/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-views-get
  "Gets a view.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/views/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-views-create
  "Creates a view.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/views/create

parent <> 
GoogleCloudContactcenterinsightsV1View:
GoogleCloudContactcenterinsightsV1View"
  [parent GoogleCloudContactcenterinsightsV1View]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+parent}/views",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContactcenterinsightsV1View}))

(defn projects-locations-views-list
  "Lists views.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/views/list

parent <> 

optional:
pageSize <integer> The maximum number of views to return in the response. If this value is zero, the service will select a default size. A call may return fewer objects than requested. A non-empty `next_page_token` in the response indicates that more data is available."
  ([parent] (projects-locations-views-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+parent}/views",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-views-patch
  "Updates a view.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/views/patch

name <> 
GoogleCloudContactcenterinsightsV1View:
GoogleCloudContactcenterinsightsV1View

optional:
updateMask <string> The list of fields to be updated."
  ([name GoogleCloudContactcenterinsightsV1View]
    (projects-locations-views-patch
      name
      GoogleCloudContactcenterinsightsV1View
      nil))
  ([name GoogleCloudContactcenterinsightsV1View optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudContactcenterinsightsV1View})))

(defn projects-locations-issueModels-deploy
  "Deploys an issue model. Returns an error if a model is already deployed. An issue model can only be used in analysis after it has been deployed.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/issueModels/deploy

name <> 
GoogleCloudContactcenterinsightsV1DeployIssueModelRequest:
GoogleCloudContactcenterinsightsV1DeployIssueModelRequest"
  [name GoogleCloudContactcenterinsightsV1DeployIssueModelRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}:deploy",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContactcenterinsightsV1DeployIssueModelRequest}))

(defn projects-locations-issueModels-undeploy
  "Undeploys an issue model. An issue model can not be used in analysis after it has been undeployed.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/issueModels/undeploy

name <> 
GoogleCloudContactcenterinsightsV1UndeployIssueModelRequest:
GoogleCloudContactcenterinsightsV1UndeployIssueModelRequest"
  [name GoogleCloudContactcenterinsightsV1UndeployIssueModelRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}:undeploy",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudContactcenterinsightsV1UndeployIssueModelRequest}))

(defn projects-locations-issueModels-list
  "Lists issue models.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/issueModels/list

parent <> "
  [parent]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+parent}/issueModels",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-issueModels-calculateIssueModelStats
  "Gets an issue model's statistics.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/issueModels/calculateIssueModelStats

issueModel <> "
  [issueModel]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+issueModel}:calculateIssueModelStats",
     :uri-template-args {"issueModel" issueModel},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-issueModels-delete
  "Deletes an issue model.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/issueModels/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-issueModels-export
  "Exports an issue model to the provided destination.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/issueModels/export

name <> 
GoogleCloudContactcenterinsightsV1ExportIssueModelRequest:
GoogleCloudContactcenterinsightsV1ExportIssueModelRequest"
  [name GoogleCloudContactcenterinsightsV1ExportIssueModelRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}:export",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContactcenterinsightsV1ExportIssueModelRequest}))

(defn projects-locations-issueModels-import
  "Imports an issue model from a Cloud Storage bucket.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/issueModels/import

parent <> 
GoogleCloudContactcenterinsightsV1ImportIssueModelRequest:
GoogleCloudContactcenterinsightsV1ImportIssueModelRequest"
  [parent GoogleCloudContactcenterinsightsV1ImportIssueModelRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+parent}/issueModels:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContactcenterinsightsV1ImportIssueModelRequest}))

(defn projects-locations-issueModels-patch
  "Updates an issue model.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/issueModels/patch

name <> 
GoogleCloudContactcenterinsightsV1IssueModel:
GoogleCloudContactcenterinsightsV1IssueModel

optional:
updateMask <string> The list of fields to be updated."
  ([name GoogleCloudContactcenterinsightsV1IssueModel]
    (projects-locations-issueModels-patch
      name
      GoogleCloudContactcenterinsightsV1IssueModel
      nil))
  ([name GoogleCloudContactcenterinsightsV1IssueModel optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudContactcenterinsightsV1IssueModel})))

(defn projects-locations-issueModels-create
  "Creates an issue model.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/issueModels/create

parent <> 
GoogleCloudContactcenterinsightsV1IssueModel:
GoogleCloudContactcenterinsightsV1IssueModel"
  [parent GoogleCloudContactcenterinsightsV1IssueModel]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+parent}/issueModels",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContactcenterinsightsV1IssueModel}))

(defn projects-locations-issueModels-get
  "Gets an issue model.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/issueModels/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-issueModels-issues-list
  "Lists issues.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/issueModels/issues/list

parent <> "
  [parent]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+parent}/issues",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-issueModels-issues-delete
  "Deletes an issue.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/issueModels/issues/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-issueModels-issues-get
  "Gets an issue.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/issueModels/issues/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-issueModels-issues-patch
  "Updates an issue.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/issueModels/issues/patch

name <> 
GoogleCloudContactcenterinsightsV1Issue:
GoogleCloudContactcenterinsightsV1Issue

optional:
updateMask <string> The list of fields to be updated."
  ([name GoogleCloudContactcenterinsightsV1Issue]
    (projects-locations-issueModels-issues-patch
      name
      GoogleCloudContactcenterinsightsV1Issue
      nil))
  ([name GoogleCloudContactcenterinsightsV1Issue optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudContactcenterinsightsV1Issue})))

(defn projects-locations-phraseMatchers-list
  "Lists phrase matchers.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/phraseMatchers/list

parent <> 

optional:
filter <string> A filter to reduce results to a specific subset. Useful for querying phrase matchers with specific properties.
pageSize <integer> The maximum number of phrase matchers to return in the response. If this value is zero, the service will select a default size. A call might return fewer objects than requested. A non-empty `next_page_token` in the response indicates that more data is available."
  ([parent] (projects-locations-phraseMatchers-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+parent}/phraseMatchers",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-phraseMatchers-get
  "Gets a phrase matcher.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/phraseMatchers/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-phraseMatchers-create
  "Creates a phrase matcher.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/phraseMatchers/create

parent <> 
GoogleCloudContactcenterinsightsV1PhraseMatcher:
GoogleCloudContactcenterinsightsV1PhraseMatcher"
  [parent GoogleCloudContactcenterinsightsV1PhraseMatcher]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+parent}/phraseMatchers",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContactcenterinsightsV1PhraseMatcher}))

(defn projects-locations-phraseMatchers-delete
  "Deletes a phrase matcher.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/phraseMatchers/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-phraseMatchers-patch
  "Updates a phrase matcher.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/phraseMatchers/patch

name <> 
GoogleCloudContactcenterinsightsV1PhraseMatcher:
GoogleCloudContactcenterinsightsV1PhraseMatcher

optional:
updateMask <string> The list of fields to be updated."
  ([name GoogleCloudContactcenterinsightsV1PhraseMatcher]
    (projects-locations-phraseMatchers-patch
      name
      GoogleCloudContactcenterinsightsV1PhraseMatcher
      nil))
  ([name GoogleCloudContactcenterinsightsV1PhraseMatcher optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudContactcenterinsightsV1PhraseMatcher})))

(defn projects-locations-encryptionSpec-initialize
  "Initializes a location-level encryption key specification. An error will be thrown if the location has resources already created before the initialization. Once the encryption specification is initialized at a location, it is immutable and all newly created resources under the location will be encrypted with the existing specification.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/encryptionSpec/initialize

name <> 
GoogleCloudContactcenterinsightsV1InitializeEncryptionSpecRequest:
GoogleCloudContactcenterinsightsV1InitializeEncryptionSpecRequest"
  [name
   GoogleCloudContactcenterinsightsV1InitializeEncryptionSpecRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}:initialize",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudContactcenterinsightsV1InitializeEncryptionSpecRequest}))

(defn projects-locations-insightsdata-export
  "Export insights data to a destination defined in the request body.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/insightsdata/export

parent <> 
GoogleCloudContactcenterinsightsV1ExportInsightsDataRequest:
GoogleCloudContactcenterinsightsV1ExportInsightsDataRequest"
  [parent GoogleCloudContactcenterinsightsV1ExportInsightsDataRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+parent}/insightsdata:export",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudContactcenterinsightsV1ExportInsightsDataRequest}))

(defn projects-locations-conversations-list
  "Lists conversations.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/conversations/list

parent <> 

optional:
orderBy <string> Optional. The attribute by which to order conversations in the response. If empty, conversations will be ordered by descending creation time. Supported values are one of the following: * create_time * customer_satisfaction_rating * duration * latest_analysis * start_time * turn_count The default sort order is ascending. To specify order, append `asc` or `desc` (`create_time desc`). For more details, see [Google AIPs Ordering](https://google.aip.dev/132#ordering).
pageSize <integer> The maximum number of conversations to return in the response. A valid page size ranges from 0 to 1,000 inclusive. If the page size is zero or unspecified, a default page size of 100 will be chosen. Note that a call might return fewer results than the requested page size.
view <string> The level of details of the conversation. Default is `BASIC`.
filter <string> A filter to reduce results to a specific subset. Useful for querying conversations with specific properties."
  ([parent] (projects-locations-conversations-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+parent}/conversations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-conversations-delete
  "Deletes a conversation.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/conversations/delete

name <> 

optional:
force <boolean> If set to true, all of this conversation's analyses will also be deleted. Otherwise, the request will only succeed if the conversation has no analyses."
  ([name] (projects-locations-conversations-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-conversations-bulkDelete
  "Deletes multiple conversations in a single request.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/conversations/bulkDelete

parent <> 
GoogleCloudContactcenterinsightsV1BulkDeleteConversationsRequest:
GoogleCloudContactcenterinsightsV1BulkDeleteConversationsRequest"
  [parent
   GoogleCloudContactcenterinsightsV1BulkDeleteConversationsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+parent}/conversations:bulkDelete",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudContactcenterinsightsV1BulkDeleteConversationsRequest}))

(defn projects-locations-conversations-upload
  "Create a long-running conversation upload operation. This method differs from `CreateConversation` by allowing audio transcription and optional DLP redaction.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/conversations/upload

parent <> 
GoogleCloudContactcenterinsightsV1UploadConversationRequest:
GoogleCloudContactcenterinsightsV1UploadConversationRequest"
  [parent GoogleCloudContactcenterinsightsV1UploadConversationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+parent}/conversations:upload",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudContactcenterinsightsV1UploadConversationRequest}))

(defn projects-locations-conversations-bulkAnalyze
  "Analyzes multiple conversations in a single request.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/conversations/bulkAnalyze

parent <> 
GoogleCloudContactcenterinsightsV1BulkAnalyzeConversationsRequest:
GoogleCloudContactcenterinsightsV1BulkAnalyzeConversationsRequest"
  [parent
   GoogleCloudContactcenterinsightsV1BulkAnalyzeConversationsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+parent}/conversations:bulkAnalyze",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudContactcenterinsightsV1BulkAnalyzeConversationsRequest}))

(defn projects-locations-conversations-calculateStats
  "Gets conversation statistics.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/conversations/calculateStats

location <> 

optional:
filter <string> A filter to reduce results to a specific subset. This field is useful for getting statistics about conversations with specific properties."
  ([location]
    (projects-locations-conversations-calculateStats location nil))
  ([location optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+location}/conversations:calculateStats",
       :uri-template-args {"location" location},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-conversations-patch
  "Updates a conversation.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/conversations/patch

name <> 
GoogleCloudContactcenterinsightsV1Conversation:
GoogleCloudContactcenterinsightsV1Conversation

optional:
updateMask <string> The list of fields to be updated. All possible fields can be updated by passing `*`, or a subset of the following updateable fields can be provided: * `agent_id` * `language_code` * `labels` * `metadata` * `quality_metadata` * `call_metadata` * `start_time` * `expire_time` or `ttl` * `data_source.gcs_source.audio_uri` or `data_source.dialogflow_source.audio_uri`"
  ([name GoogleCloudContactcenterinsightsV1Conversation]
    (projects-locations-conversations-patch
      name
      GoogleCloudContactcenterinsightsV1Conversation
      nil))
  ([name GoogleCloudContactcenterinsightsV1Conversation optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudContactcenterinsightsV1Conversation})))

(defn projects-locations-conversations-ingest
  "Imports conversations and processes them according to the user's configuration.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/conversations/ingest

parent <> 
GoogleCloudContactcenterinsightsV1IngestConversationsRequest:
GoogleCloudContactcenterinsightsV1IngestConversationsRequest"
  [parent GoogleCloudContactcenterinsightsV1IngestConversationsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+parent}/conversations:ingest",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudContactcenterinsightsV1IngestConversationsRequest}))

(defn projects-locations-conversations-create
  "Creates a conversation. Does not support audio transcription or DLP redaction. Use `conversations.upload` instead.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/conversations/create

parent <> 
GoogleCloudContactcenterinsightsV1Conversation:
GoogleCloudContactcenterinsightsV1Conversation

optional:
conversationId <string> A unique ID for the new conversation. This ID will become the final component of the conversation's resource name. If no ID is specified, a server-generated ID will be used. This value should be 4-64 characters and must match the regular expression `^[a-z0-9-]{4,64}$`. Valid characters are `a-z-`"
  ([parent GoogleCloudContactcenterinsightsV1Conversation]
    (projects-locations-conversations-create
      parent
      GoogleCloudContactcenterinsightsV1Conversation
      nil))
  ([parent GoogleCloudContactcenterinsightsV1Conversation optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+parent}/conversations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudContactcenterinsightsV1Conversation})))

(defn projects-locations-conversations-get
  "Gets a conversation.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/conversations/get

name <> 

optional:
view <string> The level of details of the conversation. Default is `FULL`."
  ([name] (projects-locations-conversations-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-conversations-analyses-delete
  "Deletes an analysis.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/conversations/analyses/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-conversations-analyses-create
  "Creates an analysis. The long running operation is done when the analysis has completed.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/conversations/analyses/create

parent <> 
GoogleCloudContactcenterinsightsV1Analysis:
GoogleCloudContactcenterinsightsV1Analysis"
  [parent GoogleCloudContactcenterinsightsV1Analysis]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+parent}/analyses",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContactcenterinsightsV1Analysis}))

(defn projects-locations-conversations-analyses-list
  "Lists analyses.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/conversations/analyses/list

parent <> 

optional:
filter <string> A filter to reduce results to a specific subset. Useful for querying conversations with specific properties.
pageSize <integer> The maximum number of analyses to return in the response. If this value is zero, the service will select a default size. A call might return fewer objects than requested. A non-empty `next_page_token` in the response indicates that more data is available."
  ([parent]
    (projects-locations-conversations-analyses-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://contactcenterinsights.googleapis.com/v1/{+parent}/analyses",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-conversations-analyses-get
  "Gets an analysis.
https://cloud.google.com/contact-center/insights/docs/v1/reference/rest/v1/projects/locations/conversations/analyses/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contactcenterinsights.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
