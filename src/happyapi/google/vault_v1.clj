(ns happyapi.google.vault-v1
  "Google Vault API
Retention and eDiscovery for Google Workspace. To work with Vault resources, the account must have the [required Vault privileges](https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege. For example, to download an export, an account needs the **Manage Exports** privilege and the matter shared with them. 
See: https://developers.google.com/vault"
  (:require [happyapi.providers.google :as client]))

(defn operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://developers.google.com/vault/v1/reference/rest/v1/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://vault.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/ediscovery"
        "https://www.googleapis.com/auth/ediscovery.readonly"]})))

(defn operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://developers.google.com/vault/v1/reference/rest/v1/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://vault.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/ediscovery"
      "https://www.googleapis.com/auth/ediscovery.readonly"]}))

(defn operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://developers.google.com/vault/v1/reference/rest/v1/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://vault.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"]}))

(defn operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://developers.google.com/vault/v1/reference/rest/v1/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://vault.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body CancelOperationRequest}))

(defn matters-reopen
  "Reopens the specified matter. Returns the matter with updated state.
https://developers.google.com/vault/v1/reference/rest/v1/matters/reopen

matterId <> 
ReopenMatterRequest:
ReopenMatterRequest"
  [matterId ReopenMatterRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}:reopen",
     :uri-template-args {"matterId" matterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body ReopenMatterRequest}))

(defn matters-removePermissions
  "Removes an account as a matter collaborator.
https://developers.google.com/vault/v1/reference/rest/v1/matters/removePermissions

matterId <> 
RemoveMatterPermissionsRequest:
RemoveMatterPermissionsRequest"
  [matterId RemoveMatterPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}:removePermissions",
     :uri-template-args {"matterId" matterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body RemoveMatterPermissionsRequest}))

(defn matters-list
  "Lists matters the requestor has access to.
https://developers.google.com/vault/v1/reference/rest/v1/matters/list

optional:
pageSize <integer> The number of matters to return in the response. Default and maximum are 100.
view <string> Specifies how much information about the matter to return in response.
state <string> If set, lists only matters with the specified state. The default lists matters of all states."
  ([] (matters-list nil))
  ([optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://vault.googleapis.com/v1/matters",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/ediscovery"
        "https://www.googleapis.com/auth/ediscovery.readonly"]})))

(defn matters-delete
  "Deletes the specified matter. Returns the matter with updated state.
https://developers.google.com/vault/v1/reference/rest/v1/matters/delete

matterId <> "
  [matterId]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}",
     :uri-template-args {"matterId" matterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"]}))

(defn matters-undelete
  "Undeletes the specified matter. Returns the matter with updated state.
https://developers.google.com/vault/v1/reference/rest/v1/matters/undelete

matterId <> 
UndeleteMatterRequest:
UndeleteMatterRequest"
  [matterId UndeleteMatterRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}:undelete",
     :uri-template-args {"matterId" matterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body UndeleteMatterRequest}))

(defn matters-addPermissions
  "Adds an account as a matter collaborator.
https://developers.google.com/vault/v1/reference/rest/v1/matters/addPermissions

matterId <> 
AddMatterPermissionsRequest:
AddMatterPermissionsRequest"
  [matterId AddMatterPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}:addPermissions",
     :uri-template-args {"matterId" matterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body AddMatterPermissionsRequest}))

(defn matters-count
  "Counts the accounts processed by the specified query.
https://developers.google.com/vault/v1/reference/rest/v1/matters/count

matterId <> 
CountArtifactsRequest:
CountArtifactsRequest"
  [matterId CountArtifactsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}:count",
     :uri-template-args {"matterId" matterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body CountArtifactsRequest}))

(defn matters-update
  "Updates the specified matter. This updates only the name and description of the matter, identified by matter ID. Changes to any other fields are ignored. Returns the default view of the matter.
https://developers.google.com/vault/v1/reference/rest/v1/matters/update

matterId <> 
Matter:
Matter"
  [matterId Matter]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}",
     :uri-template-args {"matterId" matterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body Matter}))

(defn matters-close
  "Closes the specified matter. Returns the matter with updated state.
https://developers.google.com/vault/v1/reference/rest/v1/matters/close

matterId <> 
CloseMatterRequest:
CloseMatterRequest"
  [matterId CloseMatterRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}:close",
     :uri-template-args {"matterId" matterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body CloseMatterRequest}))

