(ns happyapi.google.toolresults-v1beta3
  "Cloud Tool Results API
API to publish and access results from developer tools.
See: https://firebase.google.com/docs/test-lab/"
  (:require [happyapi.providers.google :as client]))

(defn projects-getSettings
  "Gets the Tool Results settings for a project. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read from project
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/getSettings

projectId <> "
  [projectId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/settings",
     :uri-template-args {"projectId" projectId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-initializeSettings
  "Creates resources for settings which have not yet been set. Currently, this creates a single resource: a Google Cloud Storage bucket, to be used as the default bucket for this project. The bucket is created in an FTL-own storage project. Except for in rare cases, calling this method in parallel from multiple clients will only create a single bucket. In order to avoid unnecessary storage charges, the bucket is configured to automatically delete objects older than 90 days. The bucket is created with the following permissions: - Owner access for owners of central storage project (FTL-owned) - Writer access for owners/editors of customer project - Reader access for viewers of customer project The default ACL on objects created in the bucket is: - Owner access for owners of central storage project - Reader access for owners/editors/viewers of customer project See Google Cloud Storage documentation for more details. If there is already a default bucket set and the project can access the bucket, this call does nothing. However, if the project doesn't have the permission to access the bucket or the bucket is deleted, a new bucket will be created. May return any canonical error codes, including the following: - PERMISSION_DENIED - if the user is not authorized to write to project - Any error code raised by Google Cloud Storage
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/initializeSettings

projectId <> "
  [projectId]
  (client/api-request
    {:method :post,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}:initializeSettings",
     :uri-template-args {"projectId" projectId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-histories-create
  "Creates a History. The returned History will have the id set. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing project does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/create

projectId <> 
History:
History

optional:
requestId <string> A unique request ID for server to detect duplicated requests. For example, a UUID. Optional, but strongly recommended."
  ([projectId History]
    (projects-histories-create projectId History nil))
  ([projectId History optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories",
       :uri-template-args {"projectId" projectId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body History})))

(defn projects-histories-get
  "Gets a History. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the History does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/get

projectId <> 
historyId <> "
  [projectId historyId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}",
     :uri-template-args {"projectId" projectId, "historyId" historyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-histories-list
  "Lists Histories for a given Project. The histories are sorted by modification time in descending order. The history_id key will be used to order the history with the same modification time. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the History does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/list

projectId <> 

optional:
pageSize <integer> The maximum number of Histories to fetch. Default value: 20. The server will use this default if the field is not set or has a value of 0. Any value greater than 100 will be treated as 100. Optional.
filterByName <string> If set, only return histories with the given name. Optional."
  ([projectId] (projects-histories-list projectId nil))
  ([projectId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories",
       :uri-template-args {"projectId" projectId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-histories-executions-create
  "Creates an Execution. The returned Execution will have the id set. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing History does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/create

projectId <> 
historyId <> 
Execution:
Execution

optional:
requestId <string> A unique request ID for server to detect duplicated requests. For example, a UUID. Optional, but strongly recommended."
  ([projectId historyId Execution]
    (projects-histories-executions-create
      projectId
      historyId
      Execution
      nil))
  ([projectId historyId Execution optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions",
       :uri-template-args
       {"projectId" projectId, "historyId" historyId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Execution})))

(defn projects-histories-executions-list
  "Lists Executions for a given History. The executions are sorted by creation_time in descending order. The execution_id key will be used to order the executions with the same creation_time. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing History does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/list

projectId <> 
historyId <> 

optional:
pageSize <integer> The maximum number of Executions to fetch. Default value: 25. The server will use this default if the field is not set or has a value of 0. Optional."
  ([projectId historyId]
    (projects-histories-executions-list projectId historyId nil))
  ([projectId historyId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions",
       :uri-template-args
       {"projectId" projectId, "historyId" historyId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-histories-executions-get
  "Gets an Execution. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Execution does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/get

projectId <> 
historyId <> 
executionId <> "
  [projectId historyId executionId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}",
     :uri-template-args
     {"projectId" projectId,
      "historyId" historyId,
      "executionId" executionId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-histories-executions-patch
  "Updates an existing Execution with the supplied partial entity. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the requested state transition is illegal - NOT_FOUND - if the containing History does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/patch

projectId <> 
historyId <> 
executionId <> 
Execution:
Execution

optional:
requestId <string> A unique request ID for server to detect duplicated requests. For example, a UUID. Optional, but strongly recommended."
  ([projectId historyId executionId Execution]
    (projects-histories-executions-patch
      projectId
      historyId
      executionId
      Execution
      nil))
  ([projectId historyId executionId Execution optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}",
       :uri-template-args
       {"projectId" projectId,
        "historyId" historyId,
        "executionId" executionId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Execution})))

(defn projects-histories-executions-steps-accessibilityClusters
  "Lists accessibility clusters for a given Step May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if an argument in the request happens to be invalid; e.g. if the locale format is incorrect - NOT_FOUND - if the containing Step does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/accessibilityClusters

name <> 

optional:
locale <string> The accepted format is the canonical Unicode format with hyphen as a delimiter. Language must be lowercase, Language Script - Capitalized, Region - UPPERCASE. See http://www.unicode.org/reports/tr35/#Unicode_locale_identifier for details. Required."
  ([name]
    (projects-histories-executions-steps-accessibilityClusters
      name
      nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://toolresults.googleapis.com/toolresults/v1beta3/{+name}:accessibilityClusters",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-histories-executions-steps-create
  "Creates a Step. The returned Step will have the id set. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the step is too large (more than 10Mib) - NOT_FOUND - if the containing Execution does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/create

projectId <> 
historyId <> 
executionId <> 
Step:
Step

optional:
requestId <string> A unique request ID for server to detect duplicated requests. For example, a UUID. Optional, but strongly recommended."
  ([projectId historyId executionId Step]
    (projects-histories-executions-steps-create
      projectId
      historyId
      executionId
      Step
      nil))
  ([projectId historyId executionId Step optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps",
       :uri-template-args
       {"projectId" projectId,
        "historyId" historyId,
        "executionId" executionId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Step})))

(defn projects-histories-executions-steps-get
  "Gets a Step. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Step does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/get

projectId <> 
historyId <> 
executionId <> 
stepId <> "
  [projectId historyId executionId stepId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps/{stepId}",
     :uri-template-args
     {"projectId" projectId,
      "historyId" historyId,
      "executionId" executionId,
      "stepId" stepId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-histories-executions-steps-list
  "Lists Steps for a given Execution. The steps are sorted by creation_time in descending order. The step_id key will be used to order the steps with the same creation_time. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if an argument in the request happens to be invalid; e.g. if an attempt is made to list the children of a nonexistent Step - NOT_FOUND - if the containing Execution does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/list

projectId <> 
historyId <> 
executionId <> 

optional:
pageSize <integer> The maximum number of Steps to fetch. Default value: 25. The server will use this default if the field is not set or has a value of 0. Optional."
  ([projectId historyId executionId]
    (projects-histories-executions-steps-list
      projectId
      historyId
      executionId
      nil))
  ([projectId historyId executionId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps",
       :uri-template-args
       {"projectId" projectId,
        "historyId" historyId,
        "executionId" executionId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-histories-executions-steps-patch
  "Updates an existing Step with the supplied partial entity. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the requested state transition is illegal (e.g try to upload a duplicate xml file), if the updated step is too large (more than 10Mib) - NOT_FOUND - if the containing Execution does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/patch

projectId <> 
historyId <> 
executionId <> 
stepId <> 
Step:
Step

optional:
requestId <string> A unique request ID for server to detect duplicated requests. For example, a UUID. Optional, but strongly recommended."
  ([projectId historyId executionId stepId Step]
    (projects-histories-executions-steps-patch
      projectId
      historyId
      executionId
      stepId
      Step
      nil))
  ([projectId historyId executionId stepId Step optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps/{stepId}",
       :uri-template-args
       {"projectId" projectId,
        "historyId" historyId,
        "executionId" executionId,
        "stepId" stepId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Step})))

(defn projects-histories-executions-steps-publishXunitXmlFiles
  "Publish xml files to an existing Step. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the requested state transition is illegal, e.g. try to upload a duplicate xml file or a file too large. - NOT_FOUND - if the containing Execution does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/publishXunitXmlFiles

projectId <> 
historyId <> 
executionId <> 
stepId <> 
PublishXunitXmlFilesRequest:
PublishXunitXmlFilesRequest"
  [projectId historyId executionId stepId PublishXunitXmlFilesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps/{stepId}:publishXunitXmlFiles",
     :uri-template-args
     {"projectId" projectId,
      "historyId" historyId,
      "executionId" executionId,
      "stepId" stepId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body PublishXunitXmlFilesRequest}))

(defn projects-histories-executions-steps-getPerfMetricsSummary
  "Retrieves a PerfMetricsSummary. May return any of the following error code(s): - NOT_FOUND - The specified PerfMetricsSummary does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/getPerfMetricsSummary

projectId <> 
historyId <> 
executionId <> 
stepId <> "
  [projectId historyId executionId stepId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps/{stepId}/perfMetricsSummary",
     :uri-template-args
     {"projectId" projectId,
      "historyId" historyId,
      "executionId" executionId,
      "stepId" stepId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-histories-executions-steps-testCases-get
  "Gets details of a Test Case for a Step. Experimental test cases API. Still in active development. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing Test Case does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/testCases/get

projectId <> 
historyId <> 
executionId <> 
stepId <> 
testCaseId <> "
  [projectId historyId executionId stepId testCaseId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps/{stepId}/testCases/{testCaseId}",
     :uri-template-args
     {"projectId" projectId,
      "historyId" historyId,
      "executionId" executionId,
      "stepId" stepId,
      "testCaseId" testCaseId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-histories-executions-steps-testCases-list
  "Lists Test Cases attached to a Step. Experimental test cases API. Still in active development. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing Step does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/testCases/list

projectId <> 
historyId <> 
executionId <> 
stepId <> 

optional:
pageSize <integer> The maximum number of TestCases to fetch. Default value: 100. The server will use this default if the field is not set or has a value of 0. Optional."
  ([projectId historyId executionId stepId]
    (projects-histories-executions-steps-testCases-list
      projectId
      historyId
      executionId
      stepId
      nil))
  ([projectId historyId executionId stepId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps/{stepId}/testCases",
       :uri-template-args
       {"projectId" projectId,
        "historyId" historyId,
        "executionId" executionId,
        "stepId" stepId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-histories-executions-steps-thumbnails-list
  "Lists thumbnails of images attached to a step. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read from the project, or from any of the images - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the step does not exist, or if any of the images do not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/thumbnails/list

projectId <> 
historyId <> 
executionId <> 
stepId <> 

optional:
pageSize <integer> The maximum number of thumbnails to fetch. Default value: 50. The server will use this default if the field is not set or has a value of 0. Optional."
  ([projectId historyId executionId stepId]
    (projects-histories-executions-steps-thumbnails-list
      projectId
      historyId
      executionId
      stepId
      nil))
  ([projectId historyId executionId stepId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps/{stepId}/thumbnails",
       :uri-template-args
       {"projectId" projectId,
        "historyId" historyId,
        "executionId" executionId,
        "stepId" stepId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-histories-executions-steps-perfMetricsSummary-create
  "Creates a PerfMetricsSummary resource. Returns the existing one if it has already been created. May return any of the following error code(s): - NOT_FOUND - The containing Step does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/perfMetricsSummary/create

projectId <> 
historyId <> 
executionId <> 
stepId <> 
PerfMetricsSummary:
PerfMetricsSummary"
  [projectId historyId executionId stepId PerfMetricsSummary]
  (client/api-request
    {:method :post,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps/{stepId}/perfMetricsSummary",
     :uri-template-args
     {"projectId" projectId,
      "historyId" historyId,
      "executionId" executionId,
      "stepId" stepId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body PerfMetricsSummary}))

(defn projects-histories-executions-steps-perfSampleSeries-create
  "Creates a PerfSampleSeries. May return any of the following error code(s): - ALREADY_EXISTS - PerfMetricSummary already exists for the given Step - NOT_FOUND - The containing Step does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/perfSampleSeries/create

projectId <> 
historyId <> 
executionId <> 
stepId <> 
PerfSampleSeries:
PerfSampleSeries"
  [projectId historyId executionId stepId PerfSampleSeries]
  (client/api-request
    {:method :post,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps/{stepId}/perfSampleSeries",
     :uri-template-args
     {"projectId" projectId,
      "historyId" historyId,
      "executionId" executionId,
      "stepId" stepId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body PerfSampleSeries}))

(defn projects-histories-executions-steps-perfSampleSeries-get
  "Gets a PerfSampleSeries. May return any of the following error code(s): - NOT_FOUND - The specified PerfSampleSeries does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/perfSampleSeries/get

projectId <> 
historyId <> 
executionId <> 
stepId <> 
sampleSeriesId <> "
  [projectId historyId executionId stepId sampleSeriesId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps/{stepId}/perfSampleSeries/{sampleSeriesId}",
     :uri-template-args
     {"projectId" projectId,
      "historyId" historyId,
      "executionId" executionId,
      "stepId" stepId,
      "sampleSeriesId" sampleSeriesId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-histories-executions-steps-perfSampleSeries-list
  "Lists PerfSampleSeries for a given Step. The request provides an optional filter which specifies one or more PerfMetricsType to include in the result; if none returns all. The resulting PerfSampleSeries are sorted by ids. May return any of the following canonical error codes: - NOT_FOUND - The containing Step does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/perfSampleSeries/list

projectId <> 
historyId <> 
executionId <> 
stepId <> 

optional:
filter <string> Specify one or more PerfMetricType values such as CPU to filter the result"
  ([projectId historyId executionId stepId]
    (projects-histories-executions-steps-perfSampleSeries-list
      projectId
      historyId
      executionId
      stepId
      nil))
  ([projectId historyId executionId stepId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps/{stepId}/perfSampleSeries",
       :uri-template-args
       {"projectId" projectId,
        "historyId" historyId,
        "executionId" executionId,
        "stepId" stepId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-histories-executions-steps-perfSampleSeries-samples-batchCreate
  "Creates a batch of PerfSamples - a client can submit multiple batches of Perf Samples through repeated calls to this method in order to split up a large request payload - duplicates and existing timestamp entries will be ignored. - the batch operation may partially succeed - the set of elements successfully inserted is returned in the response (omits items which already existed in the database). May return any of the following canonical error codes: - NOT_FOUND - The containing PerfSampleSeries does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/perfSampleSeries/samples/batchCreate

projectId <> 
historyId <> 
executionId <> 
stepId <> 
sampleSeriesId <> 
BatchCreatePerfSamplesRequest:
BatchCreatePerfSamplesRequest"
  [projectId
   historyId
   executionId
   stepId
   sampleSeriesId
   BatchCreatePerfSamplesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps/{stepId}/perfSampleSeries/{sampleSeriesId}/samples:batchCreate",
     :uri-template-args
     {"projectId" projectId,
      "historyId" historyId,
      "executionId" executionId,
      "stepId" stepId,
      "sampleSeriesId" sampleSeriesId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BatchCreatePerfSamplesRequest}))

(defn projects-histories-executions-steps-perfSampleSeries-samples-list
  "Lists the Performance Samples of a given Sample Series - The list results are sorted by timestamps ascending - The default page size is 500 samples; and maximum size allowed 5000 - The response token indicates the last returned PerfSample timestamp - When the results size exceeds the page size, submit a subsequent request including the page token to return the rest of the samples up to the page limit May return any of the following canonical error codes: - OUT_OF_RANGE - The specified request page_token is out of valid range - NOT_FOUND - The containing PerfSampleSeries does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/steps/perfSampleSeries/samples/list

projectId <> 
historyId <> 
executionId <> 
stepId <> 
sampleSeriesId <> 

optional:
pageSize <integer> The default page size is 500 samples, and the maximum size is 5000. If the page_size is greater than 5000, the effective page size will be 5000"
  ([projectId historyId executionId stepId sampleSeriesId]
    (projects-histories-executions-steps-perfSampleSeries-samples-list
      projectId
      historyId
      executionId
      stepId
      sampleSeriesId
      nil))
  ([projectId historyId executionId stepId sampleSeriesId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/steps/{stepId}/perfSampleSeries/{sampleSeriesId}/samples",
       :uri-template-args
       {"projectId" projectId,
        "historyId" historyId,
        "executionId" executionId,
        "stepId" stepId,
        "sampleSeriesId" sampleSeriesId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-histories-executions-clusters-get
  "Retrieves a single screenshot cluster by its ID
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/clusters/get

projectId <> 
historyId <> 
executionId <> 
clusterId <> "
  [projectId historyId executionId clusterId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/clusters/{clusterId}",
     :uri-template-args
     {"projectId" projectId,
      "historyId" historyId,
      "executionId" executionId,
      "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-histories-executions-clusters-list
  "Lists Screenshot Clusters Returns the list of screenshot clusters corresponding to an execution. Screenshot clusters are created after the execution is finished. Clusters are created from a set of screenshots. Between any two screenshots, a matching score is calculated based off their metadata that determines how similar they are. Screenshots are placed in the cluster that has screens which have the highest matching scores.
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/clusters/list

projectId <> 
historyId <> 
executionId <> "
  [projectId historyId executionId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/clusters",
     :uri-template-args
     {"projectId" projectId,
      "historyId" historyId,
      "executionId" executionId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-histories-executions-environments-get
  "Gets an Environment. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Environment does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/environments/get

projectId <> 
historyId <> 
executionId <> 
environmentId <> "
  [projectId historyId executionId environmentId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/environments/{environmentId}",
     :uri-template-args
     {"projectId" projectId,
      "historyId" historyId,
      "executionId" executionId,
      "environmentId" environmentId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-histories-executions-environments-list
  "Lists Environments for a given Execution. The Environments are sorted by display name. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing Execution does not exist
https://firebase.google.com/docs/test-lab/v1beta3/reference/rest/v1beta3/projects/histories/executions/environments/list

projectId <> 
historyId <> 
executionId <> 

optional:
pageSize <integer> The maximum number of Environments to fetch. Default value: 25. The server will use this default if the field is not set or has a value of 0."
  ([projectId historyId executionId]
    (projects-histories-executions-environments-list
      projectId
      historyId
      executionId
      nil))
  ([projectId historyId executionId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://toolresults.googleapis.com/toolresults/v1beta3/projects/{projectId}/histories/{historyId}/executions/{executionId}/environments",
       :uri-template-args
       {"projectId" projectId,
        "historyId" historyId,
        "executionId" executionId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
