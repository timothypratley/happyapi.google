(ns happyapi.google.adsenseplatform-v1
  "AdSense Platform API

See: https://developers.google.com/adsense/platforms/")

(defn platforms-accounts-get
  "Gets information about the selected sub-account.
https://developers.google.com/adsense/platforms/v1/reference/rest/v1/platforms/accounts/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://adsenseplatform.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/adsense"
    "https://www.googleapis.com/auth/adsense.readonly"]})

(defn platforms-accounts-lookup
  "Looks up information about a sub-account for a specified creation_request_id. If no account exists for the given creation_request_id, returns 404.
https://developers.google.com/adsense/platforms/v1/reference/rest/v1/platforms/accounts/lookup

parent <> 

optional:
creationRequestId <string> Optional. The creation_request_id provided when calling createAccount."
  ([parent] (platforms-accounts-lookup parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://adsenseplatform.googleapis.com/v1/{+parent}/accounts:lookup",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/adsense"
      "https://www.googleapis.com/auth/adsense.readonly"]}))

(defn platforms-accounts-list
  "Lists a partial view of sub-accounts for a specific parent account.
https://developers.google.com/adsense/platforms/v1/reference/rest/v1/platforms/accounts/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of accounts to include in the response, used for paging. If unspecified, at most 10000 accounts will be returned. The maximum value is 10000; values above 10000 will be coerced to 10000."
  ([parent] (platforms-accounts-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://adsenseplatform.googleapis.com/v1/{+parent}/accounts",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/adsense"
      "https://www.googleapis.com/auth/adsense.readonly"]}))

(defn platforms-accounts-create
  "Creates a sub-account.
https://developers.google.com/adsense/platforms/v1/reference/rest/v1/platforms/accounts/create

parent <> 
Account:
Account"
  [parent Account]
  {:method :post,
   :uri-template
   "https://adsenseplatform.googleapis.com/v1/{+parent}/accounts",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsense"],
   :body Account})

(defn platforms-accounts-close
  "Closes a sub-account.
https://developers.google.com/adsense/platforms/v1/reference/rest/v1/platforms/accounts/close

name <> 
CloseAccountRequest:
CloseAccountRequest"
  [name CloseAccountRequest]
  {:method :post,
   :uri-template
   "https://adsenseplatform.googleapis.com/v1/{+name}:close",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsense"],
   :body CloseAccountRequest})

(defn platforms-accounts-events-create
  "Creates an account event.
https://developers.google.com/adsense/platforms/v1/reference/rest/v1/platforms/accounts/events/create

parent <> 
Event:
Event"
  [parent Event]
  {:method :post,
   :uri-template
   "https://adsenseplatform.googleapis.com/v1/{+parent}/events",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsense"],
   :body Event})

(defn platforms-accounts-sites-get
  "Gets a site from a specified sub-account.
https://developers.google.com/adsense/platforms/v1/reference/rest/v1/platforms/accounts/sites/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://adsenseplatform.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/adsense"
    "https://www.googleapis.com/auth/adsense.readonly"]})

(defn platforms-accounts-sites-list
  "Lists sites for a specific account.
https://developers.google.com/adsense/platforms/v1/reference/rest/v1/platforms/accounts/sites/list

parent <> 

optional:
pageSize <integer> The maximum number of sites to include in the response, used for paging. If unspecified, at most 10000 sites will be returned. The maximum value is 10000; values above 10000 will be coerced to 10000."
  ([parent] (platforms-accounts-sites-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://adsenseplatform.googleapis.com/v1/{+parent}/sites",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/adsense"
      "https://www.googleapis.com/auth/adsense.readonly"]}))

(defn platforms-accounts-sites-create
  "Creates a site for a specified account.
https://developers.google.com/adsense/platforms/v1/reference/rest/v1/platforms/accounts/sites/create

parent <> 
Site:
Site"
  [parent Site]
  {:method :post,
   :uri-template
   "https://adsenseplatform.googleapis.com/v1/{+parent}/sites",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsense"],
   :body Site})

(defn platforms-accounts-sites-requestReview
  "Requests the review of a site. The site should be in REQUIRES_REVIEW or NEEDS_ATTENTION state. Note: Make sure you place an [ad tag](https://developers.google.com/adsense/platforms/direct/ad-tags) on your site before requesting a review.
https://developers.google.com/adsense/platforms/v1/reference/rest/v1/platforms/accounts/sites/requestReview

name <> "
  [name]
  {:method :post,
   :uri-template
   "https://adsenseplatform.googleapis.com/v1/{+name}:requestReview",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsense"]})

(defn platforms-accounts-sites-delete
  "Deletes a site from a specified account.
https://developers.google.com/adsense/platforms/v1/reference/rest/v1/platforms/accounts/sites/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://adsenseplatform.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/adsense"]})
