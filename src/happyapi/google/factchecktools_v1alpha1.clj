(ns happyapi.google.factchecktools-v1alpha1
  "Fact Check Tools API

See: https://developers.google.com/fact-check/tools/api/")

(defn claims-imageSearch
  "Search through fact-checked claims using an image as the query.
https://developers.google.com/fact-check/tools/api/v1alpha1/reference/rest/v1alpha1/claims/imageSearch

optional:
imageUri <string> Required. The URI of the source image. This must be a publicly-accessible image HTTP/HTTPS URL. When fetching images from HTTP/HTTPS URLs, Google cannot guarantee that the request will be completed. Your request may fail if the specified host denies the request (e.g. due to request throttling or DOS prevention), or if Google throttles requests to the site for abuse prevention. You should not depend on externally-hosted images for production applications.
pageSize <integer> Optional. The pagination size. We will return up to that many results. Defaults to 10 if not set.
offset <integer> Optional. An integer that specifies the current offset (that is, starting result location) in search results. This field is only considered if `page_token` is unset. For example, 0 means to return results starting from the first matching result, and 10 means to return from the 11th result.
languageCode <string> Optional. The BCP-47 language code, such as \"en-US\" or \"sr-Latn\". Can be used to restrict results by language, though we do not currently consider the region."
  ([] (claims-imageSearch nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://factchecktools.googleapis.com/v1alpha1/claims:imageSearch",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes nil}))

(defn claims-search
  "Search through fact-checked claims.
https://developers.google.com/fact-check/tools/api/v1alpha1/reference/rest/v1alpha1/claims/search

optional:
pageSize <integer> The pagination size. We will return up to that many results. Defaults to 10 if not set.
reviewPublisherSiteFilter <string> The review publisher site to filter results by, e.g. nytimes.com.
languageCode <string> The BCP-47 language code, such as \"en-US\" or \"sr-Latn\". Can be used to restrict results by language, though we do not currently consider the region.
query <string> Textual query string. Required unless `review_publisher_site_filter` is specified.
offset <integer> An integer that specifies the current offset (that is, starting result location) in search results. This field is only considered if `page_token` is unset. For example, 0 means to return results starting from the first matching result, and 10 means to return from the 11th result.
maxAgeDays <integer> The maximum age of the returned search results, in days. Age is determined by either claim date or review date, whichever is newer."
  ([] (claims-search nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://factchecktools.googleapis.com/v1alpha1/claims:search",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes nil}))

(defn pages-get
  "Get all `ClaimReview` markup on a page.
https://developers.google.com/fact-check/tools/api/v1alpha1/reference/rest/v1alpha1/pages/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://factchecktools.googleapis.com/v1alpha1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/factchecktools"
    "https://www.googleapis.com/auth/userinfo.email"]})

(defn pages-update
  "Update for all `ClaimReview` markup on a page Note that this is a full update. To retain the existing `ClaimReview` markup on a page, first perform a Get operation, then modify the returned markup, and finally call Update with the entire `ClaimReview` markup as the body.
https://developers.google.com/fact-check/tools/api/v1alpha1/reference/rest/v1alpha1/pages/update

name <> 
GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage:
GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage"
  [name GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  {:method :put,
   :uri-template
   "https://factchecktools.googleapis.com/v1alpha1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/factchecktools"
    "https://www.googleapis.com/auth/userinfo.email"],
   :body GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage})

(defn pages-list
  "List the `ClaimReview` markup pages for a specific URL or for an organization.
https://developers.google.com/fact-check/tools/api/v1alpha1/reference/rest/v1alpha1/pages/list

optional:
url <string> The URL from which to get `ClaimReview` markup. There will be at most one result. If markup is associated with a more canonical version of the URL provided, we will return that URL instead. Cannot be specified along with an organization.
pageSize <integer> The pagination size. We will return up to that many results. Defaults to 10 if not set. Has no effect if a URL is requested.
offset <integer> An integer that specifies the current offset (that is, starting result location) in search results. This field is only considered if `page_token` is unset, and if the request is not for a specific URL. For example, 0 means to return results starting from the first matching result, and 10 means to return from the 11th result.
organization <string> The organization for which we want to fetch markups for. For instance, \"site.com\". Cannot be specified along with an URL."
  ([] (pages-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://factchecktools.googleapis.com/v1alpha1/pages",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/factchecktools"
      "https://www.googleapis.com/auth/userinfo.email"]}))

(defn pages-delete
  "Delete all `ClaimReview` markup on a page.
https://developers.google.com/fact-check/tools/api/v1alpha1/reference/rest/v1alpha1/pages/delete

name <> "
  [name]
  {:method :delete,
   :uri-template
   "https://factchecktools.googleapis.com/v1alpha1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/factchecktools"
    "https://www.googleapis.com/auth/userinfo.email"]})

(defn pages-create
  "Create `ClaimReview` markup on a page.
https://developers.google.com/fact-check/tools/api/v1alpha1/reference/rest/v1alpha1/pages/create

GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage:
GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage"
  [GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  {:method :post,
   :uri-template
   "https://factchecktools.googleapis.com/v1alpha1/pages",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/factchecktools"
    "https://www.googleapis.com/auth/userinfo.email"],
   :body GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage})
