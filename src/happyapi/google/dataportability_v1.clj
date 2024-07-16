(ns happyapi.google.dataportability-v1
  "Data Portability API
The Data Portability API lets you build applications that request authorization from a user to move a copy of data from Google services into your application. This enables data portability and facilitates switching services.
See: https://developers.google.com/data-portability"
  (:require [happyapi.providers.google :as client]))

(defn archiveJobs-getPortabilityArchiveState
  "Retrieves the state of an Archive job for the Portability API.
https://developers.google.com/data-portability/v1/reference/rest/v1/archiveJobs/getPortabilityArchiveState

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dataportability.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/dataportability.businessmessaging.conversations"
      "https://www.googleapis.com/auth/dataportability.chrome.autofill"
      "https://www.googleapis.com/auth/dataportability.chrome.bookmarks"
      "https://www.googleapis.com/auth/dataportability.chrome.dictionary"
      "https://www.googleapis.com/auth/dataportability.chrome.extensions"
      "https://www.googleapis.com/auth/dataportability.chrome.history"
      "https://www.googleapis.com/auth/dataportability.chrome.reading_list"
      "https://www.googleapis.com/auth/dataportability.chrome.settings"
      "https://www.googleapis.com/auth/dataportability.discover.follows"
      "https://www.googleapis.com/auth/dataportability.discover.likes"
      "https://www.googleapis.com/auth/dataportability.discover.not_interested"
      "https://www.googleapis.com/auth/dataportability.maps.aliased_places"
      "https://www.googleapis.com/auth/dataportability.maps.commute_routes"
      "https://www.googleapis.com/auth/dataportability.maps.commute_settings"
      "https://www.googleapis.com/auth/dataportability.maps.ev_profile"
      "https://www.googleapis.com/auth/dataportability.maps.factual_contributions"
      "https://www.googleapis.com/auth/dataportability.maps.offering_contributions"
      "https://www.googleapis.com/auth/dataportability.maps.photos_videos"
      "https://www.googleapis.com/auth/dataportability.maps.questions_answers"
      "https://www.googleapis.com/auth/dataportability.maps.reviews"
      "https://www.googleapis.com/auth/dataportability.maps.starred_places"
      "https://www.googleapis.com/auth/dataportability.myactivity.maps"
      "https://www.googleapis.com/auth/dataportability.myactivity.myadcenter"
      "https://www.googleapis.com/auth/dataportability.myactivity.play"
      "https://www.googleapis.com/auth/dataportability.myactivity.search"
      "https://www.googleapis.com/auth/dataportability.myactivity.shopping"
      "https://www.googleapis.com/auth/dataportability.myactivity.youtube"
      "https://www.googleapis.com/auth/dataportability.mymaps.maps"
      "https://www.googleapis.com/auth/dataportability.order_reserve.purchases_reservations"
      "https://www.googleapis.com/auth/dataportability.play.devices"
      "https://www.googleapis.com/auth/dataportability.play.grouping"
      "https://www.googleapis.com/auth/dataportability.play.installs"
      "https://www.googleapis.com/auth/dataportability.play.library"
      "https://www.googleapis.com/auth/dataportability.play.playpoints"
      "https://www.googleapis.com/auth/dataportability.play.promotions"
      "https://www.googleapis.com/auth/dataportability.play.purchases"
      "https://www.googleapis.com/auth/dataportability.play.redemptions"
      "https://www.googleapis.com/auth/dataportability.play.subscriptions"
      "https://www.googleapis.com/auth/dataportability.play.usersettings"
      "https://www.googleapis.com/auth/dataportability.saved.collections"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.reviews_and_stars"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.streaming_video_providers"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.thumbs"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.watched"
      "https://www.googleapis.com/auth/dataportability.searchnotifications.settings"
      "https://www.googleapis.com/auth/dataportability.searchnotifications.subscriptions"
      "https://www.googleapis.com/auth/dataportability.shopping.addresses"
      "https://www.googleapis.com/auth/dataportability.shopping.reviews"
      "https://www.googleapis.com/auth/dataportability.streetview.imagery"
      "https://www.googleapis.com/auth/dataportability.youtube.channel"
      "https://www.googleapis.com/auth/dataportability.youtube.comments"
      "https://www.googleapis.com/auth/dataportability.youtube.live_chat"
      "https://www.googleapis.com/auth/dataportability.youtube.music"
      "https://www.googleapis.com/auth/dataportability.youtube.playable"
      "https://www.googleapis.com/auth/dataportability.youtube.posts"
      "https://www.googleapis.com/auth/dataportability.youtube.private_playlists"
      "https://www.googleapis.com/auth/dataportability.youtube.private_videos"
      "https://www.googleapis.com/auth/dataportability.youtube.public_playlists"
      "https://www.googleapis.com/auth/dataportability.youtube.public_videos"
      "https://www.googleapis.com/auth/dataportability.youtube.shopping"
      "https://www.googleapis.com/auth/dataportability.youtube.subscriptions"
      "https://www.googleapis.com/auth/dataportability.youtube.unlisted_playlists"
      "https://www.googleapis.com/auth/dataportability.youtube.unlisted_videos"]}))

