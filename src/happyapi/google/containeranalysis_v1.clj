(ns happyapi.google.containeranalysis-v1
  "Container Analysis API
This API is a prerequisite for leveraging Artifact Analysis scanning capabilities in both Artifact Registry and with Advanced Vulnerability Insights (runtime scanning) in GKE. In addition, the Container Analysis API is an implementation of the Grafeas API, which enables storing, querying, and retrieval of critical metadata about all of your software artifacts.
See: https://cloud.google.com/artifact-analysis/docs/reference/rest")

(defn projects-occurrences-batchCreate
  "Creates new occurrences in batch.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/occurrences/batchCreate

parent <> 
BatchCreateOccurrencesRequest:
BatchCreateOccurrencesRequest"
  [parent BatchCreateOccurrencesRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+parent}/occurrences:batchCreate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body BatchCreateOccurrencesRequest})

(defn projects-occurrences-list
  "Lists occurrences for the specified project.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/occurrences/list

parent <> 

optional:
filter <string> The filter expression.
pageSize <integer> Number of occurrences to return in the list. Must be positive. Max allowed page size is 1000. If not specified, page size defaults to 20."
  ([parent] (projects-occurrences-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://containeranalysis.googleapis.com/v1/{+parent}/occurrences",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-occurrences-setIamPolicy
  "Sets the access control policy on the specified note or occurrence. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a note or an occurrence, respectively. The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/occurrences/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-occurrences-delete
  "Deletes the specified occurrence. For example, use this method to delete an occurrence when the occurrence is no longer applicable for the given resource.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/occurrences/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://containeranalysis.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-occurrences-getNotes
  "Gets the note attached to the specified occurrence. Consumer projects can use this method to get a note that belongs to a provider project.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/occurrences/getNotes

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+name}/notes",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-occurrences-patch
  "Updates the specified occurrence.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/occurrences/patch

name <> 
Occurrence:
Occurrence

optional:
updateMask <string> The fields to update."
  ([name Occurrence] (projects-occurrences-patch name Occurrence nil))
  ([name Occurrence optional]
    {:method :patch,
     :uri-template
     "https://containeranalysis.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Occurrence}))

(defn projects-occurrences-getVulnerabilitySummary
  "Gets a summary of the number and severity of occurrences.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/occurrences/getVulnerabilitySummary

parent <> 

optional:
filter <string> The filter expression."
  ([parent] (projects-occurrences-getVulnerabilitySummary parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://containeranalysis.googleapis.com/v1/{+parent}/occurrences:vulnerabilitySummary",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-occurrences-getIamPolicy
  "Gets the access control policy for a note or an occurrence resource. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a note or occurrence, respectively. The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/occurrences/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GetIamPolicyRequest})

(defn projects-occurrences-create
  "Creates a new occurrence.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/occurrences/create

parent <> 
Occurrence:
Occurrence"
  [parent Occurrence]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+parent}/occurrences",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body Occurrence})

(defn projects-occurrences-get
  "Gets the specified occurrence.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/occurrences/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://containeranalysis.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-occurrences-testIamPermissions
  "Returns the permissions that a caller has on the specified note or occurrence. Requires list permission on the project (for example, `containeranalysis.notes.list`). The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/occurrences/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-occurrences-batchCreate
  "Creates new occurrences in batch.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/occurrences/batchCreate

parent <> 
BatchCreateOccurrencesRequest:
BatchCreateOccurrencesRequest"
  [parent BatchCreateOccurrencesRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+parent}/occurrences:batchCreate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body BatchCreateOccurrencesRequest})

(defn projects-locations-occurrences-list
  "Lists occurrences for the specified project.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/occurrences/list

parent <> 

optional:
filter <string> The filter expression.
pageSize <integer> Number of occurrences to return in the list. Must be positive. Max allowed page size is 1000. If not specified, page size defaults to 20."
  ([parent] (projects-locations-occurrences-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://containeranalysis.googleapis.com/v1/{+parent}/occurrences",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-occurrences-setIamPolicy
  "Sets the access control policy on the specified note or occurrence. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a note or an occurrence, respectively. The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/occurrences/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-occurrences-delete
  "Deletes the specified occurrence. For example, use this method to delete an occurrence when the occurrence is no longer applicable for the given resource.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/occurrences/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://containeranalysis.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-occurrences-getNotes
  "Gets the note attached to the specified occurrence. Consumer projects can use this method to get a note that belongs to a provider project.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/occurrences/getNotes

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+name}/notes",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-occurrences-patch
  "Updates the specified occurrence.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/occurrences/patch

name <> 
Occurrence:
Occurrence

optional:
updateMask <string> The fields to update."
  ([name Occurrence]
    (projects-locations-occurrences-patch name Occurrence nil))
  ([name Occurrence optional]
    {:method :patch,
     :uri-template
     "https://containeranalysis.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Occurrence}))

(defn projects-locations-occurrences-getVulnerabilitySummary
  "Gets a summary of the number and severity of occurrences.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/occurrences/getVulnerabilitySummary

parent <> 

optional:
filter <string> The filter expression."
  ([parent]
    (projects-locations-occurrences-getVulnerabilitySummary
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://containeranalysis.googleapis.com/v1/{+parent}/occurrences:vulnerabilitySummary",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-occurrences-getIamPolicy
  "Gets the access control policy for a note or an occurrence resource. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a note or occurrence, respectively. The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/occurrences/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GetIamPolicyRequest})

(defn projects-locations-occurrences-create
  "Creates a new occurrence.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/occurrences/create

parent <> 
Occurrence:
Occurrence"
  [parent Occurrence]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+parent}/occurrences",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body Occurrence})

(defn projects-locations-occurrences-get
  "Gets the specified occurrence.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/occurrences/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://containeranalysis.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-occurrences-testIamPermissions
  "Returns the permissions that a caller has on the specified note or occurrence. Requires list permission on the project (for example, `containeranalysis.notes.list`). The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/occurrences/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-resources-exportSBOM
  "Generates an SBOM for the given resource.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/resources/exportSBOM

name <> 
ExportSBOMRequest:
ExportSBOMRequest"
  [name ExportSBOMRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+name}:exportSBOM",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ExportSBOMRequest})

(defn projects-locations-notes-batchCreate
  "Creates new notes in batch.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/notes/batchCreate

parent <> 
BatchCreateNotesRequest:
BatchCreateNotesRequest"
  [parent BatchCreateNotesRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+parent}/notes:batchCreate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body BatchCreateNotesRequest})

(defn projects-locations-notes-list
  "Lists notes for the specified project.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/notes/list

parent <> 

optional:
filter <string> The filter expression.
pageSize <integer> Number of notes to return in the list. Must be positive. Max allowed page size is 1000. If not specified, page size defaults to 20."
  ([parent] (projects-locations-notes-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://containeranalysis.googleapis.com/v1/{+parent}/notes",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notes-setIamPolicy
  "Sets the access control policy on the specified note or occurrence. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a note or an occurrence, respectively. The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/notes/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-notes-delete
  "Deletes the specified note.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/notes/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://containeranalysis.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-notes-patch
  "Updates the specified note.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/notes/patch

name <> 
Note:
Note

optional:
updateMask <string> The fields to update."
  ([name Note] (projects-locations-notes-patch name Note nil))
  ([name Note optional]
    {:method :patch,
     :uri-template
     "https://containeranalysis.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Note}))

(defn projects-locations-notes-getIamPolicy
  "Gets the access control policy for a note or an occurrence resource. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a note or occurrence, respectively. The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/notes/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GetIamPolicyRequest})

(defn projects-locations-notes-create
  "Creates a new note.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/notes/create

parent <> 
Note:
Note

optional:
noteId <string> Required. The ID to use for this note."
  ([parent Note] (projects-locations-notes-create parent Note nil))
  ([parent Note optional]
    {:method :post,
     :uri-template
     "https://containeranalysis.googleapis.com/v1/{+parent}/notes",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Note}))

(defn projects-locations-notes-get
  "Gets the specified note.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/notes/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://containeranalysis.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-notes-testIamPermissions
  "Returns the permissions that a caller has on the specified note or occurrence. Requires list permission on the project (for example, `containeranalysis.notes.list`). The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/notes/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-notes-occurrences-list
  "Lists occurrences referencing the specified note. Provider projects can use this method to get all occurrences across consumer projects referencing the specified note.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/locations/notes/occurrences/list

name <> 

optional:
filter <string> The filter expression.
pageSize <integer> Number of occurrences to return in the list."
  ([name] (projects-locations-notes-occurrences-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://containeranalysis.googleapis.com/v1/{+name}/occurrences",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-resources-exportSBOM
  "Generates an SBOM for the given resource.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/resources/exportSBOM

name <> 
ExportSBOMRequest:
ExportSBOMRequest"
  [name ExportSBOMRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+name}:exportSBOM",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ExportSBOMRequest})

(defn projects-notes-batchCreate
  "Creates new notes in batch.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/notes/batchCreate

parent <> 
BatchCreateNotesRequest:
BatchCreateNotesRequest"
  [parent BatchCreateNotesRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+parent}/notes:batchCreate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body BatchCreateNotesRequest})

(defn projects-notes-list
  "Lists notes for the specified project.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/notes/list

parent <> 

optional:
pageSize <integer> Number of notes to return in the list. Must be positive. Max allowed page size is 1000. If not specified, page size defaults to 20.
filter <string> The filter expression."
  ([parent] (projects-notes-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://containeranalysis.googleapis.com/v1/{+parent}/notes",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-notes-setIamPolicy
  "Sets the access control policy on the specified note or occurrence. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a note or an occurrence, respectively. The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/notes/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-notes-delete
  "Deletes the specified note.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/notes/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://containeranalysis.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-notes-patch
  "Updates the specified note.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/notes/patch

name <> 
Note:
Note

optional:
updateMask <string> The fields to update."
  ([name Note] (projects-notes-patch name Note nil))
  ([name Note optional]
    {:method :patch,
     :uri-template
     "https://containeranalysis.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Note}))

(defn projects-notes-getIamPolicy
  "Gets the access control policy for a note or an occurrence resource. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a note or occurrence, respectively. The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/notes/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GetIamPolicyRequest})

(defn projects-notes-create
  "Creates a new note.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/notes/create

parent <> 
Note:
Note

optional:
noteId <string> Required. The ID to use for this note."
  ([parent Note] (projects-notes-create parent Note nil))
  ([parent Note optional]
    {:method :post,
     :uri-template
     "https://containeranalysis.googleapis.com/v1/{+parent}/notes",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Note}))

(defn projects-notes-get
  "Gets the specified note.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/notes/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://containeranalysis.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-notes-testIamPermissions
  "Returns the permissions that a caller has on the specified note or occurrence. Requires list permission on the project (for example, `containeranalysis.notes.list`). The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/notes/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://containeranalysis.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-notes-occurrences-list
  "Lists occurrences referencing the specified note. Provider projects can use this method to get all occurrences across consumer projects referencing the specified note.
https://cloud.google.com/artifact-analysis/docs/reference/rest/v1/reference/rest/v1/projects/notes/occurrences/list

name <> 

optional:
pageSize <integer> Number of occurrences to return in the list.
filter <string> The filter expression."
  ([name] (projects-notes-occurrences-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://containeranalysis.googleapis.com/v1/{+name}/occurrences",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
