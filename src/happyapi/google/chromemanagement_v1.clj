(ns happyapi.google.chromemanagement-v1
  "Chrome Management API
The Chrome Management API is a suite of services that allows Chrome administrators to view, manage and gain insights on their Chrome OS and Chrome Browser devices.
See: https://developers.google.com/chrome/management/"
  (:require [happyapi.providers.google :as client]))

(defn customers-reports-countInstalledApps
  "Generate report of app installations.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/reports/countInstalledApps

customer <> 

optional:
orderBy <string> Field used to order results. Supported order by fields: * app_name * app_type * install_type * number_of_permissions * total_install_count * app_id * manifest_versions
orgUnitId <string> The ID of the organizational unit.
pageSize <integer> Maximum number of results to return. Maximum and default are 100.
filter <string> Query string to filter results, AND-separated fields in EBNF syntax. Note: OR operations are not supported in this filter. Supported filter fields: * app_name * app_type * install_type * number_of_permissions * total_install_count * latest_profile_active_date * permission_name * app_id * manifest_versions"
  ([customer] (customers-reports-countInstalledApps customer nil))
  ([customer optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+customer}/reports:countInstalledApps",
       :uri-template-args {"customer" customer},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.reports.readonly"]})))

(defn customers-reports-countPrintJobsByUser
  "Get a summary of printing done by each user.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/reports/countPrintJobsByUser

customer <> 

optional:
filter <string> Query string to filter results, AND-separated fields in EBNF syntax. Note: OR operations are not supported in this filter. Note: Only >= and <= comparators are supported in this filter. Supported filter fields: * complete_time
orderBy <string> Field used to order results. If omitted, results will be ordered in ascending order of the 'user_email' field. Supported order_by fields: * user_email * job_count * printer_count * device_count
printerOrgUnitId <string> The ID of the organizational unit for printers. If specified, only print jobs initiated with printers from the specified organizational unit will be counted. If omitted, all print jobs will be counted.
pageSize <integer> Maximum number of results to return. Maximum and default are 100."
  ([customer] (customers-reports-countPrintJobsByUser customer nil))
  ([customer optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+customer}/reports:countPrintJobsByUser",
       :uri-template-args {"customer" customer},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.reports.readonly"]})))

(defn customers-reports-countChromeDevicesThatNeedAttention
  "Counts of ChromeOS devices that have not synced policies or have lacked user activity in the past 28 days, are out of date, or are not complaint. Further information can be found here https://support.google.com/chrome/a/answer/10564947
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/reports/countChromeDevicesThatNeedAttention

customer <> 

optional:
orgUnitId <string> Optional. The ID of the organizational unit. If omitted, all data will be returned.
readMask <string> Required. Mask of the fields that should be populated in the returned report."
  ([customer]
    (customers-reports-countChromeDevicesThatNeedAttention
      customer
      nil))
  ([customer optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+customer}/reports:countChromeDevicesThatNeedAttention",
       :uri-template-args {"customer" customer},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.reports.readonly"]})))

(defn customers-reports-findInstalledAppDevices
  "Generate report of managed Chrome browser devices that have a specified app installed.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/reports/findInstalledAppDevices

customer <> 

optional:
orgUnitId <string> The ID of the organizational unit.
pageSize <integer> Maximum number of results to return. Maximum and default are 100.
appId <string> Unique identifier of the app. For Chrome apps and extensions, the 32-character id (e.g. ehoadneljpdggcbbknedodolkkjodefl). For Android apps, the package name (e.g. com.evernote).
filter <string> Query string to filter results, AND-separated fields in EBNF syntax. Note: OR operations are not supported in this filter. Supported filter fields: * last_active_date
orderBy <string> Field used to order results. Supported order by fields: * machine * device_id
appType <string> Type of the app."
  ([customer] (customers-reports-findInstalledAppDevices customer nil))
  ([customer optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+customer}/reports:findInstalledAppDevices",
       :uri-template-args {"customer" customer},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.reports.readonly"]})))

(defn customers-reports-countChromeHardwareFleetDevices
  "Counts of devices with a specific hardware specification from the requested hardware type (for example model name, processor type). Further information can be found here https://support.google.com/chrome/a/answer/10564947
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/reports/countChromeHardwareFleetDevices

customer <> 

optional:
readMask <string> Required. Mask of the fields that should be populated in the returned report.
orgUnitId <string> Optional. The ID of the organizational unit. If omitted, all data will be returned."
  ([customer]
    (customers-reports-countChromeHardwareFleetDevices customer nil))
  ([customer optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+customer}/reports:countChromeHardwareFleetDevices",
       :uri-template-args {"customer" customer},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.reports.readonly"]})))

(defn customers-reports-countPrintJobsByPrinter
  "Get a summary of printing done by each printer.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/reports/countPrintJobsByPrinter

customer <> 

optional:
orderBy <string> Field used to order results. If omitted, results will be ordered in ascending order of the 'printer' field. Supported order_by fields: * printer * job_count * device_count * user_count
printerOrgUnitId <string> The ID of the organizational unit for printers. If specified, only data for printers from the specified organizational unit will be returned. If omitted, data for printers from all organizational units will be returned.
pageSize <integer> Maximum number of results to return. Maximum and default are 100.
filter <string> Query string to filter results, AND-separated fields in EBNF syntax. Note: OR operations are not supported in this filter. Note: Only >= and <= comparators are supported in this filter. Supported filter fields: * complete_time"
  ([customer] (customers-reports-countPrintJobsByPrinter customer nil))
  ([customer optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+customer}/reports:countPrintJobsByPrinter",
       :uri-template-args {"customer" customer},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.reports.readonly"]})))

(defn customers-reports-countChromeBrowsersNeedingAttention
  "Count of Chrome Browsers that have been recently enrolled, have new policy to be synced, or have no recent activity.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/reports/countChromeBrowsersNeedingAttention

customer <> 

optional:
orgUnitId <string> Optional. The ID of the organizational unit. If omitted, all data will be returned."
  ([customer]
    (customers-reports-countChromeBrowsersNeedingAttention
      customer
      nil))
  ([customer optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+customer}/reports:countChromeBrowsersNeedingAttention",
       :uri-template-args {"customer" customer},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.reports.readonly"]})))

(defn customers-reports-countChromeDevicesReachingAutoExpirationDate
  "Generate report of the number of devices expiring in each month of the selected time frame. Devices are grouped by auto update expiration date and model. Further information can be found [here](https://support.google.com/chrome/a/answer/10564947).
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/reports/countChromeDevicesReachingAutoExpirationDate

customer <> 

optional:
orgUnitId <string> Optional. The organizational unit ID, if omitted, will return data for all organizational units.
minAueDate <string> Optional. Maximum expiration date in format yyyy-mm-dd in UTC timezone. If included returns all devices that have already expired and devices with auto expiration date equal to or later than the minimum date.
maxAueDate <string> Optional. Maximum expiration date in format yyyy-mm-dd in UTC timezone. If included returns all devices that have already expired and devices with auto expiration date equal to or earlier than the maximum date."
  ([customer]
    (customers-reports-countChromeDevicesReachingAutoExpirationDate
      customer
      nil))
  ([customer optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+customer}/reports:countChromeDevicesReachingAutoExpirationDate",
       :uri-template-args {"customer" customer},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.reports.readonly"]})))

(defn customers-reports-enumeratePrintJobs
  "Get a list of print jobs.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/reports/enumeratePrintJobs

customer <> 

optional:
pageSize <integer> The number of print jobs in the page from 0 to 100 inclusive, if page_size is not specified or zero, the size will be 50.
orderBy <string> Field used to order results. If not specified, results will be ordered in descending order of the `complete_time` field. Supported order by fields: * title * state * create_time * complete_time * document_page_count * color_mode * duplex_mode * printer * user_email
filter <string> Query string to filter results, AND-separated fields in EBNF syntax. Note: OR operations are not supported in this filter. Note: Only >= and <= comparators are supported for `complete_time`. Note: Only = comparator supported for `user_id` and `printer_id`. Supported filter fields: * complete_time * printer_id * user_id
printerOrgUnitId <string> The ID of the organizational unit for printers. If specified, only print jobs submitted to printers from the specified organizational unit will be returned."
  ([customer] (customers-reports-enumeratePrintJobs customer nil))
  ([customer optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+customer}/reports:enumeratePrintJobs",
       :uri-template-args {"customer" customer},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.reports.readonly"]})))

(defn customers-reports-countChromeVersions
  "Generate report of installed Chrome versions.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/reports/countChromeVersions

customer <> 

optional:
filter <string> Query string to filter results, AND-separated fields in EBNF syntax. Note: OR operations are not supported in this filter. Supported filter fields: * last_active_date
orgUnitId <string> The ID of the organizational unit.
pageSize <integer> Maximum number of results to return. Maximum and default are 100."
  ([customer] (customers-reports-countChromeVersions customer nil))
  ([customer optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+customer}/reports:countChromeVersions",
       :uri-template-args {"customer" customer},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.reports.readonly"]})))

(defn customers-reports-countChromeCrashEvents
  "Get a count of Chrome crash events.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/reports/countChromeCrashEvents

customer <> 

optional:
orderBy <string> Field used to order results. Supported order by fields: * browser_version * count * date
filter <string> Query string to filter results, AND-separated fields in EBNF syntax. Supported filter fields: * major_browser_version * minor_browser_version * browser_channel * device_platform * past_number_days Example: `major_browser_version = 'M115' AND past_number_days = '28'`.
orgUnitId <string> If specified, only count the number of crash events of the devices in this organizational unit."
  ([customer] (customers-reports-countChromeCrashEvents customer nil))
  ([customer optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+customer}/reports:countChromeCrashEvents",
       :uri-template-args {"customer" customer},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.reports.readonly"]})))

(defn customers-telemetry-users-list
  "List all telemetry users.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/telemetry/users/list

parent <> 

optional:
readMask <string> Read mask to specify which fields to return. Supported read_mask paths are: - name - org_unit_id - user_id - user_email - user_device.device_id - user_device.audio_status_report - user_device.device_activity_report - user_device.network_bandwidth_report - user_device.peripherals_report - user_device.app_report 
filter <string> Only include resources that match the filter. Supported filter fields: - user_id - user_org_unit_id 
pageSize <integer> Maximum number of results to return. Default value is 100. Maximum value is 1000."
  ([parent] (customers-telemetry-users-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+parent}/telemetry/users",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.telemetry.readonly"]})))

(defn customers-telemetry-users-get
  "Get telemetry user.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/telemetry/users/get

name <> 

optional:
readMask <string> Read mask to specify which fields to return. Supported read_mask paths are: - name - org_unit_id - user_id - user_email - user_device.device_id - user_device.audio_status_report - user_device.device_activity_report - user_device.network_bandwidth_report - user_device.peripherals_report - user_device.app_report "
  ([name] (customers-telemetry-users-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.telemetry.readonly"]})))

(defn customers-telemetry-events-list
  "List telemetry events.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/telemetry/events/list

parent <> 

optional:
readMask <string> Required. Read mask to specify which fields to return. Although currently required, this field will become optional, while the filter parameter with an event type will be come required. Supported read_mask paths are: - device - user - audio_severe_underrun_event - usb_peripherals_event - https_latency_change_event - network_state_change_event - wifi_signal_strength_event - vpn_connection_state_change_event - app_install_event - app_uninstall_event - app_launch_event - os_crash_event 
pageSize <integer> Optional. Maximum number of results to return. Default value is 100. Maximum value is 1000.
filter <string> Optional. Only include resources that match the filter. Although this parameter is currently optional, this parameter will be required- please specify at least 1 event type. Supported filter fields: - device_id - user_id - device_org_unit_id - user_org_unit_id - timestamp - event_type The \"timestamp\" filter accepts either the Unix Epoch milliseconds format or the RFC3339 UTC \"Zulu\" format with nanosecond resolution and up to nine fractional digits. Both formats should be surrounded by simple double quotes. Examples: \"2014-10-02T15:01:23Z\", \"2014-10-02T15:01:23.045123456Z\", \"1679283943823\"."
  ([parent] (customers-telemetry-events-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+parent}/telemetry/events",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.telemetry.readonly"]})))

(defn customers-telemetry-notificationConfigs-create
  "Create a telemetry notification config.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/telemetry/notificationConfigs/create

parent <> 
GoogleChromeManagementV1TelemetryNotificationConfig:
GoogleChromeManagementV1TelemetryNotificationConfig"
  [parent GoogleChromeManagementV1TelemetryNotificationConfig]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://chromemanagement.googleapis.com/v1/{+parent}/telemetry/notificationConfigs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chrome.management.telemetry.readonly"],
     :body GoogleChromeManagementV1TelemetryNotificationConfig}))

(defn customers-telemetry-notificationConfigs-list
  "List all telemetry notification configs.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/telemetry/notificationConfigs/list

parent <> 

optional:
pageSize <integer> The maximum number of notification configs to return. The service may return fewer than this value. If unspecified, at most 100 notification configs will be returned. The maximum value is 100; values above 100 will be coerced to 100."
  ([parent] (customers-telemetry-notificationConfigs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+parent}/telemetry/notificationConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.telemetry.readonly"]})))

(defn customers-telemetry-notificationConfigs-delete
  "Delete a telemetry notification config.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/telemetry/notificationConfigs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://chromemanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chrome.management.telemetry.readonly"]}))

(defn customers-telemetry-devices-get
  "Get telemetry device.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/telemetry/devices/get

name <> 

optional:
readMask <string> Required. Read mask to specify which fields to return. Supported read_mask paths are: - name - org_unit_id - device_id - serial_number - cpu_info - cpu_status_report - memory_info - memory_status_report - network_info - network_diagnostics_report - network_status_report - os_update_status - graphics_info - graphics_status_report - battery_info - battery_status_report - storage_info - storage_status_report - thunderbolt_info - audio_status_report - boot_performance_report - heartbeat_status_report - network_bandwidth_report - peripherals_report - kiosk_app_status_report - app_report - runtime_counters_report "
  ([name] (customers-telemetry-devices-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.telemetry.readonly"]})))

(defn customers-telemetry-devices-list
  "List all telemetry devices.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/telemetry/devices/list

parent <> 

optional:
readMask <string> Required. Read mask to specify which fields to return. Supported read_mask paths are: - name - org_unit_id - device_id - serial_number - cpu_info - cpu_status_report - memory_info - memory_status_report - network_info - network_diagnostics_report - network_status_report - os_update_status - graphics_info - graphics_status_report - battery_info - battery_status_report - storage_info - storage_status_report - thunderbolt_info - audio_status_report - boot_performance_report - heartbeat_status_report - network_bandwidth_report - peripherals_report - kiosk_app_status_report - app_report - runtime_counters_report 
filter <string> Optional. Only include resources that match the filter. Requests that don't specify a \"reports_timestamp\" value will default to returning only recent reports. Specify \"reports_timestamp>=0\" to get all report data. Supported filter fields: - org_unit_id - serial_number - device_id - reports_timestamp The \"reports_timestamp\" filter accepts either the Unix Epoch milliseconds format or the RFC3339 UTC \"Zulu\" format with nanosecond resolution and up to nine fractional digits. Both formats should be surrounded by simple double quotes. Examples: \"2014-10-02T15:01:23Z\", \"2014-10-02T15:01:23.045123456Z\", \"1679283943823\".
pageSize <integer> Maximum number of results to return. Default value is 100. Maximum value is 1000."
  ([parent] (customers-telemetry-devices-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+parent}/telemetry/devices",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.telemetry.readonly"]})))

(defn customers-apps-fetchDevicesRequestingExtension
  "Get a list of devices that have requested to install an extension.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/apps/fetchDevicesRequestingExtension

customer <> 

optional:
pageSize <integer> Optional. Maximum number of results to return. Maximum and default are 50. Any page size larger than 50 will be coerced to 50.
orgUnitId <string> The ID of the organizational unit. Only consider devices that directly belong to this org unit, i.e. sub-orgunits are not counted. If omitted, all data will be returned.
extensionId <string> Required. The extension for which we want to find requesting devices."
  ([customer]
    (customers-apps-fetchDevicesRequestingExtension customer nil))
  ([customer optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+customer}/apps:fetchDevicesRequestingExtension",
       :uri-template-args {"customer" customer},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.appdetails.readonly"]})))

(defn customers-apps-countChromeAppRequests
  "Generate summary of app installation requests.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/apps/countChromeAppRequests

customer <> 

optional:
orderBy <string> Field used to order results. Supported fields: * request_count * latest_request_time
orgUnitId <string> The ID of the organizational unit.
pageSize <integer> Maximum number of results to return. Maximum and default are 50, anything above will be coerced to 50."
  ([customer] (customers-apps-countChromeAppRequests customer nil))
  ([customer optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+customer}/apps:countChromeAppRequests",
       :uri-template-args {"customer" customer},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.appdetails.readonly"]})))

(defn customers-apps-fetchUsersRequestingExtension
  "Get a list of users that have requested to install an extension.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/apps/fetchUsersRequestingExtension

customer <> 

optional:
orgUnitId <string> The ID of the organizational unit. Only consider devices that directly belong to this org unit, i.e. sub-orgunits are not counted. If omitted, all data will be returned.
extensionId <string> Required. The extension for which we want to find the requesting users.
pageSize <integer> Optional. Maximum number of results to return. Maximum and default are 50. Any page size larger than 50 will be coerced to 50."
  ([customer]
    (customers-apps-fetchUsersRequestingExtension customer nil))
  ([customer optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://chromemanagement.googleapis.com/v1/{+customer}/apps:fetchUsersRequestingExtension",
       :uri-template-args {"customer" customer},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/chrome.management.appdetails.readonly"]})))

(defn customers-apps-chrome-get
  "Get a specific app for a customer by its resource name.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/apps/chrome/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://chromemanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chrome.management.appdetails.readonly"]}))

(defn customers-apps-android-get
  "Get a specific app for a customer by its resource name.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/apps/android/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://chromemanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chrome.management.appdetails.readonly"]}))

(defn customers-apps-web-get
  "Get a specific app for a customer by its resource name.
https://developers.google.com/chrome/management/v1/reference/rest/v1/customers/apps/web/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://chromemanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/chrome.management.appdetails.readonly"]}))
