(ns happyapi.google.securitycenter-v1
  "Security Command Center API
Security Command Center API provides access to temporal views of assets and findings within an organization.
See: https://cloud.google.com/security/products/security-command-center"
  (:require [happyapi.providers.google :as client]))

(defn folders-sources-list
  "Lists all sources belonging to an organization.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/sources/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent] (folders-sources-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/sources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-sources-findings-group
  "Filters an organization or source's findings and groups them by their specified properties. To group across all sources provide a `-` as the source id. Example: /v1/organizations/{organization_id}/sources/-/findings, /v1/folders/{folder_id}/sources/-/findings, /v1/projects/{project_id}/sources/-/findings
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/sources/findings/group

parent <> 
GroupFindingsRequest:
GroupFindingsRequest"
  [parent GroupFindingsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/findings:group",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GroupFindingsRequest}))

(defn folders-sources-findings-list
  "Lists an organization or source's findings. To list across all sources provide a `-` as the source id. Example: /v1/organizations/{organization_id}/sources/-/findings
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/sources/findings/list

parent <> 

optional:
filter <string> Expression that defines the filter to apply across findings. The expression is a list of one or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. Examples include: * name * source_properties.a_property * security_marks.marks.marka The supported operators are: * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes. The following field and operator combinations are supported: * name: `=` * parent: `=`, `:` * resource_name: `=`, `:` * state: `=`, `:` * category: `=`, `:` * external_uri: `=`, `:` * event_time: `=`, `>`, `<`, `>=`, `<=` Usage: This should be milliseconds since epoch or an RFC3339 string. Examples: `event_time = \"2019-06-10T16:07:18-07:00\"` `event_time = 1560208038000` * severity: `=`, `:` * workflow_state: `=`, `:` * security_marks.marks: `=`, `:` * source_properties: `=`, `:`, `>`, `<`, `>=`, `<=` For example, `source_properties.size = 100` is a valid filter string. Use a partial match on the empty string to filter based on a property existing: `source_properties.my_property : \"\"` Use a negated partial match on the empty string to filter based on a property not existing: `-source_properties.my_property : \"\"` * resource: * resource.name: `=`, `:` * resource.parent_name: `=`, `:` * resource.parent_display_name: `=`, `:` * resource.project_name: `=`, `:` * resource.project_display_name: `=`, `:` * resource.type: `=`, `:` * resource.folders.resource_folder: `=`, `:` * resource.display_name: `=`, `:`
orderBy <string> Expression that defines what fields and order to use for sorting. The string value should follow SQL syntax: comma separated list of fields. For example: \"name,resource_properties.a_property\". The default sorting order is ascending. To specify descending order for a field, a suffix \" desc\" should be appended to the field name. For example: \"name desc,source_properties.a_property\". Redundant space characters in the syntax are insignificant. \"name desc,source_properties.a_property\" and \" name desc , source_properties.a_property \" are equivalent. The following fields are supported: name parent state category resource_name event_time source_properties security_marks.marks
readTime <string> Time used as a reference point when filtering findings. The filter is limited to findings existing at the supplied time and their values are those at that specific time. Absence of this field will default to the API's version of NOW.
compareDuration <string> When compare_duration is set, the ListFindingsResult's \"state_change\" attribute is updated to indicate whether the finding had its state changed, the finding's state remained unchanged, or if the finding was added in any state during the compare_duration period of time that precedes the read_time. This is the time between (read_time - compare_duration) and read_time. The state_change value is derived based on the presence and state of the finding at the two points in time. Intermediate state changes between the two times don't affect the result. For example, the results aren't affected if the finding is made inactive and then active again. Possible \"state_change\" values when compare_duration is specified: * \"CHANGED\": indicates that the finding was present and matched the given filter at the start of compare_duration, but changed its state at read_time. * \"UNCHANGED\": indicates that the finding was present and matched the given filter at the start of compare_duration and did not change state at read_time. * \"ADDED\": indicates that the finding did not match the given filter or was not present at the start of compare_duration, but was present at read_time. * \"REMOVED\": indicates that the finding was present and matched the filter at the start of compare_duration, but did not match the filter at read_time. If compare_duration is not specified, then the only possible state_change is \"UNUSED\", which will be the state_change set for all findings present at read_time.
fieldMask <string> A field mask to specify the Finding fields to be listed in the response. An empty field mask will list all fields.
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent] (folders-sources-findings-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/findings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-sources-findings-setState
  "Updates the state of a finding.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/sources/findings/setState

name <> 
SetFindingStateRequest:
SetFindingStateRequest"
  [name SetFindingStateRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+name}:setState",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetFindingStateRequest}))

(defn folders-sources-findings-setMute
  "Updates the mute state of a finding.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/sources/findings/setMute

name <> 
SetMuteRequest:
SetMuteRequest"
  [name SetMuteRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+name}:setMute",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetMuteRequest}))

(defn folders-sources-findings-patch
  "Creates or updates a finding. The corresponding source must exist for a finding creation to succeed.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/sources/findings/patch

name <> 
Finding:
Finding

optional:
updateMask <string> The FieldMask to use when updating the finding resource. This field should not be specified when creating a finding. When updating a finding, an empty mask is treated as updating all mutable fields and replacing source_properties. Individual source_properties can be added/updated by using \"source_properties.\" in the field mask."
  ([name Finding] (folders-sources-findings-patch name Finding nil))
  ([name Finding optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Finding})))

(defn folders-sources-findings-updateSecurityMarks
  "Updates security marks.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/sources/findings/updateSecurityMarks

name <> 
SecurityMarks:
SecurityMarks

optional:
updateMask <string> The FieldMask to use when updating the security marks resource. The field mask must not contain duplicate fields. If empty or set to \"marks\", all marks will be replaced. Individual marks can be updated using \"marks.\".
startTime <string> The time at which the updated SecurityMarks take effect. If not set uses current server time. Updates will be applied to the SecurityMarks that are active immediately preceding this time. Must be earlier or equal to the server time."
  ([name SecurityMarks]
    (folders-sources-findings-updateSecurityMarks
      name
      SecurityMarks
      nil))
  ([name SecurityMarks optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body SecurityMarks})))

(defn folders-sources-findings-externalSystems-patch
  "Updates external system. This is for a given finding.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/sources/findings/externalSystems/patch

name <> 
GoogleCloudSecuritycenterV1ExternalSystem:
GoogleCloudSecuritycenterV1ExternalSystem

optional:
updateMask <string> The FieldMask to use when updating the external system resource. If empty all mutable fields will be updated."
  ([name GoogleCloudSecuritycenterV1ExternalSystem]
    (folders-sources-findings-externalSystems-patch
      name
      GoogleCloudSecuritycenterV1ExternalSystem
      nil))
  ([name GoogleCloudSecuritycenterV1ExternalSystem optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1ExternalSystem})))

(defn folders-muteConfigs-create
  "Creates a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/muteConfigs/create

parent <> 
GoogleCloudSecuritycenterV1MuteConfig:
GoogleCloudSecuritycenterV1MuteConfig

optional:
muteConfigId <string> Required. Unique identifier provided by the client within the parent scope. It must consist of only lowercase letters, numbers, and hyphens, must start with a letter, must end with either a letter or a number, and must be 63 characters or less."
  ([parent GoogleCloudSecuritycenterV1MuteConfig]
    (folders-muteConfigs-create
      parent
      GoogleCloudSecuritycenterV1MuteConfig
      nil))
  ([parent GoogleCloudSecuritycenterV1MuteConfig optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/muteConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1MuteConfig})))

(defn folders-muteConfigs-delete
  "Deletes an existing mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/muteConfigs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-muteConfigs-get
  "Gets a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/muteConfigs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-muteConfigs-list
  "Lists mute configs.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/muteConfigs/list

parent <> 

optional:
pageSize <integer> The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (folders-muteConfigs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/muteConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-muteConfigs-patch
  "Updates a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/muteConfigs/patch

name <> 
GoogleCloudSecuritycenterV1MuteConfig:
GoogleCloudSecuritycenterV1MuteConfig

optional:
updateMask <string> The list of fields to be updated. If empty all mutable fields will be updated."
  ([name GoogleCloudSecuritycenterV1MuteConfig]
    (folders-muteConfigs-patch
      name
      GoogleCloudSecuritycenterV1MuteConfig
      nil))
  ([name GoogleCloudSecuritycenterV1MuteConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1MuteConfig})))

(defn folders-notificationConfigs-create
  "Creates a notification config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/notificationConfigs/create

parent <> 
NotificationConfig:
NotificationConfig

optional:
configId <string> Required. Unique identifier provided by the client within the parent scope. It must be between 1 and 128 characters and contain alphanumeric characters, underscores, or hyphens only."
  ([parent NotificationConfig]
    (folders-notificationConfigs-create parent NotificationConfig nil))
  ([parent NotificationConfig optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/notificationConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body NotificationConfig})))

(defn folders-notificationConfigs-delete
  "Deletes a notification config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/notificationConfigs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-notificationConfigs-get
  "Gets a notification config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/notificationConfigs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-notificationConfigs-list
  "Lists notification configs.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/notificationConfigs/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent] (folders-notificationConfigs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/notificationConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-notificationConfigs-patch
  " Updates a notification config. The following update fields are allowed: description, pubsub_topic, streaming_config.filter
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/notificationConfigs/patch

name <> 
NotificationConfig:
NotificationConfig

optional:
updateMask <string> The FieldMask to use when updating the notification config. If empty all mutable fields will be updated."
  ([name NotificationConfig]
    (folders-notificationConfigs-patch name NotificationConfig nil))
  ([name NotificationConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body NotificationConfig})))

