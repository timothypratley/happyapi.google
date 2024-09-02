(ns happyapi.google.androiddeviceprovisioning-v1
  "Android Device Provisioning Partner API
Automates Android zero-touch enrollment for device resellers, customers, and EMMs.
See: https://developers.google.com/zero-touch/"
  (:require [happyapi.providers.google :as client]))

(defn customers-list
  "Lists the user's customer accounts.
https://developers.google.com/zero-touch/v1/reference/rest/v1/customers/list

optional:
pageSize <integer> The maximum number of customers to show in a page of results. A number between 1 and 100 (inclusive)."
  ([] (customers-list nil))
  ([optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://androiddeviceprovisioning.googleapis.com/v1/customers",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes nil})))

(defn customers-dpcs-list
  "Lists the DPCs (device policy controllers) that support zero-touch enrollment.
https://developers.google.com/zero-touch/v1/reference/rest/v1/customers/dpcs/list

parent <> "
  [parent]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/{+parent}/dpcs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes nil}))

(defn customers-configurations-get
  "Gets the details of a configuration.
https://developers.google.com/zero-touch/v1/reference/rest/v1/customers/configurations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes nil}))

(defn customers-configurations-list
  "Lists a customer's configurations.
https://developers.google.com/zero-touch/v1/reference/rest/v1/customers/configurations/list

parent <> "
  [parent]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/{+parent}/configurations",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes nil}))

(defn customers-configurations-create
  "Creates a new configuration. Once created, a customer can apply the configuration to devices.
https://developers.google.com/zero-touch/v1/reference/rest/v1/customers/configurations/create

parent <> 
Configuration:
Configuration"
  [parent Configuration]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/{+parent}/configurations",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes nil,
     :body Configuration}))

(defn customers-configurations-delete
  "Deletes an unused configuration. The API call fails if the customer has devices with the configuration applied.
https://developers.google.com/zero-touch/v1/reference/rest/v1/customers/configurations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes nil}))

(defn customers-configurations-patch
  "Updates a configuration's field values.
https://developers.google.com/zero-touch/v1/reference/rest/v1/customers/configurations/patch

name <> 
Configuration:
Configuration

optional:
updateMask <string> Required. The field mask applied to the target `Configuration` before updating the fields. To learn more about using field masks, read [FieldMask](/protocol-buffers/docs/reference/google.protobuf#fieldmask) in the Protocol Buffers documentation."
  ([name Configuration]
    (customers-configurations-patch name Configuration nil))
  ([name Configuration optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://androiddeviceprovisioning.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes nil,
       :body Configuration})))

(defn customers-devices-list
  "Lists a customer's devices.
https://developers.google.com/zero-touch/v1/reference/rest/v1/customers/devices/list

parent <> 

optional:
pageSize <string> The maximum number of devices to show in a page of results. Must be between 1 and 100 inclusive."
  ([parent] (customers-devices-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://androiddeviceprovisioning.googleapis.com/v1/{+parent}/devices",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes nil})))

(defn customers-devices-get
  "Gets the details of a device.
https://developers.google.com/zero-touch/v1/reference/rest/v1/customers/devices/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes nil}))

(defn customers-devices-removeConfiguration
  "Removes a configuration from device.
https://developers.google.com/zero-touch/v1/reference/rest/v1/customers/devices/removeConfiguration

parent <> 
CustomerRemoveConfigurationRequest:
CustomerRemoveConfigurationRequest"
  [parent CustomerRemoveConfigurationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/{+parent}/devices:removeConfiguration",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes nil,
     :body CustomerRemoveConfigurationRequest}))

(defn customers-devices-applyConfiguration
  "Applies a Configuration to the device to register the device for zero-touch enrollment. After applying a configuration to a device, the device automatically provisions itself on first boot, or next factory reset.
https://developers.google.com/zero-touch/v1/reference/rest/v1/customers/devices/applyConfiguration

parent <> 
CustomerApplyConfigurationRequest:
CustomerApplyConfigurationRequest"
  [parent CustomerApplyConfigurationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/{+parent}/devices:applyConfiguration",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes nil,
     :body CustomerApplyConfigurationRequest}))

(defn customers-devices-unclaim
  "Unclaims a device from a customer and removes it from zero-touch enrollment. After removing a device, a customer must contact their reseller to register the device into zero-touch enrollment again.
https://developers.google.com/zero-touch/v1/reference/rest/v1/customers/devices/unclaim

parent <> 
CustomerUnclaimDeviceRequest:
CustomerUnclaimDeviceRequest"
  [parent CustomerUnclaimDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/{+parent}/devices:unclaim",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes nil,
     :body CustomerUnclaimDeviceRequest}))

(defn operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://developers.google.com/zero-touch/v1/reference/rest/v1/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes nil}))

(defn partners-devices-getSimLockState
  "Gets a device's SIM lock state.
https://developers.google.com/zero-touch/v1/reference/rest/v1/partners/devices/getSimLockState

partnerId <> 
GetDeviceSimLockStateRequest:
GetDeviceSimLockStateRequest"
  [partnerId GetDeviceSimLockStateRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/partners/{+partnerId}/devices:getSimLockState",
     :uri-template-args {"partnerId" partnerId},
     :query-params {},
     :scopes nil,
     :body GetDeviceSimLockStateRequest}))

(defn partners-devices-findByIdentifier
  "Finds devices by hardware identifiers, such as IMEI.
https://developers.google.com/zero-touch/v1/reference/rest/v1/partners/devices/findByIdentifier

partnerId <> 
FindDevicesByDeviceIdentifierRequest:
FindDevicesByDeviceIdentifierRequest"
  [partnerId FindDevicesByDeviceIdentifierRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/partners/{+partnerId}/devices:findByIdentifier",
     :uri-template-args {"partnerId" partnerId},
     :query-params {},
     :scopes nil,
     :body FindDevicesByDeviceIdentifierRequest}))

(defn partners-devices-unclaimAsync
  "Unclaims a batch of devices for a customer asynchronously. Removes the devices from zero-touch enrollment. To learn more, read [Long‑running batch operations](/zero-touch/guides/how-it-works#operations).
https://developers.google.com/zero-touch/v1/reference/rest/v1/partners/devices/unclaimAsync

partnerId <> 
UnclaimDevicesRequest:
UnclaimDevicesRequest"
  [partnerId UnclaimDevicesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/partners/{+partnerId}/devices:unclaimAsync",
     :uri-template-args {"partnerId" partnerId},
     :query-params {},
     :scopes nil,
     :body UnclaimDevicesRequest}))

(defn partners-devices-findByOwner
  "Finds devices claimed for customers. The results only contain devices registered to the reseller that's identified by the `partnerId` argument. The customer's devices purchased from other resellers don't appear in the results.
https://developers.google.com/zero-touch/v1/reference/rest/v1/partners/devices/findByOwner

partnerId <> 
FindDevicesByOwnerRequest:
FindDevicesByOwnerRequest"
  [partnerId FindDevicesByOwnerRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/partners/{+partnerId}/devices:findByOwner",
     :uri-template-args {"partnerId" partnerId},
     :query-params {},
     :scopes nil,
     :body FindDevicesByOwnerRequest}))

