(ns happyapi.google.domains-v1
  "Cloud Domains API
Enables management and configuration of domain names.
See: https://cloud.google.com/domains/docs")

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://domains.googleapis.com/v1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://domains.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://domains.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://domains.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-registrations-resetAuthorizationCode
  "Resets the authorization code of the `Registration` to a new random string. You can call this method only after 60 days have elapsed since the initial domain registration. Domains that have the `REQUIRE_PUSH_TRANSFER` property in the list of `domain_properties` don't support authorization codes and must use the `InitiatePushTransfer` method to initiate the process to transfer the domain to a different registrar.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/resetAuthorizationCode

registration <> 
ResetAuthorizationCodeRequest:
ResetAuthorizationCodeRequest"
  [registration ResetAuthorizationCodeRequest]
  {:method :post,
   :uri-template
   "https://domains.googleapis.com/v1/{+registration}:resetAuthorizationCode",
   :uri-template-args {"registration" registration},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ResetAuthorizationCodeRequest})

(defn projects-locations-registrations-initiatePushTransfer
  "Initiates the `Push Transfer` process to transfer the domain to another registrar. The process might complete instantly or might require confirmation or additional work. Check the emails sent to the email address of the registrant. The process is aborted after a timeout if it's not completed. This method is only supported for domains that have the `REQUIRE_PUSH_TRANSFER` property in the list of `domain_properties`. The domain must also be unlocked before it can be transferred to a different registrar. For more information, see [Transfer a registered domain to another registrar](https://cloud.google.com/domains/docs/transfer-domain-to-another-registrar).
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/initiatePushTransfer

registration <> 
InitiatePushTransferRequest:
InitiatePushTransferRequest"
  [registration InitiatePushTransferRequest]
  {:method :post,
   :uri-template
   "https://domains.googleapis.com/v1/{+registration}:initiatePushTransfer",
   :uri-template-args {"registration" registration},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body InitiatePushTransferRequest})

