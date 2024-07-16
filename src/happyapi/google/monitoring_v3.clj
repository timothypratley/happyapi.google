(ns happyapi.google.monitoring-v3
  "Cloud Monitoring API
Manages your Cloud Monitoring data and configurations.
See: https://cloud.google.com/monitoring/api/v3"
  (:require [happyapi.providers.google :as client]))

(defn projects-collectdTimeSeries-create
  "Cloud Monitoring Agent only: Creates a new time series.This method is only for use by the Cloud Monitoring Agent. Use projects.timeSeries.create instead.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/collectdTimeSeries/create

name <> 
CreateCollectdTimeSeriesRequest:
CreateCollectdTimeSeriesRequest"
  [name CreateCollectdTimeSeriesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://monitoring.googleapis.com/v3/{+name}/collectdTimeSeries",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.write"],
     :body CreateCollectdTimeSeriesRequest}))

(defn projects-timeSeries-list
  "Lists time series that match a filter.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/timeSeries/list

name <> 

optional:
interval.startTime <string> Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time.
aggregation.alignmentPeriod <string> The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 104 weeks (2 years) for charts, and 90,000 seconds (25 hours) for alerting policies.
pageSize <integer> A positive number that is the maximum number of results to return. If page_size is empty or more than 100,000 results, the effective page_size is 100,000 results. If view is set to FULL, this is the maximum number of Points returned. If view is set to HEADERS, this is the maximum number of TimeSeries returned.
interval.endTime <string> Required. The end of the time interval.
orderBy <string> Unsupported: must be left blank. The points in each time series are currently returned in reverse time order (most recent to oldest).
secondaryAggregation.crossSeriesReducer <string> The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period must also be specified; otherwise, an error is returned.
aggregation.perSeriesAligner <string> An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
filter <string> Required. A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) that specifies which time series should be returned. The filter must specify a single metric type, and can additionally specify metric labels and other information. For example: metric.type = \"compute.googleapis.com/instance/cpu/usage_time\" AND metric.labels.instance_name = \"my-instance-name\" 
secondaryAggregation.groupByFields <string> The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset. The cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type. Fields not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If cross_series_reducer is not defined, this field is ignored.
secondaryAggregation.alignmentPeriod <string> The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 104 weeks (2 years) for charts, and 90,000 seconds (25 hours) for alerting policies.
secondaryAggregation.perSeriesAligner <string> An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
aggregation.crossSeriesReducer <string> The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period must also be specified; otherwise, an error is returned.
view <string> Required. Specifies which information is returned about the time series.
aggregation.groupByFields <string> The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset. The cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type. Fields not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If cross_series_reducer is not defined, this field is ignored."
  ([name] (projects-timeSeries-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+name}/timeSeries",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"]})))

(defn projects-timeSeries-create
  "Creates or adds data to one or more time series. The response is empty if all time series in the request were written. If any time series could not be written, a corresponding failure message is included in the error response. This method does not support resource locations constraint of an organization policy (https://cloud.google.com/resource-manager/docs/organization-policy/defining-locations#setting_the_organization_policy).
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/timeSeries/create

name <> 
CreateTimeSeriesRequest:
CreateTimeSeriesRequest"
  [name CreateTimeSeriesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://monitoring.googleapis.com/v3/{+name}/timeSeries",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.write"],
     :body CreateTimeSeriesRequest}))

(defn projects-timeSeries-createService
  "Creates or adds data to one or more service time series. A service time series is a time series for a metric from a Google Cloud service. The response is empty if all time series in the request were written. If any time series could not be written, a corresponding failure message is included in the error response. This endpoint rejects writes to user-defined metrics. This method is only for use by Google Cloud services. Use projects.timeSeries.create instead.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/timeSeries/createService

name <> 
CreateTimeSeriesRequest:
CreateTimeSeriesRequest"
  [name CreateTimeSeriesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://monitoring.googleapis.com/v3/{+name}/timeSeries:createService",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.write"],
     :body CreateTimeSeriesRequest}))

