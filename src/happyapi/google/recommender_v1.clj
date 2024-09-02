(ns happyapi.google.recommender-v1
  "Recommender API

See: https://cloud.google.com/recommender/docs/"
  (:require [happyapi.providers.google :as client]))

(defn folders-locations-insightTypes-insights-markAccepted
  "Marks the Insight State as Accepted. Users can use this method to indicate to the Recommender API that they have applied some action based on the insight. This stops the insight content from being updated. MarkInsightAccepted can be applied to insights in ACTIVE state. Requires the recommender.*.update IAM permission for the specified insight.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/folders/locations/insightTypes/insights/markAccepted

name <> 
GoogleCloudRecommenderV1MarkInsightAcceptedRequest:
GoogleCloudRecommenderV1MarkInsightAcceptedRequest"
  [name GoogleCloudRecommenderV1MarkInsightAcceptedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markAccepted",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkInsightAcceptedRequest}))

(defn folders-locations-insightTypes-insights-list
  "Lists insights for the specified Cloud Resource. Requires the recommender.*.list IAM permission for the specified insight type.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/folders/locations/insightTypes/insights/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. If not specified, the server will determine the number of results to return.
filter <string> Optional. Filter expression to restrict the insights returned. Supported filter fields: * `stateInfo.state` * `insightSubtype` * `severity` * `targetResources` Examples: * `stateInfo.state = ACTIVE OR stateInfo.state = DISMISSED` * `insightSubtype = PERMISSIONS_USAGE` * `severity = CRITICAL OR severity = HIGH` * `targetResources : //compute.googleapis.com/projects/1234/zones/us-central1-a/instances/instance-1` * `stateInfo.state = ACTIVE AND (severity = CRITICAL OR severity = HIGH)` The max allowed filter length is 500 characters. (These expressions are based on the filter language described at https://google.aip.dev/160)"
  ([parent] (folders-locations-insightTypes-insights-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://recommender.googleapis.com/v1/{+parent}/insights",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-locations-insightTypes-insights-get
  "Gets the requested insight. Requires the recommender.*.get IAM permission for the specified insight type.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/folders/locations/insightTypes/insights/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://recommender.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-locations-recommenders-recommendations-get
  "Gets the requested recommendation. Requires the recommender.*.get IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/folders/locations/recommenders/recommendations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://recommender.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-locations-recommenders-recommendations-markSucceeded
  "Marks the Recommendation State as Succeeded. Users can use this method to indicate to the Recommender API that they have applied the recommendation themselves, and the operation was successful. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationSucceeded can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or FAILED state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/folders/locations/recommenders/recommendations/markSucceeded

name <> 
GoogleCloudRecommenderV1MarkRecommendationSucceededRequest:
GoogleCloudRecommenderV1MarkRecommendationSucceededRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationSucceededRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markSucceeded",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationSucceededRequest}))

(defn folders-locations-recommenders-recommendations-markDismissed
  "Mark the Recommendation State as Dismissed. Users can use this method to indicate to the Recommender API that an ACTIVE recommendation has to be marked back as DISMISSED. MarkRecommendationDismissed can be applied to recommendations in ACTIVE state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/folders/locations/recommenders/recommendations/markDismissed

name <> 
GoogleCloudRecommenderV1MarkRecommendationDismissedRequest:
GoogleCloudRecommenderV1MarkRecommendationDismissedRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationDismissedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markDismissed",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationDismissedRequest}))

(defn folders-locations-recommenders-recommendations-list
  "Lists recommendations for the specified Cloud Resource. Requires the recommender.*.list IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/folders/locations/recommenders/recommendations/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. If not specified, the server will determine the number of results to return.
filter <string> Filter expression to restrict the recommendations returned. Supported filter fields: * `state_info.state` * `recommenderSubtype` * `priority` * `targetResources` Examples: * `stateInfo.state = ACTIVE OR stateInfo.state = DISMISSED` * `recommenderSubtype = REMOVE_ROLE OR recommenderSubtype = REPLACE_ROLE` * `priority = P1 OR priority = P2` * `targetResources : //compute.googleapis.com/projects/1234/zones/us-central1-a/instances/instance-1` * `stateInfo.state = ACTIVE AND (priority = P1 OR priority = P2)` The max allowed filter length is 500 characters. (These expressions are based on the filter language described at https://google.aip.dev/160)"
  ([parent]
    (folders-locations-recommenders-recommendations-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://recommender.googleapis.com/v1/{+parent}/recommendations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-locations-recommenders-recommendations-markClaimed
  "Marks the Recommendation State as Claimed. Users can use this method to indicate to the Recommender API that they are starting to apply the recommendation themselves. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationClaimed can be applied to recommendations in CLAIMED, SUCCEEDED, FAILED, or ACTIVE state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/folders/locations/recommenders/recommendations/markClaimed

name <> 
GoogleCloudRecommenderV1MarkRecommendationClaimedRequest:
GoogleCloudRecommenderV1MarkRecommendationClaimedRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationClaimedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markClaimed",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationClaimedRequest}))

(defn folders-locations-recommenders-recommendations-markFailed
  "Marks the Recommendation State as Failed. Users can use this method to indicate to the Recommender API that they have applied the recommendation themselves, and the operation failed. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationFailed can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or FAILED state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/folders/locations/recommenders/recommendations/markFailed

name <> 
GoogleCloudRecommenderV1MarkRecommendationFailedRequest:
GoogleCloudRecommenderV1MarkRecommendationFailedRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationFailedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markFailed",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationFailedRequest}))

(defn billingAccounts-locations-insightTypes-getConfig
  "Gets the requested InsightTypeConfig. There is only one instance of the config for each InsightType.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/billingAccounts/locations/insightTypes/getConfig

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://recommender.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn billingAccounts-locations-insightTypes-updateConfig
  "Updates an InsightTypeConfig change. This will create a new revision of the config.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/billingAccounts/locations/insightTypes/updateConfig

name <> 
GoogleCloudRecommenderV1InsightTypeConfig:
GoogleCloudRecommenderV1InsightTypeConfig

optional:
updateMask <string> The list of fields to be updated.
validateOnly <boolean> If true, validate the request and preview the change, but do not actually update it."
  ([name GoogleCloudRecommenderV1InsightTypeConfig]
    (billingAccounts-locations-insightTypes-updateConfig
      name
      GoogleCloudRecommenderV1InsightTypeConfig
      nil))
  ([name GoogleCloudRecommenderV1InsightTypeConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://recommender.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudRecommenderV1InsightTypeConfig})))

(defn billingAccounts-locations-insightTypes-insights-get
  "Gets the requested insight. Requires the recommender.*.get IAM permission for the specified insight type.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/billingAccounts/locations/insightTypes/insights/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://recommender.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn billingAccounts-locations-insightTypes-insights-markAccepted
  "Marks the Insight State as Accepted. Users can use this method to indicate to the Recommender API that they have applied some action based on the insight. This stops the insight content from being updated. MarkInsightAccepted can be applied to insights in ACTIVE state. Requires the recommender.*.update IAM permission for the specified insight.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/billingAccounts/locations/insightTypes/insights/markAccepted

name <> 
GoogleCloudRecommenderV1MarkInsightAcceptedRequest:
GoogleCloudRecommenderV1MarkInsightAcceptedRequest"
  [name GoogleCloudRecommenderV1MarkInsightAcceptedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markAccepted",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkInsightAcceptedRequest}))

(defn billingAccounts-locations-insightTypes-insights-list
  "Lists insights for the specified Cloud Resource. Requires the recommender.*.list IAM permission for the specified insight type.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/billingAccounts/locations/insightTypes/insights/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. If not specified, the server will determine the number of results to return.
filter <string> Optional. Filter expression to restrict the insights returned. Supported filter fields: * `stateInfo.state` * `insightSubtype` * `severity` * `targetResources` Examples: * `stateInfo.state = ACTIVE OR stateInfo.state = DISMISSED` * `insightSubtype = PERMISSIONS_USAGE` * `severity = CRITICAL OR severity = HIGH` * `targetResources : //compute.googleapis.com/projects/1234/zones/us-central1-a/instances/instance-1` * `stateInfo.state = ACTIVE AND (severity = CRITICAL OR severity = HIGH)` The max allowed filter length is 500 characters. (These expressions are based on the filter language described at https://google.aip.dev/160)"
  ([parent]
    (billingAccounts-locations-insightTypes-insights-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://recommender.googleapis.com/v1/{+parent}/insights",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn billingAccounts-locations-recommenders-getConfig
  "Gets the requested Recommender Config. There is only one instance of the config for each Recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/billingAccounts/locations/recommenders/getConfig

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://recommender.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn billingAccounts-locations-recommenders-updateConfig
  "Updates a Recommender Config. This will create a new revision of the config.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/billingAccounts/locations/recommenders/updateConfig

name <> 
GoogleCloudRecommenderV1RecommenderConfig:
GoogleCloudRecommenderV1RecommenderConfig

optional:
validateOnly <boolean> If true, validate the request and preview the change, but do not actually update it.
updateMask <string> The list of fields to be updated."
  ([name GoogleCloudRecommenderV1RecommenderConfig]
    (billingAccounts-locations-recommenders-updateConfig
      name
      GoogleCloudRecommenderV1RecommenderConfig
      nil))
  ([name GoogleCloudRecommenderV1RecommenderConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://recommender.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudRecommenderV1RecommenderConfig})))

(defn billingAccounts-locations-recommenders-recommendations-markClaimed
  "Marks the Recommendation State as Claimed. Users can use this method to indicate to the Recommender API that they are starting to apply the recommendation themselves. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationClaimed can be applied to recommendations in CLAIMED, SUCCEEDED, FAILED, or ACTIVE state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/billingAccounts/locations/recommenders/recommendations/markClaimed

name <> 
GoogleCloudRecommenderV1MarkRecommendationClaimedRequest:
GoogleCloudRecommenderV1MarkRecommendationClaimedRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationClaimedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markClaimed",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationClaimedRequest}))

(defn billingAccounts-locations-recommenders-recommendations-markFailed
  "Marks the Recommendation State as Failed. Users can use this method to indicate to the Recommender API that they have applied the recommendation themselves, and the operation failed. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationFailed can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or FAILED state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/billingAccounts/locations/recommenders/recommendations/markFailed

name <> 
GoogleCloudRecommenderV1MarkRecommendationFailedRequest:
GoogleCloudRecommenderV1MarkRecommendationFailedRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationFailedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markFailed",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationFailedRequest}))

(defn billingAccounts-locations-recommenders-recommendations-markSucceeded
  "Marks the Recommendation State as Succeeded. Users can use this method to indicate to the Recommender API that they have applied the recommendation themselves, and the operation was successful. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationSucceeded can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or FAILED state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/billingAccounts/locations/recommenders/recommendations/markSucceeded

name <> 
GoogleCloudRecommenderV1MarkRecommendationSucceededRequest:
GoogleCloudRecommenderV1MarkRecommendationSucceededRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationSucceededRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markSucceeded",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationSucceededRequest}))

(defn billingAccounts-locations-recommenders-recommendations-markDismissed
  "Mark the Recommendation State as Dismissed. Users can use this method to indicate to the Recommender API that an ACTIVE recommendation has to be marked back as DISMISSED. MarkRecommendationDismissed can be applied to recommendations in ACTIVE state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/billingAccounts/locations/recommenders/recommendations/markDismissed

name <> 
GoogleCloudRecommenderV1MarkRecommendationDismissedRequest:
GoogleCloudRecommenderV1MarkRecommendationDismissedRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationDismissedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markDismissed",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationDismissedRequest}))

(defn billingAccounts-locations-recommenders-recommendations-get
  "Gets the requested recommendation. Requires the recommender.*.get IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/billingAccounts/locations/recommenders/recommendations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://recommender.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn billingAccounts-locations-recommenders-recommendations-list
  "Lists recommendations for the specified Cloud Resource. Requires the recommender.*.list IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/billingAccounts/locations/recommenders/recommendations/list

parent <> 

optional:
filter <string> Filter expression to restrict the recommendations returned. Supported filter fields: * `state_info.state` * `recommenderSubtype` * `priority` * `targetResources` Examples: * `stateInfo.state = ACTIVE OR stateInfo.state = DISMISSED` * `recommenderSubtype = REMOVE_ROLE OR recommenderSubtype = REPLACE_ROLE` * `priority = P1 OR priority = P2` * `targetResources : //compute.googleapis.com/projects/1234/zones/us-central1-a/instances/instance-1` * `stateInfo.state = ACTIVE AND (priority = P1 OR priority = P2)` The max allowed filter length is 500 characters. (These expressions are based on the filter language described at https://google.aip.dev/160)
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. If not specified, the server will determine the number of results to return."
  ([parent]
    (billingAccounts-locations-recommenders-recommendations-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://recommender.googleapis.com/v1/{+parent}/recommendations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-recommenders-updateConfig
  "Updates a Recommender Config. This will create a new revision of the config.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/projects/locations/recommenders/updateConfig

name <> 
GoogleCloudRecommenderV1RecommenderConfig:
GoogleCloudRecommenderV1RecommenderConfig

optional:
updateMask <string> The list of fields to be updated.
validateOnly <boolean> If true, validate the request and preview the change, but do not actually update it."
  ([name GoogleCloudRecommenderV1RecommenderConfig]
    (projects-locations-recommenders-updateConfig
      name
      GoogleCloudRecommenderV1RecommenderConfig
      nil))
  ([name GoogleCloudRecommenderV1RecommenderConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://recommender.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudRecommenderV1RecommenderConfig})))

(defn projects-locations-recommenders-getConfig
  "Gets the requested Recommender Config. There is only one instance of the config for each Recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/projects/locations/recommenders/getConfig

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://recommender.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-recommenders-recommendations-markFailed
  "Marks the Recommendation State as Failed. Users can use this method to indicate to the Recommender API that they have applied the recommendation themselves, and the operation failed. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationFailed can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or FAILED state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/projects/locations/recommenders/recommendations/markFailed

name <> 
GoogleCloudRecommenderV1MarkRecommendationFailedRequest:
GoogleCloudRecommenderV1MarkRecommendationFailedRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationFailedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markFailed",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationFailedRequest}))

(defn projects-locations-recommenders-recommendations-list
  "Lists recommendations for the specified Cloud Resource. Requires the recommender.*.list IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/projects/locations/recommenders/recommendations/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. If not specified, the server will determine the number of results to return.
filter <string> Filter expression to restrict the recommendations returned. Supported filter fields: * `state_info.state` * `recommenderSubtype` * `priority` * `targetResources` Examples: * `stateInfo.state = ACTIVE OR stateInfo.state = DISMISSED` * `recommenderSubtype = REMOVE_ROLE OR recommenderSubtype = REPLACE_ROLE` * `priority = P1 OR priority = P2` * `targetResources : //compute.googleapis.com/projects/1234/zones/us-central1-a/instances/instance-1` * `stateInfo.state = ACTIVE AND (priority = P1 OR priority = P2)` The max allowed filter length is 500 characters. (These expressions are based on the filter language described at https://google.aip.dev/160)"
  ([parent]
    (projects-locations-recommenders-recommendations-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://recommender.googleapis.com/v1/{+parent}/recommendations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-recommenders-recommendations-get
  "Gets the requested recommendation. Requires the recommender.*.get IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/projects/locations/recommenders/recommendations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://recommender.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-recommenders-recommendations-markClaimed
  "Marks the Recommendation State as Claimed. Users can use this method to indicate to the Recommender API that they are starting to apply the recommendation themselves. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationClaimed can be applied to recommendations in CLAIMED, SUCCEEDED, FAILED, or ACTIVE state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/projects/locations/recommenders/recommendations/markClaimed

name <> 
GoogleCloudRecommenderV1MarkRecommendationClaimedRequest:
GoogleCloudRecommenderV1MarkRecommendationClaimedRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationClaimedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markClaimed",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationClaimedRequest}))

(defn projects-locations-recommenders-recommendations-markDismissed
  "Mark the Recommendation State as Dismissed. Users can use this method to indicate to the Recommender API that an ACTIVE recommendation has to be marked back as DISMISSED. MarkRecommendationDismissed can be applied to recommendations in ACTIVE state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/projects/locations/recommenders/recommendations/markDismissed

name <> 
GoogleCloudRecommenderV1MarkRecommendationDismissedRequest:
GoogleCloudRecommenderV1MarkRecommendationDismissedRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationDismissedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markDismissed",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationDismissedRequest}))

(defn projects-locations-recommenders-recommendations-markSucceeded
  "Marks the Recommendation State as Succeeded. Users can use this method to indicate to the Recommender API that they have applied the recommendation themselves, and the operation was successful. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationSucceeded can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or FAILED state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/projects/locations/recommenders/recommendations/markSucceeded

name <> 
GoogleCloudRecommenderV1MarkRecommendationSucceededRequest:
GoogleCloudRecommenderV1MarkRecommendationSucceededRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationSucceededRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markSucceeded",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationSucceededRequest}))

(defn projects-locations-insightTypes-updateConfig
  "Updates an InsightTypeConfig change. This will create a new revision of the config.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/projects/locations/insightTypes/updateConfig

name <> 
GoogleCloudRecommenderV1InsightTypeConfig:
GoogleCloudRecommenderV1InsightTypeConfig

optional:
validateOnly <boolean> If true, validate the request and preview the change, but do not actually update it.
updateMask <string> The list of fields to be updated."
  ([name GoogleCloudRecommenderV1InsightTypeConfig]
    (projects-locations-insightTypes-updateConfig
      name
      GoogleCloudRecommenderV1InsightTypeConfig
      nil))
  ([name GoogleCloudRecommenderV1InsightTypeConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://recommender.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudRecommenderV1InsightTypeConfig})))

(defn projects-locations-insightTypes-getConfig
  "Gets the requested InsightTypeConfig. There is only one instance of the config for each InsightType.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/projects/locations/insightTypes/getConfig

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://recommender.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-insightTypes-insights-list
  "Lists insights for the specified Cloud Resource. Requires the recommender.*.list IAM permission for the specified insight type.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/projects/locations/insightTypes/insights/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. If not specified, the server will determine the number of results to return.
filter <string> Optional. Filter expression to restrict the insights returned. Supported filter fields: * `stateInfo.state` * `insightSubtype` * `severity` * `targetResources` Examples: * `stateInfo.state = ACTIVE OR stateInfo.state = DISMISSED` * `insightSubtype = PERMISSIONS_USAGE` * `severity = CRITICAL OR severity = HIGH` * `targetResources : //compute.googleapis.com/projects/1234/zones/us-central1-a/instances/instance-1` * `stateInfo.state = ACTIVE AND (severity = CRITICAL OR severity = HIGH)` The max allowed filter length is 500 characters. (These expressions are based on the filter language described at https://google.aip.dev/160)"
  ([parent] (projects-locations-insightTypes-insights-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://recommender.googleapis.com/v1/{+parent}/insights",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-insightTypes-insights-markAccepted
  "Marks the Insight State as Accepted. Users can use this method to indicate to the Recommender API that they have applied some action based on the insight. This stops the insight content from being updated. MarkInsightAccepted can be applied to insights in ACTIVE state. Requires the recommender.*.update IAM permission for the specified insight.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/projects/locations/insightTypes/insights/markAccepted

name <> 
GoogleCloudRecommenderV1MarkInsightAcceptedRequest:
GoogleCloudRecommenderV1MarkInsightAcceptedRequest"
  [name GoogleCloudRecommenderV1MarkInsightAcceptedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markAccepted",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkInsightAcceptedRequest}))

(defn projects-locations-insightTypes-insights-get
  "Gets the requested insight. Requires the recommender.*.get IAM permission for the specified insight type.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/projects/locations/insightTypes/insights/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://recommender.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-insightTypes-updateConfig
  "Updates an InsightTypeConfig change. This will create a new revision of the config.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/organizations/locations/insightTypes/updateConfig

name <> 
GoogleCloudRecommenderV1InsightTypeConfig:
GoogleCloudRecommenderV1InsightTypeConfig

optional:
validateOnly <boolean> If true, validate the request and preview the change, but do not actually update it.
updateMask <string> The list of fields to be updated."
  ([name GoogleCloudRecommenderV1InsightTypeConfig]
    (organizations-locations-insightTypes-updateConfig
      name
      GoogleCloudRecommenderV1InsightTypeConfig
      nil))
  ([name GoogleCloudRecommenderV1InsightTypeConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://recommender.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudRecommenderV1InsightTypeConfig})))

(defn organizations-locations-insightTypes-getConfig
  "Gets the requested InsightTypeConfig. There is only one instance of the config for each InsightType.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/organizations/locations/insightTypes/getConfig

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://recommender.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-insightTypes-insights-get
  "Gets the requested insight. Requires the recommender.*.get IAM permission for the specified insight type.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/organizations/locations/insightTypes/insights/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://recommender.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-insightTypes-insights-markAccepted
  "Marks the Insight State as Accepted. Users can use this method to indicate to the Recommender API that they have applied some action based on the insight. This stops the insight content from being updated. MarkInsightAccepted can be applied to insights in ACTIVE state. Requires the recommender.*.update IAM permission for the specified insight.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/organizations/locations/insightTypes/insights/markAccepted

name <> 
GoogleCloudRecommenderV1MarkInsightAcceptedRequest:
GoogleCloudRecommenderV1MarkInsightAcceptedRequest"
  [name GoogleCloudRecommenderV1MarkInsightAcceptedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markAccepted",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkInsightAcceptedRequest}))

(defn organizations-locations-insightTypes-insights-list
  "Lists insights for the specified Cloud Resource. Requires the recommender.*.list IAM permission for the specified insight type.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/organizations/locations/insightTypes/insights/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. If not specified, the server will determine the number of results to return.
filter <string> Optional. Filter expression to restrict the insights returned. Supported filter fields: * `stateInfo.state` * `insightSubtype` * `severity` * `targetResources` Examples: * `stateInfo.state = ACTIVE OR stateInfo.state = DISMISSED` * `insightSubtype = PERMISSIONS_USAGE` * `severity = CRITICAL OR severity = HIGH` * `targetResources : //compute.googleapis.com/projects/1234/zones/us-central1-a/instances/instance-1` * `stateInfo.state = ACTIVE AND (severity = CRITICAL OR severity = HIGH)` The max allowed filter length is 500 characters. (These expressions are based on the filter language described at https://google.aip.dev/160)"
  ([parent]
    (organizations-locations-insightTypes-insights-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://recommender.googleapis.com/v1/{+parent}/insights",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-recommenders-updateConfig
  "Updates a Recommender Config. This will create a new revision of the config.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/organizations/locations/recommenders/updateConfig

name <> 
GoogleCloudRecommenderV1RecommenderConfig:
GoogleCloudRecommenderV1RecommenderConfig

optional:
updateMask <string> The list of fields to be updated.
validateOnly <boolean> If true, validate the request and preview the change, but do not actually update it."
  ([name GoogleCloudRecommenderV1RecommenderConfig]
    (organizations-locations-recommenders-updateConfig
      name
      GoogleCloudRecommenderV1RecommenderConfig
      nil))
  ([name GoogleCloudRecommenderV1RecommenderConfig optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://recommender.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudRecommenderV1RecommenderConfig})))

(defn organizations-locations-recommenders-getConfig
  "Gets the requested Recommender Config. There is only one instance of the config for each Recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/organizations/locations/recommenders/getConfig

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://recommender.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-recommenders-recommendations-markClaimed
  "Marks the Recommendation State as Claimed. Users can use this method to indicate to the Recommender API that they are starting to apply the recommendation themselves. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationClaimed can be applied to recommendations in CLAIMED, SUCCEEDED, FAILED, or ACTIVE state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/organizations/locations/recommenders/recommendations/markClaimed

name <> 
GoogleCloudRecommenderV1MarkRecommendationClaimedRequest:
GoogleCloudRecommenderV1MarkRecommendationClaimedRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationClaimedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markClaimed",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationClaimedRequest}))

(defn organizations-locations-recommenders-recommendations-markDismissed
  "Mark the Recommendation State as Dismissed. Users can use this method to indicate to the Recommender API that an ACTIVE recommendation has to be marked back as DISMISSED. MarkRecommendationDismissed can be applied to recommendations in ACTIVE state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/organizations/locations/recommenders/recommendations/markDismissed

name <> 
GoogleCloudRecommenderV1MarkRecommendationDismissedRequest:
GoogleCloudRecommenderV1MarkRecommendationDismissedRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationDismissedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markDismissed",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationDismissedRequest}))

(defn organizations-locations-recommenders-recommendations-markSucceeded
  "Marks the Recommendation State as Succeeded. Users can use this method to indicate to the Recommender API that they have applied the recommendation themselves, and the operation was successful. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationSucceeded can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or FAILED state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/organizations/locations/recommenders/recommendations/markSucceeded

name <> 
GoogleCloudRecommenderV1MarkRecommendationSucceededRequest:
GoogleCloudRecommenderV1MarkRecommendationSucceededRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationSucceededRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markSucceeded",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationSucceededRequest}))

(defn organizations-locations-recommenders-recommendations-get
  "Gets the requested recommendation. Requires the recommender.*.get IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/organizations/locations/recommenders/recommendations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://recommender.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-recommenders-recommendations-markFailed
  "Marks the Recommendation State as Failed. Users can use this method to indicate to the Recommender API that they have applied the recommendation themselves, and the operation failed. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationFailed can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or FAILED state. Requires the recommender.*.update IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/organizations/locations/recommenders/recommendations/markFailed

name <> 
GoogleCloudRecommenderV1MarkRecommendationFailedRequest:
GoogleCloudRecommenderV1MarkRecommendationFailedRequest"
  [name GoogleCloudRecommenderV1MarkRecommendationFailedRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://recommender.googleapis.com/v1/{+name}:markFailed",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommenderV1MarkRecommendationFailedRequest}))

(defn organizations-locations-recommenders-recommendations-list
  "Lists recommendations for the specified Cloud Resource. Requires the recommender.*.list IAM permission for the specified recommender.
https://cloud.google.com/recommender/docs/v1/reference/rest/v1/organizations/locations/recommenders/recommendations/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. If not specified, the server will determine the number of results to return.
filter <string> Filter expression to restrict the recommendations returned. Supported filter fields: * `state_info.state` * `recommenderSubtype` * `priority` * `targetResources` Examples: * `stateInfo.state = ACTIVE OR stateInfo.state = DISMISSED` * `recommenderSubtype = REMOVE_ROLE OR recommenderSubtype = REPLACE_ROLE` * `priority = P1 OR priority = P2` * `targetResources : //compute.googleapis.com/projects/1234/zones/us-central1-a/instances/instance-1` * `stateInfo.state = ACTIVE AND (priority = P1 OR priority = P2)` The max allowed filter length is 500 characters. (These expressions are based on the filter language described at https://google.aip.dev/160)"
  ([parent]
    (organizations-locations-recommenders-recommendations-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://recommender.googleapis.com/v1/{+parent}/recommendations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
