(ns happyapi.google.firebasestorage-v1beta
  "Cloud Storage for Firebase API
The Cloud Storage for Firebase API enables programmatic management of Cloud Storage buckets for use in Firebase projects
See: https://firebase.google.com/docs/storage")

(defn projects-buckets-get
  "Gets a single linked storage bucket.
https://firebase.google.com/docs/storage/v1beta/reference/rest/v1beta/projects/buckets/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://firebasestorage.googleapis.com/v1beta/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"]})

(defn projects-buckets-list
  "Lists the linked storage buckets for a project.
https://firebase.google.com/docs/storage/v1beta/reference/rest/v1beta/projects/buckets/list

parent <> 

optional:
pageSize <integer> The maximum number of buckets to return. If not set, the server will use a reasonable default."
  ([parent] (projects-buckets-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://firebasestorage.googleapis.com/v1beta/{+parent}/buckets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"]}))

(defn projects-buckets-addFirebase
  "Links a Google Cloud Storage bucket to a Firebase project.
https://firebase.google.com/docs/storage/v1beta/reference/rest/v1beta/projects/buckets/addFirebase

bucket <> 
AddFirebaseRequest:
AddFirebaseRequest"
  [bucket AddFirebaseRequest]
  {:method :post,
   :uri-template
   "https://firebasestorage.googleapis.com/v1beta/{+bucket}:addFirebase",
   :uri-template-args {"bucket" bucket},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body AddFirebaseRequest})

(defn projects-buckets-removeFirebase
  "Unlinks a linked Google Cloud Storage bucket from a Firebase project.
https://firebase.google.com/docs/storage/v1beta/reference/rest/v1beta/projects/buckets/removeFirebase

bucket <> 
RemoveFirebaseRequest:
RemoveFirebaseRequest"
  [bucket RemoveFirebaseRequest]
  {:method :post,
   :uri-template
   "https://firebasestorage.googleapis.com/v1beta/{+bucket}:removeFirebase",
   :uri-template-args {"bucket" bucket},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body RemoveFirebaseRequest})