(defn projects-timeSeries-query
  "Queries time series using Monitoring Query Language.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/timeSeries/query

name <> 
QueryTimeSeriesRequest:
QueryTimeSeriesRequest"
  [name QueryTimeSeriesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://monitoring.googleapis.com/v3/{+name}/timeSeries:query",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.read"],
     :body QueryTimeSeriesRequest}))

(defn projects-metricDescriptors-list
  "Lists metric descriptors that match a filter.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/metricDescriptors/list

name <> 

optional:
filter <string> If this field is empty, all custom and system-defined metric descriptors are returned. Otherwise, the filter (https://cloud.google.com/monitoring/api/v3/filters) specifies which metric descriptors are to be returned. For example, the following filter matches all custom metrics (https://cloud.google.com/monitoring/custom-metrics): metric.type = starts_with(\"custom.googleapis.com/\") 
pageSize <integer> A positive number that is the maximum number of results to return. The default and maximum value is 10,000. If a page_size <= 0 or > 10,000 is submitted, will instead return a maximum of 10,000 results."
  ([name] (projects-metricDescriptors-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+name}/metricDescriptors",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"
        "https://www.googleapis.com/auth/monitoring.write"]})))

(defn projects-metricDescriptors-get
  "Gets a single metric descriptor.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/metricDescriptors/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://monitoring.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.read"
      "https://www.googleapis.com/auth/monitoring.write"]}))

(defn projects-metricDescriptors-create
  "Creates a new metric descriptor. The creation is executed asynchronously. User-created metric descriptors define custom metrics (https://cloud.google.com/monitoring/custom-metrics). The metric descriptor is updated if it already exists, except that metric labels are never removed.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/metricDescriptors/create

name <> 
MetricDescriptor:
MetricDescriptor"
  [name MetricDescriptor]
  (client/api-request
    {:method :post,
     :uri-template
     "https://monitoring.googleapis.com/v3/{+name}/metricDescriptors",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.write"],
     :body MetricDescriptor}))

(defn projects-metricDescriptors-delete
  "Deletes a metric descriptor. Only user-created custom metrics (https://cloud.google.com/monitoring/custom-metrics) can be deleted.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/metricDescriptors/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://monitoring.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"]}))

(defn projects-monitoredResourceDescriptors-list
  "Lists monitored resource descriptors that match a filter.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/monitoredResourceDescriptors/list

name <> 

optional:
filter <string> An optional filter (https://cloud.google.com/monitoring/api/v3/filters) describing the descriptors to be returned. The filter can reference the descriptor's type and labels. For example, the following filter returns only Google Compute Engine descriptors that have an id label: resource.type = starts_with(\"gce_\") AND resource.label:id 
pageSize <integer> A positive number that is the maximum number of results to return."
  ([name] (projects-monitoredResourceDescriptors-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+name}/monitoredResourceDescriptors",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"
        "https://www.googleapis.com/auth/monitoring.write"]})))

(defn projects-monitoredResourceDescriptors-get
  "Gets a single monitored resource descriptor.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/monitoredResourceDescriptors/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://monitoring.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.read"
      "https://www.googleapis.com/auth/monitoring.write"]}))

(defn projects-snoozes-create
  "Creates a Snooze that will prevent alerts, which match the provided criteria, from being opened. The Snooze applies for a specific time interval.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/snoozes/create

parent <> 
Snooze:
Snooze"
  [parent Snooze]
  (client/api-request
    {:method :post,
     :uri-template
     "https://monitoring.googleapis.com/v3/{+parent}/snoozes",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"],
     :body Snooze}))

(defn projects-snoozes-list
  "Lists the Snoozes associated with a project. Can optionally pass in filter, which specifies predicates to match Snoozes.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/snoozes/list

parent <> 

optional:
filter <string> Optional. Optional filter to restrict results to the given criteria. The following fields are supported. interval.start_time interval.end_timeFor example: ``` interval.start_time > \"2022-03-11T00:00:00-08:00\" AND interval.end_time < \"2022-03-12T00:00:00-08:00\" ``` 
pageSize <integer> Optional. The maximum number of results to return for a single query. The server may further constrain the maximum number of results returned in a single page. The value should be in the range 1, 1000. If the value given is outside this range, the server will decide the number of results to be returned."
  ([parent] (projects-snoozes-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+parent}/snoozes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"]})))

(defn projects-snoozes-get
  "Retrieves a Snooze by name.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/snoozes/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://monitoring.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.read"]}))