(defn archiveJobs-retry
  "Retries a failed Portability Archive job.
https://developers.google.com/data-portability/v1/reference/rest/v1/archiveJobs/retry

name <> 
RetryPortabilityArchiveRequest:
RetryPortabilityArchiveRequest"
  [name RetryPortabilityArchiveRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dataportability.googleapis.com/v1/{+name}:retry",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/dataportability.businessmessaging.conversations"
      "https://www.googleapis.com/auth/dataportability.chrome.autofill"
      "https://www.googleapis.com/auth/dataportability.chrome.bookmarks"
      "https://www.googleapis.com/auth/dataportability.chrome.dictionary"
      "https://www.googleapis.com/auth/dataportability.chrome.extensions"
      "https://www.googleapis.com/auth/dataportability.chrome.history"
      "https://www.googleapis.com/auth/dataportability.chrome.reading_list"
      "https://www.googleapis.com/auth/dataportability.chrome.settings"
      "https://www.googleapis.com/auth/dataportability.discover.follows"
      "https://www.googleapis.com/auth/dataportability.discover.likes"
      "https://www.googleapis.com/auth/dataportability.discover.not_interested"
      "https://www.googleapis.com/auth/dataportability.maps.aliased_places"
      "https://www.googleapis.com/auth/dataportability.maps.commute_routes"
      "https://www.googleapis.com/auth/dataportability.maps.commute_settings"
      "https://www.googleapis.com/auth/dataportability.maps.ev_profile"
      "https://www.googleapis.com/auth/dataportability.maps.factual_contributions"
      "https://www.googleapis.com/auth/dataportability.maps.offering_contributions"
      "https://www.googleapis.com/auth/dataportability.maps.photos_videos"
      "https://www.googleapis.com/auth/dataportability.maps.questions_answers"
      "https://www.googleapis.com/auth/dataportability.maps.reviews"
      "https://www.googleapis.com/auth/dataportability.maps.starred_places"
      "https://www.googleapis.com/auth/dataportability.myactivity.maps"
      "https://www.googleapis.com/auth/dataportability.myactivity.myadcenter"
      "https://www.googleapis.com/auth/dataportability.myactivity.play"
      "https://www.googleapis.com/auth/dataportability.myactivity.search"
      "https://www.googleapis.com/auth/dataportability.myactivity.shopping"
      "https://www.googleapis.com/auth/dataportability.myactivity.youtube"
      "https://www.googleapis.com/auth/dataportability.mymaps.maps"
      "https://www.googleapis.com/auth/dataportability.order_reserve.purchases_reservations"
      "https://www.googleapis.com/auth/dataportability.play.devices"
      "https://www.googleapis.com/auth/dataportability.play.grouping"
      "https://www.googleapis.com/auth/dataportability.play.installs"
      "https://www.googleapis.com/auth/dataportability.play.library"
      "https://www.googleapis.com/auth/dataportability.play.playpoints"
      "https://www.googleapis.com/auth/dataportability.play.promotions"
      "https://www.googleapis.com/auth/dataportability.play.purchases"
      "https://www.googleapis.com/auth/dataportability.play.redemptions"
      "https://www.googleapis.com/auth/dataportability.play.subscriptions"
      "https://www.googleapis.com/auth/dataportability.play.usersettings"
      "https://www.googleapis.com/auth/dataportability.saved.collections"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.reviews_and_stars"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.streaming_video_providers"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.thumbs"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.watched"
      "https://www.googleapis.com/auth/dataportability.searchnotifications.settings"
      "https://www.googleapis.com/auth/dataportability.searchnotifications.subscriptions"
      "https://www.googleapis.com/auth/dataportability.shopping.addresses"
      "https://www.googleapis.com/auth/dataportability.shopping.reviews"
      "https://www.googleapis.com/auth/dataportability.streetview.imagery"
      "https://www.googleapis.com/auth/dataportability.youtube.channel"
      "https://www.googleapis.com/auth/dataportability.youtube.comments"
      "https://www.googleapis.com/auth/dataportability.youtube.live_chat"
      "https://www.googleapis.com/auth/dataportability.youtube.music"
      "https://www.googleapis.com/auth/dataportability.youtube.playable"
      "https://www.googleapis.com/auth/dataportability.youtube.posts"
      "https://www.googleapis.com/auth/dataportability.youtube.private_playlists"
      "https://www.googleapis.com/auth/dataportability.youtube.private_videos"
      "https://www.googleapis.com/auth/dataportability.youtube.public_playlists"
      "https://www.googleapis.com/auth/dataportability.youtube.public_videos"
      "https://www.googleapis.com/auth/dataportability.youtube.shopping"
      "https://www.googleapis.com/auth/dataportability.youtube.subscriptions"
      "https://www.googleapis.com/auth/dataportability.youtube.unlisted_playlists"
      "https://www.googleapis.com/auth/dataportability.youtube.unlisted_videos"],
     :body RetryPortabilityArchiveRequest}))

