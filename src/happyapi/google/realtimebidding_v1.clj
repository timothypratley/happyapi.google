(ns happyapi.google.realtimebidding-v1
  "Real-time Bidding API
Allows external bidders to manage their RTB integration with Google. This includes managing bidder endpoints, QPS quotas, configuring what ad inventory to receive via pretargeting, submitting creatives for verification, and accessing creative metadata such as approval status.
See: https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/")

(defn bidders-get
  "Gets a bidder account by its name.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://realtimebidding.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"]})

(defn bidders-list
  "Lists all the bidder accounts that belong to the caller.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/list

optional:
pageSize <integer> The maximum number of bidders to return. If unspecified, at most 100 bidders will be returned. The maximum value is 500; values above 500 will be coerced to 500."
  ([] (bidders-list nil))
  ([optional]
    {:method :get,
     :uri-template "https://realtimebidding.googleapis.com/v1/bidders",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/realtime-bidding"]}))

(defn bidders-endpoints-get
  "Gets a bidder endpoint by its name.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/endpoints/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://realtimebidding.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"]})

(defn bidders-endpoints-list
  "Lists all the bidder's endpoints.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/endpoints/list

parent <> 

optional:
pageSize <integer> The maximum number of endpoints to return. If unspecified, at most 100 endpoints will be returned. The maximum value is 500; values above 500 will be coerced to 500."
  ([parent] (bidders-endpoints-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://realtimebidding.googleapis.com/v1/{+parent}/endpoints",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/realtime-bidding"]}))

(defn bidders-endpoints-patch
  "Updates a bidder's endpoint.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/endpoints/patch

name <> 
Endpoint:
Endpoint

optional:
updateMask <string> Field mask to use for partial in-place updates."
  ([name Endpoint] (bidders-endpoints-patch name Endpoint nil))
  ([name Endpoint optional]
    {:method :patch,
     :uri-template "https://realtimebidding.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
     :body Endpoint}))

(defn bidders-creatives-list
  "Lists creatives as they are at the time of the initial request. This call may take multiple hours to complete. For large, paginated requests, this method returns a snapshot of creatives at the time of request for the first page. `lastStatusUpdate` and `creativeServingDecision` may be outdated for creatives on sequential pages. We recommend [Google Cloud Pub/Sub](//cloud.google.com/pubsub/docs/overview) to view the latest status.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/creatives/list

parent <> 

optional:
pageSize <integer> Requested page size. The server may return fewer creatives than requested (due to timeout constraint) even if more are available through another call. If unspecified, server will pick an appropriate default. Acceptable values are 1 to 1000, inclusive.
filter <string> Query string to filter creatives. If no filter is specified, all active creatives will be returned. Example: 'accountId=12345 AND (dealsStatus:DISAPPROVED AND disapprovalReason:UNACCEPTABLE_CONTENT) OR declaredAttributes:IS_COOKIE_TARGETED'
view <string> Controls the amount of information included in the response. By default only creativeServingDecision is included. To retrieve the entire creative resource (including the declared fields and the creative content) specify the view as \"FULL\"."
  ([parent] (bidders-creatives-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://realtimebidding.googleapis.com/v1/{+parent}/creatives",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/realtime-bidding"]}))

(defn bidders-creatives-watch
  "Watches all creatives pertaining to a bidder. It is sufficient to invoke this endpoint once per bidder. A Pub/Sub topic will be created and notifications will be pushed to the topic when any of the bidder's creatives change status. All of the bidder's service accounts will have access to read from the topic. Subsequent invocations of this method will return the existing Pub/Sub configuration.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/creatives/watch

parent <> 
WatchCreativesRequest:
WatchCreativesRequest"
  [parent WatchCreativesRequest]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+parent}/creatives:watch",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body WatchCreativesRequest})

(defn bidders-pretargetingConfigs-removeTargetedPublishers
  "Removes targeted publishers from the pretargeting config.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/pretargetingConfigs/removeTargetedPublishers

pretargetingConfig <> 
RemoveTargetedPublishersRequest:
RemoveTargetedPublishersRequest"
  [pretargetingConfig RemoveTargetedPublishersRequest]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+pretargetingConfig}:removeTargetedPublishers",
   :uri-template-args {"pretargetingConfig" pretargetingConfig},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body RemoveTargetedPublishersRequest})

(defn bidders-pretargetingConfigs-list
  "Lists all pretargeting configurations for a single bidder.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/pretargetingConfigs/list

parent <> 

optional:
pageSize <integer> The maximum number of pretargeting configurations to return. If unspecified, at most 10 pretargeting configurations will be returned. The maximum value is 100; values above 100 will be coerced to 100."
  ([parent] (bidders-pretargetingConfigs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://realtimebidding.googleapis.com/v1/{+parent}/pretargetingConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/realtime-bidding"]}))

(defn bidders-pretargetingConfigs-delete
  "Deletes a pretargeting configuration.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/pretargetingConfigs/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://realtimebidding.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"]})

(defn bidders-pretargetingConfigs-addTargetedSites
  "Adds targeted sites to the pretargeting configuration.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/pretargetingConfigs/addTargetedSites

pretargetingConfig <> 
AddTargetedSitesRequest:
AddTargetedSitesRequest"
  [pretargetingConfig AddTargetedSitesRequest]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+pretargetingConfig}:addTargetedSites",
   :uri-template-args {"pretargetingConfig" pretargetingConfig},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body AddTargetedSitesRequest})

(defn bidders-pretargetingConfigs-activate
  "Activates a pretargeting configuration.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/pretargetingConfigs/activate

name <> 
ActivatePretargetingConfigRequest:
ActivatePretargetingConfigRequest"
  [name ActivatePretargetingConfigRequest]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+name}:activate",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body ActivatePretargetingConfigRequest})

(defn bidders-pretargetingConfigs-suspend
  "Suspends a pretargeting configuration.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/pretargetingConfigs/suspend

name <> 
SuspendPretargetingConfigRequest:
SuspendPretargetingConfigRequest"
  [name SuspendPretargetingConfigRequest]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+name}:suspend",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body SuspendPretargetingConfigRequest})

(defn bidders-pretargetingConfigs-removeTargetedApps
  "Removes targeted apps from the pretargeting configuration.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/pretargetingConfigs/removeTargetedApps

pretargetingConfig <> 
RemoveTargetedAppsRequest:
RemoveTargetedAppsRequest"
  [pretargetingConfig RemoveTargetedAppsRequest]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+pretargetingConfig}:removeTargetedApps",
   :uri-template-args {"pretargetingConfig" pretargetingConfig},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body RemoveTargetedAppsRequest})

(defn bidders-pretargetingConfigs-addTargetedPublishers
  "Adds targeted publishers to the pretargeting config.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/pretargetingConfigs/addTargetedPublishers

pretargetingConfig <> 
AddTargetedPublishersRequest:
AddTargetedPublishersRequest"
  [pretargetingConfig AddTargetedPublishersRequest]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+pretargetingConfig}:addTargetedPublishers",
   :uri-template-args {"pretargetingConfig" pretargetingConfig},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body AddTargetedPublishersRequest})

