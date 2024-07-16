(ns happyapi.google.calendar-v3
  "Calendar API
Manipulates events and other calendar data.
See: https://developers.google.com/calendar"
  (:require [happyapi.providers.google :as client]))

(defn acl-delete
  "Deletes an access control rule.
https://developers.google.com/calendar/v3/reference/rest/v3/acl/delete

calendarId <> 
ruleId <> "
  [calendarId ruleId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/acl/{ruleId}",
     :uri-template-args {"calendarId" calendarId, "ruleId" ruleId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/calendar"]}))

(defn acl-get
  "Returns an access control rule.
https://developers.google.com/calendar/v3/reference/rest/v3/acl/get

calendarId <> 
ruleId <> "
  [calendarId ruleId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/acl/{ruleId}",
     :uri-template-args {"calendarId" calendarId, "ruleId" ruleId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/calendar"
      "https://www.googleapis.com/auth/calendar.readonly"]}))

(defn acl-insert
  "Creates an access control rule.
https://developers.google.com/calendar/v3/reference/rest/v3/acl/insert

calendarId <> 
AclRule:
AclRule

optional:
sendNotifications <boolean> Whether to send notifications about the calendar sharing change. Optional. The default is True."
  ([calendarId AclRule] (acl-insert calendarId AclRule nil))
  ([calendarId AclRule optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/acl",
       :uri-template-args {"calendarId" calendarId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/calendar"],
       :body AclRule})))

(defn acl-list
  "Returns the rules in the access control list for the calendar.
https://developers.google.com/calendar/v3/reference/rest/v3/acl/list

calendarId <> 

optional:
maxResults <integer> Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
showDeleted <boolean> Whether to include deleted ACLs in the result. Deleted ACLs are represented by role equal to \"none\". Deleted ACLs will always be included if syncToken is provided. Optional. The default is False.
syncToken <string> Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. All entries deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False.
If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken.
Learn more about incremental synchronization.
Optional. The default is to return all entries."
  ([calendarId] (acl-list calendarId nil))
  ([calendarId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/acl",
       :uri-template-args {"calendarId" calendarId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/calendar"]})))

(defn acl-patch
  "Updates an access control rule. This method supports patch semantics.
https://developers.google.com/calendar/v3/reference/rest/v3/acl/patch

calendarId <> 
ruleId <> 
AclRule:
AclRule

optional:
sendNotifications <boolean> Whether to send notifications about the calendar sharing change. Note that there are no notifications on access removal. Optional. The default is True."
  ([calendarId ruleId AclRule]
    (acl-patch calendarId ruleId AclRule nil))
  ([calendarId ruleId AclRule optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/acl/{ruleId}",
       :uri-template-args {"calendarId" calendarId, "ruleId" ruleId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/calendar"],
       :body AclRule})))

(defn acl-update
  "Updates an access control rule.
https://developers.google.com/calendar/v3/reference/rest/v3/acl/update

calendarId <> 
ruleId <> 
AclRule:
AclRule

optional:
sendNotifications <boolean> Whether to send notifications about the calendar sharing change. Note that there are no notifications on access removal. Optional. The default is True."
  ([calendarId ruleId AclRule]
    (acl-update calendarId ruleId AclRule nil))
  ([calendarId ruleId AclRule optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/acl/{ruleId}",
       :uri-template-args {"calendarId" calendarId, "ruleId" ruleId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/calendar"],
       :body AclRule})))

(defn acl-watch
  "Watch for changes to ACL resources.
https://developers.google.com/calendar/v3/reference/rest/v3/acl/watch

calendarId <> 
Channel:
Channel

optional:
maxResults <integer> Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
showDeleted <boolean> Whether to include deleted ACLs in the result. Deleted ACLs are represented by role equal to \"none\". Deleted ACLs will always be included if syncToken is provided. Optional. The default is False.
syncToken <string> Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. All entries deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False.
If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken.
Learn more about incremental synchronization.
Optional. The default is to return all entries."
  ([calendarId Channel] (acl-watch calendarId Channel nil))
  ([calendarId Channel optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/acl/watch",
       :uri-template-args {"calendarId" calendarId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/calendar"],
       :body Channel})))

(defn calendarList-delete
  "Removes a calendar from the user's calendar list.
https://developers.google.com/calendar/v3/reference/rest/v3/calendarList/delete

calendarId <> "
  [calendarId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/calendar/v3/users/me/calendarList/{calendarId}",
     :uri-template-args {"calendarId" calendarId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/calendar"]}))

(defn calendarList-get
  "Returns a calendar from the user's calendar list.
https://developers.google.com/calendar/v3/reference/rest/v3/calendarList/get

calendarId <> "
  [calendarId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/calendar/v3/users/me/calendarList/{calendarId}",
     :uri-template-args {"calendarId" calendarId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/calendar"
      "https://www.googleapis.com/auth/calendar.readonly"]}))

(defn calendarList-insert
  "Inserts an existing calendar into the user's calendar list.
https://developers.google.com/calendar/v3/reference/rest/v3/calendarList/insert

CalendarListEntry:
CalendarListEntry

optional:
colorRgbFormat <boolean> Whether to use the foregroundColor and backgroundColor fields to write the calendar colors (RGB). If this feature is used, the index-based colorId field will be set to the best matching option automatically. Optional. The default is False."
  ([CalendarListEntry] (calendarList-insert CalendarListEntry nil))
  ([CalendarListEntry optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://www.googleapis.com/calendar/v3/users/me/calendarList",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/calendar"],
       :body CalendarListEntry})))

(defn calendarList-list
  "Returns the calendars on the user's calendar list.
https://developers.google.com/calendar/v3/reference/rest/v3/calendarList/list

optional:
maxResults <integer> Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
minAccessRole <string> The minimum access role for the user in the returned entries. Optional. The default is no restriction.
showDeleted <boolean> Whether to include deleted calendar list entries in the result. Optional. The default is False.
showHidden <boolean> Whether to show hidden entries. Optional. The default is False.
syncToken <string> Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. If only read-only fields such as calendar properties or ACLs have changed, the entry won't be returned. All entries deleted and hidden since the previous list request will always be in the result set and it is not allowed to set showDeleted neither showHidden to False.
To ensure client state consistency minAccessRole query parameter cannot be specified together with nextSyncToken.
If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken.
Learn more about incremental synchronization.
Optional. The default is to return all entries."
  ([] (calendarList-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/calendar/v3/users/me/calendarList",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.readonly"]})))

(defn calendarList-patch
  "Updates an existing calendar on the user's calendar list. This method supports patch semantics.
https://developers.google.com/calendar/v3/reference/rest/v3/calendarList/patch

calendarId <> 
CalendarListEntry:
CalendarListEntry

optional:
colorRgbFormat <boolean> Whether to use the foregroundColor and backgroundColor fields to write the calendar colors (RGB). If this feature is used, the index-based colorId field will be set to the best matching option automatically. Optional. The default is False."
  ([calendarId CalendarListEntry]
    (calendarList-patch calendarId CalendarListEntry nil))
  ([calendarId CalendarListEntry optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://www.googleapis.com/calendar/v3/users/me/calendarList/{calendarId}",
       :uri-template-args {"calendarId" calendarId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/calendar"],
       :body CalendarListEntry})))

(defn calendarList-update
  "Updates an existing calendar on the user's calendar list.
https://developers.google.com/calendar/v3/reference/rest/v3/calendarList/update

calendarId <> 
CalendarListEntry:
CalendarListEntry

optional:
colorRgbFormat <boolean> Whether to use the foregroundColor and backgroundColor fields to write the calendar colors (RGB). If this feature is used, the index-based colorId field will be set to the best matching option automatically. Optional. The default is False."
  ([calendarId CalendarListEntry]
    (calendarList-update calendarId CalendarListEntry nil))
  ([calendarId CalendarListEntry optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://www.googleapis.com/calendar/v3/users/me/calendarList/{calendarId}",
       :uri-template-args {"calendarId" calendarId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/calendar"],
       :body CalendarListEntry})))

(defn calendarList-watch
  "Watch for changes to CalendarList resources.
https://developers.google.com/calendar/v3/reference/rest/v3/calendarList/watch

Channel:
Channel

optional:
maxResults <integer> Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
minAccessRole <string> The minimum access role for the user in the returned entries. Optional. The default is no restriction.
showDeleted <boolean> Whether to include deleted calendar list entries in the result. Optional. The default is False.
showHidden <boolean> Whether to show hidden entries. Optional. The default is False.
syncToken <string> Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. If only read-only fields such as calendar properties or ACLs have changed, the entry won't be returned. All entries deleted and hidden since the previous list request will always be in the result set and it is not allowed to set showDeleted neither showHidden to False.
To ensure client state consistency minAccessRole query parameter cannot be specified together with nextSyncToken.
If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken.
Learn more about incremental synchronization.
Optional. The default is to return all entries."
  ([Channel] (calendarList-watch Channel nil))
  ([Channel optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://www.googleapis.com/calendar/v3/users/me/calendarList/watch",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.readonly"],
       :body Channel})))

(defn calendars-clear
  "Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account.
https://developers.google.com/calendar/v3/reference/rest/v3/calendars/clear

calendarId <> "
  [calendarId]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/clear",
     :uri-template-args {"calendarId" calendarId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/calendar"]}))

(defn calendars-delete
  "Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars.
https://developers.google.com/calendar/v3/reference/rest/v3/calendars/delete

calendarId <> "
  [calendarId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/calendar/v3/calendars/{calendarId}",
     :uri-template-args {"calendarId" calendarId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/calendar"]}))

(defn calendars-get
  "Returns metadata for a calendar.
https://developers.google.com/calendar/v3/reference/rest/v3/calendars/get

calendarId <> "
  [calendarId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/calendar/v3/calendars/{calendarId}",
     :uri-template-args {"calendarId" calendarId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/calendar"
      "https://www.googleapis.com/auth/calendar.readonly"]}))

(defn calendars-insert
  "Creates a secondary calendar.
https://developers.google.com/calendar/v3/reference/rest/v3/calendars/insert

Calendar:
Calendar"
  [Calendar]
  (client/api-request
    {:method :post,
     :uri-template "https://www.googleapis.com/calendar/v3/calendars",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/calendar"],
     :body Calendar}))

(defn calendars-patch
  "Updates metadata for a calendar. This method supports patch semantics.
https://developers.google.com/calendar/v3/reference/rest/v3/calendars/patch

calendarId <> 
Calendar:
Calendar"
  [calendarId Calendar]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://www.googleapis.com/calendar/v3/calendars/{calendarId}",
     :uri-template-args {"calendarId" calendarId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/calendar"],
     :body Calendar}))

(defn calendars-update
  "Updates metadata for a calendar.
https://developers.google.com/calendar/v3/reference/rest/v3/calendars/update

calendarId <> 
Calendar:
Calendar"
  [calendarId Calendar]
  (client/api-request
    {:method :put,
     :uri-template
     "https://www.googleapis.com/calendar/v3/calendars/{calendarId}",
     :uri-template-args {"calendarId" calendarId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/calendar"],
     :body Calendar}))

(defn channels-stop
  "Stop watching resources through this channel
https://developers.google.com/calendar/v3/reference/rest/v3/channels/stop

Channel:
Channel"
  [Channel]
  (client/api-request
    {:method :post,
     :uri-template
     "https://www.googleapis.com/calendar/v3/channels/stop",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/calendar"
      "https://www.googleapis.com/auth/calendar.events"
      "https://www.googleapis.com/auth/calendar.events.readonly"
      "https://www.googleapis.com/auth/calendar.readonly"
      "https://www.googleapis.com/auth/calendar.settings.readonly"],
     :body Channel}))

(defn colors-get
  "Returns the color definitions for calendars and events.
https://developers.google.com/calendar/v3/reference/rest/v3/colors/get"
  []
  (client/api-request
    {:method :get,
     :uri-template "https://www.googleapis.com/calendar/v3/colors",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/calendar"
      "https://www.googleapis.com/auth/calendar.readonly"]}))

(defn events-list
  "Returns events on the specified calendar.
https://developers.google.com/calendar/v3/reference/rest/v3/events/list

calendarId <> 

optional:
alwaysIncludeEmail <boolean> Deprecated and ignored.
privateExtendedProperty <string> Extended properties constraint specified as propertyName=value. Matches only private properties. This parameter might be repeated multiple times to return events that match all given constraints.
singleEvents <boolean> Whether to expand recurring events into instances and only return single one-off events and instances of recurring events, but not the underlying recurring events themselves. Optional. The default is False.
maxAttendees <integer> The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
sharedExtendedProperty <string> Extended properties constraint specified as propertyName=value. Matches only shared properties. This parameter might be repeated multiple times to return events that match all given constraints.
q <string> Free text search terms to find events that match these terms in the following fields:

- summary 
- description 
- location 
- attendee's displayName 
- attendee's email 
- organizer's displayName 
- organizer's email 
- workingLocationProperties.officeLocation.buildingId 
- workingLocationProperties.officeLocation.deskId 
- workingLocationProperties.officeLocation.label 
- workingLocationProperties.customLocation.label 
These search terms also match predefined keywords against all display title translations of working location, out-of-office, and focus-time events. For example, searching for \"Office\" or \"Bureau\" returns working location events of type officeLocation, whereas searching for \"Out of office\" or \"Abwesend\" returns out-of-office events. Optional.
timeMax <string> Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMin is set, timeMax must be greater than timeMin.
iCalUID <string> Specifies an event ID in the iCalendar format to be provided in the response. Optional. Use this if you want to search for an event by its iCalendar ID.
updatedMin <string> Lower bound for an event's last modification time (as a RFC3339 timestamp) to filter by. When specified, entries deleted since this time will always be included regardless of showDeleted. Optional. The default is not to filter by last modification time.
timeZone <string> Time zone used in the response. Optional. The default is the time zone of the calendar.
maxResults <integer> Maximum number of events returned on one result page. The number of events in the resulting page may be less than this value, or none at all, even if there are more events matching the query. Incomplete pages can be detected by a non-empty nextPageToken field in the response. By default the value is 250 events. The page size can never be larger than 2500 events. Optional.
eventTypes <string> Event types to return. Optional. This parameter can be repeated multiple times to return events of different types. If unset, returns all event types.
orderBy <string> The order of the events returned in the result. Optional. The default is an unspecified, stable order.
timeMin <string> Lower bound (exclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMax is set, timeMin must be smaller than timeMax.
syncToken <string> Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. All events deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False.
There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.

These are: 
- iCalUID 
- orderBy 
- privateExtendedProperty 
- q 
- sharedExtendedProperty 
- timeMin 
- timeMax 
- updatedMin All other query parameters should be the same as for the initial synchronization to avoid undefined behavior. If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken.
Learn more about incremental synchronization.
Optional. The default is to return all entries.
showDeleted <boolean> Whether to include deleted events (with status equals \"cancelled\") in the result. Cancelled instances of recurring events (but not the underlying recurring event) will still be included if showDeleted and singleEvents are both False. If showDeleted and singleEvents are both True, only single instances of deleted events (but not the underlying recurring events) are returned. Optional. The default is False.
showHiddenInvitations <boolean> Whether to include hidden invitations in the result. Optional. The default is False."
  ([calendarId] (events-list calendarId nil))
  ([calendarId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/events",
       :uri-template-args {"calendarId" calendarId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.events"
        "https://www.googleapis.com/auth/calendar.events.readonly"
        "https://www.googleapis.com/auth/calendar.readonly"]})))

(defn events-delete
  "Deletes an event.
https://developers.google.com/calendar/v3/reference/rest/v3/events/delete

calendarId <> 
eventId <> 

optional:
sendNotifications <boolean> Deprecated. Please use sendUpdates instead.

Whether to send notifications about the deletion of the event. Note that some emails might still be sent even if you set the value to false. The default is false.
sendUpdates <string> Guests who should receive notifications about the deletion of the event."
  ([calendarId eventId] (events-delete calendarId eventId nil))
  ([calendarId eventId optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/events/{eventId}",
       :uri-template-args {"calendarId" calendarId, "eventId" eventId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.events"]})))

(defn events-update
  "Updates an event.
https://developers.google.com/calendar/v3/reference/rest/v3/events/update

calendarId <> 
eventId <> 
Event:
Event

optional:
alwaysIncludeEmail <boolean> Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is available (i.e. a generated, non-working value will be provided).
conferenceDataVersion <integer> Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData. The default is 0.
maxAttendees <integer> The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
sendNotifications <boolean> Deprecated. Please use sendUpdates instead.

Whether to send notifications about the event update (for example, description changes, etc.). Note that some emails might still be sent even if you set the value to false. The default is false.
sendUpdates <string> Guests who should receive notifications about the event update (for example, title changes, etc.).
supportsAttachments <boolean> Whether API client performing operation supports event attachments. Optional. The default is False."
  ([calendarId eventId Event]
    (events-update calendarId eventId Event nil))
  ([calendarId eventId Event optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/events/{eventId}",
       :uri-template-args {"calendarId" calendarId, "eventId" eventId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.events"],
       :body Event})))

(defn events-watch
  "Watch for changes to Events resources.
https://developers.google.com/calendar/v3/reference/rest/v3/events/watch

calendarId <> 
Channel:
Channel

optional:
alwaysIncludeEmail <boolean> Deprecated and ignored.
privateExtendedProperty <string> Extended properties constraint specified as propertyName=value. Matches only private properties. This parameter might be repeated multiple times to return events that match all given constraints.
singleEvents <boolean> Whether to expand recurring events into instances and only return single one-off events and instances of recurring events, but not the underlying recurring events themselves. Optional. The default is False.
maxAttendees <integer> The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
sharedExtendedProperty <string> Extended properties constraint specified as propertyName=value. Matches only shared properties. This parameter might be repeated multiple times to return events that match all given constraints.
q <string> Free text search terms to find events that match these terms in the following fields:

- summary 
- description 
- location 
- attendee's displayName 
- attendee's email 
- organizer's displayName 
- organizer's email 
- workingLocationProperties.officeLocation.buildingId 
- workingLocationProperties.officeLocation.deskId 
- workingLocationProperties.officeLocation.label 
- workingLocationProperties.customLocation.label 
These search terms also match predefined keywords against all display title translations of working location, out-of-office, and focus-time events. For example, searching for \"Office\" or \"Bureau\" returns working location events of type officeLocation, whereas searching for \"Out of office\" or \"Abwesend\" returns out-of-office events. Optional.
timeMax <string> Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMin is set, timeMax must be greater than timeMin.
iCalUID <string> Specifies an event ID in the iCalendar format to be provided in the response. Optional. Use this if you want to search for an event by its iCalendar ID.
updatedMin <string> Lower bound for an event's last modification time (as a RFC3339 timestamp) to filter by. When specified, entries deleted since this time will always be included regardless of showDeleted. Optional. The default is not to filter by last modification time.
timeZone <string> Time zone used in the response. Optional. The default is the time zone of the calendar.
maxResults <integer> Maximum number of events returned on one result page. The number of events in the resulting page may be less than this value, or none at all, even if there are more events matching the query. Incomplete pages can be detected by a non-empty nextPageToken field in the response. By default the value is 250 events. The page size can never be larger than 2500 events. Optional.
eventTypes <string> Event types to return. Optional. This parameter can be repeated multiple times to return events of different types. If unset, returns all event types.
orderBy <string> The order of the events returned in the result. Optional. The default is an unspecified, stable order.
timeMin <string> Lower bound (exclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMax is set, timeMin must be smaller than timeMax.
syncToken <string> Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. All events deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False.
There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.

These are: 
- iCalUID 
- orderBy 
- privateExtendedProperty 
- q 
- sharedExtendedProperty 
- timeMin 
- timeMax 
- updatedMin All other query parameters should be the same as for the initial synchronization to avoid undefined behavior. If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken.
Learn more about incremental synchronization.
Optional. The default is to return all entries.
showDeleted <boolean> Whether to include deleted events (with status equals \"cancelled\") in the result. Cancelled instances of recurring events (but not the underlying recurring event) will still be included if showDeleted and singleEvents are both False. If showDeleted and singleEvents are both True, only single instances of deleted events (but not the underlying recurring events) are returned. Optional. The default is False.
showHiddenInvitations <boolean> Whether to include hidden invitations in the result. Optional. The default is False."
  ([calendarId Channel] (events-watch calendarId Channel nil))
  ([calendarId Channel optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/events/watch",
       :uri-template-args {"calendarId" calendarId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.events"
        "https://www.googleapis.com/auth/calendar.events.readonly"
        "https://www.googleapis.com/auth/calendar.readonly"],
       :body Channel})))

(defn events-import
  "Imports an event. This operation is used to add a private copy of an existing event to a calendar. Only events with an eventType of default may be imported.
Deprecated behavior: If a non-default event is imported, its type will be changed to default and any event-type-specific properties it may have will be dropped.
https://developers.google.com/calendar/v3/reference/rest/v3/events/import

calendarId <> 
Event:
Event

optional:
conferenceDataVersion <integer> Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData. The default is 0.
supportsAttachments <boolean> Whether API client performing operation supports event attachments. Optional. The default is False."
  ([calendarId Event] (events-import calendarId Event nil))
  ([calendarId Event optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/events/import",
       :uri-template-args {"calendarId" calendarId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.events"],
       :body Event})))

(defn events-patch
  "Updates an event. This method supports patch semantics.
https://developers.google.com/calendar/v3/reference/rest/v3/events/patch

calendarId <> 
eventId <> 
Event:
Event

optional:
alwaysIncludeEmail <boolean> Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is available (i.e. a generated, non-working value will be provided).
conferenceDataVersion <integer> Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData. The default is 0.
maxAttendees <integer> The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
sendNotifications <boolean> Deprecated. Please use sendUpdates instead.

Whether to send notifications about the event update (for example, description changes, etc.). Note that some emails might still be sent even if you set the value to false. The default is false.
sendUpdates <string> Guests who should receive notifications about the event update (for example, title changes, etc.).
supportsAttachments <boolean> Whether API client performing operation supports event attachments. Optional. The default is False."
  ([calendarId eventId Event]
    (events-patch calendarId eventId Event nil))
  ([calendarId eventId Event optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/events/{eventId}",
       :uri-template-args {"calendarId" calendarId, "eventId" eventId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.events"],
       :body Event})))

(defn events-move
  "Moves an event to another calendar, i.e. changes an event's organizer. Note that only default events can be moved; outOfOffice, focusTime, workingLocation and fromGmail events cannot be moved.
https://developers.google.com/calendar/v3/reference/rest/v3/events/move

calendarId <> 
eventId <> 
destination <> 

optional:
sendNotifications <boolean> Deprecated. Please use sendUpdates instead.

Whether to send notifications about the change of the event's organizer. Note that some emails might still be sent even if you set the value to false. The default is false.
sendUpdates <string> Guests who should receive notifications about the change of the event's organizer."
  ([calendarId eventId destination]
    (events-move calendarId eventId destination nil))
  ([calendarId eventId destination optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/events/{eventId}/move",
       :uri-template-args {"calendarId" calendarId, "eventId" eventId},
       :query-params (merge {"destination" destination} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.events"]})))

(defn events-insert
  "Creates an event.
https://developers.google.com/calendar/v3/reference/rest/v3/events/insert

calendarId <> 
Event:
Event

optional:
conferenceDataVersion <integer> Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData. The default is 0.
maxAttendees <integer> The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
sendNotifications <boolean> Deprecated. Please use sendUpdates instead.

Whether to send notifications about the creation of the new event. Note that some emails might still be sent even if you set the value to false. The default is false.
sendUpdates <string> Whether to send notifications about the creation of the new event. Note that some emails might still be sent. The default is false.
supportsAttachments <boolean> Whether API client performing operation supports event attachments. Optional. The default is False."
  ([calendarId Event] (events-insert calendarId Event nil))
  ([calendarId Event optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/events",
       :uri-template-args {"calendarId" calendarId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.events"],
       :body Event})))

(defn events-quickAdd
  "Creates an event based on a simple text string.
https://developers.google.com/calendar/v3/reference/rest/v3/events/quickAdd

calendarId <> 
text <> 

optional:
sendNotifications <boolean> Deprecated. Please use sendUpdates instead.

Whether to send notifications about the creation of the event. Note that some emails might still be sent even if you set the value to false. The default is false.
sendUpdates <string> Guests who should receive notifications about the creation of the new event."
  ([calendarId text] (events-quickAdd calendarId text nil))
  ([calendarId text optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/events/quickAdd",
       :uri-template-args {"calendarId" calendarId},
       :query-params (merge {"text" text} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.events"]})))

(defn events-instances
  "Returns instances of the specified recurring event.
https://developers.google.com/calendar/v3/reference/rest/v3/events/instances

calendarId <> 
eventId <> 

optional:
alwaysIncludeEmail <boolean> Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is available (i.e. a generated, non-working value will be provided).
maxAttendees <integer> The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
timeMax <string> Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with mandatory time zone offset.
timeZone <string> Time zone used in the response. Optional. The default is the time zone of the calendar.
originalStart <string> The original start time of the instance in the result. Optional.
maxResults <integer> Maximum number of events returned on one result page. By default the value is 250 events. The page size can never be larger than 2500 events. Optional.
timeMin <string> Lower bound (inclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with mandatory time zone offset.
showDeleted <boolean> Whether to include deleted events (with status equals \"cancelled\") in the result. Cancelled instances of recurring events will still be included if singleEvents is False. Optional. The default is False."
  ([calendarId eventId] (events-instances calendarId eventId nil))
  ([calendarId eventId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/events/{eventId}/instances",
       :uri-template-args {"calendarId" calendarId, "eventId" eventId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.events"
        "https://www.googleapis.com/auth/calendar.events.readonly"
        "https://www.googleapis.com/auth/calendar.readonly"]})))

(defn events-get
  "Returns an event based on its Google Calendar ID. To retrieve an event using its iCalendar ID, call the events.list method using the iCalUID parameter.
https://developers.google.com/calendar/v3/reference/rest/v3/events/get

calendarId <> 
eventId <> 

optional:
alwaysIncludeEmail <boolean> Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is available (i.e. a generated, non-working value will be provided).
maxAttendees <integer> The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
timeZone <string> Time zone used in the response. Optional. The default is the time zone of the calendar."
  ([calendarId eventId] (events-get calendarId eventId nil))
  ([calendarId eventId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/calendar/v3/calendars/{calendarId}/events/{eventId}",
       :uri-template-args {"calendarId" calendarId, "eventId" eventId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.events"
        "https://www.googleapis.com/auth/calendar.events.readonly"
        "https://www.googleapis.com/auth/calendar.readonly"]})))

(defn freebusy-query
  "Returns free/busy information for a set of calendars.
https://developers.google.com/calendar/v3/reference/rest/v3/freebusy/query

FreeBusyRequest:
FreeBusyRequest"
  [FreeBusyRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://www.googleapis.com/calendar/v3/freeBusy",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/calendar"
      "https://www.googleapis.com/auth/calendar.readonly"],
     :body FreeBusyRequest}))

(defn settings-get
  "Returns a single user setting.
https://developers.google.com/calendar/v3/reference/rest/v3/settings/get

setting <> "
  [setting]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/calendar/v3/users/me/settings/{setting}",
     :uri-template-args {"setting" setting},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/calendar"
      "https://www.googleapis.com/auth/calendar.readonly"
      "https://www.googleapis.com/auth/calendar.settings.readonly"]}))

(defn settings-list
  "Returns all user settings for the authenticated user.
https://developers.google.com/calendar/v3/reference/rest/v3/settings/list

optional:
maxResults <integer> Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
syncToken <string> Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then.
If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken.
Learn more about incremental synchronization.
Optional. The default is to return all entries."
  ([] (settings-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://www.googleapis.com/calendar/v3/users/me/settings",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.readonly"
        "https://www.googleapis.com/auth/calendar.settings.readonly"]})))

(defn settings-watch
  "Watch for changes to Settings resources.
https://developers.google.com/calendar/v3/reference/rest/v3/settings/watch

Channel:
Channel

optional:
maxResults <integer> Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
syncToken <string> Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then.
If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken.
Learn more about incremental synchronization.
Optional. The default is to return all entries."
  ([Channel] (settings-watch Channel nil))
  ([Channel optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://www.googleapis.com/calendar/v3/users/me/settings/watch",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/calendar"
        "https://www.googleapis.com/auth/calendar.readonly"
        "https://www.googleapis.com/auth/calendar.settings.readonly"],
       :body Channel})))
