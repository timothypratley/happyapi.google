(ns happyapi.google.dfareporting-v4
  "Campaign Manager 360 API
Build applications to efficiently manage large or complex trafficking, reporting, and attribution workflows for Campaign Manager 360.
See: https://developers.google.com/doubleclick-advertisers/"
  (:require [happyapi.providers.google :as client]))

(defn advertiserGroups-delete
  "Deletes an existing advertiser group.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertiserGroups/delete

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertiserGroups/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn advertiserGroups-get
  "Gets one advertiser group by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertiserGroups/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertiserGroups/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn advertiserGroups-insert
  "Inserts a new advertiser group.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertiserGroups/insert

profileId <> 
AdvertiserGroup:
AdvertiserGroup"
  [profileId AdvertiserGroup]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertiserGroups",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body AdvertiserGroup}))

(defn advertiserGroups-list
  "Retrieves a list of advertiser groups, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertiserGroups/list

profileId <> 

optional:
maxResults <integer> Maximum number of results to return.
ids <string> Select only advertiser groups with these IDs.
searchString <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"advertiser*2015\" will return objects with names like \"advertiser group June 2015\", \"advertiser group April 2015\", or simply \"advertiser group 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"advertisergroup\" will match objects with name \"my advertisergroup\", \"advertisergroup 2015\", or simply \"advertisergroup\".
sortField <string> Field by which to sort the list.
sortOrder <string> Order of sorted results."
  ([profileId] (advertiserGroups-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertiserGroups",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn advertiserGroups-update
  "Updates an existing advertiser group.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertiserGroups/update

profileId <> 
AdvertiserGroup:
AdvertiserGroup"
  [profileId AdvertiserGroup]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertiserGroups",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body AdvertiserGroup}))

(defn advertiserGroups-patch
  "Updates an existing advertiser group. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertiserGroups/patch

profileId <> 
id <> 
AdvertiserGroup:
AdvertiserGroup"
  [profileId id AdvertiserGroup]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertiserGroups",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body AdvertiserGroup}))

(defn campaignCreativeAssociations-insert
  "Associates a creative with the specified campaign. This method creates a default ad with dimensions matching the creative in the campaign if such a default ad does not exist already.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/campaignCreativeAssociations/insert

profileId <> 
campaignId <> 
CampaignCreativeAssociation:
CampaignCreativeAssociation"
  [profileId campaignId CampaignCreativeAssociation]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/campaigns/{+campaignId}/campaignCreativeAssociations",
     :uri-template-args
     {"profileId" profileId, "campaignId" campaignId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body CampaignCreativeAssociation}))

(defn campaignCreativeAssociations-list
  "Retrieves the list of creative IDs associated with the specified campaign. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/campaignCreativeAssociations/list

profileId <> 
campaignId <> 

optional:
maxResults <integer> Maximum number of results to return.
sortOrder <string> Order of sorted results."
  ([profileId campaignId]
    (campaignCreativeAssociations-list profileId campaignId nil))
  ([profileId campaignId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/campaigns/{+campaignId}/campaignCreativeAssociations",
       :uri-template-args
       {"profileId" profileId, "campaignId" campaignId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn advertisers-get
  "Gets one advertiser by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertisers/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertisers/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn advertisers-insert
  "Inserts a new advertiser.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertisers/insert

profileId <> 
Advertiser:
Advertiser"
  [profileId Advertiser]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertisers",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Advertiser}))

(defn advertisers-list
  "Retrieves a list of advertisers, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertisers/list

profileId <> 

optional:
searchString <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"advertiser*2015\" will return objects with names like \"advertiser June 2015\", \"advertiser April 2015\", or simply \"advertiser 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"advertiser\" will match objects with name \"my advertiser\", \"advertiser 2015\", or simply \"advertiser\" .
subaccountId <string> Select only advertisers with these subaccount IDs.
floodlightConfigurationIds <string> Select only advertisers with these floodlight configuration IDs.
maxResults <integer> Maximum number of results to return.
onlyParent <boolean> Select only advertisers which use another advertiser's floodlight configuration.
ids <string> Select only advertisers with these IDs.
advertiserGroupIds <string> Select only advertisers with these advertiser group IDs.
status <string> Select only advertisers with the specified status.
sortOrder <string> Order of sorted results.
sortField <string> Field by which to sort the list.
includeAdvertisersWithoutGroupsOnly <boolean> Select only advertisers which do not belong to any advertiser group."
  ([profileId] (advertisers-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertisers",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn advertisers-update
  "Updates an existing advertiser.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertisers/update

profileId <> 
Advertiser:
Advertiser"
  [profileId Advertiser]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertisers",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Advertiser}))

(defn advertisers-patch
  "Updates an existing advertiser. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertisers/patch

profileId <> 
id <> 
Advertiser:
Advertiser"
  [profileId id Advertiser]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertisers",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Advertiser}))

(defn targetableRemarketingLists-get
  "Gets one remarketing list by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/targetableRemarketingLists/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/targetableRemarketingLists/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn targetableRemarketingLists-list
  "Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/targetableRemarketingLists/list

profileId <> 
advertiserId <> 

optional:
active <boolean> Select only active or only inactive targetable remarketing lists.
maxResults <integer> Maximum number of results to return.
name <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"remarketing list*2015\" will return objects with names like \"remarketing list June 2015\", \"remarketing list April 2015\", or simply \"remarketing list 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"remarketing list\" will match objects with name \"my remarketing list\", \"remarketing list 2015\", or simply \"remarketing list\".
sortField <string> Field by which to sort the list.
sortOrder <string> Order of sorted results."
  ([profileId advertiserId]
    (targetableRemarketingLists-list profileId advertiserId nil))
  ([profileId advertiserId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/targetableRemarketingLists",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {"advertiserId" advertiserId} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn creatives-get
  "Gets one creative by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creatives/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creatives/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn creatives-insert
  "Inserts a new creative.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creatives/insert

profileId <> 
Creative:
Creative"
  [profileId Creative]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creatives",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Creative}))

(defn creatives-list
  "Retrieves a list of creatives, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creatives/list

profileId <> 

optional:
campaignId <string> Select only creatives with this campaign ID.
advertiserId <string> Select only creatives with this advertiser ID.
searchString <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"creative*2015\" will return objects with names like \"creative June 2015\", \"creative April 2015\", or simply \"creative 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"creative\" will match objects with name \"my creative\", \"creative 2015\", or simply \"creative\".
creativeFieldIds <string> Select only creatives with these creative field IDs.
studioCreativeId <string> Select only creatives corresponding to this Studio creative ID.
types <string> Select only creatives with these creative types.
maxResults <integer> Maximum number of results to return.
ids <string> Select only creatives with these IDs.
archived <boolean> Select only archived creatives. Leave blank to select archived and unarchived creatives.
sizeIds <string> Select only creatives with these size IDs.
companionCreativeIds <string> Select only in-stream video creatives with these companion IDs.
sortOrder <string> Order of sorted results.
renderingIds <string> Select only creatives with these rendering IDs.
active <boolean> Select only active creatives. Leave blank to select active and inactive creatives.
sortField <string> Field by which to sort the list."
  ([profileId] (creatives-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creatives",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn creatives-update
  "Updates an existing creative.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creatives/update

profileId <> 
Creative:
Creative"
  [profileId Creative]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creatives",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Creative}))

(defn creatives-patch
  "Updates an existing creative. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creatives/patch

profileId <> 
id <> 
Creative:
Creative"
  [profileId id Creative]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creatives",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Creative}))

(defn placements-patch
  "Updates an existing placement. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placements/patch

profileId <> 
id <> 
Placement:
Placement"
  [profileId id Placement]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placements",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Placement}))

(defn placements-generatetags
  "Generates tags for a placement.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placements/generatetags

profileId <> 

optional:
placementIds <string> Generate tags for these placements.
campaignId <string> Generate placements belonging to this campaign. This is a required field.
tagFormats <string> Tag formats to generate for these placements. *Note:* PLACEMENT_TAG_STANDARD can only be generated for 1x1 placements."
  ([profileId] (placements-generatetags profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placements/generatetags",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn placements-get
  "Gets one placement by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placements/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placements/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn placements-insert
  "Inserts a new placement.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placements/insert

profileId <> 
Placement:
Placement"
  [profileId Placement]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placements",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Placement}))

(defn placements-list
  "Retrieves a list of placements, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placements/list

profileId <> 

optional:
advertiserIds <string> Select only placements that belong to these advertisers.
paymentSource <string> Select only placements with this payment source.
compatibilities <string> Select only placements that are associated with these compatibilities. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on mobile devices for regular or interstitial ads respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with the VAST standard.
searchString <string> Allows searching for placements by name or ID. Wildcards (*) are allowed. For example, \"placement*2015\" will return placements with names like \"placement June 2015\", \"placement May 2015\", or simply \"placements 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"placement\" will match placements with name \"my placement\", \"placement 2015\", or simply \"placement\" .
placementStrategyIds <string> Select only placements that are associated with these placement strategies.
directorySiteIds <string> Select only placements that are associated with these directory sites.
maxStartDate <string> Select only placements or placement groups whose start date is on or before the specified maxStartDate. The date should be formatted as \"yyyy-MM-dd\".
contentCategoryIds <string> Select only placements that are associated with these content categories.
minStartDate <string> Select only placements or placement groups whose start date is on or after the specified minStartDate. The date should be formatted as \"yyyy-MM-dd\".
pricingTypes <string> Select only placements with these pricing types.
maxResults <integer> Maximum number of results to return.
ids <string> Select only placements with these IDs.
campaignIds <string> Select only placements that belong to these campaigns.
sizeIds <string> Select only placements that are associated with these sizes.
groupIds <string> Select only placements that belong to these placement groups.
siteIds <string> Select only placements that are associated with these sites.
maxEndDate <string> Select only placements or placement groups whose end date is on or before the specified maxEndDate. The date should be formatted as \"yyyy-MM-dd\".
sortOrder <string> Order of sorted results.
activeStatus <string> Select only placements with these active statuses.
sortField <string> Field by which to sort the list.
minEndDate <string> Select only placements or placement groups whose end date is on or after the specified minEndDate. The date should be formatted as \"yyyy-MM-dd\"."
  ([profileId] (placements-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placements",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn placements-update
  "Updates an existing placement.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placements/update

profileId <> 
Placement:
Placement"
  [profileId Placement]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placements",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Placement}))

(defn accountActiveAdSummaries-get
  "Gets the account's active ad summary by account ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/accountActiveAdSummaries/get

profileId <> 
summaryAccountId <> "
  [profileId summaryAccountId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/accountActiveAdSummaries/{+summaryAccountId}",
     :uri-template-args
     {"profileId" profileId, "summaryAccountId" summaryAccountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn contentCategories-delete
  "Deletes an existing content category.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/contentCategories/delete

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/contentCategories/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn contentCategories-get
  "Gets one content category by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/contentCategories/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/contentCategories/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn contentCategories-insert
  "Inserts a new content category.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/contentCategories/insert

profileId <> 
ContentCategory:
ContentCategory"
  [profileId ContentCategory]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/contentCategories",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body ContentCategory}))

(defn contentCategories-list
  "Retrieves a list of content categories, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/contentCategories/list

profileId <> 

optional:
ids <string> Select only content categories with these IDs.
maxResults <integer> Maximum number of results to return.
searchString <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"contentcategory*2015\" will return objects with names like \"contentcategory June 2015\", \"contentcategory April 2015\", or simply \"contentcategory 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"contentcategory\" will match objects with name \"my contentcategory\", \"contentcategory 2015\", or simply \"contentcategory\".
sortField <string> Field by which to sort the list.
sortOrder <string> Order of sorted results."
  ([profileId] (contentCategories-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/contentCategories",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn contentCategories-update
  "Updates an existing content category.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/contentCategories/update

profileId <> 
ContentCategory:
ContentCategory"
  [profileId ContentCategory]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/contentCategories",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body ContentCategory}))

(defn contentCategories-patch
  "Updates an existing content category. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/contentCategories/patch

profileId <> 
id <> 
ContentCategory:
ContentCategory"
  [profileId id ContentCategory]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/contentCategories",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body ContentCategory}))

(defn operatingSystemVersions-get
  "Gets one operating system version by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/operatingSystemVersions/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/operatingSystemVersions/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn operatingSystemVersions-list
  "Retrieves a list of operating system versions.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/operatingSystemVersions/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/operatingSystemVersions",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn sites-patch
  "Updates an existing site. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/sites/patch

profileId <> 
id <> 
Site:
Site"
  [profileId id Site]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/sites",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Site}))

(defn sites-get
  "Gets one site by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/sites/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/sites/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn sites-insert
  "Inserts a new site.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/sites/insert

profileId <> 
Site:
Site"
  [profileId Site]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/sites",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Site}))

(defn sites-list
  "Retrieves a list of sites, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/sites/list

profileId <> 

optional:
acceptsPublisherPaidPlacements <boolean> Select only sites that accept publisher paid placements.
searchString <string> Allows searching for objects by name, ID or keyName. Wildcards (*) are allowed. For example, \"site*2015\" will return objects with names like \"site June 2015\", \"site April 2015\", or simply \"site 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"site\" will match objects with name \"my site\", \"site 2015\", or simply \"site\".
subaccountId <string> Select only sites with this subaccount ID.
directorySiteIds <string> Select only sites with these directory site IDs.
approved <boolean> Select only approved sites.
acceptsInStreamVideoPlacements <boolean> This search filter is no longer supported and will have no effect on the results returned.
acceptsInterstitialPlacements <boolean> This search filter is no longer supported and will have no effect on the results returned.
maxResults <integer> Maximum number of results to return.
adWordsSite <boolean> Select only AdWords sites.
ids <string> Select only sites with these IDs.
campaignIds <string> Select only sites with these campaign IDs.
unmappedSite <boolean> Select only sites that have not been mapped to a directory site.
sortOrder <string> Order of sorted results.
sortField <string> Field by which to sort the list."
  ([profileId] (sites-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/sites",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn sites-update
  "Updates an existing site.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/sites/update

profileId <> 
Site:
Site"
  [profileId Site]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/sites",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Site}))

(defn remarketingListShares-patch
  "Updates an existing remarketing list share. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/remarketingListShares/patch

profileId <> 
id <> 
RemarketingListShare:
RemarketingListShare"
  [profileId id RemarketingListShare]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/remarketingListShares",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body RemarketingListShare}))

(defn remarketingListShares-get
  "Gets one remarketing list share by remarketing list ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/remarketingListShares/get

profileId <> 
remarketingListId <> "
  [profileId remarketingListId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/remarketingListShares/{+remarketingListId}",
     :uri-template-args
     {"profileId" profileId, "remarketingListId" remarketingListId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn remarketingListShares-update
  "Updates an existing remarketing list share.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/remarketingListShares/update

profileId <> 
RemarketingListShare:
RemarketingListShare"
  [profileId RemarketingListShare]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/remarketingListShares",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body RemarketingListShare}))

(defn accountPermissionGroups-get
  "Gets one account permission group by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/accountPermissionGroups/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/accountPermissionGroups/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn accountPermissionGroups-list
  "Retrieves the list of account permission groups.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/accountPermissionGroups/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/accountPermissionGroups",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn postalCodes-get
  "Gets one postal code by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/postalCodes/get

profileId <> 
code <> "
  [profileId code]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/postalCodes/{+code}",
     :uri-template-args {"profileId" profileId, "code" code},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn postalCodes-list
  "Retrieves a list of postal codes.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/postalCodes/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/postalCodes",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn campaigns-get
  "Gets one campaign by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/campaigns/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/campaigns/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn campaigns-insert
  "Inserts a new campaign.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/campaigns/insert

profileId <> 
Campaign:
Campaign"
  [profileId Campaign]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/campaigns",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Campaign}))

(defn campaigns-list
  "Retrieves a list of campaigns, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/campaigns/list

profileId <> 

optional:
advertiserIds <string> Select only campaigns that belong to these advertisers.
searchString <string> Allows searching for campaigns by name or ID. Wildcards (*) are allowed. For example, \"campaign*2015\" will return campaigns with names like \"campaign June 2015\", \"campaign April 2015\", or simply \"campaign 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"campaign\" will match campaigns with name \"my campaign\", \"campaign 2015\", or simply \"campaign\".
subaccountId <string> Select only campaigns that belong to this subaccount.
atLeastOneOptimizationActivity <boolean> Select only campaigns that have at least one optimization activity.
maxResults <integer> Maximum number of results to return.
ids <string> Select only campaigns with these IDs.
overriddenEventTagId <string> Select only campaigns that have overridden this event tag ID.
archived <boolean> Select only archived campaigns. Don't set this field to select both archived and non-archived campaigns.
excludedIds <string> Exclude campaigns with these IDs.
advertiserGroupIds <string> Select only campaigns whose advertisers belong to these advertiser groups.
sortOrder <string> Order of sorted results.
sortField <string> Field by which to sort the list."
  ([profileId] (campaigns-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/campaigns",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn campaigns-update
  "Updates an existing campaign.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/campaigns/update

profileId <> 
Campaign:
Campaign"
  [profileId Campaign]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/campaigns",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Campaign}))

(defn campaigns-patch
  "Updates an existing campaign. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/campaigns/patch

profileId <> 
id <> 
Campaign:
Campaign"
  [profileId id Campaign]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/campaigns",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Campaign}))

(defn browsers-list
  "Retrieves a list of browsers.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/browsers/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/browsers",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn reports-delete
  "Deletes a report by its ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/reports/delete

profileId <> 
reportId <> "
  [profileId reportId]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/reports/{reportId}",
     :uri-template-args {"profileId" profileId, "reportId" reportId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfareporting"]}))

(defn reports-get
  "Retrieves a report by its ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/reports/get

profileId <> 
reportId <> "
  [profileId reportId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/reports/{reportId}",
     :uri-template-args {"profileId" profileId, "reportId" reportId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfareporting"]}))

(defn reports-insert
  "Creates a report.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/reports/insert

profileId <> 
Report:
Report"
  [profileId Report]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/reports",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfareporting"],
     :body Report}))

(defn reports-list
  "Retrieves list of reports.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/reports/list

profileId <> 

optional:
maxResults <integer> Maximum number of results to return.
scope <string> The scope that defines which results are returned.
sortField <string> The field by which to sort the list.
sortOrder <string> Order of sorted results."
  ([profileId] (reports-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/reports",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfareporting"]})))

(defn reports-run
  "Runs a report.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/reports/run

profileId <> 
reportId <> 

optional:
synchronous <boolean> If set and true, tries to run the report synchronously."
  ([profileId reportId] (reports-run profileId reportId nil))
  ([profileId reportId optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/reports/{reportId}/run",
       :uri-template-args {"profileId" profileId, "reportId" reportId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfareporting"]})))

(defn reports-update
  "Updates a report.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/reports/update

profileId <> 
reportId <> 
Report:
Report"
  [profileId reportId Report]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/reports/{reportId}",
     :uri-template-args {"profileId" profileId, "reportId" reportId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfareporting"],
     :body Report}))

(defn reports-patch
  "Updates an existing report. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/reports/patch

profileId <> 
reportId <> 
Report:
Report"
  [profileId reportId Report]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/reports/{reportId}",
     :uri-template-args {"profileId" profileId, "reportId" reportId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfareporting"],
     :body Report}))

(defn reports-files-get
  "Retrieves a report file by its report ID and file ID. This method supports media download.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/reports/files/get

profileId <> 
reportId <> 
fileId <> "
  [profileId reportId fileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/reports/{reportId}/files/{fileId}",
     :uri-template-args
     {"profileId" profileId, "reportId" reportId, "fileId" fileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfareporting"]}))

(defn reports-files-list
  "Lists files for a report.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/reports/files/list

profileId <> 
reportId <> 

optional:
sortField <string> The field by which to sort the list.
sortOrder <string> Order of sorted results.
maxResults <integer> Maximum number of results to return."
  ([profileId reportId] (reports-files-list profileId reportId nil))
  ([profileId reportId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/reports/{reportId}/files",
       :uri-template-args {"profileId" profileId, "reportId" reportId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfareporting"]})))

(defn reports-compatibleFields-query
  "Returns the fields that are compatible to be selected in the respective sections of a report criteria, given the fields already selected in the input report and user permissions.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/reports/compatibleFields/query

profileId <> 
Report:
Report"
  [profileId Report]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/reports/compatiblefields/query",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfareporting"],
     :body Report}))

(defn metros-list
  "Retrieves a list of metros.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/metros/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/metros",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn userRolePermissions-get
  "Gets one user role permission by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/userRolePermissions/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/userRolePermissions/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn userRolePermissions-list
  "Gets a list of user role permissions, possibly filtered.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/userRolePermissions/list

profileId <> 

optional:
ids <string> Select only user role permissions with these IDs."
  ([profileId] (userRolePermissions-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/userRolePermissions",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn inventoryItems-get
  "Gets one inventory item by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/inventoryItems/get

profileId <> 
projectId <> 
id <> "
  [profileId projectId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/projects/{projectId}/inventoryItems/{+id}",
     :uri-template-args
     {"profileId" profileId, "projectId" projectId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn inventoryItems-list
  "Retrieves a list of inventory items, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/inventoryItems/list

profileId <> 
projectId <> 

optional:
maxResults <integer> Maximum number of results to return.
ids <string> Select only inventory items with these IDs.
type <string> Select only inventory items with this type.
inPlan <boolean> Select only inventory items that are in plan.
orderId <string> Select only inventory items that belong to specified orders.
sortOrder <string> Order of sorted results.
sortField <string> Field by which to sort the list.
siteId <string> Select only inventory items that are associated with these sites."
  ([profileId projectId] (inventoryItems-list profileId projectId nil))
  ([profileId projectId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/projects/{projectId}/inventoryItems",
       :uri-template-args
       {"projectId" projectId, "profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn accountPermissions-get
  "Gets one account permission by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/accountPermissions/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/accountPermissions/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn accountPermissions-list
  "Retrieves the list of account permissions.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/accountPermissions/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/accountPermissions",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn billingProfiles-get
  "Gets one billing profile by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/billingProfiles/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/billingProfiles/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn billingProfiles-list
  "Retrieves a list of billing profiles, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/billingProfiles/list

profileId <> 

optional:
currency_code <string> Select only billing profile with currency.
maxResults <integer> Maximum number of results to return.
name <string> Allows searching for billing profiles by name. Wildcards (*) are allowed. For example, \"profile*2020\" will return objects with names like \"profile June 2020\", \"profile April 2020\", or simply \"profile 2020\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"profile\" will match objects with name \"my profile\", \"profile 2021\", or simply \"profile\".
ids <string> Select only billing profile with these IDs.
subaccountIds <string> Select only billing profile with the specified subaccount.When only_suggestion is true, only a single subaccount_id is supported.
status <string> Select only billing profile with the specified status.
sortOrder <string> Order of sorted results.
sortField <string> Field by which to sort the list.
onlySuggestion <boolean> Select only billing profile which is suggested for the currency_code & subaccount_id using the Billing Suggestion API."
  ([profileId] (billingProfiles-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/billingProfiles",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn billingProfiles-update
  "Updates an existing billing profile.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/billingProfiles/update

profileId <> 
BillingProfile:
BillingProfile"
  [profileId BillingProfile]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/billingProfiles",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body BillingProfile}))

(defn files-get
  "Retrieves a report file by its report ID and file ID. This method supports media download.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/files/get

reportId <> 
fileId <> "
  [reportId fileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/reports/{reportId}/files/{fileId}",
     :uri-template-args {"reportId" reportId, "fileId" fileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfareporting"]}))

(defn files-list
  "Lists files for a user profile.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/files/list

profileId <> 

optional:
maxResults <integer> Maximum number of results to return.
scope <string> The scope that defines which results are returned.
sortField <string> The field by which to sort the list.
sortOrder <string> Order of sorted results."
  ([profileId] (files-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/files",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfareporting"]})))

(defn conversions-batchinsert
  "Inserts conversions.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/conversions/batchinsert

profileId <> 
ConversionsBatchInsertRequest:
ConversionsBatchInsertRequest"
  [profileId ConversionsBatchInsertRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/conversions/batchinsert",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ddmconversions"],
     :body ConversionsBatchInsertRequest}))

(defn conversions-batchupdate
  "Updates existing conversions.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/conversions/batchupdate

profileId <> 
ConversionsBatchUpdateRequest:
ConversionsBatchUpdateRequest"
  [profileId ConversionsBatchUpdateRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/conversions/batchupdate",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/ddmconversions"],
     :body ConversionsBatchUpdateRequest}))

(defn mobileApps-get
  "Gets one mobile app by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/mobileApps/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/mobileApps/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn mobileApps-list
  "Retrieves list of available mobile apps.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/mobileApps/list

profileId <> 

optional:
ids <string> Select only apps with these IDs.
searchString <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"app*2015\" will return objects with names like \"app Jan 2018\", \"app Jan 2018\", or simply \"app 2018\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"app\" will match objects with name \"my app\", \"app 2018\", or simply \"app\".
directories <string> Select only apps from these directories.
maxResults <integer> Maximum number of results to return."
  ([profileId] (mobileApps-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/mobileApps",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn eventTags-delete
  "Deletes an existing event tag.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/eventTags/delete

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/eventTags/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn eventTags-get
  "Gets one event tag by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/eventTags/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/eventTags/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn eventTags-insert
  "Inserts a new event tag.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/eventTags/insert

profileId <> 
EventTag:
EventTag"
  [profileId EventTag]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/eventTags",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body EventTag}))

(defn eventTags-list
  "Retrieves a list of event tags, possibly filtered.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/eventTags/list

profileId <> 

optional:
campaignId <string> Select only event tags that belong to this campaign.
advertiserId <string> Select only event tags that belong to this advertiser.
searchString <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"eventtag*2015\" will return objects with names like \"eventtag June 2015\", \"eventtag April 2015\", or simply \"eventtag 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"eventtag\" will match objects with name \"my eventtag\", \"eventtag 2015\", or simply \"eventtag\".
enabled <boolean> Select only enabled event tags. What is considered enabled or disabled depends on the definitionsOnly parameter. When definitionsOnly is set to true, only the specified advertiser or campaign's event tags' enabledByDefault field is examined. When definitionsOnly is set to false, the specified ad or specified campaign's parent advertiser's or parent campaign's event tags' enabledByDefault and status fields are examined as well.
ids <string> Select only event tags with these IDs.
adId <string> Select only event tags that belong to this ad.
definitionsOnly <boolean> Examine only the specified campaign or advertiser's event tags for matching selector criteria. When set to false, the parent advertiser and parent campaign of the specified ad or campaign is examined as well. In addition, when set to false, the status field is examined as well, along with the enabledByDefault field. This parameter can not be set to true when adId is specified as ads do not define their own even tags.
eventTagTypes <string> Select only event tags with the specified event tag types. Event tag types can be used to specify whether to use a third-party pixel, a third-party JavaScript URL, or a third-party click-through URL for either impression or click tracking.
sortOrder <string> Order of sorted results.
sortField <string> Field by which to sort the list."
  ([profileId] (eventTags-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/eventTags",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn eventTags-update
  "Updates an existing event tag.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/eventTags/update

profileId <> 
EventTag:
EventTag"
  [profileId EventTag]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/eventTags",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body EventTag}))

(defn eventTags-patch
  "Updates an existing event tag. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/eventTags/patch

profileId <> 
id <> 
EventTag:
EventTag"
  [profileId id EventTag]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/eventTags",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body EventTag}))

(defn platformTypes-get
  "Gets one platform type by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/platformTypes/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/platformTypes/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn platformTypes-list
  "Retrieves a list of platform types.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/platformTypes/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/platformTypes",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn accountUserProfiles-get
  "Gets one account user profile by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/accountUserProfiles/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/accountUserProfiles/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn accountUserProfiles-insert
  "Inserts a new account user profile.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/accountUserProfiles/insert

profileId <> 
AccountUserProfile:
AccountUserProfile"
  [profileId AccountUserProfile]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/accountUserProfiles",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body AccountUserProfile}))

(defn accountUserProfiles-list
  "Retrieves a list of account user profiles, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/accountUserProfiles/list

profileId <> 

optional:
searchString <string> Allows searching for objects by name, ID or email. Wildcards (*) are allowed. For example, \"user profile*2015\" will return objects with names like \"user profile June 2015\", \"user profile April 2015\", or simply \"user profile 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"user profile\" will match objects with name \"my user profile\", \"user profile 2015\", or simply \"user profile\".
subaccountId <string> Select only user profiles with the specified subaccount ID.
maxResults <integer> Maximum number of results to return.
ids <string> Select only user profiles with these IDs.
userRoleId <string> Select only user profiles with the specified user role ID.
sortOrder <string> Order of sorted results.
active <boolean> Select only active user profiles.
sortField <string> Field by which to sort the list."
  ([profileId] (accountUserProfiles-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/accountUserProfiles",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn accountUserProfiles-update
  "Updates an existing account user profile.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/accountUserProfiles/update

profileId <> 
AccountUserProfile:
AccountUserProfile"
  [profileId AccountUserProfile]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/accountUserProfiles",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body AccountUserProfile}))

(defn accountUserProfiles-patch
  "Updates an existing account user profile. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/accountUserProfiles/patch

profileId <> 
id <> 
AccountUserProfile:
AccountUserProfile"
  [profileId id AccountUserProfile]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/accountUserProfiles",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body AccountUserProfile}))

(defn directorySites-get
  "Gets one directory site by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/directorySites/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/directorySites/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn directorySites-insert
  "Inserts a new directory site.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/directorySites/insert

profileId <> 
DirectorySite:
DirectorySite"
  [profileId DirectorySite]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/directorySites",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body DirectorySite}))

(defn directorySites-list
  "Retrieves a list of directory sites, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/directorySites/list

profileId <> 

optional:
acceptsPublisherPaidPlacements <boolean> Select only directory sites that accept publisher paid placements. This field can be left blank.
searchString <string> Allows searching for objects by name, ID or URL. Wildcards (*) are allowed. For example, \"directory site*2015\" will return objects with names like \"directory site June 2015\", \"directory site April 2015\", or simply \"directory site 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"directory site\" will match objects with name \"my directory site\", \"directory site 2015\" or simply, \"directory site\".
dfpNetworkCode <string> Select only directory sites with this Ad Manager network code.
acceptsInStreamVideoPlacements <boolean> This search filter is no longer supported and will have no effect on the results returned.
acceptsInterstitialPlacements <boolean> This search filter is no longer supported and will have no effect on the results returned.
maxResults <integer> Maximum number of results to return.
ids <string> Select only directory sites with these IDs.
sortOrder <string> Order of sorted results.
active <boolean> Select only active directory sites. Leave blank to retrieve both active and inactive directory sites.
sortField <string> Field by which to sort the list."
  ([profileId] (directorySites-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/directorySites",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn mobileCarriers-get
  "Gets one mobile carrier by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/mobileCarriers/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/mobileCarriers/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn mobileCarriers-list
  "Retrieves a list of mobile carriers.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/mobileCarriers/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/mobileCarriers",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn operatingSystems-get
  "Gets one operating system by DART ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/operatingSystems/get

profileId <> 
dartId <> "
  [profileId dartId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/operatingSystems/{+dartId}",
     :uri-template-args {"profileId" profileId, "dartId" dartId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn operatingSystems-list
  "Retrieves a list of operating systems.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/operatingSystems/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/operatingSystems",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn floodlightConfigurations-get
  "Gets one floodlight configuration by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightConfigurations/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightConfigurations/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn floodlightConfigurations-list
  "Retrieves a list of floodlight configurations, possibly filtered.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightConfigurations/list

profileId <> 

optional:
ids <string> Set of IDs of floodlight configurations to retrieve. Required field; otherwise an empty list will be returned."
  ([profileId] (floodlightConfigurations-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightConfigurations",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn floodlightConfigurations-update
  "Updates an existing floodlight configuration.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightConfigurations/update

profileId <> 
FloodlightConfiguration:
FloodlightConfiguration"
  [profileId FloodlightConfiguration]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightConfigurations",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body FloodlightConfiguration}))

(defn floodlightConfigurations-patch
  "Updates an existing floodlight configuration. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightConfigurations/patch

profileId <> 
id <> 
FloodlightConfiguration:
FloodlightConfiguration"
  [profileId id FloodlightConfiguration]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightConfigurations",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body FloodlightConfiguration}))

(defn userRoles-patch
  "Updates an existing user role. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/userRoles/patch

profileId <> 
id <> 
UserRole:
UserRole"
  [profileId id UserRole]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/userRoles",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body UserRole}))

(defn userRoles-get
  "Gets one user role by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/userRoles/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/userRoles/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn userRoles-insert
  "Inserts a new user role.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/userRoles/insert

profileId <> 
UserRole:
UserRole"
  [profileId UserRole]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/userRoles",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body UserRole}))

(defn userRoles-list
  "Retrieves a list of user roles, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/userRoles/list

profileId <> 

optional:
searchString <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"userrole*2015\" will return objects with names like \"userrole June 2015\", \"userrole April 2015\", or simply \"userrole 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"userrole\" will match objects with name \"my userrole\", \"userrole 2015\", or simply \"userrole\".
subaccountId <string> Select only user roles that belong to this subaccount.
accountUserRoleOnly <boolean> Select only account level user roles not associated with any specific subaccount.
maxResults <integer> Maximum number of results to return.
ids <string> Select only user roles with the specified IDs.
sortOrder <string> Order of sorted results.
sortField <string> Field by which to sort the list."
  ([profileId] (userRoles-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/userRoles",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn userRoles-update
  "Updates an existing user role.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/userRoles/update

profileId <> 
UserRole:
UserRole"
  [profileId UserRole]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/userRoles",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body UserRole}))

(defn userRoles-delete
  "Deletes an existing user role.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/userRoles/delete

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/userRoles/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn floodlightActivityGroups-get
  "Gets one floodlight activity group by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightActivityGroups/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightActivityGroups/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn floodlightActivityGroups-insert
  "Inserts a new floodlight activity group.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightActivityGroups/insert

profileId <> 
FloodlightActivityGroup:
FloodlightActivityGroup"
  [profileId FloodlightActivityGroup]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightActivityGroups",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body FloodlightActivityGroup}))

(defn floodlightActivityGroups-list
  "Retrieves a list of floodlight activity groups, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightActivityGroups/list

profileId <> 

optional:
advertiserId <string> Select only floodlight activity groups with the specified advertiser ID. Must specify either advertiserId or floodlightConfigurationId for a non-empty result.
searchString <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"floodlightactivitygroup*2015\" will return objects with names like \"floodlightactivitygroup June 2015\", \"floodlightactivitygroup April 2015\", or simply \"floodlightactivitygroup 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"floodlightactivitygroup\" will match objects with name \"my floodlightactivitygroup activity\", \"floodlightactivitygroup 2015\", or simply \"floodlightactivitygroup\".
maxResults <integer> Maximum number of results to return.
ids <string> Select only floodlight activity groups with the specified IDs. Must specify either advertiserId or floodlightConfigurationId for a non-empty result.
type <string> Select only floodlight activity groups with the specified floodlight activity group type.
sortOrder <string> Order of sorted results.
sortField <string> Field by which to sort the list.
floodlightConfigurationId <string> Select only floodlight activity groups with the specified floodlight configuration ID. Must specify either advertiserId, or floodlightConfigurationId for a non-empty result."
  ([profileId] (floodlightActivityGroups-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightActivityGroups",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn floodlightActivityGroups-update
  "Updates an existing floodlight activity group.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightActivityGroups/update

profileId <> 
FloodlightActivityGroup:
FloodlightActivityGroup"
  [profileId FloodlightActivityGroup]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightActivityGroups",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body FloodlightActivityGroup}))

(defn floodlightActivityGroups-patch
  "Updates an existing floodlight activity group. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightActivityGroups/patch

profileId <> 
id <> 
FloodlightActivityGroup:
FloodlightActivityGroup"
  [profileId id FloodlightActivityGroup]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightActivityGroups",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body FloodlightActivityGroup}))

(defn dynamicTargetingKeys-delete
  "Deletes an existing dynamic targeting key.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/dynamicTargetingKeys/delete

profileId <> 
objectId <> 
name <> 
objectType <> "
  [profileId objectId name objectType]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/dynamicTargetingKeys/{+objectId}",
     :uri-template-args {"profileId" profileId, "objectId" objectId},
     :query-params {"name" name, "objectType" objectType},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn dynamicTargetingKeys-insert
  "Inserts a new dynamic targeting key. Keys must be created at the advertiser level before being assigned to the advertiser's ads, creatives, or placements. There is a maximum of 1000 keys per advertiser, out of which a maximum of 20 keys can be assigned per ad, creative, or placement.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/dynamicTargetingKeys/insert

profileId <> 
DynamicTargetingKey:
DynamicTargetingKey"
  [profileId DynamicTargetingKey]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/dynamicTargetingKeys",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body DynamicTargetingKey}))

(defn dynamicTargetingKeys-list
  "Retrieves a list of dynamic targeting keys.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/dynamicTargetingKeys/list

profileId <> 

optional:
names <string> Select only dynamic targeting keys exactly matching these names.
objectType <string> Select only dynamic targeting keys with this object type.
objectId <string> Select only dynamic targeting keys with this object ID.
advertiserId <string> Select only dynamic targeting keys whose object has this advertiser ID."
  ([profileId] (dynamicTargetingKeys-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/dynamicTargetingKeys",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn advertiserLandingPages-get
  "Gets one landing page by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertiserLandingPages/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertiserLandingPages/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn advertiserLandingPages-insert
  "Inserts a new landing page.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertiserLandingPages/insert

profileId <> 
LandingPage:
LandingPage"
  [profileId LandingPage]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertiserLandingPages",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body LandingPage}))

(defn advertiserLandingPages-list
  "Retrieves a list of landing pages.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertiserLandingPages/list

profileId <> 

optional:
advertiserIds <string> Select only landing pages that belong to these advertisers.
searchString <string> Allows searching for landing pages by name or ID. Wildcards (*) are allowed. For example, \"landingpage*2017\" will return landing pages with names like \"landingpage July 2017\", \"landingpage March 2017\", or simply \"landingpage 2017\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"landingpage\" will match campaigns with name \"my landingpage\", \"landingpage 2015\", or simply \"landingpage\".
subaccountId <string> Select only landing pages that belong to this subaccount.
maxResults <integer> Maximum number of results to return.
ids <string> Select only landing pages with these IDs.
campaignIds <string> Select only landing pages that are associated with these campaigns.
archived <boolean> Select only archived landing pages. Don't set this field to select both archived and non-archived landing pages.
sortOrder <string> Order of sorted results.
sortField <string> Field by which to sort the list."
  ([profileId] (advertiserLandingPages-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertiserLandingPages",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn advertiserLandingPages-update
  "Updates an existing landing page.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertiserLandingPages/update

profileId <> 
LandingPage:
LandingPage"
  [profileId LandingPage]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertiserLandingPages",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body LandingPage}))

(defn advertiserLandingPages-patch
  "Updates an existing landing page. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertiserLandingPages/patch

profileId <> 
id <> 
LandingPage:
LandingPage"
  [profileId id LandingPage]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertiserLandingPages",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body LandingPage}))

(defn languages-list
  "Retrieves a list of languages.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/languages/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/languages",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn accounts-get
  "Gets one account by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/accounts/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/accounts/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn accounts-list
  "Retrieves the list of accounts, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/accounts/list

profileId <> 

optional:
ids <string> Select only accounts with these IDs.
searchString <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"account*2015\" will return objects with names like \"account June 2015\", \"account April 2015\", or simply \"account 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"account\" will match objects with name \"my account\", \"account 2015\", or simply \"account\".
active <boolean> Select only active accounts. Don't set this field to select both active and non-active accounts.
maxResults <integer> Maximum number of results to return.
sortField <string> Field by which to sort the list.
sortOrder <string> Order of sorted results."
  ([profileId] (accounts-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/accounts",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn accounts-update
  "Updates an existing account.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/accounts/update

profileId <> 
Account:
Account"
  [profileId Account]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/accounts",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Account}))

(defn accounts-patch
  "Updates an existing account. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/accounts/patch

profileId <> 
id <> 
Account:
Account"
  [profileId id Account]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/accounts",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Account}))

(defn countries-get
  "Gets one country by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/countries/get

profileId <> 
dartId <> "
  [profileId dartId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/countries/{+dartId}",
     :uri-template-args {"profileId" profileId, "dartId" dartId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn countries-list
  "Retrieves a list of countries.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/countries/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/countries",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn placementGroups-patch
  "Updates an existing placement group. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placementGroups/patch

profileId <> 
id <> 
PlacementGroup:
PlacementGroup"
  [profileId id PlacementGroup]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placementGroups",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body PlacementGroup}))

(defn placementGroups-get
  "Gets one placement group by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placementGroups/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placementGroups/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn placementGroups-insert
  "Inserts a new placement group.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placementGroups/insert

profileId <> 
PlacementGroup:
PlacementGroup"
  [profileId PlacementGroup]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placementGroups",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body PlacementGroup}))

(defn placementGroups-list
  "Retrieves a list of placement groups, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placementGroups/list

profileId <> 

optional:
advertiserIds <string> Select only placement groups that belong to these advertisers.
searchString <string> Allows searching for placement groups by name or ID. Wildcards (*) are allowed. For example, \"placement*2015\" will return placement groups with names like \"placement group June 2015\", \"placement group May 2015\", or simply \"placements 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"placementgroup\" will match placement groups with name \"my placementgroup\", \"placementgroup 2015\", or simply \"placementgroup\".
placementStrategyIds <string> Select only placement groups that are associated with these placement strategies.
directorySiteIds <string> Select only placement groups that are associated with these directory sites.
maxStartDate <string> Select only placements or placement groups whose start date is on or before the specified maxStartDate. The date should be formatted as \"yyyy-MM-dd\".
contentCategoryIds <string> Select only placement groups that are associated with these content categories.
minStartDate <string> Select only placements or placement groups whose start date is on or after the specified minStartDate. The date should be formatted as \"yyyy-MM-dd\".
pricingTypes <string> Select only placement groups with these pricing types.
maxResults <integer> Maximum number of results to return.
ids <string> Select only placement groups with these IDs.
campaignIds <string> Select only placement groups that belong to these campaigns.
placementGroupType <string> Select only placement groups belonging with this group type. A package is a simple group of placements that acts as a single pricing point for a group of tags. A roadblock is a group of placements that not only acts as a single pricing point but also assumes that all the tags in it will be served at the same time. A roadblock requires one of its assigned placements to be marked as primary for reporting.
siteIds <string> Select only placement groups that are associated with these sites.
maxEndDate <string> Select only placements or placement groups whose end date is on or before the specified maxEndDate. The date should be formatted as \"yyyy-MM-dd\".
sortOrder <string> Order of sorted results.
activeStatus <string> Select only placements with these active statuses.
sortField <string> Field by which to sort the list.
minEndDate <string> Select only placements or placement groups whose end date is on or after the specified minEndDate. The date should be formatted as \"yyyy-MM-dd\"."
  ([profileId] (placementGroups-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placementGroups",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn placementGroups-update
  "Updates an existing placement group.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placementGroups/update

profileId <> 
PlacementGroup:
PlacementGroup"
  [profileId PlacementGroup]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placementGroups",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body PlacementGroup}))

(defn advertiserInvoices-list
  "Retrieves a list of invoices for a particular issue month. The api only works if the billing profile invoice level is set to either advertiser or campaign non-consolidated invoice level.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/advertiserInvoices/list

profileId <> 
advertiserId <> 

optional:
maxResults <integer> Maximum number of results to return.
issueMonth <string> Month for which invoices are needed in the format YYYYMM. Required field"
  ([profileId advertiserId]
    (advertiserInvoices-list profileId advertiserId nil))
  ([profileId advertiserId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/advertisers/{+advertiserId}/invoices",
       :uri-template-args
       {"profileId" profileId, "advertiserId" advertiserId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn creativeFields-delete
  "Deletes an existing creative field.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeFields/delete

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeFields/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn creativeFields-get
  "Gets one creative field by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeFields/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeFields/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn creativeFields-insert
  "Inserts a new creative field.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeFields/insert

profileId <> 
CreativeField:
CreativeField"
  [profileId CreativeField]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeFields",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body CreativeField}))

(defn creativeFields-list
  "Retrieves a list of creative fields, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeFields/list

profileId <> 

optional:
ids <string> Select only creative fields with these IDs.
searchString <string> Allows searching for creative fields by name or ID. Wildcards (*) are allowed. For example, \"creativefield*2015\" will return creative fields with names like \"creativefield June 2015\", \"creativefield April 2015\", or simply \"creativefield 2015\". Most of the searches also add wild-cards implicitly at the start and the end of the search string. For example, a search string of \"creativefield\" will match creative fields with the name \"my creativefield\", \"creativefield 2015\", or simply \"creativefield\".
advertiserIds <string> Select only creative fields that belong to these advertisers.
maxResults <integer> Maximum number of results to return.
sortField <string> Field by which to sort the list.
sortOrder <string> Order of sorted results."
  ([profileId] (creativeFields-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeFields",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn creativeFields-update
  "Updates an existing creative field.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeFields/update

profileId <> 
CreativeField:
CreativeField"
  [profileId CreativeField]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeFields",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body CreativeField}))

(defn creativeFields-patch
  "Updates an existing creative field. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeFields/patch

profileId <> 
id <> 
CreativeField:
CreativeField"
  [profileId id CreativeField]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeFields",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body CreativeField}))

(defn regions-list
  "Retrieves a list of regions.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/regions/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/regions",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn floodlightActivities-delete
  "Deletes an existing floodlight activity.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightActivities/delete

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightActivities/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn floodlightActivities-generatetag
  "Generates a tag for a floodlight activity.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightActivities/generatetag

profileId <> 

optional:
floodlightActivityId <string> Floodlight activity ID for which we want to generate a tag."
  ([profileId] (floodlightActivities-generatetag profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightActivities/generatetag",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn floodlightActivities-get
  "Gets one floodlight activity by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightActivities/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightActivities/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn floodlightActivities-insert
  "Inserts a new floodlight activity.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightActivities/insert

profileId <> 
FloodlightActivity:
FloodlightActivity"
  [profileId FloodlightActivity]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightActivities",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body FloodlightActivity}))

(defn floodlightActivities-list
  "Retrieves a list of floodlight activities, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightActivities/list

profileId <> 

optional:
advertiserId <string> Select only floodlight activities for the specified advertiser ID. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty result.
floodlightActivityGroupTagString <string> Select only floodlight activities with the specified floodlight activity group tag string.
floodlightActivityGroupName <string> Select only floodlight activities with the specified floodlight activity group name.
searchString <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"floodlightactivity*2015\" will return objects with names like \"floodlightactivity June 2015\", \"floodlightactivity April 2015\", or simply \"floodlightactivity 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"floodlightactivity\" will match objects with name \"my floodlightactivity activity\", \"floodlightactivity 2015\", or simply \"floodlightactivity\".
floodlightActivityGroupType <string> Select only floodlight activities with the specified floodlight activity group type.
maxResults <integer> Maximum number of results to return.
ids <string> Select only floodlight activities with the specified IDs. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty result.
floodlightActivityGroupIds <string> Select only floodlight activities with the specified floodlight activity group IDs.
tagString <string> Select only floodlight activities with the specified tag string.
sortOrder <string> Order of sorted results.
sortField <string> Field by which to sort the list.
floodlightConfigurationId <string> Select only floodlight activities for the specified floodlight configuration ID. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty result."
  ([profileId] (floodlightActivities-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightActivities",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn floodlightActivities-update
  "Updates an existing floodlight activity.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightActivities/update

profileId <> 
FloodlightActivity:
FloodlightActivity"
  [profileId FloodlightActivity]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightActivities",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body FloodlightActivity}))

(defn floodlightActivities-patch
  "Updates an existing floodlight activity. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/floodlightActivities/patch

profileId <> 
id <> 
FloodlightActivity:
FloodlightActivity"
  [profileId id FloodlightActivity]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/floodlightActivities",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body FloodlightActivity}))

(defn userRolePermissionGroups-get
  "Gets one user role permission group by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/userRolePermissionGroups/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/userRolePermissionGroups/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn userRolePermissionGroups-list
  "Gets a list of all supported user role permission groups.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/userRolePermissionGroups/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/userRolePermissionGroups",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn targetingTemplates-patch
  "Updates an existing targeting template. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/targetingTemplates/patch

profileId <> 
id <> 
TargetingTemplate:
TargetingTemplate"
  [profileId id TargetingTemplate]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/targetingTemplates",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body TargetingTemplate}))

(defn targetingTemplates-get
  "Gets one targeting template by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/targetingTemplates/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/targetingTemplates/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn targetingTemplates-insert
  "Inserts a new targeting template.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/targetingTemplates/insert

profileId <> 
TargetingTemplate:
TargetingTemplate"
  [profileId TargetingTemplate]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/targetingTemplates",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body TargetingTemplate}))

(defn targetingTemplates-list
  "Retrieves a list of targeting templates, optionally filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/targetingTemplates/list

profileId <> 

optional:
ids <string> Select only targeting templates with these IDs.
searchString <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"template*2015\" will return objects with names like \"template June 2015\", \"template April 2015\", or simply \"template 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"template\" will match objects with name \"my template\", \"template 2015\", or simply \"template\".
advertiserId <string> Select only targeting templates with this advertiser ID.
maxResults <integer> Maximum number of results to return.
sortField <string> Field by which to sort the list.
sortOrder <string> Order of sorted results."
  ([profileId] (targetingTemplates-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/targetingTemplates",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn targetingTemplates-update
  "Updates an existing targeting template.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/targetingTemplates/update

profileId <> 
TargetingTemplate:
TargetingTemplate"
  [profileId TargetingTemplate]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/targetingTemplates",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body TargetingTemplate}))

(defn billingAssignments-insert
  "Inserts a new billing assignment and returns the new assignment. Only one of advertiser_id or campaign_id is support per request. If the new assignment has no effect (assigning a campaign to the parent advertiser billing profile or assigning an advertiser to the account billing profile), no assignment will be returned.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/billingAssignments/insert

profileId <> 
billingProfileId <> 
BillingAssignment:
BillingAssignment"
  [profileId billingProfileId BillingAssignment]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/billingProfiles/{+billingProfileId}/billingAssignments",
     :uri-template-args
     {"profileId" profileId, "billingProfileId" billingProfileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body BillingAssignment}))

(defn billingAssignments-list
  "Retrieves a list of billing assignments.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/billingAssignments/list

profileId <> 
billingProfileId <> "
  [profileId billingProfileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/billingProfiles/{+billingProfileId}/billingAssignments",
     :uri-template-args
     {"profileId" profileId, "billingProfileId" billingProfileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn remarketingLists-patch
  "Updates an existing remarketing list. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/remarketingLists/patch

profileId <> 
id <> 
RemarketingList:
RemarketingList"
  [profileId id RemarketingList]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/remarketingLists",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body RemarketingList}))

(defn remarketingLists-get
  "Gets one remarketing list by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/remarketingLists/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/remarketingLists/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn remarketingLists-insert
  "Inserts a new remarketing list.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/remarketingLists/insert

profileId <> 
RemarketingList:
RemarketingList"
  [profileId RemarketingList]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/remarketingLists",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body RemarketingList}))

(defn remarketingLists-list
  "Retrieves a list of remarketing lists, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/remarketingLists/list

profileId <> 
advertiserId <> 

optional:
maxResults <integer> Maximum number of results to return.
name <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"remarketing list*2015\" will return objects with names like \"remarketing list June 2015\", \"remarketing list April 2015\", or simply \"remarketing list 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"remarketing list\" will match objects with name \"my remarketing list\", \"remarketing list 2015\", or simply \"remarketing list\".
floodlightActivityId <string> Select only remarketing lists that have this floodlight activity ID.
sortOrder <string> Order of sorted results.
active <boolean> Select only active or only inactive remarketing lists.
sortField <string> Field by which to sort the list."
  ([profileId advertiserId]
    (remarketingLists-list profileId advertiserId nil))
  ([profileId advertiserId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/remarketingLists",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {"advertiserId" advertiserId} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn remarketingLists-update
  "Updates an existing remarketing list.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/remarketingLists/update

profileId <> 
RemarketingList:
RemarketingList"
  [profileId RemarketingList]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/remarketingLists",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body RemarketingList}))

(defn projects-get
  "Gets one project by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/projects/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/projects/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn projects-list
  "Retrieves a list of projects, possibly filtered. This method supports paging .
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/projects/list

profileId <> 

optional:
ids <string> Select only projects with these IDs.
searchString <string> Allows searching for projects by name or ID. Wildcards (*) are allowed. For example, \"project*2015\" will return projects with names like \"project June 2015\", \"project April 2015\", or simply \"project 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"project\" will match projects with name \"my project\", \"project 2015\", or simply \"project\".
advertiserIds <string> Select only projects with these advertiser IDs.
maxResults <integer> Maximum number of results to return.
sortField <string> Field by which to sort the list.
sortOrder <string> Order of sorted results."
  ([profileId] (projects-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/projects",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn sizes-get
  "Gets one size by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/sizes/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/sizes/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn sizes-insert
  "Inserts a new size.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/sizes/insert

profileId <> 
Size:
Size"
  [profileId Size]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/sizes",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Size}))

(defn sizes-list
  "Retrieves a list of sizes, possibly filtered. Retrieved sizes are globally unique and may include values not currently in use by your account. Due to this, the list of sizes returned by this method may differ from the list seen in the Trafficking UI.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/sizes/list

profileId <> 

optional:
ids <string> Select only sizes with these IDs.
height <integer> Select only sizes with this height.
iabStandard <boolean> Select only IAB standard sizes.
width <integer> Select only sizes with this width."
  ([profileId] (sizes-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/sizes",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn billingRates-list
  "Retrieves a list of billing rates. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/billingRates/list

profileId <> 
billingProfileId <> "
  [profileId billingProfileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/billingProfiles/{+billingProfileId}/billingRates",
     :uri-template-args
     {"profileId" profileId, "billingProfileId" billingProfileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn changeLogs-get
  "Gets one change log by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/changeLogs/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/changeLogs/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn changeLogs-list
  "Retrieves a list of change logs. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/changeLogs/list

profileId <> 

optional:
minChangeTime <string> Select only change logs whose change time is after the specified minChangeTime.The time should be formatted as an RFC3339 date/time string. For example, for 10:54 PM on July 18th, 2015, in the America/New York time zone, the format is \"2015-07-18T22:54:00-04:00\". In other words, the year, month, day, the letter T, the hour (24-hour clock system), minute, second, and then the time zone offset.
searchString <string> Select only change logs whose object ID, user name, old or new values match the search string.
maxChangeTime <string> Select only change logs whose change time is before the specified maxChangeTime.The time should be formatted as an RFC3339 date/time string. For example, for 10:54 PM on July 18th, 2015, in the America/New York time zone, the format is \"2015-07-18T22:54:00-04:00\". In other words, the year, month, day, the letter T, the hour (24-hour clock system), minute, second, and then the time zone offset.
userProfileIds <string> Select only change logs with these user profile IDs.
maxResults <integer> Maximum number of results to return.
objectIds <string> Select only change logs with these object IDs.
ids <string> Select only change logs with these IDs.
action <string> Select only change logs with the specified action.
objectType <string> Select only change logs with the specified object type."
  ([profileId] (changeLogs-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/changeLogs",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn placementStrategies-patch
  "Updates an existing placement strategy. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placementStrategies/patch

profileId <> 
id <> 
PlacementStrategy:
PlacementStrategy"
  [profileId id PlacementStrategy]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placementStrategies",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body PlacementStrategy}))

(defn placementStrategies-delete
  "Deletes an existing placement strategy.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placementStrategies/delete

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placementStrategies/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn placementStrategies-get
  "Gets one placement strategy by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placementStrategies/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placementStrategies/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn placementStrategies-insert
  "Inserts a new placement strategy.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placementStrategies/insert

profileId <> 
PlacementStrategy:
PlacementStrategy"
  [profileId PlacementStrategy]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placementStrategies",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body PlacementStrategy}))

(defn placementStrategies-list
  "Retrieves a list of placement strategies, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placementStrategies/list

profileId <> 

optional:
ids <string> Select only placement strategies with these IDs.
maxResults <integer> Maximum number of results to return.
searchString <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"placementstrategy*2015\" will return objects with names like \"placementstrategy June 2015\", \"placementstrategy April 2015\", or simply \"placementstrategy 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"placementstrategy\" will match objects with name \"my placementstrategy\", \"placementstrategy 2015\", or simply \"placementstrategy\".
sortField <string> Field by which to sort the list.
sortOrder <string> Order of sorted results."
  ([profileId] (placementStrategies-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placementStrategies",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn placementStrategies-update
  "Updates an existing placement strategy.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/placementStrategies/update

profileId <> 
PlacementStrategy:
PlacementStrategy"
  [profileId PlacementStrategy]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/placementStrategies",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body PlacementStrategy}))

(defn cities-list
  "Retrieves a list of cities, possibly filtered.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/cities/list

profileId <> 

optional:
namePrefix <string> Select only cities with names starting with this prefix.
countryDartIds <string> Select only cities from these countries.
dartIds <string> Select only cities with these DART IDs.
regionDartIds <string> Select only cities from these regions."
  ([profileId] (cities-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/cities",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn dimensionValues-query
  "Retrieves list of report dimension values for a list of filters.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/dimensionValues/query

profileId <> 
DimensionValueRequest:
DimensionValueRequest

optional:
maxResults <integer> Maximum number of results to return."
  ([profileId DimensionValueRequest]
    (dimensionValues-query profileId DimensionValueRequest nil))
  ([profileId DimensionValueRequest optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}/dimensionvalues/query",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfareporting"],
       :body DimensionValueRequest})))

(defn connectionTypes-get
  "Gets one connection type by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/connectionTypes/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/connectionTypes/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn connectionTypes-list
  "Retrieves a list of connection types.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/connectionTypes/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/connectionTypes",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn creativeFieldValues-delete
  "Deletes an existing creative field value.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeFieldValues/delete

profileId <> 
creativeFieldId <> 
id <> "
  [profileId creativeFieldId id]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeFields/{+creativeFieldId}/creativeFieldValues/{+id}",
     :uri-template-args
     {"profileId" profileId,
      "creativeFieldId" creativeFieldId,
      "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn creativeFieldValues-get
  "Gets one creative field value by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeFieldValues/get

profileId <> 
creativeFieldId <> 
id <> "
  [profileId creativeFieldId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeFields/{+creativeFieldId}/creativeFieldValues/{+id}",
     :uri-template-args
     {"profileId" profileId,
      "creativeFieldId" creativeFieldId,
      "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn creativeFieldValues-insert
  "Inserts a new creative field value.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeFieldValues/insert

profileId <> 
creativeFieldId <> 
CreativeFieldValue:
CreativeFieldValue"
  [profileId creativeFieldId CreativeFieldValue]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeFields/{+creativeFieldId}/creativeFieldValues",
     :uri-template-args
     {"profileId" profileId, "creativeFieldId" creativeFieldId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body CreativeFieldValue}))

(defn creativeFieldValues-list
  "Retrieves a list of creative field values, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeFieldValues/list

profileId <> 
creativeFieldId <> 

optional:
maxResults <integer> Maximum number of results to return.
searchString <string> Allows searching for creative field values by their values. Wildcards (e.g. *) are not allowed.
ids <string> Select only creative field values with these IDs.
sortField <string> Field by which to sort the list.
sortOrder <string> Order of sorted results."
  ([profileId creativeFieldId]
    (creativeFieldValues-list profileId creativeFieldId nil))
  ([profileId creativeFieldId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeFields/{+creativeFieldId}/creativeFieldValues",
       :uri-template-args
       {"profileId" profileId, "creativeFieldId" creativeFieldId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn creativeFieldValues-update
  "Updates an existing creative field value.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeFieldValues/update

profileId <> 
creativeFieldId <> 
CreativeFieldValue:
CreativeFieldValue"
  [profileId creativeFieldId CreativeFieldValue]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeFields/{+creativeFieldId}/creativeFieldValues",
     :uri-template-args
     {"profileId" profileId, "creativeFieldId" creativeFieldId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body CreativeFieldValue}))

(defn creativeFieldValues-patch
  "Updates an existing creative field value. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeFieldValues/patch

profileId <> 
creativeFieldId <> 
id <> 
CreativeFieldValue:
CreativeFieldValue"
  [profileId creativeFieldId id CreativeFieldValue]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeFields/{+creativeFieldId}/creativeFieldValues",
     :uri-template-args
     {"profileId" profileId, "creativeFieldId" creativeFieldId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body CreativeFieldValue}))

(defn ads-get
  "Gets one ad by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/ads/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/ads/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn ads-insert
  "Inserts a new ad.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/ads/insert

profileId <> 
Ad:
Ad"
  [profileId Ad]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/ads",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Ad}))

(defn ads-list
  "Retrieves a list of ads, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/ads/list

profileId <> 

optional:
landingPageIds <string> Select only ads with these landing page IDs.
advertiserId <string> Select only ads with this advertiser ID.
placementIds <string> Select only ads with these placement IDs assigned.
searchString <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"ad*2015\" will return objects with names like \"ad June 2015\", \"ad April 2015\", or simply \"ad 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"ad\" will match objects with name \"my ad\", \"ad 2015\", or simply \"ad\".
remarketingListIds <string> Select only ads whose list targeting expression use these remarketing list IDs.
dynamicClickTracker <boolean> Select only dynamic click trackers. Applicable when type is AD_SERVING_CLICK_TRACKER. If true, select dynamic click trackers. If false, select static click trackers. Leave unset to select both.
compatibility <string> Select default ads with the specified compatibility. Applicable when type is AD_SERVING_DEFAULT_AD. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on mobile devices for regular or interstitial ads, respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering an in-stream video ads developed with the VAST standard.
creativeIds <string> Select only ads with these creative IDs assigned.
sslRequired <boolean> Select only ads that require SSL.
audienceSegmentIds <string> Select only ads with these audience segment IDs.
maxResults <integer> Maximum number of results to return.
ids <string> Select only ads with these IDs.
overriddenEventTagId <string> Select only ads with this event tag override ID.
campaignIds <string> Select only ads with these campaign IDs.
archived <boolean> Select only archived ads.
sizeIds <string> Select only ads with these size IDs.
sslCompliant <boolean> Select only ads that are SSL-compliant.
type <string> Select only ads with these types.
sortOrder <string> Order of sorted results.
active <boolean> Select only active ads.
sortField <string> Field by which to sort the list.
creativeOptimizationConfigurationIds <string> Select only ads with these creative optimization configuration IDs."
  ([profileId] (ads-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/ads",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn ads-update
  "Updates an existing ad.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/ads/update

profileId <> 
Ad:
Ad"
  [profileId Ad]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/ads",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Ad}))

(defn ads-patch
  "Updates an existing ad. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/ads/patch

profileId <> 
id <> 
Ad:
Ad"
  [profileId id Ad]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/ads",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Ad}))

(defn subaccounts-patch
  "Updates an existing subaccount. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/subaccounts/patch

profileId <> 
id <> 
Subaccount:
Subaccount"
  [profileId id Subaccount]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/subaccounts",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Subaccount}))

(defn subaccounts-get
  "Gets one subaccount by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/subaccounts/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/subaccounts/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn subaccounts-insert
  "Inserts a new subaccount.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/subaccounts/insert

profileId <> 
Subaccount:
Subaccount"
  [profileId Subaccount]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/subaccounts",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Subaccount}))

(defn subaccounts-list
  "Gets a list of subaccounts, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/subaccounts/list

profileId <> 

optional:
ids <string> Select only subaccounts with these IDs.
maxResults <integer> Maximum number of results to return.
searchString <string> Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, \"subaccount*2015\" will return objects with names like \"subaccount June 2015\", \"subaccount April 2015\", or simply \"subaccount 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"subaccount\" will match objects with name \"my subaccount\", \"subaccount 2015\", or simply \"subaccount\" .
sortField <string> Field by which to sort the list.
sortOrder <string> Order of sorted results."
  ([profileId] (subaccounts-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/subaccounts",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn subaccounts-update
  "Updates an existing subaccount.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/subaccounts/update

profileId <> 
Subaccount:
Subaccount"
  [profileId Subaccount]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/subaccounts",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body Subaccount}))

(defn orders-get
  "Gets one order by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/orders/get

profileId <> 
projectId <> 
id <> "
  [profileId projectId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/projects/{projectId}/orders/{+id}",
     :uri-template-args
     {"profileId" profileId, "projectId" projectId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn orders-list
  "Retrieves a list of orders, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/orders/list

profileId <> 
projectId <> 

optional:
searchString <string> Allows searching for orders by name or ID. Wildcards (*) are allowed. For example, \"order*2015\" will return orders with names like \"order June 2015\", \"order April 2015\", or simply \"order 2015\". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of \"order\" will match orders with name \"my order\", \"order 2015\", or simply \"order\".
maxResults <integer> Maximum number of results to return.
ids <string> Select only orders with these IDs.
sortOrder <string> Order of sorted results.
sortField <string> Field by which to sort the list.
siteId <string> Select only orders that are associated with these site IDs."
  ([profileId projectId] (orders-list profileId projectId nil))
  ([profileId projectId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/projects/{projectId}/orders",
       :uri-template-args
       {"projectId" projectId, "profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn creativeAssets-insert
  "Inserts a new creative asset.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeAssets/insert

profileId <> 
advertiserId <> 
CreativeAssetMetadata:
CreativeAssetMetadata"
  [profileId advertiserId CreativeAssetMetadata]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeAssets/{+advertiserId}/creativeAssets",
     :uri-template-args
     {"profileId" profileId, "advertiserId" advertiserId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body CreativeAssetMetadata}))

(defn videoFormats-get
  "Gets one video format by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/videoFormats/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/videoFormats/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn videoFormats-list
  "Lists available video formats.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/videoFormats/list

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/videoFormats",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn creativeGroups-get
  "Gets one creative group by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeGroups/get

profileId <> 
id <> "
  [profileId id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeGroups/{+id}",
     :uri-template-args {"profileId" profileId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"]}))

(defn creativeGroups-insert
  "Inserts a new creative group.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeGroups/insert

profileId <> 
CreativeGroup:
CreativeGroup"
  [profileId CreativeGroup]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeGroups",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body CreativeGroup}))

(defn creativeGroups-list
  "Retrieves a list of creative groups, possibly filtered. This method supports paging.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeGroups/list

profileId <> 

optional:
advertiserIds <string> Select only creative groups that belong to these advertisers.
searchString <string> Allows searching for creative groups by name or ID. Wildcards (*) are allowed. For example, \"creativegroup*2015\" will return creative groups with names like \"creativegroup June 2015\", \"creativegroup April 2015\", or simply \"creativegroup 2015\". Most of the searches also add wild-cards implicitly at the start and the end of the search string. For example, a search string of \"creativegroup\" will match creative groups with the name \"my creativegroup\", \"creativegroup 2015\", or simply \"creativegroup\".
maxResults <integer> Maximum number of results to return.
ids <string> Select only creative groups with these IDs.
sortOrder <string> Order of sorted results.
sortField <string> Field by which to sort the list.
groupNumber <integer> Select only creative groups that belong to this subgroup."
  ([profileId] (creativeGroups-list profileId nil))
  ([profileId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeGroups",
       :uri-template-args {"profileId" profileId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/dfatrafficking"]})))

(defn creativeGroups-update
  "Updates an existing creative group.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeGroups/update

profileId <> 
CreativeGroup:
CreativeGroup"
  [profileId CreativeGroup]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeGroups",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body CreativeGroup}))

(defn creativeGroups-patch
  "Updates an existing creative group. This method supports patch semantics.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/creativeGroups/patch

profileId <> 
id <> 
CreativeGroup:
CreativeGroup"
  [profileId id CreativeGroup]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{+profileId}/creativeGroups",
     :uri-template-args {"profileId" profileId},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/dfatrafficking"],
     :body CreativeGroup}))

(defn userProfiles-get
  "Gets one user profile by ID.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/userProfiles/get

profileId <> "
  [profileId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles/{profileId}",
     :uri-template-args {"profileId" profileId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/ddmconversions"
      "https://www.googleapis.com/auth/dfareporting"
      "https://www.googleapis.com/auth/dfatrafficking"]}))

(defn userProfiles-list
  "Retrieves list of user profiles for a user.
https://developers.google.com/doubleclick-advertisers/v4/reference/rest/v4/userProfiles/list"
  []
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://dfareporting.googleapis.com/dfareporting/v4/userprofiles",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/ddmconversions"
      "https://www.googleapis.com/auth/dfareporting"
      "https://www.googleapis.com/auth/dfatrafficking"]}))