(defn projects-snoozes-patch
  "Updates a Snooze, identified by its name, with the parameters in the given Snooze object.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/snoozes/patch

name <> 
Snooze:
Snooze

optional:
updateMask <string> Required. The fields to update.For each field listed in update_mask: If the Snooze object supplied in the UpdateSnoozeRequest has a value for that field, the value of the field in the existing Snooze will be set to the value of the field in the supplied Snooze. If the field does not have a value in the supplied Snooze, the field in the existing Snooze is set to its default value.Fields not listed retain their existing value.The following are the field names that are accepted in update_mask: display_name interval.start_time interval.end_timeThat said, the start time and end time of the Snooze determines which fields can legally be updated. Before attempting an update, users should consult the documentation for UpdateSnoozeRequest, which talks about which fields can be updated."
  ([name Snooze] (projects-snoozes-patch name Snooze nil))
  ([name Snooze optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://monitoring.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"],
       :body Snooze})))

(defn projects-notificationChannels-list
  "Lists the notification channels that have been created for the project. To list the types of notification channels that are supported, use the ListNotificationChannelDescriptors method.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/notificationChannels/list

name <> 

optional:
filter <string> If provided, this field specifies the criteria that must be met by notification channels to be included in the response.For more details, see sorting and filtering (https://cloud.google.com/monitoring/api/v3/sorting-and-filtering).
orderBy <string> A comma-separated list of fields by which to sort the result. Supports the same set of fields as in filter. Entries can be prefixed with a minus sign to sort in descending rather than ascending order.For more details, see sorting and filtering (https://cloud.google.com/monitoring/api/v3/sorting-and-filtering).
pageSize <integer> The maximum number of results to return in a single response. If not set to a positive number, a reasonable value will be chosen by the service."
  ([name] (projects-notificationChannels-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+name}/notificationChannels",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"]})))

(defn projects-notificationChannels-get
  "Gets a single notification channel. The channel includes the relevant configuration details with which the channel was created. However, the response may truncate or omit passwords, API keys, or other private key matter and thus the response may not be 100% identical to the information that was supplied in the call to the create method.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/notificationChannels/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://monitoring.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.read"]}))

(defn projects-notificationChannels-create
  "Creates a new notification channel, representing a single notification endpoint such as an email address, SMS number, or PagerDuty service.Design your application to single-thread API calls that modify the state of notification channels in a single project. This includes calls to CreateNotificationChannel, DeleteNotificationChannel and UpdateNotificationChannel.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/notificationChannels/create

name <> 
NotificationChannel:
NotificationChannel"
  [name NotificationChannel]
  (client/api-request
    {:method :post,
     :uri-template
     "https://monitoring.googleapis.com/v3/{+name}/notificationChannels",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"],
     :body NotificationChannel}))

(defn projects-notificationChannels-patch
  "Updates a notification channel. Fields not specified in the field mask remain unchanged.Design your application to single-thread API calls that modify the state of notification channels in a single project. This includes calls to CreateNotificationChannel, DeleteNotificationChannel and UpdateNotificationChannel.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/notificationChannels/patch

name <> 
NotificationChannel:
NotificationChannel

optional:
updateMask <string> The fields to update."
  ([name NotificationChannel]
    (projects-notificationChannels-patch name NotificationChannel nil))
  ([name NotificationChannel optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://monitoring.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"],
       :body NotificationChannel})))