(defn partners-devices-updateMetadataAsync
  "Updates the reseller metadata attached to a batch of devices. This method updates devices asynchronously and returns an `Operation` that can be used to track progress. Read [Long‑running batch operations](/zero-touch/guides/how-it-works#operations). Android Devices only.
https://developers.google.com/zero-touch/v1/reference/rest/v1/partners/devices/updateMetadataAsync

partnerId <> 
UpdateDeviceMetadataInBatchRequest:
UpdateDeviceMetadataInBatchRequest"
  [partnerId UpdateDeviceMetadataInBatchRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/partners/{+partnerId}/devices:updateMetadataAsync",
     :uri-template-args {"partnerId" partnerId},
     :query-params {},
     :scopes nil,
     :body UpdateDeviceMetadataInBatchRequest}))

(defn partners-devices-claim
  "Claims a device for a customer and adds it to zero-touch enrollment. If the device is already claimed by another customer, the call returns an error.
https://developers.google.com/zero-touch/v1/reference/rest/v1/partners/devices/claim

partnerId <> 
ClaimDeviceRequest:
ClaimDeviceRequest"
  [partnerId ClaimDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/partners/{+partnerId}/devices:claim",
     :uri-template-args {"partnerId" partnerId},
     :query-params {},
     :scopes nil,
     :body ClaimDeviceRequest}))

