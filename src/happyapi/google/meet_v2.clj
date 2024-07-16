(ns happyapi.google.meet-v2
  "Google Meet API
Create and manage meetings in Google Meet.
See: https://developers.google.com/meet/api/guides/overview"
  (:require [happyapi.providers.google :as client]))

(defn conferenceRecords-get
  "Gets a conference record by conference ID.
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/conferenceRecords/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://meet.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/meetings.space.created"
      "https://www.googleapis.com/auth/meetings.space.readonly"]}))

(defn conferenceRecords-list
  "Lists the conference records. By default, ordered by start time and in descending order.
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/conferenceRecords/list

optional:
filter <string> Optional. User specified filtering condition in [EBNF format](https://en.wikipedia.org/wiki/Extended_Backus%E2%80%93Naur_form). The following are the filterable fields: * `space.meeting_code` * `space.name` * `start_time` * `end_time` For example, consider the following filters: * `space.name = \"spaces/NAME\"` * `space.meeting_code = \"abc-mnop-xyz\"` * `start_time>=\"2024-01-01T00:00:00.000Z\" AND start_time<=\"2024-01-02T00:00:00.000Z\"` * `end_time IS NULL`
pageSize <integer> Optional. Maximum number of conference records to return. The service might return fewer than this value. If unspecified, at most 25 conference records are returned. The maximum value is 100; values above 100 are coerced to 100. Maximum might change in the future."
  ([] (conferenceRecords-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://meet.googleapis.com/v2/conferenceRecords",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/meetings.space.created"
        "https://www.googleapis.com/auth/meetings.space.readonly"]})))

(defn conferenceRecords-participants-get
  "Gets a participant by participant ID.
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/conferenceRecords/participants/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://meet.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/meetings.space.created"
      "https://www.googleapis.com/auth/meetings.space.readonly"]}))

(defn conferenceRecords-participants-list
  "Lists the participants in a conference record. By default, ordered by join time and in descending order. This API supports `fields` as standard parameters like every other API. However, when the `fields` request parameter is omitted, this API defaults to `'participants/*, next_page_token'`.
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/conferenceRecords/participants/list

parent <> 

optional:
pageSize <integer> Maximum number of participants to return. The service might return fewer than this value. If unspecified, at most 100 participants are returned. The maximum value is 250; values above 250 are coerced to 250. Maximum might change in the future.
filter <string> Optional. User specified filtering condition in [EBNF format](https://en.wikipedia.org/wiki/Extended_Backus%E2%80%93Naur_form). The following are the filterable fields: * `earliest_start_time` * `latest_end_time` For example, `latest_end_time IS NULL` returns active participants in the conference."
  ([parent] (conferenceRecords-participants-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://meet.googleapis.com/v2/{+parent}/participants",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/meetings.space.created"
        "https://www.googleapis.com/auth/meetings.space.readonly"]})))

(defn conferenceRecords-participants-participantSessions-list
  "Lists the participant sessions of a participant in a conference record. By default, ordered by join time and in descending order. This API supports `fields` as standard parameters like every other API. However, when the `fields` request parameter is omitted this API defaults to `'participantsessions/*, next_page_token'`.
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/conferenceRecords/participants/participantSessions/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of participant sessions to return. The service might return fewer than this value. If unspecified, at most 100 participants are returned. The maximum value is 250; values above 250 are coerced to 250. Maximum might change in the future.
filter <string> Optional. User specified filtering condition in [EBNF format](https://en.wikipedia.org/wiki/Extended_Backus%E2%80%93Naur_form). The following are the filterable fields: * `start_time` * `end_time` For example, `end_time IS NULL` returns active participant sessions in the conference record."
  ([parent]
    (conferenceRecords-participants-participantSessions-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://meet.googleapis.com/v2/{+parent}/participantSessions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/meetings.space.created"
        "https://www.googleapis.com/auth/meetings.space.readonly"]})))

(defn conferenceRecords-participants-participantSessions-get
  "Gets a participant session by participant session ID.
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/conferenceRecords/participants/participantSessions/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://meet.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/meetings.space.created"
      "https://www.googleapis.com/auth/meetings.space.readonly"]}))

(defn conferenceRecords-recordings-get
  "Gets a recording by recording ID.
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/conferenceRecords/recordings/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://meet.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/meetings.space.created"
      "https://www.googleapis.com/auth/meetings.space.readonly"]}))

