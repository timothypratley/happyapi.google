(ns happyapi.google.places-v1
  "Places API (New)

See: https://mapsplatform.google.com/maps-products/#places-section"
  (:require [happyapi.providers.google :as client]))

(defn places-get
  "Get the details of a place based on its resource name, which is a string in the `places/{place_id}` format.
https://mapsplatform.google.com/maps-products/#places-section/v1/reference/rest/v1/places/get

name <> 

optional:
sessionToken <string> Optional. A string which identifies an Autocomplete session for billing purposes. Must be a URL and filename safe base64 string with at most 36 ASCII characters in length. Otherwise an INVALID_ARGUMENT error is returned. The session begins when the user starts typing a query, and concludes when they select a place and a call to Place Details or Address Validation is made. Each session can have multiple queries, followed by one Place Details or Address Validation request. The credentials used for each request within a session must belong to the same Google Cloud Console project. Once a session has concluded, the token is no longer valid; your app must generate a fresh token for each session. If the `session_token` parameter is omitted, or if you reuse a session token, the session is charged as if no session token was provided (each request is billed separately). We recommend the following guidelines: * Use session tokens for all Place Autocomplete calls. * Generate a fresh token for each session. Using a version 4 UUID is recommended. * Ensure that the credentials used for all Place Autocomplete, Place Details, and Address Validation requests within a session belong to the same Cloud Console project. * Be sure to pass a unique session token for each new session. Using the same token for more than one session will result in each request being billed individually.
regionCode <string> Optional. The Unicode country/region code (CLDR) of the location where the request is coming from. This parameter is used to display the place details, like region-specific place name, if available. The parameter can affect results based on applicable law. For more information, see https://www.unicode.org/cldr/charts/latest/supplemental/territory_language_information.html. Note that 3-digit region codes are not currently supported.
languageCode <string> Optional. Place details will be displayed with the preferred language if available. Current list of supported languages: https://developers.google.com/maps/faq#languagesupport."
  ([name] (places-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://places.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/maps-platform.places"
        "https://www.googleapis.com/auth/maps-platform.places.details"]})))

(defn places-searchNearby
  "Search for places near locations.
https://mapsplatform.google.com/maps-products/#places-section/v1/reference/rest/v1/places/searchNearby

GoogleMapsPlacesV1SearchNearbyRequest:
GoogleMapsPlacesV1SearchNearbyRequest"
  [GoogleMapsPlacesV1SearchNearbyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://places.googleapis.com/v1/places:searchNearby",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/maps-platform.places"
      "https://www.googleapis.com/auth/maps-platform.places.nearbysearch"],
     :body GoogleMapsPlacesV1SearchNearbyRequest}))

(defn places-searchText
  "Text query based place search.
https://mapsplatform.google.com/maps-products/#places-section/v1/reference/rest/v1/places/searchText

GoogleMapsPlacesV1SearchTextRequest:
GoogleMapsPlacesV1SearchTextRequest"
  [GoogleMapsPlacesV1SearchTextRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://places.googleapis.com/v1/places:searchText",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/maps-platform.places"
      "https://www.googleapis.com/auth/maps-platform.places.textsearch"],
     :body GoogleMapsPlacesV1SearchTextRequest}))

(defn places-autocomplete
  "Returns predictions for the given input.
https://mapsplatform.google.com/maps-products/#places-section/v1/reference/rest/v1/places/autocomplete

GoogleMapsPlacesV1AutocompletePlacesRequest:
GoogleMapsPlacesV1AutocompletePlacesRequest"
  [GoogleMapsPlacesV1AutocompletePlacesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://places.googleapis.com/v1/places:autocomplete",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/maps-platform.places"
      "https://www.googleapis.com/auth/maps-platform.places.autocomplete"],
     :body GoogleMapsPlacesV1AutocompletePlacesRequest}))

(defn places-photos-getMedia
  "Get a photo media with a photo reference string.
https://mapsplatform.google.com/maps-products/#places-section/v1/reference/rest/v1/places/photos/getMedia

name <> 

optional:
skipHttpRedirect <boolean> Optional. If set, skip the default HTTP redirect behavior and render a text format (for example, in JSON format for HTTP use case) response. If not set, an HTTP redirect will be issued to redirect the call to the image media. This option is ignored for non-HTTP requests.
maxHeightPx <integer> Optional. Specifies the maximum desired height, in pixels, of the image. If the image is smaller than the values specified, the original image will be returned. If the image is larger in either dimension, it will be scaled to match the smaller of the two dimensions, restricted to its original aspect ratio. Both the max_height_px and max_width_px properties accept an integer between 1 and 4800, inclusively. If the value is not within the allowed range, an INVALID_ARGUMENT error will be returned. At least one of max_height_px or max_width_px needs to be specified. If neither max_height_px nor max_width_px is specified, an INVALID_ARGUMENT error will be returned.
maxWidthPx <integer> Optional. Specifies the maximum desired width, in pixels, of the image. If the image is smaller than the values specified, the original image will be returned. If the image is larger in either dimension, it will be scaled to match the smaller of the two dimensions, restricted to its original aspect ratio. Both the max_height_px and max_width_px properties accept an integer between 1 and 4800, inclusively. If the value is not within the allowed range, an INVALID_ARGUMENT error will be returned. At least one of max_height_px or max_width_px needs to be specified. If neither max_height_px nor max_width_px is specified, an INVALID_ARGUMENT error will be returned."
  ([name] (places-photos-getMedia name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://places.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/maps-platform.places"]})))