(defn matters-create
  "Creates a matter with the given name and description. The initial state is open, and the owner is the method caller. Returns the created matter with default view.
https://developers.google.com/vault/v1/reference/rest/v1/matters/create

Matter:
Matter"
  [Matter]
  (client/*api-request*
    {:method :post,
     :uri-template "https://vault.googleapis.com/v1/matters",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body Matter}))

(defn matters-get
  "Gets the specified matter.
https://developers.google.com/vault/v1/reference/rest/v1/matters/get

matterId <> 

optional:
view <string> Specifies how much information about the matter to return in the response."
  ([matterId] (matters-get matterId nil))
  ([matterId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://vault.googleapis.com/v1/matters/{matterId}",
       :uri-template-args {"matterId" matterId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/ediscovery"
        "https://www.googleapis.com/auth/ediscovery.readonly"]})))

(defn matters-exports-create
  "Creates an export.
https://developers.google.com/vault/v1/reference/rest/v1/matters/exports/create

matterId <> 
Export:
Export"
  [matterId Export]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}/exports",
     :uri-template-args {"matterId" matterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body Export}))

(defn matters-exports-delete
  "Deletes an export.
https://developers.google.com/vault/v1/reference/rest/v1/matters/exports/delete

matterId <> 
exportId <> "
  [matterId exportId]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}/exports/{exportId}",
     :uri-template-args {"matterId" matterId, "exportId" exportId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"]}))

(defn matters-exports-get
  "Gets an export.
https://developers.google.com/vault/v1/reference/rest/v1/matters/exports/get

matterId <> 
exportId <> "
  [matterId exportId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}/exports/{exportId}",
     :uri-template-args {"matterId" matterId, "exportId" exportId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/ediscovery"
      "https://www.googleapis.com/auth/ediscovery.readonly"]}))

(defn matters-exports-list
  "Lists details about the exports in the specified matter.
https://developers.google.com/vault/v1/reference/rest/v1/matters/exports/list

matterId <> 

optional:
pageSize <integer> The number of exports to return in the response."
  ([matterId] (matters-exports-list matterId nil))
  ([matterId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://vault.googleapis.com/v1/matters/{matterId}/exports",
       :uri-template-args {"matterId" matterId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/ediscovery"
        "https://www.googleapis.com/auth/ediscovery.readonly"]})))

(defn matters-holds-create
  "Creates a hold in the specified matter.
https://developers.google.com/vault/v1/reference/rest/v1/matters/holds/create

matterId <> 
Hold:
Hold"
  [matterId Hold]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}/holds",
     :uri-template-args {"matterId" matterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body Hold}))

(defn matters-holds-update
  "Updates the scope (organizational unit or accounts) and query parameters of a hold. You cannot add accounts to a hold that covers an organizational unit, nor can you add organizational units to a hold that covers individual accounts. If you try, the unsupported values are ignored.
https://developers.google.com/vault/v1/reference/rest/v1/matters/holds/update

matterId <> 
holdId <> 
Hold:
Hold"
  [matterId holdId Hold]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}/holds/{holdId}",
     :uri-template-args {"matterId" matterId, "holdId" holdId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body Hold}))

(defn matters-holds-delete
  "Removes the specified hold and releases the accounts or organizational unit covered by the hold. If the data is not preserved by another hold or retention rule, it might be purged.
https://developers.google.com/vault/v1/reference/rest/v1/matters/holds/delete

matterId <> 
holdId <> "
  [matterId holdId]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}/holds/{holdId}",
     :uri-template-args {"matterId" matterId, "holdId" holdId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"]}))

(defn matters-holds-get
  "Gets the specified hold.
https://developers.google.com/vault/v1/reference/rest/v1/matters/holds/get

matterId <> 
holdId <> 

optional:
view <string> The amount of detail to return for a hold."
  ([matterId holdId] (matters-holds-get matterId holdId nil))
  ([matterId holdId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://vault.googleapis.com/v1/matters/{matterId}/holds/{holdId}",
       :uri-template-args {"matterId" matterId, "holdId" holdId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/ediscovery"
        "https://www.googleapis.com/auth/ediscovery.readonly"]})))

(defn matters-holds-list
  "Lists the holds in a matter.
https://developers.google.com/vault/v1/reference/rest/v1/matters/holds/list

matterId <> 

optional:
pageSize <integer> The number of holds to return in the response, between 0 and 100 inclusive. Leaving this empty, or as 0, is the same as **page_size** = 100.
view <string> The amount of detail to return for a hold."
  ([matterId] (matters-holds-list matterId nil))
  ([matterId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://vault.googleapis.com/v1/matters/{matterId}/holds",
       :uri-template-args {"matterId" matterId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/ediscovery"
        "https://www.googleapis.com/auth/ediscovery.readonly"]})))

(defn matters-holds-addHeldAccounts
  "Adds accounts to a hold. Returns a list of accounts that have been successfully added. Accounts can be added only to an existing account-based hold.
https://developers.google.com/vault/v1/reference/rest/v1/matters/holds/addHeldAccounts

matterId <> 
holdId <> 
AddHeldAccountsRequest:
AddHeldAccountsRequest"
  [matterId holdId AddHeldAccountsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}/holds/{holdId}:addHeldAccounts",
     :uri-template-args {"matterId" matterId, "holdId" holdId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body AddHeldAccountsRequest}))

(defn matters-holds-removeHeldAccounts
  "Removes the specified accounts from a hold. Returns a list of statuses in the same order as the request.
https://developers.google.com/vault/v1/reference/rest/v1/matters/holds/removeHeldAccounts

matterId <> 
holdId <> 
RemoveHeldAccountsRequest:
RemoveHeldAccountsRequest"
  [matterId holdId RemoveHeldAccountsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}/holds/{holdId}:removeHeldAccounts",
     :uri-template-args {"matterId" matterId, "holdId" holdId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body RemoveHeldAccountsRequest}))

(defn matters-holds-accounts-create
  "Adds an account to a hold. Accounts can be added only to a hold that does not have an organizational unit set. If you try to add an account to an organizational unit-based hold, an error is returned.
https://developers.google.com/vault/v1/reference/rest/v1/matters/holds/accounts/create

matterId <> 
holdId <> 
HeldAccount:
HeldAccount"
  [matterId holdId HeldAccount]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}/holds/{holdId}/accounts",
     :uri-template-args {"matterId" matterId, "holdId" holdId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body HeldAccount}))

(defn matters-holds-accounts-delete
  "Removes an account from a hold.
https://developers.google.com/vault/v1/reference/rest/v1/matters/holds/accounts/delete

matterId <> 
holdId <> 
accountId <> "
  [matterId holdId accountId]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}/holds/{holdId}/accounts/{accountId}",
     :uri-template-args
     {"matterId" matterId, "holdId" holdId, "accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"]}))

(defn matters-holds-accounts-list
  "Lists the accounts covered by a hold. This can list only individually-specified accounts covered by the hold. If the hold covers an organizational unit, use the [Admin SDK](https://developers.google.com/admin-sdk/). to list the members of the organizational unit on hold.
https://developers.google.com/vault/v1/reference/rest/v1/matters/holds/accounts/list

matterId <> 
holdId <> "
  [matterId holdId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}/holds/{holdId}/accounts",
     :uri-template-args {"matterId" matterId, "holdId" holdId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/ediscovery"
      "https://www.googleapis.com/auth/ediscovery.readonly"]}))

(defn matters-savedQueries-create
  "Creates a saved query.
https://developers.google.com/vault/v1/reference/rest/v1/matters/savedQueries/create

matterId <> 
SavedQuery:
SavedQuery"
  [matterId SavedQuery]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}/savedQueries",
     :uri-template-args {"matterId" matterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"],
     :body SavedQuery}))

(defn matters-savedQueries-delete
  "Deletes the specified saved query.
https://developers.google.com/vault/v1/reference/rest/v1/matters/savedQueries/delete

matterId <> 
savedQueryId <> "
  [matterId savedQueryId]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}/savedQueries/{savedQueryId}",
     :uri-template-args
     {"matterId" matterId, "savedQueryId" savedQueryId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ediscovery"]}))

(defn matters-savedQueries-get
  "Retrieves the specified saved query.
https://developers.google.com/vault/v1/reference/rest/v1/matters/savedQueries/get

matterId <> 
savedQueryId <> "
  [matterId savedQueryId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://vault.googleapis.com/v1/matters/{matterId}/savedQueries/{savedQueryId}",
     :uri-template-args
     {"matterId" matterId, "savedQueryId" savedQueryId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/ediscovery"
      "https://www.googleapis.com/auth/ediscovery.readonly"]}))

(defn matters-savedQueries-list
  "Lists the saved queries in a matter.
https://developers.google.com/vault/v1/reference/rest/v1/matters/savedQueries/list

matterId <> 

optional:
pageSize <integer> The maximum number of saved queries to return."
  ([matterId] (matters-savedQueries-list matterId nil))
  ([matterId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://vault.googleapis.com/v1/matters/{matterId}/savedQueries",
       :uri-template-args {"matterId" matterId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/ediscovery"
        "https://www.googleapis.com/auth/ediscovery.readonly"]})))
