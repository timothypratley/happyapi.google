(ns happyapi.google.abusiveexperiencereport-v1
  "Abusive Experience Report API
Views Abusive Experience Report data, and gets a list of sites that have a significant number of abusive experiences.
See: https://developers.google.com/abusive-experience-report/")

(defn sites-get
  "Gets a site's Abusive Experience Report summary.
https://developers.google.com/abusive-experience-report/v1/reference/rest/v1/sites/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://abusiveexperiencereport.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn violatingSites-list
  "Lists sites that are failing in the Abusive Experience Report.
https://developers.google.com/abusive-experience-report/v1/reference/rest/v1/violatingSites/list"
  []
  {:method :get,
   :uri-template
   "https://abusiveexperiencereport.googleapis.com/v1/violatingSites",
   :uri-template-args {},
   :query-params {},
   :scopes nil})
