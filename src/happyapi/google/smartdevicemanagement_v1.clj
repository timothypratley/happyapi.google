(ns happyapi.google.smartdevicemanagement-v1
  "Smart Device Management API
Allow select enterprise partners to access, control, and manage Google and Nest devices programmatically.
See: https://developers.google.com/nest/device-access")

(defn enterprises-devices-list
  "Lists devices managed by the enterprise.
https://developers.google.com/nest/device-access/v1/reference/rest/v1/enterprises/devices/list

parent <> 

optional:
filter <string> Optional filter to list devices. Filters can be done on: Device custom name (substring match): 'customName=wing'"
  ([parent] (enterprises-devices-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://smartdevicemanagement.googleapis.com/v1/{+parent}/devices",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/sdm.service"]}))

(defn enterprises-devices-executeCommand
  "Executes a command to device managed by the enterprise.
https://developers.google.com/nest/device-access/v1/reference/rest/v1/enterprises/devices/executeCommand

name <> 
GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest:
GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest"
  [name GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest]
  {:method :post,
   :uri-template
   "https://smartdevicemanagement.googleapis.com/v1/{+name}:executeCommand",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/sdm.service"],
   :body GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest})

(defn enterprises-devices-get
  "Gets a device managed by the enterprise.
https://developers.google.com/nest/device-access/v1/reference/rest/v1/enterprises/devices/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://smartdevicemanagement.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/sdm.service"]})

(defn enterprises-structures-get
  "Gets a structure managed by the enterprise.
https://developers.google.com/nest/device-access/v1/reference/rest/v1/enterprises/structures/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://smartdevicemanagement.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/sdm.service"]})

(defn enterprises-structures-list
  "Lists structures managed by the enterprise.
https://developers.google.com/nest/device-access/v1/reference/rest/v1/enterprises/structures/list

parent <> 

optional:
filter <string> Optional filter to list structures."
  ([parent] (enterprises-structures-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://smartdevicemanagement.googleapis.com/v1/{+parent}/structures",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/sdm.service"]}))

(defn enterprises-structures-rooms-get
  "Gets a room managed by the enterprise.
https://developers.google.com/nest/device-access/v1/reference/rest/v1/enterprises/structures/rooms/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://smartdevicemanagement.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/sdm.service"]})

(defn enterprises-structures-rooms-list
  "Lists rooms managed by the enterprise.
https://developers.google.com/nest/device-access/v1/reference/rest/v1/enterprises/structures/rooms/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://smartdevicemanagement.googleapis.com/v1/{+parent}/rooms",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/sdm.service"]})
