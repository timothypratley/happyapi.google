(ns happyapi.google.accessapproval-v1
  "Access Approval API
An API for controlling access to data by Google personnel.
See: https://cloud.google.com/assured-workloads/access-approval/docs")

(defn projects-getAccessApprovalSettings
  "Gets the settings associated with a project, folder, or organization.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/projects/getAccessApprovalSettings

name <> "
  [name]
  {:method :get,
   :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-updateAccessApprovalSettings
  "Updates the settings associated with a project, folder, or organization. Settings to update are determined by the value of field_mask.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/projects/updateAccessApprovalSettings

name <> 
AccessApprovalSettings:
AccessApprovalSettings

optional:
updateMask <string> The update mask applies to the settings. Only the top level fields of AccessApprovalSettings (notification_emails & enrolled_services) are supported. For each field, if it is included, the currently stored value will be entirely overwritten with the value of the field passed in this request. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If this field is left unset, only the notification_emails field will be updated."
  ([name AccessApprovalSettings]
    (projects-updateAccessApprovalSettings
      name
      AccessApprovalSettings
      nil))
  ([name AccessApprovalSettings optional]
    {:method :patch,
     :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AccessApprovalSettings}))

(defn projects-deleteAccessApprovalSettings
  "Deletes the settings associated with a project, folder, or organization. This will have the effect of disabling Access Approval for the project, folder, or organization, but only if all ancestors also have Access Approval disabled. If Access Approval is enabled at a higher level of the hierarchy, then Access Approval will still be enabled at this level as the settings are inherited.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/projects/deleteAccessApprovalSettings

name <> "
  [name]
  {:method :delete,
   :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-getServiceAccount
  "Retrieves the service account that is used by Access Approval to access KMS keys for signing approved approval requests.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/projects/getServiceAccount

name <> "
  [name]
  {:method :get,
   :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-approvalRequests-list
  "Lists approval requests associated with a project, folder, or organization. Approval requests can be filtered by state (pending, active, dismissed). The order is reverse chronological.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/projects/approvalRequests/list

parent <> 

optional:
filter <string> A filter on the type of approval requests to retrieve. Must be one of the following values: * [not set]: Requests that are pending or have active approvals. * ALL: All requests. * PENDING: Only pending requests. * ACTIVE: Only active (i.e. currently approved) requests. * DISMISSED: Only requests that have been dismissed, or requests that are not approved and past expiration. * EXPIRED: Only requests that have been approved, and the approval has expired. * HISTORY: Active, dismissed and expired requests.
pageSize <integer> Requested page size."
  ([parent] (projects-approvalRequests-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://accessapproval.googleapis.com/v1/{+parent}/approvalRequests",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-approvalRequests-get
  "Gets an approval request. Returns NOT_FOUND if the request does not exist.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/projects/approvalRequests/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-approvalRequests-approve
  "Approves a request and returns the updated ApprovalRequest. Returns NOT_FOUND if the request does not exist. Returns FAILED_PRECONDITION if the request exists but is not in a pending state.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/projects/approvalRequests/approve

name <> 
ApproveApprovalRequestMessage:
ApproveApprovalRequestMessage"
  [name ApproveApprovalRequestMessage]
  {:method :post,
   :uri-template
   "https://accessapproval.googleapis.com/v1/{+name}:approve",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ApproveApprovalRequestMessage})

(defn projects-approvalRequests-dismiss
  "Dismisses a request. Returns the updated ApprovalRequest. NOTE: This does not deny access to the resource if another request has been made and approved. It is equivalent in effect to ignoring the request altogether. Returns NOT_FOUND if the request does not exist. Returns FAILED_PRECONDITION if the request exists but is not in a pending state.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/projects/approvalRequests/dismiss

name <> 
DismissApprovalRequestMessage:
DismissApprovalRequestMessage"
  [name DismissApprovalRequestMessage]
  {:method :post,
   :uri-template
   "https://accessapproval.googleapis.com/v1/{+name}:dismiss",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body DismissApprovalRequestMessage})

(defn projects-approvalRequests-invalidate
  "Invalidates an existing ApprovalRequest. Returns the updated ApprovalRequest. NOTE: This does not deny access to the resource if another request has been made and approved. It only invalidates a single approval. Returns FAILED_PRECONDITION if the request exists but is not in an approved state.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/projects/approvalRequests/invalidate

name <> 
InvalidateApprovalRequestMessage:
InvalidateApprovalRequestMessage"
  [name InvalidateApprovalRequestMessage]
  {:method :post,
   :uri-template
   "https://accessapproval.googleapis.com/v1/{+name}:invalidate",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body InvalidateApprovalRequestMessage})

(defn folders-getAccessApprovalSettings
  "Gets the settings associated with a project, folder, or organization.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/folders/getAccessApprovalSettings

name <> "
  [name]
  {:method :get,
   :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn folders-updateAccessApprovalSettings
  "Updates the settings associated with a project, folder, or organization. Settings to update are determined by the value of field_mask.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/folders/updateAccessApprovalSettings

name <> 
AccessApprovalSettings:
AccessApprovalSettings

optional:
updateMask <string> The update mask applies to the settings. Only the top level fields of AccessApprovalSettings (notification_emails & enrolled_services) are supported. For each field, if it is included, the currently stored value will be entirely overwritten with the value of the field passed in this request. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If this field is left unset, only the notification_emails field will be updated."
  ([name AccessApprovalSettings]
    (folders-updateAccessApprovalSettings
      name
      AccessApprovalSettings
      nil))
  ([name AccessApprovalSettings optional]
    {:method :patch,
     :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AccessApprovalSettings}))

(defn folders-deleteAccessApprovalSettings
  "Deletes the settings associated with a project, folder, or organization. This will have the effect of disabling Access Approval for the project, folder, or organization, but only if all ancestors also have Access Approval disabled. If Access Approval is enabled at a higher level of the hierarchy, then Access Approval will still be enabled at this level as the settings are inherited.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/folders/deleteAccessApprovalSettings

name <> "
  [name]
  {:method :delete,
   :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn folders-getServiceAccount
  "Retrieves the service account that is used by Access Approval to access KMS keys for signing approved approval requests.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/folders/getServiceAccount

name <> "
  [name]
  {:method :get,
   :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn folders-approvalRequests-list
  "Lists approval requests associated with a project, folder, or organization. Approval requests can be filtered by state (pending, active, dismissed). The order is reverse chronological.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/folders/approvalRequests/list

parent <> 

optional:
filter <string> A filter on the type of approval requests to retrieve. Must be one of the following values: * [not set]: Requests that are pending or have active approvals. * ALL: All requests. * PENDING: Only pending requests. * ACTIVE: Only active (i.e. currently approved) requests. * DISMISSED: Only requests that have been dismissed, or requests that are not approved and past expiration. * EXPIRED: Only requests that have been approved, and the approval has expired. * HISTORY: Active, dismissed and expired requests.
pageSize <integer> Requested page size."
  ([parent] (folders-approvalRequests-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://accessapproval.googleapis.com/v1/{+parent}/approvalRequests",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-approvalRequests-get
  "Gets an approval request. Returns NOT_FOUND if the request does not exist.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/folders/approvalRequests/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn folders-approvalRequests-approve
  "Approves a request and returns the updated ApprovalRequest. Returns NOT_FOUND if the request does not exist. Returns FAILED_PRECONDITION if the request exists but is not in a pending state.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/folders/approvalRequests/approve

name <> 
ApproveApprovalRequestMessage:
ApproveApprovalRequestMessage"
  [name ApproveApprovalRequestMessage]
  {:method :post,
   :uri-template
   "https://accessapproval.googleapis.com/v1/{+name}:approve",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ApproveApprovalRequestMessage})

(defn folders-approvalRequests-dismiss
  "Dismisses a request. Returns the updated ApprovalRequest. NOTE: This does not deny access to the resource if another request has been made and approved. It is equivalent in effect to ignoring the request altogether. Returns NOT_FOUND if the request does not exist. Returns FAILED_PRECONDITION if the request exists but is not in a pending state.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/folders/approvalRequests/dismiss

name <> 
DismissApprovalRequestMessage:
DismissApprovalRequestMessage"
  [name DismissApprovalRequestMessage]
  {:method :post,
   :uri-template
   "https://accessapproval.googleapis.com/v1/{+name}:dismiss",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body DismissApprovalRequestMessage})

(defn folders-approvalRequests-invalidate
  "Invalidates an existing ApprovalRequest. Returns the updated ApprovalRequest. NOTE: This does not deny access to the resource if another request has been made and approved. It only invalidates a single approval. Returns FAILED_PRECONDITION if the request exists but is not in an approved state.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/folders/approvalRequests/invalidate

name <> 
InvalidateApprovalRequestMessage:
InvalidateApprovalRequestMessage"
  [name InvalidateApprovalRequestMessage]
  {:method :post,
   :uri-template
   "https://accessapproval.googleapis.com/v1/{+name}:invalidate",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body InvalidateApprovalRequestMessage})

(defn organizations-getAccessApprovalSettings
  "Gets the settings associated with a project, folder, or organization.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/organizations/getAccessApprovalSettings

name <> "
  [name]
  {:method :get,
   :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-updateAccessApprovalSettings
  "Updates the settings associated with a project, folder, or organization. Settings to update are determined by the value of field_mask.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/organizations/updateAccessApprovalSettings

name <> 
AccessApprovalSettings:
AccessApprovalSettings

optional:
updateMask <string> The update mask applies to the settings. Only the top level fields of AccessApprovalSettings (notification_emails & enrolled_services) are supported. For each field, if it is included, the currently stored value will be entirely overwritten with the value of the field passed in this request. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If this field is left unset, only the notification_emails field will be updated."
  ([name AccessApprovalSettings]
    (organizations-updateAccessApprovalSettings
      name
      AccessApprovalSettings
      nil))
  ([name AccessApprovalSettings optional]
    {:method :patch,
     :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AccessApprovalSettings}))

(defn organizations-deleteAccessApprovalSettings
  "Deletes the settings associated with a project, folder, or organization. This will have the effect of disabling Access Approval for the project, folder, or organization, but only if all ancestors also have Access Approval disabled. If Access Approval is enabled at a higher level of the hierarchy, then Access Approval will still be enabled at this level as the settings are inherited.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/organizations/deleteAccessApprovalSettings

name <> "
  [name]
  {:method :delete,
   :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-getServiceAccount
  "Retrieves the service account that is used by Access Approval to access KMS keys for signing approved approval requests.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/organizations/getServiceAccount

name <> "
  [name]
  {:method :get,
   :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-approvalRequests-list
  "Lists approval requests associated with a project, folder, or organization. Approval requests can be filtered by state (pending, active, dismissed). The order is reverse chronological.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/organizations/approvalRequests/list

parent <> 

optional:
filter <string> A filter on the type of approval requests to retrieve. Must be one of the following values: * [not set]: Requests that are pending or have active approvals. * ALL: All requests. * PENDING: Only pending requests. * ACTIVE: Only active (i.e. currently approved) requests. * DISMISSED: Only requests that have been dismissed, or requests that are not approved and past expiration. * EXPIRED: Only requests that have been approved, and the approval has expired. * HISTORY: Active, dismissed and expired requests.
pageSize <integer> Requested page size."
  ([parent] (organizations-approvalRequests-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://accessapproval.googleapis.com/v1/{+parent}/approvalRequests",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-approvalRequests-get
  "Gets an approval request. Returns NOT_FOUND if the request does not exist.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/organizations/approvalRequests/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://accessapproval.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-approvalRequests-approve
  "Approves a request and returns the updated ApprovalRequest. Returns NOT_FOUND if the request does not exist. Returns FAILED_PRECONDITION if the request exists but is not in a pending state.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/organizations/approvalRequests/approve

name <> 
ApproveApprovalRequestMessage:
ApproveApprovalRequestMessage"
  [name ApproveApprovalRequestMessage]
  {:method :post,
   :uri-template
   "https://accessapproval.googleapis.com/v1/{+name}:approve",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ApproveApprovalRequestMessage})

(defn organizations-approvalRequests-dismiss
  "Dismisses a request. Returns the updated ApprovalRequest. NOTE: This does not deny access to the resource if another request has been made and approved. It is equivalent in effect to ignoring the request altogether. Returns NOT_FOUND if the request does not exist. Returns FAILED_PRECONDITION if the request exists but is not in a pending state.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/organizations/approvalRequests/dismiss

name <> 
DismissApprovalRequestMessage:
DismissApprovalRequestMessage"
  [name DismissApprovalRequestMessage]
  {:method :post,
   :uri-template
   "https://accessapproval.googleapis.com/v1/{+name}:dismiss",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body DismissApprovalRequestMessage})

(defn organizations-approvalRequests-invalidate
  "Invalidates an existing ApprovalRequest. Returns the updated ApprovalRequest. NOTE: This does not deny access to the resource if another request has been made and approved. It only invalidates a single approval. Returns FAILED_PRECONDITION if the request exists but is not in an approved state.
https://cloud.google.com/assured-workloads/access-approval/docs/v1/reference/rest/v1/organizations/approvalRequests/invalidate

name <> 
InvalidateApprovalRequestMessage:
InvalidateApprovalRequestMessage"
  [name InvalidateApprovalRequestMessage]
  {:method :post,
   :uri-template
   "https://accessapproval.googleapis.com/v1/{+name}:invalidate",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body InvalidateApprovalRequestMessage})