(defn bidders-pretargetingConfigs-removeTargetedSites
  "Removes targeted sites from the pretargeting configuration.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/pretargetingConfigs/removeTargetedSites

pretargetingConfig <> 
RemoveTargetedSitesRequest:
RemoveTargetedSitesRequest"
  [pretargetingConfig RemoveTargetedSitesRequest]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+pretargetingConfig}:removeTargetedSites",
   :uri-template-args {"pretargetingConfig" pretargetingConfig},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body RemoveTargetedSitesRequest})

(defn bidders-pretargetingConfigs-patch
  "Updates a pretargeting configuration.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/pretargetingConfigs/patch

name <> 
PretargetingConfig:
PretargetingConfig

optional:
updateMask <string> Field mask to use for partial in-place updates."
  ([name PretargetingConfig]
    (bidders-pretargetingConfigs-patch name PretargetingConfig nil))
  ([name PretargetingConfig optional]
    {:method :patch,
     :uri-template "https://realtimebidding.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
     :body PretargetingConfig}))

(defn bidders-pretargetingConfigs-create
  "Creates a pretargeting configuration. A pretargeting configuration's state (PretargetingConfig.state) is active upon creation, and it will start to affect traffic shortly after. A bidder may create a maximum of 10 pretargeting configurations. Attempts to exceed this maximum results in a 400 bad request error.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/pretargetingConfigs/create

parent <> 
PretargetingConfig:
PretargetingConfig"
  [parent PretargetingConfig]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+parent}/pretargetingConfigs",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body PretargetingConfig})

