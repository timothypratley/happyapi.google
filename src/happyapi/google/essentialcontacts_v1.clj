(ns happyapi.google.essentialcontacts-v1
  "Essential Contacts API

See: https://cloud.google.com/resource-manager/docs/managing-notification-contacts"
  (:require [happyapi.providers.google :as client]))

(defn projects-contacts-get
  "Gets a single contact.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/projects/contacts/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://essentialcontacts.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-contacts-list
  "Lists the contacts that have been set on a resource.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/projects/contacts/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of `next_page_token` in the response indicates that more results might be available. If not specified, the default page_size is 100."
  ([parent] (projects-contacts-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://essentialcontacts.googleapis.com/v1/{+parent}/contacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-contacts-delete
  "Deletes a contact.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/projects/contacts/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://essentialcontacts.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-contacts-create
  "Adds a new contact for a resource.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/projects/contacts/create

parent <> 
GoogleCloudEssentialcontactsV1Contact:
GoogleCloudEssentialcontactsV1Contact"
  [parent GoogleCloudEssentialcontactsV1Contact]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://essentialcontacts.googleapis.com/v1/{+parent}/contacts",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudEssentialcontactsV1Contact}))

(defn projects-contacts-patch
  "Updates a contact. Note: A contact's email address cannot be changed.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/projects/contacts/patch

name <> 
GoogleCloudEssentialcontactsV1Contact:
GoogleCloudEssentialcontactsV1Contact

optional:
updateMask <string> Optional. The update mask applied to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask"
  ([name GoogleCloudEssentialcontactsV1Contact]
    (projects-contacts-patch
      name
      GoogleCloudEssentialcontactsV1Contact
      nil))
  ([name GoogleCloudEssentialcontactsV1Contact optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://essentialcontacts.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudEssentialcontactsV1Contact})))

(defn projects-contacts-compute
  "Lists all contacts for the resource that are subscribed to the specified notification categories, including contacts inherited from any parent resources.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/projects/contacts/compute

parent <> 

optional:
notificationCategories <string> The categories of notifications to compute contacts for. If ALL is included in this list, contacts subscribed to any notification category will be returned.
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of `next_page_token` in the response indicates that more results might be available. If not specified, the default page_size is 100."
  ([parent] (projects-contacts-compute parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://essentialcontacts.googleapis.com/v1/{+parent}/contacts:compute",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-contacts-sendTestMessage
  "Allows a contact admin to send a test message to contact to verify that it has been configured correctly.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/projects/contacts/sendTestMessage

resource <> 
GoogleCloudEssentialcontactsV1SendTestMessageRequest:
GoogleCloudEssentialcontactsV1SendTestMessageRequest"
  [resource GoogleCloudEssentialcontactsV1SendTestMessageRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://essentialcontacts.googleapis.com/v1/{+resource}/contacts:sendTestMessage",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudEssentialcontactsV1SendTestMessageRequest}))

(defn folders-contacts-compute
  "Lists all contacts for the resource that are subscribed to the specified notification categories, including contacts inherited from any parent resources.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/folders/contacts/compute

parent <> 

optional:
notificationCategories <string> The categories of notifications to compute contacts for. If ALL is included in this list, contacts subscribed to any notification category will be returned.
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of `next_page_token` in the response indicates that more results might be available. If not specified, the default page_size is 100."
  ([parent] (folders-contacts-compute parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://essentialcontacts.googleapis.com/v1/{+parent}/contacts:compute",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-contacts-patch
  "Updates a contact. Note: A contact's email address cannot be changed.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/folders/contacts/patch

name <> 
GoogleCloudEssentialcontactsV1Contact:
GoogleCloudEssentialcontactsV1Contact

optional:
updateMask <string> Optional. The update mask applied to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask"
  ([name GoogleCloudEssentialcontactsV1Contact]
    (folders-contacts-patch
      name
      GoogleCloudEssentialcontactsV1Contact
      nil))
  ([name GoogleCloudEssentialcontactsV1Contact optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://essentialcontacts.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudEssentialcontactsV1Contact})))

(defn folders-contacts-create
  "Adds a new contact for a resource.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/folders/contacts/create

parent <> 
GoogleCloudEssentialcontactsV1Contact:
GoogleCloudEssentialcontactsV1Contact"
  [parent GoogleCloudEssentialcontactsV1Contact]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://essentialcontacts.googleapis.com/v1/{+parent}/contacts",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudEssentialcontactsV1Contact}))

(defn folders-contacts-delete
  "Deletes a contact.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/folders/contacts/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://essentialcontacts.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-contacts-sendTestMessage
  "Allows a contact admin to send a test message to contact to verify that it has been configured correctly.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/folders/contacts/sendTestMessage

resource <> 
GoogleCloudEssentialcontactsV1SendTestMessageRequest:
GoogleCloudEssentialcontactsV1SendTestMessageRequest"
  [resource GoogleCloudEssentialcontactsV1SendTestMessageRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://essentialcontacts.googleapis.com/v1/{+resource}/contacts:sendTestMessage",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudEssentialcontactsV1SendTestMessageRequest}))

(defn folders-contacts-list
  "Lists the contacts that have been set on a resource.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/folders/contacts/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of `next_page_token` in the response indicates that more results might be available. If not specified, the default page_size is 100."
  ([parent] (folders-contacts-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://essentialcontacts.googleapis.com/v1/{+parent}/contacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-contacts-get
  "Gets a single contact.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/folders/contacts/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://essentialcontacts.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-contacts-patch
  "Updates a contact. Note: A contact's email address cannot be changed.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/organizations/contacts/patch

name <> 
GoogleCloudEssentialcontactsV1Contact:
GoogleCloudEssentialcontactsV1Contact

optional:
updateMask <string> Optional. The update mask applied to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask"
  ([name GoogleCloudEssentialcontactsV1Contact]
    (organizations-contacts-patch
      name
      GoogleCloudEssentialcontactsV1Contact
      nil))
  ([name GoogleCloudEssentialcontactsV1Contact optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://essentialcontacts.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudEssentialcontactsV1Contact})))

(defn organizations-contacts-list
  "Lists the contacts that have been set on a resource.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/organizations/contacts/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of `next_page_token` in the response indicates that more results might be available. If not specified, the default page_size is 100."
  ([parent] (organizations-contacts-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://essentialcontacts.googleapis.com/v1/{+parent}/contacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-contacts-sendTestMessage
  "Allows a contact admin to send a test message to contact to verify that it has been configured correctly.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/organizations/contacts/sendTestMessage

resource <> 
GoogleCloudEssentialcontactsV1SendTestMessageRequest:
GoogleCloudEssentialcontactsV1SendTestMessageRequest"
  [resource GoogleCloudEssentialcontactsV1SendTestMessageRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://essentialcontacts.googleapis.com/v1/{+resource}/contacts:sendTestMessage",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudEssentialcontactsV1SendTestMessageRequest}))

(defn organizations-contacts-get
  "Gets a single contact.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/organizations/contacts/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://essentialcontacts.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-contacts-create
  "Adds a new contact for a resource.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/organizations/contacts/create

parent <> 
GoogleCloudEssentialcontactsV1Contact:
GoogleCloudEssentialcontactsV1Contact"
  [parent GoogleCloudEssentialcontactsV1Contact]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://essentialcontacts.googleapis.com/v1/{+parent}/contacts",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudEssentialcontactsV1Contact}))

(defn organizations-contacts-compute
  "Lists all contacts for the resource that are subscribed to the specified notification categories, including contacts inherited from any parent resources.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/organizations/contacts/compute

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of `next_page_token` in the response indicates that more results might be available. If not specified, the default page_size is 100.
notificationCategories <string> The categories of notifications to compute contacts for. If ALL is included in this list, contacts subscribed to any notification category will be returned."
  ([parent] (organizations-contacts-compute parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://essentialcontacts.googleapis.com/v1/{+parent}/contacts:compute",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-contacts-delete
  "Deletes a contact.
https://cloud.google.com/resource-manager/docs/managing-notification-contacts/v1/reference/rest/v1/organizations/contacts/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://essentialcontacts.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
