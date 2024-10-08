(ns happyapi.google.apigee-v1
  "Apigee API
Use the Apigee API to programmatically develop and manage APIs with a set of RESTful operations. Develop and secure API proxies, deploy and undeploy API proxy revisions, monitor APIs, configure environments, manage users, and more. Note: This product is available as a free trial for a time period of 60 days.
See: https://cloud.google.com/apigee")

(defn projects-provisionOrganization
  "Provisions a new Apigee organization with a functioning runtime. This is the standard way to create trial organizations for a free Apigee trial.
https://cloud.google.com/apigee/v1/reference/rest/v1/projects/provisionOrganization

project <> 
GoogleCloudApigeeV1ProvisionOrganizationRequest:
GoogleCloudApigeeV1ProvisionOrganizationRequest"
  [project GoogleCloudApigeeV1ProvisionOrganizationRequest]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+project}:provisionOrganization",
   :uri-template-args {"project" project},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1ProvisionOrganizationRequest})

(defn organizations-list
  "Lists the Apigee organizations and associated Google Cloud projects that you have permission to access. See [Understanding organizations](https://cloud.google.com/apigee/docs/api-platform/fundamentals/organization-structure).
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/list

parent <> "
  [parent]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+parent}",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-delete
  "Delete an Apigee organization. For organizations with BillingType EVALUATION, an immediate deletion is performed. For paid organizations (Subscription or Pay-as-you-go), a soft-deletion is performed. The organization can be restored within the soft-deletion period, which is specified using the `retention` field in the request or by filing a support ticket with Apigee. During the data retention period specified in the request, the Apigee organization cannot be recreated in the same Google Cloud project. **IMPORTANT: The default data retention setting for this operation is 7 days. To permanently delete the organization in 24 hours, set the retention parameter to `MINIMUM`.**
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/delete

name <> 

optional:
retention <string> Optional. This setting is applicable only for organizations that are soft-deleted (i.e., BillingType is not EVALUATION). It controls how long Organization data will be retained after the initial delete operation completes. During this period, the Organization may be restored to its last known state. After this period, the Organization will no longer be able to be restored. **Note: During the data retention period specified using this field, the Apigee organization cannot be recreated in the same GCP project.**"
  ([name] (organizations-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-updateSecuritySettings
  "UpdateSecuritySettings updates the current security settings for API Security.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/updateSecuritySettings

name <> 
GoogleCloudApigeeV1SecuritySettings:
GoogleCloudApigeeV1SecuritySettings

optional:
updateMask <string> Optional. The list of fields to update. Allowed fields are: - ml_retraining_feedback_enabled"
  ([name GoogleCloudApigeeV1SecuritySettings]
    (organizations-updateSecuritySettings
      name
      GoogleCloudApigeeV1SecuritySettings
      nil))
  ([name GoogleCloudApigeeV1SecuritySettings optional]
    {:method :patch,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1SecuritySettings}))

(defn organizations-getSecuritySettings
  "GetSecuritySettings gets the security settings for API Security.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/getSecuritySettings

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-setSyncAuthorization
  "Sets the permissions required to allow the Synchronizer to download environment data from the control plane. You must call this API to enable proper functioning of hybrid. Pass the ETag when calling `setSyncAuthorization` to ensure that you are updating the correct version. To get an ETag, call [getSyncAuthorization](getSyncAuthorization). If you don't pass the ETag in the call to `setSyncAuthorization`, then the existing authorization is overwritten indiscriminately. For more information, see [Configure the Synchronizer](https://cloud.google.com/apigee/docs/hybrid/latest/synchronizer-access). **Note**: Available to Apigee hybrid only.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/setSyncAuthorization

name <> 
GoogleCloudApigeeV1SyncAuthorization:
GoogleCloudApigeeV1SyncAuthorization"
  [name GoogleCloudApigeeV1SyncAuthorization]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+name}:setSyncAuthorization",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1SyncAuthorization})

(defn organizations-setAddons
  "Configures the add-ons for the Apigee organization. The existing add-on configuration will be fully replaced.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/setAddons

org <> 
GoogleCloudApigeeV1SetAddonsRequest:
GoogleCloudApigeeV1SetAddonsRequest"
  [org GoogleCloudApigeeV1SetAddonsRequest]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+org}:setAddons",
   :uri-template-args {"org" org},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1SetAddonsRequest})

(defn organizations-update
  "Updates the properties for an Apigee organization. No other fields in the organization profile will be updated.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/update

name <> 
GoogleCloudApigeeV1Organization:
GoogleCloudApigeeV1Organization"
  [name GoogleCloudApigeeV1Organization]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Organization})

