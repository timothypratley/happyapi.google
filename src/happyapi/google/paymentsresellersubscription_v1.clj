(ns happyapi.google.paymentsresellersubscription-v1
  "Payments Reseller Subscription API

See: https://developers.google.com/payments/reseller/subscription/")

(defn partners-subscriptions-entitle
  "Used by partners to entitle a previously provisioned subscription to the current end user. The end user identity is inferred from the authorized credential of the request. This API must be authorized by the end user using OAuth.
https://developers.google.com/payments/reseller/subscription/v1/reference/rest/v1/partners/subscriptions/entitle

name <> 
GoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionRequest:
GoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionRequest"
  [name
   GoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionRequest]
  {:method :post,
   :uri-template
   "https://paymentsresellersubscription.googleapis.com/v1/{+name}:entitle",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["openid"],
   :body
   GoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionRequest})

(defn partners-subscriptions-extend
  "[Opt-in only] Most partners should be on auto-extend by default. Used by partners to extend a subscription service for their customers on an ongoing basis for the subscription to remain active and renewable. It should be called directly by the partner using service accounts.
https://developers.google.com/payments/reseller/subscription/v1/reference/rest/v1/partners/subscriptions/extend

name <> 
GoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest:
GoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest"
  [name
   GoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest]
  {:method :post,
   :uri-template
   "https://paymentsresellersubscription.googleapis.com/v1/{+name}:extend",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["openid"],
   :body
   GoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest})

(defn partners-subscriptions-get
  "Used by partners to get a subscription by id. It should be called directly by the partner using service accounts.
https://developers.google.com/payments/reseller/subscription/v1/reference/rest/v1/partners/subscriptions/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://paymentsresellersubscription.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["openid"]})

(defn partners-subscriptions-provision
  "Used by partners to provision a subscription for their customers. This creates a subscription without associating it with the end user account. EntitleSubscription must be called separately using OAuth in order for the end user account to be associated with the subscription. It should be called directly by the partner using service accounts.
https://developers.google.com/payments/reseller/subscription/v1/reference/rest/v1/partners/subscriptions/provision

parent <> 
GoogleCloudPaymentsResellerSubscriptionV1Subscription:
GoogleCloudPaymentsResellerSubscriptionV1Subscription

optional:
subscriptionId <string> Required. Identifies the subscription resource on the Partner side. The value is restricted to 63 ASCII characters at the maximum. If a subscription was previously created with the same subscription_id, we will directly return that one."
  ([parent GoogleCloudPaymentsResellerSubscriptionV1Subscription]
    (partners-subscriptions-provision
      parent
      GoogleCloudPaymentsResellerSubscriptionV1Subscription
      nil))
  ([parent
    GoogleCloudPaymentsResellerSubscriptionV1Subscription
    optional]
    {:method :post,
     :uri-template
     "https://paymentsresellersubscription.googleapis.com/v1/{+parent}/subscriptions:provision",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["openid"],
     :body GoogleCloudPaymentsResellerSubscriptionV1Subscription}))

(defn partners-subscriptions-undoCancel
  "Revokes the pending cancellation of a subscription, which is currently in `STATE_CANCEL_AT_END_OF_CYCLE` state. If the subscription is already cancelled, the request will fail. - **This API doesn't apply to YouTube subscriptions.** It should be called directly by the partner using service accounts.
https://developers.google.com/payments/reseller/subscription/v1/reference/rest/v1/partners/subscriptions/undoCancel

name <> 
GoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionRequest:
GoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionRequest"
  [name
   GoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionRequest]
  {:method :post,
   :uri-template
   "https://paymentsresellersubscription.googleapis.com/v1/{+name}:undoCancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["openid"],
   :body
   GoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionRequest})

(defn partners-subscriptions-create
  "Used by partners to create a subscription for their customers. The created subscription is associated with the end user inferred from the end user credentials. This API must be authorized by the end user using OAuth.
https://developers.google.com/payments/reseller/subscription/v1/reference/rest/v1/partners/subscriptions/create

parent <> 
GoogleCloudPaymentsResellerSubscriptionV1Subscription:
GoogleCloudPaymentsResellerSubscriptionV1Subscription

optional:
subscriptionId <string> Required. Identifies the subscription resource on the Partner side. The value is restricted to 63 ASCII characters at the maximum. If a subscription was previously created with the same subscription_id, we will directly return that one."
  ([parent GoogleCloudPaymentsResellerSubscriptionV1Subscription]
    (partners-subscriptions-create
      parent
      GoogleCloudPaymentsResellerSubscriptionV1Subscription
      nil))
  ([parent
    GoogleCloudPaymentsResellerSubscriptionV1Subscription
    optional]
    {:method :post,
     :uri-template
     "https://paymentsresellersubscription.googleapis.com/v1/{+parent}/subscriptions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["openid"],
     :body GoogleCloudPaymentsResellerSubscriptionV1Subscription}))

(defn partners-subscriptions-cancel
  "Used by partners to cancel a subscription service either immediately or by the end of the current billing cycle for their customers. It should be called directly by the partner using service accounts.
https://developers.google.com/payments/reseller/subscription/v1/reference/rest/v1/partners/subscriptions/cancel

name <> 
GoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest:
GoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest"
  [name
   GoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest]
  {:method :post,
   :uri-template
   "https://paymentsresellersubscription.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["openid"],
   :body
   GoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest})

(defn partners-promotions-findEligible
  "To find eligible promotions for the current user. The API requires user authorization via OAuth. The bare minimum oauth scope `openid` is sufficient, which will skip the consent screen.
https://developers.google.com/payments/reseller/subscription/v1/reference/rest/v1/partners/promotions/findEligible

parent <> 
GoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsRequest:
GoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsRequest"
  [parent
   GoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsRequest]
  {:method :post,
   :uri-template
   "https://paymentsresellersubscription.googleapis.com/v1/{+parent}/promotions:findEligible",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["openid"],
   :body
   GoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsRequest})

(defn partners-promotions-list
  "Retrieves the promotions, such as free trial, that can be used by the partner. - This API doesn't apply to YouTube promotions currently. It should be autenticated with a service account.
https://developers.google.com/payments/reseller/subscription/v1/reference/rest/v1/partners/promotions/list

parent <> 

optional:
filter <string> Optional. Specifies the filters for the promotion results. The syntax is defined in https://google.aip.dev/160 with the following caveats: 1. Only the following features are supported: - Logical operator `AND` - Comparison operator `=` (no wildcards `*`) - Traversal operator `.` - Has operator `:` (no wildcards `*`) 2. Only the following fields are supported: - `applicableProducts` - `regionCodes` - `youtubePayload.partnerEligibilityId` - `youtubePayload.postalCode` 3. Unless explicitly mentioned above, other features are not supported. Example: `applicableProducts:partners/partner1/products/product1 AND regionCodes:US AND youtubePayload.postalCode=94043 AND youtubePayload.partnerEligibilityId=eligibility-id`
pageSize <integer> Optional. The maximum number of promotions to return. The service may return fewer than this value. If unspecified, at most 50 products will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (partners-promotions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://paymentsresellersubscription.googleapis.com/v1/{+parent}/promotions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["openid"]}))

(defn partners-products-list
  "To retrieve the products that can be resold by the partner. It should be autenticated with a service account. - This API doesn't apply to YouTube products currently.
https://developers.google.com/payments/reseller/subscription/v1/reference/rest/v1/partners/products/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of products to return. The service may return fewer than this value. If unspecified, at most 50 products will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Optional. Specifies the filters for the product results. The syntax is defined in https://google.aip.dev/160 with the following caveats: 1. Only the following features are supported: - Logical operator `AND` - Comparison operator `=` (no wildcards `*`) - Traversal operator `.` - Has operator `:` (no wildcards `*`) 2. Only the following fields are supported: - `regionCodes` - `youtubePayload.partnerEligibilityId` - `youtubePayload.postalCode` 3. Unless explicitly mentioned above, other features are not supported. Example: `regionCodes:US AND youtubePayload.postalCode=94043 AND youtubePayload.partnerEligibilityId=eligibility-id`"
  ([parent] (partners-products-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://paymentsresellersubscription.googleapis.com/v1/{+parent}/products",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["openid"]}))
