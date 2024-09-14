(ns happyapi.google.policysimulator-v1
  "Policy Simulator API
 Policy Simulator is a collection of endpoints for creating, running, and viewing a Replay. A `Replay` is a type of simulation that lets you see how your members' access to resources might change if you changed your IAM policy. During a `Replay`, Policy Simulator re-evaluates, or replays, past access attempts under both the current policy and your proposed policy, and compares those results to determine how your members' access might change under the proposed policy.
See: https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies")

(defn projects-locations-orgPolicyViolationsPreviews-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/projects/locations/orgPolicyViolationsPreviews/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://policysimulator.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-replays-get
  "Gets the specified Replay. Each `Replay` is available for at least 7 days.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/projects/locations/replays/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://policysimulator.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-replays-create
  "Creates and starts a Replay using the given ReplayConfig.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/projects/locations/replays/create

parent <> 
GoogleCloudPolicysimulatorV1Replay:
GoogleCloudPolicysimulatorV1Replay"
  [parent GoogleCloudPolicysimulatorV1Replay]
  {:method :post,
   :uri-template
   "https://policysimulator.googleapis.com/v1/{+parent}/replays",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudPolicysimulatorV1Replay})

(defn projects-locations-replays-results-list
  "Lists the results of running a Replay.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/projects/locations/replays/results/list

parent <> 

optional:
pageSize <integer> The maximum number of ReplayResult objects to return. Defaults to 5000. The maximum value is 5000; values above 5000 are rounded down to 5000."
  ([parent] (projects-locations-replays-results-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://policysimulator.googleapis.com/v1/{+parent}/results",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-replays-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/projects/locations/replays/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://policysimulator.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-replays-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/projects/locations/replays/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-replays-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://policysimulator.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://policysimulator.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name] (operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://policysimulator.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-locations-replays-get
  "Gets the specified Replay. Each `Replay` is available for at least 7 days.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/folders/locations/replays/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://policysimulator.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn folders-locations-replays-create
  "Creates and starts a Replay using the given ReplayConfig.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/folders/locations/replays/create

parent <> 
GoogleCloudPolicysimulatorV1Replay:
GoogleCloudPolicysimulatorV1Replay"
  [parent GoogleCloudPolicysimulatorV1Replay]
  {:method :post,
   :uri-template
   "https://policysimulator.googleapis.com/v1/{+parent}/replays",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudPolicysimulatorV1Replay})

(defn folders-locations-replays-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/folders/locations/replays/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (folders-locations-replays-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://policysimulator.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-locations-replays-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/folders/locations/replays/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://policysimulator.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn folders-locations-replays-results-list
  "Lists the results of running a Replay.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/folders/locations/replays/results/list

parent <> 

optional:
pageSize <integer> The maximum number of ReplayResult objects to return. Defaults to 5000. The maximum value is 5000; values above 5000 are rounded down to 5000."
  ([parent] (folders-locations-replays-results-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://policysimulator.googleapis.com/v1/{+parent}/results",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-locations-orgPolicyViolationsPreviews-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/folders/locations/orgPolicyViolationsPreviews/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://policysimulator.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-locations-orgPolicyViolationsPreviews-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/organizations/locations/orgPolicyViolationsPreviews/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://policysimulator.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-locations-replays-create
  "Creates and starts a Replay using the given ReplayConfig.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/organizations/locations/replays/create

parent <> 
GoogleCloudPolicysimulatorV1Replay:
GoogleCloudPolicysimulatorV1Replay"
  [parent GoogleCloudPolicysimulatorV1Replay]
  {:method :post,
   :uri-template
   "https://policysimulator.googleapis.com/v1/{+parent}/replays",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudPolicysimulatorV1Replay})

(defn organizations-locations-replays-get
  "Gets the specified Replay. Each `Replay` is available for at least 7 days.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/organizations/locations/replays/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://policysimulator.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-locations-replays-results-list
  "Lists the results of running a Replay.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/organizations/locations/replays/results/list

parent <> 

optional:
pageSize <integer> The maximum number of ReplayResult objects to return. Defaults to 5000. The maximum value is 5000; values above 5000 are rounded down to 5000."
  ([parent] (organizations-locations-replays-results-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://policysimulator.googleapis.com/v1/{+parent}/results",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-replays-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/organizations/locations/replays/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://policysimulator.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-locations-replays-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/policy-intelligence/docs/simulate-iam-policies/v1/reference/rest/v1/organizations/locations/replays/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name] (organizations-locations-replays-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://policysimulator.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
