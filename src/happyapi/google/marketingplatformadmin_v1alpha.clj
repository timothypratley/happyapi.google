(ns happyapi.google.marketingplatformadmin-v1alpha
  "Google Marketing Platform Admin API
The Google Marketing Platform Admin API allows for programmatic access to the Google Marketing Platform configuration data. You can use the Google Marketing Platform Admin API to manage links between your Google Marketing Platform organization and Google Analytics accounts, and to set the service level of your GA4 properties.
See: https://developers.google.com/marketing-platform/devguides/api/admin/v1")

(defn organizations-get
  "Lookup for a single organization.
https://developers.google.com/marketing-platform/devguides/api/admin/v1/v1alpha/reference/rest/v1alpha/organizations/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://marketingplatformadmin.googleapis.com/v1alpha/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/marketingplatformadmin.analytics.read"
    "https://www.googleapis.com/auth/marketingplatformadmin.analytics.update"]})

(defn organizations-analyticsAccountLinks-setPropertyServiceLevel
  "Updates the service level for an Analytics property.
https://developers.google.com/marketing-platform/devguides/api/admin/v1/v1alpha/reference/rest/v1alpha/organizations/analyticsAccountLinks/setPropertyServiceLevel

analyticsAccountLink <> 
SetPropertyServiceLevelRequest:
SetPropertyServiceLevelRequest"
  [analyticsAccountLink SetPropertyServiceLevelRequest]
  {:method :post,
   :uri-template
   "https://marketingplatformadmin.googleapis.com/v1alpha/{+analyticsAccountLink}:setPropertyServiceLevel",
   :uri-template-args {"analyticsAccountLink" analyticsAccountLink},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/marketingplatformadmin.analytics.update"],
   :body SetPropertyServiceLevelRequest})

(defn organizations-analyticsAccountLinks-create
  "Creates the link between the Analytics account and the Google Marketing Platform organization. User needs to be an org user, and admin on the Analytics account to create the link. If the account is already linked to an organization, user needs to unlink the account from the current organization, then try link again.
https://developers.google.com/marketing-platform/devguides/api/admin/v1/v1alpha/reference/rest/v1alpha/organizations/analyticsAccountLinks/create

parent <> 
AnalyticsAccountLink:
AnalyticsAccountLink"
  [parent AnalyticsAccountLink]
  {:method :post,
   :uri-template
   "https://marketingplatformadmin.googleapis.com/v1alpha/{+parent}/analyticsAccountLinks",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/marketingplatformadmin.analytics.update"],
   :body AnalyticsAccountLink})

(defn organizations-analyticsAccountLinks-delete
  "Deletes the AnalyticsAccountLink, which detaches the Analytics account from the Google Marketing Platform organization. User needs to be an org user, and admin on the Analytics account in order to delete the link.
https://developers.google.com/marketing-platform/devguides/api/admin/v1/v1alpha/reference/rest/v1alpha/organizations/analyticsAccountLinks/delete

name <> "
  [name]
  {:method :delete,
   :uri-template
   "https://marketingplatformadmin.googleapis.com/v1alpha/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/marketingplatformadmin.analytics.update"]})

(defn organizations-analyticsAccountLinks-list
  "Lists the Google Analytics accounts link to the specified Google Marketing Platform organization.
https://developers.google.com/marketing-platform/devguides/api/admin/v1/v1alpha/reference/rest/v1alpha/organizations/analyticsAccountLinks/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of Analytics account links to return in one call. The service may return fewer than this value. If unspecified, at most 50 Analytics account links will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (organizations-analyticsAccountLinks-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://marketingplatformadmin.googleapis.com/v1alpha/{+parent}/analyticsAccountLinks",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/marketingplatformadmin.analytics.read"
      "https://www.googleapis.com/auth/marketingplatformadmin.analytics.update"]}))
