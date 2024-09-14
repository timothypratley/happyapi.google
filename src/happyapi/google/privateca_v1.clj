(ns happyapi.google.privateca-v1
  "Certificate Authority API
The Certificate Authority Service API is a highly-available, scalable service that enables you to simplify and automate the management of private certificate authorities (CAs) while staying in control of your private keys. 
See: https://cloud.google.com/")

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://privateca.googleapis.com/v1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://privateca.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://privateca.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://privateca.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://privateca.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  {:method :post,
   :uri-template "https://privateca.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CancelOperationRequest})

(defn projects-locations-caPools-list
  "Lists CaPools.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/list

parent <> 

optional:
pageSize <integer> Optional. Limit on the number of CaPools to include in the response. Further CaPools can subsequently be obtained by including the ListCaPoolsResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
filter <string> Optional. Only include resources that match the filter in the response.
orderBy <string> Optional. Specify how the results should be sorted."
  ([parent] (projects-locations-caPools-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://privateca.googleapis.com/v1/{+parent}/caPools",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-caPools-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://privateca.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-caPools-delete
  "Delete a CaPool.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/delete

name <> 

optional:
requestId <string> Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
ignoreDependentResources <boolean> Optional. This field allows this pool to be deleted even if it's being depended on by another resource. However, doing so may result in unintended and unrecoverable effects on any dependent resources since the pool will no longer be able to issue certificates."
  ([name] (projects-locations-caPools-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://privateca.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-caPools-fetchCaCerts
  "FetchCaCerts returns the current trust anchor for the CaPool. This will include CA certificate chains for all certificate authorities in the ENABLED, DISABLED, or STAGED states.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/fetchCaCerts

caPool <> 
FetchCaCertsRequest:
FetchCaCertsRequest"
  [caPool FetchCaCertsRequest]
  {:method :post,
   :uri-template
   "https://privateca.googleapis.com/v1/{+caPool}:fetchCaCerts",
   :uri-template-args {"caPool" caPool},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body FetchCaCertsRequest})

(defn projects-locations-caPools-patch
  "Update a CaPool.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/patch

name <> 
CaPool:
CaPool

optional:
updateMask <string> Required. A list of fields to be updated in this request.
requestId <string> Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name CaPool] (projects-locations-caPools-patch name CaPool nil))
  ([name CaPool optional]
    {:method :patch,
     :uri-template "https://privateca.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CaPool}))

(defn projects-locations-caPools-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-caPools-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://privateca.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-caPools-create
  "Create a CaPool.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/create

parent <> 
CaPool:
CaPool

optional:
caPoolId <string> Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
requestId <string> Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent CaPool]
    (projects-locations-caPools-create parent CaPool nil))
  ([parent CaPool optional]
    {:method :post,
     :uri-template
     "https://privateca.googleapis.com/v1/{+parent}/caPools",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CaPool}))

(defn projects-locations-caPools-get
  "Returns a CaPool.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://privateca.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-caPools-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://privateca.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-caPools-certificates-create
  "Create a new Certificate in a given Project, Location from a particular CaPool.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificates/create

parent <> 
Certificate:
Certificate

optional:
certificateId <string> Optional. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`. This field is required when using a CertificateAuthority in the Enterprise CertificateAuthority.Tier, but is optional and its value is ignored otherwise.
requestId <string> Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If this is true, no Certificate resource will be persisted regardless of the CaPool's tier, and the returned Certificate will not contain the pem_certificate field.
issuingCertificateAuthorityId <string> Optional. The resource ID of the CertificateAuthority that should issue the certificate. This optional field will ignore the load-balancing scheme of the Pool and directly issue the certificate from the CA with the specified ID, contained in the same CaPool referenced by `parent`. Per-CA quota rules apply. If left empty, a CertificateAuthority will be chosen from the CaPool by the service. For example, to issue a Certificate from a Certificate Authority with resource name \"projects/my-project/locations/us-central1/caPools/my-pool/certificateAuthorities/my-ca\", you can set the parent to \"projects/my-project/locations/us-central1/caPools/my-pool\" and the issuing_certificate_authority_id to \"my-ca\"."
  ([parent Certificate]
    (projects-locations-caPools-certificates-create
      parent
      Certificate
      nil))
  ([parent Certificate optional]
    {:method :post,
     :uri-template
     "https://privateca.googleapis.com/v1/{+parent}/certificates",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Certificate}))

(defn projects-locations-caPools-certificates-get
  "Returns a Certificate.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificates/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://privateca.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-caPools-certificates-list
  "Lists Certificates.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificates/list

parent <> 

optional:
pageSize <integer> Optional. Limit on the number of Certificates to include in the response. Further Certificates can subsequently be obtained by including the ListCertificatesResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
filter <string> Optional. Only include resources that match the filter in the response. For details on supported filters and syntax, see [Certificates Filtering documentation](https://cloud.google.com/certificate-authority-service/docs/sorting-filtering-certificates#filtering_support).
orderBy <string> Optional. Specify how the results should be sorted. For details on supported fields and syntax, see [Certificates Sorting documentation](https://cloud.google.com/certificate-authority-service/docs/sorting-filtering-certificates#sorting_support)."
  ([parent] (projects-locations-caPools-certificates-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://privateca.googleapis.com/v1/{+parent}/certificates",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-caPools-certificates-revoke
  "Revoke a Certificate.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificates/revoke

name <> 
RevokeCertificateRequest:
RevokeCertificateRequest"
  [name RevokeCertificateRequest]
  {:method :post,
   :uri-template "https://privateca.googleapis.com/v1/{+name}:revoke",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RevokeCertificateRequest})

(defn projects-locations-caPools-certificates-patch
  "Update a Certificate. Currently, the only field you can update is the labels field.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificates/patch

name <> 
Certificate:
Certificate

optional:
updateMask <string> Required. A list of fields to be updated in this request.
requestId <string> Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Certificate]
    (projects-locations-caPools-certificates-patch
      name
      Certificate
      nil))
  ([name Certificate optional]
    {:method :patch,
     :uri-template "https://privateca.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Certificate}))

(defn projects-locations-caPools-certificateAuthorities-fetch
  "Fetch a certificate signing request (CSR) from a CertificateAuthority that is in state AWAITING_USER_ACTIVATION and is of type SUBORDINATE. The CSR must then be signed by the desired parent Certificate Authority, which could be another CertificateAuthority resource, or could be an on-prem certificate authority. See also ActivateCertificateAuthority.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/fetch

name <> "
  [name]
  {:method :get,
   :uri-template "https://privateca.googleapis.com/v1/{+name}:fetch",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-caPools-certificateAuthorities-list
  "Lists CertificateAuthorities.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/list

parent <> 

optional:
pageSize <integer> Optional. Limit on the number of CertificateAuthorities to include in the response. Further CertificateAuthorities can subsequently be obtained by including the ListCertificateAuthoritiesResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
filter <string> Optional. Only include resources that match the filter in the response.
orderBy <string> Optional. Specify how the results should be sorted."
  ([parent]
    (projects-locations-caPools-certificateAuthorities-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://privateca.googleapis.com/v1/{+parent}/certificateAuthorities",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-caPools-certificateAuthorities-delete
  "Delete a CertificateAuthority.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/delete

name <> 

optional:
requestId <string> Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
ignoreActiveCertificates <boolean> Optional. This field allows the CA to be deleted even if the CA has active certs. Active certs include both unrevoked and unexpired certs.
skipGracePeriod <boolean> Optional. If this flag is set, the Certificate Authority will be deleted as soon as possible without a 30-day grace period where undeletion would have been allowed. If you proceed, there will be no way to recover this CA.
ignoreDependentResources <boolean> Optional. This field allows this CA to be deleted even if it's being depended on by another resource. However, doing so may result in unintended and unrecoverable effects on any dependent resources since the CA will no longer be able to issue certificates."
  ([name]
    (projects-locations-caPools-certificateAuthorities-delete
      name
      nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://privateca.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-caPools-certificateAuthorities-activate
  "Activate a CertificateAuthority that is in state AWAITING_USER_ACTIVATION and is of type SUBORDINATE. After the parent Certificate Authority signs a certificate signing request from FetchCertificateAuthorityCsr, this method can complete the activation process.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/activate

name <> 
ActivateCertificateAuthorityRequest:
ActivateCertificateAuthorityRequest"
  [name ActivateCertificateAuthorityRequest]
  {:method :post,
   :uri-template
   "https://privateca.googleapis.com/v1/{+name}:activate",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ActivateCertificateAuthorityRequest})

(defn projects-locations-caPools-certificateAuthorities-undelete
  "Undelete a CertificateAuthority that has been deleted.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/undelete

name <> 
UndeleteCertificateAuthorityRequest:
UndeleteCertificateAuthorityRequest"
  [name UndeleteCertificateAuthorityRequest]
  {:method :post,
   :uri-template
   "https://privateca.googleapis.com/v1/{+name}:undelete",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body UndeleteCertificateAuthorityRequest})

(defn projects-locations-caPools-certificateAuthorities-enable
  "Enable a CertificateAuthority.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/enable

name <> 
EnableCertificateAuthorityRequest:
EnableCertificateAuthorityRequest"
  [name EnableCertificateAuthorityRequest]
  {:method :post,
   :uri-template "https://privateca.googleapis.com/v1/{+name}:enable",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body EnableCertificateAuthorityRequest})

(defn projects-locations-caPools-certificateAuthorities-disable
  "Disable a CertificateAuthority.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/disable

name <> 
DisableCertificateAuthorityRequest:
DisableCertificateAuthorityRequest"
  [name DisableCertificateAuthorityRequest]
  {:method :post,
   :uri-template "https://privateca.googleapis.com/v1/{+name}:disable",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body DisableCertificateAuthorityRequest})

(defn projects-locations-caPools-certificateAuthorities-patch
  "Update a CertificateAuthority.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/patch

name <> 
CertificateAuthority:
CertificateAuthority

optional:
updateMask <string> Required. A list of fields to be updated in this request.
requestId <string> Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name CertificateAuthority]
    (projects-locations-caPools-certificateAuthorities-patch
      name
      CertificateAuthority
      nil))
  ([name CertificateAuthority optional]
    {:method :patch,
     :uri-template "https://privateca.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CertificateAuthority}))

(defn projects-locations-caPools-certificateAuthorities-create
  "Create a new CertificateAuthority in a given Project and Location.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/create

parent <> 
CertificateAuthority:
CertificateAuthority

optional:
certificateAuthorityId <string> Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
requestId <string> Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent CertificateAuthority]
    (projects-locations-caPools-certificateAuthorities-create
      parent
      CertificateAuthority
      nil))
  ([parent CertificateAuthority optional]
    {:method :post,
     :uri-template
     "https://privateca.googleapis.com/v1/{+parent}/certificateAuthorities",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CertificateAuthority}))

(defn projects-locations-caPools-certificateAuthorities-get
  "Returns a CertificateAuthority.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://privateca.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-caPools-certificateAuthorities-certificateRevocationLists-get
  "Returns a CertificateRevocationList.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/certificateRevocationLists/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://privateca.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-caPools-certificateAuthorities-certificateRevocationLists-list
  "Lists CertificateRevocationLists.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/certificateRevocationLists/list

parent <> 

optional:
pageSize <integer> Optional. Limit on the number of CertificateRevocationLists to include in the response. Further CertificateRevocationLists can subsequently be obtained by including the ListCertificateRevocationListsResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
filter <string> Optional. Only include resources that match the filter in the response.
orderBy <string> Optional. Specify how the results should be sorted."
  ([parent]
    (projects-locations-caPools-certificateAuthorities-certificateRevocationLists-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://privateca.googleapis.com/v1/{+parent}/certificateRevocationLists",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-caPools-certificateAuthorities-certificateRevocationLists-patch
  "Update a CertificateRevocationList.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/certificateRevocationLists/patch

name <> 
CertificateRevocationList:
CertificateRevocationList

optional:
updateMask <string> Required. A list of fields to be updated in this request.
requestId <string> Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name CertificateRevocationList]
    (projects-locations-caPools-certificateAuthorities-certificateRevocationLists-patch
      name
      CertificateRevocationList
      nil))
  ([name CertificateRevocationList optional]
    {:method :patch,
     :uri-template "https://privateca.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CertificateRevocationList}))

(defn projects-locations-caPools-certificateAuthorities-certificateRevocationLists-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/certificateRevocationLists/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://privateca.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-caPools-certificateAuthorities-certificateRevocationLists-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/certificateRevocationLists/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-caPools-certificateAuthorities-certificateRevocationLists-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://privateca.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-caPools-certificateAuthorities-certificateRevocationLists-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/caPools/certificateAuthorities/certificateRevocationLists/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://privateca.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-certificateTemplates-create
  "Create a new CertificateTemplate in a given Project and Location.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/certificateTemplates/create

parent <> 
CertificateTemplate:
CertificateTemplate

optional:
certificateTemplateId <string> Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
requestId <string> Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent CertificateTemplate]
    (projects-locations-certificateTemplates-create
      parent
      CertificateTemplate
      nil))
  ([parent CertificateTemplate optional]
    {:method :post,
     :uri-template
     "https://privateca.googleapis.com/v1/{+parent}/certificateTemplates",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CertificateTemplate}))

(defn projects-locations-certificateTemplates-delete
  "DeleteCertificateTemplate deletes a CertificateTemplate.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/certificateTemplates/delete

name <> 

optional:
requestId <string> Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-certificateTemplates-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://privateca.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-certificateTemplates-get
  "Returns a CertificateTemplate.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/certificateTemplates/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://privateca.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-certificateTemplates-list
  "Lists CertificateTemplates.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/certificateTemplates/list

parent <> 

optional:
pageSize <integer> Optional. Limit on the number of CertificateTemplates to include in the response. Further CertificateTemplates can subsequently be obtained by including the ListCertificateTemplatesResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
filter <string> Optional. Only include resources that match the filter in the response.
orderBy <string> Optional. Specify how the results should be sorted."
  ([parent] (projects-locations-certificateTemplates-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://privateca.googleapis.com/v1/{+parent}/certificateTemplates",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-certificateTemplates-patch
  "Update a CertificateTemplate.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/certificateTemplates/patch

name <> 
CertificateTemplate:
CertificateTemplate

optional:
updateMask <string> Required. A list of fields to be updated in this request.
requestId <string> Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name CertificateTemplate]
    (projects-locations-certificateTemplates-patch
      name
      CertificateTemplate
      nil))
  ([name CertificateTemplate optional]
    {:method :patch,
     :uri-template "https://privateca.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CertificateTemplate}))

(defn projects-locations-certificateTemplates-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/certificateTemplates/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://privateca.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-certificateTemplates-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/certificateTemplates/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-certificateTemplates-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://privateca.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-certificateTemplates-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/certificateTemplates/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://privateca.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})
