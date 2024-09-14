(ns happyapi.google.searchads360-v0
  "Search Ads 360 Reporting API
The Search Ads 360 API allows developers to automate downloading reports from Search Ads 360.
See: https://developers.google.com/search-ads/reporting")

(defn customers-listAccessibleCustomers
  "Returns resource names of customers directly accessible by the user authenticating the call. List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
https://developers.google.com/search-ads/reporting/v0/reference/rest/v0/customers/listAccessibleCustomers"
  []
  {:method :get,
   :uri-template
   "https://searchads360.googleapis.com/v0/customers:listAccessibleCustomers",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"]})

(defn customers-customColumns-get
  "Returns the requested custom column in full detail.
https://developers.google.com/search-ads/reporting/v0/reference/rest/v0/customers/customColumns/get

resourceName <> "
  [resourceName]
  {:method :get,
   :uri-template
   "https://searchads360.googleapis.com/v0/{+resourceName}",
   :uri-template-args {"resourceName" resourceName},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"]})

(defn customers-customColumns-list
  "Returns all the custom columns associated with the customer in full detail.
https://developers.google.com/search-ads/reporting/v0/reference/rest/v0/customers/customColumns/list

customerId <> "
  [customerId]
  {:method :get,
   :uri-template
   "https://searchads360.googleapis.com/v0/customers/{+customerId}/customColumns",
   :uri-template-args {"customerId" customerId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"]})

(defn customers-searchAds360-search
  "Returns all rows that match the search query. List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]() [InternalError]() [QueryError]() [QuotaError]() [RequestError]()
https://developers.google.com/search-ads/reporting/v0/reference/rest/v0/customers/searchAds360/search

customerId <> 
GoogleAdsSearchads360V0Services__SearchSearchAds360Request:
GoogleAdsSearchads360V0Services__SearchSearchAds360Request"
  [customerId
   GoogleAdsSearchads360V0Services__SearchSearchAds360Request]
  {:method :post,
   :uri-template
   "https://searchads360.googleapis.com/v0/customers/{+customerId}/searchAds360:search",
   :uri-template-args {"customerId" customerId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"],
   :body GoogleAdsSearchads360V0Services__SearchSearchAds360Request})

(defn searchAds360Fields-get
  "Returns just the requested field. List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
https://developers.google.com/search-ads/reporting/v0/reference/rest/v0/searchAds360Fields/get

resourceName <> "
  [resourceName]
  {:method :get,
   :uri-template
   "https://searchads360.googleapis.com/v0/{+resourceName}",
   :uri-template-args {"resourceName" resourceName},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"]})

(defn searchAds360Fields-search
  "Returns all fields that match the search [query](/search-ads/reporting/concepts/field-service#use_a_query_to_get_field_details). List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]() [InternalError]() [QueryError]() [QuotaError]() [RequestError]()
https://developers.google.com/search-ads/reporting/v0/reference/rest/v0/searchAds360Fields/search

GoogleAdsSearchads360V0Services__SearchSearchAds360FieldsRequest:
GoogleAdsSearchads360V0Services__SearchSearchAds360FieldsRequest"
  [GoogleAdsSearchads360V0Services__SearchSearchAds360FieldsRequest]
  {:method :post,
   :uri-template
   "https://searchads360.googleapis.com/v0/searchAds360Fields:search",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"],
   :body
   GoogleAdsSearchads360V0Services__SearchSearchAds360FieldsRequest})
