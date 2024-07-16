(ns happyapi.google.firebasedynamiclinks-v1
  "Firebase Dynamic Links API
Programmatically creates and manages Firebase Dynamic Links.
See: https://firebase.google.com/docs/dynamic-links/"
  (:require [happyapi.providers.google :as client]))

(defn managedShortLinks-create
  "Creates a managed short Dynamic Link given either a valid long Dynamic Link or details such as Dynamic Link domain, Android and iOS app information. The created short Dynamic Link will not expire. This differs from CreateShortDynamicLink in the following ways: - The request will also contain a name for the link (non unique name for the front end). - The response must be authenticated with an auth token (generated with the admin service account). - The link will appear in the FDL list of links in the console front end. The Dynamic Link domain in the request must be owned by requester's Firebase project.
https://firebase.google.com/docs/dynamic-links/v1/reference/rest/v1/managedShortLinks/create

CreateManagedShortLinkRequest:
CreateManagedShortLinkRequest"
  [CreateManagedShortLinkRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://firebasedynamiclinks.googleapis.com/v1/managedShortLinks:create",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/firebase"],
     :body CreateManagedShortLinkRequest}))

(defn getLinkStats
  "Fetches analytics stats of a short Dynamic Link for a given duration. Metrics include number of clicks, redirects, installs, app first opens, and app reopens.
https://firebase.google.com/docs/dynamic-links/v1/reference/rest/v1/getLinkStats

dynamicLink <> 

optional:
durationDays <string> The span of time requested in days.
sdkVersion <string> Google SDK version. Version takes the form \"$major.$minor.$patch\""
  ([dynamicLink] (getLinkStats dynamicLink nil))
  ([dynamicLink optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://firebasedynamiclinks.googleapis.com/v1/{dynamicLink}/linkStats",
       :uri-template-args {"dynamicLink" dynamicLink},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/firebase"]})))

(defn installAttribution
  "Get iOS strong/weak-match info for post-install attribution.
https://firebase.google.com/docs/dynamic-links/v1/reference/rest/v1/installAttribution

GetIosPostInstallAttributionRequest:
GetIosPostInstallAttributionRequest"
  [GetIosPostInstallAttributionRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://firebasedynamiclinks.googleapis.com/v1/installAttribution",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/firebase"],
     :body GetIosPostInstallAttributionRequest}))

(defn reopenAttribution
  "Get iOS reopen attribution for app universal link open deeplinking.
https://firebase.google.com/docs/dynamic-links/v1/reference/rest/v1/reopenAttribution

GetIosReopenAttributionRequest:
GetIosReopenAttributionRequest"
  [GetIosReopenAttributionRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://firebasedynamiclinks.googleapis.com/v1/reopenAttribution",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/firebase"],
     :body GetIosReopenAttributionRequest}))

(defn shortLinks-create
  "Creates a short Dynamic Link given either a valid long Dynamic Link or details such as Dynamic Link domain, Android and iOS app information. The created short Dynamic Link will not expire. Repeated calls with the same long Dynamic Link or Dynamic Link information will produce the same short Dynamic Link. The Dynamic Link domain in the request must be owned by requester's Firebase project.
https://firebase.google.com/docs/dynamic-links/v1/reference/rest/v1/shortLinks/create

CreateShortDynamicLinkRequest:
CreateShortDynamicLinkRequest"
  [CreateShortDynamicLinkRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://firebasedynamiclinks.googleapis.com/v1/shortLinks",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/firebase"],
     :body CreateShortDynamicLinkRequest}))
