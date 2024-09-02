(ns happyapi.google.css-v1
  "CSS API
Programmatically manage your Comparison Shopping Service (CSS) account data at scale.
See: https://developers.google.com/comparison-shopping-services/api/overview"
  (:require [happyapi.providers.google :as client]))

(defn accounts-listChildAccounts
  "Lists all the accounts under the specified CSS account ID, and optionally filters by label ID and account name.
https://developers.google.com/comparison-shopping-services/api/overview/v1/reference/rest/v1/accounts/listChildAccounts

parent <> 

optional:
labelId <string> If set, only the MC accounts with the given label ID will be returned.
fullName <string> If set, only the MC accounts with the given name (case sensitive) will be returned.
pageSize <integer> Optional. The maximum number of accounts to return. The service may return fewer than this value. If unspecified, at most 50 accounts will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (accounts-listChildAccounts parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://css.googleapis.com/v1/{+parent}:listChildAccounts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn accounts-get
  "Retrieves a single CSS/MC account by ID.
https://developers.google.com/comparison-shopping-services/api/overview/v1/reference/rest/v1/accounts/get

name <> 

optional:
parent <string> Optional. Only required when retrieving MC account information. The CSS domain that is the parent resource of the MC account. Format: accounts/{account}"
  ([name] (accounts-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://css.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn accounts-updateLabels
  "Updates labels assigned to CSS/MC accounts by a CSS domain.
https://developers.google.com/comparison-shopping-services/api/overview/v1/reference/rest/v1/accounts/updateLabels

name <> 
UpdateAccountLabelsRequest:
UpdateAccountLabelsRequest"
  [name UpdateAccountLabelsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://css.googleapis.com/v1/{+name}:updateLabels",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body UpdateAccountLabelsRequest}))

(defn accounts-labels-list
  "Lists the labels assigned to an account.
https://developers.google.com/comparison-shopping-services/api/overview/v1/reference/rest/v1/accounts/labels/list

parent <> 

optional:
pageSize <integer> The maximum number of labels to return. The service may return fewer than this value. If unspecified, at most 50 labels will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (accounts-labels-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://css.googleapis.com/v1/{+parent}/labels",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn accounts-labels-create
  "Creates a new label, not assigned to any account.
https://developers.google.com/comparison-shopping-services/api/overview/v1/reference/rest/v1/accounts/labels/create

parent <> 
AccountLabel:
AccountLabel"
  [parent AccountLabel]
  (client/*api-request*
    {:method :post,
     :uri-template "https://css.googleapis.com/v1/{+parent}/labels",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body AccountLabel}))

(defn accounts-labels-patch
  "Updates a label.
https://developers.google.com/comparison-shopping-services/api/overview/v1/reference/rest/v1/accounts/labels/patch

name <> 
AccountLabel:
AccountLabel"
  [name AccountLabel]
  (client/*api-request*
    {:method :patch,
     :uri-template "https://css.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body AccountLabel}))

(defn accounts-labels-delete
  "Deletes a label and removes it from all accounts to which it was assigned.
https://developers.google.com/comparison-shopping-services/api/overview/v1/reference/rest/v1/accounts/labels/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://css.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accounts-cssProductInputs-insert
  "Uploads a CssProductInput to your CSS Center account. If an input with the same contentLanguage, identity, feedLabel and feedId already exists, this method replaces that entry. After inserting, updating, or deleting a CSS Product input, it may take several minutes before the processed CSS Product can be retrieved.
https://developers.google.com/comparison-shopping-services/api/overview/v1/reference/rest/v1/accounts/cssProductInputs/insert

parent <> 
CssProductInput:
CssProductInput

optional:
feedId <string> Required. The primary or supplemental feed id. If CSS Product already exists and feed id provided is different, then the CSS Product will be moved to a new feed. Note: For now, CSSs do not need to provide feed ids as we create feeds on the fly. We do not have supplemental feed support for CSS Products yet."
  ([parent CssProductInput]
    (accounts-cssProductInputs-insert parent CssProductInput nil))
  ([parent CssProductInput optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://css.googleapis.com/v1/{+parent}/cssProductInputs:insert",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"],
       :body CssProductInput})))

(defn accounts-cssProductInputs-delete
  "Deletes a CSS Product input from your CSS Center account. After a delete it may take several minutes until the input is no longer available.
https://developers.google.com/comparison-shopping-services/api/overview/v1/reference/rest/v1/accounts/cssProductInputs/delete

name <> 

optional:
supplementalFeedId <string> The Content API Supplemental Feed ID. The field must not be set if the action applies to a primary feed. If the field is set, then product action applies to a supplemental feed instead of primary Content API feed."
  ([name] (accounts-cssProductInputs-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://css.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn accounts-cssProducts-get
  "Retrieves the processed CSS Product from your CSS Center account. After inserting, updating, or deleting a product input, it may take several minutes before the updated final product can be retrieved.
https://developers.google.com/comparison-shopping-services/api/overview/v1/reference/rest/v1/accounts/cssProducts/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://css.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accounts-cssProducts-list
  "Lists the processed CSS Products in your CSS Center account. The response might contain fewer items than specified by pageSize. Rely on pageToken to determine if there are more items to be requested. After inserting, updating, or deleting a CSS product input, it may take several minutes before the updated processed CSS product can be retrieved.
https://developers.google.com/comparison-shopping-services/api/overview/v1/reference/rest/v1/accounts/cssProducts/list

parent <> 

optional:
pageSize <integer> The maximum number of CSS Products to return. The service may return fewer than this value. The maximum value is 1000; values above 1000 will be coerced to 1000. If unspecified, the maximum number of CSS products will be returned."
  ([parent] (accounts-cssProducts-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://css.googleapis.com/v1/{+parent}/cssProducts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))