(defn projects-locations-registrations-list
  "Lists the `Registration` resources in a project.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/list

parent <> 

optional:
pageSize <integer> Maximum number of results to return.
filter <string> Filter expression to restrict the `Registration`s returned. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, a boolean, or an enum value. The comparison operator should be one of =, !=, >, <, >=, <=, or : for prefix or wildcard matches. For example, to filter to a specific domain name, use an expression like `domainName=\"example.com\"`. You can also check for the existence of a field; for example, to find domains using custom DNS settings, use an expression like `dnsSettings.customDns:*`. You can also create compound filters by combining expressions with the `AND` and `OR` operators. For example, to find domains that are suspended or have specific issues flagged, use an expression like `(state=SUSPENDED) OR (issue:*)`."
  ([parent] (projects-locations-registrations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://domains.googleapis.com/v1/{+parent}/registrations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-registrations-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://domains.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-registrations-searchDomains
  "Searches for available domain names similar to the provided query. Availability results from this method are approximate; call `RetrieveRegisterParameters` on a domain before registering to confirm availability.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/searchDomains

location <> 

optional:
query <string> Required. String used to search for available domain names."
  ([location]
    (projects-locations-registrations-searchDomains location nil))
  ([location optional]
    {:method :get,
     :uri-template
     "https://domains.googleapis.com/v1/{+location}/registrations:searchDomains",
     :uri-template-args {"location" location},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-registrations-delete
  "Deletes a `Registration` resource. This method works on any `Registration` resource using [Subscription or Commitment billing](/domains/pricing#billing-models), provided that the resource was created at least 1 day in the past. When an active registration is successfully deleted, you can continue to use the domain in [Google Domains](https://domains.google/) until it expires. The calling user becomes the domain's sole owner in Google Domains, and permissions for the domain are subsequently managed there. The domain does not renew automatically unless the new owner sets up billing in Google Domains. After January 2024 you will only be able to delete `Registration` resources when `state` is one of: `EXPORTED`, `EXPIRED`,`REGISTRATION_FAILED` or `TRANSFER_FAILED`. See [Cloud Domains feature deprecation](https://cloud.google.com/domains/docs/deprecations/feature-deprecations) for more details.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://domains.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-registrations-configureContactSettings
  "Updates a `Registration`'s contact settings. Some changes require confirmation by the domain's registrant contact . Caution: Please consider carefully any changes to contact privacy settings when changing from `REDACTED_CONTACT_DATA` to `PUBLIC_CONTACT_DATA.` There may be a delay in reflecting updates you make to registrant contact information such that any changes you make to contact privacy (including from `REDACTED_CONTACT_DATA` to `PUBLIC_CONTACT_DATA`) will be applied without delay but changes to registrant contact information may take a limited time to be publicized. This means that changes to contact privacy from `REDACTED_CONTACT_DATA` to `PUBLIC_CONTACT_DATA` may make the previous registrant contact data public until the modified registrant contact details are published.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/configureContactSettings

registration <> 
ConfigureContactSettingsRequest:
ConfigureContactSettingsRequest"
  [registration ConfigureContactSettingsRequest]
  {:method :post,
   :uri-template
   "https://domains.googleapis.com/v1/{+registration}:configureContactSettings",
   :uri-template-args {"registration" registration},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ConfigureContactSettingsRequest})

(defn projects-locations-registrations-export
  "Deprecated: For more information, see [Cloud Domains feature deprecation](https://cloud.google.com/domains/docs/deprecations/feature-deprecations) Exports a `Registration` resource, such that it is no longer managed by Cloud Domains. When an active domain is successfully exported, you can continue to use the domain in [Google Domains](https://domains.google/) until it expires. The calling user becomes the domain's sole owner in Google Domains, and permissions for the domain are subsequently managed there. The domain does not renew automatically unless the new owner sets up billing in Google Domains.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/export

name <> 
ExportRegistrationRequest:
ExportRegistrationRequest"
  [name ExportRegistrationRequest]
  {:method :post,
   :uri-template "https://domains.googleapis.com/v1/{+name}:export",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ExportRegistrationRequest})

(defn projects-locations-registrations-retrieveImportableDomains
  "Deprecated: For more information, see [Cloud Domains feature deprecation](https://cloud.google.com/domains/docs/deprecations/feature-deprecations) Lists domain names from [Google Domains](https://domains.google/) that can be imported to Cloud Domains using the `ImportDomain` method. Since individual users can own domains in Google Domains, the list of domains returned depends on the individual user making the call. Domains already managed by Cloud Domains are not returned.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/retrieveImportableDomains

location <> 

optional:
pageSize <integer> Maximum number of results to return."
  ([location]
    (projects-locations-registrations-retrieveImportableDomains
      location
      nil))
  ([location optional]
    {:method :get,
     :uri-template
     "https://domains.googleapis.com/v1/{+location}/registrations:retrieveImportableDomains",
     :uri-template-args {"location" location},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-registrations-renewDomain
  "Renews a recently expired domain. This method can only be called on domains that expired in the previous 30 days. After the renewal, the new expiration time of the domain is one year after the old expiration time and you are charged a `yearly_price` for the renewal.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/renewDomain

registration <> 
RenewDomainRequest:
RenewDomainRequest"
  [registration RenewDomainRequest]
  {:method :post,
   :uri-template
   "https://domains.googleapis.com/v1/{+registration}:renewDomain",
   :uri-template-args {"registration" registration},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RenewDomainRequest})

(defn projects-locations-registrations-import
  "Deprecated: For more information, see [Cloud Domains feature deprecation](https://cloud.google.com/domains/docs/deprecations/feature-deprecations) Imports a domain name from [Google Domains](https://domains.google/) for use in Cloud Domains. To transfer a domain from another registrar, use the `TransferDomain` method instead. Since individual users can own domains in Google Domains, the calling user must have ownership permission on the domain.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/import

parent <> 
ImportDomainRequest:
ImportDomainRequest"
  [parent ImportDomainRequest]
  {:method :post,
   :uri-template
   "https://domains.googleapis.com/v1/{+parent}/registrations:import",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ImportDomainRequest})

(defn projects-locations-registrations-configureManagementSettings
  "Updates a `Registration`'s management settings.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/configureManagementSettings

registration <> 
ConfigureManagementSettingsRequest:
ConfigureManagementSettingsRequest"
  [registration ConfigureManagementSettingsRequest]
  {:method :post,
   :uri-template
   "https://domains.googleapis.com/v1/{+registration}:configureManagementSettings",
   :uri-template-args {"registration" registration},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ConfigureManagementSettingsRequest})

(defn projects-locations-registrations-retrieveGoogleDomainsDnsRecords
  "Lists the DNS records from the Google Domains DNS zone for domains that use the deprecated `google_domains_dns` in the `Registration`'s `dns_settings`.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/retrieveGoogleDomainsDnsRecords

registration <> 

optional:
pageSize <integer> Optional. Maximum number of results to return."
  ([registration]
    (projects-locations-registrations-retrieveGoogleDomainsDnsRecords
      registration
      nil))
  ([registration optional]
    {:method :get,
     :uri-template
     "https://domains.googleapis.com/v1/{+registration}:retrieveGoogleDomainsDnsRecords",
     :uri-template-args {"registration" registration},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-registrations-patch
  "Updates select fields of a `Registration` resource, notably `labels`. To update other fields, use the appropriate custom update method: * To update management settings, see `ConfigureManagementSettings` * To update DNS configuration, see `ConfigureDnsSettings` * To update contact information, see `ConfigureContactSettings`
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/patch

name <> 
Registration:
Registration

optional:
updateMask <string> Required. The field mask describing which fields to update as a comma-separated list. For example, if only the labels are being updated, the `update_mask` is `\"labels\"`."
  ([name Registration]
    (projects-locations-registrations-patch name Registration nil))
  ([name Registration optional]
    {:method :patch,
     :uri-template "https://domains.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Registration}))

(defn projects-locations-registrations-register
  "Registers a new domain name and creates a corresponding `Registration` resource. Call `RetrieveRegisterParameters` first to check availability of the domain name and determine parameters like price that are needed to build a call to this method. A successful call creates a `Registration` resource in state `REGISTRATION_PENDING`, which resolves to `ACTIVE` within 1-2 minutes, indicating that the domain was successfully registered. If the resource ends up in state `REGISTRATION_FAILED`, it indicates that the domain was not registered successfully, and you can safely delete the resource and retry registration.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/register

parent <> 
RegisterDomainRequest:
RegisterDomainRequest"
  [parent RegisterDomainRequest]
  {:method :post,
   :uri-template
   "https://domains.googleapis.com/v1/{+parent}/registrations:register",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RegisterDomainRequest})

(defn projects-locations-registrations-transfer
  "Deprecated: For more information, see [Cloud Domains feature deprecation](https://cloud.google.com/domains/docs/deprecations/feature-deprecations) Transfers a domain name from another registrar to Cloud Domains. For domains already managed by [Google Domains](https://domains.google/), use `ImportDomain` instead. Before calling this method, go to the domain's current registrar to unlock the domain for transfer and retrieve the domain's transfer authorization code. Then call `RetrieveTransferParameters` to confirm that the domain is unlocked and to get values needed to build a call to this method. A successful call creates a `Registration` resource in state `TRANSFER_PENDING`. It can take several days to complete the transfer process. The registrant can often speed up this process by approving the transfer through the current registrar, either by clicking a link in an email from the registrar or by visiting the registrar's website. A few minutes after transfer approval, the resource transitions to state `ACTIVE`, indicating that the transfer was successful. If the transfer is rejected or the request expires without being approved, the resource can end up in state `TRANSFER_FAILED`. If transfer fails, you can safely delete the resource and retry the transfer.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/transfer

parent <> 
TransferDomainRequest:
TransferDomainRequest"
  [parent TransferDomainRequest]
  {:method :post,
   :uri-template
   "https://domains.googleapis.com/v1/{+parent}/registrations:transfer",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TransferDomainRequest})

(defn projects-locations-registrations-retrieveGoogleDomainsForwardingConfig
  "Lists the deprecated domain and email forwarding configurations you set up in the deprecated Google Domains UI. The configuration is present only for domains with the `google_domains_redirects_data_available` set to `true` in the `Registration`'s `dns_settings`. A forwarding configuration might not work correctly if required DNS records are not present in the domain's authoritative DNS Zone.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/retrieveGoogleDomainsForwardingConfig

registration <> "
  [registration]
  {:method :get,
   :uri-template
   "https://domains.googleapis.com/v1/{+registration}:retrieveGoogleDomainsForwardingConfig",
   :uri-template-args {"registration" registration},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-registrations-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-registrations-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://domains.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-registrations-retrieveTransferParameters
  "Deprecated: For more information, see [Cloud Domains feature deprecation](https://cloud.google.com/domains/docs/deprecations/feature-deprecations) Gets parameters needed to transfer a domain name from another registrar to Cloud Domains. For domains already managed by [Google Domains](https://domains.google/), use `ImportDomain` instead. Use the returned values to call `TransferDomain`.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/retrieveTransferParameters

location <> 

optional:
domainName <string> Required. The domain name. Unicode domain names must be expressed in Punycode format."
  ([location]
    (projects-locations-registrations-retrieveTransferParameters
      location
      nil))
  ([location optional]
    {:method :get,
     :uri-template
     "https://domains.googleapis.com/v1/{+location}/registrations:retrieveTransferParameters",
     :uri-template-args {"location" location},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-registrations-retrieveAuthorizationCode
  "Gets the authorization code of the `Registration` for the purpose of transferring the domain to another registrar. You can call this method only after 60 days have elapsed since the initial domain registration. Domains that have the `REQUIRE_PUSH_TRANSFER` property in the list of `domain_properties` don't support authorization codes and must use the `InitiatePushTransfer` method to initiate the process to transfer the domain to a different registrar.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/retrieveAuthorizationCode

registration <> "
  [registration]
  {:method :get,
   :uri-template
   "https://domains.googleapis.com/v1/{+registration}:retrieveAuthorizationCode",
   :uri-template-args {"registration" registration},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-registrations-configureDnsSettings
  "Updates a `Registration`'s DNS settings.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/configureDnsSettings

registration <> 
ConfigureDnsSettingsRequest:
ConfigureDnsSettingsRequest"
  [registration ConfigureDnsSettingsRequest]
  {:method :post,
   :uri-template
   "https://domains.googleapis.com/v1/{+registration}:configureDnsSettings",
   :uri-template-args {"registration" registration},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ConfigureDnsSettingsRequest})

(defn projects-locations-registrations-retrieveRegisterParameters
  "Gets parameters needed to register a new domain name, including price and up-to-date availability. Use the returned values to call `RegisterDomain`.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/retrieveRegisterParameters

location <> 

optional:
domainName <string> Required. The domain name. Unicode domain names must be expressed in Punycode format."
  ([location]
    (projects-locations-registrations-retrieveRegisterParameters
      location
      nil))
  ([location optional]
    {:method :get,
     :uri-template
     "https://domains.googleapis.com/v1/{+location}/registrations:retrieveRegisterParameters",
     :uri-template-args {"location" location},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-registrations-get
  "Gets the details of a `Registration` resource.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://domains.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-registrations-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/domains/docs/v1/reference/rest/v1/projects/locations/registrations/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://domains.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})
