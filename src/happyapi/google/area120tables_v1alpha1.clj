(ns happyapi.google.area120tables-v1alpha1
  "Area120 Tables API

See: https://support.google.com/area120-tables/answer/10011390")

(defn tables-list
  "Lists tables for the user.
https://support.google.com/area120-tables/answer/10011390/v1alpha1/reference/rest/v1alpha1/tables/list

optional:
orderBy <string> Optional. Sorting order for the list of tables on createTime/updateTime.
pageSize <integer> The maximum number of tables to return. The service may return fewer than this value. If unspecified, at most 20 tables are returned. The maximum value is 100; values above 100 are coerced to 100."
  ([] (tables-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://area120tables.googleapis.com/v1alpha1/tables",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/drive.readonly"
      "https://www.googleapis.com/auth/spreadsheets"
      "https://www.googleapis.com/auth/spreadsheets.readonly"
      "https://www.googleapis.com/auth/tables"]}))

(defn tables-get
  "Gets a table. Returns NOT_FOUND if the table does not exist.
https://support.google.com/area120-tables/answer/10011390/v1alpha1/reference/rest/v1alpha1/tables/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://area120tables.googleapis.com/v1alpha1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive"
    "https://www.googleapis.com/auth/drive.file"
    "https://www.googleapis.com/auth/drive.readonly"
    "https://www.googleapis.com/auth/spreadsheets"
    "https://www.googleapis.com/auth/spreadsheets.readonly"
    "https://www.googleapis.com/auth/tables"]})

(defn tables-rows-list
  "Lists rows in a table. Returns NOT_FOUND if the table does not exist.
https://support.google.com/area120-tables/answer/10011390/v1alpha1/reference/rest/v1alpha1/tables/rows/list

parent <> 

optional:
filter <string> Optional. Filter to only include resources matching the requirements. For more information, see [Filtering list results](https://support.google.com/area120-tables/answer/10503371).
view <string> Optional. Column key to use for values in the row. Defaults to user entered name.
pageSize <integer> The maximum number of rows to return. The service may return fewer than this value. If unspecified, at most 50 rows are returned. The maximum value is 1,000; values above 1,000 are coerced to 1,000.
orderBy <string> Optional. Sorting order for the list of rows on createTime/updateTime."
  ([parent] (tables-rows-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://area120tables.googleapis.com/v1alpha1/{+parent}/rows",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/drive.readonly"
      "https://www.googleapis.com/auth/spreadsheets"
      "https://www.googleapis.com/auth/spreadsheets.readonly"
      "https://www.googleapis.com/auth/tables"]}))

(defn tables-rows-batchDelete
  "Deletes multiple rows.
https://support.google.com/area120-tables/answer/10011390/v1alpha1/reference/rest/v1alpha1/tables/rows/batchDelete

parent <> 
BatchDeleteRowsRequest:
BatchDeleteRowsRequest"
  [parent BatchDeleteRowsRequest]
  {:method :post,
   :uri-template
   "https://area120tables.googleapis.com/v1alpha1/{+parent}/rows:batchDelete",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive"
    "https://www.googleapis.com/auth/drive.file"
    "https://www.googleapis.com/auth/spreadsheets"
    "https://www.googleapis.com/auth/tables"],
   :body BatchDeleteRowsRequest})

(defn tables-rows-delete
  "Deletes a row.
https://support.google.com/area120-tables/answer/10011390/v1alpha1/reference/rest/v1alpha1/tables/rows/delete

name <> "
  [name]
  {:method :delete,
   :uri-template
   "https://area120tables.googleapis.com/v1alpha1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive"
    "https://www.googleapis.com/auth/drive.file"
    "https://www.googleapis.com/auth/spreadsheets"
    "https://www.googleapis.com/auth/tables"]})