(defn conferenceRecords-recordings-list
  "Lists the recording resources from the conference record. By default, ordered by start time and in ascending order.
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/conferenceRecords/recordings/list

parent <> 

optional:
pageSize <integer> Maximum number of recordings to return. The service might return fewer than this value. If unspecified, at most 10 recordings are returned. The maximum value is 100; values above 100 are coerced to 100. Maximum might change in the future."
  ([parent] (conferenceRecords-recordings-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://meet.googleapis.com/v2/{+parent}/recordings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/meetings.space.created"
        "https://www.googleapis.com/auth/meetings.space.readonly"]})))

(defn conferenceRecords-transcripts-list
  "Lists the set of transcripts from the conference record. By default, ordered by start time and in ascending order.
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/conferenceRecords/transcripts/list

parent <> 

optional:
pageSize <integer> Maximum number of transcripts to return. The service might return fewer than this value. If unspecified, at most 10 transcripts are returned. The maximum value is 100; values above 100 are coerced to 100. Maximum might change in the future."
  ([parent] (conferenceRecords-transcripts-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://meet.googleapis.com/v2/{+parent}/transcripts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/meetings.space.created"
        "https://www.googleapis.com/auth/meetings.space.readonly"]})))

(defn conferenceRecords-transcripts-get
  "Gets a transcript by transcript ID.
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/conferenceRecords/transcripts/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://meet.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/meetings.space.created"
      "https://www.googleapis.com/auth/meetings.space.readonly"]}))

(defn conferenceRecords-transcripts-entries-list
  "Lists the structured transcript entries per transcript. By default, ordered by start time and in ascending order. Note: The transcript entries returned by the Google Meet API might not match the transcription found in the Google Docs transcript file. This can occur when the Google Docs transcript file is modified after generation.
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/conferenceRecords/transcripts/entries/list

parent <> 

optional:
pageSize <integer> Maximum number of entries to return. The service might return fewer than this value. If unspecified, at most 10 entries are returned. The maximum value is 100; values above 100 are coerced to 100. Maximum might change in the future."
  ([parent] (conferenceRecords-transcripts-entries-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://meet.googleapis.com/v2/{+parent}/entries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/meetings.space.created"
        "https://www.googleapis.com/auth/meetings.space.readonly"]})))

(defn conferenceRecords-transcripts-entries-get
  "Gets a `TranscriptEntry` resource by entry ID. Note: The transcript entries returned by the Google Meet API might not match the transcription found in the Google Docs transcript file. This can occur when the Google Docs transcript file is modified after generation.
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/conferenceRecords/transcripts/entries/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://meet.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/meetings.space.created"
      "https://www.googleapis.com/auth/meetings.space.readonly"]}))

(defn spaces-create
  "Creates a space.
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/spaces/create

Space:
Space"
  [Space]
  (client/api-request
    {:method :post,
     :uri-template "https://meet.googleapis.com/v2/spaces",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/meetings.space.created"],
     :body Space}))

(defn spaces-endActiveConference
  "Ends an active conference (if there's one). For an example, see [End active conference](https://developers.google.com/meet/api/guides/meeting-spaces#end-active-conference).
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/spaces/endActiveConference

name <> 
EndActiveConferenceRequest:
EndActiveConferenceRequest"
  [name EndActiveConferenceRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://meet.googleapis.com/v2/{+name}:endActiveConference",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/meetings.space.created"],
     :body EndActiveConferenceRequest}))

(defn spaces-patch
  "Updates details about a meeting space. For an example, see [Update a meeting space](https://developers.google.com/meet/api/guides/meeting-spaces#update-meeting-space).
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/spaces/patch

name <> 
Space:
Space

optional:
updateMask <string> Optional. Field mask used to specify the fields to be updated in the space. If update_mask isn't provided, it defaults to '*' and updates all fields provided in the request, including deleting fields not set in the request."
  ([name Space] (spaces-patch name Space nil))
  ([name Space optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://meet.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/meetings.space.created"],
       :body Space})))

(defn spaces-get
  "Gets details about a meeting space. For an example, see [Get a meeting space](https://developers.google.com/meet/api/guides/meeting-spaces#get-meeting-space).
https://developers.google.com/meet/api/guides/overview/v2/reference/rest/v2/spaces/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://meet.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/meetings.space.created"
      "https://www.googleapis.com/auth/meetings.space.readonly"]}))