(defn portabilityArchive-initiate
  "Initiates a new Archive job for the Portability API.
https://developers.google.com/data-portability/v1/reference/rest/v1/portabilityArchive/initiate

InitiatePortabilityArchiveRequest:
InitiatePortabilityArchiveRequest"
  [InitiatePortabilityArchiveRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dataportability.googleapis.com/v1/portabilityArchive:initiate",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/dataportability.businessmessaging.conversations"
      "https://www.googleapis.com/auth/dataportability.chrome.autofill"
      "https://www.googleapis.com/auth/dataportability.chrome.bookmarks"
      "https://www.googleapis.com/auth/dataportability.chrome.dictionary"
      "https://www.googleapis.com/auth/dataportability.chrome.extensions"
      "https://www.googleapis.com/auth/dataportability.chrome.history"
      "https://www.googleapis.com/auth/dataportability.chrome.reading_list"
      "https://www.googleapis.com/auth/dataportability.chrome.settings"
      "https://www.googleapis.com/auth/dataportability.discover.follows"
      "https://www.googleapis.com/auth/dataportability.discover.likes"
      "https://www.googleapis.com/auth/dataportability.discover.not_interested"
      "https://www.googleapis.com/auth/dataportability.maps.aliased_places"
      "https://www.googleapis.com/auth/dataportability.maps.commute_routes"
      "https://www.googleapis.com/auth/dataportability.maps.commute_settings"
      "https://www.googleapis.com/auth/dataportability.maps.ev_profile"
      "https://www.googleapis.com/auth/dataportability.maps.factual_contributions"
      "https://www.googleapis.com/auth/dataportability.maps.offering_contributions"
      "https://www.googleapis.com/auth/dataportability.maps.photos_videos"
      "https://www.googleapis.com/auth/dataportability.maps.questions_answers"
      "https://www.googleapis.com/auth/dataportability.maps.reviews"
      "https://www.googleapis.com/auth/dataportability.maps.starred_places"
      "https://www.googleapis.com/auth/dataportability.myactivity.maps"
      "https://www.googleapis.com/auth/dataportability.myactivity.myadcenter"
      "https://www.googleapis.com/auth/dataportability.myactivity.play"
      "https://www.googleapis.com/auth/dataportability.myactivity.search"
      "https://www.googleapis.com/auth/dataportability.myactivity.shopping"
      "https://www.googleapis.com/auth/dataportability.myactivity.youtube"
      "https://www.googleapis.com/auth/dataportability.mymaps.maps"
      "https://www.googleapis.com/auth/dataportability.order_reserve.purchases_reservations"
      "https://www.googleapis.com/auth/dataportability.play.devices"
      "https://www.googleapis.com/auth/dataportability.play.grouping"
      "https://www.googleapis.com/auth/dataportability.play.installs"
      "https://www.googleapis.com/auth/dataportability.play.library"
      "https://www.googleapis.com/auth/dataportability.play.playpoints"
      "https://www.googleapis.com/auth/dataportability.play.promotions"
      "https://www.googleapis.com/auth/dataportability.play.purchases"
      "https://www.googleapis.com/auth/dataportability.play.redemptions"
      "https://www.googleapis.com/auth/dataportability.play.subscriptions"
      "https://www.googleapis.com/auth/dataportability.play.usersettings"
      "https://www.googleapis.com/auth/dataportability.saved.collections"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.reviews_and_stars"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.streaming_video_providers"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.thumbs"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.watched"
      "https://www.googleapis.com/auth/dataportability.searchnotifications.settings"
      "https://www.googleapis.com/auth/dataportability.searchnotifications.subscriptions"
      "https://www.googleapis.com/auth/dataportability.shopping.addresses"
      "https://www.googleapis.com/auth/dataportability.shopping.reviews"
      "https://www.googleapis.com/auth/dataportability.streetview.imagery"
      "https://www.googleapis.com/auth/dataportability.youtube.channel"
      "https://www.googleapis.com/auth/dataportability.youtube.comments"
      "https://www.googleapis.com/auth/dataportability.youtube.live_chat"
      "https://www.googleapis.com/auth/dataportability.youtube.music"
      "https://www.googleapis.com/auth/dataportability.youtube.playable"
      "https://www.googleapis.com/auth/dataportability.youtube.posts"
      "https://www.googleapis.com/auth/dataportability.youtube.private_playlists"
      "https://www.googleapis.com/auth/dataportability.youtube.private_videos"
      "https://www.googleapis.com/auth/dataportability.youtube.public_playlists"
      "https://www.googleapis.com/auth/dataportability.youtube.public_videos"
      "https://www.googleapis.com/auth/dataportability.youtube.shopping"
      "https://www.googleapis.com/auth/dataportability.youtube.subscriptions"
      "https://www.googleapis.com/auth/dataportability.youtube.unlisted_playlists"
      "https://www.googleapis.com/auth/dataportability.youtube.unlisted_videos"],
     :body InitiatePortabilityArchiveRequest}))

