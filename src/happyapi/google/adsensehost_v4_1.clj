(ns happyapi.google.adsensehost-v4-1
  "AdSense Host API
Generates performance reports, generates ad codes, and provides publisher management capabilities for AdSense Hosts.
See: https://developers.google.com/adsense/host/")

(defn accounts-get
  "Get information about the selected associated AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/accounts/get

accountId <> "
  [accountId]
  {:method :get,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/accounts/{accountId}",
   :uri-template-args {"accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsensehost"]})

(defn accounts-list
  "List hosted accounts associated with this AdSense account by ad client id.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/accounts/list

filterAdClientId <> "
  [filterAdClientId]
  {:method :get,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/accounts",
   :uri-template-args {},
   :query-params {"filterAdClientId" filterAdClientId},
   :scopes ["https://www.googleapis.com/auth/adsensehost"]})

(defn accounts-adclients-get
  "Get information about one of the ad clients in the specified publisher's AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/accounts/adclients/get

accountId <> 
adClientId <> "
  [accountId adClientId]
  {:method :get,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/accounts/{accountId}/adclients/{adClientId}",
   :uri-template-args {"accountId" accountId, "adClientId" adClientId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsensehost"]})

(defn accounts-adclients-list
  "List all hosted ad clients in the specified hosted account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/accounts/adclients/list

accountId <> 

optional:
maxResults <integer> The maximum number of ad clients to include in the response, used for paging."
  ([accountId] (accounts-adclients-list accountId nil))
  ([accountId optional]
    {:method :get,
     :uri-template
     "https://www.googleapis.com/adsensehost/v4.1/accounts/{accountId}/adclients",
     :uri-template-args {"accountId" accountId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/adsensehost"]}))

(defn accounts-adunits-delete
  "Delete the specified ad unit from the specified publisher AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/accounts/adunits/delete

accountId <> 
adClientId <> 
adUnitId <> "
  [accountId adClientId adUnitId]
  {:method :delete,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/accounts/{accountId}/adclients/{adClientId}/adunits/{adUnitId}",
   :uri-template-args
   {"accountId" accountId,
    "adClientId" adClientId,
    "adUnitId" adUnitId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsensehost"]})

(defn accounts-adunits-get
  "Get the specified host ad unit in this AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/accounts/adunits/get

accountId <> 
adClientId <> 
adUnitId <> "
  [accountId adClientId adUnitId]
  {:method :get,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/accounts/{accountId}/adclients/{adClientId}/adunits/{adUnitId}",
   :uri-template-args
   {"accountId" accountId,
    "adClientId" adClientId,
    "adUnitId" adUnitId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsensehost"]})

(defn accounts-adunits-getAdCode
  "Get ad code for the specified ad unit, attaching the specified host custom channels.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/accounts/adunits/getAdCode

accountId <> 
adClientId <> 
adUnitId <> 

optional:
hostCustomChannelId <string> Host custom channel to attach to the ad code."
  ([accountId adClientId adUnitId]
    (accounts-adunits-getAdCode accountId adClientId adUnitId nil))
  ([accountId adClientId adUnitId optional]
    {:method :get,
     :uri-template
     "https://www.googleapis.com/adsensehost/v4.1/accounts/{accountId}/adclients/{adClientId}/adunits/{adUnitId}/adcode",
     :uri-template-args
     {"accountId" accountId,
      "adClientId" adClientId,
      "adUnitId" adUnitId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/adsensehost"]}))

(defn accounts-adunits-insert
  "Insert the supplied ad unit into the specified publisher AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/accounts/adunits/insert

accountId <> 
adClientId <> 
AdUnit:
AdUnit"
  [accountId adClientId AdUnit]
  {:method :post,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/accounts/{accountId}/adclients/{adClientId}/adunits",
   :uri-template-args {"accountId" accountId, "adClientId" adClientId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsensehost"],
   :body AdUnit})

(defn accounts-adunits-list
  "List all ad units in the specified publisher's AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/accounts/adunits/list

accountId <> 
adClientId <> 

optional:
includeInactive <boolean> Whether to include inactive ad units. Default: true.
maxResults <integer> The maximum number of ad units to include in the response, used for paging."
  ([accountId adClientId]
    (accounts-adunits-list accountId adClientId nil))
  ([accountId adClientId optional]
    {:method :get,
     :uri-template
     "https://www.googleapis.com/adsensehost/v4.1/accounts/{accountId}/adclients/{adClientId}/adunits",
     :uri-template-args
     {"accountId" accountId, "adClientId" adClientId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/adsensehost"]}))

(defn accounts-adunits-patch
  "Update the supplied ad unit in the specified publisher AdSense account. This method supports patch semantics.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/accounts/adunits/patch

accountId <> 
adClientId <> 
adUnitId <> 
AdUnit:
AdUnit"
  [accountId adClientId adUnitId AdUnit]
  {:method :patch,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/accounts/{accountId}/adclients/{adClientId}/adunits",
   :uri-template-args {"accountId" accountId, "adClientId" adClientId},
   :query-params {"adUnitId" adUnitId},
   :scopes ["https://www.googleapis.com/auth/adsensehost"],
   :body AdUnit})

(defn accounts-adunits-update
  "Update the supplied ad unit in the specified publisher AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/accounts/adunits/update

accountId <> 
adClientId <> 
AdUnit:
AdUnit"
  [accountId adClientId AdUnit]
  {:method :put,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/accounts/{accountId}/adclients/{adClientId}/adunits",
   :uri-template-args {"accountId" accountId, "adClientId" adClientId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsensehost"],
   :body AdUnit})

(defn accounts-reports-generate
  "Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format specify \"alt=csv\" as a query parameter.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/accounts/reports/generate

accountId <> 
startDate <> 
endDate <> 

optional:
startIndex <integer> Index of the first row of report data to return.
sort <string> The name of a dimension or metric to sort the resulting report on, optionally prefixed with \"+\" to sort ascending or \"-\" to sort descending. If no prefix is specified, the column is sorted ascending.
maxResults <integer> The maximum number of rows of report data to return.
locale <string> Optional locale to use for translating report output to a local language. Defaults to \"en_US\" if not specified.
filter <string> Filters to be run on the report.
metric <string> Numeric columns to include in the report.
dimension <string> Dimensions to base the report on."
  ([accountId startDate endDate]
    (accounts-reports-generate accountId startDate endDate nil))
  ([accountId startDate endDate optional]
    {:method :get,
     :uri-template
     "https://www.googleapis.com/adsensehost/v4.1/accounts/{accountId}/reports",
     :uri-template-args {"accountId" accountId},
     :query-params
     (merge {"startDate" startDate, "endDate" endDate} optional),
     :scopes ["https://www.googleapis.com/auth/adsensehost"]}))

(defn adclients-get
  "Get information about one of the ad clients in the Host AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/adclients/get

adClientId <> "
  [adClientId]
  {:method :get,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/adclients/{adClientId}",
   :uri-template-args {"adClientId" adClientId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsensehost"]})

(defn adclients-list
  "List all host ad clients in this AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/adclients/list

optional:
maxResults <integer> The maximum number of ad clients to include in the response, used for paging."
  ([] (adclients-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://www.googleapis.com/adsensehost/v4.1/adclients",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/adsensehost"]}))

(defn associationsessions-start
  "Create an association session for initiating an association with an AdSense user.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/associationsessions/start

productCode <> 
websiteUrl <> 

optional:
callbackUrl <string> The URL to redirect the user to once association is completed. It receives a token parameter that can then be used to retrieve the associated account.
userLocale <string> The preferred locale of the user.
websiteLocale <string> The locale of the user's hosted website."
  ([productCode websiteUrl]
    (associationsessions-start productCode websiteUrl nil))
  ([productCode websiteUrl optional]
    {:method :get,
     :uri-template
     "https://www.googleapis.com/adsensehost/v4.1/associationsessions/start",
     :uri-template-args {},
     :query-params
     (merge
       {"productCode" productCode, "websiteUrl" websiteUrl}
       optional),
     :scopes ["https://www.googleapis.com/auth/adsensehost"]}))

(defn associationsessions-verify
  "Verify an association session after the association callback returns from AdSense signup.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/associationsessions/verify

token <> "
  [token]
  {:method :get,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/associationsessions/verify",
   :uri-template-args {},
   :query-params {"token" token},
   :scopes ["https://www.googleapis.com/auth/adsensehost"]})

(defn customchannels-delete
  "Delete a specific custom channel from the host AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/customchannels/delete

adClientId <> 
customChannelId <> "
  [adClientId customChannelId]
  {:method :delete,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/adclients/{adClientId}/customchannels/{customChannelId}",
   :uri-template-args
   {"adClientId" adClientId, "customChannelId" customChannelId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsensehost"]})

(defn customchannels-get
  "Get a specific custom channel from the host AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/customchannels/get

adClientId <> 
customChannelId <> "
  [adClientId customChannelId]
  {:method :get,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/adclients/{adClientId}/customchannels/{customChannelId}",
   :uri-template-args
   {"adClientId" adClientId, "customChannelId" customChannelId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsensehost"]})

(defn customchannels-insert
  "Add a new custom channel to the host AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/customchannels/insert

adClientId <> 
CustomChannel:
CustomChannel"
  [adClientId CustomChannel]
  {:method :post,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/adclients/{adClientId}/customchannels",
   :uri-template-args {"adClientId" adClientId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsensehost"],
   :body CustomChannel})

(defn customchannels-list
  "List all host custom channels in this AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/customchannels/list

adClientId <> 

optional:
maxResults <integer> The maximum number of custom channels to include in the response, used for paging."
  ([adClientId] (customchannels-list adClientId nil))
  ([adClientId optional]
    {:method :get,
     :uri-template
     "https://www.googleapis.com/adsensehost/v4.1/adclients/{adClientId}/customchannels",
     :uri-template-args {"adClientId" adClientId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/adsensehost"]}))

(defn customchannels-patch
  "Update a custom channel in the host AdSense account. This method supports patch semantics.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/customchannels/patch

adClientId <> 
customChannelId <> 
CustomChannel:
CustomChannel"
  [adClientId customChannelId CustomChannel]
  {:method :patch,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/adclients/{adClientId}/customchannels",
   :uri-template-args {"adClientId" adClientId},
   :query-params {"customChannelId" customChannelId},
   :scopes ["https://www.googleapis.com/auth/adsensehost"],
   :body CustomChannel})

(defn customchannels-update
  "Update a custom channel in the host AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/customchannels/update

adClientId <> 
CustomChannel:
CustomChannel"
  [adClientId CustomChannel]
  {:method :put,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/adclients/{adClientId}/customchannels",
   :uri-template-args {"adClientId" adClientId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsensehost"],
   :body CustomChannel})

(defn reports-generate
  "Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format specify \"alt=csv\" as a query parameter.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/reports/generate

startDate <> 
endDate <> 

optional:
startIndex <integer> Index of the first row of report data to return.
sort <string> The name of a dimension or metric to sort the resulting report on, optionally prefixed with \"+\" to sort ascending or \"-\" to sort descending. If no prefix is specified, the column is sorted ascending.
maxResults <integer> The maximum number of rows of report data to return.
locale <string> Optional locale to use for translating report output to a local language. Defaults to \"en_US\" if not specified.
filter <string> Filters to be run on the report.
metric <string> Numeric columns to include in the report.
dimension <string> Dimensions to base the report on."
  ([startDate endDate] (reports-generate startDate endDate nil))
  ([startDate endDate optional]
    {:method :get,
     :uri-template
     "https://www.googleapis.com/adsensehost/v4.1/reports",
     :uri-template-args {},
     :query-params
     (merge {"startDate" startDate, "endDate" endDate} optional),
     :scopes ["https://www.googleapis.com/auth/adsensehost"]}))

(defn urlchannels-delete
  "Delete a URL channel from the host AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/urlchannels/delete

adClientId <> 
urlChannelId <> "
  [adClientId urlChannelId]
  {:method :delete,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/adclients/{adClientId}/urlchannels/{urlChannelId}",
   :uri-template-args
   {"adClientId" adClientId, "urlChannelId" urlChannelId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsensehost"]})

(defn urlchannels-insert
  "Add a new URL channel to the host AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/urlchannels/insert

adClientId <> 
UrlChannel:
UrlChannel"
  [adClientId UrlChannel]
  {:method :post,
   :uri-template
   "https://www.googleapis.com/adsensehost/v4.1/adclients/{adClientId}/urlchannels",
   :uri-template-args {"adClientId" adClientId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsensehost"],
   :body UrlChannel})

(defn urlchannels-list
  "List all host URL channels in the host AdSense account.
https://developers.google.com/adsense/host/v4.1/reference/rest/v4.1/urlchannels/list

adClientId <> 

optional:
maxResults <integer> The maximum number of URL channels to include in the response, used for paging."
  ([adClientId] (urlchannels-list adClientId nil))
  ([adClientId optional]
    {:method :get,
     :uri-template
     "https://www.googleapis.com/adsensehost/v4.1/adclients/{adClientId}/urlchannels",
     :uri-template-args {"adClientId" adClientId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/adsensehost"]}))