(defn projects-notificationChannels-delete
  "Deletes a notification channel.Design your application to single-thread API calls that modify the state of notification channels in a single project. This includes calls to CreateNotificationChannel, DeleteNotificationChannel and UpdateNotificationChannel.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/notificationChannels/delete

name <> 

optional:
force <boolean> If true, the notification channel will be deleted regardless of its use in alert policies (the policies will be updated to remove the channel). If false, channels that are still referenced by an existing alerting policy will fail to be deleted in a delete operation."
  ([name] (projects-notificationChannels-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://monitoring.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"]})))

(defn projects-notificationChannels-sendVerificationCode
  "Causes a verification code to be delivered to the channel. The code can then be supplied in VerifyNotificationChannel to verify the channel.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/notificationChannels/sendVerificationCode

name <> 
SendNotificationChannelVerificationCodeRequest:
SendNotificationChannelVerificationCodeRequest"
  [name SendNotificationChannelVerificationCodeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://monitoring.googleapis.com/v3/{+name}:sendVerificationCode",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"],
     :body SendNotificationChannelVerificationCodeRequest}))

(defn projects-notificationChannels-getVerificationCode
  "Requests a verification code for an already verified channel that can then be used in a call to VerifyNotificationChannel() on a different channel with an equivalent identity in the same or in a different project. This makes it possible to copy a channel between projects without requiring manual reverification of the channel. If the channel is not in the verified state, this method will fail (in other words, this may only be used if the SendNotificationChannelVerificationCode and VerifyNotificationChannel paths have already been used to put the given channel into the verified state).There is no guarantee that the verification codes returned by this method will be of a similar structure or form as the ones that are delivered to the channel via SendNotificationChannelVerificationCode; while VerifyNotificationChannel() will recognize both the codes delivered via SendNotificationChannelVerificationCode() and returned from GetNotificationChannelVerificationCode(), it is typically the case that the verification codes delivered via SendNotificationChannelVerificationCode() will be shorter and also have a shorter expiration (e.g. codes such as \"G-123456\") whereas GetVerificationCode() will typically return a much longer, websafe base 64 encoded string that has a longer expiration time.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/notificationChannels/getVerificationCode

name <> 
GetNotificationChannelVerificationCodeRequest:
GetNotificationChannelVerificationCodeRequest"
  [name GetNotificationChannelVerificationCodeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://monitoring.googleapis.com/v3/{+name}:getVerificationCode",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"],
     :body GetNotificationChannelVerificationCodeRequest}))

(defn projects-notificationChannels-verify
  "Verifies a NotificationChannel by proving receipt of the code delivered to the channel as a result of calling SendNotificationChannelVerificationCode.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/notificationChannels/verify

name <> 
VerifyNotificationChannelRequest:
VerifyNotificationChannelRequest"
  [name VerifyNotificationChannelRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://monitoring.googleapis.com/v3/{+name}:verify",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"],
     :body VerifyNotificationChannelRequest}))

(defn projects-alertPolicies-list
  "Lists the existing alerting policies for the workspace.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/alertPolicies/list

name <> 

optional:
filter <string> If provided, this field specifies the criteria that must be met by alert policies to be included in the response.For more details, see sorting and filtering (https://cloud.google.com/monitoring/api/v3/sorting-and-filtering).
orderBy <string> A comma-separated list of fields by which to sort the result. Supports the same set of field references as the filter field. Entries can be prefixed with a minus sign to sort by the field in descending order.For more details, see sorting and filtering (https://cloud.google.com/monitoring/api/v3/sorting-and-filtering).
pageSize <integer> The maximum number of results to return in a single response."
  ([name] (projects-alertPolicies-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+name}/alertPolicies",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"]})))

(defn projects-alertPolicies-get
  "Gets a single alerting policy.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/alertPolicies/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://monitoring.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.read"]}))

(defn projects-alertPolicies-create
  "Creates a new alerting policy.Design your application to single-thread API calls that modify the state of alerting policies in a single project. This includes calls to CreateAlertPolicy, DeleteAlertPolicy and UpdateAlertPolicy.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/alertPolicies/create

name <> 
AlertPolicy:
AlertPolicy"
  [name AlertPolicy]
  (client/api-request
    {:method :post,
     :uri-template
     "https://monitoring.googleapis.com/v3/{+name}/alertPolicies",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"],
     :body AlertPolicy}))

