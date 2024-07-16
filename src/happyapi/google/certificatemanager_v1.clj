(ns happyapi.google.certificatemanager-v1
  "Certificate Manager API

See: https://cloud.google.com/certificate-manager/docs"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-certificates-list
  "Lists Certificates in a given project and location.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificates/list

parent <> 

optional:
pageSize <integer> Maximum number of certificates to return per call.
filter <string> Filter expression to restrict the Certificates returned.
orderBy <string> A list of Certificate field names used to specify the order of the returned results. The default sorting order is ascending. To specify descending order for a field, add a suffix `\" desc\"`."
  ([parent] (projects-locations-certificates-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+parent}/certificates",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-certificates-get
  "Gets details of a single Certificate.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificates/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-certificates-create
  "Creates a new Certificate in a given project and location.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificates/create

parent <> 
Certificate:
Certificate

optional:
certificateId <string> Required. A user-provided name of the certificate."
  ([parent Certificate]
    (projects-locations-certificates-create parent Certificate nil))
  ([parent Certificate optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+parent}/certificates",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Certificate})))

(defn projects-locations-certificates-patch
  "Updates a Certificate.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificates/patch

name <> 
Certificate:
Certificate

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask."
  ([name Certificate]
    (projects-locations-certificates-patch name Certificate nil))
  ([name Certificate optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Certificate})))

(defn projects-locations-certificates-delete
  "Deletes a single Certificate.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificates/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-certificateMaps-list
  "Lists CertificateMaps in a given project and location.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificateMaps/list

parent <> 

optional:
pageSize <integer> Maximum number of certificate maps to return per call.
filter <string> Filter expression to restrict the Certificates Maps returned.
orderBy <string> A list of Certificate Map field names used to specify the order of the returned results. The default sorting order is ascending. To specify descending order for a field, add a suffix `\" desc\"`."
  ([parent] (projects-locations-certificateMaps-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+parent}/certificateMaps",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-certificateMaps-get
  "Gets details of a single CertificateMap.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificateMaps/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-certificateMaps-create
  "Creates a new CertificateMap in a given project and location.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificateMaps/create

parent <> 
CertificateMap:
CertificateMap

optional:
certificateMapId <string> Required. A user-provided name of the certificate map."
  ([parent CertificateMap]
    (projects-locations-certificateMaps-create
      parent
      CertificateMap
      nil))
  ([parent CertificateMap optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+parent}/certificateMaps",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body CertificateMap})))

(defn projects-locations-certificateMaps-patch
  "Updates a CertificateMap.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificateMaps/patch

name <> 
CertificateMap:
CertificateMap

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask."
  ([name CertificateMap]
    (projects-locations-certificateMaps-patch name CertificateMap nil))
  ([name CertificateMap optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body CertificateMap})))

(defn projects-locations-certificateMaps-delete
  "Deletes a single CertificateMap. A Certificate Map can't be deleted if it contains Certificate Map Entries. Remove all the entries from the map before calling this method.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificateMaps/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-certificateMaps-certificateMapEntries-list
  "Lists CertificateMapEntries in a given project and location.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificateMaps/certificateMapEntries/list

parent <> 

optional:
pageSize <integer> Maximum number of certificate map entries to return. The service may return fewer than this value. If unspecified, at most 50 certificate map entries will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Filter expression to restrict the returned Certificate Map Entries.
orderBy <string> A list of Certificate Map Entry field names used to specify the order of the returned results. The default sorting order is ascending. To specify descending order for a field, add a suffix `\" desc\"`."
  ([parent]
    (projects-locations-certificateMaps-certificateMapEntries-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+parent}/certificateMapEntries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-certificateMaps-certificateMapEntries-get
  "Gets details of a single CertificateMapEntry.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificateMaps/certificateMapEntries/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-certificateMaps-certificateMapEntries-create
  "Creates a new CertificateMapEntry in a given project and location.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificateMaps/certificateMapEntries/create

parent <> 
CertificateMapEntry:
CertificateMapEntry

optional:
certificateMapEntryId <string> Required. A user-provided name of the certificate map entry."
  ([parent CertificateMapEntry]
    (projects-locations-certificateMaps-certificateMapEntries-create
      parent
      CertificateMapEntry
      nil))
  ([parent CertificateMapEntry optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+parent}/certificateMapEntries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body CertificateMapEntry})))

(defn projects-locations-certificateMaps-certificateMapEntries-patch
  "Updates a CertificateMapEntry.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificateMaps/certificateMapEntries/patch

name <> 
CertificateMapEntry:
CertificateMapEntry

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask."
  ([name CertificateMapEntry]
    (projects-locations-certificateMaps-certificateMapEntries-patch
      name
      CertificateMapEntry
      nil))
  ([name CertificateMapEntry optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body CertificateMapEntry})))

(defn projects-locations-certificateMaps-certificateMapEntries-delete
  "Deletes a single CertificateMapEntry.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificateMaps/certificateMapEntries/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dnsAuthorizations-list
  "Lists DnsAuthorizations in a given project and location.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/dnsAuthorizations/list

parent <> 

optional:
pageSize <integer> Maximum number of dns authorizations to return per call.
filter <string> Filter expression to restrict the Dns Authorizations returned.
orderBy <string> A list of Dns Authorization field names used to specify the order of the returned results. The default sorting order is ascending. To specify descending order for a field, add a suffix `\" desc\"`."
  ([parent] (projects-locations-dnsAuthorizations-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+parent}/dnsAuthorizations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dnsAuthorizations-get
  "Gets details of a single DnsAuthorization.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/dnsAuthorizations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dnsAuthorizations-create
  "Creates a new DnsAuthorization in a given project and location.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/dnsAuthorizations/create

parent <> 
DnsAuthorization:
DnsAuthorization

optional:
dnsAuthorizationId <string> Required. A user-provided name of the dns authorization."
  ([parent DnsAuthorization]
    (projects-locations-dnsAuthorizations-create
      parent
      DnsAuthorization
      nil))
  ([parent DnsAuthorization optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+parent}/dnsAuthorizations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body DnsAuthorization})))

(defn projects-locations-dnsAuthorizations-patch
  "Updates a DnsAuthorization.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/dnsAuthorizations/patch

name <> 
DnsAuthorization:
DnsAuthorization

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask."
  ([name DnsAuthorization]
    (projects-locations-dnsAuthorizations-patch
      name
      DnsAuthorization
      nil))
  ([name DnsAuthorization optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body DnsAuthorization})))

