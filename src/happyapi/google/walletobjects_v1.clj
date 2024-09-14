(ns happyapi.google.walletobjects-v1
  "Google Wallet API
API for issuers to save and manage Google Wallet Objects.
See: https://developers.google.com/wallet")

(defn permissions-get
  "Returns the permissions for the given issuer id.
https://developers.google.com/wallet/v1/reference/rest/v1/permissions/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/permissions/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn permissions-update
  "Updates the permissions for the given issuer.
https://developers.google.com/wallet/v1/reference/rest/v1/permissions/update

resourceId <> 
Permissions:
Permissions"
  [resourceId Permissions]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/permissions/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body Permissions})

(defn eventticketobject-get
  "Returns the event ticket object with the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/eventticketobject/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/eventTicketObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn eventticketobject-list
  "Returns a list of all event ticket objects for a given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/eventticketobject/list

optional:
token <string> Used to get the next set of results if `maxResults` is specified, but more than `maxResults` objects are available in a list. For example, if you have a list of 200 objects and you call list with `maxResults` set to 20, list will return the first 20 objects and a token. Call list again with `maxResults` set to 20 and the token to get the next 20 objects.
maxResults <integer> Identifies the max number of results returned by a list. All results are returned if `maxResults` isn't defined.
classId <string> The ID of the class whose objects will be listed."
  ([] (eventticketobject-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://walletobjects.googleapis.com/walletobjects/v1/eventTicketObject",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]}))

(defn eventticketobject-insert
  "Inserts an event ticket object with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/eventticketobject/insert

EventTicketObject:
EventTicketObject"
  [EventTicketObject]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/eventTicketObject",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body EventTicketObject})

(defn eventticketobject-addmessage
  "Adds a message to the event ticket object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/eventticketobject/addmessage

resourceId <> 
AddMessageRequest:
AddMessageRequest"
  [resourceId AddMessageRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/eventTicketObject/{resourceId}/addMessage",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body AddMessageRequest})

(defn eventticketobject-modifylinkedofferobjects
  "Modifies linked offer objects for the event ticket object with the given ID.
https://developers.google.com/wallet/v1/reference/rest/v1/eventticketobject/modifylinkedofferobjects

resourceId <> 
ModifyLinkedOfferObjectsRequest:
ModifyLinkedOfferObjectsRequest"
  [resourceId ModifyLinkedOfferObjectsRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/eventTicketObject/{resourceId}/modifyLinkedOfferObjects",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body ModifyLinkedOfferObjectsRequest})

(defn eventticketobject-update
  "Updates the event ticket object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/eventticketobject/update

resourceId <> 
EventTicketObject:
EventTicketObject"
  [resourceId EventTicketObject]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/eventTicketObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body EventTicketObject})

(defn eventticketobject-patch
  "Updates the event ticket object referenced by the given object ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/eventticketobject/patch

resourceId <> 
EventTicketObject:
EventTicketObject"
  [resourceId EventTicketObject]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/eventTicketObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body EventTicketObject})

(defn media-download
  "Downloads rotating barcode values for the transit object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/media/download

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/transitObject/{resourceId}/downloadRotatingBarcodeValues",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn media-upload
  "Uploads rotating barcode values for the transit object referenced by the given object ID. Note the max upload size is specified in google3/production/config/cdd/apps-upload/customers/payments-consumer-passes/config.gcl and enforced by Scotty.
https://developers.google.com/wallet/v1/reference/rest/v1/media/upload

resourceId <> 
TransitObjectUploadRotatingBarcodeValuesRequest:
TransitObjectUploadRotatingBarcodeValuesRequest"
  [resourceId TransitObjectUploadRotatingBarcodeValuesRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/transitObject/{resourceId}/uploadRotatingBarcodeValues",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body TransitObjectUploadRotatingBarcodeValuesRequest})

(defn eventticketclass-update
  "Updates the event ticket class referenced by the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/eventticketclass/update

resourceId <> 
EventTicketClass:
EventTicketClass"
  [resourceId EventTicketClass]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/eventTicketClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body EventTicketClass})

(defn eventticketclass-addmessage
  "Adds a message to the event ticket class referenced by the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/eventticketclass/addmessage

resourceId <> 
AddMessageRequest:
AddMessageRequest"
  [resourceId AddMessageRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/eventTicketClass/{resourceId}/addMessage",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body AddMessageRequest})

(defn eventticketclass-insert
  "Inserts an event ticket class with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/eventticketclass/insert

EventTicketClass:
EventTicketClass"
  [EventTicketClass]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/eventTicketClass",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body EventTicketClass})

(defn eventticketclass-list
  "Returns a list of all event ticket classes for a given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/eventticketclass/list

optional:
issuerId <string> The ID of the issuer authorized to list classes.
maxResults <integer> Identifies the max number of results returned by a list. All results are returned if `maxResults` isn't defined.
token <string> Used to get the next set of results if `maxResults` is specified, but more than `maxResults` classes are available in a list. For example, if you have a list of 200 classes and you call list with `maxResults` set to 20, list will return the first 20 classes and a token. Call list again with `maxResults` set to 20 and the token to get the next 20 classes."
  ([] (eventticketclass-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://walletobjects.googleapis.com/walletobjects/v1/eventTicketClass",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]}))

(defn eventticketclass-get
  "Returns the event ticket class with the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/eventticketclass/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/eventTicketClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn eventticketclass-patch
  "Updates the event ticket class referenced by the given class ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/eventticketclass/patch

resourceId <> 
EventTicketClass:
EventTicketClass"
  [resourceId EventTicketClass]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/eventTicketClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body EventTicketClass})

(defn issuer-patch
  "Updates the issuer referenced by the given issuer ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/issuer/patch

resourceId <> 
Issuer:
Issuer"
  [resourceId Issuer]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/issuer/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body Issuer})

(defn issuer-list
  "Returns a list of all issuers shared to the caller.
https://developers.google.com/wallet/v1/reference/rest/v1/issuer/list"
  []
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/issuer",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn issuer-insert
  "Inserts an issuer with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/issuer/insert

Issuer:
Issuer"
  [Issuer]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/issuer",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body Issuer})

(defn issuer-update
  "Updates the issuer referenced by the given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/issuer/update

resourceId <> 
Issuer:
Issuer"
  [resourceId Issuer]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/issuer/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body Issuer})

(defn issuer-get
  "Returns the issuer with the given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/issuer/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/issuer/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn offerobject-list
  "Returns a list of all offer objects for a given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/offerobject/list

optional:
maxResults <integer> Identifies the max number of results returned by a list. All results are returned if `maxResults` isn't defined.
token <string> Used to get the next set of results if `maxResults` is specified, but more than `maxResults` objects are available in a list. For example, if you have a list of 200 objects and you call list with `maxResults` set to 20, list will return the first 20 objects and a token. Call list again with `maxResults` set to 20 and the token to get the next 20 objects.
classId <string> The ID of the class whose objects will be listed."
  ([] (offerobject-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://walletobjects.googleapis.com/walletobjects/v1/offerObject",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]}))

(defn offerobject-get
  "Returns the offer object with the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/offerobject/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/offerObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn offerobject-patch
  "Updates the offer object referenced by the given object ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/offerobject/patch

resourceId <> 
OfferObject:
OfferObject"
  [resourceId OfferObject]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/offerObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body OfferObject})

(defn offerobject-addmessage
  "Adds a message to the offer object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/offerobject/addmessage

resourceId <> 
AddMessageRequest:
AddMessageRequest"
  [resourceId AddMessageRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/offerObject/{resourceId}/addMessage",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body AddMessageRequest})

(defn offerobject-insert
  "Inserts an offer object with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/offerobject/insert

OfferObject:
OfferObject"
  [OfferObject]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/offerObject",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body OfferObject})

(defn offerobject-update
  "Updates the offer object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/offerobject/update

resourceId <> 
OfferObject:
OfferObject"
  [resourceId OfferObject]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/offerObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body OfferObject})

(defn jwt-insert
  "Inserts the resources in the JWT.
https://developers.google.com/wallet/v1/reference/rest/v1/jwt/insert

JwtResource:
JwtResource"
  [JwtResource]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/jwt",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body JwtResource})

(defn flightclass-update
  "Updates the flight class referenced by the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/flightclass/update

resourceId <> 
FlightClass:
FlightClass"
  [resourceId FlightClass]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/flightClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body FlightClass})

(defn flightclass-addmessage
  "Adds a message to the flight class referenced by the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/flightclass/addmessage

resourceId <> 
AddMessageRequest:
AddMessageRequest"
  [resourceId AddMessageRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/flightClass/{resourceId}/addMessage",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body AddMessageRequest})

(defn flightclass-list
  "Returns a list of all flight classes for a given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/flightclass/list

optional:
issuerId <string> The ID of the issuer authorized to list classes.
token <string> Used to get the next set of results if `maxResults` is specified, but more than `maxResults` classes are available in a list. For example, if you have a list of 200 classes and you call list with `maxResults` set to 20, list will return the first 20 classes and a token. Call list again with `maxResults` set to 20 and the token to get the next 20 classes.
maxResults <integer> Identifies the max number of results returned by a list. All results are returned if `maxResults` isn't defined."
  ([] (flightclass-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://walletobjects.googleapis.com/walletobjects/v1/flightClass",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]}))

(defn flightclass-insert
  "Inserts an flight class with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/flightclass/insert

FlightClass:
FlightClass"
  [FlightClass]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/flightClass",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body FlightClass})

(defn flightclass-patch
  "Updates the flight class referenced by the given class ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/flightclass/patch

resourceId <> 
FlightClass:
FlightClass"
  [resourceId FlightClass]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/flightClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body FlightClass})

(defn flightclass-get
  "Returns the flight class with the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/flightclass/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/flightClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn giftcardobject-patch
  "Updates the gift card object referenced by the given object ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/giftcardobject/patch

resourceId <> 
GiftCardObject:
GiftCardObject"
  [resourceId GiftCardObject]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/giftCardObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body GiftCardObject})

(defn giftcardobject-get
  "Returns the gift card object with the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/giftcardobject/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/giftCardObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn giftcardobject-update
  "Updates the gift card object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/giftcardobject/update

resourceId <> 
GiftCardObject:
GiftCardObject"
  [resourceId GiftCardObject]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/giftCardObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body GiftCardObject})

(defn giftcardobject-addmessage
  "Adds a message to the gift card object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/giftcardobject/addmessage

resourceId <> 
AddMessageRequest:
AddMessageRequest"
  [resourceId AddMessageRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/giftCardObject/{resourceId}/addMessage",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body AddMessageRequest})

(defn giftcardobject-list
  "Returns a list of all gift card objects for a given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/giftcardobject/list

optional:
maxResults <integer> Identifies the max number of results returned by a list. All results are returned if `maxResults` isn't defined.
classId <string> The ID of the class whose objects will be listed.
token <string> Used to get the next set of results if `maxResults` is specified, but more than `maxResults` objects are available in a list. For example, if you have a list of 200 objects and you call list with `maxResults` set to 20, list will return the first 20 objects and a token. Call list again with `maxResults` set to 20 and the token to get the next 20 objects."
  ([] (giftcardobject-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://walletobjects.googleapis.com/walletobjects/v1/giftCardObject",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]}))

(defn giftcardobject-insert
  "Inserts an gift card object with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/giftcardobject/insert

GiftCardObject:
GiftCardObject"
  [GiftCardObject]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/giftCardObject",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body GiftCardObject})

(defn transitobject-insert
  "Inserts an transit object with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/transitobject/insert

TransitObject:
TransitObject"
  [TransitObject]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/transitObject",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body TransitObject})

(defn transitobject-addmessage
  "Adds a message to the transit object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/transitobject/addmessage

resourceId <> 
AddMessageRequest:
AddMessageRequest"
  [resourceId AddMessageRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/transitObject/{resourceId}/addMessage",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body AddMessageRequest})

(defn transitobject-update
  "Updates the transit object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/transitobject/update

resourceId <> 
TransitObject:
TransitObject"
  [resourceId TransitObject]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/transitObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body TransitObject})

(defn transitobject-patch
  "Updates the transit object referenced by the given object ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/transitobject/patch

resourceId <> 
TransitObject:
TransitObject"
  [resourceId TransitObject]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/transitObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body TransitObject})

(defn transitobject-list
  "Returns a list of all transit objects for a given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/transitobject/list

optional:
token <string> Used to get the next set of results if `maxResults` is specified, but more than `maxResults` objects are available in a list. For example, if you have a list of 200 objects and you call list with `maxResults` set to 20, list will return the first 20 objects and a token. Call list again with `maxResults` set to 20 and the token to get the next 20 objects.
classId <string> The ID of the class whose objects will be listed.
maxResults <integer> Identifies the max number of results returned by a list. All results are returned if `maxResults` isn't defined."
  ([] (transitobject-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://walletobjects.googleapis.com/walletobjects/v1/transitObject",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]}))

(defn transitobject-get
  "Returns the transit object with the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/transitobject/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/transitObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn loyaltyclass-addmessage
  "Adds a message to the loyalty class referenced by the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/loyaltyclass/addmessage

resourceId <> 
AddMessageRequest:
AddMessageRequest"
  [resourceId AddMessageRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/loyaltyClass/{resourceId}/addMessage",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body AddMessageRequest})

(defn loyaltyclass-update
  "Updates the loyalty class referenced by the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/loyaltyclass/update

resourceId <> 
LoyaltyClass:
LoyaltyClass"
  [resourceId LoyaltyClass]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/loyaltyClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body LoyaltyClass})

(defn loyaltyclass-list
  "Returns a list of all loyalty classes for a given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/loyaltyclass/list

optional:
issuerId <string> The ID of the issuer authorized to list classes.
token <string> Used to get the next set of results if `maxResults` is specified, but more than `maxResults` classes are available in a list. For example, if you have a list of 200 classes and you call list with `maxResults` set to 20, list will return the first 20 classes and a token. Call list again with `maxResults` set to 20 and the token to get the next 20 classes.
maxResults <integer> Identifies the max number of results returned by a list. All results are returned if `maxResults` isn't defined."
  ([] (loyaltyclass-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://walletobjects.googleapis.com/walletobjects/v1/loyaltyClass",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]}))

(defn loyaltyclass-patch
  "Updates the loyalty class referenced by the given class ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/loyaltyclass/patch

resourceId <> 
LoyaltyClass:
LoyaltyClass"
  [resourceId LoyaltyClass]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/loyaltyClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body LoyaltyClass})

(defn loyaltyclass-insert
  "Inserts an loyalty class with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/loyaltyclass/insert

LoyaltyClass:
LoyaltyClass"
  [LoyaltyClass]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/loyaltyClass",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body LoyaltyClass})

(defn loyaltyclass-get
  "Returns the loyalty class with the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/loyaltyclass/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/loyaltyClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn transitclass-list
  "Returns a list of all transit classes for a given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/transitclass/list

optional:
maxResults <integer> Identifies the max number of results returned by a list. All results are returned if `maxResults` isn't defined.
issuerId <string> The ID of the issuer authorized to list classes.
token <string> Used to get the next set of results if `maxResults` is specified, but more than `maxResults` classes are available in a list. For example, if you have a list of 200 classes and you call list with `maxResults` set to 20, list will return the first 20 classes and a token. Call list again with `maxResults` set to 20 and the token to get the next 20 classes."
  ([] (transitclass-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://walletobjects.googleapis.com/walletobjects/v1/transitClass",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]}))

(defn transitclass-get
  "Returns the transit class with the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/transitclass/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/transitClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn transitclass-insert
  "Inserts a transit class with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/transitclass/insert

TransitClass:
TransitClass"
  [TransitClass]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/transitClass",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body TransitClass})

(defn transitclass-patch
  "Updates the transit class referenced by the given class ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/transitclass/patch

resourceId <> 
TransitClass:
TransitClass"
  [resourceId TransitClass]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/transitClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body TransitClass})

(defn transitclass-update
  "Updates the transit class referenced by the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/transitclass/update

resourceId <> 
TransitClass:
TransitClass"
  [resourceId TransitClass]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/transitClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body TransitClass})

(defn transitclass-addmessage
  "Adds a message to the transit class referenced by the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/transitclass/addmessage

resourceId <> 
AddMessageRequest:
AddMessageRequest"
  [resourceId AddMessageRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/transitClass/{resourceId}/addMessage",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body AddMessageRequest})

(defn genericobject-list
  "Returns a list of all generic objects for a given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/genericobject/list

optional:
classId <string> The ID of the class whose objects will be listed.
maxResults <integer> Identifies the max number of results returned by a list. All results are returned if `maxResults` isn't defined.
token <string> Used to get the next set of results if `maxResults` is specified, but more than `maxResults` objects are available in a list. For example, if you have a list of 200 objects and you call list with `maxResults` set to 20, list will return the first 20 objects and a token. Call list again with `maxResults` set to 20 and the token to get the next 20 objects."
  ([] (genericobject-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://walletobjects.googleapis.com/walletobjects/v1/genericObject",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]}))

(defn genericobject-insert
  "Inserts a generic object with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/genericobject/insert

GenericObject:
GenericObject"
  [GenericObject]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/genericObject",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body GenericObject})

(defn genericobject-addmessage
  "Adds a message to the generic object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/genericobject/addmessage

resourceId <> 
AddMessageRequest:
AddMessageRequest"
  [resourceId AddMessageRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/genericObject/{resourceId}/addMessage",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body AddMessageRequest})

(defn genericobject-update
  "Updates the generic object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/genericobject/update

resourceId <> 
GenericObject:
GenericObject"
  [resourceId GenericObject]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/genericObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body GenericObject})

(defn genericobject-get
  "Returns the generic object with the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/genericobject/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/genericObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn genericobject-patch
  "Updates the generic object referenced by the given object ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/genericobject/patch

resourceId <> 
GenericObject:
GenericObject"
  [resourceId GenericObject]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/genericObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body GenericObject})

(defn flightobject-patch
  "Updates the flight object referenced by the given object ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/flightobject/patch

resourceId <> 
FlightObject:
FlightObject"
  [resourceId FlightObject]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/flightObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body FlightObject})

(defn flightobject-get
  "Returns the flight object with the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/flightobject/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/flightObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn flightobject-list
  "Returns a list of all flight objects for a given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/flightobject/list

optional:
classId <string> The ID of the class whose objects will be listed.
maxResults <integer> Identifies the max number of results returned by a list. All results are returned if `maxResults` isn't defined.
token <string> Used to get the next set of results if `maxResults` is specified, but more than `maxResults` objects are available in a list. For example, if you have a list of 200 objects and you call list with `maxResults` set to 20, list will return the first 20 objects and a token. Call list again with `maxResults` set to 20 and the token to get the next 20 objects."
  ([] (flightobject-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://walletobjects.googleapis.com/walletobjects/v1/flightObject",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]}))

(defn flightobject-update
  "Updates the flight object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/flightobject/update

resourceId <> 
FlightObject:
FlightObject"
  [resourceId FlightObject]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/flightObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body FlightObject})

(defn flightobject-insert
  "Inserts an flight object with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/flightobject/insert

FlightObject:
FlightObject"
  [FlightObject]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/flightObject",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body FlightObject})

(defn flightobject-addmessage
  "Adds a message to the flight object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/flightobject/addmessage

resourceId <> 
AddMessageRequest:
AddMessageRequest"
  [resourceId AddMessageRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/flightObject/{resourceId}/addMessage",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body AddMessageRequest})

(defn loyaltyobject-addmessage
  "Adds a message to the loyalty object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/loyaltyobject/addmessage

resourceId <> 
AddMessageRequest:
AddMessageRequest"
  [resourceId AddMessageRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/loyaltyObject/{resourceId}/addMessage",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body AddMessageRequest})

(defn loyaltyobject-list
  "Returns a list of all loyalty objects for a given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/loyaltyobject/list

optional:
token <string> Used to get the next set of results if `maxResults` is specified, but more than `maxResults` objects are available in a list. For example, if you have a list of 200 objects and you call list with `maxResults` set to 20, list will return the first 20 objects and a token. Call list again with `maxResults` set to 20 and the token to get the next 20 objects.
maxResults <integer> Identifies the max number of results returned by a list. All results are returned if `maxResults` isn't defined.
classId <string> The ID of the class whose objects will be listed."
  ([] (loyaltyobject-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://walletobjects.googleapis.com/walletobjects/v1/loyaltyObject",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]}))

(defn loyaltyobject-patch
  "Updates the loyalty object referenced by the given object ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/loyaltyobject/patch

resourceId <> 
LoyaltyObject:
LoyaltyObject"
  [resourceId LoyaltyObject]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/loyaltyObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body LoyaltyObject})

(defn loyaltyobject-modifylinkedofferobjects
  "Modifies linked offer objects for the loyalty object with the given ID.
https://developers.google.com/wallet/v1/reference/rest/v1/loyaltyobject/modifylinkedofferobjects

resourceId <> 
ModifyLinkedOfferObjectsRequest:
ModifyLinkedOfferObjectsRequest"
  [resourceId ModifyLinkedOfferObjectsRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/loyaltyObject/{resourceId}/modifyLinkedOfferObjects",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body ModifyLinkedOfferObjectsRequest})

(defn loyaltyobject-insert
  "Inserts an loyalty object with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/loyaltyobject/insert

LoyaltyObject:
LoyaltyObject"
  [LoyaltyObject]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/loyaltyObject",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body LoyaltyObject})

(defn loyaltyobject-update
  "Updates the loyalty object referenced by the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/loyaltyobject/update

resourceId <> 
LoyaltyObject:
LoyaltyObject"
  [resourceId LoyaltyObject]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/loyaltyObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body LoyaltyObject})

(defn loyaltyobject-get
  "Returns the loyalty object with the given object ID.
https://developers.google.com/wallet/v1/reference/rest/v1/loyaltyobject/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/loyaltyObject/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn smarttap-insert
  "Inserts the smart tap.
https://developers.google.com/wallet/v1/reference/rest/v1/smarttap/insert

SmartTap:
SmartTap"
  [SmartTap]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/smartTap",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body SmartTap})

(defn genericclass-insert
  "Inserts a generic class with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/genericclass/insert

GenericClass:
GenericClass"
  [GenericClass]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/genericClass",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body GenericClass})

(defn genericclass-get
  "Returns the generic class with the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/genericclass/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/genericClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn genericclass-update
  "Updates the Generic class referenced by the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/genericclass/update

resourceId <> 
GenericClass:
GenericClass"
  [resourceId GenericClass]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/genericClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body GenericClass})

(defn genericclass-addmessage
  "Adds a message to the generic class referenced by the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/genericclass/addmessage

resourceId <> 
AddMessageRequest:
AddMessageRequest"
  [resourceId AddMessageRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/genericClass/{resourceId}/addMessage",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body AddMessageRequest})

(defn genericclass-patch
  "Updates the generic class referenced by the given class ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/genericclass/patch

resourceId <> 
GenericClass:
GenericClass"
  [resourceId GenericClass]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/genericClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body GenericClass})

(defn genericclass-list
  "Returns a list of all generic classes for a given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/genericclass/list

optional:
issuerId <string> The ID of the issuer authorized to list classes.
maxResults <integer> Identifies the max number of results returned by a list. All results are returned if `maxResults` isn't defined.
token <string> Used to get the next set of results if `maxResults` is specified, but more than `maxResults` classes are available in a list. For example, if you have a list of 200 classes and you call list with `maxResults` set to 20, list will return the first 20 classes and a token. Call list again with `maxResults` set to 20 and the token to get the next 20 classes."
  ([] (genericclass-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://walletobjects.googleapis.com/walletobjects/v1/genericClass",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]}))

(defn offerclass-addmessage
  "Adds a message to the offer class referenced by the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/offerclass/addmessage

resourceId <> 
AddMessageRequest:
AddMessageRequest"
  [resourceId AddMessageRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/offerClass/{resourceId}/addMessage",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body AddMessageRequest})

(defn offerclass-patch
  "Updates the offer class referenced by the given class ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/offerclass/patch

resourceId <> 
OfferClass:
OfferClass"
  [resourceId OfferClass]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/offerClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body OfferClass})

(defn offerclass-list
  "Returns a list of all offer classes for a given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/offerclass/list

optional:
maxResults <integer> Identifies the max number of results returned by a list. All results are returned if `maxResults` isn't defined.
token <string> Used to get the next set of results if `maxResults` is specified, but more than `maxResults` classes are available in a list. For example, if you have a list of 200 classes and you call list with `maxResults` set to 20, list will return the first 20 classes and a token. Call list again with `maxResults` set to 20 and the token to get the next 20 classes.
issuerId <string> The ID of the issuer authorized to list classes."
  ([] (offerclass-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://walletobjects.googleapis.com/walletobjects/v1/offerClass",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]}))

(defn offerclass-update
  "Updates the offer class referenced by the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/offerclass/update

resourceId <> 
OfferClass:
OfferClass"
  [resourceId OfferClass]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/offerClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body OfferClass})

(defn offerclass-get
  "Returns the offer class with the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/offerclass/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/offerClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn offerclass-insert
  "Inserts an offer class with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/offerclass/insert

OfferClass:
OfferClass"
  [OfferClass]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/offerClass",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body OfferClass})

(defn giftcardclass-addmessage
  "Adds a message to the gift card class referenced by the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/giftcardclass/addmessage

resourceId <> 
AddMessageRequest:
AddMessageRequest"
  [resourceId AddMessageRequest]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/giftCardClass/{resourceId}/addMessage",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body AddMessageRequest})

(defn giftcardclass-insert
  "Inserts an gift card class with the given ID and properties.
https://developers.google.com/wallet/v1/reference/rest/v1/giftcardclass/insert

GiftCardClass:
GiftCardClass"
  [GiftCardClass]
  {:method :post,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/giftCardClass",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body GiftCardClass})

(defn giftcardclass-patch
  "Updates the gift card class referenced by the given class ID. This method supports patch semantics.
https://developers.google.com/wallet/v1/reference/rest/v1/giftcardclass/patch

resourceId <> 
GiftCardClass:
GiftCardClass"
  [resourceId GiftCardClass]
  {:method :patch,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/giftCardClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body GiftCardClass})

(defn giftcardclass-get
  "Returns the gift card class with the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/giftcardclass/get

resourceId <> "
  [resourceId]
  {:method :get,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/giftCardClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]})

(defn giftcardclass-update
  "Updates the gift card class referenced by the given class ID.
https://developers.google.com/wallet/v1/reference/rest/v1/giftcardclass/update

resourceId <> 
GiftCardClass:
GiftCardClass"
  [resourceId GiftCardClass]
  {:method :put,
   :uri-template
   "https://walletobjects.googleapis.com/walletobjects/v1/giftCardClass/{resourceId}",
   :uri-template-args {"resourceId" resourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"],
   :body GiftCardClass})

(defn giftcardclass-list
  "Returns a list of all gift card classes for a given issuer ID.
https://developers.google.com/wallet/v1/reference/rest/v1/giftcardclass/list

optional:
issuerId <string> The ID of the issuer authorized to list classes.
maxResults <integer> Identifies the max number of results returned by a list. All results are returned if `maxResults` isn't defined.
token <string> Used to get the next set of results if `maxResults` is specified, but more than `maxResults` classes are available in a list. For example, if you have a list of 200 classes and you call list with `maxResults` set to 20, list will return the first 20 classes and a token. Call list again with `maxResults` set to 20 and the token to get the next 20 classes."
  ([] (giftcardclass-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://walletobjects.googleapis.com/walletobjects/v1/giftCardClass",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/wallet_object.issuer"]}))