(defn bidders-pretargetingConfigs-addTargetedApps
  "Adds targeted apps to the pretargeting configuration.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/pretargetingConfigs/addTargetedApps

pretargetingConfig <> 
AddTargetedAppsRequest:
AddTargetedAppsRequest"
  [pretargetingConfig AddTargetedAppsRequest]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+pretargetingConfig}:addTargetedApps",
   :uri-template-args {"pretargetingConfig" pretargetingConfig},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body AddTargetedAppsRequest})

(defn bidders-pretargetingConfigs-get
  "Gets a pretargeting configuration.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/pretargetingConfigs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://realtimebidding.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"]})

(defn bidders-publisherConnections-list
  "Lists publisher connections for a given bidder.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/publisherConnections/list

parent <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested (due to timeout constraint) even if more are available through another call. If unspecified, the server will pick an appropriate default. Acceptable values are 1 to 5000, inclusive.
filter <string> Query string to filter publisher connections. Connections can be filtered by `displayName`, `publisherPlatform`, and `biddingState`. If no filter is specified, all publisher connections will be returned. Example: 'displayName=\"Great Publisher*\" AND publisherPlatform=ADMOB AND biddingState != PENDING' See https://google.aip.dev/160 for more information about filtering syntax.
orderBy <string> Order specification by which results should be sorted. If no sort order is specified, the results will be returned in alphabetic order based on the publisher's publisher code. Results can be sorted by `createTime`. Example: 'createTime DESC'."
  ([parent] (bidders-publisherConnections-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://realtimebidding.googleapis.com/v1/{+parent}/publisherConnections",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/realtime-bidding"]}))

(defn bidders-publisherConnections-get
  "Gets a publisher connection.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/publisherConnections/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://realtimebidding.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"]})

(defn bidders-publisherConnections-batchApprove
  "Batch approves multiple publisher connections.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/publisherConnections/batchApprove

parent <> 
BatchApprovePublisherConnectionsRequest:
BatchApprovePublisherConnectionsRequest"
  [parent BatchApprovePublisherConnectionsRequest]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+parent}/publisherConnections:batchApprove",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body BatchApprovePublisherConnectionsRequest})

(defn bidders-publisherConnections-batchReject
  "Batch rejects multiple publisher connections.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/bidders/publisherConnections/batchReject

parent <> 
BatchRejectPublisherConnectionsRequest:
BatchRejectPublisherConnectionsRequest"
  [parent BatchRejectPublisherConnectionsRequest]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+parent}/publisherConnections:batchReject",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body BatchRejectPublisherConnectionsRequest})

(defn buyers-get
  "Gets a buyer account by its name.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/buyers/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://realtimebidding.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"]})

(defn buyers-list
  "Lists all buyer account information the calling buyer user or service account is permissioned to manage.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/buyers/list

optional:
pageSize <integer> The maximum number of buyers to return. If unspecified, at most 100 buyers will be returned. The maximum value is 500; values above 500 will be coerced to 500."
  ([] (buyers-list nil))
  ([optional]
    {:method :get,
     :uri-template "https://realtimebidding.googleapis.com/v1/buyers",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/realtime-bidding"]}))

(defn buyers-getRemarketingTag
  "This has been sunset as of October 2023, and will return an error response if called. For more information, see the release notes: https://developers.google.com/authorized-buyers/apis/relnotes#real-time-bidding-api Gets remarketing tag for a buyer. A remarketing tag is a piece of JavaScript code that can be placed on a web page. When a user visits a page containing a remarketing tag, Google adds the user to a user list.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/buyers/getRemarketingTag

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+name}:getRemarketingTag",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"]})

