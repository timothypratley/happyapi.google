(ns happyapi.google.firebaserules-v1
  "Firebase Rules API
Creates and manages rules that determine when a Firebase Rules-enabled service should permit a request. 
See: https://firebase.google.com/docs/storage/security"
  (:require [happyapi.providers.google :as client]))

(defn projects-test
  "Test `Source` for syntactic and semantic correctness. Issues present, if any, will be returned to the caller with a description, severity, and source location. The test method may be executed with `Source` or a `Ruleset` name. Passing `Source` is useful for unit testing new rules. Passing a `Ruleset` name is useful for regression testing an existing rule. The following is an example of `Source` that permits users to upload images to a bucket bearing their user id and matching the correct metadata: _*Example*_ // Users are allowed to subscribe and unsubscribe to the blog. service firebase.storage { match /users/{userId}/images/{imageName} { allow write: if userId == request.auth.uid && (imageName.matches('*.png$') || imageName.matches('*.jpg$')) && resource.mimeType.matches('^image/') } }
https://firebase.google.com/docs/storage/security/v1/reference/rest/v1/projects/test

name <> 
TestRulesetRequest:
TestRulesetRequest"
  [name TestRulesetRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://firebaserules.googleapis.com/v1/{+name}:test",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"
      "https://www.googleapis.com/auth/firebase.readonly"],
     :body TestRulesetRequest}))

(defn projects-rulesets-create
  "Create a `Ruleset` from `Source`. The `Ruleset` is given a unique generated name which is returned to the caller. `Source` containing syntactic or semantics errors will result in an error response indicating the first error encountered. For a detailed view of `Source` issues, use TestRuleset.
https://firebase.google.com/docs/storage/security/v1/reference/rest/v1/projects/rulesets/create

name <> 
Ruleset:
Ruleset"
  [name Ruleset]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://firebaserules.googleapis.com/v1/{+name}/rulesets",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"],
     :body Ruleset}))

(defn projects-rulesets-get
  "Get a `Ruleset` by name including the full `Source` contents.
https://firebase.google.com/docs/storage/security/v1/reference/rest/v1/projects/rulesets/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://firebaserules.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"
      "https://www.googleapis.com/auth/firebase.readonly"]}))

(defn projects-rulesets-list
  "List `Ruleset` metadata only and optionally filter the results by `Ruleset` name. The full `Source` contents of a `Ruleset` may be retrieved with GetRuleset.
https://firebase.google.com/docs/storage/security/v1/reference/rest/v1/projects/rulesets/list

name <> 

optional:
filter <string> `Ruleset` filter. The list method supports filters with restrictions on `Ruleset.name`. Filters on `Ruleset.create_time` should use the `date` function which parses strings that conform to the RFC 3339 date/time specifications. Example: `create_time > date(\"2017-01-01T00:00:00Z\") AND name=UUID-*`
pageSize <integer> Page size to load. Maximum of 100. Defaults to 10. Note: `page_size` is just a hint and the service may choose to load less than `page_size` due to the size of the output. To traverse all of the releases, caller should iterate until the `page_token` is empty."
  ([name] (projects-rulesets-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://firebaserules.googleapis.com/v1/{+name}/rulesets",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/firebase"
        "https://www.googleapis.com/auth/firebase.readonly"]})))

