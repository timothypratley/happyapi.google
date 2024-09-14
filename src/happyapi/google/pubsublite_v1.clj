(ns happyapi.google.pubsublite-v1
  "Pub/Sub Lite API

See: https://cloud.google.com/pubsub/lite/docs")

(defn admin-projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (admin-projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://pubsublite.googleapis.com/v1/admin/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn admin-projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://pubsublite.googleapis.com/v1/admin/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn admin-projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://pubsublite.googleapis.com/v1/admin/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn admin-projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  {:method :post,
   :uri-template
   "https://pubsublite.googleapis.com/v1/admin/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CancelOperationRequest})

(defn admin-projects-locations-topics-create
  "Creates a new topic.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/topics/create

parent <> 
Topic:
Topic

optional:
topicId <string> Required. The ID to use for the topic, which will become the final component of the topic's name. This value is structured like: `my-topic-name`."
  ([parent Topic]
    (admin-projects-locations-topics-create parent Topic nil))
  ([parent Topic optional]
    {:method :post,
     :uri-template
     "https://pubsublite.googleapis.com/v1/admin/{+parent}/topics",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Topic}))

(defn admin-projects-locations-topics-get
  "Returns the topic configuration.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/topics/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://pubsublite.googleapis.com/v1/admin/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn admin-projects-locations-topics-getPartitions
  "Returns the partition information for the requested topic.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/topics/getPartitions

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://pubsublite.googleapis.com/v1/admin/{+name}/partitions",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn admin-projects-locations-topics-list
  "Returns the list of topics for the given project.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/topics/list

parent <> 

optional:
pageSize <integer> The maximum number of topics to return. The service may return fewer than this value. If unset or zero, all topics for the parent will be returned."
  ([parent] (admin-projects-locations-topics-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://pubsublite.googleapis.com/v1/admin/{+parent}/topics",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn admin-projects-locations-topics-patch
  "Updates properties of the specified topic.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/topics/patch

name <> 
Topic:
Topic

optional:
updateMask <string> Required. A mask specifying the topic fields to change."
  ([name Topic] (admin-projects-locations-topics-patch name Topic nil))
  ([name Topic optional]
    {:method :patch,
     :uri-template
     "https://pubsublite.googleapis.com/v1/admin/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Topic}))

(defn admin-projects-locations-topics-delete
  "Deletes the specified topic.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/topics/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://pubsublite.googleapis.com/v1/admin/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn admin-projects-locations-topics-subscriptions-list
  "Lists the subscriptions attached to the specified topic.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/topics/subscriptions/list

name <> 

optional:
pageSize <integer> The maximum number of subscriptions to return. The service may return fewer than this value. If unset or zero, all subscriptions for the given topic will be returned."
  ([name]
    (admin-projects-locations-topics-subscriptions-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://pubsublite.googleapis.com/v1/admin/{+name}/subscriptions",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn admin-projects-locations-subscriptions-create
  "Creates a new subscription.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/subscriptions/create

parent <> 
Subscription:
Subscription

optional:
subscriptionId <string> Required. The ID to use for the subscription, which will become the final component of the subscription's name. This value is structured like: `my-sub-name`.
skipBacklog <boolean> If true, the newly created subscription will only receive messages published after the subscription was created. Otherwise, the entire message backlog will be received on the subscription. Defaults to false."
  ([parent Subscription]
    (admin-projects-locations-subscriptions-create
      parent
      Subscription
      nil))
  ([parent Subscription optional]
    {:method :post,
     :uri-template
     "https://pubsublite.googleapis.com/v1/admin/{+parent}/subscriptions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Subscription}))

(defn admin-projects-locations-subscriptions-get
  "Returns the subscription configuration.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/subscriptions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://pubsublite.googleapis.com/v1/admin/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn admin-projects-locations-subscriptions-list
  "Returns the list of subscriptions for the given project.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/subscriptions/list

parent <> 

optional:
pageSize <integer> The maximum number of subscriptions to return. The service may return fewer than this value. If unset or zero, all subscriptions for the parent will be returned."
  ([parent] (admin-projects-locations-subscriptions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://pubsublite.googleapis.com/v1/admin/{+parent}/subscriptions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn admin-projects-locations-subscriptions-patch
  "Updates properties of the specified subscription.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/subscriptions/patch

name <> 
Subscription:
Subscription

optional:
updateMask <string> Required. A mask specifying the subscription fields to change."
  ([name Subscription]
    (admin-projects-locations-subscriptions-patch
      name
      Subscription
      nil))
  ([name Subscription optional]
    {:method :patch,
     :uri-template
     "https://pubsublite.googleapis.com/v1/admin/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Subscription}))

(defn admin-projects-locations-subscriptions-delete
  "Deletes the specified subscription.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/subscriptions/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://pubsublite.googleapis.com/v1/admin/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn admin-projects-locations-subscriptions-seek
  "Performs an out-of-band seek for a subscription to a specified target, which may be timestamps or named positions within the message backlog. Seek translates these targets to cursors for each partition and orchestrates subscribers to start consuming messages from these seek cursors. If an operation is returned, the seek has been registered and subscribers will eventually receive messages from the seek cursors (i.e. eventual consistency), as long as they are using a minimum supported client library version and not a system that tracks cursors independently of Pub/Sub Lite (e.g. Apache Beam, Dataflow, Spark). The seek operation will fail for unsupported clients. If clients would like to know when subscribers react to the seek (or not), they can poll the operation. The seek operation will succeed and complete once subscribers are ready to receive messages from the seek cursors for all partitions of the topic. This means that the seek operation will not complete until all subscribers come online. If the previous seek operation has not yet completed, it will be aborted and the new invocation of seek will supersede it.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/subscriptions/seek

name <> 
SeekSubscriptionRequest:
SeekSubscriptionRequest"
  [name SeekSubscriptionRequest]
  {:method :post,
   :uri-template
   "https://pubsublite.googleapis.com/v1/admin/{+name}:seek",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SeekSubscriptionRequest})

(defn admin-projects-locations-reservations-create
  "Creates a new reservation.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/reservations/create

parent <> 
Reservation:
Reservation

optional:
reservationId <string> Required. The ID to use for the reservation, which will become the final component of the reservation's name. This value is structured like: `my-reservation-name`."
  ([parent Reservation]
    (admin-projects-locations-reservations-create
      parent
      Reservation
      nil))
  ([parent Reservation optional]
    {:method :post,
     :uri-template
     "https://pubsublite.googleapis.com/v1/admin/{+parent}/reservations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Reservation}))

(defn admin-projects-locations-reservations-get
  "Returns the reservation configuration.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/reservations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://pubsublite.googleapis.com/v1/admin/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn admin-projects-locations-reservations-list
  "Returns the list of reservations for the given project.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/reservations/list

parent <> 

optional:
pageSize <integer> The maximum number of reservations to return. The service may return fewer than this value. If unset or zero, all reservations for the parent will be returned."
  ([parent] (admin-projects-locations-reservations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://pubsublite.googleapis.com/v1/admin/{+parent}/reservations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn admin-projects-locations-reservations-patch
  "Updates properties of the specified reservation.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/reservations/patch

name <> 
Reservation:
Reservation

optional:
updateMask <string> Required. A mask specifying the reservation fields to change."
  ([name Reservation]
    (admin-projects-locations-reservations-patch name Reservation nil))
  ([name Reservation optional]
    {:method :patch,
     :uri-template
     "https://pubsublite.googleapis.com/v1/admin/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Reservation}))

(defn admin-projects-locations-reservations-delete
  "Deletes the specified reservation.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/reservations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://pubsublite.googleapis.com/v1/admin/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn admin-projects-locations-reservations-topics-list
  "Lists the topics attached to the specified reservation.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/admin/projects/locations/reservations/topics/list

name <> 

optional:
pageSize <integer> The maximum number of topics to return. The service may return fewer than this value. If unset or zero, all topics for the given reservation will be returned."
  ([name] (admin-projects-locations-reservations-topics-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://pubsublite.googleapis.com/v1/admin/{+name}/topics",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn cursor-projects-locations-subscriptions-commitCursor
  "Updates the committed cursor.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/cursor/projects/locations/subscriptions/commitCursor

subscription <> 
CommitCursorRequest:
CommitCursorRequest"
  [subscription CommitCursorRequest]
  {:method :post,
   :uri-template
   "https://pubsublite.googleapis.com/v1/cursor/{+subscription}:commitCursor",
   :uri-template-args {"subscription" subscription},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CommitCursorRequest})

(defn cursor-projects-locations-subscriptions-cursors-list
  "Returns all committed cursor information for a subscription.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/cursor/projects/locations/subscriptions/cursors/list

parent <> 

optional:
pageSize <integer> The maximum number of cursors to return. The service may return fewer than this value. If unset or zero, all cursors for the parent will be returned."
  ([parent]
    (cursor-projects-locations-subscriptions-cursors-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://pubsublite.googleapis.com/v1/cursor/{+parent}/cursors",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn topicStats-projects-locations-topics-computeMessageStats
  "Compute statistics about a range of messages in a given topic and partition.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/topicStats/projects/locations/topics/computeMessageStats

topic <> 
ComputeMessageStatsRequest:
ComputeMessageStatsRequest"
  [topic ComputeMessageStatsRequest]
  {:method :post,
   :uri-template
   "https://pubsublite.googleapis.com/v1/topicStats/{+topic}:computeMessageStats",
   :uri-template-args {"topic" topic},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ComputeMessageStatsRequest})

(defn topicStats-projects-locations-topics-computeHeadCursor
  "Compute the head cursor for the partition. The head cursor's offset is guaranteed to be less than or equal to all messages which have not yet been acknowledged as published, and greater than the offset of any message whose publish has already been acknowledged. It is zero if there have never been messages in the partition.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/topicStats/projects/locations/topics/computeHeadCursor

topic <> 
ComputeHeadCursorRequest:
ComputeHeadCursorRequest"
  [topic ComputeHeadCursorRequest]
  {:method :post,
   :uri-template
   "https://pubsublite.googleapis.com/v1/topicStats/{+topic}:computeHeadCursor",
   :uri-template-args {"topic" topic},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ComputeHeadCursorRequest})

(defn topicStats-projects-locations-topics-computeTimeCursor
  "Compute the corresponding cursor for a publish or event time in a topic partition.
https://cloud.google.com/pubsub/lite/docs/v1/reference/rest/v1/topicStats/projects/locations/topics/computeTimeCursor

topic <> 
ComputeTimeCursorRequest:
ComputeTimeCursorRequest"
  [topic ComputeTimeCursorRequest]
  {:method :post,
   :uri-template
   "https://pubsublite.googleapis.com/v1/topicStats/{+topic}:computeTimeCursor",
   :uri-template-args {"topic" topic},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ComputeTimeCursorRequest})
