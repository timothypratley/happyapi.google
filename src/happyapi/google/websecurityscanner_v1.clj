(ns happyapi.google.websecurityscanner-v1
  "Web Security Scanner API
Scans your Compute and App Engine apps for common web vulnerabilities.
See: https://cloud.google.com/security-command-center/docs/concepts-web-security-scanner-overview/"
  (:require [happyapi.providers.google :as client]))

(defn projects-scanConfigs-patch
  "Updates a ScanConfig. This method support partial update of a ScanConfig.
https://cloud.google.com/security-command-center/docs/concepts-web-security-scanner-overview/v1/reference/rest/v1/projects/scanConfigs/patch

name <> 
ScanConfig:
ScanConfig

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask"
  ([name ScanConfig] (projects-scanConfigs-patch name ScanConfig nil))
  ([name ScanConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://websecurityscanner.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ScanConfig})))

(defn projects-scanConfigs-get
  "Gets a ScanConfig.
https://cloud.google.com/security-command-center/docs/concepts-web-security-scanner-overview/v1/reference/rest/v1/projects/scanConfigs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://websecurityscanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-scanConfigs-list
  "Lists ScanConfigs under a given project.
https://cloud.google.com/security-command-center/docs/concepts-web-security-scanner-overview/v1/reference/rest/v1/projects/scanConfigs/list

parent <> 

optional:
pageSize <integer> The maximum number of ScanConfigs to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value."
  ([parent] (projects-scanConfigs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://websecurityscanner.googleapis.com/v1/{+parent}/scanConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-scanConfigs-start
  "Start a ScanRun according to the given ScanConfig.
https://cloud.google.com/security-command-center/docs/concepts-web-security-scanner-overview/v1/reference/rest/v1/projects/scanConfigs/start

name <> 
StartScanRunRequest:
StartScanRunRequest"
  [name StartScanRunRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://websecurityscanner.googleapis.com/v1/{+name}:start",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body StartScanRunRequest}))

(defn projects-scanConfigs-delete
  "Deletes an existing ScanConfig and its child resources.
https://cloud.google.com/security-command-center/docs/concepts-web-security-scanner-overview/v1/reference/rest/v1/projects/scanConfigs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://websecurityscanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-scanConfigs-create
  "Creates a new ScanConfig.
https://cloud.google.com/security-command-center/docs/concepts-web-security-scanner-overview/v1/reference/rest/v1/projects/scanConfigs/create

parent <> 
ScanConfig:
ScanConfig"
  [parent ScanConfig]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://websecurityscanner.googleapis.com/v1/{+parent}/scanConfigs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ScanConfig}))

(defn projects-scanConfigs-scanRuns-get
  "Gets a ScanRun.
https://cloud.google.com/security-command-center/docs/concepts-web-security-scanner-overview/v1/reference/rest/v1/projects/scanConfigs/scanRuns/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://websecurityscanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-scanConfigs-scanRuns-list
  "Lists ScanRuns under a given ScanConfig, in descending order of ScanRun stop time.
https://cloud.google.com/security-command-center/docs/concepts-web-security-scanner-overview/v1/reference/rest/v1/projects/scanConfigs/scanRuns/list

parent <> 

optional:
pageSize <integer> The maximum number of ScanRuns to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value."
  ([parent] (projects-scanConfigs-scanRuns-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://websecurityscanner.googleapis.com/v1/{+parent}/scanRuns",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-scanConfigs-scanRuns-stop
  "Stops a ScanRun. The stopped ScanRun is returned.
https://cloud.google.com/security-command-center/docs/concepts-web-security-scanner-overview/v1/reference/rest/v1/projects/scanConfigs/scanRuns/stop

name <> 
StopScanRunRequest:
StopScanRunRequest"
  [name StopScanRunRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://websecurityscanner.googleapis.com/v1/{+name}:stop",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body StopScanRunRequest}))

(defn projects-scanConfigs-scanRuns-findings-list
  "List Findings under a given ScanRun.
https://cloud.google.com/security-command-center/docs/concepts-web-security-scanner-overview/v1/reference/rest/v1/projects/scanConfigs/scanRuns/findings/list

parent <> 

optional:
pageSize <integer> The maximum number of Findings to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value.
filter <string> The filter expression. The expression must be in the format: . Supported field: 'finding_type'. Supported operator: '='."
  ([parent] (projects-scanConfigs-scanRuns-findings-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://websecurityscanner.googleapis.com/v1/{+parent}/findings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-scanConfigs-scanRuns-findings-get
  "Gets a Finding.
https://cloud.google.com/security-command-center/docs/concepts-web-security-scanner-overview/v1/reference/rest/v1/projects/scanConfigs/scanRuns/findings/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://websecurityscanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-scanConfigs-scanRuns-crawledUrls-list
  "List CrawledUrls under a given ScanRun.
https://cloud.google.com/security-command-center/docs/concepts-web-security-scanner-overview/v1/reference/rest/v1/projects/scanConfigs/scanRuns/crawledUrls/list

parent <> 

optional:
pageSize <integer> The maximum number of CrawledUrls to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value."
  ([parent]
    (projects-scanConfigs-scanRuns-crawledUrls-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://websecurityscanner.googleapis.com/v1/{+parent}/crawledUrls",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-scanConfigs-scanRuns-findingTypeStats-list
  "List all FindingTypeStats under a given ScanRun.
https://cloud.google.com/security-command-center/docs/concepts-web-security-scanner-overview/v1/reference/rest/v1/projects/scanConfigs/scanRuns/findingTypeStats/list

parent <> "
  [parent]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://websecurityscanner.googleapis.com/v1/{+parent}/findingTypeStats",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
