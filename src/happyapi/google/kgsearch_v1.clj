(ns happyapi.google.kgsearch-v1
  "Knowledge Graph Search API
Searches the Google Knowledge Graph for entities.
See: https://developers.google.com/knowledge-graph/")

(defn entities-search
  "Searches Knowledge Graph for entities that match the constraints. A list of matched entities will be returned in response, which will be in JSON-LD format and compatible with http://schema.org
https://developers.google.com/knowledge-graph/v1/reference/rest/v1/entities/search

optional:
limit <integer> Limits the number of entities to be returned.
prefix <boolean> Enables prefix match against names and aliases of entities
types <string> Restricts returned entities with these types, e.g. Person (as defined in http://schema.org/Person). If multiple types are specified, returned entities will contain one or more of these types.
query <string> The literal query string for search.
languages <string> The list of language codes (defined in ISO 693) to run the query with, e.g. 'en'.
ids <string> The list of entity id to be used for search instead of query string. To specify multiple ids in the HTTP request, repeat the parameter in the URL as in ...?ids=A&ids=B
indent <boolean> Enables indenting of json results."
  ([] (entities-search nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://kgsearch.googleapis.com/v1/entities:search",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes nil}))
