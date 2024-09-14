(ns happyapi.google.searchconsole-v1
  "Google Search Console API
The Search Console API provides access to both Search Console data (verified users only) and to public information on an URL basis (anyone)
See: https://developers.google.com/webmaster-tools/about")

(defn urlTestingTools-mobileFriendlyTest-run
  "Runs Mobile-Friendly Test for a given URL.
https://developers.google.com/webmaster-tools/about/v1/reference/rest/v1/urlTestingTools/mobileFriendlyTest/run

RunMobileFriendlyTestRequest:
RunMobileFriendlyTestRequest"
  [RunMobileFriendlyTestRequest]
  {:method :post,
   :uri-template
   "https://searchconsole.googleapis.com/v1/urlTestingTools/mobileFriendlyTest:run",
   :uri-template-args {},
   :query-params {},
   :scopes nil,
   :body RunMobileFriendlyTestRequest})

(defn urlInspection-index-inspect
  "Index inspection.
https://developers.google.com/webmaster-tools/about/v1/reference/rest/v1/urlInspection/index/inspect

InspectUrlIndexRequest:
InspectUrlIndexRequest"
  [InspectUrlIndexRequest]
  {:method :post,
   :uri-template
   "https://searchconsole.googleapis.com/v1/urlInspection/index:inspect",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/webmasters"
    "https://www.googleapis.com/auth/webmasters.readonly"],
   :body InspectUrlIndexRequest})

(defn sites-get
  " Retrieves information about specific site.
https://developers.google.com/webmaster-tools/about/v1/reference/rest/v1/sites/get

siteUrl <> "
  [siteUrl]
  {:method :get,
   :uri-template
   "https://searchconsole.googleapis.com/webmasters/v3/sites/{siteUrl}",
   :uri-template-args {"siteUrl" siteUrl},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/webmasters"
    "https://www.googleapis.com/auth/webmasters.readonly"]})

(defn sites-delete
  " Removes a site from the set of the user's Search Console sites.
https://developers.google.com/webmaster-tools/about/v1/reference/rest/v1/sites/delete

siteUrl <> "
  [siteUrl]
  {:method :delete,
   :uri-template
   "https://searchconsole.googleapis.com/webmasters/v3/sites/{siteUrl}",
   :uri-template-args {"siteUrl" siteUrl},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/webmasters"]})

(defn sites-add
  " Adds a site to the set of the user's sites in Search Console.
https://developers.google.com/webmaster-tools/about/v1/reference/rest/v1/sites/add

siteUrl <> "
  [siteUrl]
  {:method :put,
   :uri-template
   "https://searchconsole.googleapis.com/webmasters/v3/sites/{siteUrl}",
   :uri-template-args {"siteUrl" siteUrl},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/webmasters"]})

(defn sites-list
  " Lists the user's Search Console sites.
https://developers.google.com/webmaster-tools/about/v1/reference/rest/v1/sites/list"
  []
  {:method :get,
   :uri-template
   "https://searchconsole.googleapis.com/webmasters/v3/sites",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/webmasters"
    "https://www.googleapis.com/auth/webmasters.readonly"]})

(defn searchanalytics-query
  "Query your data with filters and parameters that you define. Returns zero or more rows grouped by the row keys that you define. You must define a date range of one or more days. When date is one of the group by values, any days without data are omitted from the result list. If you need to know which days have data, issue a broad date range query grouped by date for any metric, and see which day rows are returned.
https://developers.google.com/webmaster-tools/about/v1/reference/rest/v1/searchanalytics/query

siteUrl <> 
SearchAnalyticsQueryRequest:
SearchAnalyticsQueryRequest"
  [siteUrl SearchAnalyticsQueryRequest]
  {:method :post,
   :uri-template
   "https://searchconsole.googleapis.com/webmasters/v3/sites/{siteUrl}/searchAnalytics/query",
   :uri-template-args {"siteUrl" siteUrl},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/webmasters"
    "https://www.googleapis.com/auth/webmasters.readonly"],
   :body SearchAnalyticsQueryRequest})

(defn sitemaps-submit
  "Submits a sitemap for a site.
https://developers.google.com/webmaster-tools/about/v1/reference/rest/v1/sitemaps/submit

siteUrl <> 
feedpath <> "
  [siteUrl feedpath]
  {:method :put,
   :uri-template
   "https://searchconsole.googleapis.com/webmasters/v3/sites/{siteUrl}/sitemaps/{feedpath}",
   :uri-template-args {"siteUrl" siteUrl, "feedpath" feedpath},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/webmasters"]})

(defn sitemaps-get
  "Retrieves information about a specific sitemap.
https://developers.google.com/webmaster-tools/about/v1/reference/rest/v1/sitemaps/get

siteUrl <> 
feedpath <> "
  [siteUrl feedpath]
  {:method :get,
   :uri-template
   "https://searchconsole.googleapis.com/webmasters/v3/sites/{siteUrl}/sitemaps/{feedpath}",
   :uri-template-args {"feedpath" feedpath, "siteUrl" siteUrl},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/webmasters"
    "https://www.googleapis.com/auth/webmasters.readonly"]})

(defn sitemaps-delete
  "Deletes a sitemap from the Sitemaps report. Does not stop Google from crawling this sitemap or the URLs that were previously crawled in the deleted sitemap.
https://developers.google.com/webmaster-tools/about/v1/reference/rest/v1/sitemaps/delete

siteUrl <> 
feedpath <> "
  [siteUrl feedpath]
  {:method :delete,
   :uri-template
   "https://searchconsole.googleapis.com/webmasters/v3/sites/{siteUrl}/sitemaps/{feedpath}",
   :uri-template-args {"siteUrl" siteUrl, "feedpath" feedpath},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/webmasters"]})

(defn sitemaps-list
  " Lists the [sitemaps-entries](/webmaster-tools/v3/sitemaps) submitted for this site, or included in the sitemap index file (if `sitemapIndex` is specified in the request).
https://developers.google.com/webmaster-tools/about/v1/reference/rest/v1/sitemaps/list

siteUrl <> 

optional:
sitemapIndex <string>  A URL of a site's sitemap index. For example: `http://www.example.com/sitemapindex.xml`."
  ([siteUrl] (sitemaps-list siteUrl nil))
  ([siteUrl optional]
    {:method :get,
     :uri-template
     "https://searchconsole.googleapis.com/webmasters/v3/sites/{siteUrl}/sitemaps",
     :uri-template-args {"siteUrl" siteUrl},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/webmasters"
      "https://www.googleapis.com/auth/webmasters.readonly"]}))
