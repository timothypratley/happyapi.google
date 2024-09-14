(ns happyapi.google.readerrevenuesubscriptionlinking-v1
  "Reader Revenue Subscription Linking API
readerrevenuesubscriptionlinking.googleapis.com API.
See: https://developers.google.com/news/subscribe/subscription-linking/getting-started/overview")

(defn publications-readers-get
  "Gets a reader of a publication. Returns NOT_FOUND if the reader does not exist.
https://developers.google.com/news/subscribe/subscription-linking/getting-started/overview/v1/reference/rest/v1/publications/readers/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://readerrevenuesubscriptionlinking.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn publications-readers-getEntitlements
  "Gets the reader entitlements for a publication reader. - Returns PERMISSION_DENIED if the caller does not have access. - Returns NOT_FOUND if the reader does not exist.
https://developers.google.com/news/subscribe/subscription-linking/getting-started/overview/v1/reference/rest/v1/publications/readers/getEntitlements

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://readerrevenuesubscriptionlinking.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn publications-readers-updateEntitlements
  "Updates the reader entitlements for a publication reader. The entire reader entitlements will be overwritten by the new reader entitlements in the payload, like a PUT. - Returns PERMISSION_DENIED if the caller does not have access. - Returns NOT_FOUND if the reader does not exist.
https://developers.google.com/news/subscribe/subscription-linking/getting-started/overview/v1/reference/rest/v1/publications/readers/updateEntitlements

name <> 
ReaderEntitlements:
ReaderEntitlements

optional:
updateMask <string> Optional. The list of fields to update. Defaults to all fields."
  ([name ReaderEntitlements]
    (publications-readers-updateEntitlements
      name
      ReaderEntitlements
      nil))
  ([name ReaderEntitlements optional]
    {:method :patch,
     :uri-template
     "https://readerrevenuesubscriptionlinking.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes nil,
     :body ReaderEntitlements}))

(defn publications-readers-delete
  "Removes a publication reader, effectively severing the association with a Google user. If `force` is set to true, any entitlements for this reader will also be deleted. (Otherwise, the request will only work if the reader has no entitlements.) - If the reader does not exist, return NOT_FOUND. - Return FAILED_PRECONDITION if the force field is false (or unset) and entitlements are present.
https://developers.google.com/news/subscribe/subscription-linking/getting-started/overview/v1/reference/rest/v1/publications/readers/delete

name <> 

optional:
force <boolean> If set to true, any entitlements under the reader will also be purged."
  ([name] (publications-readers-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://readerrevenuesubscriptionlinking.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes nil}))