(defn projects-locations-dnsAuthorizations-delete
  "Deletes a single DnsAuthorization.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/dnsAuthorizations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-certificateIssuanceConfigs-list
  "Lists CertificateIssuanceConfigs in a given project and location.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificateIssuanceConfigs/list

parent <> 

optional:
pageSize <integer> Maximum number of certificate configs to return per call.
filter <string> Filter expression to restrict the Certificates Configs returned.
orderBy <string> A list of Certificate Config field names used to specify the order of the returned results. The default sorting order is ascending. To specify descending order for a field, add a suffix `\" desc\"`."
  ([parent]
    (projects-locations-certificateIssuanceConfigs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+parent}/certificateIssuanceConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-certificateIssuanceConfigs-get
  "Gets details of a single CertificateIssuanceConfig.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificateIssuanceConfigs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-certificateIssuanceConfigs-create
  "Creates a new CertificateIssuanceConfig in a given project and location.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificateIssuanceConfigs/create

parent <> 
CertificateIssuanceConfig:
CertificateIssuanceConfig

optional:
certificateIssuanceConfigId <string> Required. A user-provided name of the certificate config."
  ([parent CertificateIssuanceConfig]
    (projects-locations-certificateIssuanceConfigs-create
      parent
      CertificateIssuanceConfig
      nil))
  ([parent CertificateIssuanceConfig optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+parent}/certificateIssuanceConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body CertificateIssuanceConfig})))

(defn projects-locations-certificateIssuanceConfigs-delete
  "Deletes a single CertificateIssuanceConfig.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/certificateIssuanceConfigs/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-trustConfigs-list
  "Lists TrustConfigs in a given project and location.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/trustConfigs/list

parent <> 

optional:
pageSize <integer> Maximum number of TrustConfigs to return per call.
filter <string> Filter expression to restrict the TrustConfigs returned.
orderBy <string> A list of TrustConfig field names used to specify the order of the returned results. The default sorting order is ascending. To specify descending order for a field, add a suffix `\" desc\"`."
  ([parent] (projects-locations-trustConfigs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+parent}/trustConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-trustConfigs-get
  "Gets details of a single TrustConfig.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/trustConfigs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://certificatemanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-trustConfigs-create
  "Creates a new TrustConfig in a given project and location.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/trustConfigs/create

parent <> 
TrustConfig:
TrustConfig

optional:
trustConfigId <string> Required. A user-provided name of the TrustConfig. Must match the regexp `[a-z0-9-]{1,63}`."
  ([parent TrustConfig]
    (projects-locations-trustConfigs-create parent TrustConfig nil))
  ([parent TrustConfig optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+parent}/trustConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TrustConfig})))

(defn projects-locations-trustConfigs-patch
  "Updates a TrustConfig.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/trustConfigs/patch

name <> 
TrustConfig:
TrustConfig

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask."
  ([name TrustConfig]
    (projects-locations-trustConfigs-patch name TrustConfig nil))
  ([name TrustConfig optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TrustConfig})))

(defn projects-locations-trustConfigs-delete
  "Deletes a single TrustConfig.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/trustConfigs/delete

name <> 

optional:
etag <string> The current etag of the TrustConfig. If an etag is provided and does not match the current etag of the resource, deletion will be blocked and an ABORTED error will be returned."
  ([name] (projects-locations-trustConfigs-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://certificatemanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
