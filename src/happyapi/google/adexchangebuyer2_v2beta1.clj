(ns happyapi.google.adexchangebuyer2-v2beta1
  "Ad Exchange Buyer API II
Accesses the latest features for managing Authorized Buyers accounts, Real-Time Bidding configurations and auction metrics, and Marketplace programmatic deals.
See: https://developers.google.com/authorized-buyers/apis/reference/rest/"
  (:require [happyapi.providers.google :as client]))

(defn accounts-creatives-create
  "Creates a creative.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/creatives/create

accountId <> 
Creative:
Creative

optional:
duplicateIdMode <string> Indicates if multiple creatives can share an ID or not. Default is NO_DUPLICATES (one ID per creative)."
  ([accountId Creative]
    (accounts-creatives-create accountId Creative nil))
  ([accountId Creative optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/creatives",
       :uri-template-args {"accountId" accountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
       :body Creative})))

(defn accounts-creatives-update
  "Updates a creative.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/creatives/update

accountId <> 
creativeId <> 
Creative:
Creative"
  [accountId creativeId Creative]
  (client/api-request
    {:method :put,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/creatives/{creativeId}",
     :uri-template-args
     {"accountId" accountId, "creativeId" creativeId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body Creative}))

(defn accounts-creatives-get
  "Gets a creative.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/creatives/get

accountId <> 
creativeId <> "
  [accountId creativeId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/creatives/{creativeId}",
     :uri-template-args
     {"accountId" accountId, "creativeId" creativeId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]}))

