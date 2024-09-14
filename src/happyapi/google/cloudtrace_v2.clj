(ns happyapi.google.cloudtrace-v2
  "Cloud Trace API
Sends application trace data to Cloud Trace for viewing. Trace data is collected for all App Engine applications by default. Trace data from other applications can be provided using this API. This library is used to interact with the Cloud Trace API directly. If you are looking to instrument your application for Cloud Trace, we recommend using OpenTelemetry. 
See: https://cloud.google.com/trace")

(defn projects-traces-batchWrite
  "Batch writes new spans to new or existing traces. You cannot update existing spans.
https://cloud.google.com/trace/v2/reference/rest/v2/projects/traces/batchWrite

name <> 
BatchWriteSpansRequest:
BatchWriteSpansRequest"
  [name BatchWriteSpansRequest]
  {:method :post,
   :uri-template
   "https://cloudtrace.googleapis.com/v2/{+name}/traces:batchWrite",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/trace.append"],
   :body BatchWriteSpansRequest})

(defn projects-traces-spans-createSpan
  "Creates a new span.
https://cloud.google.com/trace/v2/reference/rest/v2/projects/traces/spans/createSpan

name <> 
Span:
Span"
  [name Span]
  {:method :post,
   :uri-template "https://cloudtrace.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/trace.append"],
   :body Span})
