(ns happyapi.google.games-v1
  "Google Play Game Services
The Google Play games service allows developers to enhance games with social leaderboards, achievements, game state, sign-in with Google, and more.
See: https://games.withgoogle.com/")

(defn leaderboards-get
  "Retrieves the metadata of the leaderboard with the given ID.
https://games.withgoogle.com/v1/reference/rest/v1/leaderboards/get

leaderboardId <> 

optional:
language <string> The preferred language to use for strings returned by this method."
  ([leaderboardId] (leaderboards-get leaderboardId nil))
  ([leaderboardId optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/leaderboards/{leaderboardId}",
     :uri-template-args {"leaderboardId" leaderboardId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn leaderboards-list
  "Lists all the leaderboard metadata for your application.
https://games.withgoogle.com/v1/reference/rest/v1/leaderboards/list

optional:
language <string> The preferred language to use for strings returned by this method.
maxResults <integer> The maximum number of leaderboards to return in the response. For any response, the actual number of leaderboards returned may be less than the specified `maxResults`."
  ([] (leaderboards-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/leaderboards",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn recall-linkPersona
  "Associate the PGS Player principal encoded in the provided recall session id with an in-game account
https://games.withgoogle.com/v1/reference/rest/v1/recall/linkPersona

LinkPersonaRequest:
LinkPersonaRequest"
  [LinkPersonaRequest]
  {:method :post,
   :uri-template
   "https://games.googleapis.com/games/v1/recall:linkPersona",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/androidpublisher"],
   :body LinkPersonaRequest})

(defn recall-retrieveTokens
  "Retrieve all Recall tokens associated with the PGS Player encoded in the provided recall session id. The API is only available for users that have active PGS Player profile.
https://games.withgoogle.com/v1/reference/rest/v1/recall/retrieveTokens

sessionId <> "
  [sessionId]
  {:method :get,
   :uri-template
   "https://games.googleapis.com/games/v1/recall/tokens/{sessionId}",
   :uri-template-args {"sessionId" sessionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/androidpublisher"]})

(defn recall-lastTokenFromAllDeveloperGames
  "Retrieve the last Recall token from all developer games that is associated with the PGS Player encoded in the provided recall session id. The API is only available for users that have active PGS Player profile.
https://games.withgoogle.com/v1/reference/rest/v1/recall/lastTokenFromAllDeveloperGames

sessionId <> "
  [sessionId]
  {:method :get,
   :uri-template
   "https://games.googleapis.com/games/v1/recall/developerGamesLastPlayerToken/{sessionId}",
   :uri-template-args {"sessionId" sessionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/androidpublisher"]})

(defn recall-gamesPlayerTokens
  "Retrieve the Recall tokens from all requested games that is associated with the PGS Player encoded in the provided recall session id. The API is only available for users that have an active PGS Player profile.
https://games.withgoogle.com/v1/reference/rest/v1/recall/gamesPlayerTokens

sessionId <> 

optional:
applicationIds <string> Required. The application IDs from the Google Play developer console for the games to return scoped ids for."
  ([sessionId] (recall-gamesPlayerTokens sessionId nil))
  ([sessionId optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/recall/gamesPlayerTokens/{sessionId}",
     :uri-template-args {"sessionId" sessionId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn recall-unlinkPersona
  "Delete a Recall token linking the PGS Player principal identified by the Recall session and an in-game account identified either by the 'persona' or by the token value.
https://games.withgoogle.com/v1/reference/rest/v1/recall/unlinkPersona

UnlinkPersonaRequest:
UnlinkPersonaRequest"
  [UnlinkPersonaRequest]
  {:method :post,
   :uri-template
   "https://games.googleapis.com/games/v1/recall:unlinkPersona",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/androidpublisher"],
   :body UnlinkPersonaRequest})

(defn recall-resetPersona
  "Delete all Recall tokens linking the given persona to any player (with or without a profile).
https://games.withgoogle.com/v1/reference/rest/v1/recall/resetPersona

ResetPersonaRequest:
ResetPersonaRequest"
  [ResetPersonaRequest]
  {:method :post,
   :uri-template
   "https://games.googleapis.com/games/v1/recall:resetPersona",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/androidpublisher"],
   :body ResetPersonaRequest})

(defn applications-get
  "Retrieves the metadata of the application with the given ID. If the requested application is not available for the specified `platformType`, the returned response will not include any instance data.
https://games.withgoogle.com/v1/reference/rest/v1/applications/get

applicationId <> 

optional:
language <string> The preferred language to use for strings returned by this method.
platformType <string> Restrict application details returned to the specific platform."
  ([applicationId] (applications-get applicationId nil))
  ([applicationId optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/applications/{applicationId}",
     :uri-template-args {"applicationId" applicationId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn applications-played
  "Indicate that the currently authenticated user is playing your application.
https://games.withgoogle.com/v1/reference/rest/v1/applications/played"
  []
  {:method :post,
   :uri-template
   "https://games.googleapis.com/games/v1/applications/played",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn applications-verify
  "Verifies the auth token provided with this request is for the application with the specified ID, and returns the ID of the player it was granted for.
https://games.withgoogle.com/v1/reference/rest/v1/applications/verify

applicationId <> "
  [applicationId]
  {:method :get,
   :uri-template
   "https://games.googleapis.com/games/v1/applications/{applicationId}/verify",
   :uri-template-args {"applicationId" applicationId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn applications-getEndPoint
  "Returns a URL for the requested end point type.
https://games.withgoogle.com/v1/reference/rest/v1/applications/getEndPoint

optional:
applicationId <string> The application ID from the Google Play developer console.
endPointType <string> Type of endpoint being requested."
  ([] (applications-getEndPoint nil))
  ([optional]
    {:method :post,
     :uri-template
     "https://games.googleapis.com/games/v1/applications/getEndPoint",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn players-get
  "Retrieves the Player resource with the given ID. To retrieve the player for the currently authenticated user, set `playerId` to `me`.
https://games.withgoogle.com/v1/reference/rest/v1/players/get

playerId <> 

optional:
language <string> The preferred language to use for strings returned by this method.
playerIdConsistencyToken <string> Consistency token of the player id. The call returns a 'not found' result when the token is present and invalid. Empty value is ignored. See also GlobalPlayerIdConsistencyTokenProto"
  ([playerId] (players-get playerId nil))
  ([playerId optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/players/{playerId}",
     :uri-template-args {"playerId" playerId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn players-getScopedPlayerIds
  "Retrieves scoped player identifiers for currently authenticated user.
https://games.withgoogle.com/v1/reference/rest/v1/players/getScopedPlayerIds"
  []
  {:method :get,
   :uri-template
   "https://games.googleapis.com/games/v1/players/me/scopedIds",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn players-getMultipleApplicationPlayerIds
  "Get the application player ids for the currently authenticated player across all requested games by the same developer as the calling application. This will only return ids for players that actually have an id (scoped or otherwise) with that game.
https://games.withgoogle.com/v1/reference/rest/v1/players/getMultipleApplicationPlayerIds

optional:
applicationIds <string> Required. The application IDs from the Google Play developer console for the games to return scoped ids for."
  ([] (players-getMultipleApplicationPlayerIds nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/players/me/multipleApplicationPlayerIds",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn players-list
  "Get the collection of players for the currently authenticated user.
https://games.withgoogle.com/v1/reference/rest/v1/players/list

collection <> 

optional:
language <string> The preferred language to use for strings returned by this method.
maxResults <integer> The maximum number of player resources to return in the response, used for paging. For any response, the actual number of player resources returned may be less than the specified `maxResults`."
  ([collection] (players-list collection nil))
  ([collection optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/players/me/players/{collection}",
     :uri-template-args {"collection" collection},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn achievements-increment
  "Increments the steps of the achievement with the given ID for the currently authenticated player.
https://games.withgoogle.com/v1/reference/rest/v1/achievements/increment

achievementId <> 
stepsToIncrement <> 

optional:
requestId <string> A randomly generated numeric ID for each request specified by the caller. This number is used at the server to ensure that the request is handled correctly across retries."
  ([achievementId stepsToIncrement]
    (achievements-increment achievementId stepsToIncrement nil))
  ([achievementId stepsToIncrement optional]
    {:method :post,
     :uri-template
     "https://games.googleapis.com/games/v1/achievements/{achievementId}/increment",
     :uri-template-args {"achievementId" achievementId},
     :query-params
     (merge {"stepsToIncrement" stepsToIncrement} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn achievements-list
  "Lists the progress for all your application's achievements for the currently authenticated player.
https://games.withgoogle.com/v1/reference/rest/v1/achievements/list

playerId <> 

optional:
language <string> The preferred language to use for strings returned by this method.
maxResults <integer> The maximum number of achievement resources to return in the response, used for paging. For any response, the actual number of achievement resources returned may be less than the specified `maxResults`.
state <string> Tells the server to return only achievements with the specified state. If this parameter isn't specified, all achievements are returned."
  ([playerId] (achievements-list playerId nil))
  ([playerId optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/players/{playerId}/achievements",
     :uri-template-args {"playerId" playerId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn achievements-reveal
  "Sets the state of the achievement with the given ID to `REVEALED` for the currently authenticated player.
https://games.withgoogle.com/v1/reference/rest/v1/achievements/reveal

achievementId <> "
  [achievementId]
  {:method :post,
   :uri-template
   "https://games.googleapis.com/games/v1/achievements/{achievementId}/reveal",
   :uri-template-args {"achievementId" achievementId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn achievements-setStepsAtLeast
  "Sets the steps for the currently authenticated player towards unlocking an achievement. If the steps parameter is less than the current number of steps that the player already gained for the achievement, the achievement is not modified.
https://games.withgoogle.com/v1/reference/rest/v1/achievements/setStepsAtLeast

achievementId <> 
steps <> "
  [achievementId steps]
  {:method :post,
   :uri-template
   "https://games.googleapis.com/games/v1/achievements/{achievementId}/setStepsAtLeast",
   :uri-template-args {"achievementId" achievementId},
   :query-params {"steps" steps},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn achievements-unlock
  "Unlocks this achievement for the currently authenticated player.
https://games.withgoogle.com/v1/reference/rest/v1/achievements/unlock

achievementId <> "
  [achievementId]
  {:method :post,
   :uri-template
   "https://games.googleapis.com/games/v1/achievements/{achievementId}/unlock",
   :uri-template-args {"achievementId" achievementId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn achievements-updateMultiple
  "Updates multiple achievements for the currently authenticated player.
https://games.withgoogle.com/v1/reference/rest/v1/achievements/updateMultiple

AchievementUpdateMultipleRequest:
AchievementUpdateMultipleRequest"
  [AchievementUpdateMultipleRequest]
  {:method :post,
   :uri-template
   "https://games.googleapis.com/games/v1/achievements/updateMultiple",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"],
   :body AchievementUpdateMultipleRequest})

(defn events-listByPlayer
  "Returns a list showing the current progress on events in this application for the currently authenticated user.
https://games.withgoogle.com/v1/reference/rest/v1/events/listByPlayer

optional:
language <string> The preferred language to use for strings returned by this method.
maxResults <integer> The maximum number of events to return in the response, used for paging. For any response, the actual number of events to return may be less than the specified maxResults."
  ([] (events-listByPlayer nil))
  ([optional]
    {:method :get,
     :uri-template "https://games.googleapis.com/games/v1/events",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn events-listDefinitions
  "Returns a list of the event definitions in this application.
https://games.withgoogle.com/v1/reference/rest/v1/events/listDefinitions

optional:
language <string> The preferred language to use for strings returned by this method.
maxResults <integer> The maximum number of event definitions to return in the response, used for paging. For any response, the actual number of event definitions to return may be less than the specified `maxResults`."
  ([] (events-listDefinitions nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/eventDefinitions",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn events-record
  "Records a batch of changes to the number of times events have occurred for the currently authenticated user of this application.
https://games.withgoogle.com/v1/reference/rest/v1/events/record

EventRecordRequest:
EventRecordRequest

optional:
language <string> The preferred language to use for strings returned by this method."
  ([EventRecordRequest] (events-record EventRecordRequest nil))
  ([EventRecordRequest optional]
    {:method :post,
     :uri-template "https://games.googleapis.com/games/v1/events",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"],
     :body EventRecordRequest}))

(defn metagame-getMetagameConfig
  "Return the metagame configuration data for the calling application.
https://games.withgoogle.com/v1/reference/rest/v1/metagame/getMetagameConfig"
  []
  {:method :get,
   :uri-template
   "https://games.googleapis.com/games/v1/metagameConfig",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn metagame-listCategoriesByPlayer
  "List play data aggregated per category for the player corresponding to `playerId`.
https://games.withgoogle.com/v1/reference/rest/v1/metagame/listCategoriesByPlayer

playerId <> 
collection <> 

optional:
language <string> The preferred language to use for strings returned by this method.
maxResults <integer> The maximum number of category resources to return in the response, used for paging. For any response, the actual number of category resources returned may be less than the specified `maxResults`."
  ([playerId collection]
    (metagame-listCategoriesByPlayer playerId collection nil))
  ([playerId collection optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/players/{playerId}/categories/{collection}",
     :uri-template-args {"playerId" playerId, "collection" collection},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn achievementDefinitions-list
  "Lists all the achievement definitions for your application.
https://games.withgoogle.com/v1/reference/rest/v1/achievementDefinitions/list

optional:
language <string> The preferred language to use for strings returned by this method.
maxResults <integer> The maximum number of achievement resources to return in the response, used for paging. For any response, the actual number of achievement resources returned may be less than the specified `maxResults`."
  ([] (achievementDefinitions-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/achievements",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn revisions-check
  "Checks whether the games client is out of date.
https://games.withgoogle.com/v1/reference/rest/v1/revisions/check

clientRevision <> "
  [clientRevision]
  {:method :get,
   :uri-template
   "https://games.googleapis.com/games/v1/revisions/check",
   :uri-template-args {},
   :query-params {"clientRevision" clientRevision},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn snapshots-get
  "Retrieves the metadata for a given snapshot ID.
https://games.withgoogle.com/v1/reference/rest/v1/snapshots/get

snapshotId <> 

optional:
language <string> The preferred language to use for strings returned by this method."
  ([snapshotId] (snapshots-get snapshotId nil))
  ([snapshotId optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/snapshots/{snapshotId}",
     :uri-template-args {"snapshotId" snapshotId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.appdata"
      "https://www.googleapis.com/auth/games"]}))

(defn snapshots-list
  "Retrieves a list of snapshots created by your application for the player corresponding to the player ID.
https://games.withgoogle.com/v1/reference/rest/v1/snapshots/list

playerId <> 

optional:
language <string> The preferred language to use for strings returned by this method.
maxResults <integer> The maximum number of snapshot resources to return in the response, used for paging. For any response, the actual number of snapshot resources returned may be less than the specified `maxResults`."
  ([playerId] (snapshots-list playerId nil))
  ([playerId optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/players/{playerId}/snapshots",
     :uri-template-args {"playerId" playerId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.appdata"
      "https://www.googleapis.com/auth/games"]}))

(defn accesstokens-generatePlayGroupingApiToken
  "Generates a Play Grouping API token for the PGS user identified by the attached credential.
https://games.withgoogle.com/v1/reference/rest/v1/accesstokens/generatePlayGroupingApiToken

optional:
packageName <string> Required. App package name to generate the token for (e.g. com.example.mygame).
persona <string> Required. Persona to associate with the token. Persona is a developer-provided stable identifier of the user. Must be deterministically generated (e.g. as a one-way hash) from the user account ID and user profile ID (if the app has the concept), according to the developer's own user identity system."
  ([] (accesstokens-generatePlayGroupingApiToken nil))
  ([optional]
    {:method :post,
     :uri-template
     "https://games.googleapis.com/games/v1/accesstokens/generatePlayGroupingApiToken",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn accesstokens-generateRecallPlayGroupingApiToken
  "Generates a Play Grouping API token for the PGS user identified by the Recall session ID provided in the request.
https://games.withgoogle.com/v1/reference/rest/v1/accesstokens/generateRecallPlayGroupingApiToken

optional:
packageName <string> Required. App package name to generate the token for (e.g. com.example.mygame).
persona <string> Required. Persona to associate with the token. Persona is a developer-provided stable identifier of the user. Must be deterministically generated (e.g. as a one-way hash) from the user account ID and user profile ID (if the app has the concept), according to the developer's own user identity system.
recallSessionId <string> Required. Opaque server-generated string that encodes all the necessary information to identify the PGS player / Google user and application. See https://developer.android.com/games/pgs/recall/recall-setup on how to integrate with Recall and get session ID."
  ([] (accesstokens-generateRecallPlayGroupingApiToken nil))
  ([optional]
    {:method :post,
     :uri-template
     "https://games.googleapis.com/games/v1/accesstokens/generateRecallPlayGroupingApiToken",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/androidpublisher"]}))

(defn stats-get
  "Returns engagement and spend statistics in this application for the currently authenticated user.
https://games.withgoogle.com/v1/reference/rest/v1/stats/get"
  []
  {:method :get,
   :uri-template "https://games.googleapis.com/games/v1/stats",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/games"]})

(defn scores-get
  "Get high scores, and optionally ranks, in leaderboards for the currently authenticated player. For a specific time span, `leaderboardId` can be set to `ALL` to retrieve data for all leaderboards in a given time span. `NOTE: You cannot ask for 'ALL' leaderboards and 'ALL' timeSpans in the same request; only one parameter may be set to 'ALL'.
https://games.withgoogle.com/v1/reference/rest/v1/scores/get

playerId <> 
leaderboardId <> 
timeSpan <> 

optional:
language <string> The preferred language to use for strings returned by this method.
includeRankType <string> The types of ranks to return. If the parameter is omitted, no ranks will be returned.
maxResults <integer> The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than the specified `maxResults`."
  ([playerId leaderboardId timeSpan]
    (scores-get playerId leaderboardId timeSpan nil))
  ([playerId leaderboardId timeSpan optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/players/{playerId}/leaderboards/{leaderboardId}/scores/{timeSpan}",
     :uri-template-args
     {"playerId" playerId,
      "leaderboardId" leaderboardId,
      "timeSpan" timeSpan},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn scores-list
  "Lists the scores in a leaderboard, starting from the top.
https://games.withgoogle.com/v1/reference/rest/v1/scores/list

leaderboardId <> 
collection <> 
timeSpan <> 

optional:
language <string> The preferred language to use for strings returned by this method.
maxResults <integer> The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than the specified `maxResults`."
  ([leaderboardId collection timeSpan]
    (scores-list leaderboardId collection timeSpan nil))
  ([leaderboardId collection timeSpan optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/leaderboards/{leaderboardId}/scores/{collection}",
     :uri-template-args
     {"leaderboardId" leaderboardId, "collection" collection},
     :query-params (merge {"timeSpan" timeSpan} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn scores-listWindow
  "Lists the scores in a leaderboard around (and including) a player's score.
https://games.withgoogle.com/v1/reference/rest/v1/scores/listWindow

leaderboardId <> 
collection <> 
timeSpan <> 

optional:
language <string> The preferred language to use for strings returned by this method.
maxResults <integer> The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than the specified `maxResults`.
resultsAbove <integer> The preferred number of scores to return above the player's score. More scores may be returned if the player is at the bottom of the leaderboard; fewer may be returned if the player is at the top. Must be less than or equal to maxResults.
returnTopIfAbsent <boolean> True if the top scores should be returned when the player is not in the leaderboard. Defaults to true."
  ([leaderboardId collection timeSpan]
    (scores-listWindow leaderboardId collection timeSpan nil))
  ([leaderboardId collection timeSpan optional]
    {:method :get,
     :uri-template
     "https://games.googleapis.com/games/v1/leaderboards/{leaderboardId}/window/{collection}",
     :uri-template-args
     {"leaderboardId" leaderboardId, "collection" collection},
     :query-params (merge {"timeSpan" timeSpan} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn scores-submit
  "Submits a score to the specified leaderboard.
https://games.withgoogle.com/v1/reference/rest/v1/scores/submit

leaderboardId <> 
score <> 

optional:
language <string> The preferred language to use for strings returned by this method.
scoreTag <string> Additional information about the score you're submitting. Values must contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986."
  ([leaderboardId score] (scores-submit leaderboardId score nil))
  ([leaderboardId score optional]
    {:method :post,
     :uri-template
     "https://games.googleapis.com/games/v1/leaderboards/{leaderboardId}/scores",
     :uri-template-args {"leaderboardId" leaderboardId},
     :query-params (merge {"score" score} optional),
     :scopes ["https://www.googleapis.com/auth/games"]}))

(defn scores-submitMultiple
  "Submits multiple scores to leaderboards.
https://games.withgoogle.com/v1/reference/rest/v1/scores/submitMultiple

PlayerScoreSubmissionList:
PlayerScoreSubmissionList

optional:
language <string> The preferred language to use for strings returned by this method."
  ([PlayerScoreSubmissionList]
    (scores-submitMultiple PlayerScoreSubmissionList nil))
  ([PlayerScoreSubmissionList optional]
    {:method :post,
     :uri-template
     "https://games.googleapis.com/games/v1/leaderboards/scores",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/games"],
     :body PlayerScoreSubmissionList}))
