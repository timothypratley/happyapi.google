(ns happyapi.google.airquality-v1
  "Air Quality API
The Air Quality API.
See: https://developers.google.com/maps/documentation/air-quality")

(defn history-lookup
  "Returns air quality history for a specific location for a given time range.
https://developers.google.com/maps/documentation/air-quality/v1/reference/rest/v1/history/lookup

LookupHistoryRequest:
LookupHistoryRequest"
  [LookupHistoryRequest]
  {:method :post,
   :uri-template "https://airquality.googleapis.com/v1/history:lookup",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body LookupHistoryRequest})

(defn forecast-lookup
  "Returns air quality forecast for a specific location for a given time range.
https://developers.google.com/maps/documentation/air-quality/v1/reference/rest/v1/forecast/lookup

LookupForecastRequest:
LookupForecastRequest"
  [LookupForecastRequest]
  {:method :post,
   :uri-template
   "https://airquality.googleapis.com/v1/forecast:lookup",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body LookupForecastRequest})

(defn mapTypes-heatmapTiles-lookupHeatmapTile
  "Returns a bytes array containing the data of the tile PNG image.
https://developers.google.com/maps/documentation/air-quality/v1/reference/rest/v1/mapTypes/heatmapTiles/lookupHeatmapTile

mapType <> 
zoom <> 
x <> 
y <> "
  [mapType zoom x y]
  {:method :get,
   :uri-template
   "https://airquality.googleapis.com/v1/mapTypes/{mapType}/heatmapTiles/{zoom}/{x}/{y}",
   :uri-template-args {"zoom" zoom, "mapType" mapType, "x" x, "y" y},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn currentConditions-lookup
  "The Current Conditions endpoint provides hourly air quality information in more than 100 countries, up to a 500 x 500 meters resolution. Includes over 70 local indexes and global air quality index and categories.
https://developers.google.com/maps/documentation/air-quality/v1/reference/rest/v1/currentConditions/lookup

LookupCurrentConditionsRequest:
LookupCurrentConditionsRequest"
  [LookupCurrentConditionsRequest]
  {:method :post,
   :uri-template
   "https://airquality.googleapis.com/v1/currentConditions:lookup",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body LookupCurrentConditionsRequest})
