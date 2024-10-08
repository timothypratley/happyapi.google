(ns happyapi.google.pollen-v1
  "Pollen API
The Pollen API. 
See: https://developers.google.com/maps/documentation/pollen")

(defn mapTypes-heatmapTiles-lookupHeatmapTile
  "Returns a byte array containing the data of the tile PNG image.
https://developers.google.com/maps/documentation/pollen/v1/reference/rest/v1/mapTypes/heatmapTiles/lookupHeatmapTile

mapType <> 
zoom <> 
x <> 
y <> "
  [mapType zoom x y]
  {:method :get,
   :uri-template
   "https://pollen.googleapis.com/v1/mapTypes/{mapType}/heatmapTiles/{zoom}/{x}/{y}",
   :uri-template-args {"zoom" zoom, "y" y, "x" x, "mapType" mapType},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn forecast-lookup
  "Returns up to 5 days of daily pollen information in more than 65 countries, up to 1km resolution.
https://developers.google.com/maps/documentation/pollen/v1/reference/rest/v1/forecast/lookup

optional:
pageSize <integer> Optional. The maximum number of daily info records to return per page. The default and max value is 5, indicating 5 days of data.
plantsDescription <boolean> Optional. Contains general information about plants, including details on their seasonality, special shapes and colors, information about allergic cross-reactions, and plant photos. The default value is \"true\".
location.longitude <number> The longitude in degrees. It must be in the range [-180.0, +180.0].
location.latitude <number> The latitude in degrees. It must be in the range [-90.0, +90.0].
languageCode <string> Optional. Allows the client to choose the language for the response. If data cannot be provided for that language, the API uses the closest match. Allowed values rely on the IETF BCP-47 standard. The default value is \"en\".
days <integer> Required. A number that indicates how many forecast days to request (minimum value 1, maximum value is 5)."
  ([] (forecast-lookup nil))
  ([optional]
    {:method :get,
     :uri-template "https://pollen.googleapis.com/v1/forecast:lookup",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
