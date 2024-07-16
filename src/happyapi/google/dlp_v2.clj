(ns happyapi.google.dlp-v2
  "Sensitive Data Protection (DLP)
Discover and protect your sensitive data. A fully managed service designed to help you discover, classify, and protect your valuable data assets with ease.
See: https://cloud.google.com/sensitive-data-protection/docs/"
  (:require [happyapi.providers.google :as client]))

(defn locations-infoTypes-list
  "Returns a list of the sensitive information types that DLP API supports. See https://cloud.google.com/sensitive-data-protection/docs/infotypes-reference to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/locations/infoTypes/list

parent <> 

optional:
filter <string> filter to only return infoTypes supported by certain parts of the API. Defaults to supported_by=INSPECT.
languageCode <string> BCP-47 language code for localized infoType friendly names. If omitted, or if localized strings are not available, en-US strings will be returned.
locationId <string> Deprecated. This field has no effect."
  ([parent] (locations-infoTypes-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/infoTypes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-image-redact
  "Redacts potentially sensitive info from an image. This method has limits on input size, processing time, and output size. See https://cloud.google.com/sensitive-data-protection/docs/redacting-sensitive-data-images to learn more. When no InfoTypes or CustomInfoTypes are specified in this request, the system will automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/image/redact

parent <> 
GooglePrivacyDlpV2RedactImageRequest:
GooglePrivacyDlpV2RedactImageRequest"
  [parent GooglePrivacyDlpV2RedactImageRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/image:redact",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2RedactImageRequest}))

(defn projects-inspectTemplates-create
  "Creates an InspectTemplate for reusing frequently used configuration for inspecting content, images, and storage. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/inspectTemplates/create

parent <> 
GooglePrivacyDlpV2CreateInspectTemplateRequest:
GooglePrivacyDlpV2CreateInspectTemplateRequest"
  [parent GooglePrivacyDlpV2CreateInspectTemplateRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/inspectTemplates",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateInspectTemplateRequest}))

(defn projects-inspectTemplates-get
  "Gets an InspectTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/inspectTemplates/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-inspectTemplates-delete
  "Deletes an InspectTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/inspectTemplates/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-inspectTemplates-patch
  "Updates the InspectTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/inspectTemplates/patch

name <> 
GooglePrivacyDlpV2UpdateInspectTemplateRequest:
GooglePrivacyDlpV2UpdateInspectTemplateRequest"
  [name GooglePrivacyDlpV2UpdateInspectTemplateRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateInspectTemplateRequest}))

(defn projects-inspectTemplates-list
  "Lists InspectTemplates. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/inspectTemplates/list

parent <> 

optional:
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `create_time`: corresponds to the time the template was created. - `update_time`: corresponds to the time the template was last updated. - `name`: corresponds to the template's name. - `display_name`: corresponds to the template's display name.
pageSize <integer> Size of the page. This value can be limited by the server. If zero server returns a page of max size 100.
locationId <string> Deprecated. This field has no effect."
  ([parent] (projects-inspectTemplates-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/inspectTemplates",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-storedInfoTypes-list
  "Lists stored infoTypes. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/storedInfoTypes/list

parent <> 

optional:
pageSize <integer> Size of the page. This value can be limited by the server. If zero server returns a page of max size 100.
locationId <string> Deprecated. This field has no effect.
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc, display_name, create_time desc` Supported fields are: - `create_time`: corresponds to the time the most recent version of the resource was created. - `state`: corresponds to the state of the resource. - `name`: corresponds to resource name. - `display_name`: corresponds to info type's display name."
  ([parent] (projects-storedInfoTypes-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/storedInfoTypes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-storedInfoTypes-create
  "Creates a pre-built stored infoType to be used for inspection. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/storedInfoTypes/create

parent <> 
GooglePrivacyDlpV2CreateStoredInfoTypeRequest:
GooglePrivacyDlpV2CreateStoredInfoTypeRequest"
  [parent GooglePrivacyDlpV2CreateStoredInfoTypeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/storedInfoTypes",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateStoredInfoTypeRequest}))

(defn projects-storedInfoTypes-get
  "Gets a stored infoType. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/storedInfoTypes/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-storedInfoTypes-delete
  "Deletes a stored infoType. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/storedInfoTypes/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-storedInfoTypes-patch
  "Updates the stored infoType by creating a new version. The existing version will continue to be used until the new version is ready. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/storedInfoTypes/patch

name <> 
GooglePrivacyDlpV2UpdateStoredInfoTypeRequest:
GooglePrivacyDlpV2UpdateStoredInfoTypeRequest"
  [name GooglePrivacyDlpV2UpdateStoredInfoTypeRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateStoredInfoTypeRequest}))

(defn projects-jobTriggers-list
  "Lists job triggers. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/jobTriggers/list

parent <> 

optional:
locationId <string> Deprecated. This field has no effect.
pageSize <integer> Size of the page. This value can be limited by a server.
filter <string> Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * Supported fields/values for inspect triggers: - `status` - HEALTHY|PAUSED|CANCELLED - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY - 'last_run_time` - RFC 3339 formatted timestamp, surrounded by quotation marks. Nanoseconds are ignored. - 'error_count' - Number of errors that have occurred while running. * The operator must be `=` or `!=` for status and inspected_storage. Examples: * inspected_storage = cloud_storage AND status = HEALTHY * inspected_storage = cloud_storage OR inspected_storage = bigquery * inspected_storage = cloud_storage AND (state = PAUSED OR state = HEALTHY) * last_run_time > \\\"2017-12-12T00:00:00+00:00\\\" The length of this field should be no more than 500 characters.
orderBy <string> Comma-separated list of triggeredJob fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `create_time`: corresponds to the time the JobTrigger was created. - `update_time`: corresponds to the time the JobTrigger was last updated. - `last_run_time`: corresponds to the last time the JobTrigger ran. - `name`: corresponds to the JobTrigger's name. - `display_name`: corresponds to the JobTrigger's display name. - `status`: corresponds to JobTrigger's status.
type <string> The type of jobs. Will use `DlpJobType.INSPECT` if not set."
  ([parent] (projects-jobTriggers-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/jobTriggers",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-jobTriggers-patch
  "Updates a job trigger. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/jobTriggers/patch

name <> 
GooglePrivacyDlpV2UpdateJobTriggerRequest:
GooglePrivacyDlpV2UpdateJobTriggerRequest"
  [name GooglePrivacyDlpV2UpdateJobTriggerRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateJobTriggerRequest}))

(defn projects-jobTriggers-get
  "Gets a job trigger. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/jobTriggers/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-jobTriggers-activate
  "Activate a job trigger. Causes the immediate execute of a trigger instead of waiting on the trigger event to occur.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/jobTriggers/activate

name <> 
GooglePrivacyDlpV2ActivateJobTriggerRequest:
GooglePrivacyDlpV2ActivateJobTriggerRequest"
  [name GooglePrivacyDlpV2ActivateJobTriggerRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://dlp.googleapis.com/v2/{+name}:activate",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2ActivateJobTriggerRequest}))

(defn projects-jobTriggers-create
  "Creates a job trigger to run DLP actions such as scanning storage for sensitive information on a set schedule. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/jobTriggers/create

parent <> 
GooglePrivacyDlpV2CreateJobTriggerRequest:
GooglePrivacyDlpV2CreateJobTriggerRequest"
  [parent GooglePrivacyDlpV2CreateJobTriggerRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/jobTriggers",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateJobTriggerRequest}))

(defn projects-jobTriggers-delete
  "Deletes a job trigger. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/jobTriggers/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-content-deidentify
  "De-identifies potentially sensitive info from a ContentItem. This method has limits on input size and output size. See https://cloud.google.com/sensitive-data-protection/docs/deidentify-sensitive-data to learn more. When no InfoTypes or CustomInfoTypes are specified in this request, the system will automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/content/deidentify

parent <> 
GooglePrivacyDlpV2DeidentifyContentRequest:
GooglePrivacyDlpV2DeidentifyContentRequest"
  [parent GooglePrivacyDlpV2DeidentifyContentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/content:deidentify",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2DeidentifyContentRequest}))

(defn projects-content-reidentify
  "Re-identifies content that has been de-identified. See https://cloud.google.com/sensitive-data-protection/docs/pseudonymization#re-identification_in_free_text_code_example to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/content/reidentify

parent <> 
GooglePrivacyDlpV2ReidentifyContentRequest:
GooglePrivacyDlpV2ReidentifyContentRequest"
  [parent GooglePrivacyDlpV2ReidentifyContentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/content:reidentify",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2ReidentifyContentRequest}))

(defn projects-content-inspect
  "Finds potentially sensitive info in content. This method has limits on input size, processing time, and output size. When no InfoTypes or CustomInfoTypes are specified in this request, the system will automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated. For how to guides, see https://cloud.google.com/sensitive-data-protection/docs/inspecting-images and https://cloud.google.com/sensitive-data-protection/docs/inspecting-text,
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/content/inspect

parent <> 
GooglePrivacyDlpV2InspectContentRequest:
GooglePrivacyDlpV2InspectContentRequest"
  [parent GooglePrivacyDlpV2InspectContentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/content:inspect",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2InspectContentRequest}))

(defn projects-locations-tableDataProfiles-get
  "Gets a table data profile.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/tableDataProfiles/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tableDataProfiles-delete
  "Delete a TableDataProfile. Will not prevent the profile from being regenerated if the table is still included in a discovery configuration.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/tableDataProfiles/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tableDataProfiles-list
  "Lists table data profiles for an organization.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/tableDataProfiles/list

parent <> 

optional:
filter <string> Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * Supported fields/values: - `project_id` - The Google Cloud project ID. - `dataset_id` - The BigQuery dataset ID. - `table_id` - The ID of the BigQuery table. - `sensitivity_level` - HIGH|MODERATE|LOW - `data_risk_level` - HIGH|MODERATE|LOW - `resource_visibility`: PUBLIC|RESTRICTED - `status_code` - an RPC status code as defined in https://github.com/googleapis/googleapis/blob/master/google/rpc/code.proto * The operator must be `=` or `!=`. Examples: * `project_id = 12345 AND status_code = 1` * `project_id = 12345 AND sensitivity_level = HIGH` * `project_id = 12345 AND resource_visibility = PUBLIC` The length of this field should be no more than 500 characters.
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Only one order field at a time is allowed. Examples: * `project_id asc` * `table_id` * `sensitivity_level desc` Supported fields are: - `project_id`: The Google Cloud project ID. - `dataset_id`: The ID of a BigQuery dataset. - `table_id`: The ID of a BigQuery table. - `sensitivity_level`: How sensitive the data in a table is, at most. - `data_risk_level`: How much risk is associated with this data. - `profile_last_generated`: When the profile was last updated in epoch seconds. - `last_modified`: The last time the resource was modified. - `resource_visibility`: Visibility restriction for this resource. - `row_count`: Number of rows in this resource.
pageSize <integer> Size of the page. This value can be limited by the server. If zero, server returns a page of max size 100."
  ([parent] (projects-locations-tableDataProfiles-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/tableDataProfiles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-storedInfoTypes-list
  "Lists stored infoTypes. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/storedInfoTypes/list

parent <> 

optional:
pageSize <integer> Size of the page. This value can be limited by the server. If zero server returns a page of max size 100.
locationId <string> Deprecated. This field has no effect.
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc, display_name, create_time desc` Supported fields are: - `create_time`: corresponds to the time the most recent version of the resource was created. - `state`: corresponds to the state of the resource. - `name`: corresponds to resource name. - `display_name`: corresponds to info type's display name."
  ([parent] (projects-locations-storedInfoTypes-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/storedInfoTypes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-storedInfoTypes-get
  "Gets a stored infoType. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/storedInfoTypes/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-storedInfoTypes-delete
  "Deletes a stored infoType. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/storedInfoTypes/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-storedInfoTypes-patch
  "Updates the stored infoType by creating a new version. The existing version will continue to be used until the new version is ready. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/storedInfoTypes/patch

name <> 
GooglePrivacyDlpV2UpdateStoredInfoTypeRequest:
GooglePrivacyDlpV2UpdateStoredInfoTypeRequest"
  [name GooglePrivacyDlpV2UpdateStoredInfoTypeRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateStoredInfoTypeRequest}))

(defn projects-locations-storedInfoTypes-create
  "Creates a pre-built stored infoType to be used for inspection. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/storedInfoTypes/create

parent <> 
GooglePrivacyDlpV2CreateStoredInfoTypeRequest:
GooglePrivacyDlpV2CreateStoredInfoTypeRequest"
  [parent GooglePrivacyDlpV2CreateStoredInfoTypeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/storedInfoTypes",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateStoredInfoTypeRequest}))

(defn projects-locations-image-redact
  "Redacts potentially sensitive info from an image. This method has limits on input size, processing time, and output size. See https://cloud.google.com/sensitive-data-protection/docs/redacting-sensitive-data-images to learn more. When no InfoTypes or CustomInfoTypes are specified in this request, the system will automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/image/redact

parent <> 
GooglePrivacyDlpV2RedactImageRequest:
GooglePrivacyDlpV2RedactImageRequest"
  [parent GooglePrivacyDlpV2RedactImageRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/image:redact",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2RedactImageRequest}))

(defn projects-locations-projectDataProfiles-list
  "Lists project data profiles for an organization.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/projectDataProfiles/list

parent <> 

optional:
pageSize <integer> Size of the page. This value can be limited by the server. If zero, server returns a page of max size 100.
filter <string> Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * Supported fields/values: - `sensitivity_level` - HIGH|MODERATE|LOW - `data_risk_level` - HIGH|MODERATE|LOW - `status_code` - an RPC status code as defined in https://github.com/googleapis/googleapis/blob/master/google/rpc/code.proto * The operator must be `=` or `!=`. Examples: * `project_id = 12345 AND status_code = 1` * `project_id = 12345 AND sensitivity_level = HIGH` The length of this field should be no more than 500 characters.
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Only one order field at a time is allowed. Examples: * `project_id` * `sensitivity_level desc` Supported fields are: - `project_id`: Google Cloud project ID - `sensitivity_level`: How sensitive the data in a project is, at most. - `data_risk_level`: How much risk is associated with this data. - `profile_last_generated`: When the profile was last updated in epoch seconds."
  ([parent] (projects-locations-projectDataProfiles-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/projectDataProfiles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-projectDataProfiles-get
  "Gets a project data profile.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/projectDataProfiles/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deidentifyTemplates-delete
  "Deletes a DeidentifyTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/deidentifyTemplates/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deidentifyTemplates-create
  "Creates a DeidentifyTemplate for reusing frequently used configuration for de-identifying content, images, and storage. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/deidentifyTemplates/create

parent <> 
GooglePrivacyDlpV2CreateDeidentifyTemplateRequest:
GooglePrivacyDlpV2CreateDeidentifyTemplateRequest"
  [parent GooglePrivacyDlpV2CreateDeidentifyTemplateRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/deidentifyTemplates",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateDeidentifyTemplateRequest}))

(defn projects-locations-deidentifyTemplates-list
  "Lists DeidentifyTemplates. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/deidentifyTemplates/list

parent <> 

optional:
pageSize <integer> Size of the page. This value can be limited by the server. If zero server returns a page of max size 100.
locationId <string> Deprecated. This field has no effect.
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `create_time`: corresponds to the time the template was created. - `update_time`: corresponds to the time the template was last updated. - `name`: corresponds to the template's name. - `display_name`: corresponds to the template's display name."
  ([parent] (projects-locations-deidentifyTemplates-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/deidentifyTemplates",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-deidentifyTemplates-patch
  "Updates the DeidentifyTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/deidentifyTemplates/patch

name <> 
GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest:
GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest"
  [name GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest}))

(defn projects-locations-deidentifyTemplates-get
  "Gets a DeidentifyTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/deidentifyTemplates/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dlpJobs-finish
  "Finish a running hybrid DlpJob. Triggers the finalization steps and running of any enabled actions that have not yet run.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/dlpJobs/finish

name <> 
GooglePrivacyDlpV2FinishDlpJobRequest:
GooglePrivacyDlpV2FinishDlpJobRequest"
  [name GooglePrivacyDlpV2FinishDlpJobRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://dlp.googleapis.com/v2/{+name}:finish",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2FinishDlpJobRequest}))

(defn projects-locations-dlpJobs-hybridInspect
  "Inspect hybrid content and store findings to a job. To review the findings, inspect the job. Inspection will occur asynchronously.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/dlpJobs/hybridInspect

name <> 
GooglePrivacyDlpV2HybridInspectDlpJobRequest:
GooglePrivacyDlpV2HybridInspectDlpJobRequest"
  [name GooglePrivacyDlpV2HybridInspectDlpJobRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+name}:hybridInspect",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2HybridInspectDlpJobRequest}))

(defn projects-locations-dlpJobs-delete
  "Deletes a long-running DlpJob. This method indicates that the client is no longer interested in the DlpJob result. The job will be canceled if possible. See https://cloud.google.com/sensitive-data-protection/docs/inspecting-storage and https://cloud.google.com/sensitive-data-protection/docs/compute-risk-analysis to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/dlpJobs/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dlpJobs-list
  "Lists DlpJobs that match the specified filter in the request. See https://cloud.google.com/sensitive-data-protection/docs/inspecting-storage and https://cloud.google.com/sensitive-data-protection/docs/compute-risk-analysis to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/dlpJobs/list

parent <> 

optional:
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc, end_time asc, create_time desc` Supported fields are: - `create_time`: corresponds to the time the job was created. - `end_time`: corresponds to the time the job ended. - `name`: corresponds to the job's name. - `state`: corresponds to `state`
pageSize <integer> The standard list page size.
type <string> The type of job. Defaults to `DlpJobType.INSPECT`
filter <string> Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * Supported fields/values for inspect jobs: - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY - `trigger_name` - The name of the trigger that created the job. - 'end_time` - Corresponds to the time the job finished. - 'start_time` - Corresponds to the time the job finished. * Supported fields for risk analysis jobs: - `state` - RUNNING|CANCELED|FINISHED|FAILED - 'end_time` - Corresponds to the time the job finished. - 'start_time` - Corresponds to the time the job finished. * The operator must be `=` or `!=`. Examples: * inspected_storage = cloud_storage AND state = done * inspected_storage = cloud_storage OR inspected_storage = bigquery * inspected_storage = cloud_storage AND (state = done OR state = canceled) * end_time > \\\"2017-12-12T00:00:00+00:00\\\" The length of this field should be no more than 500 characters.
locationId <string> Deprecated. This field has no effect."
  ([parent] (projects-locations-dlpJobs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template "https://dlp.googleapis.com/v2/{+parent}/dlpJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dlpJobs-cancel
  "Starts asynchronous cancellation on a long-running DlpJob. The server makes a best effort to cancel the DlpJob, but success is not guaranteed. See https://cloud.google.com/sensitive-data-protection/docs/inspecting-storage and https://cloud.google.com/sensitive-data-protection/docs/compute-risk-analysis to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/dlpJobs/cancel

name <> 
GooglePrivacyDlpV2CancelDlpJobRequest:
GooglePrivacyDlpV2CancelDlpJobRequest"
  [name GooglePrivacyDlpV2CancelDlpJobRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://dlp.googleapis.com/v2/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CancelDlpJobRequest}))

(defn projects-locations-dlpJobs-create
  "Creates a new job to inspect storage or calculate risk metrics. See https://cloud.google.com/sensitive-data-protection/docs/inspecting-storage and https://cloud.google.com/sensitive-data-protection/docs/compute-risk-analysis to learn more. When no InfoTypes or CustomInfoTypes are specified in inspect jobs, the system will automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/dlpJobs/create

parent <> 
GooglePrivacyDlpV2CreateDlpJobRequest:
GooglePrivacyDlpV2CreateDlpJobRequest"
  [parent GooglePrivacyDlpV2CreateDlpJobRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://dlp.googleapis.com/v2/{+parent}/dlpJobs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateDlpJobRequest}))

(defn projects-locations-dlpJobs-get
  "Gets the latest state of a long-running DlpJob. See https://cloud.google.com/sensitive-data-protection/docs/inspecting-storage and https://cloud.google.com/sensitive-data-protection/docs/compute-risk-analysis to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/dlpJobs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-columnDataProfiles-get
  "Gets a column data profile.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/columnDataProfiles/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-columnDataProfiles-list
  "Lists column data profiles for an organization.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/columnDataProfiles/list

parent <> 

optional:
pageSize <integer> Size of the page. This value can be limited by the server. If zero, server returns a page of max size 100.
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Only one order field at a time is allowed. Examples: * `project_id asc` * `table_id` * `sensitivity_level desc` Supported fields are: - `project_id`: The Google Cloud project ID. - `dataset_id`: The ID of a BigQuery dataset. - `table_id`: The ID of a BigQuery table. - `sensitivity_level`: How sensitive the data in a column is, at most. - `data_risk_level`: How much risk is associated with this data. - `profile_last_generated`: When the profile was last updated in epoch seconds.
filter <string> Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * Supported fields/values: - `table_data_profile_name` - The name of the related table data profile. - `project_id` - The Google Cloud project ID. (REQUIRED) - `dataset_id` - The BigQuery dataset ID. (REQUIRED) - `table_id` - The BigQuery table ID. (REQUIRED) - `field_id` - The ID of the BigQuery field. - `info_type` - The infotype detected in the resource. - `sensitivity_level` - HIGH|MEDIUM|LOW - `data_risk_level`: How much risk is associated with this data. - `status_code` - an RPC status code as defined in https://github.com/googleapis/googleapis/blob/master/google/rpc/code.proto * The operator must be `=` for project_id, dataset_id, and table_id. Other filters also support `!=`. Examples: * project_id = 12345 AND status_code = 1 * project_id = 12345 AND sensitivity_level = HIGH * project_id = 12345 AND info_type = STREET_ADDRESS The length of this field should be no more than 500 characters."
  ([parent] (projects-locations-columnDataProfiles-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/columnDataProfiles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-content-deidentify
  "De-identifies potentially sensitive info from a ContentItem. This method has limits on input size and output size. See https://cloud.google.com/sensitive-data-protection/docs/deidentify-sensitive-data to learn more. When no InfoTypes or CustomInfoTypes are specified in this request, the system will automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/content/deidentify

parent <> 
GooglePrivacyDlpV2DeidentifyContentRequest:
GooglePrivacyDlpV2DeidentifyContentRequest"
  [parent GooglePrivacyDlpV2DeidentifyContentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/content:deidentify",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2DeidentifyContentRequest}))

(defn projects-locations-content-reidentify
  "Re-identifies content that has been de-identified. See https://cloud.google.com/sensitive-data-protection/docs/pseudonymization#re-identification_in_free_text_code_example to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/content/reidentify

parent <> 
GooglePrivacyDlpV2ReidentifyContentRequest:
GooglePrivacyDlpV2ReidentifyContentRequest"
  [parent GooglePrivacyDlpV2ReidentifyContentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/content:reidentify",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2ReidentifyContentRequest}))

(defn projects-locations-content-inspect
  "Finds potentially sensitive info in content. This method has limits on input size, processing time, and output size. When no InfoTypes or CustomInfoTypes are specified in this request, the system will automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated. For how to guides, see https://cloud.google.com/sensitive-data-protection/docs/inspecting-images and https://cloud.google.com/sensitive-data-protection/docs/inspecting-text,
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/content/inspect

parent <> 
GooglePrivacyDlpV2InspectContentRequest:
GooglePrivacyDlpV2InspectContentRequest"
  [parent GooglePrivacyDlpV2InspectContentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/content:inspect",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2InspectContentRequest}))

(defn projects-locations-fileStoreDataProfiles-get
  "Gets a file store data profile.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/fileStoreDataProfiles/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-fileStoreDataProfiles-list
  "Lists file store data profiles for an organization.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/fileStoreDataProfiles/list

parent <> 

optional:
orderBy <string> Optional. Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Only one order field at a time is allowed. Examples: * `project_id asc` * `name` * `sensitivity_level desc` Supported fields are: - `project_id`: The Google Cloud project ID. - `sensitivity_level`: How sensitive the data in a table is, at most. - `data_risk_level`: How much risk is associated with this data. - `profile_last_generated`: When the profile was last updated in epoch seconds. - `last_modified`: The last time the resource was modified. - `resource_visibility`: Visibility restriction for this resource. - `name`: The name of the profile. - `create_time`: The time the file store was first created.
filter <string> Optional. Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * Supported fields/values: - `project_id` - The Google Cloud project ID. - `file_store_path` - The path like \"gs://bucket\". - `sensitivity_level` - HIGH|MODERATE|LOW - `data_risk_level` - HIGH|MODERATE|LOW - `resource_visibility`: PUBLIC|RESTRICTED - `status_code` - an RPC status code as defined in https://github.com/googleapis/googleapis/blob/master/google/rpc/code.proto * The operator must be `=` or `!=`. Examples: * `project_id = 12345 AND status_code = 1` * `project_id = 12345 AND sensitivity_level = HIGH` * `project_id = 12345 AND resource_visibility = PUBLIC` * `file_store_path = \"gs://mybucket\"` The length of this field should be no more than 500 characters.
pageSize <integer> Optional. Size of the page. This value can be limited by the server. If zero, server returns a page of max size 100."
  ([parent] (projects-locations-fileStoreDataProfiles-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/fileStoreDataProfiles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-fileStoreDataProfiles-delete
  "Delete a FileStoreDataProfile. Will not prevent the profile from being regenerated if the resource is still included in a discovery configuration.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/fileStoreDataProfiles/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-jobTriggers-list
  "Lists job triggers. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/jobTriggers/list

parent <> 

optional:
locationId <string> Deprecated. This field has no effect.
filter <string> Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * Supported fields/values for inspect triggers: - `status` - HEALTHY|PAUSED|CANCELLED - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY - 'last_run_time` - RFC 3339 formatted timestamp, surrounded by quotation marks. Nanoseconds are ignored. - 'error_count' - Number of errors that have occurred while running. * The operator must be `=` or `!=` for status and inspected_storage. Examples: * inspected_storage = cloud_storage AND status = HEALTHY * inspected_storage = cloud_storage OR inspected_storage = bigquery * inspected_storage = cloud_storage AND (state = PAUSED OR state = HEALTHY) * last_run_time > \\\"2017-12-12T00:00:00+00:00\\\" The length of this field should be no more than 500 characters.
type <string> The type of jobs. Will use `DlpJobType.INSPECT` if not set.
pageSize <integer> Size of the page. This value can be limited by a server.
orderBy <string> Comma-separated list of triggeredJob fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `create_time`: corresponds to the time the JobTrigger was created. - `update_time`: corresponds to the time the JobTrigger was last updated. - `last_run_time`: corresponds to the last time the JobTrigger ran. - `name`: corresponds to the JobTrigger's name. - `display_name`: corresponds to the JobTrigger's display name. - `status`: corresponds to JobTrigger's status."
  ([parent] (projects-locations-jobTriggers-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/jobTriggers",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-jobTriggers-patch
  "Updates a job trigger. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/jobTriggers/patch

name <> 
GooglePrivacyDlpV2UpdateJobTriggerRequest:
GooglePrivacyDlpV2UpdateJobTriggerRequest"
  [name GooglePrivacyDlpV2UpdateJobTriggerRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateJobTriggerRequest}))

(defn projects-locations-jobTriggers-hybridInspect
  "Inspect hybrid content and store findings to a trigger. The inspection will be processed asynchronously. To review the findings monitor the jobs within the trigger.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/jobTriggers/hybridInspect

name <> 
GooglePrivacyDlpV2HybridInspectJobTriggerRequest:
GooglePrivacyDlpV2HybridInspectJobTriggerRequest"
  [name GooglePrivacyDlpV2HybridInspectJobTriggerRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+name}:hybridInspect",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2HybridInspectJobTriggerRequest}))

(defn projects-locations-jobTriggers-get
  "Gets a job trigger. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/jobTriggers/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-jobTriggers-activate
  "Activate a job trigger. Causes the immediate execute of a trigger instead of waiting on the trigger event to occur.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/jobTriggers/activate

name <> 
GooglePrivacyDlpV2ActivateJobTriggerRequest:
GooglePrivacyDlpV2ActivateJobTriggerRequest"
  [name GooglePrivacyDlpV2ActivateJobTriggerRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://dlp.googleapis.com/v2/{+name}:activate",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2ActivateJobTriggerRequest}))

(defn projects-locations-jobTriggers-create
  "Creates a job trigger to run DLP actions such as scanning storage for sensitive information on a set schedule. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/jobTriggers/create

parent <> 
GooglePrivacyDlpV2CreateJobTriggerRequest:
GooglePrivacyDlpV2CreateJobTriggerRequest"
  [parent GooglePrivacyDlpV2CreateJobTriggerRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/jobTriggers",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateJobTriggerRequest}))

(defn projects-locations-jobTriggers-delete
  "Deletes a job trigger. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/jobTriggers/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-inspectTemplates-list
  "Lists InspectTemplates. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/inspectTemplates/list

parent <> 

optional:
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `create_time`: corresponds to the time the template was created. - `update_time`: corresponds to the time the template was last updated. - `name`: corresponds to the template's name. - `display_name`: corresponds to the template's display name.
pageSize <integer> Size of the page. This value can be limited by the server. If zero server returns a page of max size 100.
locationId <string> Deprecated. This field has no effect."
  ([parent] (projects-locations-inspectTemplates-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/inspectTemplates",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-inspectTemplates-create
  "Creates an InspectTemplate for reusing frequently used configuration for inspecting content, images, and storage. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/inspectTemplates/create

parent <> 
GooglePrivacyDlpV2CreateInspectTemplateRequest:
GooglePrivacyDlpV2CreateInspectTemplateRequest"
  [parent GooglePrivacyDlpV2CreateInspectTemplateRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/inspectTemplates",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateInspectTemplateRequest}))

(defn projects-locations-inspectTemplates-delete
  "Deletes an InspectTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/inspectTemplates/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-inspectTemplates-get
  "Gets an InspectTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/inspectTemplates/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-inspectTemplates-patch
  "Updates the InspectTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/inspectTemplates/patch

name <> 
GooglePrivacyDlpV2UpdateInspectTemplateRequest:
GooglePrivacyDlpV2UpdateInspectTemplateRequest"
  [name GooglePrivacyDlpV2UpdateInspectTemplateRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateInspectTemplateRequest}))

(defn projects-locations-discoveryConfigs-patch
  "Updates a discovery configuration.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/discoveryConfigs/patch

name <> 
GooglePrivacyDlpV2UpdateDiscoveryConfigRequest:
GooglePrivacyDlpV2UpdateDiscoveryConfigRequest"
  [name GooglePrivacyDlpV2UpdateDiscoveryConfigRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateDiscoveryConfigRequest}))

(defn projects-locations-discoveryConfigs-delete
  "Deletes a discovery configuration.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/discoveryConfigs/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-discoveryConfigs-list
  "Lists discovery configurations.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/discoveryConfigs/list

parent <> 

optional:
orderBy <string> Comma-separated list of config fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `last_run_time`: corresponds to the last time the DiscoveryConfig ran. - `name`: corresponds to the DiscoveryConfig's name. - `status`: corresponds to DiscoveryConfig's status.
pageSize <integer> Size of the page. This value can be limited by a server."
  ([parent] (projects-locations-discoveryConfigs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/discoveryConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-discoveryConfigs-create
  "Creates a config for discovery to scan and profile storage.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/discoveryConfigs/create

parent <> 
GooglePrivacyDlpV2CreateDiscoveryConfigRequest:
GooglePrivacyDlpV2CreateDiscoveryConfigRequest"
  [parent GooglePrivacyDlpV2CreateDiscoveryConfigRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/discoveryConfigs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateDiscoveryConfigRequest}))

(defn projects-locations-discoveryConfigs-get
  "Gets a discovery configuration.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/discoveryConfigs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-list
  "Lists Connections in a parent.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/connections/list

parent <> 

optional:
filter <string> Optional. Supported field/value: `state` - MISSING|AVAILABLE|ERROR
pageSize <integer> Optional. Number of results per page, max 1000."
  ([parent] (projects-locations-connections-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/connections",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-connections-delete
  "Delete a Connection.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/connections/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-get
  "Get a Connection by name.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/connections/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-create
  "Create a Connection to an external data source.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/connections/create

parent <> 
GooglePrivacyDlpV2CreateConnectionRequest:
GooglePrivacyDlpV2CreateConnectionRequest"
  [parent GooglePrivacyDlpV2CreateConnectionRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/connections",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateConnectionRequest}))

(defn projects-locations-connections-patch
  "Update a Connection.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/connections/patch

name <> 
GooglePrivacyDlpV2UpdateConnectionRequest:
GooglePrivacyDlpV2UpdateConnectionRequest"
  [name GooglePrivacyDlpV2UpdateConnectionRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateConnectionRequest}))

(defn projects-locations-connections-search
  "Searches for Connections in a parent.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/locations/connections/search

parent <> 

optional:
pageSize <integer> Optional. Number of results per page, max 1000.
filter <string> Optional. Supported field/value: - `state` - MISSING|AVAILABLE|ERROR"
  ([parent] (projects-locations-connections-search parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/connections:search",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-dlpJobs-list
  "Lists DlpJobs that match the specified filter in the request. See https://cloud.google.com/sensitive-data-protection/docs/inspecting-storage and https://cloud.google.com/sensitive-data-protection/docs/compute-risk-analysis to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/dlpJobs/list

parent <> 

optional:
locationId <string> Deprecated. This field has no effect.
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc, end_time asc, create_time desc` Supported fields are: - `create_time`: corresponds to the time the job was created. - `end_time`: corresponds to the time the job ended. - `name`: corresponds to the job's name. - `state`: corresponds to `state`
filter <string> Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * Supported fields/values for inspect jobs: - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY - `trigger_name` - The name of the trigger that created the job. - 'end_time` - Corresponds to the time the job finished. - 'start_time` - Corresponds to the time the job finished. * Supported fields for risk analysis jobs: - `state` - RUNNING|CANCELED|FINISHED|FAILED - 'end_time` - Corresponds to the time the job finished. - 'start_time` - Corresponds to the time the job finished. * The operator must be `=` or `!=`. Examples: * inspected_storage = cloud_storage AND state = done * inspected_storage = cloud_storage OR inspected_storage = bigquery * inspected_storage = cloud_storage AND (state = done OR state = canceled) * end_time > \\\"2017-12-12T00:00:00+00:00\\\" The length of this field should be no more than 500 characters.
type <string> The type of job. Defaults to `DlpJobType.INSPECT`
pageSize <integer> The standard list page size."
  ([parent] (projects-dlpJobs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template "https://dlp.googleapis.com/v2/{+parent}/dlpJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-dlpJobs-create
  "Creates a new job to inspect storage or calculate risk metrics. See https://cloud.google.com/sensitive-data-protection/docs/inspecting-storage and https://cloud.google.com/sensitive-data-protection/docs/compute-risk-analysis to learn more. When no InfoTypes or CustomInfoTypes are specified in inspect jobs, the system will automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/dlpJobs/create

parent <> 
GooglePrivacyDlpV2CreateDlpJobRequest:
GooglePrivacyDlpV2CreateDlpJobRequest"
  [parent GooglePrivacyDlpV2CreateDlpJobRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://dlp.googleapis.com/v2/{+parent}/dlpJobs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateDlpJobRequest}))

(defn projects-dlpJobs-delete
  "Deletes a long-running DlpJob. This method indicates that the client is no longer interested in the DlpJob result. The job will be canceled if possible. See https://cloud.google.com/sensitive-data-protection/docs/inspecting-storage and https://cloud.google.com/sensitive-data-protection/docs/compute-risk-analysis to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/dlpJobs/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-dlpJobs-cancel
  "Starts asynchronous cancellation on a long-running DlpJob. The server makes a best effort to cancel the DlpJob, but success is not guaranteed. See https://cloud.google.com/sensitive-data-protection/docs/inspecting-storage and https://cloud.google.com/sensitive-data-protection/docs/compute-risk-analysis to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/dlpJobs/cancel

name <> 
GooglePrivacyDlpV2CancelDlpJobRequest:
GooglePrivacyDlpV2CancelDlpJobRequest"
  [name GooglePrivacyDlpV2CancelDlpJobRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://dlp.googleapis.com/v2/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CancelDlpJobRequest}))

(defn projects-dlpJobs-get
  "Gets the latest state of a long-running DlpJob. See https://cloud.google.com/sensitive-data-protection/docs/inspecting-storage and https://cloud.google.com/sensitive-data-protection/docs/compute-risk-analysis to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/dlpJobs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-deidentifyTemplates-patch
  "Updates the DeidentifyTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/deidentifyTemplates/patch

name <> 
GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest:
GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest"
  [name GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest}))

(defn projects-deidentifyTemplates-create
  "Creates a DeidentifyTemplate for reusing frequently used configuration for de-identifying content, images, and storage. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/deidentifyTemplates/create

parent <> 
GooglePrivacyDlpV2CreateDeidentifyTemplateRequest:
GooglePrivacyDlpV2CreateDeidentifyTemplateRequest"
  [parent GooglePrivacyDlpV2CreateDeidentifyTemplateRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/deidentifyTemplates",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateDeidentifyTemplateRequest}))

(defn projects-deidentifyTemplates-delete
  "Deletes a DeidentifyTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/deidentifyTemplates/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-deidentifyTemplates-get
  "Gets a DeidentifyTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/deidentifyTemplates/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-deidentifyTemplates-list
  "Lists DeidentifyTemplates. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/projects/deidentifyTemplates/list

parent <> 

optional:
locationId <string> Deprecated. This field has no effect.
pageSize <integer> Size of the page. This value can be limited by the server. If zero server returns a page of max size 100.
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `create_time`: corresponds to the time the template was created. - `update_time`: corresponds to the time the template was last updated. - `name`: corresponds to the template's name. - `display_name`: corresponds to the template's display name."
  ([parent] (projects-deidentifyTemplates-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/deidentifyTemplates",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-tableDataProfiles-get
  "Gets a table data profile.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/tableDataProfiles/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-tableDataProfiles-list
  "Lists table data profiles for an organization.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/tableDataProfiles/list

parent <> 

optional:
filter <string> Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * Supported fields/values: - `project_id` - The Google Cloud project ID. - `dataset_id` - The BigQuery dataset ID. - `table_id` - The ID of the BigQuery table. - `sensitivity_level` - HIGH|MODERATE|LOW - `data_risk_level` - HIGH|MODERATE|LOW - `resource_visibility`: PUBLIC|RESTRICTED - `status_code` - an RPC status code as defined in https://github.com/googleapis/googleapis/blob/master/google/rpc/code.proto * The operator must be `=` or `!=`. Examples: * `project_id = 12345 AND status_code = 1` * `project_id = 12345 AND sensitivity_level = HIGH` * `project_id = 12345 AND resource_visibility = PUBLIC` The length of this field should be no more than 500 characters.
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Only one order field at a time is allowed. Examples: * `project_id asc` * `table_id` * `sensitivity_level desc` Supported fields are: - `project_id`: The Google Cloud project ID. - `dataset_id`: The ID of a BigQuery dataset. - `table_id`: The ID of a BigQuery table. - `sensitivity_level`: How sensitive the data in a table is, at most. - `data_risk_level`: How much risk is associated with this data. - `profile_last_generated`: When the profile was last updated in epoch seconds. - `last_modified`: The last time the resource was modified. - `resource_visibility`: Visibility restriction for this resource. - `row_count`: Number of rows in this resource.
pageSize <integer> Size of the page. This value can be limited by the server. If zero, server returns a page of max size 100."
  ([parent]
    (organizations-locations-tableDataProfiles-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/tableDataProfiles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-tableDataProfiles-delete
  "Delete a TableDataProfile. Will not prevent the profile from being regenerated if the table is still included in a discovery configuration.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/tableDataProfiles/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-storedInfoTypes-delete
  "Deletes a stored infoType. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/storedInfoTypes/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-storedInfoTypes-create
  "Creates a pre-built stored infoType to be used for inspection. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/storedInfoTypes/create

parent <> 
GooglePrivacyDlpV2CreateStoredInfoTypeRequest:
GooglePrivacyDlpV2CreateStoredInfoTypeRequest"
  [parent GooglePrivacyDlpV2CreateStoredInfoTypeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/storedInfoTypes",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateStoredInfoTypeRequest}))

(defn organizations-locations-storedInfoTypes-get
  "Gets a stored infoType. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/storedInfoTypes/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-storedInfoTypes-patch
  "Updates the stored infoType by creating a new version. The existing version will continue to be used until the new version is ready. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/storedInfoTypes/patch

name <> 
GooglePrivacyDlpV2UpdateStoredInfoTypeRequest:
GooglePrivacyDlpV2UpdateStoredInfoTypeRequest"
  [name GooglePrivacyDlpV2UpdateStoredInfoTypeRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateStoredInfoTypeRequest}))

(defn organizations-locations-storedInfoTypes-list
  "Lists stored infoTypes. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/storedInfoTypes/list

parent <> 

optional:
locationId <string> Deprecated. This field has no effect.
pageSize <integer> Size of the page. This value can be limited by the server. If zero server returns a page of max size 100.
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc, display_name, create_time desc` Supported fields are: - `create_time`: corresponds to the time the most recent version of the resource was created. - `state`: corresponds to the state of the resource. - `name`: corresponds to resource name. - `display_name`: corresponds to info type's display name."
  ([parent] (organizations-locations-storedInfoTypes-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/storedInfoTypes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-projectDataProfiles-list
  "Lists project data profiles for an organization.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/projectDataProfiles/list

parent <> 

optional:
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Only one order field at a time is allowed. Examples: * `project_id` * `sensitivity_level desc` Supported fields are: - `project_id`: Google Cloud project ID - `sensitivity_level`: How sensitive the data in a project is, at most. - `data_risk_level`: How much risk is associated with this data. - `profile_last_generated`: When the profile was last updated in epoch seconds.
pageSize <integer> Size of the page. This value can be limited by the server. If zero, server returns a page of max size 100.
filter <string> Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * Supported fields/values: - `sensitivity_level` - HIGH|MODERATE|LOW - `data_risk_level` - HIGH|MODERATE|LOW - `status_code` - an RPC status code as defined in https://github.com/googleapis/googleapis/blob/master/google/rpc/code.proto * The operator must be `=` or `!=`. Examples: * `project_id = 12345 AND status_code = 1` * `project_id = 12345 AND sensitivity_level = HIGH` The length of this field should be no more than 500 characters."
  ([parent]
    (organizations-locations-projectDataProfiles-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/projectDataProfiles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-projectDataProfiles-get
  "Gets a project data profile.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/projectDataProfiles/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-deidentifyTemplates-get
  "Gets a DeidentifyTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/deidentifyTemplates/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-deidentifyTemplates-list
  "Lists DeidentifyTemplates. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/deidentifyTemplates/list

parent <> 

optional:
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `create_time`: corresponds to the time the template was created. - `update_time`: corresponds to the time the template was last updated. - `name`: corresponds to the template's name. - `display_name`: corresponds to the template's display name.
locationId <string> Deprecated. This field has no effect.
pageSize <integer> Size of the page. This value can be limited by the server. If zero server returns a page of max size 100."
  ([parent]
    (organizations-locations-deidentifyTemplates-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/deidentifyTemplates",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-deidentifyTemplates-patch
  "Updates the DeidentifyTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/deidentifyTemplates/patch

name <> 
GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest:
GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest"
  [name GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest}))

(defn organizations-locations-deidentifyTemplates-create
  "Creates a DeidentifyTemplate for reusing frequently used configuration for de-identifying content, images, and storage. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/deidentifyTemplates/create

parent <> 
GooglePrivacyDlpV2CreateDeidentifyTemplateRequest:
GooglePrivacyDlpV2CreateDeidentifyTemplateRequest"
  [parent GooglePrivacyDlpV2CreateDeidentifyTemplateRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/deidentifyTemplates",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateDeidentifyTemplateRequest}))

(defn organizations-locations-deidentifyTemplates-delete
  "Deletes a DeidentifyTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/deidentifyTemplates/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-dlpJobs-list
  "Lists DlpJobs that match the specified filter in the request. See https://cloud.google.com/sensitive-data-protection/docs/inspecting-storage and https://cloud.google.com/sensitive-data-protection/docs/compute-risk-analysis to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/dlpJobs/list

parent <> 

optional:
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc, end_time asc, create_time desc` Supported fields are: - `create_time`: corresponds to the time the job was created. - `end_time`: corresponds to the time the job ended. - `name`: corresponds to the job's name. - `state`: corresponds to `state`
type <string> The type of job. Defaults to `DlpJobType.INSPECT`
filter <string> Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * Supported fields/values for inspect jobs: - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY - `trigger_name` - The name of the trigger that created the job. - 'end_time` - Corresponds to the time the job finished. - 'start_time` - Corresponds to the time the job finished. * Supported fields for risk analysis jobs: - `state` - RUNNING|CANCELED|FINISHED|FAILED - 'end_time` - Corresponds to the time the job finished. - 'start_time` - Corresponds to the time the job finished. * The operator must be `=` or `!=`. Examples: * inspected_storage = cloud_storage AND state = done * inspected_storage = cloud_storage OR inspected_storage = bigquery * inspected_storage = cloud_storage AND (state = done OR state = canceled) * end_time > \\\"2017-12-12T00:00:00+00:00\\\" The length of this field should be no more than 500 characters.
pageSize <integer> The standard list page size.
locationId <string> Deprecated. This field has no effect."
  ([parent] (organizations-locations-dlpJobs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template "https://dlp.googleapis.com/v2/{+parent}/dlpJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-columnDataProfiles-get
  "Gets a column data profile.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/columnDataProfiles/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-columnDataProfiles-list
  "Lists column data profiles for an organization.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/columnDataProfiles/list

parent <> 

optional:
filter <string> Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * Supported fields/values: - `table_data_profile_name` - The name of the related table data profile. - `project_id` - The Google Cloud project ID. (REQUIRED) - `dataset_id` - The BigQuery dataset ID. (REQUIRED) - `table_id` - The BigQuery table ID. (REQUIRED) - `field_id` - The ID of the BigQuery field. - `info_type` - The infotype detected in the resource. - `sensitivity_level` - HIGH|MEDIUM|LOW - `data_risk_level`: How much risk is associated with this data. - `status_code` - an RPC status code as defined in https://github.com/googleapis/googleapis/blob/master/google/rpc/code.proto * The operator must be `=` for project_id, dataset_id, and table_id. Other filters also support `!=`. Examples: * project_id = 12345 AND status_code = 1 * project_id = 12345 AND sensitivity_level = HIGH * project_id = 12345 AND info_type = STREET_ADDRESS The length of this field should be no more than 500 characters.
pageSize <integer> Size of the page. This value can be limited by the server. If zero, server returns a page of max size 100.
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Only one order field at a time is allowed. Examples: * `project_id asc` * `table_id` * `sensitivity_level desc` Supported fields are: - `project_id`: The Google Cloud project ID. - `dataset_id`: The ID of a BigQuery dataset. - `table_id`: The ID of a BigQuery table. - `sensitivity_level`: How sensitive the data in a column is, at most. - `data_risk_level`: How much risk is associated with this data. - `profile_last_generated`: When the profile was last updated in epoch seconds."
  ([parent]
    (organizations-locations-columnDataProfiles-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/columnDataProfiles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-fileStoreDataProfiles-get
  "Gets a file store data profile.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/fileStoreDataProfiles/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-fileStoreDataProfiles-delete
  "Delete a FileStoreDataProfile. Will not prevent the profile from being regenerated if the resource is still included in a discovery configuration.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/fileStoreDataProfiles/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-fileStoreDataProfiles-list
  "Lists file store data profiles for an organization.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/fileStoreDataProfiles/list

parent <> 

optional:
filter <string> Optional. Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * Supported fields/values: - `project_id` - The Google Cloud project ID. - `file_store_path` - The path like \"gs://bucket\". - `sensitivity_level` - HIGH|MODERATE|LOW - `data_risk_level` - HIGH|MODERATE|LOW - `resource_visibility`: PUBLIC|RESTRICTED - `status_code` - an RPC status code as defined in https://github.com/googleapis/googleapis/blob/master/google/rpc/code.proto * The operator must be `=` or `!=`. Examples: * `project_id = 12345 AND status_code = 1` * `project_id = 12345 AND sensitivity_level = HIGH` * `project_id = 12345 AND resource_visibility = PUBLIC` * `file_store_path = \"gs://mybucket\"` The length of this field should be no more than 500 characters.
pageSize <integer> Optional. Size of the page. This value can be limited by the server. If zero, server returns a page of max size 100.
orderBy <string> Optional. Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Only one order field at a time is allowed. Examples: * `project_id asc` * `name` * `sensitivity_level desc` Supported fields are: - `project_id`: The Google Cloud project ID. - `sensitivity_level`: How sensitive the data in a table is, at most. - `data_risk_level`: How much risk is associated with this data. - `profile_last_generated`: When the profile was last updated in epoch seconds. - `last_modified`: The last time the resource was modified. - `resource_visibility`: Visibility restriction for this resource. - `name`: The name of the profile. - `create_time`: The time the file store was first created."
  ([parent]
    (organizations-locations-fileStoreDataProfiles-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/fileStoreDataProfiles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-jobTriggers-get
  "Gets a job trigger. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/jobTriggers/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-jobTriggers-patch
  "Updates a job trigger. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/jobTriggers/patch

name <> 
GooglePrivacyDlpV2UpdateJobTriggerRequest:
GooglePrivacyDlpV2UpdateJobTriggerRequest"
  [name GooglePrivacyDlpV2UpdateJobTriggerRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateJobTriggerRequest}))

(defn organizations-locations-jobTriggers-delete
  "Deletes a job trigger. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/jobTriggers/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-jobTriggers-list
  "Lists job triggers. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/jobTriggers/list

parent <> 

optional:
pageSize <integer> Size of the page. This value can be limited by a server.
locationId <string> Deprecated. This field has no effect.
orderBy <string> Comma-separated list of triggeredJob fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `create_time`: corresponds to the time the JobTrigger was created. - `update_time`: corresponds to the time the JobTrigger was last updated. - `last_run_time`: corresponds to the last time the JobTrigger ran. - `name`: corresponds to the JobTrigger's name. - `display_name`: corresponds to the JobTrigger's display name. - `status`: corresponds to JobTrigger's status.
filter <string> Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * Supported fields/values for inspect triggers: - `status` - HEALTHY|PAUSED|CANCELLED - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY - 'last_run_time` - RFC 3339 formatted timestamp, surrounded by quotation marks. Nanoseconds are ignored. - 'error_count' - Number of errors that have occurred while running. * The operator must be `=` or `!=` for status and inspected_storage. Examples: * inspected_storage = cloud_storage AND status = HEALTHY * inspected_storage = cloud_storage OR inspected_storage = bigquery * inspected_storage = cloud_storage AND (state = PAUSED OR state = HEALTHY) * last_run_time > \\\"2017-12-12T00:00:00+00:00\\\" The length of this field should be no more than 500 characters.
type <string> The type of jobs. Will use `DlpJobType.INSPECT` if not set."
  ([parent] (organizations-locations-jobTriggers-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/jobTriggers",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-jobTriggers-create
  "Creates a job trigger to run DLP actions such as scanning storage for sensitive information on a set schedule. See https://cloud.google.com/sensitive-data-protection/docs/creating-job-triggers to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/jobTriggers/create

parent <> 
GooglePrivacyDlpV2CreateJobTriggerRequest:
GooglePrivacyDlpV2CreateJobTriggerRequest"
  [parent GooglePrivacyDlpV2CreateJobTriggerRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/jobTriggers",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateJobTriggerRequest}))

(defn organizations-locations-inspectTemplates-delete
  "Deletes an InspectTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/inspectTemplates/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-inspectTemplates-list
  "Lists InspectTemplates. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/inspectTemplates/list

parent <> 

optional:
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `create_time`: corresponds to the time the template was created. - `update_time`: corresponds to the time the template was last updated. - `name`: corresponds to the template's name. - `display_name`: corresponds to the template's display name.
pageSize <integer> Size of the page. This value can be limited by the server. If zero server returns a page of max size 100.
locationId <string> Deprecated. This field has no effect."
  ([parent] (organizations-locations-inspectTemplates-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/inspectTemplates",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-inspectTemplates-create
  "Creates an InspectTemplate for reusing frequently used configuration for inspecting content, images, and storage. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/inspectTemplates/create

parent <> 
GooglePrivacyDlpV2CreateInspectTemplateRequest:
GooglePrivacyDlpV2CreateInspectTemplateRequest"
  [parent GooglePrivacyDlpV2CreateInspectTemplateRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/inspectTemplates",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateInspectTemplateRequest}))

(defn organizations-locations-inspectTemplates-patch
  "Updates the InspectTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/inspectTemplates/patch

name <> 
GooglePrivacyDlpV2UpdateInspectTemplateRequest:
GooglePrivacyDlpV2UpdateInspectTemplateRequest"
  [name GooglePrivacyDlpV2UpdateInspectTemplateRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateInspectTemplateRequest}))

(defn organizations-locations-inspectTemplates-get
  "Gets an InspectTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/inspectTemplates/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-discoveryConfigs-get
  "Gets a discovery configuration.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/discoveryConfigs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-discoveryConfigs-create
  "Creates a config for discovery to scan and profile storage.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/discoveryConfigs/create

parent <> 
GooglePrivacyDlpV2CreateDiscoveryConfigRequest:
GooglePrivacyDlpV2CreateDiscoveryConfigRequest"
  [parent GooglePrivacyDlpV2CreateDiscoveryConfigRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/discoveryConfigs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateDiscoveryConfigRequest}))

(defn organizations-locations-discoveryConfigs-delete
  "Deletes a discovery configuration.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/discoveryConfigs/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-discoveryConfigs-list
  "Lists discovery configurations.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/discoveryConfigs/list

parent <> 

optional:
orderBy <string> Comma-separated list of config fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `last_run_time`: corresponds to the last time the DiscoveryConfig ran. - `name`: corresponds to the DiscoveryConfig's name. - `status`: corresponds to DiscoveryConfig's status.
pageSize <integer> Size of the page. This value can be limited by a server."
  ([parent] (organizations-locations-discoveryConfigs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/discoveryConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-discoveryConfigs-patch
  "Updates a discovery configuration.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/discoveryConfigs/patch

name <> 
GooglePrivacyDlpV2UpdateDiscoveryConfigRequest:
GooglePrivacyDlpV2UpdateDiscoveryConfigRequest"
  [name GooglePrivacyDlpV2UpdateDiscoveryConfigRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateDiscoveryConfigRequest}))

(defn organizations-locations-connections-create
  "Create a Connection to an external data source.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/connections/create

parent <> 
GooglePrivacyDlpV2CreateConnectionRequest:
GooglePrivacyDlpV2CreateConnectionRequest"
  [parent GooglePrivacyDlpV2CreateConnectionRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/connections",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateConnectionRequest}))

(defn organizations-locations-connections-patch
  "Update a Connection.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/connections/patch

name <> 
GooglePrivacyDlpV2UpdateConnectionRequest:
GooglePrivacyDlpV2UpdateConnectionRequest"
  [name GooglePrivacyDlpV2UpdateConnectionRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateConnectionRequest}))

(defn organizations-locations-connections-delete
  "Delete a Connection.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/connections/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-connections-search
  "Searches for Connections in a parent.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/connections/search

parent <> 

optional:
filter <string> Optional. Supported field/value: - `state` - MISSING|AVAILABLE|ERROR
pageSize <integer> Optional. Number of results per page, max 1000."
  ([parent] (organizations-locations-connections-search parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/connections:search",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-connections-get
  "Get a Connection by name.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/locations/connections/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-inspectTemplates-patch
  "Updates the InspectTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/inspectTemplates/patch

name <> 
GooglePrivacyDlpV2UpdateInspectTemplateRequest:
GooglePrivacyDlpV2UpdateInspectTemplateRequest"
  [name GooglePrivacyDlpV2UpdateInspectTemplateRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateInspectTemplateRequest}))

(defn organizations-inspectTemplates-create
  "Creates an InspectTemplate for reusing frequently used configuration for inspecting content, images, and storage. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/inspectTemplates/create

parent <> 
GooglePrivacyDlpV2CreateInspectTemplateRequest:
GooglePrivacyDlpV2CreateInspectTemplateRequest"
  [parent GooglePrivacyDlpV2CreateInspectTemplateRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/inspectTemplates",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateInspectTemplateRequest}))

(defn organizations-inspectTemplates-get
  "Gets an InspectTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/inspectTemplates/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-inspectTemplates-list
  "Lists InspectTemplates. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/inspectTemplates/list

parent <> 

optional:
pageSize <integer> Size of the page. This value can be limited by the server. If zero server returns a page of max size 100.
locationId <string> Deprecated. This field has no effect.
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `create_time`: corresponds to the time the template was created. - `update_time`: corresponds to the time the template was last updated. - `name`: corresponds to the template's name. - `display_name`: corresponds to the template's display name."
  ([parent] (organizations-inspectTemplates-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/inspectTemplates",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-inspectTemplates-delete
  "Deletes an InspectTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/inspectTemplates/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-storedInfoTypes-create
  "Creates a pre-built stored infoType to be used for inspection. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/storedInfoTypes/create

parent <> 
GooglePrivacyDlpV2CreateStoredInfoTypeRequest:
GooglePrivacyDlpV2CreateStoredInfoTypeRequest"
  [parent GooglePrivacyDlpV2CreateStoredInfoTypeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/storedInfoTypes",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateStoredInfoTypeRequest}))

(defn organizations-storedInfoTypes-patch
  "Updates the stored infoType by creating a new version. The existing version will continue to be used until the new version is ready. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/storedInfoTypes/patch

name <> 
GooglePrivacyDlpV2UpdateStoredInfoTypeRequest:
GooglePrivacyDlpV2UpdateStoredInfoTypeRequest"
  [name GooglePrivacyDlpV2UpdateStoredInfoTypeRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateStoredInfoTypeRequest}))

(defn organizations-storedInfoTypes-delete
  "Deletes a stored infoType. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/storedInfoTypes/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-storedInfoTypes-get
  "Gets a stored infoType. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/storedInfoTypes/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-storedInfoTypes-list
  "Lists stored infoTypes. See https://cloud.google.com/sensitive-data-protection/docs/creating-stored-infotypes to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/storedInfoTypes/list

parent <> 

optional:
pageSize <integer> Size of the page. This value can be limited by the server. If zero server returns a page of max size 100.
locationId <string> Deprecated. This field has no effect.
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc, display_name, create_time desc` Supported fields are: - `create_time`: corresponds to the time the most recent version of the resource was created. - `state`: corresponds to the state of the resource. - `name`: corresponds to resource name. - `display_name`: corresponds to info type's display name."
  ([parent] (organizations-storedInfoTypes-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/storedInfoTypes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-deidentifyTemplates-delete
  "Deletes a DeidentifyTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/deidentifyTemplates/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-deidentifyTemplates-get
  "Gets a DeidentifyTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/deidentifyTemplates/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-deidentifyTemplates-list
  "Lists DeidentifyTemplates. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/deidentifyTemplates/list

parent <> 

optional:
locationId <string> Deprecated. This field has no effect.
pageSize <integer> Size of the page. This value can be limited by the server. If zero server returns a page of max size 100.
orderBy <string> Comma-separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case insensitive. The default sorting order is ascending. Redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `create_time`: corresponds to the time the template was created. - `update_time`: corresponds to the time the template was last updated. - `name`: corresponds to the template's name. - `display_name`: corresponds to the template's display name."
  ([parent] (organizations-deidentifyTemplates-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dlp.googleapis.com/v2/{+parent}/deidentifyTemplates",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-deidentifyTemplates-create
  "Creates a DeidentifyTemplate for reusing frequently used configuration for de-identifying content, images, and storage. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/deidentifyTemplates/create

parent <> 
GooglePrivacyDlpV2CreateDeidentifyTemplateRequest:
GooglePrivacyDlpV2CreateDeidentifyTemplateRequest"
  [parent GooglePrivacyDlpV2CreateDeidentifyTemplateRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dlp.googleapis.com/v2/{+parent}/deidentifyTemplates",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2CreateDeidentifyTemplateRequest}))

(defn organizations-deidentifyTemplates-patch
  "Updates the DeidentifyTemplate. See https://cloud.google.com/sensitive-data-protection/docs/creating-templates-deid to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/organizations/deidentifyTemplates/patch

name <> 
GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest:
GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest"
  [name GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest]
  (client/api-request
    {:method :patch,
     :uri-template "https://dlp.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest}))

(defn infoTypes-list
  "Returns a list of the sensitive information types that DLP API supports. See https://cloud.google.com/sensitive-data-protection/docs/infotypes-reference to learn more.
https://cloud.google.com/sensitive-data-protection/docs/v2/reference/rest/v2/infoTypes/list

optional:
locationId <string> Deprecated. This field has no effect.
parent <string> The parent resource name. The format of this value is as follows: locations/ LOCATION_ID
filter <string> filter to only return infoTypes supported by certain parts of the API. Defaults to supported_by=INSPECT.
languageCode <string> BCP-47 language code for localized infoType friendly names. If omitted, or if localized strings are not available, en-US strings will be returned."
  ([] (infoTypes-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template "https://dlp.googleapis.com/v2/infoTypes",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
