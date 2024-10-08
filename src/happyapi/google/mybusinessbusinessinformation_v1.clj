(ns happyapi.google.mybusinessbusinessinformation-v1
  "My Business Business Information API
The My Business Business Information API provides an interface for managing business information. Note - If you have a quota of 0 after enabling the API, please request for GBP API access.
See: https://developers.google.com/my-business/")

(defn attributes-list
  "Returns the list of attributes that would be available for a location with the given primary category and country.
https://developers.google.com/my-business/v1/reference/rest/v1/attributes/list

optional:
parent <string> Resource name of the location to look up available attributes. If this field is set, category_name, region_code, language_code and show_all are not required and must not be set.
categoryName <string> The primary category stable ID to find available attributes. Must be of the format categories/{category_id}.
regionCode <string> The ISO 3166-1 alpha-2 country code to find available attributes.
languageCode <string> The BCP 47 code of language to get attribute display names in. If this language is not available, they will be provided in English.
showAll <boolean> Metadata for all available attributes are returned when this field is set to true, disregarding parent and category_name fields. language_code and region_code are required when show_all is set to true.
pageSize <integer> How many attributes to include per page. Default is 200, minimum is 1."
  ([] (attributes-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://mybusinessbusinessinformation.googleapis.com/v1/attributes",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes nil}))

(defn locations-updateAttributes
  "Update attributes for a given location.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/updateAttributes

name <> 
Attributes:
Attributes

optional:
attributeMask <string> Required. Attribute name of attributes that you'd like to update. Represented by `attributes/{attribute}`. Updates: All attributes provided in the attributes field that you would like to update must be set in the `attribute_mask`. Attributes set in the above list but not in the `attribute_mask` will be ignored. Deletes: If you'd like to delete certain attributes, they must be specified in the `attribute_mask` with no matching entry in the attributes list. If you'd like to delete all attributes set on a location, you should look up all the applicable attributes for the location and then add them to the `attribute_mask` with an empty attributes field."
  ([name Attributes] (locations-updateAttributes name Attributes nil))
  ([name Attributes optional]
    {:method :patch,
     :uri-template
     "https://mybusinessbusinessinformation.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes nil,
     :body Attributes}))

(defn locations-getAttributes
  "Looks up all the attributes set for a given location.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/getAttributes

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://mybusinessbusinessinformation.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn locations-get
  "Returns the specified location.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/get

name <> 

optional:
readMask <string> Required. Read mask to specify what fields will be returned in the response."
  ([name] (locations-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://mybusinessbusinessinformation.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes nil}))

(defn locations-getGoogleUpdated
  "Gets the Google-updated version of the specified location.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/getGoogleUpdated

name <> 

optional:
readMask <string> Required. Read mask to specify what fields will be returned in the response."
  ([name] (locations-getGoogleUpdated name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://mybusinessbusinessinformation.googleapis.com/v1/{+name}:getGoogleUpdated",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes nil}))

(defn locations-patch
  "Updates the specified location.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/patch

name <> 
Location:
Location

optional:
updateMask <string> Required. The specific fields to update.
validateOnly <boolean> Optional. If true, the request is validated without actually updating the location. When this field is set, we will only return validation errors if there were any. The response will be empty if no errors were found."
  ([name Location] (locations-patch name Location nil))
  ([name Location optional]
    {:method :patch,
     :uri-template
     "https://mybusinessbusinessinformation.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes nil,
     :body Location}))

(defn locations-delete
  "Deletes a location. If this location cannot be deleted using the API and it is marked so in the `google.mybusiness.businessinformation.v1.LocationState`, use the [Google Business Profile](https://business.google.com/manage/) website.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template
   "https://mybusinessbusinessinformation.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn locations-attributes-getGoogleUpdated
  "Gets the Google-updated version of the specified location.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/attributes/getGoogleUpdated

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://mybusinessbusinessinformation.googleapis.com/v1/{+name}:getGoogleUpdated",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn categories-list
  "Returns a list of business categories. Search will match the category name but not the category ID. Search only matches the front of a category name (that is, 'food' may return 'Food Court' but not 'Fast Food Restaurant').
https://developers.google.com/my-business/v1/reference/rest/v1/categories/list

optional:
regionCode <string> Required. The ISO 3166-1 alpha-2 country code.
languageCode <string> Required. The BCP 47 code of language.
filter <string> Optional. Filter string from user. The only field that supported is `displayName`. Eg: `filter=displayName=foo`.
pageSize <integer> Optional. How many categories to fetch per page. Default is 100, minimum is 1, and maximum page size is 100.
view <string> Required. Specifies which parts to the Category resource should be returned in the response."
  ([] (categories-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://mybusinessbusinessinformation.googleapis.com/v1/categories",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes nil}))

(defn categories-batchGet
  "Returns a list of business categories for the provided language and GConcept ids.
https://developers.google.com/my-business/v1/reference/rest/v1/categories/batchGet

optional:
names <string> Required. At least one name must be set. The GConcept ids the localized category names should be returned for. To return details for more than one category, repeat this parameter in the request.
languageCode <string> Required. The BCP 47 code of language that the category names should be returned in.
regionCode <string> Optional. The ISO 3166-1 alpha-2 country code used to infer non-standard language.
view <string> Required. Specifies which parts to the Category resource should be returned in the response."
  ([] (categories-batchGet nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://mybusinessbusinessinformation.googleapis.com/v1/categories:batchGet",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes nil}))

(defn chains-get
  "Gets the specified chain. Returns `NOT_FOUND` if the chain does not exist.
https://developers.google.com/my-business/v1/reference/rest/v1/chains/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://mybusinessbusinessinformation.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn chains-search
  "Searches the chain based on chain name.
https://developers.google.com/my-business/v1/reference/rest/v1/chains/search

optional:
chainName <string> Required. Search for a chain by its name. Exact/partial/fuzzy/related queries are supported. Examples: \"walmart\", \"wal-mart\", \"walmmmart\", \"沃尔玛\"
pageSize <integer> The maximum number of matched chains to return from this query. The default is 10. The maximum possible value is 500."
  ([] (chains-search nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://mybusinessbusinessinformation.googleapis.com/v1/chains:search",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes nil}))

(defn googleLocations-search
  "Search all of the possible locations that are a match to the specified request.
https://developers.google.com/my-business/v1/reference/rest/v1/googleLocations/search

SearchGoogleLocationsRequest:
SearchGoogleLocationsRequest"
  [SearchGoogleLocationsRequest]
  {:method :post,
   :uri-template
   "https://mybusinessbusinessinformation.googleapis.com/v1/googleLocations:search",
   :uri-template-args {},
   :query-params {},
   :scopes nil,
   :body SearchGoogleLocationsRequest})

(defn accounts-locations-list
  "Lists the locations for the specified account.
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/locations/list

parent <> 

optional:
pageSize <integer> Optional. How many locations to fetch per page. Default value is 10 if not set. Minimum is 1, and maximum page size is 100.
filter <string> Optional. A filter constraining the locations to return. The response includes only entries that match the filter. If `filter` is empty, then constraints are applied and all locations (paginated) are retrieved for the requested account. For more information about valid fields and example usage, see [Work with Location Data Guide](https://developers.google.com/my-business/content/location-data#filter_results_when_you_list_locations).
orderBy <string> Optional. Sorting order for the request. Multiple fields should be comma-separated, following SQL syntax. The default sorting order is ascending. To specify descending order, a suffix \" desc\" should be added. Valid fields to order_by are title and store_code. For example: \"title, store_code desc\" or \"title\" or \"store_code desc\"
readMask <string> Required. Read mask to specify what fields will be returned in the response."
  ([parent] (accounts-locations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://mybusinessbusinessinformation.googleapis.com/v1/{+parent}/locations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes nil}))

(defn accounts-locations-create
  "Creates a new Location that will be owned by the logged in user.
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/locations/create

parent <> 
Location:
Location

optional:
validateOnly <boolean> Optional. If true, the request is validated without actually creating the location.
requestId <string> Optional. A unique request ID for the server to detect duplicated requests. We recommend using UUIDs. Max length is 50 characters."
  ([parent Location] (accounts-locations-create parent Location nil))
  ([parent Location optional]
    {:method :post,
     :uri-template
     "https://mybusinessbusinessinformation.googleapis.com/v1/{+parent}/locations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes nil,
     :body Location}))
