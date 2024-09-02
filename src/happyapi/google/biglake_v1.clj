(ns happyapi.google.biglake-v1
  "BigLake API
The BigLake API provides access to BigLake Metastore, a serverless, fully managed, and highly available metastore for open-source data that can be used for querying Apache Iceberg tables in BigQuery.
See: https://cloud.google.com/bigquery/"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-catalogs-create
  "Creates a new catalog.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/create

parent <> 
Catalog:
Catalog

optional:
catalogId <string> Required. The ID to use for the catalog, which will become the final component of the catalog's resource name."
  ([parent Catalog]
    (projects-locations-catalogs-create parent Catalog nil))
  ([parent Catalog optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://biglake.googleapis.com/v1/{+parent}/catalogs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"],
       :body Catalog})))

(defn projects-locations-catalogs-delete
  "Deletes an existing catalog specified by the catalog ID.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://biglake.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-get
  "Gets the catalog specified by the resource name.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://biglake.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-list
  "List all catalogs in a specified project.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/list

parent <> 

optional:
pageSize <integer> The maximum number of catalogs to return. The service may return fewer than this value. If unspecified, at most 50 catalogs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-locations-catalogs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://biglake.googleapis.com/v1/{+parent}/catalogs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-catalogs-databases-create
  "Creates a new database.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/databases/create

parent <> 
Database:
Database

optional:
databaseId <string> Required. The ID to use for the database, which will become the final component of the database's resource name."
  ([parent Database]
    (projects-locations-catalogs-databases-create parent Database nil))
  ([parent Database optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://biglake.googleapis.com/v1/{+parent}/databases",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"],
       :body Database})))

(defn projects-locations-catalogs-databases-delete
  "Deletes an existing database specified by the database ID.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/databases/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://biglake.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-databases-patch
  "Updates an existing database specified by the database ID.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/databases/patch

name <> 
Database:
Database

optional:
updateMask <string> The list of fields to update. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If not set, defaults to all of the fields that are allowed to update."
  ([name Database]
    (projects-locations-catalogs-databases-patch name Database nil))
  ([name Database optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://biglake.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"],
       :body Database})))

(defn projects-locations-catalogs-databases-get
  "Gets the database specified by the resource name.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/databases/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://biglake.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-databases-list
  "List all databases in a specified catalog.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/databases/list

parent <> 

optional:
pageSize <integer> The maximum number of databases to return. The service may return fewer than this value. If unspecified, at most 50 databases will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-locations-catalogs-databases-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://biglake.googleapis.com/v1/{+parent}/databases",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-catalogs-databases-tables-create
  "Creates a new table.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/databases/tables/create

parent <> 
Table:
Table

optional:
tableId <string> Required. The ID to use for the table, which will become the final component of the table's resource name."
  ([parent Table]
    (projects-locations-catalogs-databases-tables-create
      parent
      Table
      nil))
  ([parent Table optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://biglake.googleapis.com/v1/{+parent}/tables",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"],
       :body Table})))

(defn projects-locations-catalogs-databases-tables-delete
  "Deletes an existing table specified by the table ID.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/databases/tables/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://biglake.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-databases-tables-patch
  "Updates an existing table specified by the table ID.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/databases/tables/patch

name <> 
Table:
Table

optional:
updateMask <string> The list of fields to update. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If not set, defaults to all of the fields that are allowed to update."
  ([name Table]
    (projects-locations-catalogs-databases-tables-patch
      name
      Table
      nil))
  ([name Table optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://biglake.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"],
       :body Table})))

(defn projects-locations-catalogs-databases-tables-rename
  "Renames an existing table specified by the table ID.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/databases/tables/rename

name <> 
RenameTableRequest:
RenameTableRequest"
  [name RenameTableRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://biglake.googleapis.com/v1/{+name}:rename",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body RenameTableRequest}))

(defn projects-locations-catalogs-databases-tables-get
  "Gets the table specified by the resource name.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/databases/tables/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://biglake.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-databases-tables-list
  "List all tables in a specified database.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/catalogs/databases/tables/list

parent <> 

optional:
pageSize <integer> The maximum number of tables to return. The service may return fewer than this value. If unspecified, at most 50 tables will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
view <string> The view for the returned tables."
  ([parent]
    (projects-locations-catalogs-databases-tables-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://biglake.googleapis.com/v1/{+parent}/tables",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"]})))