(defn folders-findings-bulkMute
  "Kicks off an LRO to bulk mute findings for a parent based on a filter. The parent can be either an organization, folder or project. The findings matched by the filter will be muted after the LRO is done.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/findings/bulkMute

parent <> 
BulkMuteFindingsRequest:
BulkMuteFindingsRequest"
  [parent BulkMuteFindingsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/findings:bulkMute",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BulkMuteFindingsRequest}))

(defn folders-locations-muteConfigs-create
  "Creates a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/locations/muteConfigs/create

parent <> 
GoogleCloudSecuritycenterV1MuteConfig:
GoogleCloudSecuritycenterV1MuteConfig

optional:
muteConfigId <string> Required. Unique identifier provided by the client within the parent scope. It must consist of only lowercase letters, numbers, and hyphens, must start with a letter, must end with either a letter or a number, and must be 63 characters or less."
  ([parent GoogleCloudSecuritycenterV1MuteConfig]
    (folders-locations-muteConfigs-create
      parent
      GoogleCloudSecuritycenterV1MuteConfig
      nil))
  ([parent GoogleCloudSecuritycenterV1MuteConfig optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/muteConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1MuteConfig})))

(defn folders-locations-muteConfigs-delete
  "Deletes an existing mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/locations/muteConfigs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-locations-muteConfigs-get
  "Gets a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/locations/muteConfigs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-locations-muteConfigs-list
  "Lists mute configs.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/locations/muteConfigs/list

parent <> 

optional:
pageSize <integer> The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (folders-locations-muteConfigs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-locations-muteConfigs-patch
  "Updates a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/locations/muteConfigs/patch

name <> 
GoogleCloudSecuritycenterV1MuteConfig:
GoogleCloudSecuritycenterV1MuteConfig

optional:
updateMask <string> The list of fields to be updated. If empty all mutable fields will be updated."
  ([name GoogleCloudSecuritycenterV1MuteConfig]
    (folders-locations-muteConfigs-patch
      name
      GoogleCloudSecuritycenterV1MuteConfig
      nil))
  ([name GoogleCloudSecuritycenterV1MuteConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1MuteConfig})))

(defn folders-eventThreatDetectionSettings-validateCustomModule
  "Validates the given Event Threat Detection custom module.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/eventThreatDetectionSettings/validateCustomModule

parent <> 
ValidateEventThreatDetectionCustomModuleRequest:
ValidateEventThreatDetectionCustomModuleRequest"
  [parent ValidateEventThreatDetectionCustomModuleRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}:validateCustomModule",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ValidateEventThreatDetectionCustomModuleRequest}))

(defn folders-eventThreatDetectionSettings-customModules-create
  "Creates a resident Event Threat Detection custom module at the scope of the given Resource Manager parent, and also creates inherited custom modules for all descendants of the given parent. These modules are enabled by default.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/eventThreatDetectionSettings/customModules/create

parent <> 
EventThreatDetectionCustomModule:
EventThreatDetectionCustomModule"
  [parent EventThreatDetectionCustomModule]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/customModules",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body EventThreatDetectionCustomModule}))

(defn folders-eventThreatDetectionSettings-customModules-delete
  "Deletes the specified Event Threat Detection custom module and all of its descendants in the Resource Manager hierarchy. This method is only supported for resident custom modules.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/eventThreatDetectionSettings/customModules/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-eventThreatDetectionSettings-customModules-get
  "Gets an Event Threat Detection custom module.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/eventThreatDetectionSettings/customModules/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-eventThreatDetectionSettings-customModules-listDescendant
  "Lists all resident Event Threat Detection custom modules under the given Resource Manager parent and its descendants.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/eventThreatDetectionSettings/customModules/listDescendant

parent <> 

optional:
pageSize <integer> The maximum number of modules to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent]
    (folders-eventThreatDetectionSettings-customModules-listDescendant
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/customModules:listDescendant",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-eventThreatDetectionSettings-customModules-list
  "Lists all Event Threat Detection custom modules for the given Resource Manager parent. This includes resident modules defined at the scope of the parent along with modules inherited from ancestors.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/eventThreatDetectionSettings/customModules/list

parent <> 

optional:
pageSize <integer> The maximum number of modules to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent]
    (folders-eventThreatDetectionSettings-customModules-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/customModules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-eventThreatDetectionSettings-customModules-patch
  "Updates the Event Threat Detection custom module with the given name based on the given update mask. Updating the enablement state is supported for both resident and inherited modules (though resident modules cannot have an enablement state of \"inherited\"). Updating the display name or configuration of a module is supported for resident modules only. The type of a module cannot be changed.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/eventThreatDetectionSettings/customModules/patch

name <> 
EventThreatDetectionCustomModule:
EventThreatDetectionCustomModule

optional:
updateMask <string> The list of fields to be updated. If empty all mutable fields will be updated."
  ([name EventThreatDetectionCustomModule]
    (folders-eventThreatDetectionSettings-customModules-patch
      name
      EventThreatDetectionCustomModule
      nil))
  ([name EventThreatDetectionCustomModule optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body EventThreatDetectionCustomModule})))

(defn folders-eventThreatDetectionSettings-effectiveCustomModules-get
  "Gets an effective Event Threat Detection custom module at the given level.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/eventThreatDetectionSettings/effectiveCustomModules/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-eventThreatDetectionSettings-effectiveCustomModules-list
  "Lists all effective Event Threat Detection custom modules for the given parent. This includes resident modules defined at the scope of the parent along with modules inherited from its ancestors.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/eventThreatDetectionSettings/effectiveCustomModules/list

parent <> 

optional:
pageSize <integer> The maximum number of modules to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent]
    (folders-eventThreatDetectionSettings-effectiveCustomModules-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/effectiveCustomModules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-securityHealthAnalyticsSettings-customModules-create
  "Creates a resident SecurityHealthAnalyticsCustomModule at the scope of the given CRM parent, and also creates inherited SecurityHealthAnalyticsCustomModules for all CRM descendants of the given parent. These modules are enabled by default.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/securityHealthAnalyticsSettings/customModules/create

parent <> 
GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule:
GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule"
  [parent
   GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/customModules",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule}))

(defn folders-securityHealthAnalyticsSettings-customModules-delete
  "Deletes the specified SecurityHealthAnalyticsCustomModule and all of its descendants in the CRM hierarchy. This method is only supported for resident custom modules.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/securityHealthAnalyticsSettings/customModules/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-securityHealthAnalyticsSettings-customModules-get
  "Retrieves a SecurityHealthAnalyticsCustomModule.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/securityHealthAnalyticsSettings/customModules/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-securityHealthAnalyticsSettings-customModules-listDescendant
  "Returns a list of all resident SecurityHealthAnalyticsCustomModules under the given CRM parent and all of the parent’s CRM descendants.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/securityHealthAnalyticsSettings/customModules/listDescendant

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent]
    (folders-securityHealthAnalyticsSettings-customModules-listDescendant
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/customModules:listDescendant",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-securityHealthAnalyticsSettings-customModules-list
  "Returns a list of all SecurityHealthAnalyticsCustomModules for the given parent. This includes resident modules defined at the scope of the parent, and inherited modules, inherited from CRM ancestors.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/securityHealthAnalyticsSettings/customModules/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent]
    (folders-securityHealthAnalyticsSettings-customModules-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/customModules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-securityHealthAnalyticsSettings-customModules-simulate
  "Simulates a given SecurityHealthAnalyticsCustomModule and Resource.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/securityHealthAnalyticsSettings/customModules/simulate

parent <> 
SimulateSecurityHealthAnalyticsCustomModuleRequest:
SimulateSecurityHealthAnalyticsCustomModuleRequest"
  [parent SimulateSecurityHealthAnalyticsCustomModuleRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/customModules:simulate",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SimulateSecurityHealthAnalyticsCustomModuleRequest}))

(defn folders-securityHealthAnalyticsSettings-customModules-patch
  "Updates the SecurityHealthAnalyticsCustomModule under the given name based on the given update mask. Updating the enablement state is supported on both resident and inherited modules (though resident modules cannot have an enablement state of \"inherited\"). Updating the display name and custom config of a module is supported on resident modules only.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/securityHealthAnalyticsSettings/customModules/patch

name <> 
GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule:
GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule

optional:
updateMask <string> The list of fields to be updated. The only fields that can be updated are `enablement_state` and `custom_config`. If empty or set to the wildcard value `*`, both `enablement_state` and `custom_config` are updated."
  ([name
    GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule]
    (folders-securityHealthAnalyticsSettings-customModules-patch
      name
      GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule
      nil))
  ([name
    GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule
    optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body
       GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule})))

(defn folders-securityHealthAnalyticsSettings-effectiveCustomModules-get
  "Retrieves an EffectiveSecurityHealthAnalyticsCustomModule.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/securityHealthAnalyticsSettings/effectiveCustomModules/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-securityHealthAnalyticsSettings-effectiveCustomModules-list
  "Returns a list of all EffectiveSecurityHealthAnalyticsCustomModules for the given parent. This includes resident modules defined at the scope of the parent, and inherited modules, inherited from CRM ancestors.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/securityHealthAnalyticsSettings/effectiveCustomModules/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent]
    (folders-securityHealthAnalyticsSettings-effectiveCustomModules-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/effectiveCustomModules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-bigQueryExports-get
  "Gets a BigQuery export.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/bigQueryExports/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-bigQueryExports-create
  "Creates a BigQuery export.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/bigQueryExports/create

parent <> 
GoogleCloudSecuritycenterV1BigQueryExport:
GoogleCloudSecuritycenterV1BigQueryExport

optional:
bigQueryExportId <string> Required. Unique identifier provided by the client within the parent scope. It must consist of only lowercase letters, numbers, and hyphens, must start with a letter, must end with either a letter or a number, and must be 63 characters or less."
  ([parent GoogleCloudSecuritycenterV1BigQueryExport]
    (folders-bigQueryExports-create
      parent
      GoogleCloudSecuritycenterV1BigQueryExport
      nil))
  ([parent GoogleCloudSecuritycenterV1BigQueryExport optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/bigQueryExports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1BigQueryExport})))

(defn folders-bigQueryExports-delete
  "Deletes an existing BigQuery export.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/bigQueryExports/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-bigQueryExports-patch
  "Updates a BigQuery export.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/bigQueryExports/patch

name <> 
GoogleCloudSecuritycenterV1BigQueryExport:
GoogleCloudSecuritycenterV1BigQueryExport

optional:
updateMask <string> The list of fields to be updated. If empty all mutable fields will be updated."
  ([name GoogleCloudSecuritycenterV1BigQueryExport]
    (folders-bigQueryExports-patch
      name
      GoogleCloudSecuritycenterV1BigQueryExport
      nil))
  ([name GoogleCloudSecuritycenterV1BigQueryExport optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1BigQueryExport})))

(defn folders-bigQueryExports-list
  "Lists BigQuery exports. Note that when requesting BigQuery exports at a given level all exports under that level are also returned e.g. if requesting BigQuery exports under a folder, then all BigQuery exports immediately under the folder plus the ones created under the projects within the folder are returned.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/bigQueryExports/list

parent <> 

optional:
pageSize <integer> The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (folders-bigQueryExports-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/bigQueryExports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-assets-group
  "Filters an organization's assets and groups them by their specified properties.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/assets/group

parent <> 
GroupAssetsRequest:
GroupAssetsRequest"
  [parent GroupAssetsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/assets:group",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GroupAssetsRequest}))

(defn folders-assets-list
  "Lists an organization's assets.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/assets/list

parent <> 

optional:
filter <string> Expression that defines the filter to apply across assets. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. The fields map to those defined in the Asset resource. Examples include: * name * security_center_properties.resource_name * resource_properties.a_property * security_marks.marks.marka The supported operators are: * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes. The following are the allowed field and operator combinations: * name: `=` * update_time: `=`, `>`, `<`, `>=`, `<=` Usage: This should be milliseconds since epoch or an RFC3339 string. Examples: `update_time = \"2019-06-10T16:07:18-07:00\"` `update_time = 1560208038000` * create_time: `=`, `>`, `<`, `>=`, `<=` Usage: This should be milliseconds since epoch or an RFC3339 string. Examples: `create_time = \"2019-06-10T16:07:18-07:00\"` `create_time = 1560208038000` * iam_policy.policy_blob: `=`, `:` * resource_properties: `=`, `:`, `>`, `<`, `>=`, `<=` * security_marks.marks: `=`, `:` * security_center_properties.resource_name: `=`, `:` * security_center_properties.resource_display_name: `=`, `:` * security_center_properties.resource_type: `=`, `:` * security_center_properties.resource_parent: `=`, `:` * security_center_properties.resource_parent_display_name: `=`, `:` * security_center_properties.resource_project: `=`, `:` * security_center_properties.resource_project_display_name: `=`, `:` * security_center_properties.resource_owners: `=`, `:` For example, `resource_properties.size = 100` is a valid filter string. Use a partial match on the empty string to filter based on a property existing: `resource_properties.my_property : \"\"` Use a negated partial match on the empty string to filter based on a property not existing: `-resource_properties.my_property : \"\"`
orderBy <string> Expression that defines what fields and order to use for sorting. The string value should follow SQL syntax: comma separated list of fields. For example: \"name,resource_properties.a_property\". The default sorting order is ascending. To specify descending order for a field, a suffix \" desc\" should be appended to the field name. For example: \"name desc,resource_properties.a_property\". Redundant space characters in the syntax are insignificant. \"name desc,resource_properties.a_property\" and \" name desc , resource_properties.a_property \" are equivalent. The following fields are supported: name update_time resource_properties security_marks.marks security_center_properties.resource_name security_center_properties.resource_display_name security_center_properties.resource_parent security_center_properties.resource_parent_display_name security_center_properties.resource_project security_center_properties.resource_project_display_name security_center_properties.resource_type
readTime <string> Time used as a reference point when filtering assets. The filter is limited to assets existing at the supplied time and their values are those at that specific time. Absence of this field will default to the API's version of NOW.
compareDuration <string> When compare_duration is set, the ListAssetsResult's \"state_change\" attribute is updated to indicate whether the asset was added, removed, or remained present during the compare_duration period of time that precedes the read_time. This is the time between (read_time - compare_duration) and read_time. The state_change value is derived based on the presence of the asset at the two points in time. Intermediate state changes between the two times don't affect the result. For example, the results aren't affected if the asset is removed and re-created again. Possible \"state_change\" values when compare_duration is specified: * \"ADDED\": indicates that the asset was not present at the start of compare_duration, but present at read_time. * \"REMOVED\": indicates that the asset was present at the start of compare_duration, but not present at read_time. * \"ACTIVE\": indicates that the asset was present at both the start and the end of the time period defined by compare_duration and read_time. If compare_duration is not specified, then the only possible state_change is \"UNUSED\", which will be the state_change set for all assets present at read_time.
fieldMask <string> A field mask to specify the ListAssetsResult fields to be listed in the response. An empty field mask will list all fields.
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent] (folders-assets-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/assets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-assets-updateSecurityMarks
  "Updates security marks.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/folders/assets/updateSecurityMarks

name <> 
SecurityMarks:
SecurityMarks

optional:
updateMask <string> The FieldMask to use when updating the security marks resource. The field mask must not contain duplicate fields. If empty or set to \"marks\", all marks will be replaced. Individual marks can be updated using \"marks.\".
startTime <string> The time at which the updated SecurityMarks take effect. If not set uses current server time. Updates will be applied to the SecurityMarks that are active immediately preceding this time. Must be earlier or equal to the server time."
  ([name SecurityMarks]
    (folders-assets-updateSecurityMarks name SecurityMarks nil))
  ([name SecurityMarks optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body SecurityMarks})))

(defn projects-sources-list
  "Lists all sources belonging to an organization.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/sources/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent] (projects-sources-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/sources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-sources-findings-group
  "Filters an organization or source's findings and groups them by their specified properties. To group across all sources provide a `-` as the source id. Example: /v1/organizations/{organization_id}/sources/-/findings, /v1/folders/{folder_id}/sources/-/findings, /v1/projects/{project_id}/sources/-/findings
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/sources/findings/group

parent <> 
GroupFindingsRequest:
GroupFindingsRequest"
  [parent GroupFindingsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/findings:group",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GroupFindingsRequest}))

(defn projects-sources-findings-list
  "Lists an organization or source's findings. To list across all sources provide a `-` as the source id. Example: /v1/organizations/{organization_id}/sources/-/findings
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/sources/findings/list

parent <> 

optional:
filter <string> Expression that defines the filter to apply across findings. The expression is a list of one or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. Examples include: * name * source_properties.a_property * security_marks.marks.marka The supported operators are: * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes. The following field and operator combinations are supported: * name: `=` * parent: `=`, `:` * resource_name: `=`, `:` * state: `=`, `:` * category: `=`, `:` * external_uri: `=`, `:` * event_time: `=`, `>`, `<`, `>=`, `<=` Usage: This should be milliseconds since epoch or an RFC3339 string. Examples: `event_time = \"2019-06-10T16:07:18-07:00\"` `event_time = 1560208038000` * severity: `=`, `:` * workflow_state: `=`, `:` * security_marks.marks: `=`, `:` * source_properties: `=`, `:`, `>`, `<`, `>=`, `<=` For example, `source_properties.size = 100` is a valid filter string. Use a partial match on the empty string to filter based on a property existing: `source_properties.my_property : \"\"` Use a negated partial match on the empty string to filter based on a property not existing: `-source_properties.my_property : \"\"` * resource: * resource.name: `=`, `:` * resource.parent_name: `=`, `:` * resource.parent_display_name: `=`, `:` * resource.project_name: `=`, `:` * resource.project_display_name: `=`, `:` * resource.type: `=`, `:` * resource.folders.resource_folder: `=`, `:` * resource.display_name: `=`, `:`
orderBy <string> Expression that defines what fields and order to use for sorting. The string value should follow SQL syntax: comma separated list of fields. For example: \"name,resource_properties.a_property\". The default sorting order is ascending. To specify descending order for a field, a suffix \" desc\" should be appended to the field name. For example: \"name desc,source_properties.a_property\". Redundant space characters in the syntax are insignificant. \"name desc,source_properties.a_property\" and \" name desc , source_properties.a_property \" are equivalent. The following fields are supported: name parent state category resource_name event_time source_properties security_marks.marks
readTime <string> Time used as a reference point when filtering findings. The filter is limited to findings existing at the supplied time and their values are those at that specific time. Absence of this field will default to the API's version of NOW.
compareDuration <string> When compare_duration is set, the ListFindingsResult's \"state_change\" attribute is updated to indicate whether the finding had its state changed, the finding's state remained unchanged, or if the finding was added in any state during the compare_duration period of time that precedes the read_time. This is the time between (read_time - compare_duration) and read_time. The state_change value is derived based on the presence and state of the finding at the two points in time. Intermediate state changes between the two times don't affect the result. For example, the results aren't affected if the finding is made inactive and then active again. Possible \"state_change\" values when compare_duration is specified: * \"CHANGED\": indicates that the finding was present and matched the given filter at the start of compare_duration, but changed its state at read_time. * \"UNCHANGED\": indicates that the finding was present and matched the given filter at the start of compare_duration and did not change state at read_time. * \"ADDED\": indicates that the finding did not match the given filter or was not present at the start of compare_duration, but was present at read_time. * \"REMOVED\": indicates that the finding was present and matched the filter at the start of compare_duration, but did not match the filter at read_time. If compare_duration is not specified, then the only possible state_change is \"UNUSED\", which will be the state_change set for all findings present at read_time.
fieldMask <string> A field mask to specify the Finding fields to be listed in the response. An empty field mask will list all fields.
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent] (projects-sources-findings-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/findings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-sources-findings-setState
  "Updates the state of a finding.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/sources/findings/setState

name <> 
SetFindingStateRequest:
SetFindingStateRequest"
  [name SetFindingStateRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+name}:setState",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetFindingStateRequest}))

(defn projects-sources-findings-setMute
  "Updates the mute state of a finding.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/sources/findings/setMute

name <> 
SetMuteRequest:
SetMuteRequest"
  [name SetMuteRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+name}:setMute",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetMuteRequest}))

(defn projects-sources-findings-patch
  "Creates or updates a finding. The corresponding source must exist for a finding creation to succeed.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/sources/findings/patch

name <> 
Finding:
Finding

optional:
updateMask <string> The FieldMask to use when updating the finding resource. This field should not be specified when creating a finding. When updating a finding, an empty mask is treated as updating all mutable fields and replacing source_properties. Individual source_properties can be added/updated by using \"source_properties.\" in the field mask."
  ([name Finding] (projects-sources-findings-patch name Finding nil))
  ([name Finding optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Finding})))

(defn projects-sources-findings-updateSecurityMarks
  "Updates security marks.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/sources/findings/updateSecurityMarks

name <> 
SecurityMarks:
SecurityMarks

optional:
updateMask <string> The FieldMask to use when updating the security marks resource. The field mask must not contain duplicate fields. If empty or set to \"marks\", all marks will be replaced. Individual marks can be updated using \"marks.\".
startTime <string> The time at which the updated SecurityMarks take effect. If not set uses current server time. Updates will be applied to the SecurityMarks that are active immediately preceding this time. Must be earlier or equal to the server time."
  ([name SecurityMarks]
    (projects-sources-findings-updateSecurityMarks
      name
      SecurityMarks
      nil))
  ([name SecurityMarks optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body SecurityMarks})))

(defn projects-sources-findings-externalSystems-patch
  "Updates external system. This is for a given finding.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/sources/findings/externalSystems/patch

name <> 
GoogleCloudSecuritycenterV1ExternalSystem:
GoogleCloudSecuritycenterV1ExternalSystem

optional:
updateMask <string> The FieldMask to use when updating the external system resource. If empty all mutable fields will be updated."
  ([name GoogleCloudSecuritycenterV1ExternalSystem]
    (projects-sources-findings-externalSystems-patch
      name
      GoogleCloudSecuritycenterV1ExternalSystem
      nil))
  ([name GoogleCloudSecuritycenterV1ExternalSystem optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1ExternalSystem})))

(defn projects-muteConfigs-create
  "Creates a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/muteConfigs/create

parent <> 
GoogleCloudSecuritycenterV1MuteConfig:
GoogleCloudSecuritycenterV1MuteConfig

optional:
muteConfigId <string> Required. Unique identifier provided by the client within the parent scope. It must consist of only lowercase letters, numbers, and hyphens, must start with a letter, must end with either a letter or a number, and must be 63 characters or less."
  ([parent GoogleCloudSecuritycenterV1MuteConfig]
    (projects-muteConfigs-create
      parent
      GoogleCloudSecuritycenterV1MuteConfig
      nil))
  ([parent GoogleCloudSecuritycenterV1MuteConfig optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/muteConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1MuteConfig})))

(defn projects-muteConfigs-delete
  "Deletes an existing mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/muteConfigs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-muteConfigs-get
  "Gets a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/muteConfigs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-muteConfigs-list
  "Lists mute configs.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/muteConfigs/list

parent <> 

optional:
pageSize <integer> The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-muteConfigs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/muteConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-muteConfigs-patch
  "Updates a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/muteConfigs/patch

name <> 
GoogleCloudSecuritycenterV1MuteConfig:
GoogleCloudSecuritycenterV1MuteConfig

optional:
updateMask <string> The list of fields to be updated. If empty all mutable fields will be updated."
  ([name GoogleCloudSecuritycenterV1MuteConfig]
    (projects-muteConfigs-patch
      name
      GoogleCloudSecuritycenterV1MuteConfig
      nil))
  ([name GoogleCloudSecuritycenterV1MuteConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1MuteConfig})))

(defn projects-notificationConfigs-create
  "Creates a notification config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/notificationConfigs/create

parent <> 
NotificationConfig:
NotificationConfig

optional:
configId <string> Required. Unique identifier provided by the client within the parent scope. It must be between 1 and 128 characters and contain alphanumeric characters, underscores, or hyphens only."
  ([parent NotificationConfig]
    (projects-notificationConfigs-create
      parent
      NotificationConfig
      nil))
  ([parent NotificationConfig optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/notificationConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body NotificationConfig})))

(defn projects-notificationConfigs-delete
  "Deletes a notification config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/notificationConfigs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-notificationConfigs-get
  "Gets a notification config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/notificationConfigs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-notificationConfigs-list
  "Lists notification configs.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/notificationConfigs/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent] (projects-notificationConfigs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/notificationConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-notificationConfigs-patch
  " Updates a notification config. The following update fields are allowed: description, pubsub_topic, streaming_config.filter
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/notificationConfigs/patch

name <> 
NotificationConfig:
NotificationConfig

optional:
updateMask <string> The FieldMask to use when updating the notification config. If empty all mutable fields will be updated."
  ([name NotificationConfig]
    (projects-notificationConfigs-patch name NotificationConfig nil))
  ([name NotificationConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body NotificationConfig})))

(defn projects-findings-bulkMute
  "Kicks off an LRO to bulk mute findings for a parent based on a filter. The parent can be either an organization, folder or project. The findings matched by the filter will be muted after the LRO is done.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/findings/bulkMute

parent <> 
BulkMuteFindingsRequest:
BulkMuteFindingsRequest"
  [parent BulkMuteFindingsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/findings:bulkMute",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BulkMuteFindingsRequest}))

(defn projects-locations-muteConfigs-create
  "Creates a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/locations/muteConfigs/create

parent <> 
GoogleCloudSecuritycenterV1MuteConfig:
GoogleCloudSecuritycenterV1MuteConfig

optional:
muteConfigId <string> Required. Unique identifier provided by the client within the parent scope. It must consist of only lowercase letters, numbers, and hyphens, must start with a letter, must end with either a letter or a number, and must be 63 characters or less."
  ([parent GoogleCloudSecuritycenterV1MuteConfig]
    (projects-locations-muteConfigs-create
      parent
      GoogleCloudSecuritycenterV1MuteConfig
      nil))
  ([parent GoogleCloudSecuritycenterV1MuteConfig optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/muteConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1MuteConfig})))

(defn projects-locations-muteConfigs-delete
  "Deletes an existing mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/locations/muteConfigs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-muteConfigs-get
  "Gets a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/locations/muteConfigs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-muteConfigs-list
  "Lists mute configs.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/locations/muteConfigs/list

parent <> 

optional:
pageSize <integer> The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-locations-muteConfigs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-muteConfigs-patch
  "Updates a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/locations/muteConfigs/patch

name <> 
GoogleCloudSecuritycenterV1MuteConfig:
GoogleCloudSecuritycenterV1MuteConfig

optional:
updateMask <string> The list of fields to be updated. If empty all mutable fields will be updated."
  ([name GoogleCloudSecuritycenterV1MuteConfig]
    (projects-locations-muteConfigs-patch
      name
      GoogleCloudSecuritycenterV1MuteConfig
      nil))
  ([name GoogleCloudSecuritycenterV1MuteConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1MuteConfig})))

(defn projects-eventThreatDetectionSettings-validateCustomModule
  "Validates the given Event Threat Detection custom module.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/eventThreatDetectionSettings/validateCustomModule

parent <> 
ValidateEventThreatDetectionCustomModuleRequest:
ValidateEventThreatDetectionCustomModuleRequest"
  [parent ValidateEventThreatDetectionCustomModuleRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}:validateCustomModule",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ValidateEventThreatDetectionCustomModuleRequest}))

(defn projects-eventThreatDetectionSettings-customModules-create
  "Creates a resident Event Threat Detection custom module at the scope of the given Resource Manager parent, and also creates inherited custom modules for all descendants of the given parent. These modules are enabled by default.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/eventThreatDetectionSettings/customModules/create

parent <> 
EventThreatDetectionCustomModule:
EventThreatDetectionCustomModule"
  [parent EventThreatDetectionCustomModule]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/customModules",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body EventThreatDetectionCustomModule}))

(defn projects-eventThreatDetectionSettings-customModules-delete
  "Deletes the specified Event Threat Detection custom module and all of its descendants in the Resource Manager hierarchy. This method is only supported for resident custom modules.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/eventThreatDetectionSettings/customModules/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-eventThreatDetectionSettings-customModules-get
  "Gets an Event Threat Detection custom module.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/eventThreatDetectionSettings/customModules/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-eventThreatDetectionSettings-customModules-listDescendant
  "Lists all resident Event Threat Detection custom modules under the given Resource Manager parent and its descendants.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/eventThreatDetectionSettings/customModules/listDescendant

parent <> 

optional:
pageSize <integer> The maximum number of modules to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent]
    (projects-eventThreatDetectionSettings-customModules-listDescendant
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/customModules:listDescendant",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-eventThreatDetectionSettings-customModules-list
  "Lists all Event Threat Detection custom modules for the given Resource Manager parent. This includes resident modules defined at the scope of the parent along with modules inherited from ancestors.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/eventThreatDetectionSettings/customModules/list

parent <> 

optional:
pageSize <integer> The maximum number of modules to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent]
    (projects-eventThreatDetectionSettings-customModules-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/customModules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-eventThreatDetectionSettings-customModules-patch
  "Updates the Event Threat Detection custom module with the given name based on the given update mask. Updating the enablement state is supported for both resident and inherited modules (though resident modules cannot have an enablement state of \"inherited\"). Updating the display name or configuration of a module is supported for resident modules only. The type of a module cannot be changed.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/eventThreatDetectionSettings/customModules/patch

name <> 
EventThreatDetectionCustomModule:
EventThreatDetectionCustomModule

optional:
updateMask <string> The list of fields to be updated. If empty all mutable fields will be updated."
  ([name EventThreatDetectionCustomModule]
    (projects-eventThreatDetectionSettings-customModules-patch
      name
      EventThreatDetectionCustomModule
      nil))
  ([name EventThreatDetectionCustomModule optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body EventThreatDetectionCustomModule})))

(defn projects-eventThreatDetectionSettings-effectiveCustomModules-get
  "Gets an effective Event Threat Detection custom module at the given level.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/eventThreatDetectionSettings/effectiveCustomModules/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-eventThreatDetectionSettings-effectiveCustomModules-list
  "Lists all effective Event Threat Detection custom modules for the given parent. This includes resident modules defined at the scope of the parent along with modules inherited from its ancestors.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/eventThreatDetectionSettings/effectiveCustomModules/list

parent <> 

optional:
pageSize <integer> The maximum number of modules to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent]
    (projects-eventThreatDetectionSettings-effectiveCustomModules-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/effectiveCustomModules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-securityHealthAnalyticsSettings-customModules-create
  "Creates a resident SecurityHealthAnalyticsCustomModule at the scope of the given CRM parent, and also creates inherited SecurityHealthAnalyticsCustomModules for all CRM descendants of the given parent. These modules are enabled by default.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/securityHealthAnalyticsSettings/customModules/create

parent <> 
GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule:
GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule"
  [parent
   GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/customModules",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule}))

(defn projects-securityHealthAnalyticsSettings-customModules-delete
  "Deletes the specified SecurityHealthAnalyticsCustomModule and all of its descendants in the CRM hierarchy. This method is only supported for resident custom modules.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/securityHealthAnalyticsSettings/customModules/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-securityHealthAnalyticsSettings-customModules-get
  "Retrieves a SecurityHealthAnalyticsCustomModule.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/securityHealthAnalyticsSettings/customModules/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-securityHealthAnalyticsSettings-customModules-listDescendant
  "Returns a list of all resident SecurityHealthAnalyticsCustomModules under the given CRM parent and all of the parent’s CRM descendants.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/securityHealthAnalyticsSettings/customModules/listDescendant

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent]
    (projects-securityHealthAnalyticsSettings-customModules-listDescendant
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/customModules:listDescendant",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-securityHealthAnalyticsSettings-customModules-list
  "Returns a list of all SecurityHealthAnalyticsCustomModules for the given parent. This includes resident modules defined at the scope of the parent, and inherited modules, inherited from CRM ancestors.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/securityHealthAnalyticsSettings/customModules/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent]
    (projects-securityHealthAnalyticsSettings-customModules-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/customModules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-securityHealthAnalyticsSettings-customModules-simulate
  "Simulates a given SecurityHealthAnalyticsCustomModule and Resource.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/securityHealthAnalyticsSettings/customModules/simulate

parent <> 
SimulateSecurityHealthAnalyticsCustomModuleRequest:
SimulateSecurityHealthAnalyticsCustomModuleRequest"
  [parent SimulateSecurityHealthAnalyticsCustomModuleRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/customModules:simulate",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SimulateSecurityHealthAnalyticsCustomModuleRequest}))

(defn projects-securityHealthAnalyticsSettings-customModules-patch
  "Updates the SecurityHealthAnalyticsCustomModule under the given name based on the given update mask. Updating the enablement state is supported on both resident and inherited modules (though resident modules cannot have an enablement state of \"inherited\"). Updating the display name and custom config of a module is supported on resident modules only.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/securityHealthAnalyticsSettings/customModules/patch

name <> 
GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule:
GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule

optional:
updateMask <string> The list of fields to be updated. The only fields that can be updated are `enablement_state` and `custom_config`. If empty or set to the wildcard value `*`, both `enablement_state` and `custom_config` are updated."
  ([name
    GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule]
    (projects-securityHealthAnalyticsSettings-customModules-patch
      name
      GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule
      nil))
  ([name
    GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule
    optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body
       GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule})))

(defn projects-securityHealthAnalyticsSettings-effectiveCustomModules-get
  "Retrieves an EffectiveSecurityHealthAnalyticsCustomModule.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/securityHealthAnalyticsSettings/effectiveCustomModules/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-securityHealthAnalyticsSettings-effectiveCustomModules-list
  "Returns a list of all EffectiveSecurityHealthAnalyticsCustomModules for the given parent. This includes resident modules defined at the scope of the parent, and inherited modules, inherited from CRM ancestors.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/securityHealthAnalyticsSettings/effectiveCustomModules/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent]
    (projects-securityHealthAnalyticsSettings-effectiveCustomModules-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/effectiveCustomModules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-bigQueryExports-get
  "Gets a BigQuery export.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/bigQueryExports/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-bigQueryExports-create
  "Creates a BigQuery export.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/bigQueryExports/create

parent <> 
GoogleCloudSecuritycenterV1BigQueryExport:
GoogleCloudSecuritycenterV1BigQueryExport

optional:
bigQueryExportId <string> Required. Unique identifier provided by the client within the parent scope. It must consist of only lowercase letters, numbers, and hyphens, must start with a letter, must end with either a letter or a number, and must be 63 characters or less."
  ([parent GoogleCloudSecuritycenterV1BigQueryExport]
    (projects-bigQueryExports-create
      parent
      GoogleCloudSecuritycenterV1BigQueryExport
      nil))
  ([parent GoogleCloudSecuritycenterV1BigQueryExport optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/bigQueryExports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1BigQueryExport})))

(defn projects-bigQueryExports-delete
  "Deletes an existing BigQuery export.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/bigQueryExports/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-bigQueryExports-patch
  "Updates a BigQuery export.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/bigQueryExports/patch

name <> 
GoogleCloudSecuritycenterV1BigQueryExport:
GoogleCloudSecuritycenterV1BigQueryExport

optional:
updateMask <string> The list of fields to be updated. If empty all mutable fields will be updated."
  ([name GoogleCloudSecuritycenterV1BigQueryExport]
    (projects-bigQueryExports-patch
      name
      GoogleCloudSecuritycenterV1BigQueryExport
      nil))
  ([name GoogleCloudSecuritycenterV1BigQueryExport optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1BigQueryExport})))

(defn projects-bigQueryExports-list
  "Lists BigQuery exports. Note that when requesting BigQuery exports at a given level all exports under that level are also returned e.g. if requesting BigQuery exports under a folder, then all BigQuery exports immediately under the folder plus the ones created under the projects within the folder are returned.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/bigQueryExports/list

parent <> 

optional:
pageSize <integer> The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-bigQueryExports-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/bigQueryExports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-assets-group
  "Filters an organization's assets and groups them by their specified properties.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/assets/group

parent <> 
GroupAssetsRequest:
GroupAssetsRequest"
  [parent GroupAssetsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/assets:group",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GroupAssetsRequest}))

(defn projects-assets-list
  "Lists an organization's assets.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/assets/list

parent <> 

optional:
filter <string> Expression that defines the filter to apply across assets. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. The fields map to those defined in the Asset resource. Examples include: * name * security_center_properties.resource_name * resource_properties.a_property * security_marks.marks.marka The supported operators are: * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes. The following are the allowed field and operator combinations: * name: `=` * update_time: `=`, `>`, `<`, `>=`, `<=` Usage: This should be milliseconds since epoch or an RFC3339 string. Examples: `update_time = \"2019-06-10T16:07:18-07:00\"` `update_time = 1560208038000` * create_time: `=`, `>`, `<`, `>=`, `<=` Usage: This should be milliseconds since epoch or an RFC3339 string. Examples: `create_time = \"2019-06-10T16:07:18-07:00\"` `create_time = 1560208038000` * iam_policy.policy_blob: `=`, `:` * resource_properties: `=`, `:`, `>`, `<`, `>=`, `<=` * security_marks.marks: `=`, `:` * security_center_properties.resource_name: `=`, `:` * security_center_properties.resource_display_name: `=`, `:` * security_center_properties.resource_type: `=`, `:` * security_center_properties.resource_parent: `=`, `:` * security_center_properties.resource_parent_display_name: `=`, `:` * security_center_properties.resource_project: `=`, `:` * security_center_properties.resource_project_display_name: `=`, `:` * security_center_properties.resource_owners: `=`, `:` For example, `resource_properties.size = 100` is a valid filter string. Use a partial match on the empty string to filter based on a property existing: `resource_properties.my_property : \"\"` Use a negated partial match on the empty string to filter based on a property not existing: `-resource_properties.my_property : \"\"`
orderBy <string> Expression that defines what fields and order to use for sorting. The string value should follow SQL syntax: comma separated list of fields. For example: \"name,resource_properties.a_property\". The default sorting order is ascending. To specify descending order for a field, a suffix \" desc\" should be appended to the field name. For example: \"name desc,resource_properties.a_property\". Redundant space characters in the syntax are insignificant. \"name desc,resource_properties.a_property\" and \" name desc , resource_properties.a_property \" are equivalent. The following fields are supported: name update_time resource_properties security_marks.marks security_center_properties.resource_name security_center_properties.resource_display_name security_center_properties.resource_parent security_center_properties.resource_parent_display_name security_center_properties.resource_project security_center_properties.resource_project_display_name security_center_properties.resource_type
readTime <string> Time used as a reference point when filtering assets. The filter is limited to assets existing at the supplied time and their values are those at that specific time. Absence of this field will default to the API's version of NOW.
compareDuration <string> When compare_duration is set, the ListAssetsResult's \"state_change\" attribute is updated to indicate whether the asset was added, removed, or remained present during the compare_duration period of time that precedes the read_time. This is the time between (read_time - compare_duration) and read_time. The state_change value is derived based on the presence of the asset at the two points in time. Intermediate state changes between the two times don't affect the result. For example, the results aren't affected if the asset is removed and re-created again. Possible \"state_change\" values when compare_duration is specified: * \"ADDED\": indicates that the asset was not present at the start of compare_duration, but present at read_time. * \"REMOVED\": indicates that the asset was present at the start of compare_duration, but not present at read_time. * \"ACTIVE\": indicates that the asset was present at both the start and the end of the time period defined by compare_duration and read_time. If compare_duration is not specified, then the only possible state_change is \"UNUSED\", which will be the state_change set for all assets present at read_time.
fieldMask <string> A field mask to specify the ListAssetsResult fields to be listed in the response. An empty field mask will list all fields.
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent] (projects-assets-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/assets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-assets-updateSecurityMarks
  "Updates security marks.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/projects/assets/updateSecurityMarks

name <> 
SecurityMarks:
SecurityMarks

optional:
updateMask <string> The FieldMask to use when updating the security marks resource. The field mask must not contain duplicate fields. If empty or set to \"marks\", all marks will be replaced. Individual marks can be updated using \"marks.\".
startTime <string> The time at which the updated SecurityMarks take effect. If not set uses current server time. Updates will be applied to the SecurityMarks that are active immediately preceding this time. Must be earlier or equal to the server time."
  ([name SecurityMarks]
    (projects-assets-updateSecurityMarks name SecurityMarks nil))
  ([name SecurityMarks optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body SecurityMarks})))

(defn organizations-getOrganizationSettings
  "Gets the settings for an organization.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/getOrganizationSettings

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-updateOrganizationSettings
  "Updates an organization's settings.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/updateOrganizationSettings

name <> 
OrganizationSettings:
OrganizationSettings

optional:
updateMask <string> The FieldMask to use when updating the settings resource. If empty all mutable fields will be updated."
  ([name OrganizationSettings]
    (organizations-updateOrganizationSettings
      name
      OrganizationSettings
      nil))
  ([name OrganizationSettings optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body OrganizationSettings})))

(defn organizations-sources-create
  "Creates a source.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/create

parent <> 
Source:
Source"
  [parent Source]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/sources",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Source}))

(defn organizations-sources-getIamPolicy
  "Gets the access control policy on the specified Source.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GetIamPolicyRequest}))

(defn organizations-sources-get
  "Gets a source.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-sources-list
  "Lists all sources belonging to an organization.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent] (organizations-sources-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/sources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-sources-setIamPolicy
  "Sets the access control policy on the specified Source.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn organizations-sources-testIamPermissions
  "Returns the permissions that a caller has on the specified source.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn organizations-sources-patch
  "Updates a source.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/patch

name <> 
Source:
Source

optional:
updateMask <string> The FieldMask to use when updating the source resource. If empty all mutable fields will be updated."
  ([name Source] (organizations-sources-patch name Source nil))
  ([name Source optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Source})))

(defn organizations-sources-findings-create
  "Creates a finding. The corresponding source must exist for finding creation to succeed.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/findings/create

parent <> 
Finding:
Finding

optional:
findingId <string> Required. Unique identifier provided by the client within the parent scope. It must be alphanumeric and less than or equal to 32 characters and greater than 0 characters in length."
  ([parent Finding]
    (organizations-sources-findings-create parent Finding nil))
  ([parent Finding optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/findings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Finding})))

(defn organizations-sources-findings-group
  "Filters an organization or source's findings and groups them by their specified properties. To group across all sources provide a `-` as the source id. Example: /v1/organizations/{organization_id}/sources/-/findings, /v1/folders/{folder_id}/sources/-/findings, /v1/projects/{project_id}/sources/-/findings
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/findings/group

parent <> 
GroupFindingsRequest:
GroupFindingsRequest"
  [parent GroupFindingsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/findings:group",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GroupFindingsRequest}))

(defn organizations-sources-findings-list
  "Lists an organization or source's findings. To list across all sources provide a `-` as the source id. Example: /v1/organizations/{organization_id}/sources/-/findings
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/findings/list

parent <> 

optional:
filter <string> Expression that defines the filter to apply across findings. The expression is a list of one or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. Examples include: * name * source_properties.a_property * security_marks.marks.marka The supported operators are: * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes. The following field and operator combinations are supported: * name: `=` * parent: `=`, `:` * resource_name: `=`, `:` * state: `=`, `:` * category: `=`, `:` * external_uri: `=`, `:` * event_time: `=`, `>`, `<`, `>=`, `<=` Usage: This should be milliseconds since epoch or an RFC3339 string. Examples: `event_time = \"2019-06-10T16:07:18-07:00\"` `event_time = 1560208038000` * severity: `=`, `:` * workflow_state: `=`, `:` * security_marks.marks: `=`, `:` * source_properties: `=`, `:`, `>`, `<`, `>=`, `<=` For example, `source_properties.size = 100` is a valid filter string. Use a partial match on the empty string to filter based on a property existing: `source_properties.my_property : \"\"` Use a negated partial match on the empty string to filter based on a property not existing: `-source_properties.my_property : \"\"` * resource: * resource.name: `=`, `:` * resource.parent_name: `=`, `:` * resource.parent_display_name: `=`, `:` * resource.project_name: `=`, `:` * resource.project_display_name: `=`, `:` * resource.type: `=`, `:` * resource.folders.resource_folder: `=`, `:` * resource.display_name: `=`, `:`
orderBy <string> Expression that defines what fields and order to use for sorting. The string value should follow SQL syntax: comma separated list of fields. For example: \"name,resource_properties.a_property\". The default sorting order is ascending. To specify descending order for a field, a suffix \" desc\" should be appended to the field name. For example: \"name desc,source_properties.a_property\". Redundant space characters in the syntax are insignificant. \"name desc,source_properties.a_property\" and \" name desc , source_properties.a_property \" are equivalent. The following fields are supported: name parent state category resource_name event_time source_properties security_marks.marks
readTime <string> Time used as a reference point when filtering findings. The filter is limited to findings existing at the supplied time and their values are those at that specific time. Absence of this field will default to the API's version of NOW.
compareDuration <string> When compare_duration is set, the ListFindingsResult's \"state_change\" attribute is updated to indicate whether the finding had its state changed, the finding's state remained unchanged, or if the finding was added in any state during the compare_duration period of time that precedes the read_time. This is the time between (read_time - compare_duration) and read_time. The state_change value is derived based on the presence and state of the finding at the two points in time. Intermediate state changes between the two times don't affect the result. For example, the results aren't affected if the finding is made inactive and then active again. Possible \"state_change\" values when compare_duration is specified: * \"CHANGED\": indicates that the finding was present and matched the given filter at the start of compare_duration, but changed its state at read_time. * \"UNCHANGED\": indicates that the finding was present and matched the given filter at the start of compare_duration and did not change state at read_time. * \"ADDED\": indicates that the finding did not match the given filter or was not present at the start of compare_duration, but was present at read_time. * \"REMOVED\": indicates that the finding was present and matched the filter at the start of compare_duration, but did not match the filter at read_time. If compare_duration is not specified, then the only possible state_change is \"UNUSED\", which will be the state_change set for all findings present at read_time.
fieldMask <string> A field mask to specify the Finding fields to be listed in the response. An empty field mask will list all fields.
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent] (organizations-sources-findings-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/findings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-sources-findings-setState
  "Updates the state of a finding.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/findings/setState

name <> 
SetFindingStateRequest:
SetFindingStateRequest"
  [name SetFindingStateRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+name}:setState",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetFindingStateRequest}))

(defn organizations-sources-findings-setMute
  "Updates the mute state of a finding.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/findings/setMute

name <> 
SetMuteRequest:
SetMuteRequest"
  [name SetMuteRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+name}:setMute",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetMuteRequest}))

(defn organizations-sources-findings-patch
  "Creates or updates a finding. The corresponding source must exist for a finding creation to succeed.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/findings/patch

name <> 
Finding:
Finding

optional:
updateMask <string> The FieldMask to use when updating the finding resource. This field should not be specified when creating a finding. When updating a finding, an empty mask is treated as updating all mutable fields and replacing source_properties. Individual source_properties can be added/updated by using \"source_properties.\" in the field mask."
  ([name Finding]
    (organizations-sources-findings-patch name Finding nil))
  ([name Finding optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Finding})))

(defn organizations-sources-findings-updateSecurityMarks
  "Updates security marks.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/findings/updateSecurityMarks

name <> 
SecurityMarks:
SecurityMarks

optional:
updateMask <string> The FieldMask to use when updating the security marks resource. The field mask must not contain duplicate fields. If empty or set to \"marks\", all marks will be replaced. Individual marks can be updated using \"marks.\".
startTime <string> The time at which the updated SecurityMarks take effect. If not set uses current server time. Updates will be applied to the SecurityMarks that are active immediately preceding this time. Must be earlier or equal to the server time."
  ([name SecurityMarks]
    (organizations-sources-findings-updateSecurityMarks
      name
      SecurityMarks
      nil))
  ([name SecurityMarks optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body SecurityMarks})))

(defn organizations-sources-findings-externalSystems-patch
  "Updates external system. This is for a given finding.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/sources/findings/externalSystems/patch

name <> 
GoogleCloudSecuritycenterV1ExternalSystem:
GoogleCloudSecuritycenterV1ExternalSystem

optional:
updateMask <string> The FieldMask to use when updating the external system resource. If empty all mutable fields will be updated."
  ([name GoogleCloudSecuritycenterV1ExternalSystem]
    (organizations-sources-findings-externalSystems-patch
      name
      GoogleCloudSecuritycenterV1ExternalSystem
      nil))
  ([name GoogleCloudSecuritycenterV1ExternalSystem optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1ExternalSystem})))

(defn organizations-resourceValueConfigs-batchCreate
  "Creates a ResourceValueConfig for an organization. Maps user's tags to difference resource values for use by the attack path simulation.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/resourceValueConfigs/batchCreate

parent <> 
BatchCreateResourceValueConfigsRequest:
BatchCreateResourceValueConfigsRequest"
  [parent BatchCreateResourceValueConfigsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/resourceValueConfigs:batchCreate",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BatchCreateResourceValueConfigsRequest}))

(defn organizations-resourceValueConfigs-delete
  "Deletes a ResourceValueConfig.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/resourceValueConfigs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-resourceValueConfigs-get
  "Gets a ResourceValueConfig.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/resourceValueConfigs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-resourceValueConfigs-list
  "Lists all ResourceValueConfigs.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/resourceValueConfigs/list

parent <> 

optional:
pageSize <integer> The number of results to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (organizations-resourceValueConfigs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/resourceValueConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-resourceValueConfigs-patch
  "Updates an existing ResourceValueConfigs with new rules.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/resourceValueConfigs/patch

name <> 
GoogleCloudSecuritycenterV1ResourceValueConfig:
GoogleCloudSecuritycenterV1ResourceValueConfig

optional:
updateMask <string> The list of fields to be updated. If empty all mutable fields will be updated."
  ([name GoogleCloudSecuritycenterV1ResourceValueConfig]
    (organizations-resourceValueConfigs-patch
      name
      GoogleCloudSecuritycenterV1ResourceValueConfig
      nil))
  ([name GoogleCloudSecuritycenterV1ResourceValueConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1ResourceValueConfig})))

(defn organizations-muteConfigs-create
  "Creates a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/muteConfigs/create

parent <> 
GoogleCloudSecuritycenterV1MuteConfig:
GoogleCloudSecuritycenterV1MuteConfig

optional:
muteConfigId <string> Required. Unique identifier provided by the client within the parent scope. It must consist of only lowercase letters, numbers, and hyphens, must start with a letter, must end with either a letter or a number, and must be 63 characters or less."
  ([parent GoogleCloudSecuritycenterV1MuteConfig]
    (organizations-muteConfigs-create
      parent
      GoogleCloudSecuritycenterV1MuteConfig
      nil))
  ([parent GoogleCloudSecuritycenterV1MuteConfig optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/muteConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1MuteConfig})))

(defn organizations-muteConfigs-delete
  "Deletes an existing mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/muteConfigs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-muteConfigs-get
  "Gets a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/muteConfigs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-muteConfigs-list
  "Lists mute configs.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/muteConfigs/list

parent <> 

optional:
pageSize <integer> The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (organizations-muteConfigs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/muteConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-muteConfigs-patch
  "Updates a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/muteConfigs/patch

name <> 
GoogleCloudSecuritycenterV1MuteConfig:
GoogleCloudSecuritycenterV1MuteConfig

optional:
updateMask <string> The list of fields to be updated. If empty all mutable fields will be updated."
  ([name GoogleCloudSecuritycenterV1MuteConfig]
    (organizations-muteConfigs-patch
      name
      GoogleCloudSecuritycenterV1MuteConfig
      nil))
  ([name GoogleCloudSecuritycenterV1MuteConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1MuteConfig})))

(defn organizations-notificationConfigs-create
  "Creates a notification config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/notificationConfigs/create

parent <> 
NotificationConfig:
NotificationConfig

optional:
configId <string> Required. Unique identifier provided by the client within the parent scope. It must be between 1 and 128 characters and contain alphanumeric characters, underscores, or hyphens only."
  ([parent NotificationConfig]
    (organizations-notificationConfigs-create
      parent
      NotificationConfig
      nil))
  ([parent NotificationConfig optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/notificationConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body NotificationConfig})))

(defn organizations-notificationConfigs-delete
  "Deletes a notification config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/notificationConfigs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-notificationConfigs-get
  "Gets a notification config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/notificationConfigs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-notificationConfigs-list
  "Lists notification configs.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/notificationConfigs/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent] (organizations-notificationConfigs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/notificationConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-notificationConfigs-patch
  " Updates a notification config. The following update fields are allowed: description, pubsub_topic, streaming_config.filter
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/notificationConfigs/patch

name <> 
NotificationConfig:
NotificationConfig

optional:
updateMask <string> The FieldMask to use when updating the notification config. If empty all mutable fields will be updated."
  ([name NotificationConfig]
    (organizations-notificationConfigs-patch
      name
      NotificationConfig
      nil))
  ([name NotificationConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body NotificationConfig})))

(defn organizations-findings-bulkMute
  "Kicks off an LRO to bulk mute findings for a parent based on a filter. The parent can be either an organization, folder or project. The findings matched by the filter will be muted after the LRO is done.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/findings/bulkMute

parent <> 
BulkMuteFindingsRequest:
BulkMuteFindingsRequest"
  [parent BulkMuteFindingsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/findings:bulkMute",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BulkMuteFindingsRequest}))

(defn organizations-locations-muteConfigs-create
  "Creates a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/locations/muteConfigs/create

parent <> 
GoogleCloudSecuritycenterV1MuteConfig:
GoogleCloudSecuritycenterV1MuteConfig

optional:
muteConfigId <string> Required. Unique identifier provided by the client within the parent scope. It must consist of only lowercase letters, numbers, and hyphens, must start with a letter, must end with either a letter or a number, and must be 63 characters or less."
  ([parent GoogleCloudSecuritycenterV1MuteConfig]
    (organizations-locations-muteConfigs-create
      parent
      GoogleCloudSecuritycenterV1MuteConfig
      nil))
  ([parent GoogleCloudSecuritycenterV1MuteConfig optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/muteConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1MuteConfig})))

(defn organizations-locations-muteConfigs-delete
  "Deletes an existing mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/locations/muteConfigs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-muteConfigs-get
  "Gets a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/locations/muteConfigs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-muteConfigs-list
  "Lists mute configs.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/locations/muteConfigs/list

parent <> 

optional:
pageSize <integer> The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (organizations-locations-muteConfigs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-muteConfigs-patch
  "Updates a mute config.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/locations/muteConfigs/patch

name <> 
GoogleCloudSecuritycenterV1MuteConfig:
GoogleCloudSecuritycenterV1MuteConfig

optional:
updateMask <string> The list of fields to be updated. If empty all mutable fields will be updated."
  ([name GoogleCloudSecuritycenterV1MuteConfig]
    (organizations-locations-muteConfigs-patch
      name
      GoogleCloudSecuritycenterV1MuteConfig
      nil))
  ([name GoogleCloudSecuritycenterV1MuteConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1MuteConfig})))

(defn organizations-simulations-get
  "Get the simulation by name or the latest simulation for the given organization.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/simulations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-simulations-valuedResources-get
  "Get the valued resource by name
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/simulations/valuedResources/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-simulations-valuedResources-list
  "Lists the valued resources for a set of simulation results and filter.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/simulations/valuedResources/list

parent <> 

optional:
filter <string> The filter expression that filters the valued resources in the response. Supported fields: * `resource_value` supports = * `resource_type` supports =
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
orderBy <string> Optional. The fields by which to order the valued resources response. Supported fields: * `exposed_score` * `resource_value` * `resource_type` * `resource` * `display_name` Values should be a comma separated list of fields. For example: `exposed_score,resource_value`. The default sorting order is descending. To specify ascending or descending order for a field, append a ` ASC` or a ` DESC` suffix, respectively; for example: `exposed_score DESC`."
  ([parent]
    (organizations-simulations-valuedResources-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/valuedResources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-simulations-valuedResources-attackPaths-list
  "Lists the attack paths for a set of simulation results or valued resources and filter.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/simulations/valuedResources/attackPaths/list

parent <> 

optional:
filter <string> The filter expression that filters the attack path in the response. Supported fields: * `valued_resources` supports =
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent]
    (organizations-simulations-valuedResources-attackPaths-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/attackPaths",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-simulations-attackExposureResults-valuedResources-list
  "Lists the valued resources for a set of simulation results and filter.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/simulations/attackExposureResults/valuedResources/list

parent <> 

optional:
filter <string> The filter expression that filters the valued resources in the response. Supported fields: * `resource_value` supports = * `resource_type` supports =
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
orderBy <string> Optional. The fields by which to order the valued resources response. Supported fields: * `exposed_score` * `resource_value` * `resource_type` * `resource` * `display_name` Values should be a comma separated list of fields. For example: `exposed_score,resource_value`. The default sorting order is descending. To specify ascending or descending order for a field, append a ` ASC` or a ` DESC` suffix, respectively; for example: `exposed_score DESC`."
  ([parent]
    (organizations-simulations-attackExposureResults-valuedResources-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/valuedResources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-simulations-attackExposureResults-attackPaths-list
  "Lists the attack paths for a set of simulation results or valued resources and filter.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/simulations/attackExposureResults/attackPaths/list

parent <> 

optional:
filter <string> The filter expression that filters the attack path in the response. Supported fields: * `valued_resources` supports =
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent]
    (organizations-simulations-attackExposureResults-attackPaths-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/attackPaths",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-simulations-attackPaths-list
  "Lists the attack paths for a set of simulation results or valued resources and filter.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/simulations/attackPaths/list

parent <> 

optional:
filter <string> The filter expression that filters the attack path in the response. Supported fields: * `valued_resources` supports =
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent] (organizations-simulations-attackPaths-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/attackPaths",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-eventThreatDetectionSettings-validateCustomModule
  "Validates the given Event Threat Detection custom module.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/eventThreatDetectionSettings/validateCustomModule

parent <> 
ValidateEventThreatDetectionCustomModuleRequest:
ValidateEventThreatDetectionCustomModuleRequest"
  [parent ValidateEventThreatDetectionCustomModuleRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}:validateCustomModule",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ValidateEventThreatDetectionCustomModuleRequest}))

(defn organizations-eventThreatDetectionSettings-customModules-create
  "Creates a resident Event Threat Detection custom module at the scope of the given Resource Manager parent, and also creates inherited custom modules for all descendants of the given parent. These modules are enabled by default.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/eventThreatDetectionSettings/customModules/create

parent <> 
EventThreatDetectionCustomModule:
EventThreatDetectionCustomModule"
  [parent EventThreatDetectionCustomModule]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/customModules",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body EventThreatDetectionCustomModule}))

(defn organizations-eventThreatDetectionSettings-customModules-delete
  "Deletes the specified Event Threat Detection custom module and all of its descendants in the Resource Manager hierarchy. This method is only supported for resident custom modules.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/eventThreatDetectionSettings/customModules/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-eventThreatDetectionSettings-customModules-get
  "Gets an Event Threat Detection custom module.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/eventThreatDetectionSettings/customModules/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-eventThreatDetectionSettings-customModules-listDescendant
  "Lists all resident Event Threat Detection custom modules under the given Resource Manager parent and its descendants.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/eventThreatDetectionSettings/customModules/listDescendant

parent <> 

optional:
pageSize <integer> The maximum number of modules to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent]
    (organizations-eventThreatDetectionSettings-customModules-listDescendant
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/customModules:listDescendant",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-eventThreatDetectionSettings-customModules-list
  "Lists all Event Threat Detection custom modules for the given Resource Manager parent. This includes resident modules defined at the scope of the parent along with modules inherited from ancestors.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/eventThreatDetectionSettings/customModules/list

parent <> 

optional:
pageSize <integer> The maximum number of modules to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent]
    (organizations-eventThreatDetectionSettings-customModules-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/customModules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-eventThreatDetectionSettings-customModules-patch
  "Updates the Event Threat Detection custom module with the given name based on the given update mask. Updating the enablement state is supported for both resident and inherited modules (though resident modules cannot have an enablement state of \"inherited\"). Updating the display name or configuration of a module is supported for resident modules only. The type of a module cannot be changed.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/eventThreatDetectionSettings/customModules/patch

name <> 
EventThreatDetectionCustomModule:
EventThreatDetectionCustomModule

optional:
updateMask <string> The list of fields to be updated. If empty all mutable fields will be updated."
  ([name EventThreatDetectionCustomModule]
    (organizations-eventThreatDetectionSettings-customModules-patch
      name
      EventThreatDetectionCustomModule
      nil))
  ([name EventThreatDetectionCustomModule optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body EventThreatDetectionCustomModule})))

(defn organizations-eventThreatDetectionSettings-effectiveCustomModules-get
  "Gets an effective Event Threat Detection custom module at the given level.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/eventThreatDetectionSettings/effectiveCustomModules/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-eventThreatDetectionSettings-effectiveCustomModules-list
  "Lists all effective Event Threat Detection custom modules for the given parent. This includes resident modules defined at the scope of the parent along with modules inherited from its ancestors.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/eventThreatDetectionSettings/effectiveCustomModules/list

parent <> 

optional:
pageSize <integer> The maximum number of modules to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent]
    (organizations-eventThreatDetectionSettings-effectiveCustomModules-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/effectiveCustomModules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-securityHealthAnalyticsSettings-customModules-create
  "Creates a resident SecurityHealthAnalyticsCustomModule at the scope of the given CRM parent, and also creates inherited SecurityHealthAnalyticsCustomModules for all CRM descendants of the given parent. These modules are enabled by default.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/securityHealthAnalyticsSettings/customModules/create

parent <> 
GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule:
GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule"
  [parent
   GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/customModules",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule}))

(defn organizations-securityHealthAnalyticsSettings-customModules-delete
  "Deletes the specified SecurityHealthAnalyticsCustomModule and all of its descendants in the CRM hierarchy. This method is only supported for resident custom modules.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/securityHealthAnalyticsSettings/customModules/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-securityHealthAnalyticsSettings-customModules-get
  "Retrieves a SecurityHealthAnalyticsCustomModule.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/securityHealthAnalyticsSettings/customModules/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-securityHealthAnalyticsSettings-customModules-listDescendant
  "Returns a list of all resident SecurityHealthAnalyticsCustomModules under the given CRM parent and all of the parent’s CRM descendants.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/securityHealthAnalyticsSettings/customModules/listDescendant

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent]
    (organizations-securityHealthAnalyticsSettings-customModules-listDescendant
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/customModules:listDescendant",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-securityHealthAnalyticsSettings-customModules-list
  "Returns a list of all SecurityHealthAnalyticsCustomModules for the given parent. This includes resident modules defined at the scope of the parent, and inherited modules, inherited from CRM ancestors.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/securityHealthAnalyticsSettings/customModules/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent]
    (organizations-securityHealthAnalyticsSettings-customModules-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/customModules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-securityHealthAnalyticsSettings-customModules-simulate
  "Simulates a given SecurityHealthAnalyticsCustomModule and Resource.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/securityHealthAnalyticsSettings/customModules/simulate

parent <> 
SimulateSecurityHealthAnalyticsCustomModuleRequest:
SimulateSecurityHealthAnalyticsCustomModuleRequest"
  [parent SimulateSecurityHealthAnalyticsCustomModuleRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/customModules:simulate",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SimulateSecurityHealthAnalyticsCustomModuleRequest}))

(defn organizations-securityHealthAnalyticsSettings-customModules-patch
  "Updates the SecurityHealthAnalyticsCustomModule under the given name based on the given update mask. Updating the enablement state is supported on both resident and inherited modules (though resident modules cannot have an enablement state of \"inherited\"). Updating the display name and custom config of a module is supported on resident modules only.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/securityHealthAnalyticsSettings/customModules/patch

name <> 
GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule:
GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule

optional:
updateMask <string> The list of fields to be updated. The only fields that can be updated are `enablement_state` and `custom_config`. If empty or set to the wildcard value `*`, both `enablement_state` and `custom_config` are updated."
  ([name
    GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule]
    (organizations-securityHealthAnalyticsSettings-customModules-patch
      name
      GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule
      nil))
  ([name
    GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule
    optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body
       GoogleCloudSecuritycenterV1SecurityHealthAnalyticsCustomModule})))

(defn organizations-securityHealthAnalyticsSettings-effectiveCustomModules-get
  "Retrieves an EffectiveSecurityHealthAnalyticsCustomModule.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/securityHealthAnalyticsSettings/effectiveCustomModules/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-securityHealthAnalyticsSettings-effectiveCustomModules-list
  "Returns a list of all EffectiveSecurityHealthAnalyticsCustomModules for the given parent. This includes resident modules defined at the scope of the parent, and inherited modules, inherited from CRM ancestors.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/securityHealthAnalyticsSettings/effectiveCustomModules/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent]
    (organizations-securityHealthAnalyticsSettings-effectiveCustomModules-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/effectiveCustomModules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-bigQueryExports-get
  "Gets a BigQuery export.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/bigQueryExports/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-bigQueryExports-create
  "Creates a BigQuery export.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/bigQueryExports/create

parent <> 
GoogleCloudSecuritycenterV1BigQueryExport:
GoogleCloudSecuritycenterV1BigQueryExport

optional:
bigQueryExportId <string> Required. Unique identifier provided by the client within the parent scope. It must consist of only lowercase letters, numbers, and hyphens, must start with a letter, must end with either a letter or a number, and must be 63 characters or less."
  ([parent GoogleCloudSecuritycenterV1BigQueryExport]
    (organizations-bigQueryExports-create
      parent
      GoogleCloudSecuritycenterV1BigQueryExport
      nil))
  ([parent GoogleCloudSecuritycenterV1BigQueryExport optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/bigQueryExports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1BigQueryExport})))

(defn organizations-bigQueryExports-delete
  "Deletes an existing BigQuery export.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/bigQueryExports/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-bigQueryExports-patch
  "Updates a BigQuery export.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/bigQueryExports/patch

name <> 
GoogleCloudSecuritycenterV1BigQueryExport:
GoogleCloudSecuritycenterV1BigQueryExport

optional:
updateMask <string> The list of fields to be updated. If empty all mutable fields will be updated."
  ([name GoogleCloudSecuritycenterV1BigQueryExport]
    (organizations-bigQueryExports-patch
      name
      GoogleCloudSecuritycenterV1BigQueryExport
      nil))
  ([name GoogleCloudSecuritycenterV1BigQueryExport optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudSecuritycenterV1BigQueryExport})))

(defn organizations-bigQueryExports-list
  "Lists BigQuery exports. Note that when requesting BigQuery exports at a given level all exports under that level are also returned e.g. if requesting BigQuery exports under a folder, then all BigQuery exports immediately under the folder plus the ones created under the projects within the folder are returned.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/bigQueryExports/list

parent <> 

optional:
pageSize <integer> The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (organizations-bigQueryExports-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/bigQueryExports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-assets-group
  "Filters an organization's assets and groups them by their specified properties.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/assets/group

parent <> 
GroupAssetsRequest:
GroupAssetsRequest"
  [parent GroupAssetsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/assets:group",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GroupAssetsRequest}))

(defn organizations-assets-list
  "Lists an organization's assets.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/assets/list

parent <> 

optional:
filter <string> Expression that defines the filter to apply across assets. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. The fields map to those defined in the Asset resource. Examples include: * name * security_center_properties.resource_name * resource_properties.a_property * security_marks.marks.marka The supported operators are: * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes. The following are the allowed field and operator combinations: * name: `=` * update_time: `=`, `>`, `<`, `>=`, `<=` Usage: This should be milliseconds since epoch or an RFC3339 string. Examples: `update_time = \"2019-06-10T16:07:18-07:00\"` `update_time = 1560208038000` * create_time: `=`, `>`, `<`, `>=`, `<=` Usage: This should be milliseconds since epoch or an RFC3339 string. Examples: `create_time = \"2019-06-10T16:07:18-07:00\"` `create_time = 1560208038000` * iam_policy.policy_blob: `=`, `:` * resource_properties: `=`, `:`, `>`, `<`, `>=`, `<=` * security_marks.marks: `=`, `:` * security_center_properties.resource_name: `=`, `:` * security_center_properties.resource_display_name: `=`, `:` * security_center_properties.resource_type: `=`, `:` * security_center_properties.resource_parent: `=`, `:` * security_center_properties.resource_parent_display_name: `=`, `:` * security_center_properties.resource_project: `=`, `:` * security_center_properties.resource_project_display_name: `=`, `:` * security_center_properties.resource_owners: `=`, `:` For example, `resource_properties.size = 100` is a valid filter string. Use a partial match on the empty string to filter based on a property existing: `resource_properties.my_property : \"\"` Use a negated partial match on the empty string to filter based on a property not existing: `-resource_properties.my_property : \"\"`
orderBy <string> Expression that defines what fields and order to use for sorting. The string value should follow SQL syntax: comma separated list of fields. For example: \"name,resource_properties.a_property\". The default sorting order is ascending. To specify descending order for a field, a suffix \" desc\" should be appended to the field name. For example: \"name desc,resource_properties.a_property\". Redundant space characters in the syntax are insignificant. \"name desc,resource_properties.a_property\" and \" name desc , resource_properties.a_property \" are equivalent. The following fields are supported: name update_time resource_properties security_marks.marks security_center_properties.resource_name security_center_properties.resource_display_name security_center_properties.resource_parent security_center_properties.resource_parent_display_name security_center_properties.resource_project security_center_properties.resource_project_display_name security_center_properties.resource_type
readTime <string> Time used as a reference point when filtering assets. The filter is limited to assets existing at the supplied time and their values are those at that specific time. Absence of this field will default to the API's version of NOW.
compareDuration <string> When compare_duration is set, the ListAssetsResult's \"state_change\" attribute is updated to indicate whether the asset was added, removed, or remained present during the compare_duration period of time that precedes the read_time. This is the time between (read_time - compare_duration) and read_time. The state_change value is derived based on the presence of the asset at the two points in time. Intermediate state changes between the two times don't affect the result. For example, the results aren't affected if the asset is removed and re-created again. Possible \"state_change\" values when compare_duration is specified: * \"ADDED\": indicates that the asset was not present at the start of compare_duration, but present at read_time. * \"REMOVED\": indicates that the asset was present at the start of compare_duration, but not present at read_time. * \"ACTIVE\": indicates that the asset was present at both the start and the end of the time period defined by compare_duration and read_time. If compare_duration is not specified, then the only possible state_change is \"UNUSED\", which will be the state_change set for all assets present at read_time.
fieldMask <string> A field mask to specify the ListAssetsResult fields to be listed in the response. An empty field mask will list all fields.
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000."
  ([parent] (organizations-assets-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/assets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-assets-runDiscovery
  "Runs asset discovery. The discovery is tracked with a long-running operation. This API can only be called with limited frequency for an organization. If it is called too frequently the caller will receive a TOO_MANY_REQUESTS error.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/assets/runDiscovery

parent <> 
RunAssetDiscoveryRequest:
RunAssetDiscoveryRequest"
  [parent RunAssetDiscoveryRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+parent}/assets:runDiscovery",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RunAssetDiscoveryRequest}))

(defn organizations-assets-updateSecurityMarks
  "Updates security marks.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/assets/updateSecurityMarks

name <> 
SecurityMarks:
SecurityMarks

optional:
updateMask <string> The FieldMask to use when updating the security marks resource. The field mask must not contain duplicate fields. If empty or set to \"marks\", all marks will be replaced. Individual marks can be updated using \"marks.\".
startTime <string> The time at which the updated SecurityMarks take effect. If not set uses current server time. Updates will be applied to the SecurityMarks that are active immediately preceding this time. Must be earlier or equal to the server time."
  ([name SecurityMarks]
    (organizations-assets-updateSecurityMarks name SecurityMarks nil))
  ([name SecurityMarks optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body SecurityMarks})))

(defn organizations-valuedResources-list
  "Lists the valued resources for a set of simulation results and filter.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/valuedResources/list

parent <> 

optional:
filter <string> The filter expression that filters the valued resources in the response. Supported fields: * `resource_value` supports = * `resource_type` supports =
pageSize <integer> The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
orderBy <string> Optional. The fields by which to order the valued resources response. Supported fields: * `exposed_score` * `resource_value` * `resource_type` * `resource` * `display_name` Values should be a comma separated list of fields. For example: `exposed_score,resource_value`. The default sorting order is descending. To specify ascending or descending order for a field, append a ` ASC` or a ` DESC` suffix, respectively; for example: `exposed_score DESC`."
  ([parent] (organizations-valuedResources-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+parent}/valuedResources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (organizations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://securitycenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://securitycenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/security/products/security-command-center/v1/reference/rest/v1/organizations/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://securitycenter.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
