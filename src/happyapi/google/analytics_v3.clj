(ns happyapi.google.analytics-v3
  "Google Analytics API
Views and manages your Google Analytics data.
See: https://developers.google.com/analytics/"
  (:require [happyapi.providers.google :as client]))

(defn data-ga-get
  "Returns Analytics data for a view (profile).
https://developers.google.com/analytics/v3/reference/rest/v3/data/ga/get

ids <> 
start-date <> 
end-date <> 
metrics <> 

optional:
max-results <integer> The maximum number of entries to include in this feed.
output <string> The selected format for the response. Default format is JSON.
segment <string> An Analytics segment to be applied to data.
samplingLevel <string> The desired sampling level.
filters <string> A comma-separated list of dimension or metric filters to be applied to Analytics data.
sort <string> A comma-separated list of dimensions or metrics that determine the sort order for Analytics data.
dimensions <string> A comma-separated list of Analytics dimensions. E.g., 'ga:browser,ga:city'.
include-empty-rows <boolean> The response will include empty rows if this parameter is set to true, the default is true
start-index <integer> An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([ids start-date end-date metrics]
    (data-ga-get ids start-date end-date metrics nil))
  ([ids start-date end-date metrics optional]
    (client/api-request
      {:method :get,
       :uri-template "https://www.googleapis.com/analytics/v3/data/ga",
       :uri-template-args {},
       :query-params
       (merge
         {"end-date" end-date,
          "ids" ids,
          "start-date" start-date,
          "metrics" metrics}
         optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn data-mcf-get
  "Returns Analytics Multi-Channel Funnels data for a view (profile).
https://developers.google.com/analytics/v3/reference/rest/v3/data/mcf/get

ids <> 
start-date <> 
end-date <> 
metrics <> 

optional:
max-results <integer> The maximum number of entries to include in this feed.
samplingLevel <string> The desired sampling level.
filters <string> A comma-separated list of dimension or metric filters to be applied to the Analytics data.
sort <string> A comma-separated list of dimensions or metrics that determine the sort order for the Analytics data.
dimensions <string> A comma-separated list of Multi-Channel Funnels dimensions. E.g., 'mcf:source,mcf:medium'.
start-index <integer> An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([ids start-date end-date metrics]
    (data-mcf-get ids start-date end-date metrics nil))
  ([ids start-date end-date metrics optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/data/mcf",
       :uri-template-args {},
       :query-params
       (merge
         {"end-date" end-date,
          "ids" ids,
          "start-date" start-date,
          "metrics" metrics}
         optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn data-realtime-get
  "Returns real time data for a view (profile).
https://developers.google.com/analytics/v3/reference/rest/v3/data/realtime/get

ids <> 
metrics <> 

optional:
dimensions <string> A comma-separated list of real time dimensions. E.g., 'rt:medium,rt:city'.
filters <string> A comma-separated list of dimension or metric filters to be applied to real time data.
max-results <integer> The maximum number of entries to include in this feed.
sort <string> A comma-separated list of dimensions or metrics that determine the sort order for real time data."
  ([ids metrics] (data-realtime-get ids metrics nil))
  ([ids metrics optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/data/realtime",
       :uri-template-args {},
       :query-params (merge {"ids" ids, "metrics" metrics} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-accountUserLinks-delete
  "Removes a user from the given account.
https://developers.google.com/analytics/v3/reference/rest/v3/management/accountUserLinks/delete

accountId <> 
linkId <> "
  [accountId linkId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/entityUserLinks/{linkId}",
     :uri-template-args {"accountId" accountId, "linkId" linkId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.manage.users"]}))

(defn management-accountUserLinks-insert
  "Adds a new user to the given account.
https://developers.google.com/analytics/v3/reference/rest/v3/management/accountUserLinks/insert

accountId <> 
EntityUserLink:
EntityUserLink"
  [accountId EntityUserLink]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/entityUserLinks",
     :uri-template-args {"accountId" accountId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.manage.users"],
     :body EntityUserLink}))

(defn management-accountUserLinks-list
  "Lists account-user links for a given account.
https://developers.google.com/analytics/v3/reference/rest/v3/management/accountUserLinks/list

accountId <> 

optional:
max-results <integer> The maximum number of account-user links to include in this response.
start-index <integer> An index of the first account-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId] (management-accountUserLinks-list accountId nil))
  ([accountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/entityUserLinks",
       :uri-template-args {"accountId" accountId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.manage.users"
        "https://www.googleapis.com/auth/analytics.manage.users.readonly"]})))

(defn management-accountUserLinks-update
  "Updates permissions for an existing user on the given account.
https://developers.google.com/analytics/v3/reference/rest/v3/management/accountUserLinks/update

accountId <> 
linkId <> 
EntityUserLink:
EntityUserLink"
  [accountId linkId EntityUserLink]
  (client/api-request
    {:method :put,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/entityUserLinks/{linkId}",
     :uri-template-args {"accountId" accountId, "linkId" linkId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.manage.users"],
     :body EntityUserLink}))

(defn management-unsampledReports-delete
  "Deletes an unsampled report.
https://developers.google.com/analytics/v3/reference/rest/v3/management/unsampledReports/delete

accountId <> 
webPropertyId <> 
profileId <> 
unsampledReportId <> "
  [accountId webPropertyId profileId unsampledReportId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/unsampledReports/{unsampledReportId}",
     :uri-template-args
     {"accountId" accountId,
      "profileId" profileId,
      "unsampledReportId" unsampledReportId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"]}))

(defn management-unsampledReports-get
  "Returns a single unsampled report.
https://developers.google.com/analytics/v3/reference/rest/v3/management/unsampledReports/get

accountId <> 
webPropertyId <> 
profileId <> 
unsampledReportId <> "
  [accountId webPropertyId profileId unsampledReportId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/unsampledReports/{unsampledReportId}",
     :uri-template-args
     {"accountId" accountId,
      "profileId" profileId,
      "unsampledReportId" unsampledReportId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn management-unsampledReports-insert
  "Create a new unsampled report.
https://developers.google.com/analytics/v3/reference/rest/v3/management/unsampledReports/insert

accountId <> 
webPropertyId <> 
profileId <> 
UnsampledReport:
UnsampledReport"
  [accountId webPropertyId profileId UnsampledReport]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/unsampledReports",
     :uri-template-args
     {"accountId" accountId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.edit"],
     :body UnsampledReport}))

(defn management-unsampledReports-list
  "Lists unsampled reports to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/unsampledReports/list

accountId <> 
webPropertyId <> 
profileId <> 

optional:
max-results <integer> The maximum number of unsampled reports to include in this response.
start-index <integer> An index of the first unsampled report to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId webPropertyId profileId]
    (management-unsampledReports-list
      accountId
      webPropertyId
      profileId
      nil))
  ([accountId webPropertyId profileId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/unsampledReports",
       :uri-template-args
       {"accountId" accountId,
        "profileId" profileId,
        "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-goals-get
  "Gets a goal to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/goals/get

accountId <> 
webPropertyId <> 
profileId <> 
goalId <> "
  [accountId webPropertyId profileId goalId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/goals/{goalId}",
     :uri-template-args
     {"accountId" accountId,
      "goalId" goalId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn management-goals-insert
  "Create a new goal.
https://developers.google.com/analytics/v3/reference/rest/v3/management/goals/insert

accountId <> 
webPropertyId <> 
profileId <> 
Goal:
Goal"
  [accountId webPropertyId profileId Goal]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/goals",
     :uri-template-args
     {"accountId" accountId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body Goal}))

(defn management-goals-list
  "Lists goals to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/goals/list

accountId <> 
webPropertyId <> 
profileId <> 

optional:
max-results <integer> The maximum number of goals to include in this response.
start-index <integer> An index of the first goal to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId webPropertyId profileId]
    (management-goals-list accountId webPropertyId profileId nil))
  ([accountId webPropertyId profileId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/goals",
       :uri-template-args
       {"accountId" accountId,
        "profileId" profileId,
        "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-goals-patch
  "Updates an existing goal. This method supports patch semantics.
https://developers.google.com/analytics/v3/reference/rest/v3/management/goals/patch

accountId <> 
webPropertyId <> 
profileId <> 
goalId <> 
Goal:
Goal"
  [accountId webPropertyId profileId goalId Goal]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/goals/{goalId}",
     :uri-template-args
     {"accountId" accountId,
      "goalId" goalId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body Goal}))

(defn management-goals-update
  "Updates an existing goal.
https://developers.google.com/analytics/v3/reference/rest/v3/management/goals/update

accountId <> 
webPropertyId <> 
profileId <> 
goalId <> 
Goal:
Goal"
  [accountId webPropertyId profileId goalId Goal]
  (client/api-request
    {:method :put,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/goals/{goalId}",
     :uri-template-args
     {"accountId" accountId,
      "goalId" goalId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body Goal}))

(defn management-profileFilterLinks-delete
  "Delete a profile filter link.
https://developers.google.com/analytics/v3/reference/rest/v3/management/profileFilterLinks/delete

accountId <> 
webPropertyId <> 
profileId <> 
linkId <> "
  [accountId webPropertyId profileId linkId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/profileFilterLinks/{linkId}",
     :uri-template-args
     {"accountId" accountId,
      "linkId" linkId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"]}))

(defn management-profileFilterLinks-get
  "Returns a single profile filter link.
https://developers.google.com/analytics/v3/reference/rest/v3/management/profileFilterLinks/get

accountId <> 
webPropertyId <> 
profileId <> 
linkId <> "
  [accountId webPropertyId profileId linkId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/profileFilterLinks/{linkId}",
     :uri-template-args
     {"accountId" accountId,
      "linkId" linkId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn management-profileFilterLinks-insert
  "Create a new profile filter link.
https://developers.google.com/analytics/v3/reference/rest/v3/management/profileFilterLinks/insert

accountId <> 
webPropertyId <> 
profileId <> 
ProfileFilterLink:
ProfileFilterLink"
  [accountId webPropertyId profileId ProfileFilterLink]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/profileFilterLinks",
     :uri-template-args
     {"accountId" accountId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body ProfileFilterLink}))

(defn management-profileFilterLinks-list
  "Lists all profile filter links for a profile.
https://developers.google.com/analytics/v3/reference/rest/v3/management/profileFilterLinks/list

accountId <> 
webPropertyId <> 
profileId <> 

optional:
max-results <integer> The maximum number of profile filter links to include in this response.
start-index <integer> An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId webPropertyId profileId]
    (management-profileFilterLinks-list
      accountId
      webPropertyId
      profileId
      nil))
  ([accountId webPropertyId profileId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/profileFilterLinks",
       :uri-template-args
       {"accountId" accountId,
        "profileId" profileId,
        "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-profileFilterLinks-patch
  "Update an existing profile filter link. This method supports patch semantics.
https://developers.google.com/analytics/v3/reference/rest/v3/management/profileFilterLinks/patch

accountId <> 
webPropertyId <> 
profileId <> 
linkId <> 
ProfileFilterLink:
ProfileFilterLink"
  [accountId webPropertyId profileId linkId ProfileFilterLink]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/profileFilterLinks/{linkId}",
     :uri-template-args
     {"accountId" accountId,
      "linkId" linkId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body ProfileFilterLink}))

(defn management-profileFilterLinks-update
  "Update an existing profile filter link.
https://developers.google.com/analytics/v3/reference/rest/v3/management/profileFilterLinks/update

accountId <> 
webPropertyId <> 
profileId <> 
linkId <> 
ProfileFilterLink:
ProfileFilterLink"
  [accountId webPropertyId profileId linkId ProfileFilterLink]
  (client/api-request
    {:method :put,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/profileFilterLinks/{linkId}",
     :uri-template-args
     {"accountId" accountId,
      "linkId" linkId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body ProfileFilterLink}))

(defn management-experiments-delete
  "Delete an experiment.
https://developers.google.com/analytics/v3/reference/rest/v3/management/experiments/delete

accountId <> 
webPropertyId <> 
profileId <> 
experimentId <> "
  [accountId webPropertyId profileId experimentId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/experiments/{experimentId}",
     :uri-template-args
     {"accountId" accountId,
      "experimentId" experimentId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.edit"]}))

(defn management-experiments-get
  "Returns an experiment to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/experiments/get

accountId <> 
webPropertyId <> 
profileId <> 
experimentId <> "
  [accountId webPropertyId profileId experimentId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/experiments/{experimentId}",
     :uri-template-args
     {"accountId" accountId,
      "experimentId" experimentId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn management-experiments-insert
  "Create a new experiment.
https://developers.google.com/analytics/v3/reference/rest/v3/management/experiments/insert

accountId <> 
webPropertyId <> 
profileId <> 
Experiment:
Experiment"
  [accountId webPropertyId profileId Experiment]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/experiments",
     :uri-template-args
     {"accountId" accountId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.edit"],
     :body Experiment}))

(defn management-experiments-list
  "Lists experiments to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/experiments/list

accountId <> 
webPropertyId <> 
profileId <> 

optional:
max-results <integer> The maximum number of experiments to include in this response.
start-index <integer> An index of the first experiment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId webPropertyId profileId]
    (management-experiments-list
      accountId
      webPropertyId
      profileId
      nil))
  ([accountId webPropertyId profileId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/experiments",
       :uri-template-args
       {"accountId" accountId,
        "profileId" profileId,
        "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-experiments-patch
  "Update an existing experiment. This method supports patch semantics.
https://developers.google.com/analytics/v3/reference/rest/v3/management/experiments/patch

accountId <> 
webPropertyId <> 
profileId <> 
experimentId <> 
Experiment:
Experiment"
  [accountId webPropertyId profileId experimentId Experiment]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/experiments/{experimentId}",
     :uri-template-args
     {"accountId" accountId,
      "experimentId" experimentId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.edit"],
     :body Experiment}))

(defn management-experiments-update
  "Update an existing experiment.
https://developers.google.com/analytics/v3/reference/rest/v3/management/experiments/update

accountId <> 
webPropertyId <> 
profileId <> 
experimentId <> 
Experiment:
Experiment"
  [accountId webPropertyId profileId experimentId Experiment]
  (client/api-request
    {:method :put,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/experiments/{experimentId}",
     :uri-template-args
     {"accountId" accountId,
      "experimentId" experimentId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.edit"],
     :body Experiment}))

(defn management-webproperties-get
  "Gets a web property to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webproperties/get

accountId <> 
webPropertyId <> "
  [accountId webPropertyId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}",
     :uri-template-args
     {"accountId" accountId, "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn management-webproperties-insert
  "Create a new property if the account has fewer than 20 properties. Web properties are visible in the Google Analytics interface only if they have at least one profile.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webproperties/insert

accountId <> 
Webproperty:
Webproperty"
  [accountId Webproperty]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties",
     :uri-template-args {"accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body Webproperty}))

(defn management-webproperties-list
  "Lists web properties to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webproperties/list

accountId <> 

optional:
max-results <integer> The maximum number of web properties to include in this response.
start-index <integer> An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId] (management-webproperties-list accountId nil))
  ([accountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties",
       :uri-template-args {"accountId" accountId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-webproperties-patch
  "Updates an existing web property. This method supports patch semantics.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webproperties/patch

accountId <> 
webPropertyId <> 
Webproperty:
Webproperty"
  [accountId webPropertyId Webproperty]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}",
     :uri-template-args
     {"accountId" accountId, "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body Webproperty}))

(defn management-webproperties-update
  "Updates an existing web property.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webproperties/update

accountId <> 
webPropertyId <> 
Webproperty:
Webproperty"
  [accountId webPropertyId Webproperty]
  (client/api-request
    {:method :put,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}",
     :uri-template-args
     {"accountId" accountId, "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body Webproperty}))

(defn management-accountSummaries-list
  "Lists account summaries (lightweight tree comprised of accounts/properties/profiles) to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/accountSummaries/list

optional:
max-results <integer> The maximum number of account summaries to include in this response, where the largest acceptable value is 1000.
start-index <integer> An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([] (management-accountSummaries-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accountSummaries",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-profileUserLinks-delete
  "Removes a user from the given view (profile).
https://developers.google.com/analytics/v3/reference/rest/v3/management/profileUserLinks/delete

accountId <> 
webPropertyId <> 
profileId <> 
linkId <> "
  [accountId webPropertyId profileId linkId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/entityUserLinks/{linkId}",
     :uri-template-args
     {"accountId" accountId,
      "linkId" linkId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.manage.users"]}))

(defn management-profileUserLinks-insert
  "Adds a new user to the given view (profile).
https://developers.google.com/analytics/v3/reference/rest/v3/management/profileUserLinks/insert

accountId <> 
webPropertyId <> 
profileId <> 
EntityUserLink:
EntityUserLink"
  [accountId webPropertyId profileId EntityUserLink]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/entityUserLinks",
     :uri-template-args
     {"accountId" accountId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.manage.users"],
     :body EntityUserLink}))

(defn management-profileUserLinks-list
  "Lists profile-user links for a given view (profile).
https://developers.google.com/analytics/v3/reference/rest/v3/management/profileUserLinks/list

accountId <> 
webPropertyId <> 
profileId <> 

optional:
max-results <integer> The maximum number of profile-user links to include in this response.
start-index <integer> An index of the first profile-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId webPropertyId profileId]
    (management-profileUserLinks-list
      accountId
      webPropertyId
      profileId
      nil))
  ([accountId webPropertyId profileId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/entityUserLinks",
       :uri-template-args
       {"accountId" accountId,
        "profileId" profileId,
        "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.manage.users"
        "https://www.googleapis.com/auth/analytics.manage.users.readonly"]})))

(defn management-profileUserLinks-update
  "Updates permissions for an existing user on the given view (profile).
https://developers.google.com/analytics/v3/reference/rest/v3/management/profileUserLinks/update

accountId <> 
webPropertyId <> 
profileId <> 
linkId <> 
EntityUserLink:
EntityUserLink"
  [accountId webPropertyId profileId linkId EntityUserLink]
  (client/api-request
    {:method :put,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/entityUserLinks/{linkId}",
     :uri-template-args
     {"accountId" accountId,
      "linkId" linkId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.manage.users"],
     :body EntityUserLink}))

(defn management-filters-delete
  "Delete a filter.
https://developers.google.com/analytics/v3/reference/rest/v3/management/filters/delete

accountId <> 
filterId <> "
  [accountId filterId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/filters/{filterId}",
     :uri-template-args {"accountId" accountId, "filterId" filterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"]}))

(defn management-filters-get
  "Returns filters to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/filters/get

accountId <> 
filterId <> "
  [accountId filterId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/filters/{filterId}",
     :uri-template-args {"accountId" accountId, "filterId" filterId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn management-filters-insert
  "Create a new filter.
https://developers.google.com/analytics/v3/reference/rest/v3/management/filters/insert

accountId <> 
Filter:
Filter"
  [accountId Filter]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/filters",
     :uri-template-args {"accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body Filter}))

(defn management-filters-list
  "Lists all filters for an account
https://developers.google.com/analytics/v3/reference/rest/v3/management/filters/list

accountId <> 

optional:
max-results <integer> The maximum number of filters to include in this response.
start-index <integer> An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId] (management-filters-list accountId nil))
  ([accountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/filters",
       :uri-template-args {"accountId" accountId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-filters-patch
  "Updates an existing filter. This method supports patch semantics.
https://developers.google.com/analytics/v3/reference/rest/v3/management/filters/patch

accountId <> 
filterId <> 
Filter:
Filter"
  [accountId filterId Filter]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/filters/{filterId}",
     :uri-template-args {"accountId" accountId, "filterId" filterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body Filter}))

(defn management-filters-update
  "Updates an existing filter.
https://developers.google.com/analytics/v3/reference/rest/v3/management/filters/update

accountId <> 
filterId <> 
Filter:
Filter"
  [accountId filterId Filter]
  (client/api-request
    {:method :put,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/filters/{filterId}",
     :uri-template-args {"accountId" accountId, "filterId" filterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body Filter}))

(defn management-webPropertyAdWordsLinks-delete
  "Deletes a web property-Google Ads link.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webPropertyAdWordsLinks/delete

accountId <> 
webPropertyId <> 
webPropertyAdWordsLinkId <> "
  [accountId webPropertyId webPropertyAdWordsLinkId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/entityAdWordsLinks/{webPropertyAdWordsLinkId}",
     :uri-template-args
     {"accountId" accountId,
      "webPropertyAdWordsLinkId" webPropertyAdWordsLinkId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"]}))

(defn management-webPropertyAdWordsLinks-get
  "Returns a web property-Google Ads link to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webPropertyAdWordsLinks/get

accountId <> 
webPropertyId <> 
webPropertyAdWordsLinkId <> "
  [accountId webPropertyId webPropertyAdWordsLinkId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/entityAdWordsLinks/{webPropertyAdWordsLinkId}",
     :uri-template-args
     {"accountId" accountId,
      "webPropertyAdWordsLinkId" webPropertyAdWordsLinkId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn management-webPropertyAdWordsLinks-insert
  "Creates a webProperty-Google Ads link.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webPropertyAdWordsLinks/insert

accountId <> 
webPropertyId <> 
EntityAdWordsLink:
EntityAdWordsLink"
  [accountId webPropertyId EntityAdWordsLink]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/entityAdWordsLinks",
     :uri-template-args
     {"accountId" accountId, "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body EntityAdWordsLink}))

(defn management-webPropertyAdWordsLinks-list
  "Lists webProperty-Google Ads links for a given web property.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webPropertyAdWordsLinks/list

accountId <> 
webPropertyId <> 

optional:
max-results <integer> The maximum number of webProperty-Google Ads links to include in this response.
start-index <integer> An index of the first webProperty-Google Ads link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId webPropertyId]
    (management-webPropertyAdWordsLinks-list
      accountId
      webPropertyId
      nil))
  ([accountId webPropertyId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/entityAdWordsLinks",
       :uri-template-args
       {"accountId" accountId, "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-webPropertyAdWordsLinks-patch
  "Updates an existing webProperty-Google Ads link. This method supports patch semantics.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webPropertyAdWordsLinks/patch

accountId <> 
webPropertyId <> 
webPropertyAdWordsLinkId <> 
EntityAdWordsLink:
EntityAdWordsLink"
  [accountId webPropertyId webPropertyAdWordsLinkId EntityAdWordsLink]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/entityAdWordsLinks/{webPropertyAdWordsLinkId}",
     :uri-template-args
     {"accountId" accountId,
      "webPropertyAdWordsLinkId" webPropertyAdWordsLinkId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body EntityAdWordsLink}))

(defn management-webPropertyAdWordsLinks-update
  "Updates an existing webProperty-Google Ads link.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webPropertyAdWordsLinks/update

accountId <> 
webPropertyId <> 
webPropertyAdWordsLinkId <> 
EntityAdWordsLink:
EntityAdWordsLink"
  [accountId webPropertyId webPropertyAdWordsLinkId EntityAdWordsLink]
  (client/api-request
    {:method :put,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/entityAdWordsLinks/{webPropertyAdWordsLinkId}",
     :uri-template-args
     {"accountId" accountId,
      "webPropertyAdWordsLinkId" webPropertyAdWordsLinkId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body EntityAdWordsLink}))

(defn management-uploads-deleteUploadData
  "Delete data associated with a previous upload.
https://developers.google.com/analytics/v3/reference/rest/v3/management/uploads/deleteUploadData

accountId <> 
webPropertyId <> 
customDataSourceId <> 
AnalyticsDataimportDeleteUploadDataRequest:
AnalyticsDataimportDeleteUploadDataRequest"
  [accountId
   webPropertyId
   customDataSourceId
   AnalyticsDataimportDeleteUploadDataRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customDataSources/{customDataSourceId}/deleteUploadData",
     :uri-template-args
     {"accountId" accountId,
      "customDataSourceId" customDataSourceId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.edit"],
     :body AnalyticsDataimportDeleteUploadDataRequest}))

(defn management-uploads-get
  "List uploads to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/uploads/get

accountId <> 
webPropertyId <> 
customDataSourceId <> 
uploadId <> "
  [accountId webPropertyId customDataSourceId uploadId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customDataSources/{customDataSourceId}/uploads/{uploadId}",
     :uri-template-args
     {"accountId" accountId,
      "customDataSourceId" customDataSourceId,
      "uploadId" uploadId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn management-uploads-list
  "List uploads to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/uploads/list

accountId <> 
webPropertyId <> 
customDataSourceId <> 

optional:
max-results <integer> The maximum number of uploads to include in this response.
start-index <integer> A 1-based index of the first upload to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId webPropertyId customDataSourceId]
    (management-uploads-list
      accountId
      webPropertyId
      customDataSourceId
      nil))
  ([accountId webPropertyId customDataSourceId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customDataSources/{customDataSourceId}/uploads",
       :uri-template-args
       {"accountId" accountId,
        "customDataSourceId" customDataSourceId,
        "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-uploads-uploadData
  "Upload data for a custom data source.
https://developers.google.com/analytics/v3/reference/rest/v3/management/uploads/uploadData

accountId <> 
webPropertyId <> 
customDataSourceId <> "
  [accountId webPropertyId customDataSourceId]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customDataSources/{customDataSourceId}/uploads",
     :uri-template-args
     {"accountId" accountId,
      "customDataSourceId" customDataSourceId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.edit"]}))

(defn management-profiles-delete
  "Deletes a view (profile).
https://developers.google.com/analytics/v3/reference/rest/v3/management/profiles/delete

accountId <> 
webPropertyId <> 
profileId <> "
  [accountId webPropertyId profileId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}",
     :uri-template-args
     {"accountId" accountId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"]}))

(defn management-profiles-get
  "Gets a view (profile) to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/profiles/get

accountId <> 
webPropertyId <> 
profileId <> "
  [accountId webPropertyId profileId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}",
     :uri-template-args
     {"accountId" accountId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn management-profiles-insert
  "Create a new view (profile).
https://developers.google.com/analytics/v3/reference/rest/v3/management/profiles/insert

accountId <> 
webPropertyId <> 
Profile:
Profile"
  [accountId webPropertyId Profile]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles",
     :uri-template-args
     {"accountId" accountId, "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body Profile}))

(defn management-profiles-list
  "Lists views (profiles) to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/profiles/list

accountId <> 
webPropertyId <> 

optional:
max-results <integer> The maximum number of views (profiles) to include in this response.
start-index <integer> An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId webPropertyId]
    (management-profiles-list accountId webPropertyId nil))
  ([accountId webPropertyId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles",
       :uri-template-args
       {"accountId" accountId, "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-profiles-patch
  "Updates an existing view (profile). This method supports patch semantics.
https://developers.google.com/analytics/v3/reference/rest/v3/management/profiles/patch

accountId <> 
webPropertyId <> 
profileId <> 
Profile:
Profile"
  [accountId webPropertyId profileId Profile]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}",
     :uri-template-args
     {"accountId" accountId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body Profile}))

(defn management-profiles-update
  "Updates an existing view (profile).
https://developers.google.com/analytics/v3/reference/rest/v3/management/profiles/update

accountId <> 
webPropertyId <> 
profileId <> 
Profile:
Profile"
  [accountId webPropertyId profileId Profile]
  (client/api-request
    {:method :put,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}",
     :uri-template-args
     {"accountId" accountId,
      "profileId" profileId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body Profile}))

(defn management-remarketingAudience-delete
  "Delete a remarketing audience.
https://developers.google.com/analytics/v3/reference/rest/v3/management/remarketingAudience/delete

accountId <> 
webPropertyId <> 
remarketingAudienceId <> "
  [accountId webPropertyId remarketingAudienceId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/remarketingAudiences/{remarketingAudienceId}",
     :uri-template-args
     {"accountId" accountId,
      "remarketingAudienceId" remarketingAudienceId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"]}))

(defn management-remarketingAudience-get
  "Gets a remarketing audience to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/remarketingAudience/get

accountId <> 
webPropertyId <> 
remarketingAudienceId <> "
  [accountId webPropertyId remarketingAudienceId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/remarketingAudiences/{remarketingAudienceId}",
     :uri-template-args
     {"accountId" accountId,
      "remarketingAudienceId" remarketingAudienceId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn management-remarketingAudience-insert
  "Creates a new remarketing audience.
https://developers.google.com/analytics/v3/reference/rest/v3/management/remarketingAudience/insert

accountId <> 
webPropertyId <> 
RemarketingAudience:
RemarketingAudience"
  [accountId webPropertyId RemarketingAudience]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/remarketingAudiences",
     :uri-template-args
     {"accountId" accountId, "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body RemarketingAudience}))

(defn management-remarketingAudience-list
  "Lists remarketing audiences to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/remarketingAudience/list

accountId <> 
webPropertyId <> 

optional:
max-results <integer> The maximum number of remarketing audiences to include in this response.
start-index <integer> An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
type <string> "
  ([accountId webPropertyId]
    (management-remarketingAudience-list accountId webPropertyId nil))
  ([accountId webPropertyId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/remarketingAudiences",
       :uri-template-args
       {"accountId" accountId, "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-remarketingAudience-patch
  "Updates an existing remarketing audience. This method supports patch semantics.
https://developers.google.com/analytics/v3/reference/rest/v3/management/remarketingAudience/patch

accountId <> 
webPropertyId <> 
remarketingAudienceId <> 
RemarketingAudience:
RemarketingAudience"
  [accountId webPropertyId remarketingAudienceId RemarketingAudience]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/remarketingAudiences/{remarketingAudienceId}",
     :uri-template-args
     {"accountId" accountId,
      "remarketingAudienceId" remarketingAudienceId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body RemarketingAudience}))

(defn management-remarketingAudience-update
  "Updates an existing remarketing audience.
https://developers.google.com/analytics/v3/reference/rest/v3/management/remarketingAudience/update

accountId <> 
webPropertyId <> 
remarketingAudienceId <> 
RemarketingAudience:
RemarketingAudience"
  [accountId webPropertyId remarketingAudienceId RemarketingAudience]
  (client/api-request
    {:method :put,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/remarketingAudiences/{remarketingAudienceId}",
     :uri-template-args
     {"accountId" accountId,
      "remarketingAudienceId" remarketingAudienceId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body RemarketingAudience}))

(defn management-customMetrics-get
  "Get a custom metric to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/customMetrics/get

accountId <> 
webPropertyId <> 
customMetricId <> "
  [accountId webPropertyId customMetricId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customMetrics/{customMetricId}",
     :uri-template-args
     {"accountId" accountId,
      "customMetricId" customMetricId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn management-customMetrics-insert
  "Create a new custom metric.
https://developers.google.com/analytics/v3/reference/rest/v3/management/customMetrics/insert

accountId <> 
webPropertyId <> 
CustomMetric:
CustomMetric"
  [accountId webPropertyId CustomMetric]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customMetrics",
     :uri-template-args
     {"accountId" accountId, "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body CustomMetric}))

(defn management-customMetrics-list
  "Lists custom metrics to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/customMetrics/list

accountId <> 
webPropertyId <> 

optional:
max-results <integer> The maximum number of custom metrics to include in this response.
start-index <integer> An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId webPropertyId]
    (management-customMetrics-list accountId webPropertyId nil))
  ([accountId webPropertyId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customMetrics",
       :uri-template-args
       {"accountId" accountId, "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-customMetrics-patch
  "Updates an existing custom metric. This method supports patch semantics.
https://developers.google.com/analytics/v3/reference/rest/v3/management/customMetrics/patch

accountId <> 
webPropertyId <> 
customMetricId <> 
CustomMetric:
CustomMetric

optional:
ignoreCustomDataSourceLinks <boolean> Force the update and ignore any warnings related to the custom metric being linked to a custom data source / data set."
  ([accountId webPropertyId customMetricId CustomMetric]
    (management-customMetrics-patch
      accountId
      webPropertyId
      customMetricId
      CustomMetric
      nil))
  ([accountId webPropertyId customMetricId CustomMetric optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customMetrics/{customMetricId}",
       :uri-template-args
       {"accountId" accountId,
        "customMetricId" customMetricId,
        "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/analytics.edit"],
       :body CustomMetric})))

(defn management-customMetrics-update
  "Updates an existing custom metric.
https://developers.google.com/analytics/v3/reference/rest/v3/management/customMetrics/update

accountId <> 
webPropertyId <> 
customMetricId <> 
CustomMetric:
CustomMetric

optional:
ignoreCustomDataSourceLinks <boolean> Force the update and ignore any warnings related to the custom metric being linked to a custom data source / data set."
  ([accountId webPropertyId customMetricId CustomMetric]
    (management-customMetrics-update
      accountId
      webPropertyId
      customMetricId
      CustomMetric
      nil))
  ([accountId webPropertyId customMetricId CustomMetric optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customMetrics/{customMetricId}",
       :uri-template-args
       {"accountId" accountId,
        "customMetricId" customMetricId,
        "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/analytics.edit"],
       :body CustomMetric})))

(defn management-accounts-list
  "Lists all accounts to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/accounts/list

optional:
max-results <integer> The maximum number of accounts to include in this response.
start-index <integer> An index of the first account to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([] (management-accounts-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-clientId-hashClientId
  "Hashes the given Client ID.
https://developers.google.com/analytics/v3/reference/rest/v3/management/clientId/hashClientId

HashClientIdRequest:
HashClientIdRequest"
  [HashClientIdRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/clientId:hashClientId",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"],
     :body HashClientIdRequest}))

(defn management-segments-list
  "Lists segments to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/segments/list

optional:
max-results <integer> The maximum number of segments to include in this response.
start-index <integer> An index of the first segment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([] (management-segments-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/segments",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-webpropertyUserLinks-delete
  "Removes a user from the given web property.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webpropertyUserLinks/delete

accountId <> 
webPropertyId <> 
linkId <> "
  [accountId webPropertyId linkId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/entityUserLinks/{linkId}",
     :uri-template-args
     {"accountId" accountId,
      "linkId" linkId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.manage.users"]}))

(defn management-webpropertyUserLinks-insert
  "Adds a new user to the given web property.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webpropertyUserLinks/insert

accountId <> 
webPropertyId <> 
EntityUserLink:
EntityUserLink"
  [accountId webPropertyId EntityUserLink]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/entityUserLinks",
     :uri-template-args
     {"accountId" accountId, "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.manage.users"],
     :body EntityUserLink}))

(defn management-webpropertyUserLinks-list
  "Lists webProperty-user links for a given web property.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webpropertyUserLinks/list

accountId <> 
webPropertyId <> 

optional:
max-results <integer> The maximum number of webProperty-user Links to include in this response.
start-index <integer> An index of the first webProperty-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId webPropertyId]
    (management-webpropertyUserLinks-list accountId webPropertyId nil))
  ([accountId webPropertyId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/entityUserLinks",
       :uri-template-args
       {"accountId" accountId, "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.manage.users"
        "https://www.googleapis.com/auth/analytics.manage.users.readonly"]})))

(defn management-webpropertyUserLinks-update
  "Updates permissions for an existing user on the given web property.
https://developers.google.com/analytics/v3/reference/rest/v3/management/webpropertyUserLinks/update

accountId <> 
webPropertyId <> 
linkId <> 
EntityUserLink:
EntityUserLink"
  [accountId webPropertyId linkId EntityUserLink]
  (client/api-request
    {:method :put,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/entityUserLinks/{linkId}",
     :uri-template-args
     {"accountId" accountId,
      "linkId" linkId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.manage.users"],
     :body EntityUserLink}))

(defn management-customDimensions-get
  "Get a custom dimension to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/customDimensions/get

accountId <> 
webPropertyId <> 
customDimensionId <> "
  [accountId webPropertyId customDimensionId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customDimensions/{customDimensionId}",
     :uri-template-args
     {"accountId" accountId,
      "customDimensionId" customDimensionId,
      "webPropertyId" webPropertyId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn management-customDimensions-insert
  "Create a new custom dimension.
https://developers.google.com/analytics/v3/reference/rest/v3/management/customDimensions/insert

accountId <> 
webPropertyId <> 
CustomDimension:
CustomDimension"
  [accountId webPropertyId CustomDimension]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customDimensions",
     :uri-template-args
     {"accountId" accountId, "webPropertyId" webPropertyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body CustomDimension}))

(defn management-customDimensions-list
  "Lists custom dimensions to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/customDimensions/list

accountId <> 
webPropertyId <> 

optional:
max-results <integer> The maximum number of custom dimensions to include in this response.
start-index <integer> An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId webPropertyId]
    (management-customDimensions-list accountId webPropertyId nil))
  ([accountId webPropertyId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customDimensions",
       :uri-template-args
       {"accountId" accountId, "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn management-customDimensions-patch
  "Updates an existing custom dimension. This method supports patch semantics.
https://developers.google.com/analytics/v3/reference/rest/v3/management/customDimensions/patch

accountId <> 
webPropertyId <> 
customDimensionId <> 
CustomDimension:
CustomDimension

optional:
ignoreCustomDataSourceLinks <boolean> Force the update and ignore any warnings related to the custom dimension being linked to a custom data source / data set."
  ([accountId webPropertyId customDimensionId CustomDimension]
    (management-customDimensions-patch
      accountId
      webPropertyId
      customDimensionId
      CustomDimension
      nil))
  ([accountId webPropertyId customDimensionId CustomDimension optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customDimensions/{customDimensionId}",
       :uri-template-args
       {"accountId" accountId,
        "customDimensionId" customDimensionId,
        "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/analytics.edit"],
       :body CustomDimension})))

(defn management-customDimensions-update
  "Updates an existing custom dimension.
https://developers.google.com/analytics/v3/reference/rest/v3/management/customDimensions/update

accountId <> 
webPropertyId <> 
customDimensionId <> 
CustomDimension:
CustomDimension

optional:
ignoreCustomDataSourceLinks <boolean> Force the update and ignore any warnings related to the custom dimension being linked to a custom data source / data set."
  ([accountId webPropertyId customDimensionId CustomDimension]
    (management-customDimensions-update
      accountId
      webPropertyId
      customDimensionId
      CustomDimension
      nil))
  ([accountId webPropertyId customDimensionId CustomDimension optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customDimensions/{customDimensionId}",
       :uri-template-args
       {"accountId" accountId,
        "customDimensionId" customDimensionId,
        "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/analytics.edit"],
       :body CustomDimension})))

(defn management-customDataSources-list
  "List custom data sources to which the user has access.
https://developers.google.com/analytics/v3/reference/rest/v3/management/customDataSources/list

accountId <> 
webPropertyId <> 

optional:
max-results <integer> The maximum number of custom data sources to include in this response.
start-index <integer> A 1-based index of the first custom data source to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter."
  ([accountId webPropertyId]
    (management-customDataSources-list accountId webPropertyId nil))
  ([accountId webPropertyId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/analytics/v3/management/accounts/{accountId}/webproperties/{webPropertyId}/customDataSources",
       :uri-template-args
       {"accountId" accountId, "webPropertyId" webPropertyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn metadata-columns-list
  "Lists all columns for a report type
https://developers.google.com/analytics/v3/reference/rest/v3/metadata/columns/list

reportType <> "
  [reportType]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/analytics/v3/metadata/{reportType}/columns",
     :uri-template-args {"reportType" reportType},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn provisioning-createAccountTicket
  "Creates an account ticket.
https://developers.google.com/analytics/v3/reference/rest/v3/provisioning/createAccountTicket

AccountTicket:
AccountTicket"
  [AccountTicket]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/provisioning/createAccountTicket",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.provision"],
     :body AccountTicket}))

(defn provisioning-createAccountTree
  "Provision account.
https://developers.google.com/analytics/v3/reference/rest/v3/provisioning/createAccountTree

AccountTreeRequest:
AccountTreeRequest"
  [AccountTreeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/provisioning/createAccountTree",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.provision"],
     :body AccountTreeRequest}))

(defn userDeletion-userDeletionRequest-upsert
  "Insert or update a user deletion requests.
https://developers.google.com/analytics/v3/reference/rest/v3/userDeletion/userDeletionRequest/upsert

UserDeletionRequest:
UserDeletionRequest"
  [UserDeletionRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/analytics/v3/userDeletion/userDeletionRequests:upsert",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.user.deletion"],
     :body UserDeletionRequest}))