(defn tables-rows-batchUpdate
  "Updates multiple rows.
https://support.google.com/area120-tables/answer/10011390/v1alpha1/reference/rest/v1alpha1/tables/rows/batchUpdate

parent <> 
BatchUpdateRowsRequest:
BatchUpdateRowsRequest"
  [parent BatchUpdateRowsRequest]
  {:method :post,
   :uri-template
   "https://area120tables.googleapis.com/v1alpha1/{+parent}/rows:batchUpdate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive"
    "https://www.googleapis.com/auth/drive.file"
    "https://www.googleapis.com/auth/spreadsheets"
    "https://www.googleapis.com/auth/tables"],
   :body BatchUpdateRowsRequest})

(defn tables-rows-batchCreate
  "Creates multiple rows.
https://support.google.com/area120-tables/answer/10011390/v1alpha1/reference/rest/v1alpha1/tables/rows/batchCreate

parent <> 
BatchCreateRowsRequest:
BatchCreateRowsRequest"
  [parent BatchCreateRowsRequest]
  {:method :post,
   :uri-template
   "https://area120tables.googleapis.com/v1alpha1/{+parent}/rows:batchCreate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive"
    "https://www.googleapis.com/auth/drive.file"
    "https://www.googleapis.com/auth/spreadsheets"
    "https://www.googleapis.com/auth/tables"],
   :body BatchCreateRowsRequest})

(defn tables-rows-create
  "Creates a row.
https://support.google.com/area120-tables/answer/10011390/v1alpha1/reference/rest/v1alpha1/tables/rows/create

parent <> 
Row:
Row

optional:
view <string> Optional. Column key to use for values in the row. Defaults to user entered name."
  ([parent Row] (tables-rows-create parent Row nil))
  ([parent Row optional]
    {:method :post,
     :uri-template
     "https://area120tables.googleapis.com/v1alpha1/{+parent}/rows",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/spreadsheets"
      "https://www.googleapis.com/auth/tables"],
     :body Row}))

(defn tables-rows-patch
  "Updates a row.
https://support.google.com/area120-tables/answer/10011390/v1alpha1/reference/rest/v1alpha1/tables/rows/patch

name <> 
Row:
Row

optional:
updateMask <string> The list of fields to update.
view <string> Optional. Column key to use for values in the row. Defaults to user entered name."
  ([name Row] (tables-rows-patch name Row nil))
  ([name Row optional]
    {:method :patch,
     :uri-template
     "https://area120tables.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/spreadsheets"
      "https://www.googleapis.com/auth/tables"],
     :body Row}))

(defn tables-rows-get
  "Gets a row. Returns NOT_FOUND if the row does not exist in the table.
https://support.google.com/area120-tables/answer/10011390/v1alpha1/reference/rest/v1alpha1/tables/rows/get

name <> 

optional:
view <string> Optional. Column key to use for values in the row. Defaults to user entered name."
  ([name] (tables-rows-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://area120tables.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/drive.readonly"
      "https://www.googleapis.com/auth/spreadsheets"
      "https://www.googleapis.com/auth/spreadsheets.readonly"
      "https://www.googleapis.com/auth/tables"]}))

(defn workspaces-get
  "Gets a workspace. Returns NOT_FOUND if the workspace does not exist.
https://support.google.com/area120-tables/answer/10011390/v1alpha1/reference/rest/v1alpha1/workspaces/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://area120tables.googleapis.com/v1alpha1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive"
    "https://www.googleapis.com/auth/drive.file"
    "https://www.googleapis.com/auth/drive.readonly"
    "https://www.googleapis.com/auth/spreadsheets"
    "https://www.googleapis.com/auth/spreadsheets.readonly"
    "https://www.googleapis.com/auth/tables"]})

(defn workspaces-list
  "Lists workspaces for the user.
https://support.google.com/area120-tables/answer/10011390/v1alpha1/reference/rest/v1alpha1/workspaces/list

optional:
pageSize <integer> The maximum number of workspaces to return. The service may return fewer than this value. If unspecified, at most 10 workspaces are returned. The maximum value is 25; values above 25 are coerced to 25."
  ([] (workspaces-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://area120tables.googleapis.com/v1alpha1/workspaces",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/drive.readonly"
      "https://www.googleapis.com/auth/spreadsheets"
      "https://www.googleapis.com/auth/spreadsheets.readonly"
      "https://www.googleapis.com/auth/tables"]}))