(defn authorization-reset
  "Revokes OAuth tokens and resets exhausted scopes for a user/project pair. This method allows you to initiate a request after a new consent is granted. This method also indicates that previous archives can be garbage collected. You should call this method when all jobs are complete and all archives are downloaded. Do not call it only when you start a new job.
https://developers.google.com/data-portability/v1/reference/rest/v1/authorization/reset

ResetAuthorizationRequest:
ResetAuthorizationRequest"
  [ResetAuthorizationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dataportability.googleapis.com/v1/authorization:reset",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/dataportability.businessmessaging.conversations"
      "https://www.googleapis.com/auth/dataportability.chrome.autofill"
      "https://www.googleapis.com/auth/dataportability.chrome.bookmarks"
      "https://www.googleapis.com/auth/dataportability.chrome.dictionary"
      "https://www.googleapis.com/auth/dataportability.chrome.extensions"
      "https://www.googleapis.com/auth/dataportability.chrome.history"
      "https://www.googleapis.com/auth/dataportability.chrome.reading_list"
      "https://www.googleapis.com/auth/dataportability.chrome.settings"
      "https://www.googleapis.com/auth/dataportability.discover.follows"
      "https://www.googleapis.com/auth/dataportability.discover.likes"
      "https://www.googleapis.com/auth/dataportability.discover.not_interested"
      "https://www.googleapis.com/auth/dataportability.maps.aliased_places"
      "https://www.googleapis.com/auth/dataportability.maps.commute_routes"
      "https://www.googleapis.com/auth/dataportability.maps.commute_settings"
      "https://www.googleapis.com/auth/dataportability.maps.ev_profile"
      "https://www.googleapis.com/auth/dataportability.maps.factual_contributions"
      "https://www.googleapis.com/auth/dataportability.maps.offering_contributions"
      "https://www.googleapis.com/auth/dataportability.maps.photos_videos"
      "https://www.googleapis.com/auth/dataportability.maps.questions_answers"
      "https://www.googleapis.com/auth/dataportability.maps.reviews"
      "https://www.googleapis.com/auth/dataportability.maps.starred_places"
      "https://www.googleapis.com/auth/dataportability.myactivity.maps"
      "https://www.googleapis.com/auth/dataportability.myactivity.myadcenter"
      "https://www.googleapis.com/auth/dataportability.myactivity.play"
      "https://www.googleapis.com/auth/dataportability.myactivity.search"
      "https://www.googleapis.com/auth/dataportability.myactivity.shopping"
      "https://www.googleapis.com/auth/dataportability.myactivity.youtube"
      "https://www.googleapis.com/auth/dataportability.mymaps.maps"
      "https://www.googleapis.com/auth/dataportability.order_reserve.purchases_reservations"
      "https://www.googleapis.com/auth/dataportability.play.devices"
      "https://www.googleapis.com/auth/dataportability.play.grouping"
      "https://www.googleapis.com/auth/dataportability.play.installs"
      "https://www.googleapis.com/auth/dataportability.play.library"
      "https://www.googleapis.com/auth/dataportability.play.playpoints"
      "https://www.googleapis.com/auth/dataportability.play.promotions"
      "https://www.googleapis.com/auth/dataportability.play.purchases"
      "https://www.googleapis.com/auth/dataportability.play.redemptions"
      "https://www.googleapis.com/auth/dataportability.play.subscriptions"
      "https://www.googleapis.com/auth/dataportability.play.usersettings"
      "https://www.googleapis.com/auth/dataportability.saved.collections"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.reviews_and_stars"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.streaming_video_providers"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.thumbs"
      "https://www.googleapis.com/auth/dataportability.search_ugc.media.watched"
      "https://www.googleapis.com/auth/dataportability.searchnotifications.settings"
      "https://www.googleapis.com/auth/dataportability.searchnotifications.subscriptions"
      "https://www.googleapis.com/auth/dataportability.shopping.addresses"
      "https://www.googleapis.com/auth/dataportability.shopping.reviews"
      "https://www.googleapis.com/auth/dataportability.streetview.imagery"
      "https://www.googleapis.com/auth/dataportability.youtube.channel"
      "https://www.googleapis.com/auth/dataportability.youtube.comments"
      "https://www.googleapis.com/auth/dataportability.youtube.live_chat"
      "https://www.googleapis.com/auth/dataportability.youtube.music"
      "https://www.googleapis.com/auth/dataportability.youtube.playable"
      "https://www.googleapis.com/auth/dataportability.youtube.posts"
      "https://www.googleapis.com/auth/dataportability.youtube.private_playlists"
      "https://www.googleapis.com/auth/dataportability.youtube.private_videos"
      "https://www.googleapis.com/auth/dataportability.youtube.public_playlists"
      "https://www.googleapis.com/auth/dataportability.youtube.public_videos"
      "https://www.googleapis.com/auth/dataportability.youtube.shopping"
      "https://www.googleapis.com/auth/dataportability.youtube.subscriptions"
      "https://www.googleapis.com/auth/dataportability.youtube.unlisted_playlists"
      "https://www.googleapis.com/auth/dataportability.youtube.unlisted_videos"],
     :body ResetAuthorizationRequest}))