(defn projects-alertPolicies-delete
  "Deletes an alerting policy.Design your application to single-thread API calls that modify the state of alerting policies in a single project. This includes calls to CreateAlertPolicy, DeleteAlertPolicy and UpdateAlertPolicy.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/alertPolicies/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://monitoring.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"]}))

(defn projects-alertPolicies-patch
  "Updates an alerting policy. You can either replace the entire policy with a new one or replace only certain fields in the current alerting policy by specifying the fields to be updated via updateMask. Returns the updated alerting policy.Design your application to single-thread API calls that modify the state of alerting policies in a single project. This includes calls to CreateAlertPolicy, DeleteAlertPolicy and UpdateAlertPolicy.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/alertPolicies/patch

name <> 
AlertPolicy:
AlertPolicy

optional:
updateMask <string> Optional. A list of alerting policy field names. If this field is not empty, each listed field in the existing alerting policy is set to the value of the corresponding field in the supplied policy (alert_policy), or to the field's default value if the field is not in the supplied alerting policy. Fields not listed retain their previous value.Examples of valid field masks include display_name, documentation, documentation.content, documentation.mime_type, user_labels, user_label.nameofkey, enabled, conditions, combiner, etc.If this field is empty, then the supplied alerting policy replaces the existing policy. It is the same as deleting the existing policy and adding the supplied policy, except for the following: The new policy will have the same [ALERT_POLICY_ID] as the former policy. This gives you continuity with the former policy in your notifications and incidents. Conditions in the new policy will keep their former [CONDITION_ID] if the supplied condition includes the name field with that [CONDITION_ID]. If the supplied condition omits the name field, then a new [CONDITION_ID] is created."
  ([name AlertPolicy]
    (projects-alertPolicies-patch name AlertPolicy nil))
  ([name AlertPolicy optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://monitoring.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"],
       :body AlertPolicy})))

(defn projects-notificationChannelDescriptors-list
  "Lists the descriptors for supported channel types. The use of descriptors makes it possible for new channel types to be dynamically added.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/notificationChannelDescriptors/list

name <> 

optional:
pageSize <integer> The maximum number of results to return in a single response. If not set to a positive number, a reasonable value will be chosen by the service."
  ([name] (projects-notificationChannelDescriptors-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+name}/notificationChannelDescriptors",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"]})))

(defn projects-notificationChannelDescriptors-get
  "Gets a single channel descriptor. The descriptor indicates which fields are expected / permitted for a notification channel of the given type.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/notificationChannelDescriptors/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://monitoring.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.read"]}))

(defn projects-uptimeCheckConfigs-list
  "Lists the existing valid Uptime check configurations for the project (leaving out any invalid configurations).
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/uptimeCheckConfigs/list

parent <> 

optional:
filter <string> If provided, this field specifies the criteria that must be met by uptime checks to be included in the response.For more details, see Filtering syntax (https://cloud.google.com/monitoring/api/v3/sorting-and-filtering#filter_syntax).
pageSize <integer> The maximum number of results to return in a single response. The server may further constrain the maximum number of results returned in a single page. If the page_size is <=0, the server will decide the number of results to be returned."
  ([parent] (projects-uptimeCheckConfigs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+parent}/uptimeCheckConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"]})))

(defn projects-uptimeCheckConfigs-get
  "Gets a single Uptime check configuration.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/uptimeCheckConfigs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://monitoring.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.read"]}))

(defn projects-uptimeCheckConfigs-create
  "Creates a new Uptime check configuration.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/uptimeCheckConfigs/create

parent <> 
UptimeCheckConfig:
UptimeCheckConfig"
  [parent UptimeCheckConfig]
  (client/api-request
    {:method :post,
     :uri-template
     "https://monitoring.googleapis.com/v3/{+parent}/uptimeCheckConfigs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"],
     :body UptimeCheckConfig}))

