(ns happyapi.google.bigquerydatatransfer-v1
  "BigQuery Data Transfer API
Schedule queries or transfer external data from SaaS applications to Google BigQuery on a regular basis.
See: https://cloud.google.com/bigquery/docs"
  (:require [happyapi.providers.google :as client]))

(defn projects-enrollDataSources
  "Enroll data sources in a user project. This allows users to create transfer configurations for these data sources. They will also appear in the ListDataSources RPC and as such, will appear in the [BigQuery UI](https://console.cloud.google.com/bigquery), and the documents can be found in the public guide for [BigQuery Web UI](https://cloud.google.com/bigquery/bigquery-web-ui) and [Data Transfer Service](https://cloud.google.com/bigquery/docs/working-with-transfers).
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/enrollDataSources

name <> 
EnrollDataSourcesRequest:
EnrollDataSourcesRequest"
  [name EnrollDataSourcesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}:enrollDataSources",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body EnrollDataSourcesRequest}))

(defn projects-dataSources-get
  "Retrieves a supported data source and returns its settings.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/dataSources/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-dataSources-list
  "Lists supported data sources and returns their settings.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/dataSources/list

parent <> 

optional:
pageSize <integer> Page size. The default page size is the maximum value of 1000 results."
  ([parent] (projects-dataSources-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://bigquerydatatransfer.googleapis.com/v1/{+parent}/dataSources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-dataSources-checkValidCreds
  "Returns true if valid credentials exist for the given data source and requesting user.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/dataSources/checkValidCreds

name <> 
CheckValidCredsRequest:
CheckValidCredsRequest"
  [name CheckValidCredsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}:checkValidCreds",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body CheckValidCredsRequest}))

(defn projects-transferConfigs-create
  "Creates a new data transfer configuration.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/transferConfigs/create

parent <> 
TransferConfig:
TransferConfig

optional:
authorizationCode <string> Optional OAuth2 authorization code to use with this transfer configuration. This is required only if `transferConfig.dataSourceId` is 'youtube_channel' and new credentials are needed, as indicated by `CheckValidCreds`. In order to obtain authorization_code, make a request to the following URL: https://bigquery.cloud.google.com/datatransfer/oauthz/auth?redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=authorization_code&client_id=client_id&scope=data_source_scopes * The client_id is the OAuth client_id of the a data source as returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. Note that this should not be set when `service_account_name` is used to create the transfer config.
versionInfo <string> Optional version info. This is required only if `transferConfig.dataSourceId` is not 'youtube_channel' and new credentials are needed, as indicated by `CheckValidCreds`. In order to obtain version info, make a request to the following URL: https://bigquery.cloud.google.com/datatransfer/oauthz/auth?redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=version_info&client_id=client_id&scope=data_source_scopes * The client_id is the OAuth client_id of the a data source as returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. Note that this should not be set when `service_account_name` is used to create the transfer config.
serviceAccountName <string> Optional service account email. If this field is set, the transfer config will be created with this service account's credentials. It requires that the requesting user calling this API has permissions to act as this service account. Note that not all data sources support service account credentials when creating a transfer config. For the latest list of data sources, read about [using service accounts](https://cloud.google.com/bigquery-transfer/docs/use-service-accounts)."
  ([parent TransferConfig]
    (projects-transferConfigs-create parent TransferConfig nil))
  ([parent TransferConfig optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://bigquerydatatransfer.googleapis.com/v1/{+parent}/transferConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TransferConfig})))

(defn projects-transferConfigs-patch
  "Updates a data transfer configuration. All fields must be set, even if they are not updated.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/transferConfigs/patch

name <> 
TransferConfig:
TransferConfig

optional:
authorizationCode <string> Optional OAuth2 authorization code to use with this transfer configuration. This is required only if `transferConfig.dataSourceId` is 'youtube_channel' and new credentials are needed, as indicated by `CheckValidCreds`. In order to obtain authorization_code, make a request to the following URL: https://bigquery.cloud.google.com/datatransfer/oauthz/auth?redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=authorization_code&client_id=client_id&scope=data_source_scopes * The client_id is the OAuth client_id of the a data source as returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. Note that this should not be set when `service_account_name` is used to update the transfer config.
updateMask <string> Required. Required list of fields to be updated in this request.
versionInfo <string> Optional version info. This is required only if `transferConfig.dataSourceId` is not 'youtube_channel' and new credentials are needed, as indicated by `CheckValidCreds`. In order to obtain version info, make a request to the following URL: https://bigquery.cloud.google.com/datatransfer/oauthz/auth?redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=version_info&client_id=client_id&scope=data_source_scopes * The client_id is the OAuth client_id of the a data source as returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. Note that this should not be set when `service_account_name` is used to update the transfer config.
serviceAccountName <string> Optional service account email. If this field is set, the transfer config will be created with this service account's credentials. It requires that the requesting user calling this API has permissions to act as this service account. Note that not all data sources support service account credentials when creating a transfer config. For the latest list of data sources, read about [using service accounts](https://cloud.google.com/bigquery-transfer/docs/use-service-accounts)."
  ([name TransferConfig]
    (projects-transferConfigs-patch name TransferConfig nil))
  ([name TransferConfig optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://bigquerydatatransfer.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TransferConfig})))

(defn projects-transferConfigs-delete
  "Deletes a data transfer configuration, including any associated transfer runs and logs.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/transferConfigs/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-transferConfigs-get
  "Returns information about a data transfer config.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/transferConfigs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-transferConfigs-list
  "Returns information about all transfer configs owned by a project in the specified location.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/transferConfigs/list

parent <> 

optional:
dataSourceIds <string> When specified, only configurations of requested data sources are returned.
pageSize <integer> Page size. The default page size is the maximum value of 1000 results."
  ([parent] (projects-transferConfigs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://bigquerydatatransfer.googleapis.com/v1/{+parent}/transferConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-transferConfigs-scheduleRuns
  "Creates transfer runs for a time range [start_time, end_time]. For each date - or whatever granularity the data source supports - in the range, one transfer run is created. Note that runs are created per UTC time in the time range. DEPRECATED: use StartManualTransferRuns instead.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/transferConfigs/scheduleRuns

parent <> 
ScheduleTransferRunsRequest:
ScheduleTransferRunsRequest"
  [parent ScheduleTransferRunsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+parent}:scheduleRuns",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body ScheduleTransferRunsRequest}))

(defn projects-transferConfigs-startManualRuns
  "Start manual transfer runs to be executed now with schedule_time equal to current time. The transfer runs can be created for a time range where the run_time is between start_time (inclusive) and end_time (exclusive), or for a specific run_time.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/transferConfigs/startManualRuns

parent <> 
StartManualTransferRunsRequest:
StartManualTransferRunsRequest"
  [parent StartManualTransferRunsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+parent}:startManualRuns",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body StartManualTransferRunsRequest}))

(defn projects-transferConfigs-runs-get
  "Returns information about the particular transfer run.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/transferConfigs/runs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-transferConfigs-runs-delete
  "Deletes the specified transfer run.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/transferConfigs/runs/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-transferConfigs-runs-list
  "Returns information about running and completed transfer runs.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/transferConfigs/runs/list

parent <> 

optional:
states <string> When specified, only transfer runs with requested states are returned.
pageSize <integer> Page size. The default page size is the maximum value of 1000 results.
runAttempt <string> Indicates how run attempts are to be pulled."
  ([parent] (projects-transferConfigs-runs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://bigquerydatatransfer.googleapis.com/v1/{+parent}/runs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-transferConfigs-runs-transferLogs-list
  "Returns log messages for the transfer run.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/transferConfigs/runs/transferLogs/list

parent <> 

optional:
pageSize <integer> Page size. The default page size is the maximum value of 1000 results.
messageTypes <string> Message types to return. If not populated - INFO, WARNING and ERROR messages are returned."
  ([parent]
    (projects-transferConfigs-runs-transferLogs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://bigquerydatatransfer.googleapis.com/v1/{+parent}/transferLogs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-enrollDataSources
  "Enroll data sources in a user project. This allows users to create transfer configurations for these data sources. They will also appear in the ListDataSources RPC and as such, will appear in the [BigQuery UI](https://console.cloud.google.com/bigquery), and the documents can be found in the public guide for [BigQuery Web UI](https://cloud.google.com/bigquery/bigquery-web-ui) and [Data Transfer Service](https://cloud.google.com/bigquery/docs/working-with-transfers).
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/enrollDataSources

name <> 
EnrollDataSourcesRequest:
EnrollDataSourcesRequest"
  [name EnrollDataSourcesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}:enrollDataSources",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body EnrollDataSourcesRequest}))

(defn projects-locations-unenrollDataSources
  "Unenroll data sources in a user project. This allows users to remove transfer configurations for these data sources. They will no longer appear in the ListDataSources RPC and will also no longer appear in the [BigQuery UI](https://console.cloud.google.com/bigquery). Data transfers configurations of unenrolled data sources will not be scheduled.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/unenrollDataSources

name <> 
UnenrollDataSourcesRequest:
UnenrollDataSourcesRequest"
  [name UnenrollDataSourcesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}:unenrollDataSources",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body UnenrollDataSourcesRequest}))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://bigquerydatatransfer.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-dataSources-get
  "Retrieves a supported data source and returns its settings.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/dataSources/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-dataSources-list
  "Lists supported data sources and returns their settings.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/dataSources/list

parent <> 

optional:
pageSize <integer> Page size. The default page size is the maximum value of 1000 results."
  ([parent] (projects-locations-dataSources-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://bigquerydatatransfer.googleapis.com/v1/{+parent}/dataSources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-dataSources-checkValidCreds
  "Returns true if valid credentials exist for the given data source and requesting user.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/dataSources/checkValidCreds

name <> 
CheckValidCredsRequest:
CheckValidCredsRequest"
  [name CheckValidCredsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}:checkValidCreds",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body CheckValidCredsRequest}))

(defn projects-locations-transferConfigs-create
  "Creates a new data transfer configuration.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/transferConfigs/create

parent <> 
TransferConfig:
TransferConfig

optional:
authorizationCode <string> Optional OAuth2 authorization code to use with this transfer configuration. This is required only if `transferConfig.dataSourceId` is 'youtube_channel' and new credentials are needed, as indicated by `CheckValidCreds`. In order to obtain authorization_code, make a request to the following URL: https://bigquery.cloud.google.com/datatransfer/oauthz/auth?redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=authorization_code&client_id=client_id&scope=data_source_scopes * The client_id is the OAuth client_id of the a data source as returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. Note that this should not be set when `service_account_name` is used to create the transfer config.
versionInfo <string> Optional version info. This is required only if `transferConfig.dataSourceId` is not 'youtube_channel' and new credentials are needed, as indicated by `CheckValidCreds`. In order to obtain version info, make a request to the following URL: https://bigquery.cloud.google.com/datatransfer/oauthz/auth?redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=version_info&client_id=client_id&scope=data_source_scopes * The client_id is the OAuth client_id of the a data source as returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. Note that this should not be set when `service_account_name` is used to create the transfer config.
serviceAccountName <string> Optional service account email. If this field is set, the transfer config will be created with this service account's credentials. It requires that the requesting user calling this API has permissions to act as this service account. Note that not all data sources support service account credentials when creating a transfer config. For the latest list of data sources, read about [using service accounts](https://cloud.google.com/bigquery-transfer/docs/use-service-accounts)."
  ([parent TransferConfig]
    (projects-locations-transferConfigs-create
      parent
      TransferConfig
      nil))
  ([parent TransferConfig optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://bigquerydatatransfer.googleapis.com/v1/{+parent}/transferConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TransferConfig})))

(defn projects-locations-transferConfigs-patch
  "Updates a data transfer configuration. All fields must be set, even if they are not updated.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/transferConfigs/patch

name <> 
TransferConfig:
TransferConfig

optional:
authorizationCode <string> Optional OAuth2 authorization code to use with this transfer configuration. This is required only if `transferConfig.dataSourceId` is 'youtube_channel' and new credentials are needed, as indicated by `CheckValidCreds`. In order to obtain authorization_code, make a request to the following URL: https://bigquery.cloud.google.com/datatransfer/oauthz/auth?redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=authorization_code&client_id=client_id&scope=data_source_scopes * The client_id is the OAuth client_id of the a data source as returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. Note that this should not be set when `service_account_name` is used to update the transfer config.
updateMask <string> Required. Required list of fields to be updated in this request.
versionInfo <string> Optional version info. This is required only if `transferConfig.dataSourceId` is not 'youtube_channel' and new credentials are needed, as indicated by `CheckValidCreds`. In order to obtain version info, make a request to the following URL: https://bigquery.cloud.google.com/datatransfer/oauthz/auth?redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=version_info&client_id=client_id&scope=data_source_scopes * The client_id is the OAuth client_id of the a data source as returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. Note that this should not be set when `service_account_name` is used to update the transfer config.
serviceAccountName <string> Optional service account email. If this field is set, the transfer config will be created with this service account's credentials. It requires that the requesting user calling this API has permissions to act as this service account. Note that not all data sources support service account credentials when creating a transfer config. For the latest list of data sources, read about [using service accounts](https://cloud.google.com/bigquery-transfer/docs/use-service-accounts)."
  ([name TransferConfig]
    (projects-locations-transferConfigs-patch name TransferConfig nil))
  ([name TransferConfig optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://bigquerydatatransfer.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TransferConfig})))

(defn projects-locations-transferConfigs-delete
  "Deletes a data transfer configuration, including any associated transfer runs and logs.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/transferConfigs/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-transferConfigs-get
  "Returns information about a data transfer config.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/transferConfigs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-transferConfigs-list
  "Returns information about all transfer configs owned by a project in the specified location.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/transferConfigs/list

parent <> 

optional:
dataSourceIds <string> When specified, only configurations of requested data sources are returned.
pageSize <integer> Page size. The default page size is the maximum value of 1000 results."
  ([parent] (projects-locations-transferConfigs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://bigquerydatatransfer.googleapis.com/v1/{+parent}/transferConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-transferConfigs-scheduleRuns
  "Creates transfer runs for a time range [start_time, end_time]. For each date - or whatever granularity the data source supports - in the range, one transfer run is created. Note that runs are created per UTC time in the time range. DEPRECATED: use StartManualTransferRuns instead.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/transferConfigs/scheduleRuns

parent <> 
ScheduleTransferRunsRequest:
ScheduleTransferRunsRequest"
  [parent ScheduleTransferRunsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+parent}:scheduleRuns",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body ScheduleTransferRunsRequest}))

(defn projects-locations-transferConfigs-startManualRuns
  "Start manual transfer runs to be executed now with schedule_time equal to current time. The transfer runs can be created for a time range where the run_time is between start_time (inclusive) and end_time (exclusive), or for a specific run_time.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/transferConfigs/startManualRuns

parent <> 
StartManualTransferRunsRequest:
StartManualTransferRunsRequest"
  [parent StartManualTransferRunsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+parent}:startManualRuns",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body StartManualTransferRunsRequest}))

(defn projects-locations-transferConfigs-runs-get
  "Returns information about the particular transfer run.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/transferConfigs/runs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-transferConfigs-runs-delete
  "Deletes the specified transfer run.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/transferConfigs/runs/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://bigquerydatatransfer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-transferConfigs-runs-list
  "Returns information about running and completed transfer runs.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/transferConfigs/runs/list

parent <> 

optional:
states <string> When specified, only transfer runs with requested states are returned.
pageSize <integer> Page size. The default page size is the maximum value of 1000 results.
runAttempt <string> Indicates how run attempts are to be pulled."
  ([parent] (projects-locations-transferConfigs-runs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://bigquerydatatransfer.googleapis.com/v1/{+parent}/runs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-transferConfigs-runs-transferLogs-list
  "Returns log messages for the transfer run.
https://cloud.google.com/bigquery/docs/v1/reference/rest/v1/projects/locations/transferConfigs/runs/transferLogs/list

parent <> 

optional:
pageSize <integer> Page size. The default page size is the maximum value of 1000 results.
messageTypes <string> Message types to return. If not populated - INFO, WARNING and ERROR messages are returned."
  ([parent]
    (projects-locations-transferConfigs-runs-transferLogs-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://bigquerydatatransfer.googleapis.com/v1/{+parent}/transferLogs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))