(defn organizations-getDeployedIngressConfig
  "Gets the deployed ingress configuration for an organization.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/getDeployedIngressConfig

name <> 

optional:
view <string> When set to FULL, additional details about the specific deployments receiving traffic will be included in the IngressConfig response's RoutingRules."
  ([name] (organizations-getDeployedIngressConfig name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-getProjectMapping
  "Gets the project ID and region for an Apigee organization.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/getProjectMapping

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+name}:getProjectMapping",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-getRuntimeConfig
  "Get runtime config for an organization.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/getRuntimeConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-create
  "Creates an Apigee organization. See [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/create

GoogleCloudApigeeV1Organization:
GoogleCloudApigeeV1Organization

optional:
parent <string> Required. Name of the Google Cloud project in which to associate the Apigee organization. Pass the information as a query parameter using the following structure in your request: `projects/`"
  ([GoogleCloudApigeeV1Organization]
    (organizations-create GoogleCloudApigeeV1Organization nil))
  ([GoogleCloudApigeeV1Organization optional]
    {:method :post,
     :uri-template "https://apigee.googleapis.com/v1/organizations",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1Organization}))

(defn organizations-getSyncAuthorization
  "Lists the service accounts with the permissions required to allow the Synchronizer to download environment data from the control plane. An ETag is returned in the response to `getSyncAuthorization`. Pass that ETag when calling [setSyncAuthorization](setSyncAuthorization) to ensure that you are updating the correct version. If you don't pass the ETag in the call to `setSyncAuthorization`, then the existing authorization is overwritten indiscriminately. For more information, see [Configure the Synchronizer](https://cloud.google.com/apigee/docs/hybrid/latest/synchronizer-access). **Note**: Available to Apigee hybrid only.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/getSyncAuthorization

name <> 
GoogleCloudApigeeV1GetSyncAuthorizationRequest:
GoogleCloudApigeeV1GetSyncAuthorizationRequest"
  [name GoogleCloudApigeeV1GetSyncAuthorizationRequest]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+name}:getSyncAuthorization",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1GetSyncAuthorizationRequest})

(defn organizations-get
  "Gets the profile for an Apigee organization. See [Understanding organizations](https://cloud.google.com/apigee/docs/api-platform/fundamentals/organization-structure).
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-securityProfiles-patch
  "UpdateSecurityProfile update the metadata of security profile.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/securityProfiles/patch

name <> 
GoogleCloudApigeeV1SecurityProfile:
GoogleCloudApigeeV1SecurityProfile

optional:
updateMask <string> Required. The list of fields to update."
  ([name GoogleCloudApigeeV1SecurityProfile]
    (organizations-securityProfiles-patch
      name
      GoogleCloudApigeeV1SecurityProfile
      nil))
  ([name GoogleCloudApigeeV1SecurityProfile optional]
    {:method :patch,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1SecurityProfile}))

(defn organizations-securityProfiles-list
  "ListSecurityProfiles lists all the security profiles associated with the org including attached and unattached profiles.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/securityProfiles/list

parent <> 

optional:
pageSize <integer> The maximum number of profiles to return. The service may return fewer than this value. If unspecified, at most 50 profiles will be returned."
  ([parent] (organizations-securityProfiles-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/securityProfiles",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-securityProfiles-delete
  "DeleteSecurityProfile delete a profile with all its revisions.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/securityProfiles/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-securityProfiles-get
  "GetSecurityProfile gets the specified security profile. Returns NOT_FOUND if security profile is not present for the specified organization.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/securityProfiles/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-securityProfiles-create
  "CreateSecurityProfile create a new custom security profile.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/securityProfiles/create

parent <> 
GoogleCloudApigeeV1SecurityProfile:
GoogleCloudApigeeV1SecurityProfile

optional:
securityProfileId <string> Required. The ID to use for the SecurityProfile, which will become the final component of the action's resource name. This value should be 1-63 characters and validated by \"(^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$)\"."
  ([parent GoogleCloudApigeeV1SecurityProfile]
    (organizations-securityProfiles-create
      parent
      GoogleCloudApigeeV1SecurityProfile
      nil))
  ([parent GoogleCloudApigeeV1SecurityProfile optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/securityProfiles",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1SecurityProfile}))

(defn organizations-securityProfiles-listRevisions
  "ListSecurityProfileRevisions lists all the revisions of the security profile.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/securityProfiles/listRevisions

name <> 

optional:
pageSize <integer> The maximum number of profile revisions to return. The service may return fewer than this value. If unspecified, at most 50 revisions will be returned."
  ([name] (organizations-securityProfiles-listRevisions name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+name}:listRevisions",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-securityProfiles-environments-create
  "CreateSecurityProfileEnvironmentAssociation creates profile environment association i.e. attaches environment to security profile.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/securityProfiles/environments/create

parent <> 
GoogleCloudApigeeV1SecurityProfileEnvironmentAssociation:
GoogleCloudApigeeV1SecurityProfileEnvironmentAssociation"
  [parent GoogleCloudApigeeV1SecurityProfileEnvironmentAssociation]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/environments",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1SecurityProfileEnvironmentAssociation})

(defn organizations-securityProfiles-environments-delete
  "DeleteSecurityProfileEnvironmentAssociation removes profile environment association i.e. detaches environment from security profile.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/securityProfiles/environments/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-securityProfiles-environments-computeEnvironmentScores
  "ComputeEnvironmentScores calculates scores for requested time range for the specified security profile and environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/securityProfiles/environments/computeEnvironmentScores

profileEnvironment <> 
GoogleCloudApigeeV1ComputeEnvironmentScoresRequest:
GoogleCloudApigeeV1ComputeEnvironmentScoresRequest"
  [profileEnvironment
   GoogleCloudApigeeV1ComputeEnvironmentScoresRequest]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+profileEnvironment}:computeEnvironmentScores",
   :uri-template-args {"profileEnvironment" profileEnvironment},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1ComputeEnvironmentScoresRequest})

(defn organizations-sites-apidocs-update
  "Updates a catalog item.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sites/apidocs/update

name <> 
GoogleCloudApigeeV1ApiDoc:
GoogleCloudApigeeV1ApiDoc"
  [name GoogleCloudApigeeV1ApiDoc]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1ApiDoc})

(defn organizations-sites-apidocs-delete
  "Deletes a catalog item.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sites/apidocs/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-sites-apidocs-list
  "Returns the catalog items associated with a portal.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sites/apidocs/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of items to return. The service may return fewer than this value. If unspecified, at most 25 books will be returned. The maximum value is 100; values above 100 will be coerced to 100."
  ([parent] (organizations-sites-apidocs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/apidocs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-sites-apidocs-get
  "Gets a catalog item.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sites/apidocs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-sites-apidocs-updateDocumentation
  "Updates the documentation for the specified catalog item. Note that the documentation file contents will not be populated in the return message.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sites/apidocs/updateDocumentation

name <> 
GoogleCloudApigeeV1ApiDocDocumentation:
GoogleCloudApigeeV1ApiDocDocumentation"
  [name GoogleCloudApigeeV1ApiDocDocumentation]
  {:method :patch,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1ApiDocDocumentation})

(defn organizations-sites-apidocs-create
  "Creates a new catalog item.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sites/apidocs/create

parent <> 
GoogleCloudApigeeV1ApiDoc:
GoogleCloudApigeeV1ApiDoc"
  [parent GoogleCloudApigeeV1ApiDoc]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+parent}/apidocs",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1ApiDoc})

(defn organizations-sites-apidocs-getDocumentation
  "Gets the documentation for the specified catalog item.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sites/apidocs/getDocumentation

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-sites-apicategories-patch
  "Updates an API category.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sites/apicategories/patch

name <> 
GoogleCloudApigeeV1ApiCategory:
GoogleCloudApigeeV1ApiCategory"
  [name GoogleCloudApigeeV1ApiCategory]
  {:method :patch,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1ApiCategory})

(defn organizations-sites-apicategories-create
  "Creates a new API category.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sites/apicategories/create

parent <> 
GoogleCloudApigeeV1ApiCategory:
GoogleCloudApigeeV1ApiCategory"
  [parent GoogleCloudApigeeV1ApiCategory]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/apicategories",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1ApiCategory})

(defn organizations-sites-apicategories-get
  "Gets an API category.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sites/apicategories/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-sites-apicategories-list
  "Returns the API categories associated with a portal.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sites/apicategories/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/apicategories",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-sites-apicategories-delete
  "Deletes an API category.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sites/apicategories/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-reports-get
  "Retrieve a custom report definition.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/reports/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-reports-create
  "Creates a Custom Report for an Organization. A Custom Report provides Apigee Customers to create custom dashboards in addition to the standard dashboards which are provided. The Custom Report in its simplest form contains specifications about metrics, dimensions and filters. It is important to note that the custom report by itself does not provide an executable entity. The Edge UI converts the custom report definition into an analytics query and displays the result in a chart.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/reports/create

parent <> 
GoogleCloudApigeeV1CustomReport:
GoogleCloudApigeeV1CustomReport"
  [parent GoogleCloudApigeeV1CustomReport]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+parent}/reports",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1CustomReport})

(defn organizations-reports-list
  "Return a list of Custom Reports
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/reports/list

parent <> 

optional:
expand <boolean> Set to 'true' to get expanded details about each custom report."
  ([parent] (organizations-reports-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/reports",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-reports-update
  "Update an existing custom report definition
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/reports/update

name <> 
GoogleCloudApigeeV1CustomReport:
GoogleCloudApigeeV1CustomReport"
  [name GoogleCloudApigeeV1CustomReport]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1CustomReport})

(defn organizations-reports-delete
  "Deletes an existing custom report definition
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/reports/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-sharedflows-create
  "Uploads a ZIP-formatted shared flow configuration bundle to an organization. If the shared flow already exists, this creates a new revision of it. If the shared flow does not exist, this creates it. Once imported, the shared flow revision must be deployed before it can be accessed at runtime. The size limit of a shared flow bundle is 15 MB.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sharedflows/create

parent <> 
GoogleApiHttpBody:
GoogleApiHttpBody

optional:
action <string> Required. Must be set to either `import` or `validate`.
name <string> Required. The name to give the shared flow"
  ([parent GoogleApiHttpBody]
    (organizations-sharedflows-create parent GoogleApiHttpBody nil))
  ([parent GoogleApiHttpBody optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/sharedflows",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleApiHttpBody}))

(defn organizations-sharedflows-delete
  "Deletes a shared flow and all it's revisions. The shared flow must be undeployed before you can delete it.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sharedflows/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-sharedflows-list
  "Lists all shared flows in the organization.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sharedflows/list

parent <> 

optional:
includeMetaData <boolean> Indicates whether to include shared flow metadata in the response.
includeRevisions <boolean> Indicates whether to include a list of revisions in the response."
  ([parent] (organizations-sharedflows-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/sharedflows",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-sharedflows-get
  "Gets a shared flow by name, including a list of its revisions.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sharedflows/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-sharedflows-deployments-list
  "Lists all deployments of a shared flow.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sharedflows/deployments/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/deployments",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-sharedflows-revisions-updateSharedFlowRevision
  "Updates a shared flow revision. This operation is only allowed on revisions which have never been deployed. After deployment a revision becomes immutable, even if it becomes undeployed. The payload is a ZIP-formatted shared flow. Content type must be either multipart/form-data or application/octet-stream.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sharedflows/revisions/updateSharedFlowRevision

name <> 
GoogleApiHttpBody:
GoogleApiHttpBody

optional:
validate <boolean> Ignored. All uploads are validated regardless of the value of this field. It is kept for compatibility with existing APIs. Must be `true` or `false` if provided."
  ([name GoogleApiHttpBody]
    (organizations-sharedflows-revisions-updateSharedFlowRevision
      name
      GoogleApiHttpBody
      nil))
  ([name GoogleApiHttpBody optional]
    {:method :post,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleApiHttpBody}))

(defn organizations-sharedflows-revisions-get
  "Gets a revision of a shared flow. To download the shared flow configuration bundle for the specified revision as a zip file, set the `format` query parameter to `bundle`. If you are using curl, specify `-o filename.zip` to save the output to a file; otherwise, it displays to `stdout`. Then, develop the shared flow configuration locally and upload the updated sharedFlow configuration revision, as described in [updateSharedFlowRevision](updateSharedFlowRevision).
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sharedflows/revisions/get

name <> 

optional:
format <string> Specify `bundle` to export the contents of the shared flow bundle. Otherwise, the bundle metadata is returned."
  ([name] (organizations-sharedflows-revisions-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-sharedflows-revisions-delete
  "Deletes a shared flow and all associated policies, resources, and revisions. You must undeploy the shared flow before deleting it.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sharedflows/revisions/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-sharedflows-revisions-deployments-list
  "Lists all deployments of a shared flow revision.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/sharedflows/revisions/deployments/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/deployments",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-apiproducts-create
  "Creates an API product in an organization. You create API products after you have proxied backend services using API proxies. An API product is a collection of API resources combined with quota settings and metadata that you can use to deliver customized and productized API bundles to your developer community. This metadata can include: - Scope - Environments - API proxies - Extensible profile API products enable you repackage APIs on the fly, without having to do any additional coding or configuration. Apigee recommends that you start with a simple API product including only required elements. You then provision credentials to apps to enable them to start testing your APIs. After you have authentication and authorization working against a simple API product, you can iterate to create finer-grained API products, defining different sets of API resources for each API product. **WARNING:** - If you don't specify an API proxy in the request body, *any* app associated with the product can make calls to *any* API in your entire organization. - If you don't specify an environment in the request body, the product allows access to all environments. For more information, see What is an API product?
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/create

parent <> 
GoogleCloudApigeeV1ApiProduct:
GoogleCloudApigeeV1ApiProduct"
  [parent GoogleCloudApigeeV1ApiProduct]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/apiproducts",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1ApiProduct})

(defn organizations-apiproducts-delete
  "Deletes an API product from an organization. Deleting an API product causes app requests to the resource URIs defined in the API product to fail. Ensure that you create a new API product to serve existing apps, unless your intention is to disable access to the resources defined in the API product. The API product name required in the request URL is the internal name of the product, not the display name. While they may be the same, it depends on whether the API product was created via the UI or the API. View the list of API products to verify the internal name.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-apiproducts-update
  "Updates an existing API product. You must include all required values, whether or not you are updating them, as well as any optional values that you are updating. The API product name required in the request URL is the internal name of the product, not the display name. While they may be the same, it depends on whether the API product was created via UI or API. View the list of API products to identify their internal names.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/update

name <> 
GoogleCloudApigeeV1ApiProduct:
GoogleCloudApigeeV1ApiProduct"
  [name GoogleCloudApigeeV1ApiProduct]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1ApiProduct})

(defn organizations-apiproducts-list
  "Lists all API product names for an organization. Filter the list by passing an `attributename` and `attibutevalue`. The maximum number of API products returned is 1000. You can paginate the list of API products returned using the `startKey` and `count` query parameters.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/list

parent <> 

optional:
attributevalue <string> Value of the attribute used to filter the search.
expand <boolean> Flag that specifies whether to expand the results. Set to `true` to get expanded details about each API.
count <string> Enter the number of API products you want returned in the API call. The limit is 1000.
attributename <string> Name of the attribute used to filter the search.
startKey <string> Gets a list of API products starting with a specific API product in the list. For example, if you're returning 50 API products at a time (using the `count` query parameter), you can view products 50-99 by entering the name of the 50th API product in the first API (without using `startKey`). Product name is case sensitive."
  ([parent] (organizations-apiproducts-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/apiproducts",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-apiproducts-attributes
  "Updates or creates API product attributes. This API **replaces** the current list of attributes with the attributes specified in the request body. In this way, you can update existing attributes, add new attributes, or delete existing attributes by omitting them from the request body. **Note**: OAuth access tokens and Key Management Service (KMS) entities (apps, developers, and API products) are cached for 180 seconds (current default). Any custom attributes associated with entities also get cached for at least 180 seconds after entity is accessed during runtime. In this case, the `ExpiresIn` element on the OAuthV2 policy won't be able to expire an access token in less than 180 seconds.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/attributes

name <> 
GoogleCloudApigeeV1Attributes:
GoogleCloudApigeeV1Attributes"
  [name GoogleCloudApigeeV1Attributes]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+name}/attributes",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Attributes})

(defn organizations-apiproducts-get
  "Gets configuration details for an API product. The API product name required in the request URL is the internal name of the product, not the display name. While they may be the same, it depends on whether the API product was created via the UI or the API. View the list of API products to verify the internal name.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-apiproducts-rateplans-delete
  "Deletes a rate plan.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/rateplans/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-apiproducts-rateplans-update
  "Updates an existing rate plan.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/rateplans/update

name <> 
GoogleCloudApigeeV1RatePlan:
GoogleCloudApigeeV1RatePlan"
  [name GoogleCloudApigeeV1RatePlan]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1RatePlan})

(defn organizations-apiproducts-rateplans-create
  "Create a rate plan that is associated with an API product in an organization. Using rate plans, API product owners can monetize their API products by configuring one or more of the following: - Billing frequency - Initial setup fees for using an API product - Payment funding model (postpaid only) - Fixed recurring or consumption-based charges for using an API product - Revenue sharing with developer partners An API product can have multiple rate plans associated with it but *only one* rate plan can be active at any point of time. **Note: From the developer's perspective, they purchase API products not rate plans.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/rateplans/create

parent <> 
GoogleCloudApigeeV1RatePlan:
GoogleCloudApigeeV1RatePlan"
  [parent GoogleCloudApigeeV1RatePlan]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/rateplans",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1RatePlan})

(defn organizations-apiproducts-rateplans-get
  "Gets the details of a rate plan.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/rateplans/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-apiproducts-rateplans-list
  "Lists all the rate plans for an API product.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/rateplans/list

parent <> 

optional:
expand <boolean> Flag that specifies whether to expand the results. Set to `true` to get expanded details about each API. Defaults to `false`.
state <string> State of the rate plans (`DRAFT`, `PUBLISHED`) that you want to display.
orderBy <string> Name of the attribute used for sorting. Valid values include: * `name`: Name of the rate plan. * `state`: State of the rate plan (`DRAFT`, `PUBLISHED`). * `startTime`: Time when the rate plan becomes active. * `endTime`: Time when the rate plan expires. **Note**: Not supported by Apigee at this time.
count <integer> Number of rate plans to return in the API call. Use with the `startKey` parameter to provide more targeted filtering. The maximum limit is 1000. Defaults to 100.
startKey <string> Name of the rate plan from which to start displaying the list of rate plans. If omitted, the list starts from the first item. For example, to view the rate plans from 51-150, set the value of `startKey` to the name of the 51st rate plan and set the value of `count` to 100."
  ([parent] (organizations-apiproducts-rateplans-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/rateplans",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-apiproducts-attributes-list
  "Lists all API product attributes.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/attributes/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/attributes",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-apiproducts-attributes-updateApiProductAttribute
  "Updates the value of an API product attribute. **Note**: OAuth access tokens and Key Management Service (KMS) entities (apps, developers, and API products) are cached for 180 seconds (current default). Any custom attributes associated with entities also get cached for at least 180 seconds after entity is accessed during runtime. In this case, the `ExpiresIn` element on the OAuthV2 policy won't be able to expire an access token in less than 180 seconds.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/attributes/updateApiProductAttribute

name <> 
GoogleCloudApigeeV1Attribute:
GoogleCloudApigeeV1Attribute"
  [name GoogleCloudApigeeV1Attribute]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Attribute})

(defn organizations-apiproducts-attributes-get
  "Gets the value of an API product attribute.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/attributes/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-apiproducts-attributes-delete
  "Deletes an API product attribute.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apiproducts/attributes/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-keyvaluemaps-delete
  "Deletes a key value map from an organization.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/keyvaluemaps/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-keyvaluemaps-create
  "Creates a key value map in an organization.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/keyvaluemaps/create

parent <> 
GoogleCloudApigeeV1KeyValueMap:
GoogleCloudApigeeV1KeyValueMap"
  [parent GoogleCloudApigeeV1KeyValueMap]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/keyvaluemaps",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1KeyValueMap})

(defn organizations-keyvaluemaps-entries-update
  "Update key value entry scoped to an organization, environment, or API proxy for an existing key.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/keyvaluemaps/entries/update

name <> 
GoogleCloudApigeeV1KeyValueEntry:
GoogleCloudApigeeV1KeyValueEntry"
  [name GoogleCloudApigeeV1KeyValueEntry]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1KeyValueEntry})

(defn organizations-keyvaluemaps-entries-list
  "Lists key value entries for key values maps scoped to an organization, environment, or API proxy. **Note**: Supported for Apigee hybrid 1.8.x and higher.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/keyvaluemaps/entries/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of key value entries to return. If unspecified, at most 100 entries will be returned."
  ([parent] (organizations-keyvaluemaps-entries-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/entries",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-keyvaluemaps-entries-create
  "Creates key value entries in a key value map scoped to an organization, environment, or API proxy. **Note**: Supported for Apigee hybrid 1.8.x and higher.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/keyvaluemaps/entries/create

parent <> 
GoogleCloudApigeeV1KeyValueEntry:
GoogleCloudApigeeV1KeyValueEntry"
  [parent GoogleCloudApigeeV1KeyValueEntry]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+parent}/entries",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1KeyValueEntry})

(defn organizations-keyvaluemaps-entries-delete
  "Deletes a key value entry from a key value map scoped to an organization, environment, or API proxy. **Notes:** * After you delete the key value entry, the policy consuming the entry will continue to function with its cached values for a few minutes. This is expected behavior. * Supported for Apigee hybrid 1.8.x and higher.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/keyvaluemaps/entries/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-keyvaluemaps-entries-get
  "Get the key value entry value for a key value map scoped to an organization, environment, or API proxy. **Note**: Supported for Apigee hybrid 1.8.x and higher.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/keyvaluemaps/entries/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-datacollectors-list
  "Lists all data collectors.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/datacollectors/list

parent <> 

optional:
pageSize <integer> Maximum number of data collectors to return. The page size defaults to 25."
  ([parent] (organizations-datacollectors-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/datacollectors",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-datacollectors-get
  "Gets a data collector.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/datacollectors/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-datacollectors-delete
  "Deletes a data collector.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/datacollectors/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-datacollectors-create
  "Creates a new data collector.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/datacollectors/create

parent <> 
GoogleCloudApigeeV1DataCollector:
GoogleCloudApigeeV1DataCollector

optional:
dataCollectorId <string> ID of the data collector. Overrides any ID in the data collector resource. Must be a string beginning with `dc_` that contains only letters, numbers, and underscores."
  ([parent GoogleCloudApigeeV1DataCollector]
    (organizations-datacollectors-create
      parent
      GoogleCloudApigeeV1DataCollector
      nil))
  ([parent GoogleCloudApigeeV1DataCollector optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/datacollectors",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1DataCollector}))

(defn organizations-datacollectors-patch
  "Updates a data collector.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/datacollectors/patch

name <> 
GoogleCloudApigeeV1DataCollector:
GoogleCloudApigeeV1DataCollector

optional:
updateMask <string> List of fields to be updated."
  ([name GoogleCloudApigeeV1DataCollector]
    (organizations-datacollectors-patch
      name
      GoogleCloudApigeeV1DataCollector
      nil))
  ([name GoogleCloudApigeeV1DataCollector optional]
    {:method :patch,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1DataCollector}))

(defn organizations-securityAssessmentResults-batchCompute
  "Compute RAV2 security scores for a set of resources.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/securityAssessmentResults/batchCompute

name <> 
GoogleCloudApigeeV1BatchComputeSecurityAssessmentResultsRequest:
GoogleCloudApigeeV1BatchComputeSecurityAssessmentResultsRequest"
  [name
   GoogleCloudApigeeV1BatchComputeSecurityAssessmentResultsRequest]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+name}:batchCompute",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body
   GoogleCloudApigeeV1BatchComputeSecurityAssessmentResultsRequest})

(defn organizations-environments-setIamPolicy
  "Sets the IAM policy on an environment, if the policy already exists it will be replaced. For more information, see [Manage users, roles, and permissions using the API](https://cloud.google.com/apigee/docs/api-platform/system-administration/manage-users-roles). You must have the `apigee.environments.setIamPolicy` permission to call this API.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1SetIamPolicyRequest})

(defn organizations-environments-delete
  "Deletes an environment from an organization. **Warning: You must delete all key value maps and key value entries before you delete an environment.** Otherwise, if you re-create the environment the key value map entry operations will encounter encryption/decryption discrepancies.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-updateSecurityActionsConfig
  "UpdateSecurityActionConfig updates the current SecurityActions configuration. This method is used to enable/disable the feature at the environment level.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/updateSecurityActionsConfig

name <> 
GoogleCloudApigeeV1SecurityActionsConfig:
GoogleCloudApigeeV1SecurityActionsConfig

optional:
updateMask <string> The list of fields to update."
  ([name GoogleCloudApigeeV1SecurityActionsConfig]
    (organizations-environments-updateSecurityActionsConfig
      name
      GoogleCloudApigeeV1SecurityActionsConfig
      nil))
  ([name GoogleCloudApigeeV1SecurityActionsConfig optional]
    {:method :patch,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1SecurityActionsConfig}))

(defn organizations-environments-modifyEnvironment
  "Updates properties for an Apigee environment with patch semantics using a field mask. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/modifyEnvironment

name <> 
GoogleCloudApigeeV1Environment:
GoogleCloudApigeeV1Environment

optional:
updateMask <string> List of fields to be updated. Fields that can be updated: node_config."
  ([name GoogleCloudApigeeV1Environment]
    (organizations-environments-modifyEnvironment
      name
      GoogleCloudApigeeV1Environment
      nil))
  ([name GoogleCloudApigeeV1Environment optional]
    {:method :patch,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1Environment}))

(defn organizations-environments-getDeployedConfig
  "Gets the deployed configuration for an environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/getDeployedConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-getTraceConfig
  "Get distributed trace configuration in an environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/getTraceConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-updateDebugmask
  "Updates the debug mask singleton resource for an environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/updateDebugmask

name <> 
GoogleCloudApigeeV1DebugMask:
GoogleCloudApigeeV1DebugMask

optional:
replaceRepeatedFields <boolean> Boolean flag that specifies whether to replace existing values in the debug mask when doing an update. Set to true to replace existing values. The default behavior is to append the values (false).
updateMask <string> Field debug mask to support partial updates."
  ([name GoogleCloudApigeeV1DebugMask]
    (organizations-environments-updateDebugmask
      name
      GoogleCloudApigeeV1DebugMask
      nil))
  ([name GoogleCloudApigeeV1DebugMask optional]
    {:method :patch,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1DebugMask}))

(defn organizations-environments-update
  "Updates an existing environment. When updating properties, you must pass all existing properties to the API, even if they are not being changed. If you omit properties from the payload, the properties are removed. To get the current list of properties for the environment, use the [Get Environment API](get). **Note**: Both `PUT` and `POST` methods are supported for updating an existing environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/update

name <> 
GoogleCloudApigeeV1Environment:
GoogleCloudApigeeV1Environment"
  [name GoogleCloudApigeeV1Environment]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Environment})

(defn organizations-environments-getApiSecurityRuntimeConfig
  "Gets the API Security runtime configuration for an environment. This named ApiSecurityRuntimeConfig to prevent conflicts with ApiSecurityConfig from addon config.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/getApiSecurityRuntimeConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-getAddonsConfig
  "Gets the add-ons config of an environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/getAddonsConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-getSecurityActionsConfig
  "GetSecurityActionConfig returns the current SecurityActions configuration.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/getSecurityActionsConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-getIamPolicy
  "Gets the IAM policy on an environment. For more information, see [Manage users, roles, and permissions using the API](https://cloud.google.com/apigee/docs/api-platform/system-administration/manage-users-roles). You must have the `apigee.environments.getIamPolicy` permission to call this API.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (organizations-environments-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-getDebugmask
  "Gets the debug mask singleton resource for an environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/getDebugmask

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-updateTraceConfig
  "Updates the trace configurations in an environment. Note that the repeated fields have replace semantics when included in the field mask and that they will be overwritten by the value of the fields in the request body.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/updateTraceConfig

name <> 
GoogleCloudApigeeV1TraceConfig:
GoogleCloudApigeeV1TraceConfig

optional:
updateMask <string> List of fields to be updated."
  ([name GoogleCloudApigeeV1TraceConfig]
    (organizations-environments-updateTraceConfig
      name
      GoogleCloudApigeeV1TraceConfig
      nil))
  ([name GoogleCloudApigeeV1TraceConfig optional]
    {:method :patch,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1TraceConfig}))

(defn organizations-environments-create
  "Creates an environment in an organization.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/create

parent <> 
GoogleCloudApigeeV1Environment:
GoogleCloudApigeeV1Environment

optional:
name <string> Optional. Name of the environment."
  ([parent GoogleCloudApigeeV1Environment]
    (organizations-environments-create
      parent
      GoogleCloudApigeeV1Environment
      nil))
  ([parent GoogleCloudApigeeV1Environment optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/environments",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1Environment}))

(defn organizations-environments-subscribe
  "Creates a subscription for the environment's Pub/Sub topic. The server will assign a random name for this subscription. The \"name\" and \"push_config\" must *not* be specified.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/subscribe

parent <> "
  [parent]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}:subscribe",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-get
  "Gets environment details.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-updateEnvironment
  "Updates an existing environment. When updating properties, you must pass all existing properties to the API, even if they are not being changed. If you omit properties from the payload, the properties are removed. To get the current list of properties for the environment, use the [Get Environment API](get). **Note**: Both `PUT` and `POST` methods are supported for updating an existing environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/updateEnvironment

name <> 
GoogleCloudApigeeV1Environment:
GoogleCloudApigeeV1Environment"
  [name GoogleCloudApigeeV1Environment]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Environment})

(defn organizations-environments-testIamPermissions
  "Tests the permissions of a user on an environment, and returns a subset of permissions that the user has on the environment. If the environment does not exist, an empty permission set is returned (a NOT_FOUND error is not returned).
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1TestIamPermissionsRequest})

(defn organizations-environments-unsubscribe
  "Deletes a subscription for the environment's Pub/Sub topic.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/unsubscribe

parent <> 
GoogleCloudApigeeV1Subscription:
GoogleCloudApigeeV1Subscription"
  [parent GoogleCloudApigeeV1Subscription]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}:unsubscribe",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Subscription})

(defn organizations-environments-queries-create
  "Submit a query to be processed in the background. If the submission of the query succeeds, the API returns a 201 status and an ID that refer to the query. In addition to the HTTP status 201, the `state` of \"enqueued\" means that the request succeeded.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/queries/create

parent <> 
GoogleCloudApigeeV1Query:
GoogleCloudApigeeV1Query"
  [parent GoogleCloudApigeeV1Query]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+parent}/queries",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Query})

(defn organizations-environments-queries-get
  "Get query status If the query is still in progress, the `state` is set to \"running\" After the query has completed successfully, `state` is set to \"completed\"
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/queries/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-queries-getResulturl
  "After the query is completed, use this API to retrieve the results. If the request succeeds, and there is a non-zero result set, the result is sent to the client as a list of urls to JSON files.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/queries/getResulturl

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-queries-list
  "Return a list of Asynchronous Queries
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/queries/list

parent <> 

optional:
inclQueriesWithoutReport <string> Flag to include asynchronous queries that don't have a report denifition.
to <string> Filter response list by returning asynchronous queries that created before this date time. Time must be in ISO date-time format like '2011-12-03T10:16:30Z'.
from <string> Filter response list by returning asynchronous queries that created after this date time. Time must be in ISO date-time format like '2011-12-03T10:15:30Z'.
dataset <string> Filter response list by dataset. Example: `api`, `mint`
submittedBy <string> Filter response list by user who submitted queries.
status <string> Filter response list by asynchronous query status."
  ([parent] (organizations-environments-queries-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/queries",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-queries-getResult
  "After the query is completed, use this API to retrieve the results. If the request succeeds, and there is a non-zero result set, the result is downloaded to the client as a zipped JSON file. The name of the downloaded file will be: OfflineQueryResult-.zip Example: `OfflineQueryResult-9cfc0d85-0f30-46d6-ae6f-318d0cb961bd.zip`
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/queries/getResult

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-traceConfig-overrides-patch
  "Updates a distributed trace configuration override. Note that the repeated fields have replace semantics when included in the field mask and that they will be overwritten by the value of the fields in the request body.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/traceConfig/overrides/patch

name <> 
GoogleCloudApigeeV1TraceConfigOverride:
GoogleCloudApigeeV1TraceConfigOverride

optional:
updateMask <string> List of fields to be updated."
  ([name GoogleCloudApigeeV1TraceConfigOverride]
    (organizations-environments-traceConfig-overrides-patch
      name
      GoogleCloudApigeeV1TraceConfigOverride
      nil))
  ([name GoogleCloudApigeeV1TraceConfigOverride optional]
    {:method :patch,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1TraceConfigOverride}))

(defn organizations-environments-traceConfig-overrides-create
  "Creates a trace configuration override. The response contains a system-generated UUID, that can be used to view, update, or delete the configuration override. Use the List API to view the existing trace configuration overrides.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/traceConfig/overrides/create

parent <> 
GoogleCloudApigeeV1TraceConfigOverride:
GoogleCloudApigeeV1TraceConfigOverride"
  [parent GoogleCloudApigeeV1TraceConfigOverride]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/overrides",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1TraceConfigOverride})

(defn organizations-environments-traceConfig-overrides-list
  "Lists all of the distributed trace configuration overrides in an environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/traceConfig/overrides/list

parent <> 

optional:
pageSize <integer> Maximum number of trace configuration overrides to return. If not specified, the maximum number returned is 25. The maximum number cannot exceed 100."
  ([parent]
    (organizations-environments-traceConfig-overrides-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/overrides",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-traceConfig-overrides-delete
  "Deletes a distributed trace configuration override.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/traceConfig/overrides/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-traceConfig-overrides-get
  "Gets a trace configuration override.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/traceConfig/overrides/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-securityIncidents-list
  "ListSecurityIncidents lists all the security incident associated with the environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityIncidents/list

parent <> 

optional:
filter <string> The filter expression to be used to get the list of security incidents, where filtering can be done on API Proxies. Example: filter = \"api_proxy = /\", \"first_detected_time >\", \"last_detected_time <\"
pageSize <integer> Optional. The maximum number of incidents to return. The service may return fewer than this value. If unspecified, at most 50 incidents will be returned."
  ([parent]
    (organizations-environments-securityIncidents-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/securityIncidents",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-securityIncidents-patch
  "UpdateSecurityIncidents updates an existing security incident.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityIncidents/patch

name <> 
GoogleCloudApigeeV1SecurityIncident:
GoogleCloudApigeeV1SecurityIncident

optional:
updateMask <string> Required. The list of fields to update. Allowed fields are: LINT.IfChange(allowed_update_fields_comment) - observability LINT.ThenChange()"
  ([name GoogleCloudApigeeV1SecurityIncident]
    (organizations-environments-securityIncidents-patch
      name
      GoogleCloudApigeeV1SecurityIncident
      nil))
  ([name GoogleCloudApigeeV1SecurityIncident optional]
    {:method :patch,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1SecurityIncident}))

(defn organizations-environments-securityIncidents-get
  "GetSecurityIncident gets the specified security incident. Returns NOT_FOUND if security incident is not present for the specified organization and environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityIncidents/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-securityIncidents-batchUpdate
  "BatchUpdateSecurityIncident updates multiple existing security incidents.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityIncidents/batchUpdate

parent <> 
GoogleCloudApigeeV1BatchUpdateSecurityIncidentsRequest:
GoogleCloudApigeeV1BatchUpdateSecurityIncidentsRequest"
  [parent GoogleCloudApigeeV1BatchUpdateSecurityIncidentsRequest]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/securityIncidents:batchUpdate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1BatchUpdateSecurityIncidentsRequest})

(defn organizations-environments-archiveDeployments-patch
  "Updates an existing ArchiveDeployment. Labels can modified but most of the other fields are not modifiable.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/archiveDeployments/patch

name <> 
GoogleCloudApigeeV1ArchiveDeployment:
GoogleCloudApigeeV1ArchiveDeployment

optional:
updateMask <string> Required. The list of fields to be updated."
  ([name GoogleCloudApigeeV1ArchiveDeployment]
    (organizations-environments-archiveDeployments-patch
      name
      GoogleCloudApigeeV1ArchiveDeployment
      nil))
  ([name GoogleCloudApigeeV1ArchiveDeployment optional]
    {:method :patch,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1ArchiveDeployment}))

(defn organizations-environments-archiveDeployments-generateDownloadUrl
  "Generates a signed URL for downloading the original zip file used to create an Archive Deployment. The URL is only valid for a limited period and should be used within minutes after generation. Each call returns a new upload URL.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/archiveDeployments/generateDownloadUrl

name <> 
GoogleCloudApigeeV1GenerateDownloadUrlRequest:
GoogleCloudApigeeV1GenerateDownloadUrlRequest"
  [name GoogleCloudApigeeV1GenerateDownloadUrlRequest]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+name}:generateDownloadUrl",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1GenerateDownloadUrlRequest})

(defn organizations-environments-archiveDeployments-list
  "Lists the ArchiveDeployments in the specified Environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/archiveDeployments/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of Archive Deployments to return. If unspecified, at most 25 deployments will be returned.
filter <string> Optional. An optional query used to return a subset of Archive Deployments using the semantics defined in https://google.aip.dev/160."
  ([parent]
    (organizations-environments-archiveDeployments-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/archiveDeployments",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-archiveDeployments-get
  "Gets the specified ArchiveDeployment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/archiveDeployments/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-archiveDeployments-delete
  "Deletes an archive deployment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/archiveDeployments/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-archiveDeployments-generateUploadUrl
  "Generates a signed URL for uploading an Archive zip file to Google Cloud Storage. Once the upload is complete, the signed URL should be passed to CreateArchiveDeployment. When uploading to the generated signed URL, please follow these restrictions: * Source file type should be a zip file. * Source file size should not exceed 1GB limit. * No credentials should be attached - the signed URLs provide access to the target bucket using internal service identity; if credentials were attached, the identity from the credentials would be used, but that identity does not have permissions to upload files to the URL. When making a HTTP PUT request, these two headers need to be specified: * `content-type: application/zip` * `x-goog-content-length-range: 0,1073741824` And this header SHOULD NOT be specified: * `Authorization: Bearer YOUR_TOKEN`
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/archiveDeployments/generateUploadUrl

parent <> 
GoogleCloudApigeeV1GenerateUploadUrlRequest:
GoogleCloudApigeeV1GenerateUploadUrlRequest"
  [parent GoogleCloudApigeeV1GenerateUploadUrlRequest]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/archiveDeployments:generateUploadUrl",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1GenerateUploadUrlRequest})

(defn organizations-environments-archiveDeployments-create
  "Creates a new ArchiveDeployment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/archiveDeployments/create

parent <> 
GoogleCloudApigeeV1ArchiveDeployment:
GoogleCloudApigeeV1ArchiveDeployment"
  [parent GoogleCloudApigeeV1ArchiveDeployment]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/archiveDeployments",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1ArchiveDeployment})

(defn organizations-environments-references-get
  "Gets a Reference resource.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/references/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-references-create
  "Creates a Reference in the specified environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/references/create

parent <> 
GoogleCloudApigeeV1Reference:
GoogleCloudApigeeV1Reference"
  [parent GoogleCloudApigeeV1Reference]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/references",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Reference})

(defn organizations-environments-references-delete
  "Deletes a Reference from an environment. Returns the deleted Reference resource.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/references/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-references-update
  "Updates an existing Reference. Note that this operation has PUT semantics; it will replace the entirety of the existing Reference with the resource in the request body.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/references/update

name <> 
GoogleCloudApigeeV1Reference:
GoogleCloudApigeeV1Reference"
  [name GoogleCloudApigeeV1Reference]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Reference})

(defn organizations-environments-optimizedStats-get
  "Similar to GetStats except that the response is less verbose.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/optimizedStats/get

name <> 

optional:
topk <string> Top number of results to return. For example, to return the top 5 results, set `topk=5`.
timeUnit <string> Granularity of metrics returned. Valid values include: `second`, `minute`, `hour`, `day`, `week`, or `month`.
realtime <boolean> No longer used by Apigee. Supported for backwards compatibility.
offset <string> Offset value. Use `offset` with `limit` to enable pagination of results. For example, to display results 11-20, set limit to `10` and offset to `10`.
tsAscending <boolean> Flag that specifies whether to list timestamps in ascending (`true`) or descending (`false`) order. Apigee recommends setting this value to `true` if you are using `sortby` with `sort=DESC`.
sortby <string> Comma-separated list of columns to sort the final result.
sort <string> Flag that specifies whether the sort order should be ascending or descending. Valid values include `DESC` and `ASC`.
limit <string> Maximum number of result items to return. The default and maximum value that can be returned is 14400.
timeRange <string> Required. Time interval for the interactive query. Time range is specified in GMT as `start~end`. For example: `04/15/2017 00:00~05/15/2017 23:59`
select <string> Required. Comma-separated list of metrics. For example: `sum(message_count),sum(error_count)`
aggTable <string> Table name used to query custom aggregate tables. If this parameter is skipped, then Apigee will try to retrieve the data from fact tables which will be expensive.
filter <string> Filter that enables you to drill-down on specific dimension values.
sonar <boolean> Routes the query to API Monitoring for the last hour.
accuracy <string> No longer used by Apigee. Supported for backwards compatibility.
tzo <string> Timezone offset value."
  ([name] (organizations-environments-optimizedStats-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-sharedflows-deployments-list
  "Lists all deployments of a shared flow in an environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/sharedflows/deployments/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/deployments",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-sharedflows-revisions-getDeployments
  "Gets the deployment of a shared flow revision and actual state reported by runtime pods.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/sharedflows/revisions/getDeployments

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+name}/deployments",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-sharedflows-revisions-deploy
  "Deploys a revision of a shared flow. If another revision of the same shared flow is currently deployed, set the `override` parameter to `true` to have this revision replace the currently deployed revision. You cannot use a shared flow until it has been deployed to an environment. For a request path `organizations/{org}/environments/{env}/sharedflows/{sf}/revisions/{rev}/deployments`, two permissions are required: * `apigee.deployments.create` on the resource `organizations/{org}/environments/{env}` * `apigee.sharedflowrevisions.deploy` on the resource `organizations/{org}/sharedflows/{sf}/revisions/{rev}`
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/sharedflows/revisions/deploy

name <> 

optional:
override <boolean> Flag that specifies whether the new deployment replaces other deployed revisions of the shared flow in the environment. Set `override` to `true` to replace other deployed revisions. By default, `override` is `false` and the deployment is rejected if other revisions of the shared flow are deployed in the environment.
serviceAccount <string> Google Cloud IAM service account. The service account represents the identity of the deployed proxy, and determines what permissions it has. The format must be `{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`."
  ([name]
    (organizations-environments-sharedflows-revisions-deploy name nil))
  ([name optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+name}/deployments",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-sharedflows-revisions-undeploy
  "Undeploys a shared flow revision from an environment. For a request path `organizations/{org}/environments/{env}/sharedflows/{sf}/revisions/{rev}/deployments`, two permissions are required: * `apigee.deployments.delete` on the resource `organizations/{org}/environments/{env}` * `apigee.sharedflowrevisions.undeploy` on the resource `organizations/{org}/sharedflows/{sf}/revisions/{rev}`
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/sharedflows/revisions/undeploy

name <> "
  [name]
  {:method :delete,
   :uri-template
   "https://apigee.googleapis.com/v1/{+name}/deployments",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-keyvaluemaps-delete
  "Deletes a key value map from an environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keyvaluemaps/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-keyvaluemaps-create
  "Creates a key value map in an environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keyvaluemaps/create

parent <> 
GoogleCloudApigeeV1KeyValueMap:
GoogleCloudApigeeV1KeyValueMap"
  [parent GoogleCloudApigeeV1KeyValueMap]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/keyvaluemaps",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1KeyValueMap})

(defn organizations-environments-keyvaluemaps-entries-create
  "Creates key value entries in a key value map scoped to an organization, environment, or API proxy. **Note**: Supported for Apigee hybrid 1.8.x and higher.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keyvaluemaps/entries/create

parent <> 
GoogleCloudApigeeV1KeyValueEntry:
GoogleCloudApigeeV1KeyValueEntry"
  [parent GoogleCloudApigeeV1KeyValueEntry]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+parent}/entries",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1KeyValueEntry})

(defn organizations-environments-keyvaluemaps-entries-list
  "Lists key value entries for key values maps scoped to an organization, environment, or API proxy. **Note**: Supported for Apigee hybrid 1.8.x and higher.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keyvaluemaps/entries/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of key value entries to return. If unspecified, at most 100 entries will be returned."
  ([parent]
    (organizations-environments-keyvaluemaps-entries-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/entries",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-keyvaluemaps-entries-get
  "Get the key value entry value for a key value map scoped to an organization, environment, or API proxy. **Note**: Supported for Apigee hybrid 1.8.x and higher.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keyvaluemaps/entries/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-keyvaluemaps-entries-delete
  "Deletes a key value entry from a key value map scoped to an organization, environment, or API proxy. **Notes:** * After you delete the key value entry, the policy consuming the entry will continue to function with its cached values for a few minutes. This is expected behavior. * Supported for Apigee hybrid 1.8.x and higher.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keyvaluemaps/entries/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-keyvaluemaps-entries-update
  "Update key value entry scoped to an organization, environment, or API proxy for an existing key.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keyvaluemaps/entries/update

name <> 
GoogleCloudApigeeV1KeyValueEntry:
GoogleCloudApigeeV1KeyValueEntry"
  [name GoogleCloudApigeeV1KeyValueEntry]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1KeyValueEntry})

(defn organizations-environments-caches-delete
  "Deletes a cache.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/caches/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-securityActions-enable
  "Enable a SecurityAction. The `state` of the SecurityAction after enabling is `ENABLED`. `EnableSecurityAction` can be called on SecurityActions in the state `DISABLED`; SecurityActions in a different state (including `ENABLED) return an error.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityActions/enable

name <> 
GoogleCloudApigeeV1EnableSecurityActionRequest:
GoogleCloudApigeeV1EnableSecurityActionRequest"
  [name GoogleCloudApigeeV1EnableSecurityActionRequest]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+name}:enable",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1EnableSecurityActionRequest})

(defn organizations-environments-securityActions-disable
  "Disable a SecurityAction. The `state` of the SecurityAction after disabling is `DISABLED`. `DisableSecurityAction` can be called on SecurityActions in the state `ENABLED`; SecurityActions in a different state (including `DISABLED`) return an error.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityActions/disable

name <> 
GoogleCloudApigeeV1DisableSecurityActionRequest:
GoogleCloudApigeeV1DisableSecurityActionRequest"
  [name GoogleCloudApigeeV1DisableSecurityActionRequest]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+name}:disable",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1DisableSecurityActionRequest})

(defn organizations-environments-securityActions-get
  "Get a SecurityAction by name.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityActions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-securityActions-list
  "Returns a list of SecurityActions. This returns both enabled and disabled actions.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityActions/list

parent <> 

optional:
pageSize <integer> The maximum number of SecurityActions to return. If unspecified, at most 50 SecurityActions will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> The filter expression to filter List results. https://google.aip.dev/160. Allows for filtering over: state and api_proxies. E.g.: state = ACTIVE AND apiProxies:foo. Filtering by action is not supported https://github.com/aip-dev/google.aip.dev/issues/624"
  ([parent]
    (organizations-environments-securityActions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/securityActions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-securityActions-create
  "CreateSecurityAction creates a SecurityAction.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityActions/create

parent <> 
GoogleCloudApigeeV1SecurityAction:
GoogleCloudApigeeV1SecurityAction

optional:
securityActionId <string> Required. The ID to use for the SecurityAction, which will become the final component of the action's resource name. This value should be 0-61 characters, and valid format is (^[a-z]([a-z0-9-]{​0,61}[a-z0-9])?$)."
  ([parent GoogleCloudApigeeV1SecurityAction]
    (organizations-environments-securityActions-create
      parent
      GoogleCloudApigeeV1SecurityAction
      nil))
  ([parent GoogleCloudApigeeV1SecurityAction optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/securityActions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1SecurityAction}))

(defn organizations-environments-addonsConfig-setAddonEnablement
  "Updates an add-on enablement status of an environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/addonsConfig/setAddonEnablement

name <> 
GoogleCloudApigeeV1SetAddonEnablementRequest:
GoogleCloudApigeeV1SetAddonEnablementRequest"
  [name GoogleCloudApigeeV1SetAddonEnablementRequest]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+name}:setAddonEnablement",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1SetAddonEnablementRequest})

(defn organizations-environments-resourcefiles-delete
  "Deletes a resource file. For more information about resource files, see [Resource files](https://cloud.google.com/apigee/docs/api-platform/develop/resource-files).
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/resourcefiles/delete

parent <> 
type <> 
name <> "
  [parent type name]
  {:method :delete,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/resourcefiles/{type}/{name}",
   :uri-template-args {"type" type, "parent" parent, "name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-resourcefiles-listEnvironmentResources
  "Lists all resource files, optionally filtering by type. For more information about resource files, see [Resource files](https://cloud.google.com/apigee/docs/api-platform/develop/resource-files).
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/resourcefiles/listEnvironmentResources

parent <> 
type <> "
  [parent type]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/resourcefiles/{type}",
   :uri-template-args {"parent" parent, "type" type},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-resourcefiles-create
  "Creates a resource file. Specify the `Content-Type` as `application/octet-stream` or `multipart/form-data`. For more information about resource files, see [Resource files](https://cloud.google.com/apigee/docs/api-platform/develop/resource-files).
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/resourcefiles/create

parent <> 
GoogleApiHttpBody:
GoogleApiHttpBody

optional:
name <string> Required. Name of the resource file. Must match the regular expression: [a-zA-Z0-9:/\\\\!@#$%^&{}\\[\\]()+\\-=,.~'` ]{1,255}
type <string> Required. Resource file type. {{ resource_file_type }}"
  ([parent GoogleApiHttpBody]
    (organizations-environments-resourcefiles-create
      parent
      GoogleApiHttpBody
      nil))
  ([parent GoogleApiHttpBody optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/resourcefiles",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleApiHttpBody}))

(defn organizations-environments-resourcefiles-get
  "Gets the contents of a resource file. For more information about resource files, see [Resource files](https://cloud.google.com/apigee/docs/api-platform/develop/resource-files).
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/resourcefiles/get

parent <> 
type <> 
name <> "
  [parent type name]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/resourcefiles/{type}/{name}",
   :uri-template-args {"parent" parent, "type" type, "name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-resourcefiles-update
  "Updates a resource file. Specify the `Content-Type` as `application/octet-stream` or `multipart/form-data`. For more information about resource files, see [Resource files](https://cloud.google.com/apigee/docs/api-platform/develop/resource-files).
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/resourcefiles/update

parent <> 
type <> 
name <> 
GoogleApiHttpBody:
GoogleApiHttpBody"
  [parent type name GoogleApiHttpBody]
  {:method :put,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/resourcefiles/{type}/{name}",
   :uri-template-args {"type" type, "name" name, "parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleApiHttpBody})

(defn organizations-environments-resourcefiles-list
  "Lists all resource files, optionally filtering by type. For more information about resource files, see [Resource files](https://cloud.google.com/apigee/docs/api-platform/develop/resource-files).
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/resourcefiles/list

parent <> 

optional:
type <string> Optional. Type of resource files to list. {{ resource_file_type }}"
  ([parent] (organizations-environments-resourcefiles-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/resourcefiles",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-securityStats-queryTabularStats
  "Retrieve security statistics as tabular rows.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityStats/queryTabularStats

orgenv <> 
GoogleCloudApigeeV1QueryTabularStatsRequest:
GoogleCloudApigeeV1QueryTabularStatsRequest"
  [orgenv GoogleCloudApigeeV1QueryTabularStatsRequest]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+orgenv}/securityStats:queryTabularStats",
   :uri-template-args {"orgenv" orgenv},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1QueryTabularStatsRequest})

(defn organizations-environments-securityStats-queryTimeSeriesStats
  "Retrieve security statistics as a collection of time series.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityStats/queryTimeSeriesStats

orgenv <> 
GoogleCloudApigeeV1QueryTimeSeriesStatsRequest:
GoogleCloudApigeeV1QueryTimeSeriesStatsRequest"
  [orgenv GoogleCloudApigeeV1QueryTimeSeriesStatsRequest]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+orgenv}/securityStats:queryTimeSeriesStats",
   :uri-template-args {"orgenv" orgenv},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1QueryTimeSeriesStatsRequest})

(defn organizations-environments-targetservers-update
  "Updates an existing TargetServer. Note that this operation has PUT semantics; it will replace the entirety of the existing TargetServer with the resource in the request body.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/targetservers/update

name <> 
GoogleCloudApigeeV1TargetServer:
GoogleCloudApigeeV1TargetServer"
  [name GoogleCloudApigeeV1TargetServer]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1TargetServer})

(defn organizations-environments-targetservers-delete
  "Deletes a TargetServer from an environment. Returns the deleted TargetServer resource.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/targetservers/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-targetservers-get
  "Gets a TargetServer resource.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/targetservers/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-targetservers-create
  "Creates a TargetServer in the specified environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/targetservers/create

parent <> 
GoogleCloudApigeeV1TargetServer:
GoogleCloudApigeeV1TargetServer

optional:
name <string> Optional. The ID to give the TargetServer. This will overwrite the value in TargetServer."
  ([parent GoogleCloudApigeeV1TargetServer]
    (organizations-environments-targetservers-create
      parent
      GoogleCloudApigeeV1TargetServer
      nil))
  ([parent GoogleCloudApigeeV1TargetServer optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/targetservers",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1TargetServer}))

(defn organizations-environments-keystores-get
  "Gets a keystore or truststore.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keystores/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-keystores-delete
  "Deletes a keystore or truststore.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keystores/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-keystores-create
  "Creates a keystore or truststore. - Keystore: Contains certificates and their associated keys. - Truststore: Contains trusted certificates used to validate a server's certificate. These certificates are typically self-signed certificates or certificates that are not signed by a trusted CA.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keystores/create

parent <> 
GoogleCloudApigeeV1Keystore:
GoogleCloudApigeeV1Keystore

optional:
name <string> Optional. Name of the keystore. Overrides the value in Keystore."
  ([parent GoogleCloudApigeeV1Keystore]
    (organizations-environments-keystores-create
      parent
      GoogleCloudApigeeV1Keystore
      nil))
  ([parent GoogleCloudApigeeV1Keystore optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/keystores",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1Keystore}))

(defn organizations-environments-keystores-aliases-update
  "Updates the certificate in an alias.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keystores/aliases/update

name <> 
GoogleApiHttpBody:
GoogleApiHttpBody

optional:
ignoreNewlineValidation <boolean> Flag that specifies whether to ignore newline validation. If set to `true`, no error is thrown when the file contains a certificate chain with no newline between each certificate. Defaults to `false`.
ignoreExpiryValidation <boolean> Required. Flag that specifies whether to ignore expiry validation. If set to `true`, no expiry validation will be performed."
  ([name GoogleApiHttpBody]
    (organizations-environments-keystores-aliases-update
      name
      GoogleApiHttpBody
      nil))
  ([name GoogleApiHttpBody optional]
    {:method :put,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleApiHttpBody}))

(defn organizations-environments-keystores-aliases-csr
  "Generates a PKCS #10 Certificate Signing Request for the private key in an alias.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keystores/aliases/csr

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}/csr",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-keystores-aliases-getCertificate
  "Gets the certificate from an alias in PEM-encoded form.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keystores/aliases/getCertificate

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+name}/certificate",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-keystores-aliases-delete
  "Deletes an alias.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keystores/aliases/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-keystores-aliases-get
  "Gets an alias.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keystores/aliases/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-keystores-aliases-create
  "Creates an alias from a key/certificate pair. The structure of the request is controlled by the `format` query parameter: - `keycertfile` - Separate PEM-encoded key and certificate files are uploaded. Set `Content-Type: multipart/form-data` and include the `keyFile`, `certFile`, and `password` (if keys are encrypted) fields in the request body. If uploading to a truststore, omit `keyFile`. - `pkcs12` - A PKCS12 file is uploaded. Set `Content-Type: multipart/form-data`, provide the file in the `file` field, and include the `password` field if the file is encrypted in the request body. - `selfsignedcert` - A new private key and certificate are generated. Set `Content-Type: application/json` and include CertificateGenerationSpec in the request body.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/keystores/aliases/create

parent <> 
GoogleApiHttpBody:
GoogleApiHttpBody

optional:
_password <string> DEPRECATED: For improved security, specify the password in the request body instead of using the query parameter. To specify the password in the request body, set `Content-type: multipart/form-data` part with name `password`. Password for the private key file, if required.
alias <string> Alias for the key/certificate pair. Values must match the regular expression `[\\w\\s-.]{1,255}`. This must be provided for all formats except `selfsignedcert`; self-signed certs may specify the alias in either this parameter or the JSON body.
ignoreNewlineValidation <boolean> Flag that specifies whether to ignore newline validation. If set to `true`, no error is thrown when the file contains a certificate chain with no newline between each certificate. Defaults to `false`.
ignoreExpiryValidation <boolean> Flag that specifies whether to ignore expiry validation. If set to `true`, no expiry validation will be performed.
format <string> Required. Format of the data. Valid values include: `selfsignedcert`, `keycertfile`, or `pkcs12`"
  ([parent GoogleApiHttpBody]
    (organizations-environments-keystores-aliases-create
      parent
      GoogleApiHttpBody
      nil))
  ([parent GoogleApiHttpBody optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/aliases",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleApiHttpBody}))

(defn organizations-environments-securityReports-getResult
  "After the query is completed, use this API to retrieve the results as file. If the request succeeds, and there is a non-zero result set, the result is downloaded to the client as a zipped JSON file. The name of the downloaded file will be: OfflineQueryResult-.zip Example: `OfflineQueryResult-9cfc0d85-0f30-46d6-ae6f-318d0cb961bd.zip`
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityReports/getResult

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-securityReports-getResultView
  "After the query is completed, use this API to view the query result when result size is small.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityReports/getResultView

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-securityReports-list
  "Return a list of Security Reports
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityReports/list

parent <> 

optional:
from <string> Filter response list by returning security reports that created after this date time. Time must be in ISO date-time format like '2011-12-03T10:15:30Z'.
dataset <string> Filter response list by dataset. Example: `api`, `mint`
status <string> Filter response list by security reports status.
to <string> Filter response list by returning security reports that created before this date time. Time must be in ISO date-time format like '2011-12-03T10:16:30Z'.
pageSize <integer> The maximum number of security report to return in the list response.
submittedBy <string> Filter response list by user who submitted queries."
  ([parent]
    (organizations-environments-securityReports-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/securityReports",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-securityReports-create
  "Submit a report request to be processed in the background. If the submission succeeds, the API returns a 200 status and an ID that refer to the report request. In addition to the HTTP status 200, the `state` of \"enqueued\" means that the request succeeded.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityReports/create

parent <> 
GoogleCloudApigeeV1SecurityReportQuery:
GoogleCloudApigeeV1SecurityReportQuery"
  [parent GoogleCloudApigeeV1SecurityReportQuery]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/securityReports",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1SecurityReportQuery})

(defn organizations-environments-securityReports-get
  "Get security report status If the query is still in progress, the `state` is set to \"running\" After the query has completed successfully, `state` is set to \"completed\"
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/securityReports/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-deployments-list
  "Lists all deployments of API proxies or shared flows in an environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/deployments/list

parent <> 

optional:
sharedFlows <boolean> Optional. Flag that specifies whether to return shared flow or API proxy deployments. Set to `true` to return shared flow deployments; set to `false` to return API proxy deployments. Defaults to `false`."
  ([parent] (organizations-environments-deployments-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/deployments",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-apis-revisions-deploy
  "Deploys a revision of an API proxy. If another revision of the same API proxy revision is currently deployed, set the `override` parameter to `true` to have this revision replace the currently deployed revision. You cannot invoke an API proxy until it has been deployed to an environment. After you deploy an API proxy revision, you cannot edit it. To edit the API proxy, you must create and deploy a new revision. For a request path `organizations/{org}/environments/{env}/apis/{api}/revisions/{rev}/deployments`, two permissions are required: * `apigee.deployments.create` on the resource `organizations/{org}/environments/{env}` * `apigee.proxyrevisions.deploy` on the resource `organizations/{org}/apis/{api}/revisions/{rev}` 
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/apis/revisions/deploy

name <> 

optional:
sequencedRollout <boolean> Flag that specifies whether to enable sequenced rollout. If set to `true`, the routing rules for this deployment and the environment changes to add the deployment will be rolled out in a safe order. This reduces the risk of downtime that could be caused by changing the environment group's routing before the new destination for the affected traffic is ready to receive it. This should only be necessary if the new deployment will be capturing traffic from another environment under a shared environment group or if traffic will be rerouted to a different environment due to a base path removal. The generateDeployChangeReport API may be used to examine routing changes before issuing the deployment request, and its response will indicate if a sequenced rollout is recommended for the deployment.
serviceAccount <string> Google Cloud IAM service account. The service account represents the identity of the deployed proxy, and determines what permissions it has. The format must be `{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`.
override <boolean> Flag that specifies whether the new deployment replaces other deployed revisions of the API proxy in the environment. Set `override` to `true` to replace other deployed revisions. By default, `override` is `false` and the deployment is rejected if other revisions of the API proxy are deployed in the environment."
  ([name] (organizations-environments-apis-revisions-deploy name nil))
  ([name optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+name}/deployments",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-apis-revisions-getDeployments
  "Gets the deployment of an API proxy revision and actual state reported by runtime pods.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/apis/revisions/getDeployments

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+name}/deployments",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-apis-revisions-undeploy
  "Undeploys an API proxy revision from an environment. For a request path `organizations/{org}/environments/{env}/apis/{api}/revisions/{rev}/deployments`, two permissions are required: * `apigee.deployments.delete` on the resource `organizations/{org}/environments/{env}` * `apigee.proxyrevisions.undeploy` on the resource `organizations/{org}/apis/{api}/revisions/{rev}`
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/apis/revisions/undeploy

name <> 

optional:
sequencedRollout <boolean> Flag that specifies whether to enable sequenced rollout. If set to `true`, the environment group routing rules corresponding to this deployment will be removed before removing the deployment from the runtime. This is likely to be a rare use case; it is only needed when the intended effect of undeploying this proxy is to cause the traffic it currently handles to be rerouted to some other existing proxy in the environment group. The GenerateUndeployChangeReport API may be used to examine routing changes before issuing the undeployment request, and its response will indicate if a sequenced rollout is recommended for the undeployment."
  ([name]
    (organizations-environments-apis-revisions-undeploy name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://apigee.googleapis.com/v1/{+name}/deployments",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-apis-revisions-debugsessions-create
  "Creates a debug session for a deployed API Proxy revision.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/apis/revisions/debugsessions/create

parent <> 
GoogleCloudApigeeV1DebugSession:
GoogleCloudApigeeV1DebugSession

optional:
timeout <string> Optional. The time in seconds after which this DebugSession should end. A timeout specified in DebugSession will overwrite this value."
  ([parent GoogleCloudApigeeV1DebugSession]
    (organizations-environments-apis-revisions-debugsessions-create
      parent
      GoogleCloudApigeeV1DebugSession
      nil))
  ([parent GoogleCloudApigeeV1DebugSession optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/debugsessions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1DebugSession}))

(defn organizations-environments-apis-revisions-debugsessions-list
  "Lists debug sessions that are currently active in the given API Proxy revision.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/apis/revisions/debugsessions/list

parent <> 

optional:
pageSize <integer> Maximum number of debug sessions to return. The page size defaults to 25."
  ([parent]
    (organizations-environments-apis-revisions-debugsessions-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/debugsessions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-apis-revisions-debugsessions-deleteData
  "Deletes the data from a debug session. This does not cancel the debug session or prevent further data from being collected if the session is still active in runtime pods.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/apis/revisions/debugsessions/deleteData

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}/data",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-apis-revisions-debugsessions-get
  "Retrieves a debug session.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/apis/revisions/debugsessions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-apis-revisions-debugsessions-data-get
  "Gets the debug data from a transaction.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/apis/revisions/debugsessions/data/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-apis-revisions-deployments-generateUndeployChangeReport
  "Generates a report for a dry run analysis of an UndeployApiProxy request without committing the undeploy. In addition to the standard validations performed when removing deployments, additional analysis will be done to detect possible traffic routing changes that would result from this deployment being removed. Any potential routing conflicts or unsafe changes will be reported in the response. This routing analysis is not performed for a non-dry-run UndeployApiProxy request. For a request path `organizations/{org}/environments/{env}/apis/{api}/revisions/{rev}/deployments:generateUndeployChangeReport`, two permissions are required: * `apigee.deployments.delete` on the resource `organizations/{org}/environments/{env}` * `apigee.proxyrevisions.undeploy` on the resource `organizations/{org}/apis/{api}/revisions/{rev}`
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/apis/revisions/deployments/generateUndeployChangeReport

name <> "
  [name]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+name}/deployments:generateUndeployChangeReport",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-apis-revisions-deployments-generateDeployChangeReport
  "Generates a report for a dry run analysis of a DeployApiProxy request without committing the deployment. In addition to the standard validations performed when adding deployments, additional analysis will be done to detect possible traffic routing changes that would result from this deployment being created. Any potential routing conflicts or unsafe changes will be reported in the response. This routing analysis is not performed for a non-dry-run DeployApiProxy request. For a request path `organizations/{org}/environments/{env}/apis/{api}/revisions/{rev}/deployments:generateDeployChangeReport`, two permissions are required: * `apigee.deployments.create` on the resource `organizations/{org}/environments/{env}` * `apigee.proxyrevisions.deploy` on the resource `organizations/{org}/apis/{api}/revisions/{rev}`
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/apis/revisions/deployments/generateDeployChangeReport

name <> 

optional:
override <boolean> Flag that specifies whether to force the deployment of the new revision over the currently deployed revision by overriding conflict checks."
  ([name]
    (organizations-environments-apis-revisions-deployments-generateDeployChangeReport
      name
      nil))
  ([name optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+name}/deployments:generateDeployChangeReport",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-apis-deployments-list
  "Lists all deployments of an API proxy in an environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/apis/deployments/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/deployments",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-stats-get
  "Retrieve metrics grouped by dimensions. The types of metrics you can retrieve include traffic, message counts, API call latency, response size, and cache hits and counts. Dimensions let you view metrics in meaningful groups. You can optionally pass dimensions as path parameters to the `stats` API. If dimensions are not specified, the metrics are computed on the entire set of data for the given time range.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/stats/get

name <> 

optional:
topk <string> Top number of results to return. For example, to return the top 5 results, set `topk=5`.
timeUnit <string> Granularity of metrics returned. Valid values include: `second`, `minute`, `hour`, `day`, `week`, or` month`.
realtime <boolean> No longer used by Apigee. Supported for backwards compatibility.
offset <string> Offset value. Use `offset` with `limit` to enable pagination of results. For example, to display results 11-20, set limit to `10` and offset to `10`.
tsAscending <boolean> Flag that specifies whether to list timestamps in ascending (`true`) or descending (`false`) order. Apigee recommends that you set this value to `true` if you are using `sortby` with `sort=DESC`.
sortby <string> Comma-separated list of columns to sort the final result.
sort <string> Flag that specifies whether the sort order should be ascending or descending. Valid values include: `DESC` and `ASC`.
limit <string> Maximum number of result items to return. The default and maximum value that can be returned is 14400.
timeRange <string> Time interval for the interactive query. Time range is specified in GMT as `start~end`. For example: `04/15/2017 00:00~05/15/2017 23:59`
select <string> Comma-separated list of metrics. For example: `sum(message_count),sum(error_count)`
aggTable <string> Table name used to query custom aggregate tables. If this parameter is skipped, then Apigee will try to retrieve the data from fact tables which will be expensive.
filter <string> Filter that enables you to drill down on specific dimension values.
sonar <boolean> Routes the query to API Monitoring for the last hour.
accuracy <string> No longer used by Apigee. Supported for backwards compatibility.
tzo <string> Timezone offset value."
  ([name] (organizations-environments-stats-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-analytics-admin-getSchemav2
  "Gets a list of metrics and dimensions that can be used to create analytics queries and reports. Each schema element contains the name of the field, its associated type, and a flag indicating whether it is a standard or custom field.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/analytics/admin/getSchemav2

name <> 

optional:
disableCache <boolean> Flag that specifies whether the schema is be read from the database or cache. Set to `true` to read the schema from the database. Defaults to cache.
type <string> Required. Name of the dataset for which you want to retrieve the schema. For example: `fact` or `agg_cus1`"
  ([name]
    (organizations-environments-analytics-admin-getSchemav2 name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-environments-analytics-exports-create
  "Submit a data export job to be processed in the background. If the request is successful, the API returns a 201 status, a URI that can be used to retrieve the status of the export job, and the `state` value of \"enqueued\".
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/analytics/exports/create

parent <> 
GoogleCloudApigeeV1ExportRequest:
GoogleCloudApigeeV1ExportRequest"
  [parent GoogleCloudApigeeV1ExportRequest]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/analytics/exports",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1ExportRequest})

(defn organizations-environments-analytics-exports-get
  "Gets the details and status of an analytics export job. If the export job is still in progress, its `state` is set to \"running\". After the export job has completed successfully, its `state` is set to \"completed\". If the export job fails, its `state` is set to `failed`.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/analytics/exports/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-analytics-exports-list
  "Lists the details and status of all analytics export jobs belonging to the parent organization and environment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/analytics/exports/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/analytics/exports",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-flowhooks-get
  "Returns the name of the shared flow attached to the specified flow hook. If there's no shared flow attached to the flow hook, the API does not return an error; it simply does not return a name in the response.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/flowhooks/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-environments-flowhooks-attachSharedFlowToFlowHook
  "Attaches a shared flow to a flow hook.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/flowhooks/attachSharedFlowToFlowHook

name <> 
GoogleCloudApigeeV1FlowHook:
GoogleCloudApigeeV1FlowHook"
  [name GoogleCloudApigeeV1FlowHook]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1FlowHook})

(defn organizations-environments-flowhooks-detachSharedFlowFromFlowHook
  "Detaches a shared flow from a flow hook.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/environments/flowhooks/detachSharedFlowFromFlowHook

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-endpointAttachments-delete
  "Deletes an endpoint attachment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/endpointAttachments/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-endpointAttachments-get
  "Gets the endpoint attachment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/endpointAttachments/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-endpointAttachments-create
  "Creates an endpoint attachment. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/endpointAttachments/create

parent <> 
GoogleCloudApigeeV1EndpointAttachment:
GoogleCloudApigeeV1EndpointAttachment

optional:
endpointAttachmentId <string> ID to use for the endpoint attachment. ID must start with a lowercase letter followed by up to 31 lowercase letters, numbers, or hyphens, and cannot end with a hyphen. The minimum length is 2."
  ([parent GoogleCloudApigeeV1EndpointAttachment]
    (organizations-endpointAttachments-create
      parent
      GoogleCloudApigeeV1EndpointAttachment
      nil))
  ([parent GoogleCloudApigeeV1EndpointAttachment optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/endpointAttachments",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1EndpointAttachment}))

(defn organizations-endpointAttachments-list
  "Lists the endpoint attachments in an organization.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/endpointAttachments/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of endpoint attachments to return. If unspecified, at most 25 attachments will be returned."
  ([parent] (organizations-endpointAttachments-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/endpointAttachments",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-envgroups-list
  "Lists all environment groups.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/envgroups/list

parent <> 

optional:
pageSize <integer> Maximum number of environment groups to return. The page size defaults to 25."
  ([parent] (organizations-envgroups-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/envgroups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-envgroups-getDeployedIngressConfig
  "Gets the deployed ingress configuration for an environment group.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/envgroups/getDeployedIngressConfig

name <> 

optional:
view <string> When set to FULL, additional details about the specific deployments receiving traffic will be included in the IngressConfig response's RoutingRules."
  ([name] (organizations-envgroups-getDeployedIngressConfig name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-envgroups-delete
  "Deletes an environment group.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/envgroups/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-envgroups-create
  "Creates a new environment group.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/envgroups/create

parent <> 
GoogleCloudApigeeV1EnvironmentGroup:
GoogleCloudApigeeV1EnvironmentGroup

optional:
name <string> Optional. ID of the environment group. Overrides any ID in the environment_group resource."
  ([parent GoogleCloudApigeeV1EnvironmentGroup]
    (organizations-envgroups-create
      parent
      GoogleCloudApigeeV1EnvironmentGroup
      nil))
  ([parent GoogleCloudApigeeV1EnvironmentGroup optional]
    {:method :post,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/envgroups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1EnvironmentGroup}))

(defn organizations-envgroups-get
  "Gets an environment group.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/envgroups/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-envgroups-patch
  "Updates an environment group.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/envgroups/patch

name <> 
GoogleCloudApigeeV1EnvironmentGroup:
GoogleCloudApigeeV1EnvironmentGroup

optional:
updateMask <string> Optional. List of fields to be updated."
  ([name GoogleCloudApigeeV1EnvironmentGroup]
    (organizations-envgroups-patch
      name
      GoogleCloudApigeeV1EnvironmentGroup
      nil))
  ([name GoogleCloudApigeeV1EnvironmentGroup optional]
    {:method :patch,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1EnvironmentGroup}))

(defn organizations-envgroups-attachments-create
  "Creates a new attachment of an environment to an environment group.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/envgroups/attachments/create

parent <> 
GoogleCloudApigeeV1EnvironmentGroupAttachment:
GoogleCloudApigeeV1EnvironmentGroupAttachment"
  [parent GoogleCloudApigeeV1EnvironmentGroupAttachment]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/attachments",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1EnvironmentGroupAttachment})

(defn organizations-envgroups-attachments-get
  "Gets an environment group attachment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/envgroups/attachments/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-envgroups-attachments-delete
  "Deletes an environment group attachment.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/envgroups/attachments/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-envgroups-attachments-list
  "Lists all attachments of an environment group.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/envgroups/attachments/list

parent <> 

optional:
pageSize <integer> Maximum number of environment group attachments to return. The page size defaults to 25."
  ([parent] (organizations-envgroups-attachments-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/attachments",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-apps-list
  "Lists IDs of apps within an organization that have the specified app status (approved or revoked) or are of the specified app type (developer or company).
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apps/list

parent <> 

optional:
expand <boolean> Optional. Flag that specifies whether to return an expanded list of apps for the organization. Defaults to `false`.
includeCred <boolean> Optional. Flag that specifies whether to include credentials in the response.
apptype <string> Optional. 'apptype' is no longer available. Use a 'filter' instead.
keyStatus <string> Optional. Key status of the app. Valid values include `approved` or `revoked`. Defaults to `approved`.
pageSize <integer> Optional. Count of apps a single page can have in the response. If unspecified, at most 100 apps will be returned. The maximum value is 100; values above 100 will be coerced to 100. \"page_size\" is supported from ver 1.10.0 and above.
ids <string> Optional. Comma-separated list of app IDs on which to filter.
status <string> Optional. Filter by the status of the app. Valid values are `approved` or `revoked`. Defaults to `approved`.
filter <string> Optional. The filter expression to be used to get the list of apps, where filtering can be done on developerEmail, apiProduct, consumerKey, status, appId, appName, appType and appGroup. Examples: \"developerEmail=foo@bar.com\", \"appType=AppGroup\", or \"appType=Developer\" \"filter\" is supported from ver 1.10.0 and above.
apiProduct <string> API product.
rows <string> Optional. Maximum number of app IDs to return. Defaults to 10000.
startKey <string> Returns the list of apps starting from the specified app ID."
  ([parent] (organizations-apps-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+parent}/apps",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-apps-get
  "Gets the app profile for the specified app ID.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apps/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-hostSecurityReports-get
  "Get status of a query submitted at host level. If the query is still in progress, the `state` is set to \"running\" After the query has completed successfully, `state` is set to \"completed\"
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/hostSecurityReports/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-hostSecurityReports-list
  "Return a list of Security Reports at host level.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/hostSecurityReports/list

parent <> 

optional:
dataset <string> Filter response list by dataset. Example: `api`, `mint`
pageSize <integer> The maximum number of security report to return in the list response.
status <string> Filter response list by security report status.
envgroupHostname <string> Required. Filter response list by hostname.
from <string> Filter response list by returning security reports that created after this date time. Time must be in ISO date-time format like '2011-12-03T10:15:30Z'.
submittedBy <string> Filter response list by user who submitted queries.
to <string> Filter response list by returning security reports that created before this date time. Time must be in ISO date-time format like '2011-12-03T10:16:30Z'."
  ([parent] (organizations-hostSecurityReports-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/hostSecurityReports",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-hostSecurityReports-getResultView
  "After the query is completed, use this API to view the query result when result size is small.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/hostSecurityReports/getResultView

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-hostSecurityReports-getResult
  "After the query is completed, use this API to retrieve the results. If the request succeeds, and there is a non-zero result set, the result is downloaded to the client as a zipped JSON file. The name of the downloaded file will be: OfflineQueryResult-.zip Example: `OfflineQueryResult-9cfc0d85-0f30-46d6-ae6f-318d0cb961bd.zip`
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/hostSecurityReports/getResult

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-hostSecurityReports-create
  "Submit a query at host level to be processed in the background. If the submission of the query succeeds, the API returns a 201 status and an ID that refer to the query. In addition to the HTTP status 201, the `state` of \"enqueued\" means that the request succeeded.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/hostSecurityReports/create

parent <> 
GoogleCloudApigeeV1SecurityReportQuery:
GoogleCloudApigeeV1SecurityReportQuery"
  [parent GoogleCloudApigeeV1SecurityReportQuery]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/hostSecurityReports",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1SecurityReportQuery})

(defn organizations-appgroups-update
  "Updates an AppGroup. This API replaces the existing AppGroup details with those specified in the request. Include or exclude any existing details that you want to retain or delete, respectively. Note that the state of the AppGroup should be updated using `action`, and not via AppGroup.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/update

name <> 
GoogleCloudApigeeV1AppGroup:
GoogleCloudApigeeV1AppGroup

optional:
action <string> Activate or de-activate the AppGroup by setting the action as `active` or `inactive`. The `Content-Type` header must be set to `application/octet-stream`, with empty body."
  ([name GoogleCloudApigeeV1AppGroup]
    (organizations-appgroups-update
      name
      GoogleCloudApigeeV1AppGroup
      nil))
  ([name GoogleCloudApigeeV1AppGroup optional]
    {:method :put,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1AppGroup}))

(defn organizations-appgroups-create
  "Creates an AppGroup. Once created, user can register apps under the AppGroup to obtain secret key and password. At creation time, the AppGroup's state is set as `active`.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/create

parent <> 
GoogleCloudApigeeV1AppGroup:
GoogleCloudApigeeV1AppGroup"
  [parent GoogleCloudApigeeV1AppGroup]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/appgroups",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1AppGroup})

(defn organizations-appgroups-get
  "Returns the AppGroup details for the provided AppGroup name in the request URI.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-appgroups-delete
  "Deletes an AppGroup. All app and API keys associations with the AppGroup are also removed. **Warning**: This API will permanently delete the AppGroup and related artifacts. **Note**: The delete operation is asynchronous. The AppGroup app is deleted immediately, but its associated resources, such as apps and API keys, may take anywhere from a few seconds to a few minutes to be deleted.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-appgroups-list
  "Lists all AppGroups in an organization. A maximum of 1000 AppGroups are returned in the response if PageSize is not specified, or if the PageSize is greater than 1000.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/list

parent <> 

optional:
pageSize <integer> Count of AppGroups a single page can have in the response. If unspecified, at most 1000 AppGroups will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> The filter expression to be used to get the list of AppGroups, where filtering can be done on status, channelId or channelUri of the app group. Examples: filter=status=active\", filter=channelId=, filter=channelUri="
  ([parent] (organizations-appgroups-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/appgroups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-appgroups-apps-update
  "Updates the details for an AppGroup app. In addition, you can add an API product to an AppGroup app and automatically generate an API key for the app to use when calling APIs in the API product. If you want to use an existing API key for the API product, add the API product to the API key using the UpdateAppGroupAppKey API. Using this API, you cannot update the app name, as it is the primary key used to identify the app and cannot be changed. This API replaces the existing attributes with those specified in the request. Include or exclude any existing attributes that you want to retain or delete, respectively.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/apps/update

name <> 
GoogleCloudApigeeV1AppGroupApp:
GoogleCloudApigeeV1AppGroupApp

optional:
action <string> Approve or revoke the consumer key by setting this value to `approve` or `revoke`. The `Content-Type` header must be set to `application/octet-stream`, with empty body."
  ([name GoogleCloudApigeeV1AppGroupApp]
    (organizations-appgroups-apps-update
      name
      GoogleCloudApigeeV1AppGroupApp
      nil))
  ([name GoogleCloudApigeeV1AppGroupApp optional]
    {:method :put,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1AppGroupApp}))

(defn organizations-appgroups-apps-list
  "Lists all apps created by an AppGroup in an Apigee organization. Optionally, you can request an expanded view of the AppGroup apps. Lists all AppGroupApps in an AppGroup. A maximum of 1000 AppGroup apps are returned in the response if PageSize is not specified, or if the PageSize is greater than 1000.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/apps/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number entries to return. If unspecified, at most 1000 entries will be returned."
  ([parent] (organizations-appgroups-apps-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+parent}/apps",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-appgroups-apps-get
  "Returns the details for an AppGroup app.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/apps/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-appgroups-apps-delete
  "Deletes an AppGroup app. **Note**: The delete operation is asynchronous. The AppGroup app is deleted immediately, but its associated resources, such as app keys or access tokens, may take anywhere from a few seconds to a few minutes to be deleted.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/apps/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-appgroups-apps-create
  "Creates an app and associates it with an AppGroup. This API associates the AppGroup app with the specified API product and auto-generates an API key for the app to use in calls to API proxies inside that API product. The `name` is the unique ID of the app that you can use in API calls.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/apps/create

parent <> 
GoogleCloudApigeeV1AppGroupApp:
GoogleCloudApigeeV1AppGroupApp"
  [parent GoogleCloudApigeeV1AppGroupApp]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+parent}/apps",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1AppGroupApp})

(defn organizations-appgroups-apps-keys-create
  "Creates a custom consumer key and secret for a AppGroup app. This is particularly useful if you want to migrate existing consumer keys and secrets to Apigee from another system. Consumer keys and secrets can contain letters, numbers, underscores, and hyphens. No other special characters are allowed. To avoid service disruptions, a consumer key and secret should not exceed 2 KBs each. **Note**: When creating the consumer key and secret, an association to API products will not be made. Therefore, you should not specify the associated API products in your request. Instead, use the ProductizeAppGroupAppKey API to make the association after the consumer key and secret are created. If a consumer key and secret already exist, you can keep them or delete them using the DeleteAppGroupAppKey API.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/apps/keys/create

parent <> 
GoogleCloudApigeeV1AppGroupAppKey:
GoogleCloudApigeeV1AppGroupAppKey"
  [parent GoogleCloudApigeeV1AppGroupAppKey]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+parent}/keys",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1AppGroupAppKey})

(defn organizations-appgroups-apps-keys-get
  "Gets details for a consumer key for a AppGroup app, including the key and secret value, associated API products, and other information.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/apps/keys/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-appgroups-apps-keys-updateAppGroupAppKey
  "Adds an API product to an AppGroupAppKey, enabling the app that holds the key to access the API resources bundled in the API product. In addition, you can add attributes to the AppGroupAppKey. This API replaces the existing attributes with those specified in the request. Include or exclude any existing attributes that you want to retain or delete, respectively. You can use the same key to access all API products associated with the app.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/apps/keys/updateAppGroupAppKey

name <> 
GoogleCloudApigeeV1UpdateAppGroupAppKeyRequest:
GoogleCloudApigeeV1UpdateAppGroupAppKeyRequest"
  [name GoogleCloudApigeeV1UpdateAppGroupAppKeyRequest]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1UpdateAppGroupAppKeyRequest})

(defn organizations-appgroups-apps-keys-delete
  "Deletes an app's consumer key and removes all API products associated with the app. After the consumer key is deleted, it cannot be used to access any APIs.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/apps/keys/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-appgroups-apps-keys-apiproducts-delete
  "Removes an API product from an app's consumer key. After the API product is removed, the app cannot access the API resources defined in that API product. **Note**: The consumer key is not removed, only its association with the API product.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/apps/keys/apiproducts/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-appgroups-apps-keys-apiproducts-updateAppGroupAppKeyApiProduct
  "Approves or revokes the consumer key for an API product. After a consumer key is approved, the app can use it to access APIs. A consumer key that is revoked or pending cannot be used to access an API. Any access tokens associated with a revoked consumer key will remain active. However, Apigee checks the status of the consumer key and if set to `revoked` will not allow access to the API.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/appgroups/apps/keys/apiproducts/updateAppGroupAppKeyApiProduct

name <> 

optional:
action <string> Approve or revoke the consumer key by setting this value to `approve` or `revoke` respectively. The `Content-Type` header, if set, must be set to `application/octet-stream`, with empty body."
  ([name]
    (organizations-appgroups-apps-keys-apiproducts-updateAppGroupAppKeyApiProduct
      name
      nil))
  ([name optional]
    {:method :post,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-hostQueries-getResultView
  "
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/hostQueries/getResultView

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-hostQueries-getResult
  "After the query is completed, use this API to retrieve the results. If the request succeeds, and there is a non-zero result set, the result is downloaded to the client as a zipped JSON file. The name of the downloaded file will be: OfflineQueryResult-.zip Example: `OfflineQueryResult-9cfc0d85-0f30-46d6-ae6f-318d0cb961bd.zip`
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/hostQueries/getResult

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-hostQueries-list
  "Return a list of Asynchronous Queries at host level.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/hostQueries/list

parent <> 

optional:
to <string> Filter response list by returning asynchronous queries that created before this date time. Time must be in ISO date-time format like '2011-12-03T10:16:30Z'.
inclQueriesWithoutReport <string> Flag to include asynchronous queries that don't have a report denifition.
from <string> Filter response list by returning asynchronous queries that created after this date time. Time must be in ISO date-time format like '2011-12-03T10:15:30Z'.
submittedBy <string> Filter response list by user who submitted queries.
dataset <string> Filter response list by dataset. Example: `api`, `mint`
envgroupHostname <string> Required. Filter response list by hostname.
status <string> Filter response list by asynchronous query status."
  ([parent] (organizations-hostQueries-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/hostQueries",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-hostQueries-get
  "Get status of a query submitted at host level. If the query is still in progress, the `state` is set to \"running\" After the query has completed successfully, `state` is set to \"completed\"
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/hostQueries/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-hostQueries-create
  "Submit a query at host level to be processed in the background. If the submission of the query succeeds, the API returns a 201 status and an ID that refer to the query. In addition to the HTTP status 201, the `state` of \"enqueued\" means that the request succeeded.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/hostQueries/create

parent <> 
GoogleCloudApigeeV1Query:
GoogleCloudApigeeV1Query"
  [parent GoogleCloudApigeeV1Query]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/hostQueries",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Query})

(defn organizations-instances-delete
  "Deletes an Apigee runtime instance. The instance stops serving requests and the runtime data is deleted. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-instances-get
  "Gets the details for an Apigee runtime instance. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-instances-list
  "Lists all Apigee runtime instances for the organization. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/list

parent <> 

optional:
pageSize <integer> Maximum number of instances to return. Defaults to 25."
  ([parent] (organizations-instances-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/instances",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-instances-reportStatus
  "Reports the latest status for a runtime instance.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/reportStatus

instance <> 
GoogleCloudApigeeV1ReportInstanceStatusRequest:
GoogleCloudApigeeV1ReportInstanceStatusRequest"
  [instance GoogleCloudApigeeV1ReportInstanceStatusRequest]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+instance}:reportStatus",
   :uri-template-args {"instance" instance},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1ReportInstanceStatusRequest})

(defn organizations-instances-patch
  "Updates an Apigee runtime instance. You can update the fields described in NodeConfig. No other fields will be updated. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/patch

name <> 
GoogleCloudApigeeV1Instance:
GoogleCloudApigeeV1Instance

optional:
updateMask <string> List of fields to be updated."
  ([name GoogleCloudApigeeV1Instance]
    (organizations-instances-patch
      name
      GoogleCloudApigeeV1Instance
      nil))
  ([name GoogleCloudApigeeV1Instance optional]
    {:method :patch,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1Instance}))

(defn organizations-instances-create
  "Creates an Apigee runtime instance. The instance is accessible from the authorized network configured on the organization. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/create

parent <> 
GoogleCloudApigeeV1Instance:
GoogleCloudApigeeV1Instance"
  [parent GoogleCloudApigeeV1Instance]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/instances",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Instance})

(defn organizations-instances-attachments-create
  "Creates a new attachment of an environment to an instance. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/attachments/create

parent <> 
GoogleCloudApigeeV1InstanceAttachment:
GoogleCloudApigeeV1InstanceAttachment"
  [parent GoogleCloudApigeeV1InstanceAttachment]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/attachments",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1InstanceAttachment})

(defn organizations-instances-attachments-list
  "Lists all attachments to an instance. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/attachments/list

parent <> 

optional:
pageSize <integer> Maximum number of instance attachments to return. Defaults to 25."
  ([parent] (organizations-instances-attachments-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/attachments",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-instances-attachments-delete
  "Deletes an attachment. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/attachments/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-instances-attachments-get
  "Gets an attachment. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/attachments/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-instances-natAddresses-activate
  "Activates the NAT address. The Apigee instance can now use this for Internet egress traffic. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/natAddresses/activate

name <> 
GoogleCloudApigeeV1ActivateNatAddressRequest:
GoogleCloudApigeeV1ActivateNatAddressRequest"
  [name GoogleCloudApigeeV1ActivateNatAddressRequest]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+name}:activate",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1ActivateNatAddressRequest})

(defn organizations-instances-natAddresses-get
  "Gets the details of a NAT address. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/natAddresses/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-instances-natAddresses-delete
  "Deletes the NAT address. Connections that are actively using the address are drained before it is removed. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/natAddresses/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-instances-natAddresses-create
  "Creates a NAT address. The address is created in the RESERVED state and a static external IP address will be provisioned. At this time, the instance will not use this IP address for Internet egress traffic. The address can be activated for use once any required firewall IP whitelisting has been completed. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/natAddresses/create

parent <> 
GoogleCloudApigeeV1NatAddress:
GoogleCloudApigeeV1NatAddress"
  [parent GoogleCloudApigeeV1NatAddress]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/natAddresses",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1NatAddress})

(defn organizations-instances-natAddresses-list
  "Lists the NAT addresses for an Apigee instance. **Note:** Not supported for Apigee hybrid.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/natAddresses/list

parent <> 

optional:
pageSize <integer> Maximum number of natAddresses to return. Defaults to 25."
  ([parent] (organizations-instances-natAddresses-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/natAddresses",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-instances-canaryevaluations-create
  "Creates a new canary evaluation for an organization.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/canaryevaluations/create

parent <> 
GoogleCloudApigeeV1CanaryEvaluation:
GoogleCloudApigeeV1CanaryEvaluation"
  [parent GoogleCloudApigeeV1CanaryEvaluation]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/canaryevaluations",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1CanaryEvaluation})

(defn organizations-instances-canaryevaluations-get
  "Gets a CanaryEvaluation for an organization.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/instances/canaryevaluations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-hostStats-get
  "Retrieve metrics grouped by dimensions in host level. The types of metrics you can retrieve include traffic, message counts, API call latency, response size, and cache hits and counts. Dimensions let you view metrics in meaningful groups. You can optionally pass dimensions as path parameters to the `stats` API. If dimensions are not specified, the metrics are computed on the entire set of data for the given time range.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/hostStats/get

name <> 

optional:
topk <string> Top number of results to return. For example, to return the top 5 results, set `topk=5`.
timeUnit <string> Granularity of metrics returned. Valid values include: `second`, `minute`, `hour`, `day`, `week`, or `month`.
realtime <boolean> No longer used by Apigee. Supported for backwards compatibility.
offset <string> Offset value. Use `offset` with `limit` to enable pagination of results. For example, to display results 11-20, set limit to `10` and offset to `10`.
tsAscending <boolean> Flag that specifies whether to list timestamps in ascending (`true`) or descending (`false`) order. Apigee recommends that you set this value to `true` if you are using `sortby` with `sort=DESC`.
sortby <string> Comma-separated list of columns to sort the final result.
sort <string> Flag that specifies if the sort order should be ascending or descending. Valid values are `DESC` and `ASC`.
limit <string> Maximum number of result items to return. The default and maximum value that can be returned is 14400.
timeRange <string> Time interval for the interactive query. Time range is specified in GMT as `start~end`. For example: `04/15/2017 00:00~05/15/2017 23:59`
select <string> Comma-separated list of metrics. For example: `sum(message_count),sum(error_count)`
filter <string> Flag that enables drill-down on specific dimension values.
envgroupHostname <string> Required. Hostname for which the interactive query will be executed.
accuracy <string> No longer used by Apigee. Supported for backwards compatibility.
tzo <string> Timezone offset value."
  ([name] (organizations-hostStats-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-optimizedHostStats-get
  "Similar to GetHostStats except that the response is less verbose.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/optimizedHostStats/get

name <> 

optional:
topk <string> Top number of results to return. For example, to return the top 5 results, set `topk=5`.
timeUnit <string> Granularity of metrics returned. Valid values include: `second`, `minute`, `hour`, `day`, `week`, or `month`.
realtime <boolean> No longer used by Apigee. Supported for backwards compatibility.
offset <string> Offset value. Use `offset` with `limit` to enable pagination of results. For example, to display results 11-20, set limit to `10` and offset to `10`.
tsAscending <boolean> Flag that specifies whether to list timestamps in ascending (`true`) or descending (`false`) order. Apigee recommends that you set this value to `true` if you are using `sortby` with `sort=DESC`.
sortby <string> Comma-separated list of columns used to sort the final result.
sort <string> Flag that specifies whether the sort order should be ascending or descending. Valid values include `DESC` and `ASC`.
limit <string> Maximum number of result items to return. The default and maximum value that can be returned is 14400.
timeRange <string> Required. Time interval for the interactive query. Time range is specified in GMT as `start~end`. For example: `04/15/2017 00:00~05/15/2017 23:59`.
select <string> Required. Comma-separated list of metrics. For example: `sum(message_count),sum(error_count)`
filter <string> Filter that enables you to drill-down on specific dimension values.
envgroupHostname <string> Required. Hostname for which the interactive query will be executed.
accuracy <string> No longer used by Apigee. Supported for backwards compatibility.
tzo <string> Timezone offset value."
  ([name] (organizations-optimizedHostStats-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-deployments-list
  "Lists all deployments of API proxies or shared flows.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/deployments/list

parent <> 

optional:
sharedFlows <boolean> Optional. Flag that specifies whether to return shared flow or API proxy deployments. Set to `true` to return shared flow deployments; set to `false` to return API proxy deployments. Defaults to `false`."
  ([parent] (organizations-deployments-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/deployments",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-apis-get
  "Gets an API proxy including a list of existing revisions.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-apis-create
  "Creates an API proxy. The API proxy created will not be accessible at runtime until it is deployed to an environment. Create a new API proxy by setting the `name` query parameter to the name of the API proxy. Import an API proxy configuration bundle stored in zip format on your local machine to your organization by doing the following: * Set the `name` query parameter to the name of the API proxy. * Set the `action` query parameter to `import`. * Set the `Content-Type` header to `multipart/form-data`. * Pass as a file the name of API proxy configuration bundle stored in zip format on your local machine using the `file` form field. **Note**: To validate the API proxy configuration bundle only without importing it, set the `action` query parameter to `validate`. When importing an API proxy configuration bundle, if the API proxy does not exist, it will be created. If the API proxy exists, then a new revision is created. Invalid API proxy configurations are rejected, and a list of validation errors is returned to the client.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/create

parent <> 
GoogleApiHttpBody:
GoogleApiHttpBody

optional:
name <string> Name of the API proxy. Restrict the characters used to: A-Za-z0-9._-
action <string> Action to perform when importing an API proxy configuration bundle. Set this parameter to one of the following values: * `import` to import the API proxy configuration bundle. * `validate` to validate the API proxy configuration bundle without importing it.
validate <boolean> Ignored. All uploads are validated regardless of the value of this field. Maintained for compatibility with Apigee Edge API."
  ([parent GoogleApiHttpBody]
    (organizations-apis-create parent GoogleApiHttpBody nil))
  ([parent GoogleApiHttpBody optional]
    {:method :post,
     :uri-template "https://apigee.googleapis.com/v1/{+parent}/apis",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleApiHttpBody}))

(defn organizations-apis-patch
  "Updates an existing API proxy.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/patch

name <> 
GoogleCloudApigeeV1ApiProxy:
GoogleCloudApigeeV1ApiProxy

optional:
updateMask <string> Required. The list of fields to update."
  ([name GoogleCloudApigeeV1ApiProxy]
    (organizations-apis-patch name GoogleCloudApigeeV1ApiProxy nil))
  ([name GoogleCloudApigeeV1ApiProxy optional]
    {:method :patch,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1ApiProxy}))

(defn organizations-apis-delete
  "Deletes an API proxy and all associated endpoints, policies, resources, and revisions. The API proxy must be undeployed before you can delete it.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-apis-list
  "Lists the names of all API proxies in an organization. The names returned correspond to the names defined in the configuration files for each API proxy.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/list

parent <> 

optional:
includeMetaData <boolean> Flag that specifies whether to include API proxy metadata in the response.
includeRevisions <boolean> Flag that specifies whether to include a list of revisions in the response."
  ([parent] (organizations-apis-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+parent}/apis",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-apis-deployments-list
  "Lists all deployments of an API proxy.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/deployments/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/deployments",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-apis-keyvaluemaps-delete
  "Deletes a key value map from an API proxy.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/keyvaluemaps/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-apis-keyvaluemaps-create
  "Creates a key value map in an API proxy.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/keyvaluemaps/create

parent <> 
GoogleCloudApigeeV1KeyValueMap:
GoogleCloudApigeeV1KeyValueMap"
  [parent GoogleCloudApigeeV1KeyValueMap]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/keyvaluemaps",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1KeyValueMap})

(defn organizations-apis-keyvaluemaps-entries-get
  "Get the key value entry value for a key value map scoped to an organization, environment, or API proxy. **Note**: Supported for Apigee hybrid 1.8.x and higher.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/keyvaluemaps/entries/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-apis-keyvaluemaps-entries-delete
  "Deletes a key value entry from a key value map scoped to an organization, environment, or API proxy. **Notes:** * After you delete the key value entry, the policy consuming the entry will continue to function with its cached values for a few minutes. This is expected behavior. * Supported for Apigee hybrid 1.8.x and higher.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/keyvaluemaps/entries/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-apis-keyvaluemaps-entries-list
  "Lists key value entries for key values maps scoped to an organization, environment, or API proxy. **Note**: Supported for Apigee hybrid 1.8.x and higher.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/keyvaluemaps/entries/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of key value entries to return. If unspecified, at most 100 entries will be returned."
  ([parent] (organizations-apis-keyvaluemaps-entries-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/entries",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-apis-keyvaluemaps-entries-create
  "Creates key value entries in a key value map scoped to an organization, environment, or API proxy. **Note**: Supported for Apigee hybrid 1.8.x and higher.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/keyvaluemaps/entries/create

parent <> 
GoogleCloudApigeeV1KeyValueEntry:
GoogleCloudApigeeV1KeyValueEntry"
  [parent GoogleCloudApigeeV1KeyValueEntry]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+parent}/entries",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1KeyValueEntry})

(defn organizations-apis-keyvaluemaps-entries-update
  "Update key value entry scoped to an organization, environment, or API proxy for an existing key.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/keyvaluemaps/entries/update

name <> 
GoogleCloudApigeeV1KeyValueEntry:
GoogleCloudApigeeV1KeyValueEntry"
  [name GoogleCloudApigeeV1KeyValueEntry]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1KeyValueEntry})

(defn organizations-apis-revisions-get
  "Gets an API proxy revision. To download the API proxy configuration bundle for the specified revision as a zip file, set the `format` query parameter to `bundle`. If you are using curl, specify `-o filename.zip` to save the output to a file; otherwise, it displays to `stdout`. Then, develop the API proxy configuration locally and upload the updated API proxy configuration revision, as described in [updateApiProxyRevision](updateApiProxyRevision).
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/revisions/get

name <> 

optional:
format <string> Format used when downloading the API proxy configuration revision. Set to `bundle` to download the API proxy configuration revision as a zip file."
  ([name] (organizations-apis-revisions-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-apis-revisions-delete
  "Deletes an API proxy revision and all policies, resources, endpoints, and revisions associated with it. The API proxy revision must be undeployed before you can delete it.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/revisions/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-apis-revisions-updateApiProxyRevision
  "Updates an existing API proxy revision by uploading the API proxy configuration bundle as a zip file from your local machine. You can update only API proxy revisions that have never been deployed. After deployment, an API proxy revision becomes immutable, even if it is undeployed. Set the `Content-Type` header to either `multipart/form-data` or `application/octet-stream`.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/revisions/updateApiProxyRevision

name <> 
GoogleApiHttpBody:
GoogleApiHttpBody

optional:
validate <boolean> Ignored. All uploads are validated regardless of the value of this field. Maintained for compatibility with Apigee Edge API."
  ([name GoogleApiHttpBody]
    (organizations-apis-revisions-updateApiProxyRevision
      name
      GoogleApiHttpBody
      nil))
  ([name GoogleApiHttpBody optional]
    {:method :post,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleApiHttpBody}))

(defn organizations-apis-revisions-deployments-list
  "Lists all deployments of an API proxy revision.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/apis/revisions/deployments/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/deployments",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-analytics-datastores-list
  "List Datastores
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/analytics/datastores/list

parent <> 

optional:
targetType <string> Optional. TargetType is used to fetch all Datastores that match the type"
  ([parent] (organizations-analytics-datastores-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/analytics/datastores",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-analytics-datastores-test
  "Test if Datastore configuration is correct. This includes checking if credentials provided by customer have required permissions in target destination storage
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/analytics/datastores/test

parent <> 
GoogleCloudApigeeV1Datastore:
GoogleCloudApigeeV1Datastore"
  [parent GoogleCloudApigeeV1Datastore]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/analytics/datastores:test",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Datastore})

(defn organizations-analytics-datastores-create
  "Create a Datastore for an org
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/analytics/datastores/create

parent <> 
GoogleCloudApigeeV1Datastore:
GoogleCloudApigeeV1Datastore"
  [parent GoogleCloudApigeeV1Datastore]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/analytics/datastores",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Datastore})

(defn organizations-analytics-datastores-get
  "Get a Datastore
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/analytics/datastores/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-analytics-datastores-update
  "Update a Datastore
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/analytics/datastores/update

name <> 
GoogleCloudApigeeV1Datastore:
GoogleCloudApigeeV1Datastore"
  [name GoogleCloudApigeeV1Datastore]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Datastore})

(defn organizations-analytics-datastores-delete
  "Delete a Datastore from an org.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/analytics/datastores/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-list
  "Lists all developers in an organization by email address. By default, the response does not include company developers. Set the `includeCompany` query parameter to `true` to include company developers. **Note**: A maximum of 1000 developers are returned in the response. You paginate the list of developers returned using the `startKey` and `count` query parameters.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/list

parent <> 

optional:
ids <string> Optional. List of IDs to include, separated by commas.
includeCompany <boolean> Flag that specifies whether to include company details in the response.
startKey <string> **Note**: Must be used in conjunction with the `count` parameter. Email address of the developer from which to start displaying the list of developers. For example, if the an unfiltered list returns: ``` westley@example.com fezzik@example.com buttercup@example.com ``` and your `startKey` is `fezzik@example.com`, the list returned will be ``` fezzik@example.com buttercup@example.com ```
count <string> Optional. Number of developers to return in the API call. Use with the `startKey` parameter to provide more targeted filtering. The limit is 1000.
expand <boolean> Specifies whether to expand the results. Set to `true` to expand the results. This query parameter is not valid if you use the `count` or `startKey` query parameters.
app <string> Optional. List only Developers that are associated with the app. Note that start_key, count are not applicable for this filter criteria."
  ([parent] (organizations-developers-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/developers",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-developers-getMonetizationConfig
  "Gets the monetization configuration for the developer.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/getMonetizationConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-delete
  "Deletes a developer. All apps and API keys associated with the developer are also removed. **Warning**: This API will permanently delete the developer and related artifacts. To avoid permanently deleting developers and their artifacts, set the developer status to `inactive` using the SetDeveloperStatus API. **Note**: The delete operation is asynchronous. The developer app is deleted immediately, but its associated resources, such as apps and API keys, may take anywhere from a few seconds to a few minutes to be deleted.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-updateMonetizationConfig
  "Updates the monetization configuration for the developer.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/updateMonetizationConfig

name <> 
GoogleCloudApigeeV1DeveloperMonetizationConfig:
GoogleCloudApigeeV1DeveloperMonetizationConfig"
  [name GoogleCloudApigeeV1DeveloperMonetizationConfig]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1DeveloperMonetizationConfig})

(defn organizations-developers-update
  "Updates a developer. This API replaces the existing developer details with those specified in the request. Include or exclude any existing details that you want to retain or delete, respectively. The custom attribute limit is 18. **Note**: OAuth access tokens and Key Management Service (KMS) entities (apps, developers, and API products) are cached for 180 seconds (current default). Any custom attributes associated with these entities are cached for at least 180 seconds after the entity is accessed at runtime. Therefore, an `ExpiresIn` element on the OAuthV2 policy won't be able to expire an access token in less than 180 seconds.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/update

name <> 
GoogleCloudApigeeV1Developer:
GoogleCloudApigeeV1Developer"
  [name GoogleCloudApigeeV1Developer]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Developer})

(defn organizations-developers-setDeveloperStatus
  "Sets the status of a developer. A developer is `active` by default. If you set a developer's status to `inactive`, the API keys assigned to the developer apps are no longer valid even though the API keys are set to `approved`. Inactive developers can still sign in to the developer portal and create apps; however, any new API keys generated during app creation won't work. To set the status of a developer, set the `action` query parameter to `active` or `inactive`, and the `Content-Type` header to `application/octet-stream`. If successful, the API call returns the following HTTP status code: `204 No Content`
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/setDeveloperStatus

name <> 

optional:
action <string> Status of the developer. Valid values are `active` and `inactive`."
  ([name] (organizations-developers-setDeveloperStatus name nil))
  ([name optional]
    {:method :post,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-developers-getBalance
  "Gets the account balance for the developer.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/getBalance

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-attributes
  "Updates developer attributes. This API replaces the existing attributes with those specified in the request. Add new attributes, and include or exclude any existing attributes that you want to retain or remove, respectively. The custom attribute limit is 18. **Note**: OAuth access tokens and Key Management Service (KMS) entities (apps, developers, and API products) are cached for 180 seconds (default). Any custom attributes associated with these entities are cached for at least 180 seconds after the entity is accessed at runtime. Therefore, an `ExpiresIn` element on the OAuthV2 policy won't be able to expire an access token in less than 180 seconds.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/attributes

parent <> 
GoogleCloudApigeeV1Attributes:
GoogleCloudApigeeV1Attributes"
  [parent GoogleCloudApigeeV1Attributes]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/attributes",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Attributes})

(defn organizations-developers-create
  "Creates a developer. Once created, the developer can register an app and obtain an API key. At creation time, a developer is set as `active`. To change the developer status, use the SetDeveloperStatus API.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/create

parent <> 
GoogleCloudApigeeV1Developer:
GoogleCloudApigeeV1Developer"
  [parent GoogleCloudApigeeV1Developer]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/developers",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Developer})

(defn organizations-developers-get
  "Returns the developer details, including the developer's name, email address, apps, and other information. **Note**: The response includes only the first 100 developer apps.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/get

name <> 

optional:
action <string> Status of the developer. Valid values are `active` or `inactive`."
  ([name] (organizations-developers-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-developers-attributes-updateDeveloperAttribute
  "Updates a developer attribute. **Note**: OAuth access tokens and Key Management Service (KMS) entities (apps, developers, and API products) are cached for 180 seconds (default). Any custom attributes associated with these entities are cached for at least 180 seconds after the entity is accessed at runtime. Therefore, an `ExpiresIn` element on the OAuthV2 policy won't be able to expire an access token in less than 180 seconds.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/attributes/updateDeveloperAttribute

name <> 
GoogleCloudApigeeV1Attribute:
GoogleCloudApigeeV1Attribute"
  [name GoogleCloudApigeeV1Attribute]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Attribute})

(defn organizations-developers-attributes-delete
  "Deletes a developer attribute.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/attributes/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-attributes-get
  "Returns the value of the specified developer attribute.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/attributes/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-attributes-list
  "Returns a list of all developer attributes.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/attributes/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/attributes",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-balance-adjust
  "Adjust the prepaid balance for the developer. This API will be used in scenarios where the developer has been under-charged or over-charged.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/balance/adjust

name <> 
GoogleCloudApigeeV1AdjustDeveloperBalanceRequest:
GoogleCloudApigeeV1AdjustDeveloperBalanceRequest"
  [name GoogleCloudApigeeV1AdjustDeveloperBalanceRequest]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+name}:adjust",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1AdjustDeveloperBalanceRequest})

(defn organizations-developers-balance-credit
  "Credits the account balance for the developer.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/balance/credit

name <> 
GoogleCloudApigeeV1CreditDeveloperBalanceRequest:
GoogleCloudApigeeV1CreditDeveloperBalanceRequest"
  [name GoogleCloudApigeeV1CreditDeveloperBalanceRequest]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+name}:credit",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1CreditDeveloperBalanceRequest})

(defn organizations-developers-apps-delete
  "Deletes a developer app. **Note**: The delete operation is asynchronous. The developer app is deleted immediately, but its associated resources, such as app keys or access tokens, may take anywhere from a few seconds to a few minutes to be deleted.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-apps-attributes
  "Updates attributes for a developer app. This API replaces the current attributes with those specified in the request.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/attributes

name <> 
GoogleCloudApigeeV1Attributes:
GoogleCloudApigeeV1Attributes"
  [name GoogleCloudApigeeV1Attributes]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+name}/attributes",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Attributes})

(defn organizations-developers-apps-update
  "Updates the details for a developer app. In addition, you can add an API product to a developer app and automatically generate an API key for the app to use when calling APIs in the API product. If you want to use an existing API key for the API product, add the API product to the API key using the UpdateDeveloperAppKey API. Using this API, you cannot update the following: * App name as it is the primary key used to identify the app and cannot be changed. * Scopes associated with the app. Instead, use the ReplaceDeveloperAppKey API. This API replaces the existing attributes with those specified in the request. Include or exclude any existing attributes that you want to retain or delete, respectively.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/update

name <> 
GoogleCloudApigeeV1DeveloperApp:
GoogleCloudApigeeV1DeveloperApp"
  [name GoogleCloudApigeeV1DeveloperApp]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1DeveloperApp})

(defn organizations-developers-apps-list
  "Lists all apps created by a developer in an Apigee organization. Optionally, you can request an expanded view of the developer apps. A maximum of 100 developer apps are returned per API call. You can paginate the list of deveoper apps returned using the `startKey` and `count` query parameters.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/list

parent <> 

optional:
shallowExpand <boolean> Optional. Specifies whether to expand the results in shallow mode. Set to `true` to expand the results in shallow mode.
count <string> Number of developer apps to return in the API call. Use with the `startKey` parameter to provide more targeted filtering. The limit is 1000.
startKey <string> **Note**: Must be used in conjunction with the `count` parameter. Name of the developer app from which to start displaying the list of developer apps. For example, if you're returning 50 developer apps at a time (using the `count` query parameter), you can view developer apps 50-99 by entering the name of the 50th developer app. The developer app name is case sensitive.
expand <boolean> Optional. Specifies whether to expand the results. Set to `true` to expand the results. This query parameter is not valid if you use the `count` or `startKey` query parameters."
  ([parent] (organizations-developers-apps-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+parent}/apps",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-developers-apps-get
  "Returns the details for a developer app.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/get

name <> 

optional:
entity <string> **Note**: Must be used in conjunction with the `query` parameter. Set to `apiresources` to return the number of API resources that have been approved for access by a developer app in the specified Apigee organization.
query <string> **Note**: Must be used in conjunction with the `entity` parameter. Set to `count` to return the number of API resources that have been approved for access by a developer app in the specified Apigee organization."
  ([name] (organizations-developers-apps-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-developers-apps-generateKeyPairOrUpdateDeveloperAppStatus
  "Manages access to a developer app by enabling you to: * Approve or revoke a developer app * Generate a new consumer key and secret for a developer app To approve or revoke a developer app, set the `action` query parameter to `approve` or `revoke`, respectively, and the `Content-Type` header to `application/octet-stream`. If a developer app is revoked, none of its API keys are valid for API calls even though the keys are still approved. If successful, the API call returns the following HTTP status code: `204 No Content` To generate a new consumer key and secret for a developer app, pass the new key/secret details. Rather than replace an existing key, this API generates a new key. In this case, multiple key pairs may be associated with a single developer app. Each key pair has an independent status (`approve` or `revoke`) and expiration time. Any approved, non-expired key can be used in an API call. For example, if you're using API key rotation, you can generate new keys with expiration times that overlap keys that are going to expire. You might also generate a new consumer key/secret if the security of the original key/secret is compromised. The `keyExpiresIn` property defines the expiration time for the API key in milliseconds. If you don't set this property or set it to `-1`, the API key never expires. **Notes**: * When generating a new key/secret, this API replaces the existing attributes, notes, and callback URLs with those specified in the request. Include or exclude any existing information that you want to retain or delete, respectively. * To migrate existing consumer keys and secrets to hybrid from another system, see the CreateDeveloperAppKey API.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/generateKeyPairOrUpdateDeveloperAppStatus

name <> 
GoogleCloudApigeeV1DeveloperApp:
GoogleCloudApigeeV1DeveloperApp

optional:
action <string> Action. Valid values are `approve` or `revoke`."
  ([name GoogleCloudApigeeV1DeveloperApp]
    (organizations-developers-apps-generateKeyPairOrUpdateDeveloperAppStatus
      name
      GoogleCloudApigeeV1DeveloperApp
      nil))
  ([name GoogleCloudApigeeV1DeveloperApp optional]
    {:method :post,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1DeveloperApp}))

(defn organizations-developers-apps-create
  "Creates an app associated with a developer. This API associates the developer app with the specified API product and auto-generates an API key for the app to use in calls to API proxies inside that API product. The `name` is the unique ID of the app that you can use in API calls. The `DisplayName` (set as an attribute) appears in the UI. If you don't set the `DisplayName` attribute, the `name` appears in the UI.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/create

parent <> 
GoogleCloudApigeeV1DeveloperApp:
GoogleCloudApigeeV1DeveloperApp"
  [parent GoogleCloudApigeeV1DeveloperApp]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+parent}/apps",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1DeveloperApp})

(defn organizations-developers-apps-keys-replaceDeveloperAppKey
  "Updates the scope of an app. This API replaces the existing scopes with those specified in the request. Include or exclude any existing scopes that you want to retain or delete, respectively. The specified scopes must already be defined for the API products associated with the app. This API sets the `scopes` element under the `apiProducts` element in the attributes of the app.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/keys/replaceDeveloperAppKey

name <> 
GoogleCloudApigeeV1DeveloperAppKey:
GoogleCloudApigeeV1DeveloperAppKey"
  [name GoogleCloudApigeeV1DeveloperAppKey]
  {:method :put,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1DeveloperAppKey})

(defn organizations-developers-apps-keys-create
  "Creates a custom consumer key and secret for a developer app. This is particularly useful if you want to migrate existing consumer keys and secrets to Apigee from another system. Consumer keys and secrets can contain letters, numbers, underscores, and hyphens. No other special characters are allowed. To avoid service disruptions, a consumer key and secret should not exceed 2 KBs each. **Note**: When creating the consumer key and secret, an association to API products will not be made. Therefore, you should not specify the associated API products in your request. Instead, use the UpdateDeveloperAppKey API to make the association after the consumer key and secret are created. If a consumer key and secret already exist, you can keep them or delete them using the DeleteDeveloperAppKey API. **Note**: All keys start out with status=approved, even if status=revoked is passed when the key is created. To revoke a key, use the UpdateDeveloperAppKey API.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/keys/create

parent <> 
GoogleCloudApigeeV1DeveloperAppKey:
GoogleCloudApigeeV1DeveloperAppKey"
  [parent GoogleCloudApigeeV1DeveloperAppKey]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+parent}/keys",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1DeveloperAppKey})

(defn organizations-developers-apps-keys-updateDeveloperAppKey
  "Adds an API product to a developer app key, enabling the app that holds the key to access the API resources bundled in the API product. In addition, you can add attributes to a developer app key. This API replaces the existing attributes with those specified in the request. Include or exclude any existing attributes that you want to retain or delete, respectively. You can use the same key to access all API products associated with the app.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/keys/updateDeveloperAppKey

name <> 
GoogleCloudApigeeV1DeveloperAppKey:
GoogleCloudApigeeV1DeveloperAppKey

optional:
action <string> Approve or revoke the consumer key by setting this value to `approve` or `revoke`, respectively. The `Content-Type` header must be set to `application/octet-stream`."
  ([name GoogleCloudApigeeV1DeveloperAppKey]
    (organizations-developers-apps-keys-updateDeveloperAppKey
      name
      GoogleCloudApigeeV1DeveloperAppKey
      nil))
  ([name GoogleCloudApigeeV1DeveloperAppKey optional]
    {:method :post,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudApigeeV1DeveloperAppKey}))

(defn organizations-developers-apps-keys-delete
  "Deletes an app's consumer key and removes all API products associated with the app. After the consumer key is deleted, it cannot be used to access any APIs. **Note**: After you delete a consumer key, you may want to: 1. Create a new consumer key and secret for the developer app using the CreateDeveloperAppKey API, and subsequently add an API product to the key using the UpdateDeveloperAppKey API. 2. Delete the developer app, if it is no longer required.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/keys/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-apps-keys-get
  "Gets details for a consumer key for a developer app, including the key and secret value, associated API products, and other information.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/keys/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-apps-keys-create-create
  "Creates a custom consumer key and secret for a developer app. This is particularly useful if you want to migrate existing consumer keys and secrets to Apigee from another system. Consumer keys and secrets can contain letters, numbers, underscores, and hyphens. No other special characters are allowed. To avoid service disruptions, a consumer key and secret should not exceed 2 KBs each. **Note**: When creating the consumer key and secret, an association to API products will not be made. Therefore, you should not specify the associated API products in your request. Instead, use the UpdateDeveloperAppKey API to make the association after the consumer key and secret are created. If a consumer key and secret already exist, you can keep them or delete them using the DeleteDeveloperAppKey API. **Note**: All keys start out with status=approved, even if status=revoked is passed when the key is created. To revoke a key, use the UpdateDeveloperAppKey API.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/keys/create/create

parent <> 
GoogleCloudApigeeV1DeveloperAppKey:
GoogleCloudApigeeV1DeveloperAppKey"
  [parent GoogleCloudApigeeV1DeveloperAppKey]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/keys/create",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1DeveloperAppKey})

(defn organizations-developers-apps-keys-apiproducts-delete
  "Removes an API product from an app's consumer key. After the API product is removed, the app cannot access the API resources defined in that API product. **Note**: The consumer key is not removed, only its association with the API product.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/keys/apiproducts/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-apps-keys-apiproducts-updateDeveloperAppKeyApiProduct
  "Approves or revokes the consumer key for an API product. After a consumer key is approved, the app can use it to access APIs. A consumer key that is revoked or pending cannot be used to access an API. Any access tokens associated with a revoked consumer key will remain active. However, Apigee checks the status of the consumer key and if set to `revoked` will not allow access to the API.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/keys/apiproducts/updateDeveloperAppKeyApiProduct

name <> 

optional:
action <string> Approve or revoke the consumer key by setting this value to `approve` or `revoke`, respectively."
  ([name]
    (organizations-developers-apps-keys-apiproducts-updateDeveloperAppKeyApiProduct
      name
      nil))
  ([name optional]
    {:method :post,
     :uri-template "https://apigee.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-developers-apps-attributes-list
  "Returns a list of all developer app attributes.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/attributes/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/attributes",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-apps-attributes-updateDeveloperAppAttribute
  "Updates a developer app attribute. **Note**: OAuth access tokens and Key Management Service (KMS) entities (apps, developers, and API products) are cached for 180 seconds (current default). Any custom attributes associated with these entities are cached for at least 180 seconds after the entity is accessed at runtime. Therefore, an `ExpiresIn` element on the OAuthV2 policy won't be able to expire an access token in less than 180 seconds.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/attributes/updateDeveloperAppAttribute

name <> 
GoogleCloudApigeeV1Attribute:
GoogleCloudApigeeV1Attribute"
  [name GoogleCloudApigeeV1Attribute]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1Attribute})

(defn organizations-developers-apps-attributes-get
  "Returns a developer app attribute.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/attributes/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-apps-attributes-delete
  "Deletes a developer app attribute.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/apps/attributes/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-subscriptions-list
  "Lists all API product subscriptions for a developer.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/subscriptions/list

parent <> 

optional:
startKey <string> Name of the API product subscription from which to start displaying the list of subscriptions. If omitted, the list starts from the first item. For example, to view the API product subscriptions from 51-150, set the value of `startKey` to the name of the 51st subscription and set the value of `count` to 100.
count <integer> Number of API product subscriptions to return in the API call. Use with `startKey` to provide more targeted filtering. Defaults to 100. The maximum limit is 1000."
  ([parent] (organizations-developers-subscriptions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+parent}/subscriptions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-developers-subscriptions-get
  "Gets details for an API product subscription.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/subscriptions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-developers-subscriptions-create
  "Creates a subscription to an API product. 
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/subscriptions/create

parent <> 
GoogleCloudApigeeV1DeveloperSubscription:
GoogleCloudApigeeV1DeveloperSubscription"
  [parent GoogleCloudApigeeV1DeveloperSubscription]
  {:method :post,
   :uri-template
   "https://apigee.googleapis.com/v1/{+parent}/subscriptions",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1DeveloperSubscription})

(defn organizations-developers-subscriptions-expire
  "Expires an API product subscription immediately.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/developers/subscriptions/expire

name <> 
GoogleCloudApigeeV1ExpireDeveloperSubscriptionRequest:
GoogleCloudApigeeV1ExpireDeveloperSubscriptionRequest"
  [name GoogleCloudApigeeV1ExpireDeveloperSubscriptionRequest]
  {:method :post,
   :uri-template "https://apigee.googleapis.com/v1/{+name}:expire",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudApigeeV1ExpireDeveloperSubscriptionRequest})

(defn organizations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (organizations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://apigee.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/apigee/v1/reference/rest/v1/organizations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn hybrid-issuers-list
  "Lists hybrid services and its trusted issuers service account ids. This api is authenticated and unauthorized(allow all the users) and used by runtime authn-authz service to query control plane's issuer service account ids.
https://cloud.google.com/apigee/v1/reference/rest/v1/hybrid/issuers/list

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigee.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})
