(ns happyapi.google.testing-v1
  "Cloud Testing API
Allows developers to run automated tests for their mobile applications on Google infrastructure.
See: https://firebase.google.com/docs/test-lab/"
  (:require [happyapi.providers.google :as client]))

(defn projects-testMatrices-create
  "Creates and runs a matrix of tests according to the given specifications. Unsupported environments will be returned in the state UNSUPPORTED. A test matrix is limited to use at most 2000 devices in parallel. The returned matrix will not yet contain the executions that will be created for this matrix. Execution creation happens later on and will require a call to GetTestMatrix. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed or if the matrix tries to use too many simultaneous devices.
https://firebase.google.com/docs/test-lab/v1/reference/rest/v1/projects/testMatrices/create

projectId <> 
TestMatrix:
TestMatrix

optional:
requestId <string> A string id used to detect duplicated requests. Ids are automatically scoped to a project, so users should ensure the ID is unique per-project. A UUID is recommended. Optional, but strongly recommended."
  ([projectId TestMatrix]
    (projects-testMatrices-create projectId TestMatrix nil))
  ([projectId TestMatrix optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://testing.googleapis.com/v1/projects/{projectId}/testMatrices",
       :uri-template-args {"projectId" projectId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TestMatrix})))

(defn projects-testMatrices-get
  "Checks the status of a test matrix and the executions once they are created. The test matrix will contain the list of test executions to run if and only if the resultStorage.toolResultsExecution fields have been populated. Note: Flaky test executions may be added to the matrix at a later stage. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Test Matrix does not exist
https://firebase.google.com/docs/test-lab/v1/reference/rest/v1/projects/testMatrices/get

projectId <> 
testMatrixId <> "
  [projectId testMatrixId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://testing.googleapis.com/v1/projects/{projectId}/testMatrices/{testMatrixId}",
     :uri-template-args
     {"projectId" projectId, "testMatrixId" testMatrixId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-testMatrices-cancel
  "Cancels unfinished test executions in a test matrix. This call returns immediately and cancellation proceeds asynchronously. If the matrix is already final, this operation will have no effect. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Test Matrix does not exist
https://firebase.google.com/docs/test-lab/v1/reference/rest/v1/projects/testMatrices/cancel

projectId <> 
testMatrixId <> "
  [projectId testMatrixId]
  (client/api-request
    {:method :post,
     :uri-template
     "https://testing.googleapis.com/v1/projects/{projectId}/testMatrices/{testMatrixId}:cancel",
     :uri-template-args
     {"projectId" projectId, "testMatrixId" testMatrixId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-deviceSessions-create
  "POST /v1/projects/{project_id}/deviceSessions
https://firebase.google.com/docs/test-lab/v1/reference/rest/v1/projects/deviceSessions/create

parent <> 
DeviceSession:
DeviceSession"
  [parent DeviceSession]
  (client/api-request
    {:method :post,
     :uri-template
     "https://testing.googleapis.com/v1/{+parent}/deviceSessions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body DeviceSession}))

(defn projects-deviceSessions-list
  "GET /v1/projects/{project_id}/deviceSessions Lists device Sessions owned by the project user.
https://firebase.google.com/docs/test-lab/v1/reference/rest/v1/projects/deviceSessions/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of DeviceSessions to return.
filter <string> Optional. If specified, responses will be filtered by the given filter. Allowed fields are: session_state."
  ([parent] (projects-deviceSessions-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://testing.googleapis.com/v1/{+parent}/deviceSessions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-deviceSessions-get
  "GET /v1/projects/{project_id}/deviceSessions/{device_session_id} Return a DeviceSession, which documents the allocation status and whether the device is allocated. Clients making requests from this API must poll GetDeviceSession.
https://firebase.google.com/docs/test-lab/v1/reference/rest/v1/projects/deviceSessions/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://testing.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-deviceSessions-cancel
  "POST /v1/projects/{project_id}/deviceSessions/{device_session_id}:cancel Changes the DeviceSession to state FINISHED and terminates all connections. Canceled sessions are not deleted and can be retrieved or listed by the user until they expire based on the 28 day deletion policy.
https://firebase.google.com/docs/test-lab/v1/reference/rest/v1/projects/deviceSessions/cancel

name <> 
CancelDeviceSessionRequest:
CancelDeviceSessionRequest"
  [name CancelDeviceSessionRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://testing.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelDeviceSessionRequest}))

(defn projects-deviceSessions-patch
  "PATCH /v1/projects/{projectId}/deviceSessions/deviceSessionId}:updateDeviceSession Updates the current device session to the fields described by the update_mask.
https://firebase.google.com/docs/test-lab/v1/reference/rest/v1/projects/deviceSessions/patch

name <> 
DeviceSession:
DeviceSession

optional:
updateMask <string> Required. The list of fields to update."
  ([name DeviceSession]
    (projects-deviceSessions-patch name DeviceSession nil))
  ([name DeviceSession optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://testing.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body DeviceSession})))

(defn applicationDetailService-getApkDetails
  "Gets the details of an Android application APK.
https://firebase.google.com/docs/test-lab/v1/reference/rest/v1/applicationDetailService/getApkDetails

FileReference:
FileReference

optional:
bundleLocation.gcsPath <string> A path to a file in Google Cloud Storage. Example: gs://build-app-1414623860166/app%40debug-unaligned.apk These paths are expected to be url encoded (percent encoding)"
  ([FileReference]
    (applicationDetailService-getApkDetails FileReference nil))
  ([FileReference optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://testing.googleapis.com/v1/applicationDetailService/getApkDetails",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body FileReference})))

(defn testEnvironmentCatalog-get
  "Gets the catalog of supported test environments. May return any of the following canonical error codes: - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the environment type does not exist - INTERNAL - if an internal error occurred
https://firebase.google.com/docs/test-lab/v1/reference/rest/v1/testEnvironmentCatalog/get

environmentType <> 

optional:
projectId <string> For authorization, the cloud project requesting the TestEnvironmentCatalog."
  ([environmentType] (testEnvironmentCatalog-get environmentType nil))
  ([environmentType optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://testing.googleapis.com/v1/testEnvironmentCatalog/{environmentType}",
       :uri-template-args {"environmentType" environmentType},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))
