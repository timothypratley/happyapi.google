(ns happyapi.google.youtube-v3
  "YouTube Data API v3
The YouTube Data API v3 is an API that provides access to YouTube data, such as videos, playlists, and channels.
See: https://developers.google.com/youtube/"
  (:require [happyapi.providers.google :as client]))

(defn youtube-v3-updateCommentThreads
  "Updates an existing resource.
https://developers.google.com/youtube/v3/reference/rest/v3/youtube/v3/updateCommentThreads

CommentThread:
CommentThread

optional:
part <string> The *part* parameter specifies a comma-separated list of commentThread resource properties that the API response will include. You must at least include the snippet part in the parameter value since that part contains all of the properties that the API request can update."
  ([CommentThread] (youtube-v3-updateCommentThreads CommentThread nil))
  ([CommentThread optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/commentThreads",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes nil,
       :body CommentThread})))

(defn commentThreads-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/commentThreads/insert

part <> 
CommentThread:
CommentThread"
  [part CommentThread]
  (client/api-request
    {:method :post,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/commentThreads",
     :uri-template-args {},
     :query-params {"part" part},
     :scopes ["https://www.googleapis.com/auth/youtube.force-ssl"],
     :body CommentThread}))

(defn commentThreads-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/commentThreads/list

part <> 

optional:
videoId <string> Returns the comment threads of the specified video.
textFormat <string> The requested text format for the returned comments.
allThreadsRelatedToChannelId <string> Returns the comment threads of all videos of the channel and the channel comments as well.
id <string> Returns the comment threads with the given IDs for Stubby or Apiary.
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
searchTerms <string> Limits the returned comment threads to those matching the specified key words. Not compatible with the 'id' filter.
channelId <string> Returns the comment threads for all the channel comments (ie does not include comments left on videos).
order <string> 
moderationStatus <string> Limits the returned comment threads to those with the specified moderation status. Not compatible with the 'id' filter. Valid values: published, heldForReview, likelySpam."
  ([part] (commentThreads-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/commentThreads",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes ["https://www.googleapis.com/auth/youtube.force-ssl"]})))

(defn captions-delete
  "Deletes a resource.
https://developers.google.com/youtube/v3/reference/rest/v3/captions/delete

id <> 

optional:
onBehalfOf <string> ID of the Google+ Page for the channel that the request is be on behalf of
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([id] (captions-delete id nil))
  ([id optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/captions",
       :uri-template-args {},
       :query-params (merge {"id" id} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn captions-download
  "Downloads a caption track.
https://developers.google.com/youtube/v3/reference/rest/v3/captions/download

id <> 

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
tfmt <string> Convert the captions into this format. Supported options are sbv, srt, and vtt.
onBehalfOf <string> ID of the Google+ Page for the channel that the request is be on behalf of
tlang <string> tlang is the language code; machine translate the captions into this language."
  ([id] (captions-download id nil))
  ([id optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/captions/{id}",
       :uri-template-args {"id" id},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn captions-update
  "Updates an existing resource.
https://developers.google.com/youtube/v3/reference/rest/v3/captions/update

part <> 
Caption:
Caption

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
onBehalfOf <string> ID of the Google+ Page for the channel that the request is on behalf of.
sync <boolean> Extra parameter to allow automatically syncing the uploaded caption/transcript with the audio."
  ([part Caption] (captions-update part Caption nil))
  ([part Caption optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/captions",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body Caption})))

(defn captions-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/captions/insert

part <> 
Caption:
Caption

optional:
sync <boolean> Extra parameter to allow automatically syncing the uploaded caption/transcript with the audio.
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
onBehalfOf <string> ID of the Google+ Page for the channel that the request is be on behalf of"
  ([part Caption] (captions-insert part Caption nil))
  ([part Caption optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/captions",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body Caption})))

(defn captions-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/captions/list

part <> 
videoId <> 

optional:
id <string> Returns the captions with the given IDs for Stubby or Apiary.
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
onBehalfOf <string> ID of the Google+ Page for the channel that the request is on behalf of."
  ([part videoId] (captions-list part videoId nil))
  ([part videoId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/captions",
       :uri-template-args {},
       :query-params (merge {"videoId" videoId, "part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn liveChatModerators-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/liveChatModerators/list

liveChatId <> 
part <> 

optional:
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set."
  ([liveChatId part] (liveChatModerators-list liveChatId part nil))
  ([liveChatId part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/liveChat/moderators",
       :uri-template-args {},
       :query-params
       (merge {"part" part, "liveChatId" liveChatId} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"]})))

(defn liveChatModerators-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/liveChatModerators/insert

part <> 
LiveChatModerator:
LiveChatModerator"
  [part LiveChatModerator]
  (client/api-request
    {:method :post,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/liveChat/moderators",
     :uri-template-args {},
     :query-params {"part" part},
     :scopes
     ["https://www.googleapis.com/auth/youtube"
      "https://www.googleapis.com/auth/youtube.force-ssl"],
     :body LiveChatModerator}))

(defn liveChatModerators-delete
  "Deletes a chat moderator.
https://developers.google.com/youtube/v3/reference/rest/v3/liveChatModerators/delete

id <> "
  [id]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/liveChat/moderators",
     :uri-template-args {},
     :query-params {"id" id},
     :scopes
     ["https://www.googleapis.com/auth/youtube"
      "https://www.googleapis.com/auth/youtube.force-ssl"]}))

(defn members-list
  "Retrieves a list of members that match the request criteria for a channel.
https://developers.google.com/youtube/v3/reference/rest/v3/members/list

part <> 

optional:
mode <string> Parameter that specifies which channel members to return.
filterByMemberChannelId <string> Comma separated list of channel IDs. Only data about members that are part of this list will be included in the response.
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
hasAccessToLevel <string> Filter members in the results set to the ones that have access to a level."
  ([part] (members-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/members",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube.channel-memberships.creator"]})))

(defn thirdPartyLinks-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/thirdPartyLinks/list

part <> 

optional:
externalChannelId <string> Channel ID to which changes should be applied, for delegation.
linkingToken <string> Get a third party link with the given linking token.
type <string> Get a third party link of the given type."
  ([part] (thirdPartyLinks-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/thirdPartyLinks",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes nil})))

(defn thirdPartyLinks-update
  "Updates an existing resource.
https://developers.google.com/youtube/v3/reference/rest/v3/thirdPartyLinks/update

part <> 
ThirdPartyLink:
ThirdPartyLink

optional:
externalChannelId <string> Channel ID to which changes should be applied, for delegation."
  ([part ThirdPartyLink]
    (thirdPartyLinks-update part ThirdPartyLink nil))
  ([part ThirdPartyLink optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/thirdPartyLinks",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes nil,
       :body ThirdPartyLink})))

(defn thirdPartyLinks-delete
  "Deletes a resource.
https://developers.google.com/youtube/v3/reference/rest/v3/thirdPartyLinks/delete

linkingToken <> 
type <> 

optional:
externalChannelId <string> Channel ID to which changes should be applied, for delegation.
part <string> Do not use. Required for compatibility."
  ([linkingToken type] (thirdPartyLinks-delete linkingToken type nil))
  ([linkingToken type optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/thirdPartyLinks",
       :uri-template-args {},
       :query-params
       (merge {"type" type, "linkingToken" linkingToken} optional),
       :scopes nil})))

(defn thirdPartyLinks-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/thirdPartyLinks/insert

part <> 
ThirdPartyLink:
ThirdPartyLink

optional:
externalChannelId <string> Channel ID to which changes should be applied, for delegation."
  ([part ThirdPartyLink]
    (thirdPartyLinks-insert part ThirdPartyLink nil))
  ([part ThirdPartyLink optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/thirdPartyLinks",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes nil,
       :body ThirdPartyLink})))

(defn liveStreams-update
  "Updates an existing stream for the authenticated user.
https://developers.google.com/youtube/v3/reference/rest/v3/liveStreams/update

part <> 
LiveStream:
LiveStream

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel."
  ([part LiveStream] (liveStreams-update part LiveStream nil))
  ([part LiveStream optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/liveStreams",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"],
       :body LiveStream})))

(defn liveStreams-list
  "Retrieve the list of streams associated with the given channel. --
https://developers.google.com/youtube/v3/reference/rest/v3/liveStreams/list

part <> 

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
id <string> Return LiveStreams with the given ids from Stubby or Apiary.
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
mine <boolean> "
  ([part] (liveStreams-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/liveStreams",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"]})))

(defn liveStreams-delete
  "Deletes an existing stream for the authenticated user.
https://developers.google.com/youtube/v3/reference/rest/v3/liveStreams/delete

id <> 

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel."
  ([id] (liveStreams-delete id nil))
  ([id optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/liveStreams",
       :uri-template-args {},
       :query-params (merge {"id" id} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"]})))

(defn liveStreams-insert
  "Inserts a new stream for the authenticated user.
https://developers.google.com/youtube/v3/reference/rest/v3/liveStreams/insert

part <> 
LiveStream:
LiveStream

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel."
  ([part LiveStream] (liveStreams-insert part LiveStream nil))
  ([part LiveStream optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/liveStreams",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"],
       :body LiveStream})))

(defn thumbnails-set
  "As this is not an insert in a strict sense (it supports uploading/setting of a thumbnail for multiple videos, which doesn't result in creation of a single resource), I use a custom verb here.
https://developers.google.com/youtube/v3/reference/rest/v3/thumbnails/set

videoId <> 

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([videoId] (thumbnails-set videoId nil))
  ([videoId optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/thumbnails/set",
       :uri-template-args {},
       :query-params (merge {"videoId" videoId} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.upload"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn membershipsLevels-list
  "Retrieves a list of all pricing levels offered by a creator to the fans.
https://developers.google.com/youtube/v3/reference/rest/v3/membershipsLevels/list

part <> "
  [part]
  (client/api-request
    {:method :get,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/membershipsLevels",
     :uri-template-args {},
     :query-params {"part" part},
     :scopes
     ["https://www.googleapis.com/auth/youtube.channel-memberships.creator"]}))

(defn channelSections-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/channelSections/insert

part <> 
ChannelSection:
ChannelSection

optional:
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part ChannelSection]
    (channelSections-insert part ChannelSection nil))
  ([part ChannelSection optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/channelSections",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body ChannelSection})))

(defn channelSections-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/channelSections/list

part <> 

optional:
channelId <string> Return the ChannelSections owned by the specified channel ID.
mine <boolean> Return the ChannelSections owned by the authenticated user.
id <string> Return the ChannelSections with the given IDs for Stubby or Apiary.
hl <string> Return content in specified language
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part] (channelSections-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/channelSections",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn channelSections-update
  "Updates an existing resource.
https://developers.google.com/youtube/v3/reference/rest/v3/channelSections/update

part <> 
ChannelSection:
ChannelSection

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part ChannelSection]
    (channelSections-update part ChannelSection nil))
  ([part ChannelSection optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/channelSections",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body ChannelSection})))

(defn channelSections-delete
  "Deletes a resource.
https://developers.google.com/youtube/v3/reference/rest/v3/channelSections/delete

id <> 

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([id] (channelSections-delete id nil))
  ([id optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/channelSections",
       :uri-template-args {},
       :query-params (merge {"id" id} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn liveChatMessages-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/liveChatMessages/list

liveChatId <> 
part <> 

optional:
hl <string> Specifies the localization language in which the system messages should be returned.
profileImageSize <integer> Specifies the size of the profile image that should be returned for each user.
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set."
  ([liveChatId part] (liveChatMessages-list liveChatId part nil))
  ([liveChatId part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/liveChat/messages",
       :uri-template-args {},
       :query-params
       (merge {"part" part, "liveChatId" liveChatId} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"]})))

(defn liveChatMessages-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/liveChatMessages/insert

part <> 
LiveChatMessage:
LiveChatMessage"
  [part LiveChatMessage]
  (client/api-request
    {:method :post,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/liveChat/messages",
     :uri-template-args {},
     :query-params {"part" part},
     :scopes
     ["https://www.googleapis.com/auth/youtube"
      "https://www.googleapis.com/auth/youtube.force-ssl"],
     :body LiveChatMessage}))

(defn liveChatMessages-transition
  "Transition a durable chat event.
https://developers.google.com/youtube/v3/reference/rest/v3/liveChatMessages/transition

optional:
status <string> The status to which the chat event is going to transition.
id <string> The ID that uniquely identify the chat message event to transition."
  ([] (liveChatMessages-transition nil))
  ([optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/liveChat/messages/transition",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"]})))

(defn liveChatMessages-delete
  "Deletes a chat message.
https://developers.google.com/youtube/v3/reference/rest/v3/liveChatMessages/delete

id <> "
  [id]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/liveChat/messages",
     :uri-template-args {},
     :query-params {"id" id},
     :scopes
     ["https://www.googleapis.com/auth/youtube"
      "https://www.googleapis.com/auth/youtube.force-ssl"]}))

(defn playlistItems-update
  "Updates an existing resource.
https://developers.google.com/youtube/v3/reference/rest/v3/playlistItems/update

part <> 
PlaylistItem:
PlaylistItem

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part PlaylistItem] (playlistItems-update part PlaylistItem nil))
  ([part PlaylistItem optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/playlistItems",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body PlaylistItem})))

(defn playlistItems-delete
  "Deletes a resource.
https://developers.google.com/youtube/v3/reference/rest/v3/playlistItems/delete

id <> 

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([id] (playlistItems-delete id nil))
  ([id optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/playlistItems",
       :uri-template-args {},
       :query-params (merge {"id" id} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn playlistItems-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/playlistItems/insert

part <> 
PlaylistItem:
PlaylistItem

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part PlaylistItem] (playlistItems-insert part PlaylistItem nil))
  ([part PlaylistItem optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/playlistItems",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body PlaylistItem})))

(defn playlistItems-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/playlistItems/list

part <> 

optional:
playlistId <string> Return the playlist items within the given playlist.
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
id <string> 
videoId <string> Return the playlist items associated with the given video ID.
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part] (playlistItems-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/playlistItems",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn playlistImages-update
  "Updates an existing resource.
https://developers.google.com/youtube/v3/reference/rest/v3/playlistImages/update

PlaylistImage:
PlaylistImage

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
part <string> The *part* parameter specifies the properties that the API response will include."
  ([PlaylistImage] (playlistImages-update PlaylistImage nil))
  ([PlaylistImage optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/playlistImages",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body PlaylistImage})))

(defn playlistImages-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/playlistImages/list

optional:
parent <string> Return PlaylistImages for this playlist id.
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
part <string> The *part* parameter specifies a comma-separated list of one or more playlistImage resource properties that the API response will include. If the parameter identifies a property that contains child properties, the child properties will be included in the response."
  ([] (playlistImages-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/playlistImages",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn playlistImages-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/playlistImages/insert

PlaylistImage:
PlaylistImage

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
part <string> The *part* parameter specifies the properties that the API response will include."
  ([PlaylistImage] (playlistImages-insert PlaylistImage nil))
  ([PlaylistImage optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/playlistImages",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body PlaylistImage})))

(defn playlistImages-delete
  "Deletes a resource.
https://developers.google.com/youtube/v3/reference/rest/v3/playlistImages/delete

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
id <string> Id to identify this image. This is returned from by the List method."
  ([] (playlistImages-delete nil))
  ([optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/playlistImages",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn liveBroadcasts-update
  "Updates an existing broadcast for the authenticated user.
https://developers.google.com/youtube/v3/reference/rest/v3/liveBroadcasts/update

part <> 
LiveBroadcast:
LiveBroadcast

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel."
  ([part LiveBroadcast] (liveBroadcasts-update part LiveBroadcast nil))
  ([part LiveBroadcast optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/liveBroadcasts",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"],
       :body LiveBroadcast})))

(defn liveBroadcasts-transition
  "Transition a broadcast to a given status.
https://developers.google.com/youtube/v3/reference/rest/v3/liveBroadcasts/transition

broadcastStatus <> 
id <> 
part <> 

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel."
  ([broadcastStatus id part]
    (liveBroadcasts-transition broadcastStatus id part nil))
  ([broadcastStatus id part optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/liveBroadcasts/transition",
       :uri-template-args {},
       :query-params
       (merge
         {"broadcastStatus" broadcastStatus, "id" id, "part" part}
         optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"]})))

(defn liveBroadcasts-bind
  "Bind a broadcast to a stream.
https://developers.google.com/youtube/v3/reference/rest/v3/liveBroadcasts/bind

id <> 
part <> 

optional:
streamId <string> Stream to bind, if not set unbind the current one.
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel."
  ([id part] (liveBroadcasts-bind id part nil))
  ([id part optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/liveBroadcasts/bind",
       :uri-template-args {},
       :query-params (merge {"id" id, "part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"]})))

(defn liveBroadcasts-insert
  "Inserts a new stream for the authenticated user.
https://developers.google.com/youtube/v3/reference/rest/v3/liveBroadcasts/insert

part <> 
LiveBroadcast:
LiveBroadcast

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel."
  ([part LiveBroadcast] (liveBroadcasts-insert part LiveBroadcast nil))
  ([part LiveBroadcast optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/liveBroadcasts",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"],
       :body LiveBroadcast})))

(defn liveBroadcasts-list
  "Retrieve the list of broadcasts associated with the given channel.
https://developers.google.com/youtube/v3/reference/rest/v3/liveBroadcasts/list

part <> 

optional:
mine <boolean> 
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
broadcastStatus <string> Return broadcasts with a certain status, e.g. active broadcasts.
id <string> Return broadcasts with the given ids from Stubby or Apiary.
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
broadcastType <string> Return only broadcasts with the selected type.
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part] (liveBroadcasts-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/liveBroadcasts",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"]})))

(defn liveBroadcasts-insertCuepoint
  "Insert cuepoints in a broadcast
https://developers.google.com/youtube/v3/reference/rest/v3/liveBroadcasts/insertCuepoint

Cuepoint:
Cuepoint

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
id <string> Broadcast to insert ads to, or equivalently `external_video_id` for internal use.
part <string> The *part* parameter specifies a comma-separated list of one or more liveBroadcast resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, contentDetails, and status."
  ([Cuepoint] (liveBroadcasts-insertCuepoint Cuepoint nil))
  ([Cuepoint optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/liveBroadcasts/cuepoint",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body Cuepoint})))

(defn liveBroadcasts-delete
  "Delete a given broadcast.
https://developers.google.com/youtube/v3/reference/rest/v3/liveBroadcasts/delete

id <> 

optional:
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([id] (liveBroadcasts-delete id nil))
  ([id optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/liveBroadcasts",
       :uri-template-args {},
       :query-params (merge {"id" id} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"]})))

(defn liveChatBans-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/liveChatBans/insert

part <> 
LiveChatBan:
LiveChatBan"
  [part LiveChatBan]
  (client/api-request
    {:method :post,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/liveChat/bans",
     :uri-template-args {},
     :query-params {"part" part},
     :scopes
     ["https://www.googleapis.com/auth/youtube"
      "https://www.googleapis.com/auth/youtube.force-ssl"],
     :body LiveChatBan}))

(defn liveChatBans-delete
  "Deletes a chat ban.
https://developers.google.com/youtube/v3/reference/rest/v3/liveChatBans/delete

id <> "
  [id]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/liveChat/bans",
     :uri-template-args {},
     :query-params {"id" id},
     :scopes
     ["https://www.googleapis.com/auth/youtube"
      "https://www.googleapis.com/auth/youtube.force-ssl"]}))

(defn activities-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/activities/list

part <> 

optional:
mine <boolean> 
publishedBefore <string> 
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
regionCode <string> 
channelId <string> 
home <boolean> 
publishedAfter <string> "
  ([part] (activities-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/activities",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"]})))

(defn comments-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/comments/insert

part <> 
Comment:
Comment"
  [part Comment]
  (client/api-request
    {:method :post,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/comments",
     :uri-template-args {},
     :query-params {"part" part},
     :scopes ["https://www.googleapis.com/auth/youtube.force-ssl"],
     :body Comment}))

(defn comments-update
  "Updates an existing resource.
https://developers.google.com/youtube/v3/reference/rest/v3/comments/update

part <> 
Comment:
Comment"
  [part Comment]
  (client/api-request
    {:method :put,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/comments",
     :uri-template-args {},
     :query-params {"part" part},
     :scopes ["https://www.googleapis.com/auth/youtube.force-ssl"],
     :body Comment}))

(defn comments-markAsSpam
  "Expresses the caller's opinion that one or more comments should be flagged as spam.
https://developers.google.com/youtube/v3/reference/rest/v3/comments/markAsSpam

id <> "
  [id]
  (client/api-request
    {:method :post,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/comments/markAsSpam",
     :uri-template-args {},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/youtube.force-ssl"]}))

(defn comments-delete
  "Deletes a resource.
https://developers.google.com/youtube/v3/reference/rest/v3/comments/delete

id <> "
  [id]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/comments",
     :uri-template-args {},
     :query-params {"id" id},
     :scopes ["https://www.googleapis.com/auth/youtube.force-ssl"]}))

(defn comments-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/comments/list

part <> 

optional:
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
textFormat <string> The requested text format for the returned comments.
id <string> Returns the comments with the given IDs for One Platform.
parentId <string> Returns replies to the specified comment. Note, currently YouTube features only one level of replies (ie replies to top level comments). However replies to replies may be supported in the future."
  ([part] (comments-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/comments",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes ["https://www.googleapis.com/auth/youtube.force-ssl"]})))

(defn comments-setModerationStatus
  "Sets the moderation status of one or more comments.
https://developers.google.com/youtube/v3/reference/rest/v3/comments/setModerationStatus

id <> 
moderationStatus <> 

optional:
banAuthor <boolean> If set to true the author of the comment gets added to the ban list. This means all future comments of the author will autmomatically be rejected. Only valid in combination with STATUS_REJECTED."
  ([id moderationStatus]
    (comments-setModerationStatus id moderationStatus nil))
  ([id moderationStatus optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/comments/setModerationStatus",
       :uri-template-args {},
       :query-params
       (merge {"moderationStatus" moderationStatus, "id" id} optional),
       :scopes ["https://www.googleapis.com/auth/youtube.force-ssl"]})))

(defn tests-insert
  "POST method.
https://developers.google.com/youtube/v3/reference/rest/v3/tests/insert

part <> 
TestItem:
TestItem

optional:
externalChannelId <string> "
  ([part TestItem] (tests-insert part TestItem nil))
  ([part TestItem optional]
    (client/api-request
      {:method :post,
       :uri-template "https://youtube.googleapis.com/youtube/v3/tests",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes ["https://www.googleapis.com/auth/youtube.readonly"],
       :body TestItem})))

(defn videoCategories-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/videoCategories/list

part <> 

optional:
id <string> Returns the video categories with the given IDs for Stubby or Apiary.
regionCode <string> 
hl <string> "
  ([part] (videoCategories-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/videoCategories",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn channelBanners-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/channelBanners/insert

ChannelBannerResource:
ChannelBannerResource

optional:
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
channelId <string> Unused, channel_id is currently derived from the security context of the requestor.
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([ChannelBannerResource]
    (channelBanners-insert ChannelBannerResource nil))
  ([ChannelBannerResource optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/channelBanners/insert",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.upload"],
       :body ChannelBannerResource})))

(defn i18nRegions-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/i18nRegions/list

part <> 

optional:
hl <string> "
  ([part] (i18nRegions-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/i18nRegions",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn videos-update
  "Updates an existing resource.
https://developers.google.com/youtube/v3/reference/rest/v3/videos/update

part <> 
Video:
Video

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part Video] (videos-update part Video nil))
  ([part Video optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/videos",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body Video})))

(defn videos-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/videos/insert

part <> 
Video:
Video

optional:
notifySubscribers <boolean> Notify the channel subscribers about the new video. As default, the notification is enabled.
autoLevels <boolean> Should auto-levels be applied to the upload.
stabilize <boolean> Should stabilize be applied to the upload.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part Video] (videos-insert part Video nil))
  ([part Video optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/videos",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.upload"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body Video})))

(defn videos-rate
  "Adds a like or dislike rating to a video or removes a rating from a video.
https://developers.google.com/youtube/v3/reference/rest/v3/videos/rate

id <> 
rating <> "
  [id rating]
  (client/api-request
    {:method :post,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/videos/rate",
     :uri-template-args {},
     :query-params {"rating" rating, "id" id},
     :scopes
     ["https://www.googleapis.com/auth/youtube"
      "https://www.googleapis.com/auth/youtube.force-ssl"
      "https://www.googleapis.com/auth/youtubepartner"]}))

(defn videos-getRating
  "Retrieves the ratings that the authorized user gave to a list of specified videos.
https://developers.google.com/youtube/v3/reference/rest/v3/videos/getRating

id <> 

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([id] (videos-getRating id nil))
  ([id optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/videos/getRating",
       :uri-template-args {},
       :query-params (merge {"id" id} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn videos-delete
  "Deletes a resource.
https://developers.google.com/youtube/v3/reference/rest/v3/videos/delete

id <> 

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([id] (videos-delete id nil))
  ([id optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/videos",
       :uri-template-args {},
       :query-params (merge {"id" id} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn videos-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/videos/list

part <> 

optional:
videoCategoryId <string> Use chart that is specific to the specified video category
chart <string> Return the videos that are in the specified chart.
id <string> Return videos with the given ids.
maxHeight <integer> 
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set. *Note:* This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter.
locale <string> 
myRating <string> Return videos liked/disliked by the authenticated user. Does not support RateType.RATED_TYPE_NONE.
regionCode <string> Use a chart that is specific to the specified region
maxWidth <integer> Return the player with maximum height specified in
hl <string> Stands for \"host language\". Specifies the localization language of the metadata to be filled into snippet.localized. The field is filled with the default metadata if there is no localization in the specified language. The parameter value must be a language code included in the list returned by the i18nLanguages.list method (e.g. en_US, es_MX).
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part] (videos-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/videos",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn videos-reportAbuse
  "Report abuse for a video.
https://developers.google.com/youtube/v3/reference/rest/v3/videos/reportAbuse

VideoAbuseReport:
VideoAbuseReport

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([VideoAbuseReport] (videos-reportAbuse VideoAbuseReport nil))
  ([VideoAbuseReport optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/videos/reportAbuse",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body VideoAbuseReport})))

(defn videoAbuseReportReasons-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/videoAbuseReportReasons/list

part <> 

optional:
hl <string> "
  ([part] (videoAbuseReportReasons-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/videoAbuseReportReasons",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"]})))

(defn playlists-delete
  "Deletes a resource.
https://developers.google.com/youtube/v3/reference/rest/v3/playlists/delete

id <> 

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([id] (playlists-delete id nil))
  ([id optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/playlists",
       :uri-template-args {},
       :query-params (merge {"id" id} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn playlists-update
  "Updates an existing resource.
https://developers.google.com/youtube/v3/reference/rest/v3/playlists/update

part <> 
Playlist:
Playlist

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part Playlist] (playlists-update part Playlist nil))
  ([part Playlist optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/playlists",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body Playlist})))

(defn playlists-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/playlists/insert

part <> 
Playlist:
Playlist

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel."
  ([part Playlist] (playlists-insert part Playlist nil))
  ([part Playlist optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/playlists",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body Playlist})))

(defn playlists-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/playlists/list

part <> 

optional:
mine <boolean> Return the playlists owned by the authenticated user.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
id <string> Return the playlists with the given IDs for Stubby or Apiary.
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
channelId <string> Return the playlists owned by the specified channel ID.
hl <string> Return content in specified language
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part] (playlists-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/playlists",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn search-list
  "Retrieves a list of search resources
https://developers.google.com/youtube/v3/reference/rest/v3/search/list

part <> 

optional:
topicId <string> Restrict results to a particular topic.
videoDefinition <string> Filter on the definition of the videos.
q <string> Textual search terms to match.
videoDimension <string> Filter on 3d videos.
videoLicense <string> Filter on the license of the videos.
videoEmbeddable <string> Filter on embeddable videos.
videoCategoryId <string> Filter on videos in a specific category.
eventType <string> Filter on the livestream status of the videos.
videoSyndicated <string> Filter on syndicated videos.
videoDuration <string> Filter on the duration of the videos.
publishedBefore <string> Filter on resources published before this date.
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
location <string> Filter on location of the video
regionCode <string> Display the content as seen by viewers in this country.
videoCaption <string> Filter on the presence of captions on the videos.
relevanceLanguage <string> Return results relevant to this language.
forMine <boolean> Search for the private videos of the authenticated user.
videoType <string> Filter on videos of a specific type.
channelId <string> Filter on resources belonging to this channelId.
forContentOwner <boolean> Search owned by a content owner.
channelType <string> Add a filter on the channel search.
order <string> Sort order of the results.
type <string> Restrict results to a particular set of resource types from One Platform.
locationRadius <string> Filter on distance from the location (specified above).
safeSearch <string> Indicates whether the search results should include restricted content as well as standard content.
videoPaidProductPlacement <string> 
forDeveloper <boolean> Restrict the search to only retrieve videos uploaded using the project id of the authenticated user.
publishedAfter <string> Filter on resources published after this date.
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part] (search-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/search",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn i18nLanguages-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/i18nLanguages/list

part <> 

optional:
hl <string> "
  ([part] (i18nLanguages-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/i18nLanguages",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn abuseReports-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/abuseReports/insert

part <> 
AbuseReport:
AbuseReport"
  [part AbuseReport]
  (client/api-request
    {:method :post,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/abuseReports",
     :uri-template-args {},
     :query-params {"part" part},
     :scopes
     ["https://www.googleapis.com/auth/youtube"
      "https://www.googleapis.com/auth/youtube.force-ssl"],
     :body AbuseReport}))

(defn subscriptions-insert
  "Inserts a new resource into this collection.
https://developers.google.com/youtube/v3/reference/rest/v3/subscriptions/insert

part <> 
Subscription:
Subscription"
  [part Subscription]
  (client/api-request
    {:method :post,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/subscriptions",
     :uri-template-args {},
     :query-params {"part" part},
     :scopes
     ["https://www.googleapis.com/auth/youtube"
      "https://www.googleapis.com/auth/youtube.force-ssl"
      "https://www.googleapis.com/auth/youtubepartner"],
     :body Subscription}))

(defn subscriptions-delete
  "Deletes a resource.
https://developers.google.com/youtube/v3/reference/rest/v3/subscriptions/delete

id <> "
  [id]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://youtube.googleapis.com/youtube/v3/subscriptions",
     :uri-template-args {},
     :query-params {"id" id},
     :scopes
     ["https://www.googleapis.com/auth/youtube"
      "https://www.googleapis.com/auth/youtube.force-ssl"
      "https://www.googleapis.com/auth/youtubepartner"]}))

(defn subscriptions-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/subscriptions/list

part <> 

optional:
myRecentSubscribers <boolean> 
mine <boolean> Flag for returning the subscriptions of the authenticated user.
onBehalfOfContentOwnerChannel <string> This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
id <string> Return the subscriptions with the given IDs for Stubby or Apiary.
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
mySubscribers <boolean> Return the subscribers of the given channel owner.
forChannelId <string> Return the subscriptions to the subset of these channels that the authenticated user is subscribed to.
channelId <string> Return the subscriptions of the given channel owner.
order <string> The order of the returned subscriptions
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part] (subscriptions-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/subscriptions",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn superChatEvents-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/superChatEvents/list

part <> 

optional:
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
hl <string> Return rendered funding amounts in specified language."
  ([part] (superChatEvents-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/superChatEvents",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"]})))

(defn watermarks-set
  "Allows upload of watermark image and setting it for a channel.
https://developers.google.com/youtube/v3/reference/rest/v3/watermarks/set

channelId <> 
InvideoBranding:
InvideoBranding

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([channelId InvideoBranding]
    (watermarks-set channelId InvideoBranding nil))
  ([channelId InvideoBranding optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/watermarks/set",
       :uri-template-args {},
       :query-params (merge {"channelId" channelId} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.upload"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body InvideoBranding})))

(defn watermarks-unset
  "Allows removal of channel watermark.
https://developers.google.com/youtube/v3/reference/rest/v3/watermarks/unset

channelId <> 

optional:
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([channelId] (watermarks-unset channelId nil))
  ([channelId optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/watermarks/unset",
       :uri-template-args {},
       :query-params (merge {"channelId" channelId} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"]})))

(defn channels-update
  "Updates an existing resource.
https://developers.google.com/youtube/v3/reference/rest/v3/channels/update

part <> 
Channel:
Channel

optional:
onBehalfOfContentOwner <string> The *onBehalfOfContentOwner* parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner."
  ([part Channel] (channels-update part Channel nil))
  ([part Channel optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/channels",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtubepartner"],
       :body Channel})))

(defn channels-list
  "Retrieves a list of resources, possibly filtered.
https://developers.google.com/youtube/v3/reference/rest/v3/channels/list

part <> 

optional:
mine <boolean> Return the ids of channels owned by the authenticated user.
forUsername <string> Return the channel associated with a YouTube username.
id <string> Return the channels with the specified IDs.
maxResults <integer> The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
mySubscribers <boolean> Return the channels subscribed to the authenticated user
managedByMe <boolean> Return the channels managed by the authenticated user.
forHandle <string> Return the channel associated with a YouTube handle.
categoryId <string> Return the channels within the specified guide category ID.
hl <string> Stands for \"host language\". Specifies the localization language of the metadata to be filled into snippet.localized. The field is filled with the default metadata if there is no localization in the specified language. The parameter value must be a language code included in the list returned by the i18nLanguages.list method (e.g. en_US, es_MX).
onBehalfOfContentOwner <string> *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."
  ([part] (channels-list part nil))
  ([part optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://youtube.googleapis.com/youtube/v3/channels",
       :uri-template-args {},
       :query-params (merge {"part" part} optional),
       :scopes
       ["https://www.googleapis.com/auth/youtube"
        "https://www.googleapis.com/auth/youtube.force-ssl"
        "https://www.googleapis.com/auth/youtube.readonly"
        "https://www.googleapis.com/auth/youtubepartner"
        "https://www.googleapis.com/auth/youtubepartner-channel-audit"]})))
