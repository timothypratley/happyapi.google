(ns happyapi.google.androidpublisher-v3
  "Google Play Android Developer API
Lets Android application developers access their Google Play accounts. At a high level, the expected workflow is to "insert" an Edit, make changes as necessary, and then "commit" it. 
See: https://developers.google.com/android-publisher"
  (:require [happyapi.providers.google :as client]))

(defn systemapks-variants-create
  "Creates an APK which is suitable for inclusion in a system image from an already uploaded Android App Bundle.
https://developers.google.com/android-publisher/v3/reference/rest/v3/systemapks/variants/create

packageName <> 
versionCode <> 
Variant:
Variant"
  [packageName versionCode Variant]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/systemApks/{versionCode}/variants",
     :uri-template-args
     {"packageName" packageName, "versionCode" versionCode},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body Variant}))

(defn systemapks-variants-list
  "Returns the list of previously created system APK variants.
https://developers.google.com/android-publisher/v3/reference/rest/v3/systemapks/variants/list

packageName <> 
versionCode <> "
  [packageName versionCode]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/systemApks/{versionCode}/variants",
     :uri-template-args
     {"packageName" packageName, "versionCode" versionCode},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn systemapks-variants-get
  "Returns a previously created system APK variant.
https://developers.google.com/android-publisher/v3/reference/rest/v3/systemapks/variants/get

packageName <> 
versionCode <> 
variantId <> "
  [packageName versionCode variantId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/systemApks/{versionCode}/variants/{variantId}",
     :uri-template-args
     {"packageName" packageName,
      "versionCode" versionCode,
      "variantId" variantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn systemapks-variants-download
  "Downloads a previously created system APK which is suitable for inclusion in a system image.
https://developers.google.com/android-publisher/v3/reference/rest/v3/systemapks/variants/download

packageName <> 
versionCode <> 
variantId <> "
  [packageName versionCode variantId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/systemApks/{versionCode}/variants/{variantId}:download",
     :uri-template-args
     {"packageName" packageName,
      "versionCode" versionCode,
      "variantId" variantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn apprecovery-create
  "Create an app recovery action with recovery status as DRAFT. Note that this action does not execute the recovery action.
https://developers.google.com/android-publisher/v3/reference/rest/v3/apprecovery/create

packageName <> 
CreateDraftAppRecoveryRequest:
CreateDraftAppRecoveryRequest"
  [packageName CreateDraftAppRecoveryRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/appRecoveries",
     :uri-template-args {"packageName" packageName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body CreateDraftAppRecoveryRequest}))

(defn apprecovery-deploy
  "Deploy an already created app recovery action with recovery status DRAFT. Note that this action activates the recovery action for all targeted users and changes its status to ACTIVE.
https://developers.google.com/android-publisher/v3/reference/rest/v3/apprecovery/deploy

packageName <> 
appRecoveryId <> 
DeployAppRecoveryRequest:
DeployAppRecoveryRequest"
  [packageName appRecoveryId DeployAppRecoveryRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/appRecoveries/{appRecoveryId}:deploy",
     :uri-template-args
     {"packageName" packageName, "appRecoveryId" appRecoveryId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body DeployAppRecoveryRequest}))

(defn apprecovery-list
  "List all app recovery action resources associated with a particular package name and app version.
https://developers.google.com/android-publisher/v3/reference/rest/v3/apprecovery/list

packageName <> 

optional:
versionCode <string> Required. Version code targeted by the list of recovery actions."
  ([packageName] (apprecovery-list packageName nil))
  ([packageName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/appRecoveries",
       :uri-template-args {"packageName" packageName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn apprecovery-addTargeting
  "Incrementally update targeting for a recovery action. Note that only the criteria selected during the creation of recovery action can be expanded.
https://developers.google.com/android-publisher/v3/reference/rest/v3/apprecovery/addTargeting

packageName <> 
appRecoveryId <> 
AddTargetingRequest:
AddTargetingRequest"
  [packageName appRecoveryId AddTargetingRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/appRecoveries/{appRecoveryId}:addTargeting",
     :uri-template-args
     {"packageName" packageName, "appRecoveryId" appRecoveryId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body AddTargetingRequest}))

(defn apprecovery-cancel
  "Cancel an already executing app recovery action. Note that this action changes status of the recovery action to CANCELED.
https://developers.google.com/android-publisher/v3/reference/rest/v3/apprecovery/cancel

packageName <> 
appRecoveryId <> 
CancelAppRecoveryRequest:
CancelAppRecoveryRequest"
  [packageName appRecoveryId CancelAppRecoveryRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/appRecoveries/{appRecoveryId}:cancel",
     :uri-template-args
     {"packageName" packageName, "appRecoveryId" appRecoveryId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body CancelAppRecoveryRequest}))

(defn applications-dataSafety
  "Writes the Safety Labels declaration of an app.
https://developers.google.com/android-publisher/v3/reference/rest/v3/applications/dataSafety

packageName <> 
SafetyLabelsUpdateRequest:
SafetyLabelsUpdateRequest"
  [packageName SafetyLabelsUpdateRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/dataSafety",
     :uri-template-args {"packageName" packageName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body SafetyLabelsUpdateRequest}))

(defn applications-deviceTierConfigs-create
  "Creates a new device tier config for an app.
https://developers.google.com/android-publisher/v3/reference/rest/v3/applications/deviceTierConfigs/create

packageName <> 
DeviceTierConfig:
DeviceTierConfig

optional:
allowUnknownDevices <boolean> Whether the service should accept device IDs that are unknown to Play's device catalog."
  ([packageName DeviceTierConfig]
    (applications-deviceTierConfigs-create
      packageName
      DeviceTierConfig
      nil))
  ([packageName DeviceTierConfig optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/deviceTierConfigs",
       :uri-template-args {"packageName" packageName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"],
       :body DeviceTierConfig})))

(defn applications-deviceTierConfigs-get
  "Returns a particular device tier config.
https://developers.google.com/android-publisher/v3/reference/rest/v3/applications/deviceTierConfigs/get

packageName <> 
deviceTierConfigId <> "
  [packageName deviceTierConfigId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/deviceTierConfigs/{deviceTierConfigId}",
     :uri-template-args
     {"packageName" packageName,
      "deviceTierConfigId" deviceTierConfigId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn applications-deviceTierConfigs-list
  "Returns created device tier configs, ordered by descending creation time.
https://developers.google.com/android-publisher/v3/reference/rest/v3/applications/deviceTierConfigs/list

packageName <> 

optional:
pageSize <integer> The maximum number of device tier configs to return. The service may return fewer than this value. If unspecified, at most 10 device tier configs will be returned. The maximum value for this field is 100; values above 100 will be coerced to 100. Device tier configs will be ordered by descending creation time."
  ([packageName] (applications-deviceTierConfigs-list packageName nil))
  ([packageName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/deviceTierConfigs",
       :uri-template-args {"packageName" packageName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn monetization-convertRegionPrices
  "Calculates the region prices, using today's exchange rate and country-specific pricing patterns, based on the price in the request for a set of regions.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/convertRegionPrices

packageName <> 
ConvertRegionPricesRequest:
ConvertRegionPricesRequest"
  [packageName ConvertRegionPricesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/pricing:convertRegionPrices",
     :uri-template-args {"packageName" packageName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body ConvertRegionPricesRequest}))

(defn monetization-subscriptions-get
  "Reads a single subscription.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/get

packageName <> 
productId <> "
  [packageName productId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}",
     :uri-template-args
     {"packageName" packageName, "productId" productId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn monetization-subscriptions-batchGet
  "Reads one or more subscriptions.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/batchGet

packageName <> 

optional:
productIds <string> Required. A list of up to 100 subscription product IDs to retrieve. All the IDs must be different."
  ([packageName] (monetization-subscriptions-batchGet packageName nil))
  ([packageName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions:batchGet",
       :uri-template-args {"packageName" packageName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn monetization-subscriptions-list
  "Lists all subscriptions under a given app.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/list

packageName <> 

optional:
pageSize <integer> The maximum number of subscriptions to return. The service may return fewer than this value. If unspecified, at most 50 subscriptions will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
showArchived <boolean> Deprecated: subscription archiving is not supported."
  ([packageName] (monetization-subscriptions-list packageName nil))
  ([packageName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions",
       :uri-template-args {"packageName" packageName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn monetization-subscriptions-create
  "Creates a new subscription. Newly added base plans will remain in draft state until activated.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/create

packageName <> 
Subscription:
Subscription

optional:
productId <string> Required. The ID to use for the subscription. For the requirements on this format, see the documentation of the product_id field on the Subscription resource.
regionsVersion.version <string> Required. A string representing the version of available regions being used for the specified resource. Regional prices for the resource have to be specified according to the information published in [this article](https://support.google.com/googleplay/android-developer/answer/10532353). Each time the supported locations substantially change, the version will be incremented. Using this field will ensure that creating and updating the resource with an older region's version and set of regional prices and currencies will succeed even though a new version is available. The latest version is 2022/02."
  ([packageName Subscription]
    (monetization-subscriptions-create packageName Subscription nil))
  ([packageName Subscription optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions",
       :uri-template-args {"packageName" packageName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"],
       :body Subscription})))

(defn monetization-subscriptions-patch
  "Updates an existing subscription.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/patch

packageName <> 
productId <> 
Subscription:
Subscription

optional:
updateMask <string> Required. The list of fields to be updated.
regionsVersion.version <string> Required. A string representing the version of available regions being used for the specified resource. Regional prices for the resource have to be specified according to the information published in [this article](https://support.google.com/googleplay/android-developer/answer/10532353). Each time the supported locations substantially change, the version will be incremented. Using this field will ensure that creating and updating the resource with an older region's version and set of regional prices and currencies will succeed even though a new version is available. The latest version is 2022/02.
allowMissing <boolean> Optional. If set to true, and the subscription with the given package_name and product_id doesn't exist, the subscription will be created. If a new subscription is created, update_mask is ignored.
latencyTolerance <string> Optional. The latency tolerance for the propagation of this product update. Defaults to latency-sensitive."
  ([packageName productId Subscription]
    (monetization-subscriptions-patch
      packageName
      productId
      Subscription
      nil))
  ([packageName productId Subscription optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}",
       :uri-template-args
       {"packageName" packageName, "productId" productId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"],
       :body Subscription})))

(defn monetization-subscriptions-batchUpdate
  "Updates a batch of subscriptions. Set the latencyTolerance field on nested requests to PRODUCT_UPDATE_LATENCY_TOLERANCE_LATENCY_TOLERANT to achieve maximum update throughput.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/batchUpdate

packageName <> 
BatchUpdateSubscriptionsRequest:
BatchUpdateSubscriptionsRequest"
  [packageName BatchUpdateSubscriptionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions:batchUpdate",
     :uri-template-args {"packageName" packageName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body BatchUpdateSubscriptionsRequest}))

(defn monetization-subscriptions-delete
  "Deletes a subscription. A subscription can only be deleted if it has never had a base plan published.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/delete

packageName <> 
productId <> "
  [packageName productId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}",
     :uri-template-args
     {"packageName" packageName, "productId" productId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn monetization-subscriptions-archive
  "Deprecated: subscription archiving is not supported.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/archive

packageName <> 
productId <> 
ArchiveSubscriptionRequest:
ArchiveSubscriptionRequest"
  [packageName productId ArchiveSubscriptionRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}:archive",
     :uri-template-args
     {"packageName" packageName, "productId" productId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body ArchiveSubscriptionRequest}))

(defn monetization-subscriptions-basePlans-delete
  "Deletes a base plan. Can only be done for draft base plans. This action is irreversible.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/delete

packageName <> 
productId <> 
basePlanId <> "
  [packageName productId basePlanId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans/{basePlanId}",
     :uri-template-args
     {"packageName" packageName,
      "productId" productId,
      "basePlanId" basePlanId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn monetization-subscriptions-basePlans-activate
  "Activates a base plan. Once activated, base plans will be available to new subscribers.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/activate

packageName <> 
productId <> 
basePlanId <> 
ActivateBasePlanRequest:
ActivateBasePlanRequest"
  [packageName productId basePlanId ActivateBasePlanRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans/{basePlanId}:activate",
     :uri-template-args
     {"packageName" packageName,
      "productId" productId,
      "basePlanId" basePlanId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body ActivateBasePlanRequest}))

(defn monetization-subscriptions-basePlans-deactivate
  "Deactivates a base plan. Once deactivated, the base plan will become unavailable to new subscribers, but existing subscribers will maintain their subscription
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/deactivate

packageName <> 
productId <> 
basePlanId <> 
DeactivateBasePlanRequest:
DeactivateBasePlanRequest"
  [packageName productId basePlanId DeactivateBasePlanRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans/{basePlanId}:deactivate",
     :uri-template-args
     {"packageName" packageName,
      "productId" productId,
      "basePlanId" basePlanId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body DeactivateBasePlanRequest}))

(defn monetization-subscriptions-basePlans-batchUpdateStates
  "Activates or deactivates base plans across one or multiple subscriptions. Set the latencyTolerance field on nested requests to PRODUCT_UPDATE_LATENCY_TOLERANCE_LATENCY_TOLERANT to achieve maximum update throughput.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/batchUpdateStates

packageName <> 
productId <> 
BatchUpdateBasePlanStatesRequest:
BatchUpdateBasePlanStatesRequest"
  [packageName productId BatchUpdateBasePlanStatesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans:batchUpdateStates",
     :uri-template-args
     {"packageName" packageName, "productId" productId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body BatchUpdateBasePlanStatesRequest}))

(defn monetization-subscriptions-basePlans-migratePrices
  "Migrates subscribers who are receiving an historical subscription price to the currently-offered price for the specified region. Requests will cause price change notifications to be sent to users who are currently receiving an historical price older than the supplied timestamp. Subscribers who do not agree to the new price will have their subscription ended at the next renewal.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/migratePrices

packageName <> 
productId <> 
basePlanId <> 
MigrateBasePlanPricesRequest:
MigrateBasePlanPricesRequest"
  [packageName productId basePlanId MigrateBasePlanPricesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans/{basePlanId}:migratePrices",
     :uri-template-args
     {"packageName" packageName,
      "productId" productId,
      "basePlanId" basePlanId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body MigrateBasePlanPricesRequest}))

(defn monetization-subscriptions-basePlans-batchMigratePrices
  "Batch variant of the MigrateBasePlanPrices endpoint. Set the latencyTolerance field on nested requests to PRODUCT_UPDATE_LATENCY_TOLERANCE_LATENCY_TOLERANT to achieve maximum update throughput.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/batchMigratePrices

packageName <> 
productId <> 
BatchMigrateBasePlanPricesRequest:
BatchMigrateBasePlanPricesRequest"
  [packageName productId BatchMigrateBasePlanPricesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans:batchMigratePrices",
     :uri-template-args
     {"packageName" packageName, "productId" productId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body BatchMigrateBasePlanPricesRequest}))

(defn monetization-subscriptions-basePlans-offers-list
  "Lists all offers under a given subscription.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/offers/list

packageName <> 
productId <> 
basePlanId <> 

optional:
pageSize <integer> The maximum number of subscriptions to return. The service may return fewer than this value. If unspecified, at most 50 subscriptions will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([packageName productId basePlanId]
    (monetization-subscriptions-basePlans-offers-list
      packageName
      productId
      basePlanId
      nil))
  ([packageName productId basePlanId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans/{basePlanId}/offers",
       :uri-template-args
       {"packageName" packageName,
        "productId" productId,
        "basePlanId" basePlanId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn monetization-subscriptions-basePlans-offers-batchUpdateStates
  "Updates a batch of subscription offer states. Set the latencyTolerance field on nested requests to PRODUCT_UPDATE_LATENCY_TOLERANCE_LATENCY_TOLERANT to achieve maximum update throughput.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/offers/batchUpdateStates

packageName <> 
productId <> 
basePlanId <> 
BatchUpdateSubscriptionOfferStatesRequest:
BatchUpdateSubscriptionOfferStatesRequest"
  [packageName
   productId
   basePlanId
   BatchUpdateSubscriptionOfferStatesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans/{basePlanId}/offers:batchUpdateStates",
     :uri-template-args
     {"packageName" packageName,
      "productId" productId,
      "basePlanId" basePlanId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body BatchUpdateSubscriptionOfferStatesRequest}))

(defn monetization-subscriptions-basePlans-offers-delete
  "Deletes a subscription offer. Can only be done for draft offers. This action is irreversible.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/offers/delete

packageName <> 
productId <> 
basePlanId <> 
offerId <> "
  [packageName productId basePlanId offerId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans/{basePlanId}/offers/{offerId}",
     :uri-template-args
     {"packageName" packageName,
      "productId" productId,
      "basePlanId" basePlanId,
      "offerId" offerId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn monetization-subscriptions-basePlans-offers-activate
  "Activates a subscription offer. Once activated, subscription offers will be available to new subscribers.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/offers/activate

packageName <> 
productId <> 
basePlanId <> 
offerId <> 
ActivateSubscriptionOfferRequest:
ActivateSubscriptionOfferRequest"
  [packageName
   productId
   basePlanId
   offerId
   ActivateSubscriptionOfferRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans/{basePlanId}/offers/{offerId}:activate",
     :uri-template-args
     {"packageName" packageName,
      "productId" productId,
      "basePlanId" basePlanId,
      "offerId" offerId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body ActivateSubscriptionOfferRequest}))

(defn monetization-subscriptions-basePlans-offers-batchUpdate
  "Updates a batch of subscription offers. Set the latencyTolerance field on nested requests to PRODUCT_UPDATE_LATENCY_TOLERANCE_LATENCY_TOLERANT to achieve maximum update throughput.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/offers/batchUpdate

packageName <> 
productId <> 
basePlanId <> 
BatchUpdateSubscriptionOffersRequest:
BatchUpdateSubscriptionOffersRequest"
  [packageName
   productId
   basePlanId
   BatchUpdateSubscriptionOffersRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans/{basePlanId}/offers:batchUpdate",
     :uri-template-args
     {"packageName" packageName,
      "productId" productId,
      "basePlanId" basePlanId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body BatchUpdateSubscriptionOffersRequest}))

(defn monetization-subscriptions-basePlans-offers-deactivate
  "Deactivates a subscription offer. Once deactivated, existing subscribers will maintain their subscription, but the offer will become unavailable to new subscribers.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/offers/deactivate

packageName <> 
productId <> 
basePlanId <> 
offerId <> 
DeactivateSubscriptionOfferRequest:
DeactivateSubscriptionOfferRequest"
  [packageName
   productId
   basePlanId
   offerId
   DeactivateSubscriptionOfferRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans/{basePlanId}/offers/{offerId}:deactivate",
     :uri-template-args
     {"packageName" packageName,
      "productId" productId,
      "basePlanId" basePlanId,
      "offerId" offerId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body DeactivateSubscriptionOfferRequest}))

(defn monetization-subscriptions-basePlans-offers-patch
  "Updates an existing subscription offer.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/offers/patch

packageName <> 
productId <> 
basePlanId <> 
offerId <> 
SubscriptionOffer:
SubscriptionOffer

optional:
updateMask <string> Required. The list of fields to be updated.
regionsVersion.version <string> Required. A string representing the version of available regions being used for the specified resource. Regional prices for the resource have to be specified according to the information published in [this article](https://support.google.com/googleplay/android-developer/answer/10532353). Each time the supported locations substantially change, the version will be incremented. Using this field will ensure that creating and updating the resource with an older region's version and set of regional prices and currencies will succeed even though a new version is available. The latest version is 2022/02.
allowMissing <boolean> Optional. If set to true, and the subscription offer with the given package_name, product_id, base_plan_id and offer_id doesn't exist, an offer will be created. If a new offer is created, update_mask is ignored.
latencyTolerance <string> Optional. The latency tolerance for the propagation of this product update. Defaults to latency-sensitive."
  ([packageName productId basePlanId offerId SubscriptionOffer]
    (monetization-subscriptions-basePlans-offers-patch
      packageName
      productId
      basePlanId
      offerId
      SubscriptionOffer
      nil))
  ([packageName
    productId
    basePlanId
    offerId
    SubscriptionOffer
    optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans/{basePlanId}/offers/{offerId}",
       :uri-template-args
       {"packageName" packageName,
        "productId" productId,
        "basePlanId" basePlanId,
        "offerId" offerId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"],
       :body SubscriptionOffer})))

(defn monetization-subscriptions-basePlans-offers-batchGet
  "Reads one or more subscription offers.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/offers/batchGet

packageName <> 
productId <> 
basePlanId <> 
BatchGetSubscriptionOffersRequest:
BatchGetSubscriptionOffersRequest"
  [packageName productId basePlanId BatchGetSubscriptionOffersRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans/{basePlanId}/offers:batchGet",
     :uri-template-args
     {"packageName" packageName,
      "productId" productId,
      "basePlanId" basePlanId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body BatchGetSubscriptionOffersRequest}))

(defn monetization-subscriptions-basePlans-offers-create
  "Creates a new subscription offer. Only auto-renewing base plans can have subscription offers. The offer state will be DRAFT until it is activated.
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/offers/create

packageName <> 
productId <> 
basePlanId <> 
SubscriptionOffer:
SubscriptionOffer

optional:
offerId <string> Required. The ID to use for the offer. For the requirements on this format, see the documentation of the offer_id field on the SubscriptionOffer resource.
regionsVersion.version <string> Required. A string representing the version of available regions being used for the specified resource. Regional prices for the resource have to be specified according to the information published in [this article](https://support.google.com/googleplay/android-developer/answer/10532353). Each time the supported locations substantially change, the version will be incremented. Using this field will ensure that creating and updating the resource with an older region's version and set of regional prices and currencies will succeed even though a new version is available. The latest version is 2022/02."
  ([packageName productId basePlanId SubscriptionOffer]
    (monetization-subscriptions-basePlans-offers-create
      packageName
      productId
      basePlanId
      SubscriptionOffer
      nil))
  ([packageName productId basePlanId SubscriptionOffer optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans/{basePlanId}/offers",
       :uri-template-args
       {"packageName" packageName,
        "productId" productId,
        "basePlanId" basePlanId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"],
       :body SubscriptionOffer})))

(defn monetization-subscriptions-basePlans-offers-get
  "Reads a single offer
https://developers.google.com/android-publisher/v3/reference/rest/v3/monetization/subscriptions/basePlans/offers/get

packageName <> 
productId <> 
basePlanId <> 
offerId <> "
  [packageName productId basePlanId offerId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/subscriptions/{productId}/basePlans/{basePlanId}/offers/{offerId}",
     :uri-template-args
     {"packageName" packageName,
      "productId" productId,
      "basePlanId" basePlanId,
      "offerId" offerId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn purchases-products-get
  "Checks the purchase and consumption status of an inapp item.
https://developers.google.com/android-publisher/v3/reference/rest/v3/purchases/products/get

packageName <> 
productId <> 
token <> "
  [packageName productId token]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/purchases/products/{productId}/tokens/{token}",
     :uri-template-args
     {"packageName" packageName, "productId" productId, "token" token},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn purchases-products-acknowledge
  "Acknowledges a purchase of an inapp item.
https://developers.google.com/android-publisher/v3/reference/rest/v3/purchases/products/acknowledge

packageName <> 
productId <> 
token <> 
ProductPurchasesAcknowledgeRequest:
ProductPurchasesAcknowledgeRequest"
  [packageName productId token ProductPurchasesAcknowledgeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/purchases/products/{productId}/tokens/{token}:acknowledge",
     :uri-template-args
     {"packageName" packageName, "productId" productId, "token" token},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body ProductPurchasesAcknowledgeRequest}))

(defn purchases-products-consume
  "Consumes a purchase for an inapp item.
https://developers.google.com/android-publisher/v3/reference/rest/v3/purchases/products/consume

packageName <> 
productId <> 
token <> "
  [packageName productId token]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/purchases/products/{productId}/tokens/{token}:consume",
     :uri-template-args
     {"packageName" packageName, "productId" productId, "token" token},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn purchases-subscriptions-get
  "Checks whether a user's subscription purchase is valid and returns its expiry time.
https://developers.google.com/android-publisher/v3/reference/rest/v3/purchases/subscriptions/get

packageName <> 
subscriptionId <> 
token <> "
  [packageName subscriptionId token]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/purchases/subscriptions/{subscriptionId}/tokens/{token}",
     :uri-template-args
     {"packageName" packageName,
      "subscriptionId" subscriptionId,
      "token" token},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn purchases-subscriptions-cancel
  "Cancels a user's subscription purchase. The subscription remains valid until its expiration time.
https://developers.google.com/android-publisher/v3/reference/rest/v3/purchases/subscriptions/cancel

packageName <> 
subscriptionId <> 
token <> "
  [packageName subscriptionId token]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/purchases/subscriptions/{subscriptionId}/tokens/{token}:cancel",
     :uri-template-args
     {"packageName" packageName,
      "subscriptionId" subscriptionId,
      "token" token},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn purchases-subscriptions-defer
  "Defers a user's subscription purchase until a specified future expiration time.
https://developers.google.com/android-publisher/v3/reference/rest/v3/purchases/subscriptions/defer

packageName <> 
subscriptionId <> 
token <> 
SubscriptionPurchasesDeferRequest:
SubscriptionPurchasesDeferRequest"
  [packageName subscriptionId token SubscriptionPurchasesDeferRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/purchases/subscriptions/{subscriptionId}/tokens/{token}:defer",
     :uri-template-args
     {"packageName" packageName,
      "subscriptionId" subscriptionId,
      "token" token},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body SubscriptionPurchasesDeferRequest}))

(defn purchases-subscriptions-refund
  "Refunds a user's subscription purchase, but the subscription remains valid until its expiration time and it will continue to recur.
https://developers.google.com/android-publisher/v3/reference/rest/v3/purchases/subscriptions/refund

packageName <> 
subscriptionId <> 
token <> "
  [packageName subscriptionId token]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/purchases/subscriptions/{subscriptionId}/tokens/{token}:refund",
     :uri-template-args
     {"packageName" packageName,
      "subscriptionId" subscriptionId,
      "token" token},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn purchases-subscriptions-revoke
  "Refunds and immediately revokes a user's subscription purchase. Access to the subscription will be terminated immediately and it will stop recurring.
https://developers.google.com/android-publisher/v3/reference/rest/v3/purchases/subscriptions/revoke

packageName <> 
subscriptionId <> 
token <> "
  [packageName subscriptionId token]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/purchases/subscriptions/{subscriptionId}/tokens/{token}:revoke",
     :uri-template-args
     {"packageName" packageName,
      "subscriptionId" subscriptionId,
      "token" token},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn purchases-subscriptions-acknowledge
  "Acknowledges a subscription purchase.
https://developers.google.com/android-publisher/v3/reference/rest/v3/purchases/subscriptions/acknowledge

packageName <> 
subscriptionId <> 
token <> 
SubscriptionPurchasesAcknowledgeRequest:
SubscriptionPurchasesAcknowledgeRequest"
  [packageName
   subscriptionId
   token
   SubscriptionPurchasesAcknowledgeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/purchases/subscriptions/{subscriptionId}/tokens/{token}:acknowledge",
     :uri-template-args
     {"packageName" packageName,
      "subscriptionId" subscriptionId,
      "token" token},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body SubscriptionPurchasesAcknowledgeRequest}))

(defn purchases-subscriptionsv2-get
  "Get metadata about a subscription
https://developers.google.com/android-publisher/v3/reference/rest/v3/purchases/subscriptionsv2/get

packageName <> 
token <> "
  [packageName token]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/purchases/subscriptionsv2/tokens/{token}",
     :uri-template-args {"packageName" packageName, "token" token},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn purchases-subscriptionsv2-revoke
  "Revoke a subscription purchase for the user.
https://developers.google.com/android-publisher/v3/reference/rest/v3/purchases/subscriptionsv2/revoke

packageName <> 
token <> 
RevokeSubscriptionPurchaseRequest:
RevokeSubscriptionPurchaseRequest"
  [packageName token RevokeSubscriptionPurchaseRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/purchases/subscriptionsv2/tokens/{token}:revoke",
     :uri-template-args {"packageName" packageName, "token" token},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body RevokeSubscriptionPurchaseRequest}))

(defn purchases-voidedpurchases-list
  "Lists the purchases that were canceled, refunded or charged-back.
https://developers.google.com/android-publisher/v3/reference/rest/v3/purchases/voidedpurchases/list

packageName <> 

optional:
maxResults <integer> Defines how many results the list operation should return. The default number depends on the resource collection.
startIndex <integer> Defines the index of the first element to return. This can only be used if indexed paging is enabled.
token <string> Defines the token of the page to return, usually taken from TokenPagination. This can only be used if token paging is enabled.
startTime <string> The time, in milliseconds since the Epoch, of the oldest voided purchase that you want to see in the response. The value of this parameter cannot be older than 30 days and is ignored if a pagination token is set. Default value is current time minus 30 days. Note: This filter is applied on the time at which the record is seen as voided by our systems and not the actual voided time returned in the response.
endTime <string> The time, in milliseconds since the Epoch, of the newest voided purchase that you want to see in the response. The value of this parameter cannot be greater than the current time and is ignored if a pagination token is set. Default value is current time. Note: This filter is applied on the time at which the record is seen as voided by our systems and not the actual voided time returned in the response.
type <integer> The type of voided purchases that you want to see in the response. Possible values are: 0. Only voided in-app product purchases will be returned in the response. This is the default value. 1. Both voided in-app purchases and voided subscription purchases will be returned in the response. Note: Before requesting to receive voided subscription purchases, you must switch to use orderId in the response which uniquely identifies one-time purchases and subscriptions. Otherwise, you will receive multiple subscription orders with the same PurchaseToken, because subscription renewal orders share the same PurchaseToken.
includeQuantityBasedPartialRefund <boolean> Optional. Whether to include voided purchases of quantity-based partial refunds, which are applicable only to multi-quantity purchases. If true, additional voided purchases may be returned with voidedQuantity that indicates the refund quantity of a quantity-based partial refund. The default value is false."
  ([packageName] (purchases-voidedpurchases-list packageName nil))
  ([packageName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/purchases/voidedpurchases",
       :uri-template-args {"packageName" packageName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn internalappsharingartifacts-uploadapk
  "Uploads an APK to internal app sharing. If you are using the Google API client libraries, please increase the timeout of the http request before calling this endpoint (a timeout of 2 minutes is recommended). See [Timeouts and Errors](https://developers.google.com/api-client-library/java/google-api-java-client/errors) for an example in java.
https://developers.google.com/android-publisher/v3/reference/rest/v3/internalappsharingartifacts/uploadapk

packageName <> "
  [packageName]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/internalappsharing/{packageName}/artifacts/apk",
     :uri-template-args {"packageName" packageName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn internalappsharingartifacts-uploadbundle
  "Uploads an app bundle to internal app sharing. If you are using the Google API client libraries, please increase the timeout of the http request before calling this endpoint (a timeout of 2 minutes is recommended). See [Timeouts and Errors](https://developers.google.com/api-client-library/java/google-api-java-client/errors) for an example in java.
https://developers.google.com/android-publisher/v3/reference/rest/v3/internalappsharingartifacts/uploadbundle

packageName <> "
  [packageName]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/internalappsharing/{packageName}/artifacts/bundle",
     :uri-template-args {"packageName" packageName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn reviews-get
  "Gets a single review.
https://developers.google.com/android-publisher/v3/reference/rest/v3/reviews/get

packageName <> 
reviewId <> 

optional:
translationLanguage <string> Language localization code."
  ([packageName reviewId] (reviews-get packageName reviewId nil))
  ([packageName reviewId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/reviews/{reviewId}",
       :uri-template-args
       {"packageName" packageName, "reviewId" reviewId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn reviews-list
  "Lists all reviews.
https://developers.google.com/android-publisher/v3/reference/rest/v3/reviews/list

packageName <> 

optional:
token <string> Pagination token. If empty, list starts at the first review.
startIndex <integer> The index of the first element to return.
maxResults <integer> How many results the list operation should return.
translationLanguage <string> Language localization code."
  ([packageName] (reviews-list packageName nil))
  ([packageName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/reviews",
       :uri-template-args {"packageName" packageName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn reviews-reply
  "Replies to a single review, or updates an existing reply.
https://developers.google.com/android-publisher/v3/reference/rest/v3/reviews/reply

packageName <> 
reviewId <> 
ReviewsReplyRequest:
ReviewsReplyRequest"
  [packageName reviewId ReviewsReplyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/reviews/{reviewId}:reply",
     :uri-template-args
     {"packageName" packageName, "reviewId" reviewId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body ReviewsReplyRequest}))

(defn users-create
  "Grant access for a user to the given developer account.
https://developers.google.com/android-publisher/v3/reference/rest/v3/users/create

parent <> 
User:
User"
  [parent User]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/{+parent}/users",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body User}))

(defn users-list
  "Lists all users with access to a developer account.
https://developers.google.com/android-publisher/v3/reference/rest/v3/users/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return. This must be set to -1 to disable pagination."
  ([parent] (users-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/{+parent}/users",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn users-patch
  "Updates access for the user to the developer account.
https://developers.google.com/android-publisher/v3/reference/rest/v3/users/patch

name <> 
User:
User

optional:
updateMask <string> Optional. The list of fields to be updated."
  ([name User] (users-patch name User nil))
  ([name User optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"],
       :body User})))

(defn users-delete
  "Removes all access for the user to the given developer account.
https://developers.google.com/android-publisher/v3/reference/rest/v3/users/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn grants-create
  "Grant access for a user to the given package.
https://developers.google.com/android-publisher/v3/reference/rest/v3/grants/create

parent <> 
Grant:
Grant"
  [parent Grant]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/{+parent}/grants",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body Grant}))

(defn grants-patch
  "Updates access for the user to the given package.
https://developers.google.com/android-publisher/v3/reference/rest/v3/grants/patch

name <> 
Grant:
Grant

optional:
updateMask <string> Optional. The list of fields to be updated."
  ([name Grant] (grants-patch name Grant nil))
  ([name Grant optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"],
       :body Grant})))

(defn grants-delete
  "Removes all access for the user to the given package or developer account.
https://developers.google.com/android-publisher/v3/reference/rest/v3/grants/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-insert
  "Creates a new edit for an app.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/insert

packageName <> 
AppEdit:
AppEdit"
  [packageName AppEdit]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits",
     :uri-template-args {"packageName" packageName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body AppEdit}))

(defn edits-get
  "Gets an app edit.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/get

packageName <> 
editId <> "
  [packageName editId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}",
     :uri-template-args {"packageName" packageName, "editId" editId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-delete
  "Deletes an app edit.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/delete

packageName <> 
editId <> "
  [packageName editId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}",
     :uri-template-args {"packageName" packageName, "editId" editId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-commit
  "Commits an app edit.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/commit

packageName <> 
editId <> 

optional:
changesNotSentForReview <boolean> Indicates that the changes in this edit will not be reviewed until they are explicitly sent for review from the Google Play Console UI. These changes will be added to any other changes that are not yet sent for review."
  ([packageName editId] (edits-commit packageName editId nil))
  ([packageName editId optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}:commit",
       :uri-template-args {"packageName" packageName, "editId" editId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn edits-validate
  "Validates an app edit.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/validate

packageName <> 
editId <> "
  [packageName editId]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}:validate",
     :uri-template-args {"packageName" packageName, "editId" editId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-expansionfiles-get
  "Fetches the expansion file configuration for the specified APK.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/expansionfiles/get

packageName <> 
editId <> 
apkVersionCode <> 
expansionFileType <> "
  [packageName editId apkVersionCode expansionFileType]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/apks/{apkVersionCode}/expansionFiles/{expansionFileType}",
     :uri-template-args
     {"packageName" packageName,
      "editId" editId,
      "apkVersionCode" apkVersionCode,
      "expansionFileType" expansionFileType},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-expansionfiles-update
  "Updates the APK's expansion file configuration to reference another APK's expansion file. To add a new expansion file use the Upload method.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/expansionfiles/update

packageName <> 
editId <> 
apkVersionCode <> 
expansionFileType <> 
ExpansionFile:
ExpansionFile"
  [packageName editId apkVersionCode expansionFileType ExpansionFile]
  (client/api-request
    {:method :put,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/apks/{apkVersionCode}/expansionFiles/{expansionFileType}",
     :uri-template-args
     {"packageName" packageName,
      "editId" editId,
      "apkVersionCode" apkVersionCode,
      "expansionFileType" expansionFileType},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body ExpansionFile}))

(defn edits-expansionfiles-patch
  "Patches the APK's expansion file configuration to reference another APK's expansion file. To add a new expansion file use the Upload method.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/expansionfiles/patch

packageName <> 
editId <> 
apkVersionCode <> 
expansionFileType <> 
ExpansionFile:
ExpansionFile"
  [packageName editId apkVersionCode expansionFileType ExpansionFile]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/apks/{apkVersionCode}/expansionFiles/{expansionFileType}",
     :uri-template-args
     {"packageName" packageName,
      "editId" editId,
      "apkVersionCode" apkVersionCode,
      "expansionFileType" expansionFileType},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body ExpansionFile}))

(defn edits-expansionfiles-upload
  "Uploads a new expansion file and attaches to the specified APK.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/expansionfiles/upload

packageName <> 
editId <> 
apkVersionCode <> 
expansionFileType <> "
  [packageName editId apkVersionCode expansionFileType]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/apks/{apkVersionCode}/expansionFiles/{expansionFileType}",
     :uri-template-args
     {"packageName" packageName,
      "editId" editId,
      "apkVersionCode" apkVersionCode,
      "expansionFileType" expansionFileType},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-testers-get
  "Gets testers. Note: Testers resource does not support email lists.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/testers/get

packageName <> 
editId <> 
track <> "
  [packageName editId track]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/testers/{track}",
     :uri-template-args
     {"packageName" packageName, "editId" editId, "track" track},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-testers-update
  "Updates testers. Note: Testers resource does not support email lists.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/testers/update

packageName <> 
editId <> 
track <> 
Testers:
Testers"
  [packageName editId track Testers]
  (client/api-request
    {:method :put,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/testers/{track}",
     :uri-template-args
     {"packageName" packageName, "editId" editId, "track" track},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body Testers}))

(defn edits-testers-patch
  "Patches testers. Note: Testers resource does not support email lists.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/testers/patch

packageName <> 
editId <> 
track <> 
Testers:
Testers"
  [packageName editId track Testers]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/testers/{track}",
     :uri-template-args
     {"packageName" packageName, "editId" editId, "track" track},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body Testers}))

(defn edits-tracks-get
  "Gets a track.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/tracks/get

packageName <> 
editId <> 
track <> "
  [packageName editId track]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/tracks/{track}",
     :uri-template-args
     {"packageName" packageName, "editId" editId, "track" track},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-tracks-list
  "Lists all tracks.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/tracks/list

packageName <> 
editId <> "
  [packageName editId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/tracks",
     :uri-template-args {"packageName" packageName, "editId" editId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-tracks-update
  "Updates a track.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/tracks/update

packageName <> 
editId <> 
track <> 
Track:
Track"
  [packageName editId track Track]
  (client/api-request
    {:method :put,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/tracks/{track}",
     :uri-template-args
     {"packageName" packageName, "editId" editId, "track" track},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body Track}))

(defn edits-tracks-patch
  "Patches a track.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/tracks/patch

packageName <> 
editId <> 
track <> 
Track:
Track"
  [packageName editId track Track]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/tracks/{track}",
     :uri-template-args
     {"packageName" packageName, "editId" editId, "track" track},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body Track}))

(defn edits-tracks-create
  "Creates a new track.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/tracks/create

packageName <> 
editId <> 
TrackConfig:
TrackConfig"
  [packageName editId TrackConfig]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/tracks",
     :uri-template-args {"packageName" packageName, "editId" editId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body TrackConfig}))

(defn edits-listings-update
  "Creates or updates a localized store listing.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/listings/update

packageName <> 
editId <> 
language <> 
Listing:
Listing"
  [packageName editId language Listing]
  (client/api-request
    {:method :put,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/listings/{language}",
     :uri-template-args
     {"packageName" packageName, "editId" editId, "language" language},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body Listing}))

(defn edits-listings-patch
  "Patches a localized store listing.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/listings/patch

packageName <> 
editId <> 
language <> 
Listing:
Listing"
  [packageName editId language Listing]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/listings/{language}",
     :uri-template-args
     {"packageName" packageName, "editId" editId, "language" language},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body Listing}))

(defn edits-listings-get
  "Gets a localized store listing.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/listings/get

packageName <> 
editId <> 
language <> "
  [packageName editId language]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/listings/{language}",
     :uri-template-args
     {"packageName" packageName, "editId" editId, "language" language},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-listings-list
  "Lists all localized store listings.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/listings/list

packageName <> 
editId <> "
  [packageName editId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/listings",
     :uri-template-args {"packageName" packageName, "editId" editId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-listings-delete
  "Deletes a localized store listing.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/listings/delete

packageName <> 
editId <> 
language <> "
  [packageName editId language]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/listings/{language}",
     :uri-template-args
     {"packageName" packageName, "editId" editId, "language" language},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-listings-deleteall
  "Deletes all store listings.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/listings/deleteall

packageName <> 
editId <> "
  [packageName editId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/listings",
     :uri-template-args {"packageName" packageName, "editId" editId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-images-list
  "Lists all images. The response may be empty.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/images/list

packageName <> 
editId <> 
language <> 
imageType <> "
  [packageName editId language imageType]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/listings/{language}/{imageType}",
     :uri-template-args
     {"packageName" packageName,
      "editId" editId,
      "language" language,
      "imageType" imageType},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-images-delete
  "Deletes the image (specified by id) from the edit.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/images/delete

packageName <> 
editId <> 
language <> 
imageType <> 
imageId <> "
  [packageName editId language imageType imageId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/listings/{language}/{imageType}/{imageId}",
     :uri-template-args
     {"packageName" packageName,
      "editId" editId,
      "language" language,
      "imageType" imageType,
      "imageId" imageId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-images-deleteall
  "Deletes all images for the specified language and image type. Returns an empty response if no images are found.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/images/deleteall

packageName <> 
editId <> 
language <> 
imageType <> "
  [packageName editId language imageType]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/listings/{language}/{imageType}",
     :uri-template-args
     {"packageName" packageName,
      "editId" editId,
      "language" language,
      "imageType" imageType},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-images-upload
  "Uploads an image of the specified language and image type, and adds to the edit.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/images/upload

packageName <> 
editId <> 
language <> 
imageType <> "
  [packageName editId language imageType]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/listings/{language}/{imageType}",
     :uri-template-args
     {"packageName" packageName,
      "editId" editId,
      "language" language,
      "imageType" imageType},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-apks-upload
  "Uploads an APK and adds to the current edit.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/apks/upload

packageName <> 
editId <> "
  [packageName editId]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/apks",
     :uri-template-args {"packageName" packageName, "editId" editId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-apks-list
  "Lists all current APKs of the app and edit.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/apks/list

packageName <> 
editId <> "
  [packageName editId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/apks",
     :uri-template-args {"packageName" packageName, "editId" editId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-apks-addexternallyhosted
  "Creates a new APK without uploading the APK itself to Google Play, instead hosting the APK at a specified URL. This function is only available to organizations using Managed Play whose application is configured to restrict distribution to the organizations.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/apks/addexternallyhosted

packageName <> 
editId <> 
ApksAddExternallyHostedRequest:
ApksAddExternallyHostedRequest"
  [packageName editId ApksAddExternallyHostedRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/apks/externallyHosted",
     :uri-template-args {"packageName" packageName, "editId" editId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body ApksAddExternallyHostedRequest}))

(defn edits-details-get
  "Gets details of an app.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/details/get

packageName <> 
editId <> "
  [packageName editId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/details",
     :uri-template-args {"packageName" packageName, "editId" editId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-details-update
  "Updates details of an app.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/details/update

packageName <> 
editId <> 
AppDetails:
AppDetails"
  [packageName editId AppDetails]
  (client/api-request
    {:method :put,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/details",
     :uri-template-args {"packageName" packageName, "editId" editId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body AppDetails}))

(defn edits-details-patch
  "Patches details of an app.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/details/patch

packageName <> 
editId <> 
AppDetails:
AppDetails"
  [packageName editId AppDetails]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/details",
     :uri-template-args {"packageName" packageName, "editId" editId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body AppDetails}))

(defn edits-deobfuscationfiles-upload
  "Uploads a new deobfuscation file and attaches to the specified APK.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/deobfuscationfiles/upload

packageName <> 
editId <> 
apkVersionCode <> 
deobfuscationFileType <> "
  [packageName editId apkVersionCode deobfuscationFileType]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/apks/{apkVersionCode}/deobfuscationFiles/{deobfuscationFileType}",
     :uri-template-args
     {"packageName" packageName,
      "editId" editId,
      "apkVersionCode" apkVersionCode,
      "deobfuscationFileType" deobfuscationFileType},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-bundles-list
  "Lists all current Android App Bundles of the app and edit.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/bundles/list

packageName <> 
editId <> "
  [packageName editId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/bundles",
     :uri-template-args {"packageName" packageName, "editId" editId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn edits-bundles-upload
  "Uploads a new Android App Bundle to this edit. If you are using the Google API client libraries, please increase the timeout of the http request before calling this endpoint (a timeout of 2 minutes is recommended). See [Timeouts and Errors](https://developers.google.com/api-client-library/java/google-api-java-client/errors) for an example in java.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/bundles/upload

packageName <> 
editId <> 

optional:
ackBundleInstallationWarning <boolean> Must be set to true if the app bundle installation may trigger a warning on user devices (for example, if installation size may be over a threshold, typically 100 MB).
deviceTierConfigId <string> Device tier config (DTC) to be used for generating deliverables (APKs). Contains id of the DTC or \"LATEST\" for last uploaded DTC."
  ([packageName editId] (edits-bundles-upload packageName editId nil))
  ([packageName editId optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/bundles",
       :uri-template-args {"packageName" packageName, "editId" editId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn edits-countryavailability-get
  "Gets country availability.
https://developers.google.com/android-publisher/v3/reference/rest/v3/edits/countryavailability/get

packageName <> 
editId <> 
track <> "
  [packageName editId track]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/edits/{editId}/countryAvailability/{track}",
     :uri-template-args
     {"packageName" packageName, "editId" editId, "track" track},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn generatedapks-list
  "Returns download metadata for all APKs that were generated from a given app bundle.
https://developers.google.com/android-publisher/v3/reference/rest/v3/generatedapks/list

packageName <> 
versionCode <> "
  [packageName versionCode]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/generatedApks/{versionCode}",
     :uri-template-args
     {"packageName" packageName, "versionCode" versionCode},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn generatedapks-download
  "Downloads a single signed APK generated from an app bundle.
https://developers.google.com/android-publisher/v3/reference/rest/v3/generatedapks/download

packageName <> 
versionCode <> 
downloadId <> "
  [packageName versionCode downloadId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/generatedApks/{versionCode}/downloads/{downloadId}:download",
     :uri-template-args
     {"packageName" packageName,
      "versionCode" versionCode,
      "downloadId" downloadId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn externaltransactions-createexternaltransaction
  "Creates a new external transaction.
https://developers.google.com/android-publisher/v3/reference/rest/v3/externaltransactions/createexternaltransaction

parent <> 
ExternalTransaction:
ExternalTransaction

optional:
externalTransactionId <string> Required. The id to use for the external transaction. Must be unique across all other transactions for the app. This value should be 1-63 characters and valid characters are /a-zA-Z0-9_-/. Do not use this field to store any Personally Identifiable Information (PII) such as emails. Attempting to store PII in this field may result in requests being blocked."
  ([parent ExternalTransaction]
    (externaltransactions-createexternaltransaction
      parent
      ExternalTransaction
      nil))
  ([parent ExternalTransaction optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/{+parent}/externalTransactions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"],
       :body ExternalTransaction})))

(defn externaltransactions-refundexternaltransaction
  "Refunds or partially refunds an existing external transaction.
https://developers.google.com/android-publisher/v3/reference/rest/v3/externaltransactions/refundexternaltransaction

name <> 
RefundExternalTransactionRequest:
RefundExternalTransactionRequest"
  [name RefundExternalTransactionRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/{+name}:refund",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body RefundExternalTransactionRequest}))

(defn externaltransactions-getexternaltransaction
  "Gets an existing external transaction.
https://developers.google.com/android-publisher/v3/reference/rest/v3/externaltransactions/getexternaltransaction

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn inappproducts-list
  "Lists all in-app products - both managed products and subscriptions. If an app has a large number of in-app products, the response may be paginated. In this case the response field `tokenPagination.nextPageToken` will be set and the caller should provide its value as a `token` request parameter to retrieve the next page. This method should no longer be used to retrieve subscriptions. See [this article](https://android-developers.googleblog.com/2023/06/changes-to-google-play-developer-api-june-2023.html) for more information.
https://developers.google.com/android-publisher/v3/reference/rest/v3/inappproducts/list

packageName <> 

optional:
token <string> Pagination token. If empty, list starts at the first product.
startIndex <integer> Deprecated and ignored. Set the `token` parameter to retrieve the next page.
maxResults <integer> Deprecated and ignored. The page size is determined by the server."
  ([packageName] (inappproducts-list packageName nil))
  ([packageName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/inappproducts",
       :uri-template-args {"packageName" packageName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn inappproducts-delete
  "Deletes an in-app product (a managed product or a subscription). This method should no longer be used to delete subscriptions. See [this article](https://android-developers.googleblog.com/2023/06/changes-to-google-play-developer-api-june-2023.html) for more information.
https://developers.google.com/android-publisher/v3/reference/rest/v3/inappproducts/delete

packageName <> 
sku <> 

optional:
latencyTolerance <string> Optional. The latency tolerance for the propagation of this product update. Defaults to latency-sensitive."
  ([packageName sku] (inappproducts-delete packageName sku nil))
  ([packageName sku optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/inappproducts/{sku}",
       :uri-template-args {"packageName" packageName, "sku" sku},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn inappproducts-batchUpdate
  "Updates or inserts one or more in-app products (managed products or subscriptions). Set the latencyTolerance field on nested requests to PRODUCT_UPDATE_LATENCY_TOLERANCE_LATENCY_TOLERANT to achieve maximum update throughput. This method should no longer be used to update subscriptions. See [this article](https://android-developers.googleblog.com/2023/06/changes-to-google-play-developer-api-june-2023.html) for more information.
https://developers.google.com/android-publisher/v3/reference/rest/v3/inappproducts/batchUpdate

packageName <> 
InappproductsBatchUpdateRequest:
InappproductsBatchUpdateRequest"
  [packageName InappproductsBatchUpdateRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/inappproducts:batchUpdate",
     :uri-template-args {"packageName" packageName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body InappproductsBatchUpdateRequest}))

(defn inappproducts-update
  "Updates an in-app product (a managed product or a subscription). This method should no longer be used to update subscriptions. See [this article](https://android-developers.googleblog.com/2023/06/changes-to-google-play-developer-api-june-2023.html) for more information.
https://developers.google.com/android-publisher/v3/reference/rest/v3/inappproducts/update

packageName <> 
sku <> 
InAppProduct:
InAppProduct

optional:
autoConvertMissingPrices <boolean> If true the prices for all regions targeted by the parent app that don't have a price specified for this in-app product will be auto converted to the target currency based on the default price. Defaults to false.
allowMissing <boolean> If set to true, and the in-app product with the given package_name and sku doesn't exist, the in-app product will be created.
latencyTolerance <string> Optional. The latency tolerance for the propagation of this product update. Defaults to latency-sensitive."
  ([packageName sku InAppProduct]
    (inappproducts-update packageName sku InAppProduct nil))
  ([packageName sku InAppProduct optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/inappproducts/{sku}",
       :uri-template-args {"packageName" packageName, "sku" sku},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"],
       :body InAppProduct})))

(defn inappproducts-patch
  "Patches an in-app product (a managed product or a subscription). This method should no longer be used to update subscriptions. See [this article](https://android-developers.googleblog.com/2023/06/changes-to-google-play-developer-api-june-2023.html) for more information.
https://developers.google.com/android-publisher/v3/reference/rest/v3/inappproducts/patch

packageName <> 
sku <> 
InAppProduct:
InAppProduct

optional:
autoConvertMissingPrices <boolean> If true the prices for all regions targeted by the parent app that don't have a price specified for this in-app product will be auto converted to the target currency based on the default price. Defaults to false.
latencyTolerance <string> Optional. The latency tolerance for the propagation of this product update. Defaults to latency-sensitive."
  ([packageName sku InAppProduct]
    (inappproducts-patch packageName sku InAppProduct nil))
  ([packageName sku InAppProduct optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/inappproducts/{sku}",
       :uri-template-args {"packageName" packageName, "sku" sku},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"],
       :body InAppProduct})))

(defn inappproducts-batchGet
  "Reads multiple in-app products, which can be managed products or subscriptions. This method should not be used to retrieve subscriptions. See [this article](https://android-developers.googleblog.com/2023/06/changes-to-google-play-developer-api-june-2023.html) for more information.
https://developers.google.com/android-publisher/v3/reference/rest/v3/inappproducts/batchGet

packageName <> 

optional:
sku <string> Unique identifier for the in-app products."
  ([packageName] (inappproducts-batchGet packageName nil))
  ([packageName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/inappproducts:batchGet",
       :uri-template-args {"packageName" packageName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn inappproducts-insert
  "Creates an in-app product (a managed product or a subscription). This method should no longer be used to create subscriptions. See [this article](https://android-developers.googleblog.com/2023/06/changes-to-google-play-developer-api-june-2023.html) for more information.
https://developers.google.com/android-publisher/v3/reference/rest/v3/inappproducts/insert

packageName <> 
InAppProduct:
InAppProduct

optional:
autoConvertMissingPrices <boolean> If true the prices for all regions targeted by the parent app that don't have a price specified for this in-app product will be auto converted to the target currency based on the default price. Defaults to false."
  ([packageName InAppProduct]
    (inappproducts-insert packageName InAppProduct nil))
  ([packageName InAppProduct optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/inappproducts",
       :uri-template-args {"packageName" packageName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"],
       :body InAppProduct})))

(defn inappproducts-get
  "Gets an in-app product, which can be a managed product or a subscription. This method should no longer be used to retrieve subscriptions. See [this article](https://android-developers.googleblog.com/2023/06/changes-to-google-play-developer-api-june-2023.html) for more information.
https://developers.google.com/android-publisher/v3/reference/rest/v3/inappproducts/get

packageName <> 
sku <> "
  [packageName sku]
  (client/api-request
    {:method :get,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/inappproducts/{sku}",
     :uri-template-args {"packageName" packageName, "sku" sku},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn inappproducts-batchDelete
  "Deletes in-app products (managed products or subscriptions). Set the latencyTolerance field on nested requests to PRODUCT_UPDATE_LATENCY_TOLERANCE_LATENCY_TOLERANT to achieve maximum update throughput. This method should not be used to delete subscriptions. See [this article](https://android-developers.googleblog.com/2023/06/changes-to-google-play-developer-api-june-2023.html) for more information.
https://developers.google.com/android-publisher/v3/reference/rest/v3/inappproducts/batchDelete

packageName <> 
InappproductsBatchDeleteRequest:
InappproductsBatchDeleteRequest"
  [packageName InappproductsBatchDeleteRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/inappproducts:batchDelete",
     :uri-template-args {"packageName" packageName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body InappproductsBatchDeleteRequest}))

(defn orders-refund
  "Refunds a user's subscription or in-app purchase order. Orders older than 3 years cannot be refunded.
https://developers.google.com/android-publisher/v3/reference/rest/v3/orders/refund

packageName <> 
orderId <> 

optional:
revoke <boolean> Whether to revoke the purchased item. If set to true, access to the subscription or in-app item will be terminated immediately. If the item is a recurring subscription, all future payments will also be terminated. Consumed in-app items need to be handled by developer's app. (optional)."
  ([packageName orderId] (orders-refund packageName orderId nil))
  ([packageName orderId optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://androidpublisher.googleapis.com/androidpublisher/v3/applications/{packageName}/orders/{orderId}:refund",
       :uri-template-args
       {"packageName" packageName, "orderId" orderId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))
