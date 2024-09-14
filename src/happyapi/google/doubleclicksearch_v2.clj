(ns happyapi.google.doubleclicksearch-v2
  "Search Ads 360 API
The Search Ads 360 API allows developers to automate uploading conversions and downloading reports from Search Ads 360.
See: https://developers.google.com/search-ads")

(defn conversion-get
  "Retrieves a list of conversions from a DoubleClick Search engine account.
https://developers.google.com/search-ads/v2/reference/rest/v2/conversion/get

agencyId <> 
advertiserId <> 
engineAccountId <> 
endDate <> 
rowCount <> 
startDate <> 
startRow <> 

optional:
campaignId <string> Numeric ID of the campaign.
criterionId <string> Numeric ID of the criterion.
customerId <string> Customer ID of a client account in the new Search Ads 360 experience.
adId <string> Numeric ID of the ad.
adGroupId <string> Numeric ID of the ad group."
  ([agencyId
    advertiserId
    engineAccountId
    endDate
    rowCount
    startDate
    startRow]
    (conversion-get
      agencyId
      advertiserId
      engineAccountId
      endDate
      rowCount
      startDate
      startRow
      nil))
  ([agencyId
    advertiserId
    engineAccountId
    endDate
    rowCount
    startDate
    startRow
    optional]
    {:method :get,
     :uri-template
     "https://doubleclicksearch.googleapis.com/doubleclicksearch/v2/agency/{agencyId}/advertiser/{advertiserId}/engine/{engineAccountId}/conversion",
     :uri-template-args
     {"advertiserId" advertiserId,
      "agencyId" agencyId,
      "engineAccountId" engineAccountId},
     :query-params
     (merge
       {"startDate" startDate,
        "rowCount" rowCount,
        "startRow" startRow,
        "endDate" endDate}
       optional),
     :scopes ["https://www.googleapis.com/auth/doubleclicksearch"]}))

(defn conversion-getByCustomerId
  "Retrieves a list of conversions from a DoubleClick Search engine account.
https://developers.google.com/search-ads/v2/reference/rest/v2/conversion/getByCustomerId

customerId <> 
endDate <> 
rowCount <> 
startDate <> 
startRow <> 

optional:
campaignId <string> Numeric ID of the campaign.
advertiserId <string> Numeric ID of the advertiser.
criterionId <string> Numeric ID of the criterion.
agencyId <string> Numeric ID of the agency.
adId <string> Numeric ID of the ad.
adGroupId <string> Numeric ID of the ad group.
engineAccountId <string> Numeric ID of the engine account."
  ([customerId endDate rowCount startDate startRow]
    (conversion-getByCustomerId
      customerId
      endDate
      rowCount
      startDate
      startRow
      nil))
  ([customerId endDate rowCount startDate startRow optional]
    {:method :get,
     :uri-template
     "https://doubleclicksearch.googleapis.com/doubleclicksearch/v2/customer/{customerId}/conversion",
     :uri-template-args {"customerId" customerId},
     :query-params
     (merge
       {"startDate" startDate,
        "rowCount" rowCount,
        "startRow" startRow,
        "endDate" endDate}
       optional),
     :scopes ["https://www.googleapis.com/auth/doubleclicksearch"]}))

(defn conversion-insert
  "Inserts a batch of new conversions into DoubleClick Search.
https://developers.google.com/search-ads/v2/reference/rest/v2/conversion/insert

ConversionList:
ConversionList"
  [ConversionList]
  {:method :post,
   :uri-template
   "https://doubleclicksearch.googleapis.com/doubleclicksearch/v2/conversion",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"],
   :body ConversionList})

(defn conversion-update
  "Updates a batch of conversions in DoubleClick Search.
https://developers.google.com/search-ads/v2/reference/rest/v2/conversion/update

ConversionList:
ConversionList"
  [ConversionList]
  {:method :put,
   :uri-template
   "https://doubleclicksearch.googleapis.com/doubleclicksearch/v2/conversion",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"],
   :body ConversionList})

(defn conversion-updateAvailability
  "Updates the availabilities of a batch of floodlight activities in DoubleClick Search.
https://developers.google.com/search-ads/v2/reference/rest/v2/conversion/updateAvailability

UpdateAvailabilityRequest:
UpdateAvailabilityRequest"
  [UpdateAvailabilityRequest]
  {:method :post,
   :uri-template
   "https://doubleclicksearch.googleapis.com/doubleclicksearch/v2/conversion/updateAvailability",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"],
   :body UpdateAvailabilityRequest})

(defn reports-generate
  "Generates and returns a report immediately.
https://developers.google.com/search-ads/v2/reference/rest/v2/reports/generate

ReportRequest:
ReportRequest"
  [ReportRequest]
  {:method :post,
   :uri-template
   "https://doubleclicksearch.googleapis.com/doubleclicksearch/v2/reports/generate",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"],
   :body ReportRequest})

(defn reports-get
  "Polls for the status of a report request.
https://developers.google.com/search-ads/v2/reference/rest/v2/reports/get

reportId <> "
  [reportId]
  {:method :get,
   :uri-template
   "https://doubleclicksearch.googleapis.com/doubleclicksearch/v2/reports/{reportId}",
   :uri-template-args {"reportId" reportId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"]})

(defn reports-getFile
  "Downloads a report file encoded in UTF-8.
https://developers.google.com/search-ads/v2/reference/rest/v2/reports/getFile

reportId <> 
reportFragment <> "
  [reportId reportFragment]
  {:method :get,
   :uri-template
   "https://doubleclicksearch.googleapis.com/doubleclicksearch/v2/reports/{reportId}/files/{reportFragment}",
   :uri-template-args
   {"reportId" reportId, "reportFragment" reportFragment},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"]})

(defn reports-getIdMappingFile
  "Downloads a csv file(encoded in UTF-8) that contains ID mappings between legacy SA360 and new SA360. The file includes all children entities of the given advertiser(e.g. engine accounts, campaigns, ad groups, etc.) that exist in both legacy SA360 and new SA360.
https://developers.google.com/search-ads/v2/reference/rest/v2/reports/getIdMappingFile

agencyId <> 
advertiserId <> "
  [agencyId advertiserId]
  {:method :get,
   :uri-template
   "https://doubleclicksearch.googleapis.com/doubleclicksearch/v2/agency/{agencyId}/advertiser/{advertiserId}/idmapping",
   :uri-template-args
   {"agencyId" agencyId, "advertiserId" advertiserId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"]})

(defn reports-request
  "Inserts a report request into the reporting system.
https://developers.google.com/search-ads/v2/reference/rest/v2/reports/request

ReportRequest:
ReportRequest"
  [ReportRequest]
  {:method :post,
   :uri-template
   "https://doubleclicksearch.googleapis.com/doubleclicksearch/v2/reports",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"],
   :body ReportRequest})

(defn savedColumns-list
  "Retrieve the list of saved columns for a specified advertiser.
https://developers.google.com/search-ads/v2/reference/rest/v2/savedColumns/list

agencyId <> 
advertiserId <> "
  [agencyId advertiserId]
  {:method :get,
   :uri-template
   "https://doubleclicksearch.googleapis.com/doubleclicksearch/v2/agency/{agencyId}/advertiser/{advertiserId}/savedcolumns",
   :uri-template-args
   {"agencyId" agencyId, "advertiserId" advertiserId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/doubleclicksearch"]})