(defn projects-uptimeCheckConfigs-patch
  "Updates an Uptime check configuration. You can either replace the entire configuration with a new one or replace only certain fields in the current configuration by specifying the fields to be updated via updateMask. Returns the updated configuration.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/uptimeCheckConfigs/patch

name <> 
UptimeCheckConfig:
UptimeCheckConfig

optional:
updateMask <string> Optional. If present, only the listed fields in the current Uptime check configuration are updated with values from the new configuration. If this field is empty, then the current configuration is completely replaced with the new configuration."
  ([name UptimeCheckConfig]
    (projects-uptimeCheckConfigs-patch name UptimeCheckConfig nil))
  ([name UptimeCheckConfig optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://monitoring.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"],
       :body UptimeCheckConfig})))

(defn projects-uptimeCheckConfigs-delete
  "Deletes an Uptime check configuration. Note that this method will fail if the Uptime check configuration is referenced by an alert policy or other dependent configs that would be rendered invalid by the deletion.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/uptimeCheckConfigs/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://monitoring.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"]}))

(defn projects-groups-list
  "Lists the existing groups.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/groups/list

name <> 

optional:
childrenOfGroup <string> A group name. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] Returns groups whose parent_name field contains the group name. If no groups have this parent, the results are empty.
ancestorsOfGroup <string> A group name. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] Returns groups that are ancestors of the specified group. The groups are returned in order, starting with the immediate parent and ending with the most distant ancestor. If the specified group has no immediate parent, the results are empty.
descendantsOfGroup <string> A group name. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] Returns the descendants of the specified group. This is a superset of the results returned by the children_of_group filter, and includes children-of-children, and so forth.
pageSize <integer> A positive number that is the maximum number of results to return."
  ([name] (projects-groups-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+name}/groups",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"]})))

(defn projects-groups-get
  "Gets a single group.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/groups/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://monitoring.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.read"]}))

(defn projects-groups-create
  "Creates a new group.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/groups/create

name <> 
Group:
Group

optional:
validateOnly <boolean> If true, validate this request but do not create the group."
  ([name Group] (projects-groups-create name Group nil))
  ([name Group optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+name}/groups",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"],
       :body Group})))

(defn projects-groups-update
  "Updates an existing group. You can change any group attributes except name.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/groups/update

name <> 
Group:
Group

optional:
validateOnly <boolean> If true, validate this request but do not update the existing group."
  ([name Group] (projects-groups-update name Group nil))
  ([name Group optional]
    (client/api-request
      {:method :put,
       :uri-template "https://monitoring.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"],
       :body Group})))

(defn projects-groups-delete
  "Deletes an existing group.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/groups/delete

name <> 

optional:
recursive <boolean> If this field is true, then the request means to delete a group with all its descendants. Otherwise, the request means to delete a group only when it has no descendants. The default value is false."
  ([name] (projects-groups-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://monitoring.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"]})))

(defn projects-groups-members-list
  "Lists the monitored resources that are members of a group.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/projects/groups/members/list

name <> 

optional:
pageSize <integer> A positive number that is the maximum number of results to return.
filter <string> An optional list filter (https://cloud.google.com/monitoring/api/learn_more#filtering) describing the members to be returned. The filter may reference the type, labels, and metadata of monitored resources that comprise the group. For example, to return only resources representing Compute Engine VM instances, use this filter: `resource.type = \"gce_instance\"` 
interval.endTime <string> Required. The end of the time interval.
interval.startTime <string> Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time."
  ([name] (projects-groups-members-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+name}/members",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"]})))

(defn organizations-timeSeries-list
  "Lists time series that match a filter.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/organizations/timeSeries/list

name <> 

optional:
interval.startTime <string> Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time.
aggregation.alignmentPeriod <string> The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 104 weeks (2 years) for charts, and 90,000 seconds (25 hours) for alerting policies.
pageSize <integer> A positive number that is the maximum number of results to return. If page_size is empty or more than 100,000 results, the effective page_size is 100,000 results. If view is set to FULL, this is the maximum number of Points returned. If view is set to HEADERS, this is the maximum number of TimeSeries returned.
interval.endTime <string> Required. The end of the time interval.
orderBy <string> Unsupported: must be left blank. The points in each time series are currently returned in reverse time order (most recent to oldest).
secondaryAggregation.crossSeriesReducer <string> The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period must also be specified; otherwise, an error is returned.
aggregation.perSeriesAligner <string> An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
filter <string> Required. A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) that specifies which time series should be returned. The filter must specify a single metric type, and can additionally specify metric labels and other information. For example: metric.type = \"compute.googleapis.com/instance/cpu/usage_time\" AND metric.labels.instance_name = \"my-instance-name\" 
secondaryAggregation.groupByFields <string> The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset. The cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type. Fields not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If cross_series_reducer is not defined, this field is ignored.
secondaryAggregation.alignmentPeriod <string> The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 104 weeks (2 years) for charts, and 90,000 seconds (25 hours) for alerting policies.
secondaryAggregation.perSeriesAligner <string> An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
aggregation.crossSeriesReducer <string> The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period must also be specified; otherwise, an error is returned.
view <string> Required. Specifies which information is returned about the time series.
aggregation.groupByFields <string> The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset. The cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type. Fields not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If cross_series_reducer is not defined, this field is ignored."
  ([name] (organizations-timeSeries-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+name}/timeSeries",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"]})))