(defn projects-rulesets-delete
  "Delete a `Ruleset` by resource name. If the `Ruleset` is referenced by a `Release` the operation will fail.
https://firebase.google.com/docs/storage/security/v1/reference/rest/v1/projects/rulesets/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://firebaserules.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"]}))

(defn projects-releases-create
  "Create a `Release`. Release names should reflect the developer's deployment practices. For example, the release name may include the environment name, application name, application version, or any other name meaningful to the developer. Once a `Release` refers to a `Ruleset`, the rules can be enforced by Firebase Rules-enabled services. More than one `Release` may be 'live' concurrently. Consider the following three `Release` names for `projects/foo` and the `Ruleset` to which they refer. Release Name -> Ruleset Name * projects/foo/releases/prod -> projects/foo/rulesets/uuid123 * projects/foo/releases/prod/beta -> projects/foo/rulesets/uuid123 * projects/foo/releases/prod/v23 -> projects/foo/rulesets/uuid456 The relationships reflect a `Ruleset` rollout in progress. The `prod` and `prod/beta` releases refer to the same `Ruleset`. However, `prod/v23` refers to a new `Ruleset`. The `Ruleset` reference for a `Release` may be updated using the UpdateRelease method.
https://firebase.google.com/docs/storage/security/v1/reference/rest/v1/projects/releases/create

name <> 
Release:
Release"
  [name Release]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://firebaserules.googleapis.com/v1/{+name}/releases",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"],
     :body Release}))

(defn projects-releases-patch
  "Update a `Release` via PATCH. Only updates to `ruleset_name` will be honored. `Release` rename is not supported. To create a `Release` use the CreateRelease method.
https://firebase.google.com/docs/storage/security/v1/reference/rest/v1/projects/releases/patch

name <> 
UpdateReleaseRequest:
UpdateReleaseRequest"
  [name UpdateReleaseRequest]
  (client/*api-request*
    {:method :patch,
     :uri-template "https://firebaserules.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"],
     :body UpdateReleaseRequest}))

(defn projects-releases-get
  "Get a `Release` by name.
https://firebase.google.com/docs/storage/security/v1/reference/rest/v1/projects/releases/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://firebaserules.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"
      "https://www.googleapis.com/auth/firebase.readonly"]}))

(defn projects-releases-list
  "List the `Release` values for a project. This list may optionally be filtered by `Release` name, `Ruleset` name, `TestSuite` name, or any combination thereof.
https://firebase.google.com/docs/storage/security/v1/reference/rest/v1/projects/releases/list

name <> 

optional:
filter <string> `Release` filter. The list method supports filters with restrictions on the `Release.name`, and `Release.ruleset_name`. Example 1: A filter of 'name=prod*' might return `Release`s with names within 'projects/foo' prefixed with 'prod': Name -> Ruleset Name: * projects/foo/releases/prod -> projects/foo/rulesets/uuid1234 * projects/foo/releases/prod/v1 -> projects/foo/rulesets/uuid1234 * projects/foo/releases/prod/v2 -> projects/foo/rulesets/uuid8888 Example 2: A filter of `name=prod* ruleset_name=uuid1234` would return only `Release` instances for 'projects/foo' with names prefixed with 'prod' referring to the same `Ruleset` name of 'uuid1234': Name -> Ruleset Name: * projects/foo/releases/prod -> projects/foo/rulesets/1234 * projects/foo/releases/prod/v1 -> projects/foo/rulesets/1234 In the examples, the filter parameters refer to the search filters are relative to the project. Fully qualified prefixed may also be used.
pageSize <integer> Page size to load. Maximum of 100. Defaults to 10. Note: `page_size` is just a hint and the service may choose to load fewer than `page_size` results due to the size of the output. To traverse all of the releases, the caller should iterate until the `page_token` on the response is empty."
  ([name] (projects-releases-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://firebaserules.googleapis.com/v1/{+name}/releases",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/firebase"
        "https://www.googleapis.com/auth/firebase.readonly"]})))

(defn projects-releases-delete
  "Delete a `Release` by resource name.
https://firebase.google.com/docs/storage/security/v1/reference/rest/v1/projects/releases/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://firebaserules.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"]}))

(defn projects-releases-getExecutable
  "Get the `Release` executable to use when enforcing rules.
https://firebase.google.com/docs/storage/security/v1/reference/rest/v1/projects/releases/getExecutable

name <> 

optional:
executableVersion <string> The requested runtime executable version. Defaults to FIREBASE_RULES_EXECUTABLE_V1."
  ([name] (projects-releases-getExecutable name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://firebaserules.googleapis.com/v1/{+name}:getExecutable",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/firebase"
        "https://www.googleapis.com/auth/firebase.readonly"]})))
