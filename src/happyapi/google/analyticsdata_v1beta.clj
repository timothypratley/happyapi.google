(ns happyapi.google.analyticsdata-v1beta
  "Google Analytics Data API
Accesses report data in Google Analytics. Warning: Creating multiple Customer Applications, Accounts, or Projects to simulate or act as a single Customer Application, Account, or Project (respectively) or to circumvent Service-specific usage limits or quotas is a direct violation of Google Cloud Platform Terms of Service as well as Google APIs Terms of Service. These actions can result in immediate termination of your GCP project(s) without any warning. 
See: https://developers.google.com/analytics/devguides/reporting/data/v1/"
  (:require [happyapi.providers.google :as client]))

(defn properties-runReport
  "Returns a customized report of your Google Analytics event data. Reports contain statistics derived from data collected by the Google Analytics tracking code. The data returned from the API is as a table with columns for the requested dimensions and metrics. Metrics are individual measurements of user activity on your property, such as active users or event count. Dimensions break down metrics across some common criteria, such as country or event name. For a guide to constructing requests & understanding responses, see [Creating a Report](https://developers.google.com/analytics/devguides/reporting/data/v1/basics).
https://developers.google.com/analytics/devguides/reporting/data/v1/v1beta/reference/rest/v1beta/properties/runReport

property <> 
RunReportRequest:
RunReportRequest"
  [property RunReportRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://analyticsdata.googleapis.com/v1beta/{+property}:runReport",
     :uri-template-args {"property" property},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.readonly"],
     :body RunReportRequest}))

(defn properties-runPivotReport
  "Returns a customized pivot report of your Google Analytics event data. Pivot reports are more advanced and expressive formats than regular reports. In a pivot report, dimensions are only visible if they are included in a pivot. Multiple pivots can be specified to further dissect your data.
https://developers.google.com/analytics/devguides/reporting/data/v1/v1beta/reference/rest/v1beta/properties/runPivotReport

property <> 
RunPivotReportRequest:
RunPivotReportRequest"
  [property RunPivotReportRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://analyticsdata.googleapis.com/v1beta/{+property}:runPivotReport",
     :uri-template-args {"property" property},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.readonly"],
     :body RunPivotReportRequest}))

(defn properties-batchRunReports
  "Returns multiple reports in a batch. All reports must be for the same Google Analytics property.
https://developers.google.com/analytics/devguides/reporting/data/v1/v1beta/reference/rest/v1beta/properties/batchRunReports

property <> 
BatchRunReportsRequest:
BatchRunReportsRequest"
  [property BatchRunReportsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://analyticsdata.googleapis.com/v1beta/{+property}:batchRunReports",
     :uri-template-args {"property" property},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.readonly"],
     :body BatchRunReportsRequest}))

(defn properties-batchRunPivotReports
  "Returns multiple pivot reports in a batch. All reports must be for the same Google Analytics property.
https://developers.google.com/analytics/devguides/reporting/data/v1/v1beta/reference/rest/v1beta/properties/batchRunPivotReports

property <> 
BatchRunPivotReportsRequest:
BatchRunPivotReportsRequest"
  [property BatchRunPivotReportsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://analyticsdata.googleapis.com/v1beta/{+property}:batchRunPivotReports",
     :uri-template-args {"property" property},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.readonly"],
     :body BatchRunPivotReportsRequest}))

(defn properties-getMetadata
  "Returns metadata for dimensions and metrics available in reporting methods. Used to explore the dimensions and metrics. In this method, a Google Analytics property identifier is specified in the request, and the metadata response includes Custom dimensions and metrics as well as Universal metadata. For example if a custom metric with parameter name `levels_unlocked` is registered to a property, the Metadata response will contain `customEvent:levels_unlocked`. Universal metadata are dimensions and metrics applicable to any property such as `country` and `totalUsers`.
https://developers.google.com/analytics/devguides/reporting/data/v1/v1beta/reference/rest/v1beta/properties/getMetadata

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://analyticsdata.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn properties-runRealtimeReport
  "Returns a customized report of realtime event data for your property. Events appear in realtime reports seconds after they have been sent to the Google Analytics. Realtime reports show events and usage data for the periods of time ranging from the present moment to 30 minutes ago (up to 60 minutes for Google Analytics 360 properties). For a guide to constructing realtime requests & understanding responses, see [Creating a Realtime Report](https://developers.google.com/analytics/devguides/reporting/data/v1/realtime-basics).
https://developers.google.com/analytics/devguides/reporting/data/v1/v1beta/reference/rest/v1beta/properties/runRealtimeReport

property <> 
RunRealtimeReportRequest:
RunRealtimeReportRequest"
  [property RunRealtimeReportRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://analyticsdata.googleapis.com/v1beta/{+property}:runRealtimeReport",
     :uri-template-args {"property" property},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.readonly"],
     :body RunRealtimeReportRequest}))