(defn folders-timeSeries-list
  "Lists time series that match a filter.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/folders/timeSeries/list

name <> 

optional:
interval.startTime <string> Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time.
aggregation.alignmentPeriod <string> The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 104 weeks (2 years) for charts, and 90,000 seconds (25 hours) for alerting policies.
pageSize <integer> A positive number that is the maximum number of results to return. If page_size is empty or more than 100,000 results, the effective page_size is 100,000 results. If view is set to FULL, this is the maximum number of Points returned. If view is set to HEADERS, this is the maximum number of TimeSeries returned.
interval.endTime <string> Required. The end of the time interval.
orderBy <string> Unsupported: must be left blank. The points in each time series are currently returned in reverse time order (most recent to oldest).
secondaryAggregation.crossSeriesReducer <string> The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period must also be specified; otherwise, an error is returned.
aggregation.perSeriesAligner <string> An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
filter <string> Required. A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) that specifies which time series should be returned. The filter must specify a single metric type, and can additionally specify metric labels and other information. For example: metric.type = \"compute.googleapis.com/instance/cpu/usage_time\" AND metric.labels.instance_name = \"my-instance-name\" 
secondaryAggregation.groupByFields <string> The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset. The cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type. Fields not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If cross_series_reducer is not defined, this field is ignored.
secondaryAggregation.alignmentPeriod <string> The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 104 weeks (2 years) for charts, and 90,000 seconds (25 hours) for alerting policies.
secondaryAggregation.perSeriesAligner <string> An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
aggregation.crossSeriesReducer <string> The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period must also be specified; otherwise, an error is returned.
view <string> Required. Specifies which information is returned about the time series.
aggregation.groupByFields <string> The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset. The cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type. Fields not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If cross_series_reducer is not defined, this field is ignored."
  ([name] (folders-timeSeries-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+name}/timeSeries",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"]})))

(defn services-create
  "Create a Service.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/services/create

parent <> 
Service:
Service

optional:
serviceId <string> Optional. The Service id to use for this Service. If omitted, an id will be generated instead. Must match the pattern [a-z0-9\\-]+"
  ([parent Service] (services-create parent Service nil))
  ([parent Service optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+parent}/services",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"],
       :body Service})))

(defn services-get
  "Get the named Service.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/services/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://monitoring.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.read"]}))

(defn services-list
  "List Services for this Metrics Scope.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/services/list

parent <> 

optional:
filter <string> A filter specifying what Services to return. The filter supports filtering on a particular service-identifier type or one of its attributes.To filter on a particular service-identifier type, the identifier_case refers to which option in the identifier field is populated. For example, the filter identifier_case = \"CUSTOM\" would match all services with a value for the custom field. Valid options include \"CUSTOM\", \"APP_ENGINE\", \"MESH_ISTIO\", and the other options listed at https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services#ServiceTo filter on an attribute of a service-identifier type, apply the filter name by using the snake case of the service-identifier type and the attribute of that service-identifier type, and join the two with a period. For example, to filter by the meshUid field of the MeshIstio service-identifier type, you must filter on mesh_istio.mesh_uid = \"123\" to match all services with mesh UID \"123\". Service-identifier types and their attributes are described at https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services#Service
pageSize <integer> A non-negative number that is the maximum number of results to return. When 0, use default page size."
  ([parent] (services-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+parent}/services",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"]})))