(defn accounts-creatives-list
  "Lists creatives.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/creatives/list

accountId <> 

optional:
pageSize <integer> Requested page size. The server may return fewer creatives than requested (due to timeout constraint) even if more are available through another call. If unspecified, server will pick an appropriate default. Acceptable values are 1 to 1000, inclusive.
query <string> An optional query string to filter creatives. If no filter is specified, all active creatives will be returned. Supported queries are: - accountId=*account_id_string* - creativeId=*creative_id_string* - dealsStatus: {approved, conditionally_approved, disapproved, not_checked} - openAuctionStatus: {approved, conditionally_approved, disapproved, not_checked} - attribute: {a numeric attribute from the list of attributes} - disapprovalReason: {a reason from DisapprovalReason} Example: 'accountId=12345 AND (dealsStatus:disapproved AND disapprovalReason:unacceptable_content) OR attribute:47'"
  ([accountId] (accounts-creatives-list accountId nil))
  ([accountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/creatives",
       :uri-template-args {"accountId" accountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn accounts-creatives-watch
  "Watches a creative. Will result in push notifications being sent to the topic when the creative changes status.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/creatives/watch

accountId <> 
creativeId <> 
WatchCreativeRequest:
WatchCreativeRequest"
  [accountId creativeId WatchCreativeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/creatives/{creativeId}:watch",
     :uri-template-args
     {"accountId" accountId, "creativeId" creativeId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body WatchCreativeRequest}))

(defn accounts-creatives-stopWatching
  "Stops watching a creative. Will stop push notifications being sent to the topics when the creative changes status.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/creatives/stopWatching

accountId <> 
creativeId <> 
StopWatchingCreativeRequest:
StopWatchingCreativeRequest"
  [accountId creativeId StopWatchingCreativeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/creatives/{creativeId}:stopWatching",
     :uri-template-args
     {"accountId" accountId, "creativeId" creativeId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body StopWatchingCreativeRequest}))

(defn accounts-creatives-dealAssociations-add
  "Associate an existing deal with a creative.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/creatives/dealAssociations/add

accountId <> 
creativeId <> 
AddDealAssociationRequest:
AddDealAssociationRequest"
  [accountId creativeId AddDealAssociationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/creatives/{creativeId}/dealAssociations:add",
     :uri-template-args
     {"accountId" accountId, "creativeId" creativeId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body AddDealAssociationRequest}))

(defn accounts-creatives-dealAssociations-remove
  "Remove the association between a deal and a creative.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/creatives/dealAssociations/remove

accountId <> 
creativeId <> 
RemoveDealAssociationRequest:
RemoveDealAssociationRequest"
  [accountId creativeId RemoveDealAssociationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/creatives/{creativeId}/dealAssociations:remove",
     :uri-template-args
     {"accountId" accountId, "creativeId" creativeId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body RemoveDealAssociationRequest}))

(defn accounts-creatives-dealAssociations-list
  "List all creative-deal associations.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/creatives/dealAssociations/list

accountId <> 
creativeId <> 

optional:
pageSize <integer> Requested page size. Server may return fewer associations than requested. If unspecified, server will pick an appropriate default.
query <string> An optional query string to filter deal associations. If no filter is specified, all associations will be returned. Supported queries are: - accountId=*account_id_string* - creativeId=*creative_id_string* - dealsId=*deals_id_string* - dealsStatus:{approved, conditionally_approved, disapproved, not_checked} - openAuctionStatus:{approved, conditionally_approved, disapproved, not_checked} Example: 'dealsId=12345 AND dealsStatus:disapproved'"
  ([accountId creativeId]
    (accounts-creatives-dealAssociations-list
      accountId
      creativeId
      nil))
  ([accountId creativeId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/creatives/{creativeId}/dealAssociations",
       :uri-template-args
       {"accountId" accountId, "creativeId" creativeId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn accounts-clients-get
  "Gets a client buyer with a given client account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/clients/get

accountId <> 
clientAccountId <> "
  [accountId clientAccountId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/clients/{clientAccountId}",
     :uri-template-args
     {"accountId" accountId, "clientAccountId" clientAccountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]}))

(defn accounts-clients-list
  "Lists all the clients for the current sponsor buyer.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/clients/list

accountId <> 

optional:
pageSize <integer> Requested page size. The server may return fewer clients than requested. If unspecified, the server will pick an appropriate default.
partnerClientId <string> Optional unique identifier (from the standpoint of an Ad Exchange sponsor buyer partner) of the client to return. If specified, at most one client will be returned in the response."
  ([accountId] (accounts-clients-list accountId nil))
  ([accountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/clients",
       :uri-template-args {"accountId" accountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn accounts-clients-create
  "Creates a new client buyer.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/clients/create

accountId <> 
Client:
Client"
  [accountId Client]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/clients",
     :uri-template-args {"accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body Client}))

(defn accounts-clients-update
  "Updates an existing client buyer.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/clients/update

accountId <> 
clientAccountId <> 
Client:
Client"
  [accountId clientAccountId Client]
  (client/api-request
    {:method :put,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/clients/{clientAccountId}",
     :uri-template-args
     {"accountId" accountId, "clientAccountId" clientAccountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body Client}))

(defn accounts-clients-users-list
  "Lists all the known client users for a specified sponsor buyer account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/clients/users/list

accountId <> 
clientAccountId <> 

optional:
pageSize <integer> Requested page size. The server may return fewer clients than requested. If unspecified, the server will pick an appropriate default."
  ([accountId clientAccountId]
    (accounts-clients-users-list accountId clientAccountId nil))
  ([accountId clientAccountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/clients/{clientAccountId}/users",
       :uri-template-args
       {"accountId" accountId, "clientAccountId" clientAccountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn accounts-clients-users-update
  "Updates an existing client user. Only the user status can be changed on update.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/clients/users/update

accountId <> 
clientAccountId <> 
userId <> 
ClientUser:
ClientUser"
  [accountId clientAccountId userId ClientUser]
  (client/api-request
    {:method :put,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/clients/{clientAccountId}/users/{userId}",
     :uri-template-args
     {"accountId" accountId,
      "clientAccountId" clientAccountId,
      "userId" userId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body ClientUser}))

(defn accounts-clients-users-get
  "Retrieves an existing client user.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/clients/users/get

accountId <> 
clientAccountId <> 
userId <> "
  [accountId clientAccountId userId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/clients/{clientAccountId}/users/{userId}",
     :uri-template-args
     {"accountId" accountId,
      "clientAccountId" clientAccountId,
      "userId" userId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]}))

(defn accounts-clients-invitations-create
  "Creates and sends out an email invitation to access an Ad Exchange client buyer account.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/clients/invitations/create

accountId <> 
clientAccountId <> 
ClientUserInvitation:
ClientUserInvitation"
  [accountId clientAccountId ClientUserInvitation]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/clients/{clientAccountId}/invitations",
     :uri-template-args
     {"accountId" accountId, "clientAccountId" clientAccountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body ClientUserInvitation}))

(defn accounts-clients-invitations-get
  "Retrieves an existing client user invitation.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/clients/invitations/get

accountId <> 
clientAccountId <> 
invitationId <> "
  [accountId clientAccountId invitationId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/clients/{clientAccountId}/invitations/{invitationId}",
     :uri-template-args
     {"accountId" accountId,
      "clientAccountId" clientAccountId,
      "invitationId" invitationId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]}))

(defn accounts-clients-invitations-list
  "Lists all the client users invitations for a client with a given account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/clients/invitations/list

accountId <> 
clientAccountId <> 

optional:
pageSize <integer> Requested page size. Server may return fewer clients than requested. If unspecified, server will pick an appropriate default."
  ([accountId clientAccountId]
    (accounts-clients-invitations-list accountId clientAccountId nil))
  ([accountId clientAccountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/clients/{clientAccountId}/invitations",
       :uri-template-args
       {"accountId" accountId, "clientAccountId" clientAccountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn accounts-proposals-list
  "List proposals. A filter expression (PQL query) may be specified to filter the results. To retrieve all finalized proposals, regardless if a proposal is being renegotiated, see the FinalizedProposals resource. Note that Bidder/ChildSeat relationships differ from the usual behavior. A Bidder account can only see its child seats' proposals by specifying the ChildSeat's accountId in the request path.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/proposals/list

accountId <> 

optional:
filter <string> An optional PQL filter query used to query for proposals. Nested repeated fields, such as proposal.deals.targetingCriterion, cannot be filtered.
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
filterSyntax <string> Syntax the filter is written in. Current implementation defaults to PQL but in the future it will be LIST_FILTER."
  ([accountId] (accounts-proposals-list accountId nil))
  ([accountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/proposals",
       :uri-template-args {"accountId" accountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn accounts-proposals-cancelNegotiation
  "Cancel an ongoing negotiation on a proposal. This does not cancel or end serving for the deals if the proposal has been finalized, but only cancels a negotiation unilaterally.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/proposals/cancelNegotiation

accountId <> 
proposalId <> 
CancelNegotiationRequest:
CancelNegotiationRequest"
  [accountId proposalId CancelNegotiationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/proposals/{proposalId}:cancelNegotiation",
     :uri-template-args
     {"accountId" accountId, "proposalId" proposalId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body CancelNegotiationRequest}))

(defn accounts-proposals-completeSetup
  "You can opt-in to manually update proposals to indicate that setup is complete. By default, proposal setup is automatically completed after their deals are finalized. Contact your Technical Account Manager to opt in. Buyers can call this method when the proposal has been finalized, and all the required creatives have been uploaded using the Creatives API. This call updates the `is_setup_completed` field on the deals in the proposal, and notifies the seller. The server then advances the revision number of the most recent proposal. To mark an individual deal as ready to serve, call `buyers.finalizedDeals.setReadyToServe` in the Marketplace API.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/proposals/completeSetup

accountId <> 
proposalId <> 
CompleteSetupRequest:
CompleteSetupRequest"
  [accountId proposalId CompleteSetupRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/proposals/{proposalId}:completeSetup",
     :uri-template-args
     {"accountId" accountId, "proposalId" proposalId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body CompleteSetupRequest}))

(defn accounts-proposals-update
  "Update the given proposal at the client known revision number. If the server revision has advanced since the passed-in `proposal.proposal_revision`, an `ABORTED` error message will be returned. Only the buyer-modifiable fields of the proposal will be updated. Note that the deals in the proposal will be updated to match the passed-in copy. If a passed-in deal does not have a `deal_id`, the server will assign a new unique ID and create the deal. If passed-in deal has a `deal_id`, it will be updated to match the passed-in copy. Any existing deals not present in the passed-in proposal will be deleted. It is an error to pass in a deal with a `deal_id` not present at head.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/proposals/update

accountId <> 
proposalId <> 
Proposal:
Proposal"
  [accountId proposalId Proposal]
  (client/api-request
    {:method :put,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/proposals/{proposalId}",
     :uri-template-args
     {"accountId" accountId, "proposalId" proposalId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body Proposal}))

(defn accounts-proposals-accept
  "Mark the proposal as accepted at the given revision number. If the number does not match the server's revision number an `ABORTED` error message will be returned. This call updates the proposal_state from `PROPOSED` to `BUYER_ACCEPTED`, or from `SELLER_ACCEPTED` to `FINALIZED`. Upon calling this endpoint, the buyer implicitly agrees to the terms and conditions optionally set within the proposal by the publisher.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/proposals/accept

accountId <> 
proposalId <> 
AcceptProposalRequest:
AcceptProposalRequest"
  [accountId proposalId AcceptProposalRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/proposals/{proposalId}:accept",
     :uri-template-args
     {"accountId" accountId, "proposalId" proposalId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body AcceptProposalRequest}))

(defn accounts-proposals-pause
  "Update the given proposal to pause serving. This method will set the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to true for all deals in the proposal. It is a no-op to pause an already-paused proposal. It is an error to call PauseProposal for a proposal that is not finalized or renegotiating.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/proposals/pause

accountId <> 
proposalId <> 
PauseProposalRequest:
PauseProposalRequest"
  [accountId proposalId PauseProposalRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/proposals/{proposalId}:pause",
     :uri-template-args
     {"accountId" accountId, "proposalId" proposalId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body PauseProposalRequest}))

(defn accounts-proposals-create
  "Create the given proposal. Each created proposal and any deals it contains are assigned a unique ID by the server.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/proposals/create

accountId <> 
Proposal:
Proposal"
  [accountId Proposal]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/proposals",
     :uri-template-args {"accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body Proposal}))

(defn accounts-proposals-get
  "Gets a proposal given its ID. The proposal is returned at its head revision.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/proposals/get

accountId <> 
proposalId <> "
  [accountId proposalId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/proposals/{proposalId}",
     :uri-template-args
     {"accountId" accountId, "proposalId" proposalId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]}))

(defn accounts-proposals-addNote
  "Create a new note and attach it to the proposal. The note is assigned a unique ID by the server. The proposal revision number will not increase when associated with a new note.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/proposals/addNote

accountId <> 
proposalId <> 
AddNoteRequest:
AddNoteRequest"
  [accountId proposalId AddNoteRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/proposals/{proposalId}:addNote",
     :uri-template-args
     {"accountId" accountId, "proposalId" proposalId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body AddNoteRequest}))

(defn accounts-proposals-resume
  "Update the given proposal to resume serving. This method will set the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to false for all deals in the proposal. Note that if the `has_seller_paused` bit is also set, serving will not resume until the seller also resumes. It is a no-op to resume an already-running proposal. It is an error to call ResumeProposal for a proposal that is not finalized or renegotiating.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/proposals/resume

accountId <> 
proposalId <> 
ResumeProposalRequest:
ResumeProposalRequest"
  [accountId proposalId ResumeProposalRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/proposals/{proposalId}:resume",
     :uri-template-args
     {"accountId" accountId, "proposalId" proposalId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body ResumeProposalRequest}))

(defn accounts-finalizedProposals-list
  "List finalized proposals, regardless if a proposal is being renegotiated. A filter expression (PQL query) may be specified to filter the results. The notes will not be returned.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/finalizedProposals/list

accountId <> 

optional:
filter <string> An optional PQL filter query used to query for proposals. Nested repeated fields, such as proposal.deals.targetingCriterion, cannot be filtered.
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
filterSyntax <string> Syntax the filter is written in. Current implementation defaults to PQL but in the future it will be LIST_FILTER."
  ([accountId] (accounts-finalizedProposals-list accountId nil))
  ([accountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/finalizedProposals",
       :uri-template-args {"accountId" accountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn accounts-finalizedProposals-pause
  "Update given deals to pause serving. This method will set the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to true for all listed deals in the request. Currently, this method only applies to PG and PD deals. For PA deals, call accounts.proposals.pause endpoint. It is a no-op to pause already-paused deals. It is an error to call PauseProposalDeals for deals which are not part of the proposal of proposal_id or which are not finalized or renegotiating.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/finalizedProposals/pause

accountId <> 
proposalId <> 
PauseProposalDealsRequest:
PauseProposalDealsRequest"
  [accountId proposalId PauseProposalDealsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/finalizedProposals/{proposalId}:pause",
     :uri-template-args
     {"accountId" accountId, "proposalId" proposalId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body PauseProposalDealsRequest}))

(defn accounts-finalizedProposals-resume
  "Update given deals to resume serving. This method will set the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to false for all listed deals in the request. Currently, this method only applies to PG and PD deals. For PA deals, call accounts.proposals.resume endpoint. It is a no-op to resume running deals or deals paused by the other party. It is an error to call ResumeProposalDeals for deals which are not part of the proposal of proposal_id or which are not finalized or renegotiating.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/finalizedProposals/resume

accountId <> 
proposalId <> 
ResumeProposalDealsRequest:
ResumeProposalDealsRequest"
  [accountId proposalId ResumeProposalDealsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/finalizedProposals/{proposalId}:resume",
     :uri-template-args
     {"accountId" accountId, "proposalId" proposalId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
     :body ResumeProposalDealsRequest}))

(defn accounts-products-get
  "Gets the requested product by ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/products/get

accountId <> 
productId <> "
  [accountId productId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/products/{productId}",
     :uri-template-args {"accountId" accountId, "productId" productId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]}))

(defn accounts-products-list
  "List all products visible to the buyer (optionally filtered by the specified PQL query).
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/products/list

accountId <> 

optional:
filter <string> An optional PQL query used to query for products. See https://developers.google.com/ad-manager/docs/pqlreference for documentation about PQL and examples. Nested repeated fields, such as product.targetingCriterion.inclusions, cannot be filtered.
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([accountId] (accounts-products-list accountId nil))
  ([accountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/products",
       :uri-template-args {"accountId" accountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn accounts-publisherProfiles-get
  "Gets the requested publisher profile by id.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/publisherProfiles/get

accountId <> 
publisherProfileId <> "
  [accountId publisherProfileId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/publisherProfiles/{publisherProfileId}",
     :uri-template-args
     {"accountId" accountId, "publisherProfileId" publisherProfileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]}))

(defn accounts-publisherProfiles-list
  "List all publisher profiles visible to the buyer
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/accounts/publisherProfiles/list

accountId <> 

optional:
pageSize <integer> Specify the number of results to include per page."
  ([accountId] (accounts-publisherProfiles-list accountId nil))
  ([accountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/accounts/{accountId}/publisherProfiles",
       :uri-template-args {"accountId" accountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-accounts-filterSets-create
  "Creates the specified filter set for the account with the given account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/accounts/filterSets/create

ownerName <> 
FilterSet:
FilterSet

optional:
isTransient <boolean> Whether the filter set is transient, or should be persisted indefinitely. By default, filter sets are not transient. If transient, it will be available for at least 1 hour after creation."
  ([ownerName FilterSet]
    (bidders-accounts-filterSets-create ownerName FilterSet nil))
  ([ownerName FilterSet optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+ownerName}/filterSets",
       :uri-template-args {"ownerName" ownerName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
       :body FilterSet})))

(defn bidders-accounts-filterSets-get
  "Retrieves the requested filter set for the account with the given account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/accounts/filterSets/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]}))

(defn bidders-accounts-filterSets-list
  "Lists all filter sets for the account with the given account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/accounts/filterSets/list

ownerName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([ownerName] (bidders-accounts-filterSets-list ownerName nil))
  ([ownerName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+ownerName}/filterSets",
       :uri-template-args {"ownerName" ownerName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-accounts-filterSets-delete
  "Deletes the requested filter set from the account with the given account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/accounts/filterSets/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]}))

(defn bidders-accounts-filterSets-impressionMetrics-list
  "Lists all metrics that are measured in terms of number of impressions.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/accounts/filterSets/impressionMetrics/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-accounts-filterSets-impressionMetrics-list
      filterSetName
      nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/impressionMetrics",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-accounts-filterSets-bidMetrics-list
  "Lists all metrics that are measured in terms of number of bids.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/accounts/filterSets/bidMetrics/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-accounts-filterSets-bidMetrics-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/bidMetrics",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-accounts-filterSets-filteredBidRequests-list
  "List all reasons that caused a bid request not to be sent for an impression, with the number of bid requests not sent for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/accounts/filterSets/filteredBidRequests/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-accounts-filterSets-filteredBidRequests-list
      filterSetName
      nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/filteredBidRequests",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-accounts-filterSets-bidResponseErrors-list
  "List all errors that occurred in bid responses, with the number of bid responses affected for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/accounts/filterSets/bidResponseErrors/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-accounts-filterSets-bidResponseErrors-list
      filterSetName
      nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/bidResponseErrors",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-accounts-filterSets-bidResponsesWithoutBids-list
  "List all reasons for which bid responses were considered to have no applicable bids, with the number of bid responses affected for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/accounts/filterSets/bidResponsesWithoutBids/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-accounts-filterSets-bidResponsesWithoutBids-list
      filterSetName
      nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/bidResponsesWithoutBids",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-accounts-filterSets-filteredBids-list
  "List all reasons for which bids were filtered, with the number of bids filtered for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/accounts/filterSets/filteredBids/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-accounts-filterSets-filteredBids-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/filteredBids",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-accounts-filterSets-filteredBids-details-list
  "List all details associated with a specific reason for which bids were filtered, with the number of bids filtered for each detail.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/accounts/filterSets/filteredBids/details/list

filterSetName <> 
creativeStatusId <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName creativeStatusId]
    (bidders-accounts-filterSets-filteredBids-details-list
      filterSetName
      creativeStatusId
      nil))
  ([filterSetName creativeStatusId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/filteredBids/{creativeStatusId}/details",
       :uri-template-args
       {"filterSetName" filterSetName,
        "creativeStatusId" creativeStatusId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-accounts-filterSets-filteredBids-creatives-list
  "List all creatives associated with a specific reason for which bids were filtered, with the number of bids filtered for each creative.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/accounts/filterSets/filteredBids/creatives/list

filterSetName <> 
creativeStatusId <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName creativeStatusId]
    (bidders-accounts-filterSets-filteredBids-creatives-list
      filterSetName
      creativeStatusId
      nil))
  ([filterSetName creativeStatusId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/filteredBids/{creativeStatusId}/creatives",
       :uri-template-args
       {"filterSetName" filterSetName,
        "creativeStatusId" creativeStatusId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-accounts-filterSets-losingBids-list
  "List all reasons for which bids lost in the auction, with the number of bids that lost for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/accounts/filterSets/losingBids/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-accounts-filterSets-losingBids-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/losingBids",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-accounts-filterSets-nonBillableWinningBids-list
  "List all reasons for which winning bids were not billable, with the number of bids not billed for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/accounts/filterSets/nonBillableWinningBids/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-accounts-filterSets-nonBillableWinningBids-list
      filterSetName
      nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/nonBillableWinningBids",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-filterSets-create
  "Creates the specified filter set for the account with the given account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/filterSets/create

ownerName <> 
FilterSet:
FilterSet

optional:
isTransient <boolean> Whether the filter set is transient, or should be persisted indefinitely. By default, filter sets are not transient. If transient, it will be available for at least 1 hour after creation."
  ([ownerName FilterSet]
    (bidders-filterSets-create ownerName FilterSet nil))
  ([ownerName FilterSet optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+ownerName}/filterSets",
       :uri-template-args {"ownerName" ownerName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
       :body FilterSet})))

(defn bidders-filterSets-get
  "Retrieves the requested filter set for the account with the given account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/filterSets/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]}))

(defn bidders-filterSets-list
  "Lists all filter sets for the account with the given account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/filterSets/list

ownerName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([ownerName] (bidders-filterSets-list ownerName nil))
  ([ownerName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+ownerName}/filterSets",
       :uri-template-args {"ownerName" ownerName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-filterSets-delete
  "Deletes the requested filter set from the account with the given account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/filterSets/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]}))

(defn bidders-filterSets-impressionMetrics-list
  "Lists all metrics that are measured in terms of number of impressions.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/filterSets/impressionMetrics/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-filterSets-impressionMetrics-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/impressionMetrics",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-filterSets-bidMetrics-list
  "Lists all metrics that are measured in terms of number of bids.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/filterSets/bidMetrics/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-filterSets-bidMetrics-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/bidMetrics",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-filterSets-filteredBidRequests-list
  "List all reasons that caused a bid request not to be sent for an impression, with the number of bid requests not sent for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/filterSets/filteredBidRequests/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-filterSets-filteredBidRequests-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/filteredBidRequests",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-filterSets-bidResponseErrors-list
  "List all errors that occurred in bid responses, with the number of bid responses affected for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/filterSets/bidResponseErrors/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-filterSets-bidResponseErrors-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/bidResponseErrors",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-filterSets-bidResponsesWithoutBids-list
  "List all reasons for which bid responses were considered to have no applicable bids, with the number of bid responses affected for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/filterSets/bidResponsesWithoutBids/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-filterSets-bidResponsesWithoutBids-list
      filterSetName
      nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/bidResponsesWithoutBids",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-filterSets-filteredBids-list
  "List all reasons for which bids were filtered, with the number of bids filtered for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/filterSets/filteredBids/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-filterSets-filteredBids-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/filteredBids",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-filterSets-filteredBids-details-list
  "List all details associated with a specific reason for which bids were filtered, with the number of bids filtered for each detail.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/filterSets/filteredBids/details/list

filterSetName <> 
creativeStatusId <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName creativeStatusId]
    (bidders-filterSets-filteredBids-details-list
      filterSetName
      creativeStatusId
      nil))
  ([filterSetName creativeStatusId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/filteredBids/{creativeStatusId}/details",
       :uri-template-args
       {"filterSetName" filterSetName,
        "creativeStatusId" creativeStatusId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-filterSets-filteredBids-creatives-list
  "List all creatives associated with a specific reason for which bids were filtered, with the number of bids filtered for each creative.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/filterSets/filteredBids/creatives/list

filterSetName <> 
creativeStatusId <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName creativeStatusId]
    (bidders-filterSets-filteredBids-creatives-list
      filterSetName
      creativeStatusId
      nil))
  ([filterSetName creativeStatusId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/filteredBids/{creativeStatusId}/creatives",
       :uri-template-args
       {"filterSetName" filterSetName,
        "creativeStatusId" creativeStatusId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-filterSets-losingBids-list
  "List all reasons for which bids lost in the auction, with the number of bids that lost for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/filterSets/losingBids/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-filterSets-losingBids-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/losingBids",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn bidders-filterSets-nonBillableWinningBids-list
  "List all reasons for which winning bids were not billable, with the number of bids not billed for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/bidders/filterSets/nonBillableWinningBids/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (bidders-filterSets-nonBillableWinningBids-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/nonBillableWinningBids",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn buyers-filterSets-create
  "Creates the specified filter set for the account with the given account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/buyers/filterSets/create

ownerName <> 
FilterSet:
FilterSet

optional:
isTransient <boolean> Whether the filter set is transient, or should be persisted indefinitely. By default, filter sets are not transient. If transient, it will be available for at least 1 hour after creation."
  ([ownerName FilterSet]
    (buyers-filterSets-create ownerName FilterSet nil))
  ([ownerName FilterSet optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+ownerName}/filterSets",
       :uri-template-args {"ownerName" ownerName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"],
       :body FilterSet})))

(defn buyers-filterSets-get
  "Retrieves the requested filter set for the account with the given account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/buyers/filterSets/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]}))

(defn buyers-filterSets-list
  "Lists all filter sets for the account with the given account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/buyers/filterSets/list

ownerName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([ownerName] (buyers-filterSets-list ownerName nil))
  ([ownerName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+ownerName}/filterSets",
       :uri-template-args {"ownerName" ownerName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn buyers-filterSets-delete
  "Deletes the requested filter set from the account with the given account ID.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/buyers/filterSets/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://adexchangebuyer.googleapis.com/v2beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]}))

(defn buyers-filterSets-impressionMetrics-list
  "Lists all metrics that are measured in terms of number of impressions.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/buyers/filterSets/impressionMetrics/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (buyers-filterSets-impressionMetrics-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/impressionMetrics",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn buyers-filterSets-bidMetrics-list
  "Lists all metrics that are measured in terms of number of bids.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/buyers/filterSets/bidMetrics/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (buyers-filterSets-bidMetrics-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/bidMetrics",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn buyers-filterSets-filteredBidRequests-list
  "List all reasons that caused a bid request not to be sent for an impression, with the number of bid requests not sent for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/buyers/filterSets/filteredBidRequests/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (buyers-filterSets-filteredBidRequests-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/filteredBidRequests",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn buyers-filterSets-bidResponseErrors-list
  "List all errors that occurred in bid responses, with the number of bid responses affected for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/buyers/filterSets/bidResponseErrors/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (buyers-filterSets-bidResponseErrors-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/bidResponseErrors",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn buyers-filterSets-bidResponsesWithoutBids-list
  "List all reasons for which bid responses were considered to have no applicable bids, with the number of bid responses affected for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/buyers/filterSets/bidResponsesWithoutBids/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (buyers-filterSets-bidResponsesWithoutBids-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/bidResponsesWithoutBids",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn buyers-filterSets-filteredBids-list
  "List all reasons for which bids were filtered, with the number of bids filtered for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/buyers/filterSets/filteredBids/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (buyers-filterSets-filteredBids-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/filteredBids",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn buyers-filterSets-filteredBids-details-list
  "List all details associated with a specific reason for which bids were filtered, with the number of bids filtered for each detail.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/buyers/filterSets/filteredBids/details/list

filterSetName <> 
creativeStatusId <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName creativeStatusId]
    (buyers-filterSets-filteredBids-details-list
      filterSetName
      creativeStatusId
      nil))
  ([filterSetName creativeStatusId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/filteredBids/{creativeStatusId}/details",
       :uri-template-args
       {"filterSetName" filterSetName,
        "creativeStatusId" creativeStatusId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn buyers-filterSets-filteredBids-creatives-list
  "List all creatives associated with a specific reason for which bids were filtered, with the number of bids filtered for each creative.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/buyers/filterSets/filteredBids/creatives/list

filterSetName <> 
creativeStatusId <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName creativeStatusId]
    (buyers-filterSets-filteredBids-creatives-list
      filterSetName
      creativeStatusId
      nil))
  ([filterSetName creativeStatusId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/filteredBids/{creativeStatusId}/creatives",
       :uri-template-args
       {"filterSetName" filterSetName,
        "creativeStatusId" creativeStatusId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn buyers-filterSets-losingBids-list
  "List all reasons for which bids lost in the auction, with the number of bids that lost for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/buyers/filterSets/losingBids/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (buyers-filterSets-losingBids-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/losingBids",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))

(defn buyers-filterSets-nonBillableWinningBids-list
  "List all reasons for which winning bids were not billable, with the number of bids not billed for each reason.
https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/reference/rest/v2beta1/buyers/filterSets/nonBillableWinningBids/list

filterSetName <> 

optional:
pageSize <integer> Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default."
  ([filterSetName]
    (buyers-filterSets-nonBillableWinningBids-list filterSetName nil))
  ([filterSetName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://adexchangebuyer.googleapis.com/v2beta1/{+filterSetName}/nonBillableWinningBids",
       :uri-template-args {"filterSetName" filterSetName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/adexchange.buyer"]})))