(defn partners-devices-claimAsync
  "Claims a batch of devices for a customer asynchronously. Adds the devices to zero-touch enrollment. To learn more, read [Long‑running batch operations](/zero-touch/guides/how-it-works#operations).
https://developers.google.com/zero-touch/v1/reference/rest/v1/partners/devices/claimAsync

partnerId <> 
ClaimDevicesRequest:
ClaimDevicesRequest"
  [partnerId ClaimDevicesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/partners/{+partnerId}/devices:claimAsync",
     :uri-template-args {"partnerId" partnerId},
     :query-params {},
     :scopes nil,
     :body ClaimDevicesRequest}))

(defn partners-devices-metadata
  "Updates reseller metadata associated with the device. Android devices only.
https://developers.google.com/zero-touch/v1/reference/rest/v1/partners/devices/metadata

metadataOwnerId <> 
deviceId <> 
UpdateDeviceMetadataRequest:
UpdateDeviceMetadataRequest"
  [metadataOwnerId deviceId UpdateDeviceMetadataRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/partners/{+metadataOwnerId}/devices/{+deviceId}/metadata",
     :uri-template-args
     {"metadataOwnerId" metadataOwnerId, "deviceId" deviceId},
     :query-params {},
     :scopes nil,
     :body UpdateDeviceMetadataRequest}))

(defn partners-devices-unclaim
  "Unclaims a device from a customer and removes it from zero-touch enrollment.
https://developers.google.com/zero-touch/v1/reference/rest/v1/partners/devices/unclaim

partnerId <> 
UnclaimDeviceRequest:
UnclaimDeviceRequest"
  [partnerId UnclaimDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/partners/{+partnerId}/devices:unclaim",
     :uri-template-args {"partnerId" partnerId},
     :query-params {},
     :scopes nil,
     :body UnclaimDeviceRequest}))

(defn partners-devices-get
  "Gets a device.
https://developers.google.com/zero-touch/v1/reference/rest/v1/partners/devices/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes nil}))

(defn partners-customers-create
  "Creates a customer for zero-touch enrollment. After the method returns successfully, admin and owner roles can manage devices and EMM configs by calling API methods or using their zero-touch enrollment portal. The customer receives an email that welcomes them to zero-touch enrollment and explains how to sign into the portal.
https://developers.google.com/zero-touch/v1/reference/rest/v1/partners/customers/create

parent <> 
CreateCustomerRequest:
CreateCustomerRequest"
  [parent CreateCustomerRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androiddeviceprovisioning.googleapis.com/v1/{+parent}/customers",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes nil,
     :body CreateCustomerRequest}))

(defn partners-customers-list
  "Lists the customers that are enrolled to the reseller identified by the `partnerId` argument. This list includes customers that the reseller created and customers that enrolled themselves using the portal.
https://developers.google.com/zero-touch/v1/reference/rest/v1/partners/customers/list

partnerId <> 

optional:
pageSize <integer> The maximum number of results to be returned. If not specified or 0, all the records are returned."
  ([partnerId] (partners-customers-list partnerId nil))
  ([partnerId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://androiddeviceprovisioning.googleapis.com/v1/partners/{+partnerId}/customers",
       :uri-template-args {"partnerId" partnerId},
       :query-params (merge {} optional),
       :scopes nil})))

(defn partners-vendors-list
  "Lists the vendors of the partner.
https://developers.google.com/zero-touch/v1/reference/rest/v1/partners/vendors/list

parent <> 

optional:
pageSize <integer> The maximum number of results to be returned."
  ([parent] (partners-vendors-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://androiddeviceprovisioning.googleapis.com/v1/{+parent}/vendors",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes nil})))

(defn partners-vendors-customers-list
  "Lists the customers of the vendor.
https://developers.google.com/zero-touch/v1/reference/rest/v1/partners/vendors/customers/list

parent <> 

optional:
pageSize <integer> The maximum number of results to be returned."
  ([parent] (partners-vendors-customers-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://androiddeviceprovisioning.googleapis.com/v1/{+parent}/customers",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes nil})))
