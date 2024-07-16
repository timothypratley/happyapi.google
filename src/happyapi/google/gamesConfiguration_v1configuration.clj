(ns happyapi.google.gamesConfiguration-v1configuration
  "Google Play Game Services Publishing API
The Google Play Game Services Publishing API allows developers to configure their games in Game Services.
See: https://games.withgoogle.com/"
  (:require [happyapi.providers.google :as client]))

(defn achievementConfigurations-delete
  "Delete the achievement configuration with the given ID.
https://games.withgoogle.com/v1configuration/reference/rest/v1configuration/achievementConfigurations/delete

achievementId <> "
  [achievementId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://gamesconfiguration.googleapis.com/games/v1configuration/achievements/{achievementId}",
     :uri-template-args {"achievementId" achievementId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn achievementConfigurations-get
  "Retrieves the metadata of the achievement configuration with the given ID.
https://games.withgoogle.com/v1configuration/reference/rest/v1configuration/achievementConfigurations/get

achievementId <> "
  [achievementId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://gamesconfiguration.googleapis.com/games/v1configuration/achievements/{achievementId}",
     :uri-template-args {"achievementId" achievementId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn achievementConfigurations-insert
  "Insert a new achievement configuration in this application.
https://games.withgoogle.com/v1configuration/reference/rest/v1configuration/achievementConfigurations/insert

applicationId <> 
AchievementConfiguration:
AchievementConfiguration"
  [applicationId AchievementConfiguration]
  (client/api-request
    {:method :post,
     :uri-template
     "https://gamesconfiguration.googleapis.com/games/v1configuration/applications/{applicationId}/achievements",
     :uri-template-args {"applicationId" applicationId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body AchievementConfiguration}))

(defn achievementConfigurations-list
  "Returns a list of the achievement configurations in this application.
https://games.withgoogle.com/v1configuration/reference/rest/v1configuration/achievementConfigurations/list

applicationId <> 

optional:
maxResults <integer> The maximum number of resource configurations to return in the response, used for paging. For any response, the actual number of resources returned may be less than the specified `maxResults`."
  ([applicationId] (achievementConfigurations-list applicationId nil))
  ([applicationId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gamesconfiguration.googleapis.com/games/v1configuration/applications/{applicationId}/achievements",
       :uri-template-args {"applicationId" applicationId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn achievementConfigurations-update
  "Update the metadata of the achievement configuration with the given ID.
https://games.withgoogle.com/v1configuration/reference/rest/v1configuration/achievementConfigurations/update

achievementId <> 
AchievementConfiguration:
AchievementConfiguration"
  [achievementId AchievementConfiguration]
  (client/api-request
    {:method :put,
     :uri-template
     "https://gamesconfiguration.googleapis.com/games/v1configuration/achievements/{achievementId}",
     :uri-template-args {"achievementId" achievementId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body AchievementConfiguration}))

(defn leaderboardConfigurations-delete
  "Delete the leaderboard configuration with the given ID.
https://games.withgoogle.com/v1configuration/reference/rest/v1configuration/leaderboardConfigurations/delete

leaderboardId <> "
  [leaderboardId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://gamesconfiguration.googleapis.com/games/v1configuration/leaderboards/{leaderboardId}",
     :uri-template-args {"leaderboardId" leaderboardId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn leaderboardConfigurations-get
  "Retrieves the metadata of the leaderboard configuration with the given ID.
https://games.withgoogle.com/v1configuration/reference/rest/v1configuration/leaderboardConfigurations/get

leaderboardId <> "
  [leaderboardId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://gamesconfiguration.googleapis.com/games/v1configuration/leaderboards/{leaderboardId}",
     :uri-template-args {"leaderboardId" leaderboardId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn leaderboardConfigurations-insert
  "Insert a new leaderboard configuration in this application.
https://games.withgoogle.com/v1configuration/reference/rest/v1configuration/leaderboardConfigurations/insert

applicationId <> 
LeaderboardConfiguration:
LeaderboardConfiguration"
  [applicationId LeaderboardConfiguration]
  (client/api-request
    {:method :post,
     :uri-template
     "https://gamesconfiguration.googleapis.com/games/v1configuration/applications/{applicationId}/leaderboards",
     :uri-template-args {"applicationId" applicationId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body LeaderboardConfiguration}))

(defn leaderboardConfigurations-list
  "Returns a list of the leaderboard configurations in this application.
https://games.withgoogle.com/v1configuration/reference/rest/v1configuration/leaderboardConfigurations/list

applicationId <> 

optional:
maxResults <integer> The maximum number of resource configurations to return in the response, used for paging. For any response, the actual number of resources returned may be less than the specified `maxResults`."
  ([applicationId] (leaderboardConfigurations-list applicationId nil))
  ([applicationId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gamesconfiguration.googleapis.com/games/v1configuration/applications/{applicationId}/leaderboards",
       :uri-template-args {"applicationId" applicationId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidpublisher"]})))

(defn leaderboardConfigurations-update
  "Update the metadata of the leaderboard configuration with the given ID.
https://games.withgoogle.com/v1configuration/reference/rest/v1configuration/leaderboardConfigurations/update

leaderboardId <> 
LeaderboardConfiguration:
LeaderboardConfiguration"
  [leaderboardId LeaderboardConfiguration]
  (client/api-request
    {:method :put,
     :uri-template
     "https://gamesconfiguration.googleapis.com/games/v1configuration/leaderboards/{leaderboardId}",
     :uri-template-args {"leaderboardId" leaderboardId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body LeaderboardConfiguration}))
