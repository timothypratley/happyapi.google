(ns happyapi.google.gamesManagement-v1management
  "Google Play Game Management
The Google Play Game Management API allows developers to manage resources from the Google Play Game service.
See: https://games.withgoogle.com/")

(defn achievements-reset
  "Resets the achievement with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your application.
https://games.withgoogle.com/v1management/reference/rest/v1management/achievements/reset

achievementId <> "
  [achievementId]
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/achievements/{achievementId}/reset",
   :uri-template-args {"achievementId" achievementId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn achievements-resetAll
  "Resets all achievements for the currently authenticated player for your application. This method is only accessible to whitelisted tester accounts for your application.
https://games.withgoogle.com/v1management/reference/rest/v1management/achievements/resetAll"
  []
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/achievements/reset",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn achievements-resetAllForAllPlayers
  "Resets all draft achievements for all players. This method is only available to user accounts for your developer console.
https://games.withgoogle.com/v1management/reference/rest/v1management/achievements/resetAllForAllPlayers"
  []
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/achievements/resetAllForAllPlayers",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn achievements-resetForAllPlayers
  "Resets the achievement with the given ID for all players. This method is only available to user accounts for your developer console. Only draft achievements can be reset.
https://games.withgoogle.com/v1management/reference/rest/v1management/achievements/resetForAllPlayers

achievementId <> "
  [achievementId]
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/achievements/{achievementId}/resetForAllPlayers",
   :uri-template-args {"achievementId" achievementId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn achievements-resetMultipleForAllPlayers
  "Resets achievements with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft achievements may be reset.
https://games.withgoogle.com/v1management/reference/rest/v1management/achievements/resetMultipleForAllPlayers

AchievementResetMultipleForAllRequest:
AchievementResetMultipleForAllRequest"
  [AchievementResetMultipleForAllRequest]
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/achievements/resetMultipleForAllPlayers",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"],
   :body AchievementResetMultipleForAllRequest})

(defn events-reset
  "Resets all player progress on the event with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your application.
https://games.withgoogle.com/v1management/reference/rest/v1management/events/reset

eventId <> "
  [eventId]
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/events/{eventId}/reset",
   :uri-template-args {"eventId" eventId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn events-resetAll
  "Resets all player progress on all events for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your application.
https://games.withgoogle.com/v1management/reference/rest/v1management/events/resetAll"
  []
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/events/reset",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn events-resetAllForAllPlayers
  "Resets all draft events for all players. This method is only available to user accounts for your developer console.
https://games.withgoogle.com/v1management/reference/rest/v1management/events/resetAllForAllPlayers"
  []
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/events/resetAllForAllPlayers",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn events-resetForAllPlayers
  "Resets the event with the given ID for all players. This method is only available to user accounts for your developer console. Only draft events can be reset.
https://games.withgoogle.com/v1management/reference/rest/v1management/events/resetForAllPlayers

eventId <> "
  [eventId]
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/events/{eventId}/resetForAllPlayers",
   :uri-template-args {"eventId" eventId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn events-resetMultipleForAllPlayers
  "Resets events with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft events may be reset.
https://games.withgoogle.com/v1management/reference/rest/v1management/events/resetMultipleForAllPlayers

EventsResetMultipleForAllRequest:
EventsResetMultipleForAllRequest"
  [EventsResetMultipleForAllRequest]
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/events/resetMultipleForAllPlayers",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"],
   :body EventsResetMultipleForAllRequest})

(defn players-hide
  "Hide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console.
https://games.withgoogle.com/v1management/reference/rest/v1management/players/hide

applicationId <> 
playerId <> "
  [applicationId playerId]
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/applications/{applicationId}/players/hidden/{playerId}",
   :uri-template-args
   {"applicationId" applicationId, "playerId" playerId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn players-unhide
  "Unhide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console.
https://games.withgoogle.com/v1management/reference/rest/v1management/players/unhide

applicationId <> 
playerId <> "
  [applicationId playerId]
  {:method :delete,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/applications/{applicationId}/players/hidden/{playerId}",
   :uri-template-args
   {"applicationId" applicationId, "playerId" playerId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn applications-listHidden
  "Get the list of players hidden from the given application. This method is only available to user accounts for your developer console.
https://games.withgoogle.com/v1management/reference/rest/v1management/applications/listHidden

applicationId <> 

optional:
maxResults <integer> The maximum number of player resources to return in the response, used for paging. For any response, the actual number of player resources returned may be less than the specified `maxResults`."
  ([applicationId] (applications-listHidden applicationId nil))
  ([applicationId optional]
    {:method :get,
     :uri-template
     "https://gamesmanagement.googleapis.com/games/v1management/applications/{applicationId}/players/hidden",
     :uri-template-args {"applicationId" applicationId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn scores-reset
  "Resets scores for the leaderboard with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your application.
https://games.withgoogle.com/v1management/reference/rest/v1management/scores/reset

leaderboardId <> "
  [leaderboardId]
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/leaderboards/{leaderboardId}/scores/reset",
   :uri-template-args {"leaderboardId" leaderboardId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn scores-resetAll
  "Resets all scores for all leaderboards for the currently authenticated players. This method is only accessible to whitelisted tester accounts for your application.
https://games.withgoogle.com/v1management/reference/rest/v1management/scores/resetAll"
  []
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/scores/reset",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn scores-resetAllForAllPlayers
  "Resets scores for all draft leaderboards for all players. This method is only available to user accounts for your developer console.
https://games.withgoogle.com/v1management/reference/rest/v1management/scores/resetAllForAllPlayers"
  []
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/scores/resetAllForAllPlayers",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn scores-resetForAllPlayers
  "Resets scores for the leaderboard with the given ID for all players. This method is only available to user accounts for your developer console. Only draft leaderboards can be reset.
https://games.withgoogle.com/v1management/reference/rest/v1management/scores/resetForAllPlayers

leaderboardId <> "
  [leaderboardId]
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/leaderboards/{leaderboardId}/scores/resetForAllPlayers",
   :uri-template-args {"leaderboardId" leaderboardId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn scores-resetMultipleForAllPlayers
  "Resets scores for the leaderboards with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft leaderboards may be reset.
https://games.withgoogle.com/v1management/reference/rest/v1management/scores/resetMultipleForAllPlayers

ScoresResetMultipleForAllRequest:
ScoresResetMultipleForAllRequest"
  [ScoresResetMultipleForAllRequest]
  {:method :post,
   :uri-template
   "https://gamesmanagement.googleapis.com/games/v1management/scores/resetMultipleForAllPlayers",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"],
   :body ScoresResetMultipleForAllRequest})