(defn properties-checkCompatibility
  "This compatibility method lists dimensions and metrics that can be added to a report request and maintain compatibility. This method fails if the request's dimensions and metrics are incompatible. In Google Analytics, reports fail if they request incompatible dimensions and/or metrics; in that case, you will need to remove dimensions and/or metrics from the incompatible report until the report is compatible. The Realtime and Core reports have different compatibility rules. This method checks compatibility for Core reports.
https://developers.google.com/analytics/devguides/reporting/data/v1/v1beta/reference/rest/v1beta/properties/checkCompatibility

property <> 
CheckCompatibilityRequest:
CheckCompatibilityRequest"
  [property CheckCompatibilityRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://analyticsdata.googleapis.com/v1beta/{+property}:checkCompatibility",
     :uri-template-args {"property" property},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.readonly"],
     :body CheckCompatibilityRequest}))

(defn properties-audienceExports-create
  "Creates an audience export for later retrieval. This method quickly returns the audience export's resource name and initiates a long running asynchronous request to form an audience export. To export the users in an audience export, first create the audience export through this method and then send the audience resource name to the `QueryAudienceExport` method. See [Creating an Audience Export](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics) for an introduction to Audience Exports with examples. An audience export is a snapshot of the users currently in the audience at the time of audience export creation. Creating audience exports for one audience on different days will return different results as users enter and exit the audience. Audiences in Google Analytics 4 allow you to segment your users in the ways that are important to your business. To learn more, see https://support.google.com/analytics/answer/9267572. Audience exports contain the users in each audience. Audience Export APIs have some methods at alpha and other methods at beta stability. The intention is to advance methods to beta stability after some feedback and adoption. To give your feedback on this API, complete the [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
https://developers.google.com/analytics/devguides/reporting/data/v1/v1beta/reference/rest/v1beta/properties/audienceExports/create

parent <> 
AudienceExport:
AudienceExport"
  [parent AudienceExport]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://analyticsdata.googleapis.com/v1beta/{+parent}/audienceExports",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.readonly"],
     :body AudienceExport}))

(defn properties-audienceExports-query
  "Retrieves an audience export of users. After creating an audience, the users are not immediately available for exporting. First, a request to `CreateAudienceExport` is necessary to create an audience export of users, and then second, this method is used to retrieve the users in the audience export. See [Creating an Audience Export](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics) for an introduction to Audience Exports with examples. Audiences in Google Analytics 4 allow you to segment your users in the ways that are important to your business. To learn more, see https://support.google.com/analytics/answer/9267572. Audience Export APIs have some methods at alpha and other methods at beta stability. The intention is to advance methods to beta stability after some feedback and adoption. To give your feedback on this API, complete the [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
https://developers.google.com/analytics/devguides/reporting/data/v1/v1beta/reference/rest/v1beta/properties/audienceExports/query

name <> 
QueryAudienceExportRequest:
QueryAudienceExportRequest"
  [name QueryAudienceExportRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://analyticsdata.googleapis.com/v1beta/{+name}:query",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.readonly"],
     :body QueryAudienceExportRequest}))

(defn properties-audienceExports-get
  "Gets configuration metadata about a specific audience export. This method can be used to understand an audience export after it has been created. See [Creating an Audience Export](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics) for an introduction to Audience Exports with examples. Audience Export APIs have some methods at alpha and other methods at beta stability. The intention is to advance methods to beta stability after some feedback and adoption. To give your feedback on this API, complete the [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
https://developers.google.com/analytics/devguides/reporting/data/v1/v1beta/reference/rest/v1beta/properties/audienceExports/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://analyticsdata.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn properties-audienceExports-list
  "Lists all audience exports for a property. This method can be used for you to find and reuse existing audience exports rather than creating unnecessary new audience exports. The same audience can have multiple audience exports that represent the export of users that were in an audience on different days. See [Creating an Audience Export](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics) for an introduction to Audience Exports with examples. Audience Export APIs have some methods at alpha and other methods at beta stability. The intention is to advance methods to beta stability after some feedback and adoption. To give your feedback on this API, complete the [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
https://developers.google.com/analytics/devguides/reporting/data/v1/v1beta/reference/rest/v1beta/properties/audienceExports/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of audience exports to return. The service may return fewer than this value. If unspecified, at most 200 audience exports will be returned. The maximum value is 1000 (higher values will be coerced to the maximum)."
  ([parent] (properties-audienceExports-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://analyticsdata.googleapis.com/v1beta/{+parent}/audienceExports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics"
        "https://www.googleapis.com/auth/analytics.readonly"]})))
