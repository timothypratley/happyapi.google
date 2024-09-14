(ns happyapi.google.displayvideo-v3
  "Display & Video 360 API
Display & Video 360 API allows users to automate complex Display & Video 360 workflows, such as creating insertion orders and setting targeting options for individual line items.
See: https://developers.google.com/display-video/api/guides/getting-started/overview")

(defn inventorySourceGroups-get
  "Gets an inventory source group.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/inventorySourceGroups/get

inventorySourceGroupId <> 

optional:
partnerId <string> The ID of the partner that has access to the inventory source group. A partner cannot access an advertiser-owned inventory source group.
advertiserId <string> The ID of the advertiser that has access to the inventory source group. If an inventory source group is partner-owned, only advertisers to which the group is explicitly shared can access the group."
  ([inventorySourceGroupId]
    (inventorySourceGroups-get inventorySourceGroupId nil))
  ([inventorySourceGroupId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/inventorySourceGroups/{+inventorySourceGroupId}",
     :uri-template-args
     {"inventorySourceGroupId" inventorySourceGroupId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn inventorySourceGroups-list
  "Lists inventory source groups that are accessible to the current user. The order is defined by the order_by parameter.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/inventorySourceGroups/list

optional:
partnerId <string> The ID of the partner that has access to the inventory source group. A partner cannot access advertiser-owned inventory source groups.
advertiserId <string> The ID of the advertiser that has access to the inventory source group. If an inventory source group is partner-owned, only advertisers to which the group is explicitly shared can access the group.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`.
orderBy <string> Field by which to sort the list. Acceptable values are: * `displayName` (default) * `inventorySourceGroupId` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. For example, `displayName desc`.
filter <string> Allows filtering by inventory source group fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR`. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `inventorySourceGroupId` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([] (inventorySourceGroups-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/inventorySourceGroups",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn inventorySourceGroups-create
  "Creates a new inventory source group. Returns the newly created inventory source group if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/inventorySourceGroups/create

InventorySourceGroup:
InventorySourceGroup

optional:
partnerId <string> The ID of the partner that owns the inventory source group. Only this partner will have write access to this group. Only advertisers to which this group is explicitly shared will have read access to this group.
advertiserId <string> The ID of the advertiser that owns the inventory source group. The parent partner will not have access to this group."
  ([InventorySourceGroup]
    (inventorySourceGroups-create InventorySourceGroup nil))
  ([InventorySourceGroup optional]
    {:method :post,
     :uri-template
     "https://displayvideo.googleapis.com/v3/inventorySourceGroups",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body InventorySourceGroup}))

(defn inventorySourceGroups-patch
  "Updates an inventory source group. Returns the updated inventory source group if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/inventorySourceGroups/patch

inventorySourceGroupId <> 
InventorySourceGroup:
InventorySourceGroup

optional:
partnerId <string> The ID of the partner that owns the inventory source group. Only this partner has write access to this group.
advertiserId <string> The ID of the advertiser that owns the inventory source group. The parent partner does not have access to this group.
updateMask <string> Required. The mask to control which fields to update."
  ([inventorySourceGroupId InventorySourceGroup]
    (inventorySourceGroups-patch
      inventorySourceGroupId
      InventorySourceGroup
      nil))
  ([inventorySourceGroupId InventorySourceGroup optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/inventorySourceGroups/{inventorySourceGroupId}",
     :uri-template-args
     {"inventorySourceGroupId" inventorySourceGroupId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body InventorySourceGroup}))

(defn inventorySourceGroups-delete
  "Deletes an inventory source group.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/inventorySourceGroups/delete

inventorySourceGroupId <> 

optional:
partnerId <string> The ID of the partner that owns the inventory source group. Only this partner has write access to this group.
advertiserId <string> The ID of the advertiser that owns the inventory source group. The parent partner does not have access to this group."
  ([inventorySourceGroupId]
    (inventorySourceGroups-delete inventorySourceGroupId nil))
  ([inventorySourceGroupId optional]
    {:method :delete,
     :uri-template
     "https://displayvideo.googleapis.com/v3/inventorySourceGroups/{+inventorySourceGroupId}",
     :uri-template-args
     {"inventorySourceGroupId" inventorySourceGroupId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn inventorySourceGroups-assignedInventorySources-list
  "Lists inventory sources assigned to an inventory source group.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/inventorySourceGroups/assignedInventorySources/list

inventorySourceGroupId <> 

optional:
partnerId <string> The ID of the partner that has access to the assignment. If the parent inventory source group is advertiser-owned, the assignment cannot be accessed via a partner.
advertiserId <string> The ID of the advertiser that has access to the assignment. If the parent inventory source group is partner-owned, only advertisers to which the parent group is explicitly shared can access the assigned inventory source.
pageSize <integer> Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `assignedInventorySourceId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \" desc\" should be added to the field name. Example: `assignedInventorySourceId desc`.
filter <string> Allows filtering by assigned inventory source fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the `OR` logical operator. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `assignedInventorySourceId` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([inventorySourceGroupId]
    (inventorySourceGroups-assignedInventorySources-list
      inventorySourceGroupId
      nil))
  ([inventorySourceGroupId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/inventorySourceGroups/{+inventorySourceGroupId}/assignedInventorySources",
     :uri-template-args
     {"inventorySourceGroupId" inventorySourceGroupId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn inventorySourceGroups-assignedInventorySources-create
  "Creates an assignment between an inventory source and an inventory source group.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/inventorySourceGroups/assignedInventorySources/create

inventorySourceGroupId <> 
AssignedInventorySource:
AssignedInventorySource

optional:
partnerId <string> The ID of the partner that owns the parent inventory source group. Only this partner will have write access to this assigned inventory source.
advertiserId <string> The ID of the advertiser that owns the parent inventory source group. The parent partner will not have access to this assigned inventory source."
  ([inventorySourceGroupId AssignedInventorySource]
    (inventorySourceGroups-assignedInventorySources-create
      inventorySourceGroupId
      AssignedInventorySource
      nil))
  ([inventorySourceGroupId AssignedInventorySource optional]
    {:method :post,
     :uri-template
     "https://displayvideo.googleapis.com/v3/inventorySourceGroups/{+inventorySourceGroupId}/assignedInventorySources",
     :uri-template-args
     {"inventorySourceGroupId" inventorySourceGroupId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body AssignedInventorySource}))

(defn inventorySourceGroups-assignedInventorySources-delete
  "Deletes the assignment between an inventory source and an inventory source group.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/inventorySourceGroups/assignedInventorySources/delete

inventorySourceGroupId <> 
assignedInventorySourceId <> 

optional:
partnerId <string> The ID of the partner that owns the parent inventory source group. Only this partner has write access to this assigned inventory source.
advertiserId <string> The ID of the advertiser that owns the parent inventory source group. The parent partner does not have access to this assigned inventory source."
  ([inventorySourceGroupId assignedInventorySourceId]
    (inventorySourceGroups-assignedInventorySources-delete
      inventorySourceGroupId
      assignedInventorySourceId
      nil))
  ([inventorySourceGroupId assignedInventorySourceId optional]
    {:method :delete,
     :uri-template
     "https://displayvideo.googleapis.com/v3/inventorySourceGroups/{+inventorySourceGroupId}/assignedInventorySources/{+assignedInventorySourceId}",
     :uri-template-args
     {"inventorySourceGroupId" inventorySourceGroupId,
      "assignedInventorySourceId" assignedInventorySourceId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn inventorySourceGroups-assignedInventorySources-bulkEdit
  "Bulk edits multiple assignments between inventory sources and a single inventory source group. The operation will delete the assigned inventory sources provided in BulkEditAssignedInventorySourcesRequest.deleted_assigned_inventory_sources and then create the assigned inventory sources provided in BulkEditAssignedInventorySourcesRequest.created_assigned_inventory_sources.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/inventorySourceGroups/assignedInventorySources/bulkEdit

inventorySourceGroupId <> 
BulkEditAssignedInventorySourcesRequest:
BulkEditAssignedInventorySourcesRequest"
  [inventorySourceGroupId BulkEditAssignedInventorySourcesRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/inventorySourceGroups/{+inventorySourceGroupId}/assignedInventorySources:bulkEdit",
   :uri-template-args
   {"inventorySourceGroupId" inventorySourceGroupId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body BulkEditAssignedInventorySourcesRequest})

(defn floodlightGroups-get
  "Gets a Floodlight group.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/floodlightGroups/get

floodlightGroupId <> 

optional:
partnerId <string> Required. The partner context by which the Floodlight group is being accessed."
  ([floodlightGroupId] (floodlightGroups-get floodlightGroupId nil))
  ([floodlightGroupId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/floodlightGroups/{+floodlightGroupId}",
     :uri-template-args {"floodlightGroupId" floodlightGroupId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn floodlightGroups-patch
  "Updates an existing Floodlight group. Returns the updated Floodlight group if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/floodlightGroups/patch

floodlightGroupId <> 
FloodlightGroup:
FloodlightGroup

optional:
partnerId <string> Required. The partner context by which the Floodlight group is being accessed.
updateMask <string> Required. The mask to control which fields to update."
  ([floodlightGroupId FloodlightGroup]
    (floodlightGroups-patch floodlightGroupId FloodlightGroup nil))
  ([floodlightGroupId FloodlightGroup optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/floodlightGroups/{floodlightGroupId}",
     :uri-template-args {"floodlightGroupId" floodlightGroupId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body FloodlightGroup}))

(defn floodlightGroups-floodlightActivities-get
  "Gets a Floodlight activity.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/floodlightGroups/floodlightActivities/get

floodlightGroupId <> 
floodlightActivityId <> 

optional:
partnerId <string> Required. The ID of the partner through which the Floodlight activity is being accessed."
  ([floodlightGroupId floodlightActivityId]
    (floodlightGroups-floodlightActivities-get
      floodlightGroupId
      floodlightActivityId
      nil))
  ([floodlightGroupId floodlightActivityId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/floodlightGroups/{+floodlightGroupId}/floodlightActivities/{+floodlightActivityId}",
     :uri-template-args
     {"floodlightGroupId" floodlightGroupId,
      "floodlightActivityId" floodlightActivityId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn floodlightGroups-floodlightActivities-list
  "Lists Floodlight activities in a Floodlight group.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/floodlightGroups/floodlightActivities/list

floodlightGroupId <> 

optional:
partnerId <string> Required. The ID of the partner through which the Floodlight activities are being accessed.
pageSize <integer> Optional. Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Optional. Field by which to sort the list. Acceptable values are: * `displayName` (default) * `floodlightActivityId` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `displayName desc`."
  ([floodlightGroupId]
    (floodlightGroups-floodlightActivities-list floodlightGroupId nil))
  ([floodlightGroupId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/floodlightGroups/{+floodlightGroupId}/floodlightActivities",
     :uri-template-args {"floodlightGroupId" floodlightGroupId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn media-upload
  "Uploads media. Upload is supported on the URI `/upload/media/{resource_name=**}?upload_type=media.` **Note**: Upload requests will not be successful without including `upload_type=media` query string.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/media/upload

resourceName <> 
GoogleBytestreamMedia:
GoogleBytestreamMedia"
  [resourceName GoogleBytestreamMedia]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/media/{+resourceName}",
   :uri-template-args {"resourceName" resourceName},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/display-video"
    "https://www.googleapis.com/auth/doubleclickbidmanager"],
   :body GoogleBytestreamMedia})

(defn media-download
  "Downloads media. Download is supported on the URI `/download/{resource_name=**}?alt=media.` **Note**: Download requests will not be successful without including `alt=media` query string.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/media/download

resourceName <> "
  [resourceName]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/download/{+resourceName}",
   :uri-template-args {"resourceName" resourceName},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/display-video"
    "https://www.googleapis.com/auth/doubleclickbidmanager"]})

(defn advertisers-listAssignedTargetingOptions
  "Lists assigned targeting options of an advertiser across targeting types.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/listAssignedTargetingOptions

advertiserId <> 

optional:
pageSize <integer> Requested page size. The size must be an integer between `1` and `5000`. If unspecified, the default is '5000'. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `targetingType` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `targetingType desc`.
filter <string> Allows filtering by assigned targeting option fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the `OR` logical operator. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=) operator`. Supported fields: * `targetingType` Examples: * targetingType with value TARGETING_TYPE_CHANNEL `targetingType=\"TARGETING_TYPE_CHANNEL\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId]
    (advertisers-listAssignedTargetingOptions advertiserId nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}:listAssignedTargetingOptions",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-editAssignedTargetingOptions
  "Edits targeting options under a single advertiser. The operation will delete the assigned targeting options provided in BulkEditAdvertiserAssignedTargetingOptionsRequest.delete_requests and then create the assigned targeting options provided in BulkEditAdvertiserAssignedTargetingOptionsRequest.create_requests .
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/editAssignedTargetingOptions

advertiserId <> 
BulkEditAdvertiserAssignedTargetingOptionsRequest:
BulkEditAdvertiserAssignedTargetingOptionsRequest"
  [advertiserId BulkEditAdvertiserAssignedTargetingOptionsRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}:editAssignedTargetingOptions",
   :uri-template-args {"advertiserId" advertiserId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body BulkEditAdvertiserAssignedTargetingOptionsRequest})

(defn advertisers-get
  "Gets an advertiser.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/get

advertiserId <> "
  [advertiserId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}",
   :uri-template-args {"advertiserId" advertiserId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-list
  "Lists advertisers that are accessible to the current user. The order is defined by the order_by parameter. A single partner_id is required. Cross-partner listing is not supported.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/list

optional:
partnerId <string> Required. The ID of the partner that the fetched advertisers should all belong to. The system only supports listing advertisers for one partner at a time.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`.
orderBy <string> Field by which to sort the list. Acceptable values are: * `displayName` (default) * `entityStatus` * `updateTime` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. For example, `displayName desc`.
filter <string> Allows filtering by advertiser fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. * A restriction has the form of `{field} {operator} {value}`. * The `updateTime` field must use the `GREATER THAN OR EQUAL TO (>=)` or `LESS THAN OR EQUAL TO (<=)` operators. * All other fields must use the `EQUALS (=)` operator. Supported fields: * `advertiserId` * `displayName` * `entityStatus` * `updateTime` (input in ISO 8601 format, or `YYYY-MM-DDTHH:MM:SSZ`) Examples: * All active advertisers under a partner: `entityStatus=\"ENTITY_STATUS_ACTIVE\"` * All advertisers with an update time less than or equal to 2020-11-04T18:54:47Z (format of ISO 8601): `updateTime<=\"2020-11-04T18:54:47Z\"` * All advertisers with an update time greater than or equal to 2020-11-04T18:54:47Z (format of ISO 8601): `updateTime>=\"2020-11-04T18:54:47Z\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([] (advertisers-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-create
  "Creates a new advertiser. Returns the newly created advertiser if successful. **This method regularly experiences high latency.** We recommend [increasing your default timeout](/display-video/api/guides/best-practices/timeouts#client_library_timeout) to avoid errors.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/create

Advertiser:
Advertiser"
  [Advertiser]
  {:method :post,
   :uri-template "https://displayvideo.googleapis.com/v3/advertisers",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body Advertiser})

(defn advertisers-patch
  "Updates an existing advertiser. Returns the updated advertiser if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/patch

advertiserId <> 
Advertiser:
Advertiser

optional:
updateMask <string> Required. The mask to control which fields to update."
  ([advertiserId Advertiser]
    (advertisers-patch advertiserId Advertiser nil))
  ([advertiserId Advertiser optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body Advertiser}))

(defn advertisers-delete
  "Deletes an advertiser. Deleting an advertiser will delete all of its child resources, for example, campaigns, insertion orders and line items. A deleted advertiser cannot be recovered.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/delete

advertiserId <> "
  [advertiserId]
  {:method :delete,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}",
   :uri-template-args {"advertiserId" advertiserId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-audit
  "Audits an advertiser. Returns the counts of used entities per resource type under the advertiser provided. Used entities count towards their respective resource limit. See https://support.google.com/displayvideo/answer/6071450.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/audit

advertiserId <> 

optional:
readMask <string> Optional. The specific fields to return. If no mask is specified, all fields in the response proto will be filled. Valid values are: * usedLineItemsCount * usedInsertionOrdersCount * usedCampaignsCount * channelsCount * negativelyTargetedChannelsCount * negativeKeywordListsCount * adGroupCriteriaCount * campaignCriteriaCount"
  ([advertiserId] (advertisers-audit advertiserId nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}:audit",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-insertionOrders-listAssignedTargetingOptions
  "Lists assigned targeting options of an insertion order across targeting types.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/insertionOrders/listAssignedTargetingOptions

advertiserId <> 
insertionOrderId <> 

optional:
pageSize <integer> Requested page size. The size must be an integer between `1` and `5000`. If unspecified, the default is `5000`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `targetingType` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `targetingType desc`.
filter <string> Allows filtering by assigned targeting option fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR`. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `targetingType` * `inheritance` Examples: * `AssignedTargetingOption` resources of targeting type `TARGETING_TYPE_PROXIMITY_LOCATION_LIST` or `TARGETING_TYPE_CHANNEL`: `targetingType=\"TARGETING_TYPE_PROXIMITY_LOCATION_LIST\" OR targetingType=\"TARGETING_TYPE_CHANNEL\"` * `AssignedTargetingOption` resources with inheritance status of `NOT_INHERITED` or `INHERITED_FROM_PARTNER`: `inheritance=\"NOT_INHERITED\" OR inheritance=\"INHERITED_FROM_PARTNER\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId insertionOrderId]
    (advertisers-insertionOrders-listAssignedTargetingOptions
      advertiserId
      insertionOrderId
      nil))
  ([advertiserId insertionOrderId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/insertionOrders/{+insertionOrderId}:listAssignedTargetingOptions",
     :uri-template-args
     {"advertiserId" advertiserId,
      "insertionOrderId" insertionOrderId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-insertionOrders-get
  "Gets an insertion order. Returns error code `NOT_FOUND` if the insertion order does not exist.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/insertionOrders/get

advertiserId <> 
insertionOrderId <> "
  [advertiserId insertionOrderId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/insertionOrders/{+insertionOrderId}",
   :uri-template-args
   {"advertiserId" advertiserId, "insertionOrderId" insertionOrderId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-insertionOrders-list
  "Lists insertion orders in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, insertion orders with `ENTITY_STATUS_ARCHIVED` will not be included in the results.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/insertionOrders/list

advertiserId <> 

optional:
pageSize <integer> Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * \"displayName\" (default) * \"entityStatus\" * \"updateTime\" The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `displayName desc`.
filter <string> Allows filtering by insertion order fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * The `updateTime` field must use the `GREATER THAN OR EQUAL TO (>=)` or `LESS THAN OR EQUAL TO (<=)` operators. * All other fields must use the `EQUALS (=)` operator. Supported fields: * `campaignId` * `displayName` * `entityStatus` * `updateTime` (input in ISO 8601 format, or `YYYY-MM-DDTHH:MM:SSZ`) Examples: * All insertion orders under a campaign: `campaignId=\"1234\"` * All `ENTITY_STATUS_ACTIVE` or `ENTITY_STATUS_PAUSED` insertion orders under an advertiser: `(entityStatus=\"ENTITY_STATUS_ACTIVE\" OR entityStatus=\"ENTITY_STATUS_PAUSED\")` * All insertion orders with an update time less than or equal to 2020-11-04T18:54:47Z (format of ISO 8601): `updateTime<=\"2020-11-04T18:54:47Z\"` * All insertion orders with an update time greater than or equal to 2020-11-04T18:54:47Z (format of ISO 8601): `updateTime>=\"2020-11-04T18:54:47Z\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId] (advertisers-insertionOrders-list advertiserId nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/insertionOrders",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-insertionOrders-create
  "Creates a new insertion order. Returns the newly created insertion order if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/insertionOrders/create

advertiserId <> 
InsertionOrder:
InsertionOrder"
  [advertiserId InsertionOrder]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/insertionOrders",
   :uri-template-args {"advertiserId" advertiserId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body InsertionOrder})

(defn advertisers-insertionOrders-patch
  "Updates an existing insertion order. Returns the updated insertion order if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/insertionOrders/patch

advertiserId <> 
insertionOrderId <> 
InsertionOrder:
InsertionOrder

optional:
updateMask <string> Required. The mask to control which fields to update."
  ([advertiserId insertionOrderId InsertionOrder]
    (advertisers-insertionOrders-patch
      advertiserId
      insertionOrderId
      InsertionOrder
      nil))
  ([advertiserId insertionOrderId InsertionOrder optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/insertionOrders/{+insertionOrderId}",
     :uri-template-args
     {"advertiserId" advertiserId,
      "insertionOrderId" insertionOrderId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body InsertionOrder}))

(defn advertisers-insertionOrders-delete
  "Deletes an insertion order. Returns error code `NOT_FOUND` if the insertion order does not exist. The insertion order should be archived first, i.e. set entity_status to `ENTITY_STATUS_ARCHIVED`, to be able to delete it.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/insertionOrders/delete

advertiserId <> 
insertionOrderId <> "
  [advertiserId insertionOrderId]
  {:method :delete,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/insertionOrders/{+insertionOrderId}",
   :uri-template-args
   {"advertiserId" advertiserId, "insertionOrderId" insertionOrderId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-insertionOrders-targetingTypes-assignedTargetingOptions-get
  "Gets a single targeting option assigned to an insertion order.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/insertionOrders/targetingTypes/assignedTargetingOptions/get

advertiserId <> 
insertionOrderId <> 
targetingType <> 
assignedTargetingOptionId <> "
  [advertiserId
   insertionOrderId
   targetingType
   assignedTargetingOptionId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/insertionOrders/{+insertionOrderId}/targetingTypes/{+targetingType}/assignedTargetingOptions/{+assignedTargetingOptionId}",
   :uri-template-args
   {"advertiserId" advertiserId,
    "insertionOrderId" insertionOrderId,
    "targetingType" targetingType,
    "assignedTargetingOptionId" assignedTargetingOptionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-insertionOrders-targetingTypes-assignedTargetingOptions-list
  "Lists the targeting options assigned to an insertion order.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/insertionOrders/targetingTypes/assignedTargetingOptions/list

advertiserId <> 
insertionOrderId <> 
targetingType <> 

optional:
pageSize <integer> Requested page size. Must be between `1` and `5000`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `assignedTargetingOptionId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `assignedTargetingOptionId desc`.
filter <string> Allows filtering by assigned targeting option fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR`. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `assignedTargetingOptionId` * `inheritance` Examples: * `AssignedTargetingOption` resources with ID 1 or 2: `assignedTargetingOptionId=\"1\" OR assignedTargetingOptionId=\"2\"` * `AssignedTargetingOption` resources with inheritance status of `NOT_INHERITED` or `INHERITED_FROM_PARTNER`: `inheritance=\"NOT_INHERITED\" OR inheritance=\"INHERITED_FROM_PARTNER\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId insertionOrderId targetingType]
    (advertisers-insertionOrders-targetingTypes-assignedTargetingOptions-list
      advertiserId
      insertionOrderId
      targetingType
      nil))
  ([advertiserId insertionOrderId targetingType optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/insertionOrders/{+insertionOrderId}/targetingTypes/{+targetingType}/assignedTargetingOptions",
     :uri-template-args
     {"advertiserId" advertiserId,
      "insertionOrderId" insertionOrderId,
      "targetingType" targetingType},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-insertionOrders-targetingTypes-assignedTargetingOptions-create
  "Assigns a targeting option to an insertion order. Returns the assigned targeting option if successful. Supported targeting types: * `TARGETING_TYPE_AGE_RANGE` * `TARGETING_TYPE_BROWSER` * `TARGETING_TYPE_CATEGORY` * `TARGETING_TYPE_CHANNEL` * `TARGETING_TYPE_DEVICE_MAKE_MODEL` * `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION` * `TARGETING_TYPE_ENVIRONMENT` * `TARGETING_TYPE_GENDER` * `TARGETING_TYPE_KEYWORD` * `TARGETING_TYPE_LANGUAGE` * `TARGETING_TYPE_NEGATIVE_KEYWORD_LIST` * `TARGETING_TYPE_OPERATING_SYSTEM` * `TARGETING_TYPE_PARENTAL_STATUS` * `TARGETING_TYPE_SENSITIVE_CATEGORY_EXCLUSION` * `TARGETING_TYPE_VIEWABILITY`
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/insertionOrders/targetingTypes/assignedTargetingOptions/create

advertiserId <> 
insertionOrderId <> 
targetingType <> 
AssignedTargetingOption:
AssignedTargetingOption"
  [advertiserId insertionOrderId targetingType AssignedTargetingOption]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/insertionOrders/{+insertionOrderId}/targetingTypes/{+targetingType}/assignedTargetingOptions",
   :uri-template-args
   {"advertiserId" advertiserId,
    "insertionOrderId" insertionOrderId,
    "targetingType" targetingType},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body AssignedTargetingOption})

(defn advertisers-insertionOrders-targetingTypes-assignedTargetingOptions-delete
  "Deletes an assigned targeting option from an insertion order. Supported targeting types: * `TARGETING_TYPE_AGE_RANGE` * `TARGETING_TYPE_BROWSER` * `TARGETING_TYPE_CATEGORY` * `TARGETING_TYPE_CHANNEL` * `TARGETING_TYPE_DEVICE_MAKE_MODEL` * `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION` * `TARGETING_TYPE_ENVIRONMENT` * `TARGETING_TYPE_GENDER` * `TARGETING_TYPE_KEYWORD` * `TARGETING_TYPE_LANGUAGE` * `TARGETING_TYPE_NEGATIVE_KEYWORD_LIST` * `TARGETING_TYPE_OPERATING_SYSTEM` * `TARGETING_TYPE_PARENTAL_STATUS` * `TARGETING_TYPE_SENSITIVE_CATEGORY_EXCLUSION` * `TARGETING_TYPE_VIEWABILITY`
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/insertionOrders/targetingTypes/assignedTargetingOptions/delete

advertiserId <> 
insertionOrderId <> 
targetingType <> 
assignedTargetingOptionId <> "
  [advertiserId
   insertionOrderId
   targetingType
   assignedTargetingOptionId]
  {:method :delete,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/insertionOrders/{+insertionOrderId}/targetingTypes/{+targetingType}/assignedTargetingOptions/{+assignedTargetingOptionId}",
   :uri-template-args
   {"advertiserId" advertiserId,
    "insertionOrderId" insertionOrderId,
    "targetingType" targetingType,
    "assignedTargetingOptionId" assignedTargetingOptionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-lineItems-bulkEditAssignedTargetingOptions
  "Bulk edits targeting options under multiple line items. The operation will delete the assigned targeting options provided in BulkEditAssignedTargetingOptionsRequest.delete_requests and then create the assigned targeting options provided in BulkEditAssignedTargetingOptionsRequest.create_requests. Requests to this endpoint cannot be made concurrently with the following requests updating the same line item: * lineItems.bulkUpdate * lineItems.patch * assignedTargetingOptions.create * assignedTargetingOptions.delete YouTube & Partners line items cannot be created or updated using the API.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/lineItems/bulkEditAssignedTargetingOptions

advertiserId <> 
BulkEditAssignedTargetingOptionsRequest:
BulkEditAssignedTargetingOptionsRequest"
  [advertiserId BulkEditAssignedTargetingOptionsRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/lineItems:bulkEditAssignedTargetingOptions",
   :uri-template-args {"advertiserId" advertiserId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body BulkEditAssignedTargetingOptionsRequest})

(defn advertisers-lineItems-list
  "Lists line items in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, line items with `ENTITY_STATUS_ARCHIVED` will not be included in the results.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/lineItems/list

advertiserId <> 

optional:
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `displayName` (default) * `entityStatus` * `updateTime` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `displayName desc`.
filter <string> Allows filtering by line item fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * The `updateTime` field must use the `GREATER THAN OR EQUAL TO (>=)` or `LESS THAN OR EQUAL TO (<=)` operators. * All other fields must use the `EQUALS (=)` operator. Supported fields: * `campaignId` * `displayName` * `entityStatus` * `insertionOrderId` * `lineItemId` * `lineItemType` * `updateTime` (input in ISO 8601 format, or `YYYY-MM-DDTHH:MM:SSZ`) Examples: * All line items under an insertion order: `insertionOrderId=\"1234\"` * All `ENTITY_STATUS_ACTIVE` or `ENTITY_STATUS_PAUSED` and `LINE_ITEM_TYPE_DISPLAY_DEFAULT` line items under an advertiser: `(entityStatus=\"ENTITY_STATUS_ACTIVE\" OR entityStatus=\"ENTITY_STATUS_PAUSED\") AND lineItemType=\"LINE_ITEM_TYPE_DISPLAY_DEFAULT\"` * All line items with an update time less than or equal to 2020-11-04T18:54:47Z (format of ISO 8601): `updateTime<=\"2020-11-04T18:54:47Z\"` * All line items with an update time greater than or equal to 2020-11-04T18:54:47Z (format of ISO 8601): `updateTime>=\"2020-11-04T18:54:47Z\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId] (advertisers-lineItems-list advertiserId nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/lineItems",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-lineItems-delete
  "Deletes a line item. Returns error code `NOT_FOUND` if the line item does not exist. The line item should be archived first, i.e. set entity_status to `ENTITY_STATUS_ARCHIVED`, to be able to delete it. YouTube & Partners line items cannot be created or updated using the API.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/lineItems/delete

advertiserId <> 
lineItemId <> "
  [advertiserId lineItemId]
  {:method :delete,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/lineItems/{+lineItemId}",
   :uri-template-args
   {"advertiserId" advertiserId, "lineItemId" lineItemId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-lineItems-duplicate
  "Duplicates a line item. Returns the ID of the created line item if successful. YouTube & Partners line items cannot be created or updated using the API. **This method regularly experiences high latency.** We recommend [increasing your default timeout](/display-video/api/guides/best-practices/timeouts#client_library_timeout) to avoid errors.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/lineItems/duplicate

advertiserId <> 
lineItemId <> 
DuplicateLineItemRequest:
DuplicateLineItemRequest"
  [advertiserId lineItemId DuplicateLineItemRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/lineItems/{+lineItemId}:duplicate",
   :uri-template-args
   {"advertiserId" advertiserId, "lineItemId" lineItemId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body DuplicateLineItemRequest})

(defn advertisers-lineItems-bulkListAssignedTargetingOptions
  "Lists assigned targeting options for multiple line items across targeting types.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/lineItems/bulkListAssignedTargetingOptions

advertiserId <> 

optional:
lineItemIds <string> Required. The IDs of the line items to list assigned targeting options for.
pageSize <integer> Requested page size. The size must be an integer between `1` and `5000`. If unspecified, the default is `5000`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `lineItemId` (default) * `assignedTargetingOption.targetingType` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `targetingType desc`.
filter <string> Allows filtering by assigned targeting option fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR` on the same field. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `targetingType` * `inheritance` Examples: * `AssignedTargetingOption` resources of targeting type `TARGETING_TYPE_PROXIMITY_LOCATION_LIST` or `TARGETING_TYPE_CHANNEL`: `targetingType=\"TARGETING_TYPE_PROXIMITY_LOCATION_LIST\" OR targetingType=\"TARGETING_TYPE_CHANNEL\"` * `AssignedTargetingOption` resources with inheritance status of `NOT_INHERITED` or `INHERITED_FROM_PARTNER`: `inheritance=\"NOT_INHERITED\" OR inheritance=\"INHERITED_FROM_PARTNER\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId]
    (advertisers-lineItems-bulkListAssignedTargetingOptions
      advertiserId
      nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/lineItems:bulkListAssignedTargetingOptions",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-lineItems-generateDefault
  "Creates a new line item with settings (including targeting) inherited from the insertion order and an `ENTITY_STATUS_DRAFT` entity_status. Returns the newly created line item if successful. There are default values based on the three fields: * The insertion order's insertion_order_type * The insertion order's automation_type * The given line_item_type YouTube & Partners line items cannot be created or updated using the API.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/lineItems/generateDefault

advertiserId <> 
GenerateDefaultLineItemRequest:
GenerateDefaultLineItemRequest"
  [advertiserId GenerateDefaultLineItemRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/lineItems:generateDefault",
   :uri-template-args {"advertiserId" advertiserId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body GenerateDefaultLineItemRequest})

(defn advertisers-lineItems-patch
  "Updates an existing line item. Returns the updated line item if successful. Requests to this endpoint cannot be made concurrently with the following requests updating the same line item: * BulkEditAssignedTargetingOptions * BulkUpdateLineItems * assignedTargetingOptions.create * assignedTargetingOptions.delete YouTube & Partners line items cannot be created or updated using the API. **This method regularly experiences high latency.** We recommend [increasing your default timeout](/display-video/api/guides/best-practices/timeouts#client_library_timeout) to avoid errors.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/lineItems/patch

advertiserId <> 
lineItemId <> 
LineItem:
LineItem

optional:
updateMask <string> Required. The mask to control which fields to update."
  ([advertiserId lineItemId LineItem]
    (advertisers-lineItems-patch advertiserId lineItemId LineItem nil))
  ([advertiserId lineItemId LineItem optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/lineItems/{+lineItemId}",
     :uri-template-args
     {"advertiserId" advertiserId, "lineItemId" lineItemId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body LineItem}))

(defn advertisers-lineItems-create
  "Creates a new line item. Returns the newly created line item if successful. YouTube & Partners line items cannot be created or updated using the API.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/lineItems/create

advertiserId <> 
LineItem:
LineItem"
  [advertiserId LineItem]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/lineItems",
   :uri-template-args {"advertiserId" advertiserId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body LineItem})

(defn advertisers-lineItems-get
  "Gets a line item.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/lineItems/get

advertiserId <> 
lineItemId <> "
  [advertiserId lineItemId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/lineItems/{+lineItemId}",
   :uri-template-args
   {"advertiserId" advertiserId, "lineItemId" lineItemId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-lineItems-bulkUpdate
  "Updates multiple line items. Requests to this endpoint cannot be made concurrently with the following requests updating the same line item: * BulkEditAssignedTargetingOptions * UpdateLineItem * assignedTargetingOptions.create * assignedTargetingOptions.delete YouTube & Partners line items cannot be created or updated using the API.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/lineItems/bulkUpdate

advertiserId <> 
BulkUpdateLineItemsRequest:
BulkUpdateLineItemsRequest"
  [advertiserId BulkUpdateLineItemsRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/lineItems:bulkUpdate",
   :uri-template-args {"advertiserId" advertiserId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body BulkUpdateLineItemsRequest})

(defn advertisers-lineItems-targetingTypes-assignedTargetingOptions-get
  "Gets a single targeting option assigned to a line item.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/lineItems/targetingTypes/assignedTargetingOptions/get

advertiserId <> 
lineItemId <> 
targetingType <> 
assignedTargetingOptionId <> "
  [advertiserId lineItemId targetingType assignedTargetingOptionId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/lineItems/{+lineItemId}/targetingTypes/{+targetingType}/assignedTargetingOptions/{+assignedTargetingOptionId}",
   :uri-template-args
   {"advertiserId" advertiserId,
    "lineItemId" lineItemId,
    "targetingType" targetingType,
    "assignedTargetingOptionId" assignedTargetingOptionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-lineItems-targetingTypes-assignedTargetingOptions-list
  "Lists the targeting options assigned to a line item.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/lineItems/targetingTypes/assignedTargetingOptions/list

advertiserId <> 
lineItemId <> 
targetingType <> 

optional:
pageSize <integer> Requested page size. Must be between `1` and `5000`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `assignedTargetingOptionId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `assignedTargetingOptionId desc`.
filter <string> Allows filtering by assigned targeting option fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR`. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `assignedTargetingOptionId` * `inheritance` Examples: * `AssignedTargetingOption` resources with ID 1 or 2: `assignedTargetingOptionId=\"1\" OR assignedTargetingOptionId=\"2\"` * `AssignedTargetingOption` resources with inheritance status of `NOT_INHERITED` or `INHERITED_FROM_PARTNER`: `inheritance=\"NOT_INHERITED\" OR inheritance=\"INHERITED_FROM_PARTNER\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId lineItemId targetingType]
    (advertisers-lineItems-targetingTypes-assignedTargetingOptions-list
      advertiserId
      lineItemId
      targetingType
      nil))
  ([advertiserId lineItemId targetingType optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/lineItems/{+lineItemId}/targetingTypes/{+targetingType}/assignedTargetingOptions",
     :uri-template-args
     {"advertiserId" advertiserId,
      "lineItemId" lineItemId,
      "targetingType" targetingType},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-lineItems-targetingTypes-assignedTargetingOptions-create
  "Assigns a targeting option to a line item. Returns the assigned targeting option if successful. Requests to this endpoint cannot be made concurrently with the following requests updating the same line item: * lineItems.bulkEditAssignedTargetingOptions * lineItems.bulkUpdate * lineItems.patch * DeleteLineItemAssignedTargetingOption YouTube & Partners line items cannot be created or updated using the API.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/lineItems/targetingTypes/assignedTargetingOptions/create

advertiserId <> 
lineItemId <> 
targetingType <> 
AssignedTargetingOption:
AssignedTargetingOption"
  [advertiserId lineItemId targetingType AssignedTargetingOption]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/lineItems/{+lineItemId}/targetingTypes/{+targetingType}/assignedTargetingOptions",
   :uri-template-args
   {"advertiserId" advertiserId,
    "lineItemId" lineItemId,
    "targetingType" targetingType},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body AssignedTargetingOption})

(defn advertisers-lineItems-targetingTypes-assignedTargetingOptions-delete
  "Deletes an assigned targeting option from a line item. Requests to this endpoint cannot be made concurrently with the following requests updating the same line item: * lineItems.bulkEditAssignedTargetingOptions * lineItems.bulkUpdate * lineItems.patch * CreateLineItemAssignedTargetingOption YouTube & Partners line items cannot be created or updated using the API.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/lineItems/targetingTypes/assignedTargetingOptions/delete

advertiserId <> 
lineItemId <> 
targetingType <> 
assignedTargetingOptionId <> "
  [advertiserId lineItemId targetingType assignedTargetingOptionId]
  {:method :delete,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/lineItems/{+lineItemId}/targetingTypes/{+targetingType}/assignedTargetingOptions/{+assignedTargetingOptionId}",
   :uri-template-args
   {"advertiserId" advertiserId,
    "lineItemId" lineItemId,
    "targetingType" targetingType,
    "assignedTargetingOptionId" assignedTargetingOptionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-creatives-get
  "Gets a creative.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/creatives/get

advertiserId <> 
creativeId <> "
  [advertiserId creativeId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/creatives/{+creativeId}",
   :uri-template-args
   {"advertiserId" advertiserId, "creativeId" creativeId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-creatives-list
  "Lists creatives in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, creatives with `ENTITY_STATUS_ARCHIVED` will not be included in the results.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/creatives/list

advertiserId <> 

optional:
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `creativeId` (default) * `createTime` * `mediaDuration` * `dimensions` (sorts by width first, then by height) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `createTime desc`.
filter <string> Allows filtering by creative fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * The `lineItemIds` field must use the `HAS (:)` operator. * The `updateTime` field must use the `GREATER THAN OR EQUAL TO (>=)` or `LESS THAN OR EQUAL TO (<=)` operators. * All other fields must use the `EQUALS (=)` operator. * For `entityStatus`, `minDuration`, `maxDuration`, `updateTime`, and `dynamic` fields, there may be at most one restriction. Supported Fields: * `approvalStatus` * `creativeId` * `creativeType` * `dimensions` (input in the form of `{width}x{height}`) * `dynamic` * `entityStatus` * `exchangeReviewStatus` (input in the form of `{exchange}-{reviewStatus}`) * `lineItemIds` * `maxDuration` (input in the form of `{duration}s`. Only seconds are supported) * `minDuration` (input in the form of `{duration}s`. Only seconds are supported) * `updateTime` (input in ISO 8601 format, or `YYYY-MM-DDTHH:MM:SSZ`) Notes: * For `updateTime`, a creative resource's field value reflects the last time that a creative has been updated, which includes updates made by the system (e.g. creative review updates). Examples: * All native creatives: `creativeType=\"CREATIVE_TYPE_NATIVE\"` * All active creatives with 300x400 or 50x100 dimensions: `entityStatus=\"ENTITY_STATUS_ACTIVE\" AND (dimensions=\"300x400\" OR dimensions=\"50x100\")` * All dynamic creatives that are approved by AdX or AppNexus, with a minimum duration of 5 seconds and 200ms: `dynamic=\"true\" AND minDuration=\"5.2s\" AND (exchangeReviewStatus=\"EXCHANGE_GOOGLE_AD_MANAGER-REVIEW_STATUS_APPROVED\" OR exchangeReviewStatus=\"EXCHANGE_APPNEXUS-REVIEW_STATUS_APPROVED\")` * All video creatives that are associated with line item ID 1 or 2: `creativeType=\"CREATIVE_TYPE_VIDEO\" AND (lineItemIds:1 OR lineItemIds:2)` * Find creatives by multiple creative IDs: `creativeId=1 OR creativeId=2` * All creatives with an update time greater than or equal to 2020-11-04T18:54:47Z (format of ISO 8601): `updateTime>=\"2020-11-04T18:54:47Z\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId] (advertisers-creatives-list advertiserId nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/creatives",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-creatives-create
  "Creates a new creative. Returns the newly created creative if successful. A [\"Standard\" user role](//support.google.com/displayvideo/answer/2723011) or greater for the parent advertiser or partner is required to make this request.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/creatives/create

advertiserId <> 
Creative:
Creative"
  [advertiserId Creative]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/creatives",
   :uri-template-args {"advertiserId" advertiserId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body Creative})

(defn advertisers-creatives-patch
  "Updates an existing creative. Returns the updated creative if successful. A [\"Standard\" user role](//support.google.com/displayvideo/answer/2723011) or greater for the parent advertiser or partner is required to make this request.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/creatives/patch

advertiserId <> 
creativeId <> 
Creative:
Creative

optional:
updateMask <string> Required. The mask to control which fields to update."
  ([advertiserId creativeId Creative]
    (advertisers-creatives-patch advertiserId creativeId Creative nil))
  ([advertiserId creativeId Creative optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/creatives/{+creativeId}",
     :uri-template-args
     {"advertiserId" advertiserId, "creativeId" creativeId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body Creative}))

(defn advertisers-creatives-delete
  "Deletes a creative. Returns error code `NOT_FOUND` if the creative does not exist. The creative should be archived first, i.e. set entity_status to `ENTITY_STATUS_ARCHIVED`, before it can be deleted. A [\"Standard\" user role](//support.google.com/displayvideo/answer/2723011) or greater for the parent advertiser or partner is required to make this request.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/creatives/delete

advertiserId <> 
creativeId <> "
  [advertiserId creativeId]
  {:method :delete,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/creatives/{+creativeId}",
   :uri-template-args
   {"advertiserId" advertiserId, "creativeId" creativeId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-campaigns-listAssignedTargetingOptions
  "Lists assigned targeting options of a campaign across targeting types.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/campaigns/listAssignedTargetingOptions

advertiserId <> 
campaignId <> 

optional:
pageSize <integer> Requested page size. The size must be an integer between `1` and `5000`. If unspecified, the default is `5000`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `targetingType` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `targetingType desc`.
filter <string> Allows filtering by assigned targeting option fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the `OR` logical operator. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `targetingType` * `inheritance` Examples: * `AssignedTargetingOption` resources of targeting type `TARGETING_TYPE_LANGUAGE` or `TARGETING_TYPE_GENDER`: `targetingType=\"TARGETING_TYPE_LANGUAGE\" OR targetingType=\"TARGETING_TYPE_GENDER\"` * `AssignedTargetingOption` resources with inheritance status of `NOT_INHERITED` or `INHERITED_FROM_PARTNER`: `inheritance=\"NOT_INHERITED\" OR inheritance=\"INHERITED_FROM_PARTNER\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId campaignId]
    (advertisers-campaigns-listAssignedTargetingOptions
      advertiserId
      campaignId
      nil))
  ([advertiserId campaignId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/campaigns/{+campaignId}:listAssignedTargetingOptions",
     :uri-template-args
     {"advertiserId" advertiserId, "campaignId" campaignId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-campaigns-get
  "Gets a campaign.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/campaigns/get

advertiserId <> 
campaignId <> "
  [advertiserId campaignId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/campaigns/{+campaignId}",
   :uri-template-args
   {"advertiserId" advertiserId, "campaignId" campaignId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/display-video"
    "https://www.googleapis.com/auth/display-video-mediaplanning"]})

(defn advertisers-campaigns-list
  "Lists campaigns in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, campaigns with `ENTITY_STATUS_ARCHIVED` will not be included in the results.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/campaigns/list

advertiserId <> 

optional:
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`.
orderBy <string> Field by which to sort the list. Acceptable values are: * `displayName` (default) * `entityStatus` * `updateTime` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `displayName desc`.
filter <string> Allows filtering by campaign fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * The `updateTime` field must use the `GREATER THAN OR EQUAL TO (>=)` or `LESS THAN OR EQUAL TO (<=)` operators. * All other fields must use the `EQUALS (=)` operator. Supported fields: * `campaignId` * `displayName` * `entityStatus` * `updateTime` (input in ISO 8601 format, or `YYYY-MM-DDTHH:MM:SSZ`) Examples: * All `ENTITY_STATUS_ACTIVE` or `ENTITY_STATUS_PAUSED` campaigns under an advertiser: `(entityStatus=\"ENTITY_STATUS_ACTIVE\" OR entityStatus=\"ENTITY_STATUS_PAUSED\")` * All campaigns with an update time less than or equal to 2020-11-04T18:54:47Z (format of ISO 8601): `updateTime<=\"2020-11-04T18:54:47Z\"` * All campaigns with an update time greater than or equal to 2020-11-04T18:54:47Z (format of ISO 8601): `updateTime>=\"2020-11-04T18:54:47Z\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId] (advertisers-campaigns-list advertiserId nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/campaigns",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/display-video"
      "https://www.googleapis.com/auth/display-video-mediaplanning"]}))

(defn advertisers-campaigns-create
  "Creates a new campaign. Returns the newly created campaign if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/campaigns/create

advertiserId <> 
Campaign:
Campaign"
  [advertiserId Campaign]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/campaigns",
   :uri-template-args {"advertiserId" advertiserId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/display-video"
    "https://www.googleapis.com/auth/display-video-mediaplanning"],
   :body Campaign})

(defn advertisers-campaigns-patch
  "Updates an existing campaign. Returns the updated campaign if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/campaigns/patch

advertiserId <> 
campaignId <> 
Campaign:
Campaign

optional:
updateMask <string> Required. The mask to control which fields to update."
  ([advertiserId campaignId Campaign]
    (advertisers-campaigns-patch advertiserId campaignId Campaign nil))
  ([advertiserId campaignId Campaign optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/campaigns/{+campaignId}",
     :uri-template-args
     {"advertiserId" advertiserId, "campaignId" campaignId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/display-video"
      "https://www.googleapis.com/auth/display-video-mediaplanning"],
     :body Campaign}))

(defn advertisers-campaigns-delete
  "Permanently deletes a campaign. A deleted campaign cannot be recovered. The campaign should be archived first, i.e. set entity_status to `ENTITY_STATUS_ARCHIVED`, to be able to delete it. **This method regularly experiences high latency.** We recommend [increasing your default timeout](/display-video/api/guides/best-practices/timeouts#client_library_timeout) to avoid errors.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/campaigns/delete

advertiserId <> 
campaignId <> "
  [advertiserId campaignId]
  {:method :delete,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/campaigns/{+campaignId}",
   :uri-template-args
   {"advertiserId" advertiserId, "campaignId" campaignId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/display-video"
    "https://www.googleapis.com/auth/display-video-mediaplanning"]})

(defn advertisers-campaigns-targetingTypes-assignedTargetingOptions-get
  "Gets a single targeting option assigned to a campaign.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/campaigns/targetingTypes/assignedTargetingOptions/get

advertiserId <> 
campaignId <> 
targetingType <> 
assignedTargetingOptionId <> "
  [advertiserId campaignId targetingType assignedTargetingOptionId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/campaigns/{+campaignId}/targetingTypes/{+targetingType}/assignedTargetingOptions/{+assignedTargetingOptionId}",
   :uri-template-args
   {"advertiserId" advertiserId,
    "campaignId" campaignId,
    "targetingType" targetingType,
    "assignedTargetingOptionId" assignedTargetingOptionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-campaigns-targetingTypes-assignedTargetingOptions-list
  "Lists the targeting options assigned to a campaign for a specified targeting type.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/campaigns/targetingTypes/assignedTargetingOptions/list

advertiserId <> 
campaignId <> 
targetingType <> 

optional:
pageSize <integer> Requested page size. Must be between `1` and `5000`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `assignedTargetingOptionId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `assignedTargetingOptionId desc`.
filter <string> Allows filtering by assigned targeting option fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the `OR` logical operator. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `assignedTargetingOptionId` * `inheritance` Examples: * `AssignedTargetingOption` resources with ID 1 or 2 `assignedTargetingOptionId=\"1\" OR assignedTargetingOptionId=\"2\"` * `AssignedTargetingOption` resources with inheritance status of `NOT_INHERITED` or `INHERITED_FROM_PARTNER` `inheritance=\"NOT_INHERITED\" OR inheritance=\"INHERITED_FROM_PARTNER\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId campaignId targetingType]
    (advertisers-campaigns-targetingTypes-assignedTargetingOptions-list
      advertiserId
      campaignId
      targetingType
      nil))
  ([advertiserId campaignId targetingType optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/campaigns/{+campaignId}/targetingTypes/{+targetingType}/assignedTargetingOptions",
     :uri-template-args
     {"advertiserId" advertiserId,
      "campaignId" campaignId,
      "targetingType" targetingType},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-locationLists-get
  "Gets a location list.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/locationLists/get

advertiserId <> 
locationListId <> "
  [advertiserId locationListId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/locationLists/{+locationListId}",
   :uri-template-args
   {"advertiserId" advertiserId, "locationListId" locationListId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-locationLists-list
  "Lists location lists based on a given advertiser id.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/locationLists/list

advertiserId <> 

optional:
pageSize <integer> Requested page size. Must be between `1` and `200`. Defaults to `100` if not set. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `locationListId` (default) * `displayName` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `displayName desc`.
filter <string> Allows filtering by location list fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `locationType` Examples: * All regional location list: `locationType=\"TARGETING_LOCATION_TYPE_REGIONAL\"` * All proximity location list: `locationType=\"TARGETING_LOCATION_TYPE_PROXIMITY\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId] (advertisers-locationLists-list advertiserId nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/locationLists",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-locationLists-create
  "Creates a new location list. Returns the newly created location list if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/locationLists/create

advertiserId <> 
LocationList:
LocationList"
  [advertiserId LocationList]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/locationLists",
   :uri-template-args {"advertiserId" advertiserId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body LocationList})

(defn advertisers-locationLists-patch
  "Updates a location list. Returns the updated location list if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/locationLists/patch

advertiserId <> 
locationListId <> 
LocationList:
LocationList

optional:
updateMask <string> Required. The mask to control which fields to update."
  ([advertiserId locationListId LocationList]
    (advertisers-locationLists-patch
      advertiserId
      locationListId
      LocationList
      nil))
  ([advertiserId locationListId LocationList optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/locationLists/{locationListId}",
     :uri-template-args
     {"advertiserId" advertiserId, "locationListId" locationListId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body LocationList}))

(defn advertisers-locationLists-assignedLocations-list
  "Lists locations assigned to a location list.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/locationLists/assignedLocations/list

advertiserId <> 
locationListId <> 

optional:
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `assignedLocationId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \" desc\" should be added to the field name. Example: `assignedLocationId desc`.
filter <string> Allows filtering by location list assignment fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the `OR` logical operator. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `assignedLocationId` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId locationListId]
    (advertisers-locationLists-assignedLocations-list
      advertiserId
      locationListId
      nil))
  ([advertiserId locationListId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{advertiserId}/locationLists/{locationListId}/assignedLocations",
     :uri-template-args
     {"advertiserId" advertiserId, "locationListId" locationListId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-locationLists-assignedLocations-create
  "Creates an assignment between a location and a location list.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/locationLists/assignedLocations/create

advertiserId <> 
locationListId <> 
AssignedLocation:
AssignedLocation"
  [advertiserId locationListId AssignedLocation]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{advertiserId}/locationLists/{locationListId}/assignedLocations",
   :uri-template-args
   {"advertiserId" advertiserId, "locationListId" locationListId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body AssignedLocation})

(defn advertisers-locationLists-assignedLocations-delete
  "Deletes the assignment between a location and a location list.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/locationLists/assignedLocations/delete

advertiserId <> 
locationListId <> 
assignedLocationId <> "
  [advertiserId locationListId assignedLocationId]
  {:method :delete,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{advertiserId}/locationLists/{locationListId}/assignedLocations/{+assignedLocationId}",
   :uri-template-args
   {"advertiserId" advertiserId,
    "locationListId" locationListId,
    "assignedLocationId" assignedLocationId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-locationLists-assignedLocations-bulkEdit
  "Bulk edits multiple assignments between locations and a single location list. The operation will delete the assigned locations provided in deletedAssignedLocations and then create the assigned locations provided in createdAssignedLocations.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/locationLists/assignedLocations/bulkEdit

advertiserId <> 
locationListId <> 
BulkEditAssignedLocationsRequest:
BulkEditAssignedLocationsRequest"
  [advertiserId locationListId BulkEditAssignedLocationsRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{advertiserId}/locationLists/{+locationListId}/assignedLocations:bulkEdit",
   :uri-template-args
   {"advertiserId" advertiserId, "locationListId" locationListId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body BulkEditAssignedLocationsRequest})

(defn advertisers-adGroups-bulkListAdGroupAssignedTargetingOptions
  "Lists assigned targeting options for multiple ad groups across targeting types. Inherited assigned targeting options are not included.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/adGroups/bulkListAdGroupAssignedTargetingOptions

advertiserId <> 

optional:
adGroupIds <string> Required. The IDs of the ad groups to list assigned targeting options for.
pageSize <integer> Optional. Requested page size. The size must be an integer between `1` and `5000`. If unspecified, the default is `5000`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Optional. Field by which to sort the list. Acceptable values are: * `adGroupId` (default) * `assignedTargetingOption.targetingType` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `targetingType desc`.
filter <string> Optional. Allows filtering by assigned targeting option fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR`. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `targetingType` Examples: * `AssignedTargetingOption` resources of targeting type `TARGETING_TYPE_YOUTUBE_VIDEO` or `TARGETING_TYPE_YOUTUBE_CHANNEL`: `targetingType=\"TARGETING_TYPE_YOUTUBE_VIDEO\" OR targetingType=\"TARGETING_TYPE_YOUTUBE_CHANNEL\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId]
    (advertisers-adGroups-bulkListAdGroupAssignedTargetingOptions
      advertiserId
      nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/adGroups:bulkListAdGroupAssignedTargetingOptions",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-adGroups-get
  "Gets an ad group.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/adGroups/get

advertiserId <> 
adGroupId <> "
  [advertiserId adGroupId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/adGroups/{+adGroupId}",
   :uri-template-args
   {"advertiserId" advertiserId, "adGroupId" adGroupId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-adGroups-list
  "Lists ad groups.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/adGroups/list

advertiserId <> 

optional:
pageSize <integer> Optional. Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Optional. Field by which to sort the list. Acceptable values are: * `displayName` (default) * `entityStatus` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `displayName desc`.
filter <string> Optional. Allows filtering by custom ad group fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` and `OR`. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported properties: * `adGroupId` * `displayName` * `entityStatus` * `lineItemId` * `adGroupFormat` Examples: * All ad groups under an line item: `lineItemId=\"1234\"` * All `ENTITY_STATUS_ACTIVE` or `ENTITY_STATUS_PAUSED` `AD_GROUP_FORMAT_IN_STREAM` ad groups under an advertiser: `(entityStatus=\"ENTITY_STATUS_ACTIVE\" OR entityStatus=\"ENTITY_STATUS_PAUSED\") AND adGroupFormat=\"AD_GROUP_FORMAT_IN_STREAM\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId] (advertisers-adGroups-list advertiserId nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/adGroups",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-adGroups-targetingTypes-assignedTargetingOptions-get
  "Gets a single targeting option assigned to an ad group. Inherited assigned targeting options are not included.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/adGroups/targetingTypes/assignedTargetingOptions/get

advertiserId <> 
adGroupId <> 
targetingType <> 
assignedTargetingOptionId <> "
  [advertiserId adGroupId targetingType assignedTargetingOptionId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/adGroups/{+adGroupId}/targetingTypes/{+targetingType}/assignedTargetingOptions/{+assignedTargetingOptionId}",
   :uri-template-args
   {"advertiserId" advertiserId,
    "adGroupId" adGroupId,
    "targetingType" targetingType,
    "assignedTargetingOptionId" assignedTargetingOptionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-adGroups-targetingTypes-assignedTargetingOptions-list
  "Lists the targeting options assigned to an ad group. Inherited assigned targeting options are not included.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/adGroups/targetingTypes/assignedTargetingOptions/list

advertiserId <> 
adGroupId <> 
targetingType <> 

optional:
pageSize <integer> Optional. Requested page size. Must be between `1` and `5000`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Optional. Field by which to sort the list. Acceptable values are: * `assignedTargetingOptionId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `assignedTargetingOptionId desc`.
filter <string> Optional. Allows filtering by assigned targeting option fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR`. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `assignedTargetingOptionId` Examples: * `AssignedTargetingOption` resources with ID 1 or 2: `assignedTargetingOptionId=\"1\" OR assignedTargetingOptionId=\"2\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId adGroupId targetingType]
    (advertisers-adGroups-targetingTypes-assignedTargetingOptions-list
      advertiserId
      adGroupId
      targetingType
      nil))
  ([advertiserId adGroupId targetingType optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/adGroups/{+adGroupId}/targetingTypes/{+targetingType}/assignedTargetingOptions",
     :uri-template-args
     {"advertiserId" advertiserId,
      "adGroupId" adGroupId,
      "targetingType" targetingType},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-targetingTypes-assignedTargetingOptions-get
  "Gets a single targeting option assigned to an advertiser.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/targetingTypes/assignedTargetingOptions/get

advertiserId <> 
targetingType <> 
assignedTargetingOptionId <> "
  [advertiserId targetingType assignedTargetingOptionId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/targetingTypes/{+targetingType}/assignedTargetingOptions/{+assignedTargetingOptionId}",
   :uri-template-args
   {"advertiserId" advertiserId,
    "targetingType" targetingType,
    "assignedTargetingOptionId" assignedTargetingOptionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-targetingTypes-assignedTargetingOptions-list
  "Lists the targeting options assigned to an advertiser.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/targetingTypes/assignedTargetingOptions/list

advertiserId <> 
targetingType <> 

optional:
pageSize <integer> Requested page size. Must be between `1` and `5000`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `assignedTargetingOptionId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `assignedTargetingOptionId desc`.
filter <string> Allows filtering by assigned targeting option fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the `OR` logical operator. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `assignedTargetingOptionId` Examples: * `AssignedTargetingOption` with ID 123456: `assignedTargetingOptionId=\"123456\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId targetingType]
    (advertisers-targetingTypes-assignedTargetingOptions-list
      advertiserId
      targetingType
      nil))
  ([advertiserId targetingType optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/targetingTypes/{+targetingType}/assignedTargetingOptions",
     :uri-template-args
     {"advertiserId" advertiserId, "targetingType" targetingType},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-targetingTypes-assignedTargetingOptions-create
  "Assigns a targeting option to an advertiser. Returns the assigned targeting option if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/targetingTypes/assignedTargetingOptions/create

advertiserId <> 
targetingType <> 
AssignedTargetingOption:
AssignedTargetingOption"
  [advertiserId targetingType AssignedTargetingOption]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/targetingTypes/{+targetingType}/assignedTargetingOptions",
   :uri-template-args
   {"advertiserId" advertiserId, "targetingType" targetingType},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body AssignedTargetingOption})

(defn advertisers-targetingTypes-assignedTargetingOptions-delete
  "Deletes an assigned targeting option from an advertiser.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/targetingTypes/assignedTargetingOptions/delete

advertiserId <> 
targetingType <> 
assignedTargetingOptionId <> "
  [advertiserId targetingType assignedTargetingOptionId]
  {:method :delete,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/targetingTypes/{+targetingType}/assignedTargetingOptions/{+assignedTargetingOptionId}",
   :uri-template-args
   {"advertiserId" advertiserId,
    "targetingType" targetingType,
    "assignedTargetingOptionId" assignedTargetingOptionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-negativeKeywordLists-get
  "Gets a negative keyword list given an advertiser ID and a negative keyword list ID.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/negativeKeywordLists/get

advertiserId <> 
negativeKeywordListId <> "
  [advertiserId negativeKeywordListId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/negativeKeywordLists/{+negativeKeywordListId}",
   :uri-template-args
   {"advertiserId" advertiserId,
    "negativeKeywordListId" negativeKeywordListId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-negativeKeywordLists-list
  "Lists negative keyword lists based on a given advertiser id.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/negativeKeywordLists/list

advertiserId <> 

optional:
pageSize <integer> Requested page size. Must be between `1` and `200`. Defaults to `100` if not set. Returns error code `INVALID_ARGUMENT` if an invalid value is specified."
  ([advertiserId]
    (advertisers-negativeKeywordLists-list advertiserId nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/negativeKeywordLists",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-negativeKeywordLists-create
  "Creates a new negative keyword list. Returns the newly created negative keyword list if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/negativeKeywordLists/create

advertiserId <> 
NegativeKeywordList:
NegativeKeywordList"
  [advertiserId NegativeKeywordList]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/negativeKeywordLists",
   :uri-template-args {"advertiserId" advertiserId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body NegativeKeywordList})

(defn advertisers-negativeKeywordLists-patch
  "Updates a negative keyword list. Returns the updated negative keyword list if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/negativeKeywordLists/patch

advertiserId <> 
negativeKeywordListId <> 
NegativeKeywordList:
NegativeKeywordList

optional:
updateMask <string> Required. The mask to control which fields to update."
  ([advertiserId negativeKeywordListId NegativeKeywordList]
    (advertisers-negativeKeywordLists-patch
      advertiserId
      negativeKeywordListId
      NegativeKeywordList
      nil))
  ([advertiserId negativeKeywordListId NegativeKeywordList optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/negativeKeywordLists/{negativeKeywordListId}",
     :uri-template-args
     {"advertiserId" advertiserId,
      "negativeKeywordListId" negativeKeywordListId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body NegativeKeywordList}))

(defn advertisers-negativeKeywordLists-delete
  "Deletes a negative keyword list given an advertiser ID and a negative keyword list ID.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/negativeKeywordLists/delete

advertiserId <> 
negativeKeywordListId <> "
  [advertiserId negativeKeywordListId]
  {:method :delete,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/negativeKeywordLists/{+negativeKeywordListId}",
   :uri-template-args
   {"advertiserId" advertiserId,
    "negativeKeywordListId" negativeKeywordListId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-negativeKeywordLists-negativeKeywords-list
  "Lists negative keywords in a negative keyword list.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/negativeKeywordLists/negativeKeywords/list

advertiserId <> 
negativeKeywordListId <> 

optional:
pageSize <integer> Requested page size. Must be between `1` and `1000`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `keywordValue` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \" desc\" should be added to the field name. Example: `keywordValue desc`.
filter <string> Allows filtering by negative keyword fields. Supported syntax: * Filter expressions for negative keywords can only contain at most one restriction. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `HAS (:)` operator. Supported fields: * `keywordValue` Examples: * All negative keywords for which the keyword value contains \"google\": `keywordValue : \"google\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId negativeKeywordListId]
    (advertisers-negativeKeywordLists-negativeKeywords-list
      advertiserId
      negativeKeywordListId
      nil))
  ([advertiserId negativeKeywordListId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/negativeKeywordLists/{+negativeKeywordListId}/negativeKeywords",
     :uri-template-args
     {"advertiserId" advertiserId,
      "negativeKeywordListId" negativeKeywordListId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-negativeKeywordLists-negativeKeywords-create
  "Creates a negative keyword in a negative keyword list.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/negativeKeywordLists/negativeKeywords/create

advertiserId <> 
negativeKeywordListId <> 
NegativeKeyword:
NegativeKeyword"
  [advertiserId negativeKeywordListId NegativeKeyword]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{advertiserId}/negativeKeywordLists/{+negativeKeywordListId}/negativeKeywords",
   :uri-template-args
   {"advertiserId" advertiserId,
    "negativeKeywordListId" negativeKeywordListId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body NegativeKeyword})

(defn advertisers-negativeKeywordLists-negativeKeywords-delete
  "Deletes a negative keyword from a negative keyword list.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/negativeKeywordLists/negativeKeywords/delete

advertiserId <> 
negativeKeywordListId <> 
keywordValue <> "
  [advertiserId negativeKeywordListId keywordValue]
  {:method :delete,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{advertiserId}/negativeKeywordLists/{+negativeKeywordListId}/negativeKeywords/{+keywordValue}",
   :uri-template-args
   {"advertiserId" advertiserId,
    "negativeKeywordListId" negativeKeywordListId,
    "keywordValue" keywordValue},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-negativeKeywordLists-negativeKeywords-bulkEdit
  "Bulk edits negative keywords in a single negative keyword list. The operation will delete the negative keywords provided in BulkEditNegativeKeywordsRequest.deleted_negative_keywords and then create the negative keywords provided in BulkEditNegativeKeywordsRequest.created_negative_keywords. This operation is guaranteed to be atomic and will never result in a partial success or partial failure.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/negativeKeywordLists/negativeKeywords/bulkEdit

advertiserId <> 
negativeKeywordListId <> 
BulkEditNegativeKeywordsRequest:
BulkEditNegativeKeywordsRequest"
  [advertiserId negativeKeywordListId BulkEditNegativeKeywordsRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{advertiserId}/negativeKeywordLists/{+negativeKeywordListId}/negativeKeywords:bulkEdit",
   :uri-template-args
   {"advertiserId" advertiserId,
    "negativeKeywordListId" negativeKeywordListId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body BulkEditNegativeKeywordsRequest})

(defn advertisers-negativeKeywordLists-negativeKeywords-replace
  "Replaces all negative keywords in a single negative keyword list. The operation will replace the keywords in a negative keyword list with keywords provided in ReplaceNegativeKeywordsRequest.new_negative_keywords.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/negativeKeywordLists/negativeKeywords/replace

advertiserId <> 
negativeKeywordListId <> 
ReplaceNegativeKeywordsRequest:
ReplaceNegativeKeywordsRequest"
  [advertiserId negativeKeywordListId ReplaceNegativeKeywordsRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{advertiserId}/negativeKeywordLists/{+negativeKeywordListId}/negativeKeywords:replace",
   :uri-template-args
   {"advertiserId" advertiserId,
    "negativeKeywordListId" negativeKeywordListId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body ReplaceNegativeKeywordsRequest})

(defn advertisers-assets-upload
  "Uploads an asset. Returns the ID of the newly uploaded asset if successful. The asset file size should be no more than 10 MB for images, 200 MB for ZIP files, and 1 GB for videos. Must be used within the [multipart media upload process](/display-video/api/guides/how-tos/upload#multipart). Examples using provided client libraries can be found in our [Creating Creatives guide](/display-video/api/guides/creating-creatives/overview#upload_an_asset).
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/assets/upload

advertiserId <> 
CreateAssetRequest:
CreateAssetRequest"
  [advertiserId CreateAssetRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/assets",
   :uri-template-args {"advertiserId" advertiserId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body CreateAssetRequest})

(defn advertisers-adGroupAds-get
  "Gets an ad group ad.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/adGroupAds/get

advertiserId <> 
adGroupAdId <> "
  [advertiserId adGroupAdId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/adGroupAds/{+adGroupAdId}",
   :uri-template-args
   {"advertiserId" advertiserId, "adGroupAdId" adGroupAdId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn advertisers-adGroupAds-list
  "Lists ad group ads.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/adGroupAds/list

advertiserId <> 

optional:
pageSize <integer> Optional. Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Optional. Field by which to sort the list. Acceptable values are: * `displayName` (default) * `entityStatus` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `displayName desc`.
filter <string> Optional. Allows filtering by custom ad group ad fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` and `OR`. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `adGroupId` * `displayName` * `entityStatus` * `adGroupAdId` Examples: * All ad group ads under an ad group: `adGroupId=\"1234\"` * All ad group ads under an ad group with an entityStatus of `ENTITY_STATUS_ACTIVE` or `ENTITY_STATUS_PAUSED`: `(entityStatus=\"ENTITY_STATUS_ACTIVE\" OR entityStatus=\"ENTITY_STATUS_PAUSED\") AND adGroupId=\"12345\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId] (advertisers-adGroupAds-list advertiserId nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/adGroupAds",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-invoices-list
  "Lists invoices posted for an advertiser in a given month. Invoices generated by billing profiles with a \"Partner\" invoice level are not retrievable through this method.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/invoices/list

advertiserId <> 

optional:
issueMonth <string> The month to list the invoices for. If not set, the request will retrieve invoices for the previous month. Must be in the format YYYYMM.
loiSapinInvoiceType <string> Select type of invoice to retrieve for Loi Sapin advertisers. Only applicable to Loi Sapin advertisers. Will be ignored otherwise.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified."
  ([advertiserId] (advertisers-invoices-list advertiserId nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/invoices",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/display-video"
      "https://www.googleapis.com/auth/display-video-mediaplanning"]}))

(defn advertisers-invoices-lookupInvoiceCurrency
  "Retrieves the invoice currency used by an advertiser in a given month.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/invoices/lookupInvoiceCurrency

advertiserId <> 

optional:
invoiceMonth <string> Month for which the currency is needed. If not set, the request will return existing currency settings for the advertiser. Must be in the format YYYYMM."
  ([advertiserId]
    (advertisers-invoices-lookupInvoiceCurrency advertiserId nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/invoices:lookupInvoiceCurrency",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/display-video"
      "https://www.googleapis.com/auth/display-video-mediaplanning"]}))

(defn advertisers-channels-get
  "Gets a channel for a partner or advertiser.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/channels/get

advertiserId <> 
channelId <> 

optional:
partnerId <string> The ID of the partner that owns the fetched channel."
  ([advertiserId channelId]
    (advertisers-channels-get advertiserId channelId nil))
  ([advertiserId channelId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/channels/{+channelId}",
     :uri-template-args
     {"advertiserId" advertiserId, "channelId" channelId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-channels-list
  "Lists channels for a partner or advertiser.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/channels/list

advertiserId <> 

optional:
partnerId <string> The ID of the partner that owns the channels.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `displayName` (default) * `channelId` The default sorting order is ascending. To specify descending order for a field, a suffix \" desc\" should be added to the field name. Example: `displayName desc`.
filter <string> Allows filtering by channel fields. Supported syntax: * Filter expressions for channel can only contain at most one restriction. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `HAS (:)` operator. Supported fields: * `displayName` Examples: * All channels for which the display name contains \"google\": `displayName : \"google\"`. The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId] (advertisers-channels-list advertiserId nil))
  ([advertiserId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/channels",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-channels-create
  "Creates a new channel. Returns the newly created channel if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/channels/create

advertiserId <> 
Channel:
Channel

optional:
partnerId <string> The ID of the partner that owns the created channel."
  ([advertiserId Channel]
    (advertisers-channels-create advertiserId Channel nil))
  ([advertiserId Channel optional]
    {:method :post,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/channels",
     :uri-template-args {"advertiserId" advertiserId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body Channel}))

(defn advertisers-channels-patch
  "Updates a channel. Returns the updated channel if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/channels/patch

advertiserId <> 
channelId <> 
Channel:
Channel

optional:
partnerId <string> The ID of the partner that owns the created channel.
updateMask <string> Required. The mask to control which fields to update."
  ([advertiserId channelId Channel]
    (advertisers-channels-patch advertiserId channelId Channel nil))
  ([advertiserId channelId Channel optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/channels/{channelId}",
     :uri-template-args
     {"advertiserId" advertiserId, "channelId" channelId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body Channel}))

(defn advertisers-channels-sites-list
  "Lists sites in a channel.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/channels/sites/list

advertiserId <> 
channelId <> 

optional:
partnerId <string> The ID of the partner that owns the parent channel.
pageSize <integer> Requested page size. Must be between `1` and `10000`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `urlOrAppId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \" desc\" should be added to the field name. Example: `urlOrAppId desc`.
filter <string> Allows filtering by site fields. Supported syntax: * Filter expressions for site retrieval can only contain at most one restriction. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `HAS (:)` operator. Supported fields: * `urlOrAppId` Examples: * All sites for which the URL or app ID contains \"google\": `urlOrAppId : \"google\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([advertiserId channelId]
    (advertisers-channels-sites-list advertiserId channelId nil))
  ([advertiserId channelId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{+advertiserId}/channels/{+channelId}/sites",
     :uri-template-args
     {"advertiserId" advertiserId, "channelId" channelId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-channels-sites-create
  "Creates a site in a channel.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/channels/sites/create

advertiserId <> 
channelId <> 
Site:
Site

optional:
partnerId <string> The ID of the partner that owns the parent channel."
  ([advertiserId channelId Site]
    (advertisers-channels-sites-create
      advertiserId
      channelId
      Site
      nil))
  ([advertiserId channelId Site optional]
    {:method :post,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{advertiserId}/channels/{+channelId}/sites",
     :uri-template-args
     {"advertiserId" advertiserId, "channelId" channelId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body Site}))

(defn advertisers-channels-sites-delete
  "Deletes a site from a channel.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/channels/sites/delete

advertiserId <> 
channelId <> 
urlOrAppId <> 

optional:
partnerId <string> The ID of the partner that owns the parent channel."
  ([advertiserId channelId urlOrAppId]
    (advertisers-channels-sites-delete
      advertiserId
      channelId
      urlOrAppId
      nil))
  ([advertiserId channelId urlOrAppId optional]
    {:method :delete,
     :uri-template
     "https://displayvideo.googleapis.com/v3/advertisers/{advertiserId}/channels/{+channelId}/sites/{+urlOrAppId}",
     :uri-template-args
     {"advertiserId" advertiserId,
      "channelId" channelId,
      "urlOrAppId" urlOrAppId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn advertisers-channels-sites-bulkEdit
  "Bulk edits sites under a single channel. The operation will delete the sites provided in BulkEditSitesRequest.deleted_sites and then create the sites provided in BulkEditSitesRequest.created_sites.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/channels/sites/bulkEdit

advertiserId <> 
channelId <> 
BulkEditSitesRequest:
BulkEditSitesRequest"
  [advertiserId channelId BulkEditSitesRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{advertiserId}/channels/{+channelId}/sites:bulkEdit",
   :uri-template-args
   {"advertiserId" advertiserId, "channelId" channelId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body BulkEditSitesRequest})

(defn advertisers-channels-sites-replace
  "Replaces all of the sites under a single channel. The operation will replace the sites under a channel with the sites provided in ReplaceSitesRequest.new_sites. **This method regularly experiences high latency.** We recommend [increasing your default timeout](/display-video/api/guides/best-practices/timeouts#client_library_timeout) to avoid errors.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/advertisers/channels/sites/replace

advertiserId <> 
channelId <> 
ReplaceSitesRequest:
ReplaceSitesRequest"
  [advertiserId channelId ReplaceSitesRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/advertisers/{advertiserId}/channels/{+channelId}/sites:replace",
   :uri-template-args
   {"advertiserId" advertiserId, "channelId" channelId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body ReplaceSitesRequest})

(defn googleAudiences-get
  "Gets a Google audience.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/googleAudiences/get

googleAudienceId <> 

optional:
partnerId <string> The ID of the partner that has access to the fetched Google audience.
advertiserId <string> The ID of the advertiser that has access to the fetched Google audience."
  ([googleAudienceId] (googleAudiences-get googleAudienceId nil))
  ([googleAudienceId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/googleAudiences/{+googleAudienceId}",
     :uri-template-args {"googleAudienceId" googleAudienceId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn googleAudiences-list
  "Lists Google audiences. The order is defined by the order_by parameter.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/googleAudiences/list

optional:
partnerId <string> The ID of the partner that has access to the fetched Google audiences.
advertiserId <string> The ID of the advertiser that has access to the fetched Google audiences.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `googleAudienceId` (default) * `displayName` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `displayName desc`.
filter <string> Allows filtering by Google audience fields. Supported syntax: * Filter expressions for Google audiences can only contain at most one restriction. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `HAS (:)` operator. Supported fields: * `displayName` Examples: * All Google audiences for which the display name contains \"Google\": `displayName:\"Google\"`. The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([] (googleAudiences-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/googleAudiences",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn partners-editAssignedTargetingOptions
  "Edits targeting options under a single partner. The operation will delete the assigned targeting options provided in BulkEditPartnerAssignedTargetingOptionsRequest.deleteRequests and then create the assigned targeting options provided in BulkEditPartnerAssignedTargetingOptionsRequest.createRequests .
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/editAssignedTargetingOptions

partnerId <> 
BulkEditPartnerAssignedTargetingOptionsRequest:
BulkEditPartnerAssignedTargetingOptionsRequest"
  [partnerId BulkEditPartnerAssignedTargetingOptionsRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/partners/{+partnerId}:editAssignedTargetingOptions",
   :uri-template-args {"partnerId" partnerId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body BulkEditPartnerAssignedTargetingOptionsRequest})

(defn partners-get
  "Gets a partner.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/get

partnerId <> "
  [partnerId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/partners/{+partnerId}",
   :uri-template-args {"partnerId" partnerId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn partners-list
  "Lists partners that are accessible to the current user. The order is defined by the order_by parameter.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/list

optional:
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`.
orderBy <string> Field by which to sort the list. Acceptable values are: * `displayName` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. For example, `displayName desc`.
filter <string> Allows filtering by partner fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `entityStatus` Examples: * All active partners: `entityStatus=\"ENTITY_STATUS_ACTIVE\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([] (partners-list nil))
  ([optional]
    {:method :get,
     :uri-template "https://displayvideo.googleapis.com/v3/partners",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn partners-channels-get
  "Gets a channel for a partner or advertiser.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/channels/get

partnerId <> 
channelId <> 

optional:
advertiserId <string> The ID of the advertiser that owns the fetched channel."
  ([partnerId channelId]
    (partners-channels-get partnerId channelId nil))
  ([partnerId channelId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/partners/{+partnerId}/channels/{+channelId}",
     :uri-template-args {"partnerId" partnerId, "channelId" channelId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn partners-channels-list
  "Lists channels for a partner or advertiser.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/channels/list

partnerId <> 

optional:
advertiserId <string> The ID of the advertiser that owns the channels.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `displayName` (default) * `channelId` The default sorting order is ascending. To specify descending order for a field, a suffix \" desc\" should be added to the field name. Example: `displayName desc`.
filter <string> Allows filtering by channel fields. Supported syntax: * Filter expressions for channel can only contain at most one restriction. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `HAS (:)` operator. Supported fields: * `displayName` Examples: * All channels for which the display name contains \"google\": `displayName : \"google\"`. The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([partnerId] (partners-channels-list partnerId nil))
  ([partnerId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/partners/{+partnerId}/channels",
     :uri-template-args {"partnerId" partnerId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn partners-channels-create
  "Creates a new channel. Returns the newly created channel if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/channels/create

partnerId <> 
Channel:
Channel

optional:
advertiserId <string> The ID of the advertiser that owns the created channel."
  ([partnerId Channel]
    (partners-channels-create partnerId Channel nil))
  ([partnerId Channel optional]
    {:method :post,
     :uri-template
     "https://displayvideo.googleapis.com/v3/partners/{+partnerId}/channels",
     :uri-template-args {"partnerId" partnerId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body Channel}))

(defn partners-channels-patch
  "Updates a channel. Returns the updated channel if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/channels/patch

partnerId <> 
channelId <> 
Channel:
Channel

optional:
advertiserId <string> The ID of the advertiser that owns the created channel.
updateMask <string> Required. The mask to control which fields to update."
  ([partnerId channelId Channel]
    (partners-channels-patch partnerId channelId Channel nil))
  ([partnerId channelId Channel optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/partners/{+partnerId}/channels/{channelId}",
     :uri-template-args {"partnerId" partnerId, "channelId" channelId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body Channel}))

(defn partners-channels-sites-list
  "Lists sites in a channel.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/channels/sites/list

partnerId <> 
channelId <> 

optional:
advertiserId <string> The ID of the advertiser that owns the parent channel.
pageSize <integer> Requested page size. Must be between `1` and `10000`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `urlOrAppId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \" desc\" should be added to the field name. Example: `urlOrAppId desc`.
filter <string> Allows filtering by site fields. Supported syntax: * Filter expressions for site retrieval can only contain at most one restriction. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `HAS (:)` operator. Supported fields: * `urlOrAppId` Examples: * All sites for which the URL or app ID contains \"google\": `urlOrAppId : \"google\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([partnerId channelId]
    (partners-channels-sites-list partnerId channelId nil))
  ([partnerId channelId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/partners/{+partnerId}/channels/{+channelId}/sites",
     :uri-template-args {"partnerId" partnerId, "channelId" channelId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn partners-channels-sites-create
  "Creates a site in a channel.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/channels/sites/create

partnerId <> 
channelId <> 
Site:
Site

optional:
advertiserId <string> The ID of the advertiser that owns the parent channel."
  ([partnerId channelId Site]
    (partners-channels-sites-create partnerId channelId Site nil))
  ([partnerId channelId Site optional]
    {:method :post,
     :uri-template
     "https://displayvideo.googleapis.com/v3/partners/{partnerId}/channels/{+channelId}/sites",
     :uri-template-args {"partnerId" partnerId, "channelId" channelId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body Site}))

(defn partners-channels-sites-delete
  "Deletes a site from a channel.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/channels/sites/delete

partnerId <> 
channelId <> 
urlOrAppId <> 

optional:
advertiserId <string> The ID of the advertiser that owns the parent channel."
  ([partnerId channelId urlOrAppId]
    (partners-channels-sites-delete
      partnerId
      channelId
      urlOrAppId
      nil))
  ([partnerId channelId urlOrAppId optional]
    {:method :delete,
     :uri-template
     "https://displayvideo.googleapis.com/v3/partners/{partnerId}/channels/{+channelId}/sites/{+urlOrAppId}",
     :uri-template-args
     {"partnerId" partnerId,
      "channelId" channelId,
      "urlOrAppId" urlOrAppId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn partners-channels-sites-bulkEdit
  "Bulk edits sites under a single channel. The operation will delete the sites provided in BulkEditSitesRequest.deleted_sites and then create the sites provided in BulkEditSitesRequest.created_sites.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/channels/sites/bulkEdit

partnerId <> 
channelId <> 
BulkEditSitesRequest:
BulkEditSitesRequest"
  [partnerId channelId BulkEditSitesRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/partners/{partnerId}/channels/{+channelId}/sites:bulkEdit",
   :uri-template-args {"partnerId" partnerId, "channelId" channelId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body BulkEditSitesRequest})

(defn partners-channels-sites-replace
  "Replaces all of the sites under a single channel. The operation will replace the sites under a channel with the sites provided in ReplaceSitesRequest.new_sites. **This method regularly experiences high latency.** We recommend [increasing your default timeout](/display-video/api/guides/best-practices/timeouts#client_library_timeout) to avoid errors.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/channels/sites/replace

partnerId <> 
channelId <> 
ReplaceSitesRequest:
ReplaceSitesRequest"
  [partnerId channelId ReplaceSitesRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/partners/{partnerId}/channels/{+channelId}/sites:replace",
   :uri-template-args {"partnerId" partnerId, "channelId" channelId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body ReplaceSitesRequest})

(defn partners-targetingTypes-assignedTargetingOptions-get
  "Gets a single targeting option assigned to a partner.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/targetingTypes/assignedTargetingOptions/get

partnerId <> 
targetingType <> 
assignedTargetingOptionId <> "
  [partnerId targetingType assignedTargetingOptionId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/partners/{+partnerId}/targetingTypes/{+targetingType}/assignedTargetingOptions/{+assignedTargetingOptionId}",
   :uri-template-args
   {"partnerId" partnerId,
    "targetingType" targetingType,
    "assignedTargetingOptionId" assignedTargetingOptionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn partners-targetingTypes-assignedTargetingOptions-list
  "Lists the targeting options assigned to a partner.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/targetingTypes/assignedTargetingOptions/list

partnerId <> 
targetingType <> 

optional:
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `assignedTargetingOptionId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `assignedTargetingOptionId desc`.
filter <string> Allows filtering by assigned targeting option fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR`. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `assignedTargetingOptionId` Examples: * `AssignedTargetingOption` resource with ID 123456: `assignedTargetingOptionId=\"123456\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([partnerId targetingType]
    (partners-targetingTypes-assignedTargetingOptions-list
      partnerId
      targetingType
      nil))
  ([partnerId targetingType optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/partners/{+partnerId}/targetingTypes/{+targetingType}/assignedTargetingOptions",
     :uri-template-args
     {"partnerId" partnerId, "targetingType" targetingType},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn partners-targetingTypes-assignedTargetingOptions-create
  "Assigns a targeting option to a partner. Returns the assigned targeting option if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/targetingTypes/assignedTargetingOptions/create

partnerId <> 
targetingType <> 
AssignedTargetingOption:
AssignedTargetingOption"
  [partnerId targetingType AssignedTargetingOption]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/partners/{+partnerId}/targetingTypes/{+targetingType}/assignedTargetingOptions",
   :uri-template-args
   {"partnerId" partnerId, "targetingType" targetingType},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body AssignedTargetingOption})

(defn partners-targetingTypes-assignedTargetingOptions-delete
  "Deletes an assigned targeting option from a partner.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/partners/targetingTypes/assignedTargetingOptions/delete

partnerId <> 
targetingType <> 
assignedTargetingOptionId <> "
  [partnerId targetingType assignedTargetingOptionId]
  {:method :delete,
   :uri-template
   "https://displayvideo.googleapis.com/v3/partners/{+partnerId}/targetingTypes/{+targetingType}/assignedTargetingOptions/{+assignedTargetingOptionId}",
   :uri-template-args
   {"partnerId" partnerId,
    "targetingType" targetingType,
    "assignedTargetingOptionId" assignedTargetingOptionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"]})

(defn firstAndThirdPartyAudiences-get
  "Gets a first and third party audience.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/firstAndThirdPartyAudiences/get

firstAndThirdPartyAudienceId <> 

optional:
partnerId <string> The ID of the partner that has access to the fetched first and third party audience.
advertiserId <string> The ID of the advertiser that has access to the fetched first and third party audience."
  ([firstAndThirdPartyAudienceId]
    (firstAndThirdPartyAudiences-get firstAndThirdPartyAudienceId nil))
  ([firstAndThirdPartyAudienceId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/firstAndThirdPartyAudiences/{+firstAndThirdPartyAudienceId}",
     :uri-template-args
     {"firstAndThirdPartyAudienceId" firstAndThirdPartyAudienceId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn firstAndThirdPartyAudiences-list
  "Lists first and third party audiences. The order is defined by the order_by parameter.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/firstAndThirdPartyAudiences/list

optional:
partnerId <string> The ID of the partner that has access to the fetched first and third party audiences.
advertiserId <string> The ID of the advertiser that has access to the fetched first and third party audiences.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `firstAndThirdPartyAudienceId` (default) * `displayName` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `displayName desc`.
filter <string> Allows filtering by first and third party audience fields. Supported syntax: * Filter expressions for first and third party audiences can only contain at most one restriction. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `HAS (:)` operator. Supported fields: * `displayName` Examples: * All first and third party audiences for which the display name contains \"Google\": `displayName:\"Google\"`. The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([] (firstAndThirdPartyAudiences-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/firstAndThirdPartyAudiences",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn firstAndThirdPartyAudiences-create
  "Creates a FirstAndThirdPartyAudience. Only supported for the following audience_type: * `CUSTOMER_MATCH_CONTACT_INFO` * `CUSTOMER_MATCH_DEVICE_ID`
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/firstAndThirdPartyAudiences/create

FirstAndThirdPartyAudience:
FirstAndThirdPartyAudience

optional:
advertiserId <string> Required. The ID of the advertiser under whom the FirstAndThirdPartyAudience will be created."
  ([FirstAndThirdPartyAudience]
    (firstAndThirdPartyAudiences-create
      FirstAndThirdPartyAudience
      nil))
  ([FirstAndThirdPartyAudience optional]
    {:method :post,
     :uri-template
     "https://displayvideo.googleapis.com/v3/firstAndThirdPartyAudiences",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body FirstAndThirdPartyAudience}))

(defn firstAndThirdPartyAudiences-patch
  "Updates an existing FirstAndThirdPartyAudience. Only supported for the following audience_type: * `CUSTOMER_MATCH_CONTACT_INFO` * `CUSTOMER_MATCH_DEVICE_ID`
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/firstAndThirdPartyAudiences/patch

firstAndThirdPartyAudienceId <> 
FirstAndThirdPartyAudience:
FirstAndThirdPartyAudience

optional:
updateMask <string> Required. The mask to control which fields to update. Updates are only supported for the following fields: * `displayName` * `description` * `membershipDurationDays`
advertiserId <string> Required. The ID of the owner advertiser of the updated FirstAndThirdPartyAudience."
  ([firstAndThirdPartyAudienceId FirstAndThirdPartyAudience]
    (firstAndThirdPartyAudiences-patch
      firstAndThirdPartyAudienceId
      FirstAndThirdPartyAudience
      nil))
  ([firstAndThirdPartyAudienceId FirstAndThirdPartyAudience optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/firstAndThirdPartyAudiences/{+firstAndThirdPartyAudienceId}",
     :uri-template-args
     {"firstAndThirdPartyAudienceId" firstAndThirdPartyAudienceId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body FirstAndThirdPartyAudience}))

(defn firstAndThirdPartyAudiences-editCustomerMatchMembers
  "Updates the member list of a Customer Match audience. Only supported for the following audience_type: * `CUSTOMER_MATCH_CONTACT_INFO` * `CUSTOMER_MATCH_DEVICE_ID`
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/firstAndThirdPartyAudiences/editCustomerMatchMembers

firstAndThirdPartyAudienceId <> 
EditCustomerMatchMembersRequest:
EditCustomerMatchMembersRequest"
  [firstAndThirdPartyAudienceId EditCustomerMatchMembersRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/firstAndThirdPartyAudiences/{+firstAndThirdPartyAudienceId}:editCustomerMatchMembers",
   :uri-template-args
   {"firstAndThirdPartyAudienceId" firstAndThirdPartyAudienceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body EditCustomerMatchMembersRequest})

(defn combinedAudiences-get
  "Gets a combined audience.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/combinedAudiences/get

combinedAudienceId <> 

optional:
partnerId <string> The ID of the partner that has access to the fetched combined audience.
advertiserId <string> The ID of the advertiser that has access to the fetched combined audience."
  ([combinedAudienceId] (combinedAudiences-get combinedAudienceId nil))
  ([combinedAudienceId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/combinedAudiences/{+combinedAudienceId}",
     :uri-template-args {"combinedAudienceId" combinedAudienceId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn combinedAudiences-list
  "Lists combined audiences. The order is defined by the order_by parameter.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/combinedAudiences/list

optional:
partnerId <string> The ID of the partner that has access to the fetched combined audiences.
advertiserId <string> The ID of the advertiser that has access to the fetched combined audiences.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `combinedAudienceId` (default) * `displayName` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `displayName desc`.
filter <string> Allows filtering by combined audience fields. Supported syntax: * Filter expressions for combined audiences can only contain at most one restriction. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `HAS (:)` operator. Supported fields: * `displayName` Examples: * All combined audiences for which the display name contains \"Google\": `displayName : \"Google\"`. The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([] (combinedAudiences-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/combinedAudiences",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn guaranteedOrders-create
  "Creates a new guaranteed order. Returns the newly created guaranteed order if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/guaranteedOrders/create

GuaranteedOrder:
GuaranteedOrder

optional:
partnerId <string> The ID of the partner that the request is being made within.
advertiserId <string> The ID of the advertiser that the request is being made within."
  ([GuaranteedOrder] (guaranteedOrders-create GuaranteedOrder nil))
  ([GuaranteedOrder optional]
    {:method :post,
     :uri-template
     "https://displayvideo.googleapis.com/v3/guaranteedOrders",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body GuaranteedOrder}))

(defn guaranteedOrders-get
  "Gets a guaranteed order.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/guaranteedOrders/get

guaranteedOrderId <> 

optional:
partnerId <string> The ID of the partner that has access to the guaranteed order.
advertiserId <string> The ID of the advertiser that has access to the guaranteed order."
  ([guaranteedOrderId] (guaranteedOrders-get guaranteedOrderId nil))
  ([guaranteedOrderId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/guaranteedOrders/{+guaranteedOrderId}",
     :uri-template-args {"guaranteedOrderId" guaranteedOrderId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn guaranteedOrders-list
  "Lists guaranteed orders that are accessible to the current user. The order is defined by the order_by parameter. If a filter by entity_status is not specified, guaranteed orders with entity status `ENTITY_STATUS_ARCHIVED` will not be included in the results.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/guaranteedOrders/list

optional:
partnerId <string> The ID of the partner that has access to the guaranteed order.
advertiserId <string> The ID of the advertiser that has access to the guaranteed order.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`.
orderBy <string> Field by which to sort the list. Acceptable values are: * `displayName` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. For example, `displayName desc`.
filter <string> Allows filtering by guaranteed order fields. * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `guaranteed_order_id` * `exchange` * `display_name` * `status.entityStatus` Examples: * All active guaranteed orders: `status.entityStatus=\"ENTITY_STATUS_ACTIVE\"` * Guaranteed orders belonging to Google Ad Manager or Rubicon exchanges: `exchange=\"EXCHANGE_GOOGLE_AD_MANAGER\" OR exchange=\"EXCHANGE_RUBICON\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([] (guaranteedOrders-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/guaranteedOrders",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn guaranteedOrders-patch
  "Updates an existing guaranteed order. Returns the updated guaranteed order if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/guaranteedOrders/patch

guaranteedOrderId <> 
GuaranteedOrder:
GuaranteedOrder

optional:
updateMask <string> Required. The mask to control which fields to update.
partnerId <string> The ID of the partner that the request is being made within.
advertiserId <string> The ID of the advertiser that the request is being made within."
  ([guaranteedOrderId GuaranteedOrder]
    (guaranteedOrders-patch guaranteedOrderId GuaranteedOrder nil))
  ([guaranteedOrderId GuaranteedOrder optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/guaranteedOrders/{+guaranteedOrderId}",
     :uri-template-args {"guaranteedOrderId" guaranteedOrderId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body GuaranteedOrder}))

(defn guaranteedOrders-editGuaranteedOrderReadAccessors
  "Edits read advertisers of a guaranteed order.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/guaranteedOrders/editGuaranteedOrderReadAccessors

guaranteedOrderId <> 
EditGuaranteedOrderReadAccessorsRequest:
EditGuaranteedOrderReadAccessorsRequest"
  [guaranteedOrderId EditGuaranteedOrderReadAccessorsRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/guaranteedOrders/{+guaranteedOrderId}:editGuaranteedOrderReadAccessors",
   :uri-template-args {"guaranteedOrderId" guaranteedOrderId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body EditGuaranteedOrderReadAccessorsRequest})

(defn sdfdownloadtasks-create
  "Creates an SDF Download Task. Returns an Operation. An SDF Download Task is a long-running, asynchronous operation. The metadata type of this operation is SdfDownloadTaskMetadata. If the request is successful, the response type of the operation is SdfDownloadTask. The response will not include the download files, which must be retrieved with media.download. The state of operation can be retrieved with sdfdownloadtask.operations.get. Any errors can be found in the error.message. Note that error.details is expected to be empty.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/sdfdownloadtasks/create

CreateSdfDownloadTaskRequest:
CreateSdfDownloadTaskRequest"
  [CreateSdfDownloadTaskRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/sdfdownloadtasks",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body CreateSdfDownloadTaskRequest})

(defn sdfdownloadtasks-operations-get
  "Gets the latest state of an asynchronous SDF download task operation. Clients should poll this method at intervals of 30 seconds.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/sdfdownloadtasks/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://displayvideo.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/display-video"
    "https://www.googleapis.com/auth/doubleclickbidmanager"]})

(defn users-get
  "Gets a user. This method has unique authentication requirements. Read the prerequisites in our [Managing Users guide](/display-video/api/guides/users/overview#prerequisites) before using this method. The \"Try this method\" feature does not work for this method.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/users/get

userId <> "
  [userId]
  {:method :get,
   :uri-template
   "https://displayvideo.googleapis.com/v3/users/{+userId}",
   :uri-template-args {"userId" userId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/display-video-user-management"]})

(defn users-list
  "Lists users that are accessible to the current user. If two users have user roles on the same partner or advertiser, they can access each other. This method has unique authentication requirements. Read the prerequisites in our [Managing Users guide](/display-video/api/guides/users/overview#prerequisites) before using this method. The \"Try this method\" feature does not work for this method.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/users/list

optional:
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`.
orderBy <string> Field by which to sort the list. Acceptable values are: * `displayName` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. For example, `displayName desc`.
filter <string> Allows filtering by user fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `AND`. * A restriction has the form of `{field} {operator} {value}`. * The `displayName` and `email` fields must use the `HAS (:)` operator. * The `lastLoginTime` field must use either the `LESS THAN OR EQUAL TO (<=)` or `GREATER THAN OR EQUAL TO (>=)` operator. * All other fields must use the `EQUALS (=)` operator. Supported fields: * `assignedUserRole.advertiserId` * `assignedUserRole.entityType`: This is synthetic field of `AssignedUserRole` used for filtering. Identifies the type of entity to which the user role is assigned. Valid values are `Partner` and `Advertiser`. * `assignedUserRole.parentPartnerId`: This is a synthetic field of `AssignedUserRole` used for filtering. Identifies the parent partner of the entity to which the user role is assigned. * `assignedUserRole.partnerId` * `assignedUserRole.userRole` * `displayName` * `email` * `lastLoginTime` (input in ISO 8601 format, or `YYYY-MM-DDTHH:MM:SSZ`) Examples: * The user with `displayName` containing \"foo\": `displayName:\"foo\"` * The user with `email` containing \"bar\": `email:\"bar\"` * All users with standard user roles: `assignedUserRole.userRole=\"STANDARD\"` * All users with user roles for partner 123: `assignedUserRole.partnerId=\"123\"` * All users with user roles for advertiser 123: `assignedUserRole.advertiserId=\"123\"` * All users with partner level user roles: `entityType=\"PARTNER\"` * All users with user roles for partner 123 and advertisers under partner 123: `parentPartnerId=\"123\"` * All users that last logged in on or after 2023-01-01T00:00:00Z (format of ISO 8601): `lastLoginTime>=\"2023-01-01T00:00:00Z\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([] (users-list nil))
  ([optional]
    {:method :get,
     :uri-template "https://displayvideo.googleapis.com/v3/users",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/display-video-user-management"]}))

(defn users-create
  "Creates a new user. Returns the newly created user if successful. This method has unique authentication requirements. Read the prerequisites in our [Managing Users guide](/display-video/api/guides/users/overview#prerequisites) before using this method. The \"Try this method\" feature does not work for this method.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/users/create

User:
User"
  [User]
  {:method :post,
   :uri-template "https://displayvideo.googleapis.com/v3/users",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/display-video-user-management"],
   :body User})

(defn users-patch
  "Updates an existing user. Returns the updated user if successful. This method has unique authentication requirements. Read the prerequisites in our [Managing Users guide](/display-video/api/guides/users/overview#prerequisites) before using this method. The \"Try this method\" feature does not work for this method.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/users/patch

userId <> 
User:
User

optional:
updateMask <string> Required. The mask to control which fields to update."
  ([userId User] (users-patch userId User nil))
  ([userId User optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/users/{+userId}",
     :uri-template-args {"userId" userId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/display-video-user-management"],
     :body User}))

(defn users-delete
  "Deletes a user. This method has unique authentication requirements. Read the prerequisites in our [Managing Users guide](/display-video/api/guides/users/overview#prerequisites) before using this method. The \"Try this method\" feature does not work for this method.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/users/delete

userId <> "
  [userId]
  {:method :delete,
   :uri-template
   "https://displayvideo.googleapis.com/v3/users/{+userId}",
   :uri-template-args {"userId" userId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/display-video-user-management"]})

(defn users-bulkEditAssignedUserRoles
  "Bulk edits user roles for a user. The operation will delete the assigned user roles provided in BulkEditAssignedUserRolesRequest.deletedAssignedUserRoles and then assign the user roles provided in BulkEditAssignedUserRolesRequest.createdAssignedUserRoles. This method has unique authentication requirements. Read the prerequisites in our [Managing Users guide](/display-video/api/guides/users/overview#prerequisites) before using this method. The \"Try this method\" feature does not work for this method.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/users/bulkEditAssignedUserRoles

userId <> 
BulkEditAssignedUserRolesRequest:
BulkEditAssignedUserRolesRequest"
  [userId BulkEditAssignedUserRolesRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/users/{+userId}:bulkEditAssignedUserRoles",
   :uri-template-args {"userId" userId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/display-video-user-management"],
   :body BulkEditAssignedUserRolesRequest})

(defn customLists-get
  "Gets a custom list.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/customLists/get

customListId <> 

optional:
advertiserId <string> The ID of the DV360 advertiser that has access to the fetched custom lists."
  ([customListId] (customLists-get customListId nil))
  ([customListId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/customLists/{+customListId}",
     :uri-template-args {"customListId" customListId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn customLists-list
  "Lists custom lists. The order is defined by the order_by parameter.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/customLists/list

optional:
advertiserId <string> The ID of the DV360 advertiser that has access to the fetched custom lists.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `customListId` (default) * `displayName` The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `displayName desc`.
filter <string> Allows filtering by custom list fields. Supported syntax: * Filter expressions for custom lists can only contain at most one restriction. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `HAS (:)` operator. Supported fields: * `displayName` Examples: * All custom lists for which the display name contains \"Google\": `displayName:\"Google\"`. The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([] (customLists-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/customLists",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn targetingTypes-targetingOptions-get
  "Gets a single targeting option.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/targetingTypes/targetingOptions/get

targetingType <> 
targetingOptionId <> 

optional:
advertiserId <string> Required. The Advertiser this request is being made in the context of."
  ([targetingType targetingOptionId]
    (targetingTypes-targetingOptions-get
      targetingType
      targetingOptionId
      nil))
  ([targetingType targetingOptionId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/targetingTypes/{+targetingType}/targetingOptions/{+targetingOptionId}",
     :uri-template-args
     {"targetingType" targetingType,
      "targetingOptionId" targetingOptionId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn targetingTypes-targetingOptions-list
  "Lists targeting options of a given type.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/targetingTypes/targetingOptions/list

targetingType <> 

optional:
advertiserId <string> Required. The Advertiser this request is being made in the context of.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `targetingOptionId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `targetingOptionId desc`.
filter <string> Allows filtering by targeting option fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `OR` logical operators. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `carrierAndIspDetails.type` * `geoRegionDetails.geoRegionType` * `targetingOptionId` Examples: * All `GEO REGION` targeting options that belong to sub type `GEO_REGION_TYPE_COUNTRY` or `GEO_REGION_TYPE_STATE`: `geoRegionDetails.geoRegionType=\"GEO_REGION_TYPE_COUNTRY\" OR geoRegionDetails.geoRegionType=\"GEO_REGION_TYPE_STATE\"` * All `CARRIER AND ISP` targeting options that belong to sub type `CARRIER_AND_ISP_TYPE_CARRIER`: `carrierAndIspDetails.type=\"CARRIER_AND_ISP_TYPE_CARRIER\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([targetingType]
    (targetingTypes-targetingOptions-list targetingType nil))
  ([targetingType optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/targetingTypes/{+targetingType}/targetingOptions",
     :uri-template-args {"targetingType" targetingType},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn targetingTypes-targetingOptions-search
  "Searches for targeting options of a given type based on the given search terms.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/targetingTypes/targetingOptions/search

targetingType <> 
SearchTargetingOptionsRequest:
SearchTargetingOptionsRequest"
  [targetingType SearchTargetingOptionsRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/targetingTypes/{+targetingType}/targetingOptions:search",
   :uri-template-args {"targetingType" targetingType},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body SearchTargetingOptionsRequest})

(defn inventorySources-get
  "Gets an inventory source.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/inventorySources/get

inventorySourceId <> 

optional:
partnerId <string> Required. The ID of the DV360 partner to which the fetched inventory source is permissioned.
advertiserId <string> Optional. The ID of the DV360 advertiser to which the fetched inventory source is permissioned. If the user only has access to the advertiser and not the parent partner, use this field to specify the relevant advertiser."
  ([inventorySourceId] (inventorySources-get inventorySourceId nil))
  ([inventorySourceId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/inventorySources/{+inventorySourceId}",
     :uri-template-args {"inventorySourceId" inventorySourceId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn inventorySources-list
  "Lists inventory sources that are accessible to the current user. The order is defined by the order_by parameter. If a filter by entity_status is not specified, inventory sources with entity status `ENTITY_STATUS_ARCHIVED` will not be included in the results.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/inventorySources/list

optional:
partnerId <string> The ID of the partner that has access to the inventory source.
advertiserId <string> The ID of the advertiser that has access to the inventory source.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`.
orderBy <string> Field by which to sort the list. Acceptable values are: * `displayName` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. For example, `displayName desc`.
filter <string> Allows filtering by inventory source fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * All fields must use the `EQUALS (=)` operator. Supported fields: * `status.entityStatus` * `commitment` * `deliveryMethod` * `rateDetails.rateType` * `exchange` Examples: * All active inventory sources: `status.entityStatus=\"ENTITY_STATUS_ACTIVE\"` * Inventory sources belonging to Google Ad Manager or Rubicon exchanges: `exchange=\"EXCHANGE_GOOGLE_AD_MANAGER\" OR exchange=\"EXCHANGE_RUBICON\"` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([] (inventorySources-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/inventorySources",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn inventorySources-create
  "Creates a new inventory source. Returns the newly created inventory source if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/inventorySources/create

InventorySource:
InventorySource

optional:
partnerId <string> The ID of the partner that the request is being made within.
advertiserId <string> The ID of the advertiser that the request is being made within."
  ([InventorySource] (inventorySources-create InventorySource nil))
  ([InventorySource optional]
    {:method :post,
     :uri-template
     "https://displayvideo.googleapis.com/v3/inventorySources",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body InventorySource}))

(defn inventorySources-patch
  "Updates an existing inventory source. Returns the updated inventory source if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/inventorySources/patch

inventorySourceId <> 
InventorySource:
InventorySource

optional:
updateMask <string> Required. The mask to control which fields to update.
partnerId <string> The ID of the partner that the request is being made within.
advertiserId <string> The ID of the advertiser that the request is being made within."
  ([inventorySourceId InventorySource]
    (inventorySources-patch inventorySourceId InventorySource nil))
  ([inventorySourceId InventorySource optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/inventorySources/{+inventorySourceId}",
     :uri-template-args {"inventorySourceId" inventorySourceId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body InventorySource}))

(defn inventorySources-editInventorySourceReadWriteAccessors
  "Edits read/write accessors of an inventory source. Returns the updated read_write_accessors for the inventory source.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/inventorySources/editInventorySourceReadWriteAccessors

inventorySourceId <> 
EditInventorySourceReadWriteAccessorsRequest:
EditInventorySourceReadWriteAccessorsRequest"
  [inventorySourceId EditInventorySourceReadWriteAccessorsRequest]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/inventorySources/{+inventorySourceId}:editInventorySourceReadWriteAccessors",
   :uri-template-args {"inventorySourceId" inventorySourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body EditInventorySourceReadWriteAccessorsRequest})

(defn customBiddingAlgorithms-uploadRules
  "Creates a rules reference object for an AlgorithmRules file. The resulting reference object provides a resource path where the AlgorithmRules file should be uploaded. This reference object should be included when creating a new CustomBiddingAlgorithmRules resource.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/customBiddingAlgorithms/uploadRules

customBiddingAlgorithmId <> 

optional:
partnerId <string> The ID of the partner that owns the parent custom bidding algorithm.
advertiserId <string> The ID of the advertiser that owns the parent custom bidding algorithm."
  ([customBiddingAlgorithmId]
    (customBiddingAlgorithms-uploadRules customBiddingAlgorithmId nil))
  ([customBiddingAlgorithmId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/customBiddingAlgorithms/{+customBiddingAlgorithmId}:uploadRules",
     :uri-template-args
     {"customBiddingAlgorithmId" customBiddingAlgorithmId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn customBiddingAlgorithms-get
  "Gets a custom bidding algorithm.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/customBiddingAlgorithms/get

customBiddingAlgorithmId <> 

optional:
partnerId <string> The ID of the DV360 partner that has access to the custom bidding algorithm.
advertiserId <string> The ID of the DV360 partner that has access to the custom bidding algorithm."
  ([customBiddingAlgorithmId]
    (customBiddingAlgorithms-get customBiddingAlgorithmId nil))
  ([customBiddingAlgorithmId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/customBiddingAlgorithms/{+customBiddingAlgorithmId}",
     :uri-template-args
     {"customBiddingAlgorithmId" customBiddingAlgorithmId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn customBiddingAlgorithms-list
  "Lists custom bidding algorithms that are accessible to the current user and can be used in bidding stratgies. The order is defined by the order_by parameter.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/customBiddingAlgorithms/list

optional:
partnerId <string> The ID of the DV360 partner that has access to the custom bidding algorithm.
advertiserId <string> The ID of the DV360 advertiser that has access to the custom bidding algorithm.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `displayName` (default) The default sorting order is ascending. To specify descending order for a field, a suffix \"desc\" should be added to the field name. Example: `displayName desc`.
filter <string> Allows filtering by custom bidding algorithm fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND`. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field} {operator} {value}`. * The `customBiddingAlgorithmType` field must use the `EQUALS (=)` operator. * The `displayName` field must use the `HAS (:)` operator. Supported fields: * `customBiddingAlgorithmType` * `displayName` Examples: * All custom bidding algorithms for which the display name contains \"politics\": `displayName:\"politics\"`. * All custom bidding algorithms for which the type is \"SCRIPT_BASED\": `customBiddingAlgorithmType=SCRIPT_BASED` The length of this field should be no more than 500 characters. Reference our [filter `LIST` requests](/display-video/api/guides/how-tos/filters) guide for more information."
  ([] (customBiddingAlgorithms-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/customBiddingAlgorithms",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn customBiddingAlgorithms-create
  "Creates a new custom bidding algorithm. Returns the newly created custom bidding algorithm if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/customBiddingAlgorithms/create

CustomBiddingAlgorithm:
CustomBiddingAlgorithm"
  [CustomBiddingAlgorithm]
  {:method :post,
   :uri-template
   "https://displayvideo.googleapis.com/v3/customBiddingAlgorithms",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/display-video"],
   :body CustomBiddingAlgorithm})

(defn customBiddingAlgorithms-patch
  "Updates an existing custom bidding algorithm. Returns the updated custom bidding algorithm if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/customBiddingAlgorithms/patch

customBiddingAlgorithmId <> 
CustomBiddingAlgorithm:
CustomBiddingAlgorithm

optional:
updateMask <string> Required. The mask to control which fields to update."
  ([customBiddingAlgorithmId CustomBiddingAlgorithm]
    (customBiddingAlgorithms-patch
      customBiddingAlgorithmId
      CustomBiddingAlgorithm
      nil))
  ([customBiddingAlgorithmId CustomBiddingAlgorithm optional]
    {:method :patch,
     :uri-template
     "https://displayvideo.googleapis.com/v3/customBiddingAlgorithms/{+customBiddingAlgorithmId}",
     :uri-template-args
     {"customBiddingAlgorithmId" customBiddingAlgorithmId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body CustomBiddingAlgorithm}))

(defn customBiddingAlgorithms-uploadScript
  "Creates a custom bidding script reference object for a script file. The resulting reference object provides a resource path to which the script file should be uploaded. This reference object should be included in when creating a new custom bidding script object.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/customBiddingAlgorithms/uploadScript

customBiddingAlgorithmId <> 

optional:
partnerId <string> The ID of the partner that owns the parent custom bidding algorithm. Only this partner will have write access to this custom bidding script.
advertiserId <string> The ID of the advertiser that owns the parent custom bidding algorithm."
  ([customBiddingAlgorithmId]
    (customBiddingAlgorithms-uploadScript
      customBiddingAlgorithmId
      nil))
  ([customBiddingAlgorithmId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/customBiddingAlgorithms/{+customBiddingAlgorithmId}:uploadScript",
     :uri-template-args
     {"customBiddingAlgorithmId" customBiddingAlgorithmId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn customBiddingAlgorithms-rules-create
  "Creates a new rules resource. Returns the newly created rules resource if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/customBiddingAlgorithms/rules/create

customBiddingAlgorithmId <> 
CustomBiddingAlgorithmRules:
CustomBiddingAlgorithmRules

optional:
partnerId <string> The ID of the partner that owns the parent custom bidding algorithm. Only this partner will have write access to this rules resource.
advertiserId <string> The ID of the advertiser that owns the parent custom bidding algorithm."
  ([customBiddingAlgorithmId CustomBiddingAlgorithmRules]
    (customBiddingAlgorithms-rules-create
      customBiddingAlgorithmId
      CustomBiddingAlgorithmRules
      nil))
  ([customBiddingAlgorithmId CustomBiddingAlgorithmRules optional]
    {:method :post,
     :uri-template
     "https://displayvideo.googleapis.com/v3/customBiddingAlgorithms/{+customBiddingAlgorithmId}/rules",
     :uri-template-args
     {"customBiddingAlgorithmId" customBiddingAlgorithmId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body CustomBiddingAlgorithmRules}))

(defn customBiddingAlgorithms-rules-get
  "Retrieves a rules resource.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/customBiddingAlgorithms/rules/get

customBiddingAlgorithmId <> 
customBiddingAlgorithmRulesId <> 

optional:
partnerId <string> The ID of the partner that owns the parent custom bidding algorithm.
advertiserId <string> The ID of the advertiser that owns the parent custom bidding algorithm."
  ([customBiddingAlgorithmId customBiddingAlgorithmRulesId]
    (customBiddingAlgorithms-rules-get
      customBiddingAlgorithmId
      customBiddingAlgorithmRulesId
      nil))
  ([customBiddingAlgorithmId customBiddingAlgorithmRulesId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/customBiddingAlgorithms/{+customBiddingAlgorithmId}/rules/{+customBiddingAlgorithmRulesId}",
     :uri-template-args
     {"customBiddingAlgorithmId" customBiddingAlgorithmId,
      "customBiddingAlgorithmRulesId" customBiddingAlgorithmRulesId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn customBiddingAlgorithms-rules-list
  "Lists rules resources that belong to the given algorithm. The order is defined by the order_by parameter.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/customBiddingAlgorithms/rules/list

customBiddingAlgorithmId <> 

optional:
partnerId <string> The ID of the partner that owns the parent custom bidding algorithm.
advertiserId <string> The ID of the advertiser that owns the parent custom bidding algorithm.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `createTime desc` (default) The default sorting order is descending. To specify ascending order for a field, the suffix \"desc\" should be removed. Example: `createTime`."
  ([customBiddingAlgorithmId]
    (customBiddingAlgorithms-rules-list customBiddingAlgorithmId nil))
  ([customBiddingAlgorithmId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/customBiddingAlgorithms/{+customBiddingAlgorithmId}/rules",
     :uri-template-args
     {"customBiddingAlgorithmId" customBiddingAlgorithmId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn customBiddingAlgorithms-scripts-create
  "Creates a new custom bidding script. Returns the newly created script if successful.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/customBiddingAlgorithms/scripts/create

customBiddingAlgorithmId <> 
CustomBiddingScript:
CustomBiddingScript

optional:
partnerId <string> The ID of the partner that owns the parent custom bidding algorithm. Only this partner will have write access to this custom bidding script.
advertiserId <string> The ID of the advertiser that owns the parent custom bidding algorithm."
  ([customBiddingAlgorithmId CustomBiddingScript]
    (customBiddingAlgorithms-scripts-create
      customBiddingAlgorithmId
      CustomBiddingScript
      nil))
  ([customBiddingAlgorithmId CustomBiddingScript optional]
    {:method :post,
     :uri-template
     "https://displayvideo.googleapis.com/v3/customBiddingAlgorithms/{+customBiddingAlgorithmId}/scripts",
     :uri-template-args
     {"customBiddingAlgorithmId" customBiddingAlgorithmId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"],
     :body CustomBiddingScript}))

(defn customBiddingAlgorithms-scripts-get
  "Gets a custom bidding script.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/customBiddingAlgorithms/scripts/get

customBiddingAlgorithmId <> 
customBiddingScriptId <> 

optional:
partnerId <string> The ID of the partner that owns the parent custom bidding algorithm. Only this partner will have write access to this custom bidding script.
advertiserId <string> The ID of the advertiser that owns the parent custom bidding algorithm."
  ([customBiddingAlgorithmId customBiddingScriptId]
    (customBiddingAlgorithms-scripts-get
      customBiddingAlgorithmId
      customBiddingScriptId
      nil))
  ([customBiddingAlgorithmId customBiddingScriptId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/customBiddingAlgorithms/{+customBiddingAlgorithmId}/scripts/{+customBiddingScriptId}",
     :uri-template-args
     {"customBiddingAlgorithmId" customBiddingAlgorithmId,
      "customBiddingScriptId" customBiddingScriptId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))

(defn customBiddingAlgorithms-scripts-list
  "Lists custom bidding scripts that belong to the given algorithm. The order is defined by the order_by parameter.
https://developers.google.com/display-video/api/guides/getting-started/overview/v3/reference/rest/v3/customBiddingAlgorithms/scripts/list

customBiddingAlgorithmId <> 

optional:
partnerId <string> The ID of the partner that owns the parent custom bidding algorithm. Only this partner will have write access to this custom bidding script.
advertiserId <string> The ID of the advertiser that owns the parent custom bidding algorithm.
pageSize <integer> Requested page size. Must be between `1` and `200`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
orderBy <string> Field by which to sort the list. Acceptable values are: * `createTime desc` (default) The default sorting order is descending. To specify ascending order for a field, the suffix \"desc\" should be removed. Example: `createTime`."
  ([customBiddingAlgorithmId]
    (customBiddingAlgorithms-scripts-list
      customBiddingAlgorithmId
      nil))
  ([customBiddingAlgorithmId optional]
    {:method :get,
     :uri-template
     "https://displayvideo.googleapis.com/v3/customBiddingAlgorithms/{+customBiddingAlgorithmId}/scripts",
     :uri-template-args
     {"customBiddingAlgorithmId" customBiddingAlgorithmId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/display-video"]}))