(defn services-patch
  "Update this Service.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/services/patch

name <> 
Service:
Service

optional:
updateMask <string> A set of field paths defining which fields to use for the update."
  ([name Service] (services-patch name Service nil))
  ([name Service optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://monitoring.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"],
       :body Service})))

(defn services-delete
  "Soft delete this Service.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/services/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://monitoring.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"]}))

(defn services-serviceLevelObjectives-create
  "Create a ServiceLevelObjective for the given Service.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/services/serviceLevelObjectives/create

parent <> 
ServiceLevelObjective:
ServiceLevelObjective

optional:
serviceLevelObjectiveId <string> Optional. The ServiceLevelObjective id to use for this ServiceLevelObjective. If omitted, an id will be generated instead. Must match the pattern ^[a-zA-Z0-9-_:.]+$"
  ([parent ServiceLevelObjective]
    (services-serviceLevelObjectives-create
      parent
      ServiceLevelObjective
      nil))
  ([parent ServiceLevelObjective optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+parent}/serviceLevelObjectives",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"],
       :body ServiceLevelObjective})))

(defn services-serviceLevelObjectives-get
  "Get a ServiceLevelObjective by name.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/services/serviceLevelObjectives/get

name <> 

optional:
view <string> View of the ServiceLevelObjective to return. If DEFAULT, return the ServiceLevelObjective as originally defined. If EXPLICIT and the ServiceLevelObjective is defined in terms of a BasicSli, replace the BasicSli with a RequestBasedSli spelling out how the SLI is computed."
  ([name] (services-serviceLevelObjectives-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://monitoring.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"]})))

(defn services-serviceLevelObjectives-list
  "List the ServiceLevelObjectives for the given Service.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/services/serviceLevelObjectives/list

parent <> 

optional:
filter <string> A filter specifying what ServiceLevelObjectives to return.
pageSize <integer> A non-negative number that is the maximum number of results to return. When 0, use default page size.
view <string> View of the ServiceLevelObjectives to return. If DEFAULT, return each ServiceLevelObjective as originally defined. If EXPLICIT and the ServiceLevelObjective is defined in terms of a BasicSli, replace the BasicSli with a RequestBasedSli spelling out how the SLI is computed."
  ([parent] (services-serviceLevelObjectives-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/{+parent}/serviceLevelObjectives",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"]})))

(defn services-serviceLevelObjectives-patch
  "Update the given ServiceLevelObjective.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/services/serviceLevelObjectives/patch

name <> 
ServiceLevelObjective:
ServiceLevelObjective

optional:
updateMask <string> A set of field paths defining which fields to use for the update."
  ([name ServiceLevelObjective]
    (services-serviceLevelObjectives-patch
      name
      ServiceLevelObjective
      nil))
  ([name ServiceLevelObjective optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://monitoring.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"],
       :body ServiceLevelObjective})))

(defn services-serviceLevelObjectives-delete
  "Delete the given ServiceLevelObjective.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/services/serviceLevelObjectives/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://monitoring.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"]}))

(defn uptimeCheckIps-list
  "Returns the list of IP addresses that checkers run from.
https://cloud.google.com/monitoring/api/v3/v3/reference/rest/v3/uptimeCheckIps/list

optional:
pageSize <integer> The maximum number of results to return in a single response. The server may further constrain the maximum number of results returned in a single page. If the page_size is <=0, the server will decide the number of results to be returned. NOTE: this field is not yet implemented"
  ([] (uptimeCheckIps-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://monitoring.googleapis.com/v3/uptimeCheckIps",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/monitoring"
        "https://www.googleapis.com/auth/monitoring.read"]})))
