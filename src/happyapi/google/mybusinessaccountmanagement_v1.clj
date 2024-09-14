(ns happyapi.google.mybusinessaccountmanagement-v1
  "My Business Account Management API
The My Business Account Management API provides an interface for managing access to a location on Google. Note - If you have a quota of 0 after enabling the API, please request for GBP API access.
See: https://developers.google.com/my-business/")

(defn locations-transfer
  "Moves a location from an account that the user owns to another account that the same user administers. The user must be an owner of the account the location is currently associated with and must also be at least a manager of the destination account.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/transfer

name <> 
TransferLocationRequest:
TransferLocationRequest"
  [name TransferLocationRequest]
  {:method :post,
   :uri-template
   "https://mybusinessaccountmanagement.googleapis.com/v1/{+name}:transfer",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil,
   :body TransferLocationRequest})

(defn locations-admins-list
  "Lists all of the admins for the specified location.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/admins/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://mybusinessaccountmanagement.googleapis.com/v1/{+parent}/admins",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes nil})

(defn locations-admins-create
  "Invites the specified user to become an administrator for the specified location. The invitee must accept the invitation in order to be granted access to the location. See AcceptInvitation to programmatically accept an invitation.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/admins/create

parent <> 
Admin:
Admin"
  [parent Admin]
  {:method :post,
   :uri-template
   "https://mybusinessaccountmanagement.googleapis.com/v1/{+parent}/admins",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes nil,
   :body Admin})

(defn locations-admins-delete
  "Removes the specified admin as a manager of the specified location.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/admins/delete

name <> "
  [name]
  {:method :delete,
   :uri-template
   "https://mybusinessaccountmanagement.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn locations-admins-patch
  "Updates the Admin for the specified location. Only the AdminRole of the Admin can be updated.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/admins/patch

name <> 
Admin:
Admin

optional:
updateMask <string> Required. The specific fields that should be updated. The only editable field is role."
  ([name Admin] (locations-admins-patch name Admin nil))
  ([name Admin optional]
    {:method :patch,
     :uri-template
     "https://mybusinessaccountmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes nil,
     :body Admin}))

(defn accounts-list
  "Lists all of the accounts for the authenticated user. This includes all accounts that the user owns, as well as any accounts for which the user has management rights.
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/list

optional:
parentAccount <string> Optional. The resource name of the account for which the list of directly accessible accounts is to be retrieved. This only makes sense for Organizations and User Groups. If empty, will return `ListAccounts` for the authenticated user. `accounts/{account_id}`.
pageSize <integer> Optional. How many accounts to fetch per page. The default and maximum is 20.
filter <string> Optional. A filter constraining the accounts to return. The response includes only entries that match the filter. If `filter` is empty, then no constraints are applied and all accounts (paginated) are retrieved for the requested account. For example, a request with the filter `type=USER_GROUP` will only return user groups. The `type` field is the only supported filter."
  ([] (accounts-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://mybusinessaccountmanagement.googleapis.com/v1/accounts",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes nil}))

(defn accounts-get
  "Gets the specified account. Returns `NOT_FOUND` if the account does not exist or if the caller does not have access rights to it.
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://mybusinessaccountmanagement.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn accounts-create
  "Creates an account with the specified name and type under the given parent. - Personal accounts and Organizations cannot be created. - User Groups cannot be created with a Personal account as primary owner. - Location Groups cannot be created with a primary owner of a Personal account if the Personal account is in an Organization. - Location Groups cannot own Location Groups.
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/create

Account:
Account"
  [Account]
  {:method :post,
   :uri-template
   "https://mybusinessaccountmanagement.googleapis.com/v1/accounts",
   :uri-template-args {},
   :query-params {},
   :scopes nil,
   :body Account})

(defn accounts-patch
  "Updates the specified business account. Personal accounts cannot be updated using this method.
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/patch

name <> 
Account:
Account

optional:
updateMask <string> Required. The specific fields that should be updated. The only editable field is `accountName`.
validateOnly <boolean> Optional. If true, the request is validated without actually updating the account."
  ([name Account] (accounts-patch name Account nil))
  ([name Account optional]
    {:method :patch,
     :uri-template
     "https://mybusinessaccountmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes nil,
     :body Account}))

(defn accounts-invitations-accept
  "Accepts the specified invitation.
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/invitations/accept

name <> 
AcceptInvitationRequest:
AcceptInvitationRequest"
  [name AcceptInvitationRequest]
  {:method :post,
   :uri-template
   "https://mybusinessaccountmanagement.googleapis.com/v1/{+name}:accept",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil,
   :body AcceptInvitationRequest})

(defn accounts-invitations-decline
  "Declines the specified invitation.
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/invitations/decline

name <> 
DeclineInvitationRequest:
DeclineInvitationRequest"
  [name DeclineInvitationRequest]
  {:method :post,
   :uri-template
   "https://mybusinessaccountmanagement.googleapis.com/v1/{+name}:decline",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil,
   :body DeclineInvitationRequest})

(defn accounts-invitations-list
  "Lists pending invitations for the specified account.
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/invitations/list

parent <> 

optional:
filter <string> Optional. Filtering the response is supported via the Invitation.target_type field."
  ([parent] (accounts-invitations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://mybusinessaccountmanagement.googleapis.com/v1/{+parent}/invitations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes nil}))

(defn accounts-admins-list
  "Lists the admins for the specified account.
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/admins/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://mybusinessaccountmanagement.googleapis.com/v1/{+parent}/admins",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes nil})

(defn accounts-admins-create
  "Invites the specified user to become an administrator for the specified account. The invitee must accept the invitation in order to be granted access to the account. See AcceptInvitation to programmatically accept an invitation.
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/admins/create

parent <> 
Admin:
Admin"
  [parent Admin]
  {:method :post,
   :uri-template
   "https://mybusinessaccountmanagement.googleapis.com/v1/{+parent}/admins",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes nil,
   :body Admin})

(defn accounts-admins-delete
  "Removes the specified admin from the specified account.
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/admins/delete

name <> "
  [name]
  {:method :delete,
   :uri-template
   "https://mybusinessaccountmanagement.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn accounts-admins-patch
  "Updates the Admin for the specified Account Admin.
https://developers.google.com/my-business/v1/reference/rest/v1/accounts/admins/patch

name <> 
Admin:
Admin

optional:
updateMask <string> Required. The specific fields that should be updated. The only editable field is role."
  ([name Admin] (accounts-admins-patch name Admin nil))
  ([name Admin optional]
    {:method :patch,
     :uri-template
     "https://mybusinessaccountmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes nil,
     :body Admin}))