(defn buyers-creatives-list
  "Lists creatives as they are at the time of the initial request. This call may take multiple hours to complete. For large, paginated requests, this method returns a snapshot of creatives at the time of request for the first page. `lastStatusUpdate` and `creativeServingDecision` may be outdated for creatives on sequential pages. We recommend [Google Cloud Pub/Sub](//cloud.google.com/pubsub/docs/overview) to view the latest status.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/buyers/creatives/list

parent <> 

optional:
pageSize <integer> Requested page size. The server may return fewer creatives than requested (due to timeout constraint) even if more are available through another call. If unspecified, server will pick an appropriate default. Acceptable values are 1 to 1000, inclusive.
filter <string> Query string to filter creatives. If no filter is specified, all active creatives will be returned. Example: 'accountId=12345 AND (dealsStatus:DISAPPROVED AND disapprovalReason:UNACCEPTABLE_CONTENT) OR declaredAttributes:IS_COOKIE_TARGETED'
view <string> Controls the amount of information included in the response. By default only creativeServingDecision is included. To retrieve the entire creative resource (including the declared fields and the creative content) specify the view as \"FULL\"."
  ([parent] (buyers-creatives-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://realtimebidding.googleapis.com/v1/{+parent}/creatives",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/realtime-bidding"]}))

(defn buyers-creatives-get
  "Gets a creative.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/buyers/creatives/get

name <> 

optional:
view <string> Controls the amount of information included in the response. By default only creativeServingDecision is included. To retrieve the entire creative resource (including the declared fields and the creative content) specify the view as \"FULL\"."
  ([name] (buyers-creatives-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://realtimebidding.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/realtime-bidding"]}))

(defn buyers-creatives-create
  "Creates a creative.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/buyers/creatives/create

parent <> 
Creative:
Creative"
  [parent Creative]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+parent}/creatives",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body Creative})

(defn buyers-creatives-patch
  "Updates a creative.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/buyers/creatives/patch

name <> 
Creative:
Creative

optional:
updateMask <string> Field mask to use for partial in-place updates."
  ([name Creative] (buyers-creatives-patch name Creative nil))
  ([name Creative optional]
    {:method :patch,
     :uri-template "https://realtimebidding.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
     :body Creative}))

(defn buyers-userLists-get
  "Gets a user list by its name.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/buyers/userLists/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://realtimebidding.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"]})

(defn buyers-userLists-list
  "Lists the user lists visible to the current user.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/buyers/userLists/list

parent <> 

optional:
pageSize <integer> The number of results to return per page."
  ([parent] (buyers-userLists-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://realtimebidding.googleapis.com/v1/{+parent}/userLists",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/realtime-bidding"]}))

(defn buyers-userLists-create
  "Creates a new user list.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/buyers/userLists/create

parent <> 
UserList:
UserList"
  [parent UserList]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+parent}/userLists",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body UserList})

(defn buyers-userLists-update
  "Updates the given user list. Only user lists with URLRestrictions can be updated.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/buyers/userLists/update

name <> 
UserList:
UserList"
  [name UserList]
  {:method :put,
   :uri-template "https://realtimebidding.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body UserList})

(defn buyers-userLists-open
  "Changes the status of a user list to OPEN. This allows new users to be added to the user list.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/buyers/userLists/open

name <> 
OpenUserListRequest:
OpenUserListRequest"
  [name OpenUserListRequest]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+name}:open",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body OpenUserListRequest})

(defn buyers-userLists-close
  "Changes the status of a user list to CLOSED. This prevents new users from being added to the user list.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/buyers/userLists/close

name <> 
CloseUserListRequest:
CloseUserListRequest"
  [name CloseUserListRequest]
  {:method :post,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+name}:close",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"],
   :body CloseUserListRequest})

(defn buyers-userLists-getRemarketingTag
  "This has been sunset as of October 2023, and will return an error response if called. For more information, see the release notes: https://developers.google.com/authorized-buyers/apis/relnotes#real-time-bidding-api Gets remarketing tag for a buyer. A remarketing tag is a piece of JavaScript code that can be placed on a web page. When a user visits a page containing a remarketing tag, Google adds the user to a user list.
https://developers.google.com/authorized-buyers/apis/realtimebidding/reference/rest/v1/reference/rest/v1/buyers/userLists/getRemarketingTag

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://realtimebidding.googleapis.com/v1/{+name}:getRemarketingTag",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/realtime-bidding"]})
