(ns happyapi.google.dataform-v1beta1
  "Dataform API
Service to develop, version control, and operationalize SQL pipelines in BigQuery.
See: https://cloud.google.com/dataform/docs")

(defn projects-locations-getConfig
  "Get default config for a given project and location.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/getConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-updateConfig
  "Update default config for a given project and location.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/updateConfig

name <> 
Config:
Config

optional:
updateMask <string> Optional. Specifies the fields to be updated in the config."
  ([name Config] (projects-locations-updateConfig name Config nil))
  ([name Config optional]
    {:method :patch,
     :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Config}))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-repositories-readFile
  "Returns the contents of a file (inside a Repository). The Repository must not have a value for `git_remote_settings.url`.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/readFile

name <> 

optional:
commitSha <string> Optional. The commit SHA for the commit to read from. If unset, the file will be read from HEAD.
path <string> Required. Full file path to read including filename, from repository root."
  ([name] (projects-locations-repositories-readFile name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+name}:readFile",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-list
  "Lists Repositories in a given project and location.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of repositories to return. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default.
orderBy <string> Optional. This field only supports ordering by `name`. If unspecified, the server will choose the ordering. If specified, the default order is ascending for the `name` field.
filter <string> Optional. Filter for the returned list."
  ([parent] (projects-locations-repositories-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+parent}/repositories",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-repositories-fetchRemoteBranches
  "Fetches a Repository's remote branches.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/fetchRemoteBranches

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+name}:fetchRemoteBranches",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-repositories-delete
  "Deletes a single Repository.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/delete

name <> 

optional:
force <boolean> If set to true, any child resources of this repository will also be deleted. (Otherwise, the request will only succeed if the repository has no child resources.)"
  ([name] (projects-locations-repositories-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-commit
  "Applies a Git commit to a Repository. The Repository must not have a value for `git_remote_settings.url`.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/commit

name <> 
CommitRepositoryChangesRequest:
CommitRepositoryChangesRequest"
  [name CommitRepositoryChangesRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+name}:commit",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CommitRepositoryChangesRequest})

(defn projects-locations-repositories-queryDirectoryContents
  "Returns the contents of a given Repository directory. The Repository must not have a value for `git_remote_settings.url`.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/queryDirectoryContents

name <> 

optional:
commitSha <string> Optional. The Commit SHA for the commit to query from. If unset, the directory will be queried from HEAD.
path <string> Optional. The directory's full path including directory name, relative to root. If left unset, the root is used.
pageSize <integer> Optional. Maximum number of paths to return. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default."
  ([name]
    (projects-locations-repositories-queryDirectoryContents name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+name}:queryDirectoryContents",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-patch
  "Updates a single Repository.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/patch

name <> 
Repository:
Repository

optional:
updateMask <string> Optional. Specifies the fields to be updated in the repository. If left unset, all fields will be updated."
  ([name Repository]
    (projects-locations-repositories-patch name Repository nil))
  ([name Repository optional]
    {:method :patch,
     :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Repository}))

(defn projects-locations-repositories-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-repositories-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-fetchHistory
  "Fetches a Repository's history of commits. The Repository must not have a value for `git_remote_settings.url`.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/fetchHistory

name <> 

optional:
pageSize <integer> Optional. Maximum number of commits to return. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default."
  ([name] (projects-locations-repositories-fetchHistory name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+name}:fetchHistory",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-create
  "Creates a new Repository in a given project and location.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/create

parent <> 
Repository:
Repository

optional:
repositoryId <string> Required. The ID to use for the repository, which will become the final component of the repository's resource name."
  ([parent Repository]
    (projects-locations-repositories-create parent Repository nil))
  ([parent Repository optional]
    {:method :post,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+parent}/repositories",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Repository}))

(defn projects-locations-repositories-computeAccessTokenStatus
  "Computes a Repository's Git access token status.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/computeAccessTokenStatus

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+name}:computeAccessTokenStatus",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-repositories-get
  "Fetches a single Repository.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-repositories-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-repositories-workspaces-readFile
  "Returns the contents of a file (inside a Workspace).
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/readFile

workspace <> 

optional:
path <string> Required. The file's full path including filename, relative to the workspace root.
revision <string> Optional. The Git revision of the file to return. If left empty, the current contents of `path` will be returned."
  ([workspace]
    (projects-locations-repositories-workspaces-readFile
      workspace
      nil))
  ([workspace optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+workspace}:readFile",
     :uri-template-args {"workspace" workspace},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-workspaces-list
  "Lists Workspaces in a given Repository.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of workspaces to return. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default.
orderBy <string> Optional. This field only supports ordering by `name`. If unspecified, the server will choose the ordering. If specified, the default order is ascending for the `name` field.
filter <string> Optional. Filter for the returned list."
  ([parent]
    (projects-locations-repositories-workspaces-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+parent}/workspaces",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-workspaces-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-repositories-workspaces-moveDirectory
  "Moves a directory (inside a Workspace), and all of its contents, to a new location.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/moveDirectory

workspace <> 
MoveDirectoryRequest:
MoveDirectoryRequest"
  [workspace MoveDirectoryRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+workspace}:moveDirectory",
   :uri-template-args {"workspace" workspace},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body MoveDirectoryRequest})

(defn projects-locations-repositories-workspaces-moveFile
  "Moves a file (inside a Workspace) to a new location.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/moveFile

workspace <> 
MoveFileRequest:
MoveFileRequest"
  [workspace MoveFileRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+workspace}:moveFile",
   :uri-template-args {"workspace" workspace},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body MoveFileRequest})

(defn projects-locations-repositories-workspaces-fetchGitAheadBehind
  "Fetches Git ahead/behind against a remote branch.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/fetchGitAheadBehind

name <> 

optional:
remoteBranch <string> Optional. The name of the branch in the Git remote against which this workspace should be compared. If left unset, the repository's default branch name will be used."
  ([name]
    (projects-locations-repositories-workspaces-fetchGitAheadBehind
      name
      nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+name}:fetchGitAheadBehind",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-workspaces-delete
  "Deletes a single Workspace.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-repositories-workspaces-removeFile
  "Deletes a file (inside a Workspace).
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/removeFile

workspace <> 
RemoveFileRequest:
RemoveFileRequest"
  [workspace RemoveFileRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+workspace}:removeFile",
   :uri-template-args {"workspace" workspace},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RemoveFileRequest})

(defn projects-locations-repositories-workspaces-installNpmPackages
  "Installs dependency NPM packages (inside a Workspace).
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/installNpmPackages

workspace <> 
InstallNpmPackagesRequest:
InstallNpmPackagesRequest"
  [workspace InstallNpmPackagesRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+workspace}:installNpmPackages",
   :uri-template-args {"workspace" workspace},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body InstallNpmPackagesRequest})

(defn projects-locations-repositories-workspaces-reset
  "Performs a Git reset for uncommitted files in a Workspace.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/reset

name <> 
ResetWorkspaceChangesRequest:
ResetWorkspaceChangesRequest"
  [name ResetWorkspaceChangesRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+name}:reset",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ResetWorkspaceChangesRequest})

(defn projects-locations-repositories-workspaces-push
  "Pushes Git commits from a Workspace to the Repository's remote.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/push

name <> 
PushGitCommitsRequest:
PushGitCommitsRequest"
  [name PushGitCommitsRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+name}:push",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body PushGitCommitsRequest})

(defn projects-locations-repositories-workspaces-fetchFileGitStatuses
  "Fetches Git statuses for the files in a Workspace.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/fetchFileGitStatuses

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+name}:fetchFileGitStatuses",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-repositories-workspaces-commit
  "Applies a Git commit for uncommitted files in a Workspace.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/commit

name <> 
CommitWorkspaceChangesRequest:
CommitWorkspaceChangesRequest"
  [name CommitWorkspaceChangesRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+name}:commit",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CommitWorkspaceChangesRequest})

(defn projects-locations-repositories-workspaces-queryDirectoryContents
  "Returns the contents of a given Workspace directory.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/queryDirectoryContents

workspace <> 

optional:
path <string> Optional. The directory's full path including directory name, relative to the workspace root. If left unset, the workspace root is used.
pageSize <integer> Optional. Maximum number of paths to return. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default."
  ([workspace]
    (projects-locations-repositories-workspaces-queryDirectoryContents
      workspace
      nil))
  ([workspace optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+workspace}:queryDirectoryContents",
     :uri-template-args {"workspace" workspace},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-workspaces-makeDirectory
  "Creates a directory inside a Workspace.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/makeDirectory

workspace <> 
MakeDirectoryRequest:
MakeDirectoryRequest"
  [workspace MakeDirectoryRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+workspace}:makeDirectory",
   :uri-template-args {"workspace" workspace},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body MakeDirectoryRequest})

(defn projects-locations-repositories-workspaces-pull
  "Pulls Git commits from the Repository's remote into a Workspace.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/pull

name <> 
PullGitCommitsRequest:
PullGitCommitsRequest"
  [name PullGitCommitsRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+name}:pull",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body PullGitCommitsRequest})

(defn projects-locations-repositories-workspaces-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-repositories-workspaces-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-workspaces-writeFile
  "Writes to a file (inside a Workspace).
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/writeFile

workspace <> 
WriteFileRequest:
WriteFileRequest"
  [workspace WriteFileRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+workspace}:writeFile",
   :uri-template-args {"workspace" workspace},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body WriteFileRequest})

(defn projects-locations-repositories-workspaces-removeDirectory
  "Deletes a directory (inside a Workspace) and all of its contents.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/removeDirectory

workspace <> 
RemoveDirectoryRequest:
RemoveDirectoryRequest"
  [workspace RemoveDirectoryRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+workspace}:removeDirectory",
   :uri-template-args {"workspace" workspace},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RemoveDirectoryRequest})

(defn projects-locations-repositories-workspaces-fetchFileDiff
  "Fetches Git diff for an uncommitted file in a Workspace.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/fetchFileDiff

workspace <> 

optional:
path <string> Required. The file's full path including filename, relative to the workspace root."
  ([workspace]
    (projects-locations-repositories-workspaces-fetchFileDiff
      workspace
      nil))
  ([workspace optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+workspace}:fetchFileDiff",
     :uri-template-args {"workspace" workspace},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-workspaces-create
  "Creates a new Workspace in a given Repository.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/create

parent <> 
Workspace:
Workspace

optional:
workspaceId <string> Required. The ID to use for the workspace, which will become the final component of the workspace's resource name."
  ([parent Workspace]
    (projects-locations-repositories-workspaces-create
      parent
      Workspace
      nil))
  ([parent Workspace optional]
    {:method :post,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+parent}/workspaces",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Workspace}))

(defn projects-locations-repositories-workspaces-searchFiles
  "Finds the contents of a given Workspace directory by filter.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/searchFiles

workspace <> 

optional:
pageSize <integer> Optional. Maximum number of search results to return. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default.
filter <string> Optional. Optional filter for the returned list in filtering format. Filtering is only currently supported on the `path` field. See https://google.aip.dev/160 for details."
  ([workspace]
    (projects-locations-repositories-workspaces-searchFiles
      workspace
      nil))
  ([workspace optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+workspace}:searchFiles",
     :uri-template-args {"workspace" workspace},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-workspaces-get
  "Fetches a single Workspace.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-repositories-workspaces-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workspaces/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-repositories-releaseConfigs-list
  "Lists ReleaseConfigs in a given Repository.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/releaseConfigs/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of release configs to return. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default."
  ([parent]
    (projects-locations-repositories-releaseConfigs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+parent}/releaseConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-releaseConfigs-get
  "Fetches a single ReleaseConfig.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/releaseConfigs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-repositories-releaseConfigs-create
  "Creates a new ReleaseConfig in a given Repository.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/releaseConfigs/create

parent <> 
ReleaseConfig:
ReleaseConfig

optional:
releaseConfigId <string> Required. The ID to use for the release config, which will become the final component of the release config's resource name."
  ([parent ReleaseConfig]
    (projects-locations-repositories-releaseConfigs-create
      parent
      ReleaseConfig
      nil))
  ([parent ReleaseConfig optional]
    {:method :post,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+parent}/releaseConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ReleaseConfig}))

(defn projects-locations-repositories-releaseConfigs-patch
  "Updates a single ReleaseConfig.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/releaseConfigs/patch

name <> 
ReleaseConfig:
ReleaseConfig

optional:
updateMask <string> Optional. Specifies the fields to be updated in the release config. If left unset, all fields will be updated."
  ([name ReleaseConfig]
    (projects-locations-repositories-releaseConfigs-patch
      name
      ReleaseConfig
      nil))
  ([name ReleaseConfig optional]
    {:method :patch,
     :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ReleaseConfig}))

(defn projects-locations-repositories-releaseConfigs-delete
  "Deletes a single ReleaseConfig.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/releaseConfigs/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-repositories-compilationResults-list
  "Lists CompilationResults in a given Repository.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/compilationResults/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of compilation results to return. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default.
orderBy <string> Optional. This field only supports ordering by `name` and `create_time`. If unspecified, the server will choose the ordering. If specified, the default order is ascending for the `name` field.
filter <string> Optional. Filter for the returned list."
  ([parent]
    (projects-locations-repositories-compilationResults-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+parent}/compilationResults",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-compilationResults-get
  "Fetches a single CompilationResult.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/compilationResults/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-repositories-compilationResults-create
  "Creates a new CompilationResult in a given project and location.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/compilationResults/create

parent <> 
CompilationResult:
CompilationResult"
  [parent CompilationResult]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+parent}/compilationResults",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CompilationResult})

(defn projects-locations-repositories-compilationResults-query
  "Returns CompilationResultActions in a given CompilationResult.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/compilationResults/query

name <> 

optional:
pageSize <integer> Optional. Maximum number of compilation results to return. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default.
filter <string> Optional. Optional filter for the returned list. Filtering is only currently supported on the `file_path` field."
  ([name]
    (projects-locations-repositories-compilationResults-query
      name
      nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+name}:query",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-workflowConfigs-list
  "Lists WorkflowConfigs in a given Repository.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workflowConfigs/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of workflow configs to return. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default."
  ([parent]
    (projects-locations-repositories-workflowConfigs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+parent}/workflowConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-workflowConfigs-get
  "Fetches a single WorkflowConfig.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workflowConfigs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-repositories-workflowConfigs-create
  "Creates a new WorkflowConfig in a given Repository.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workflowConfigs/create

parent <> 
WorkflowConfig:
WorkflowConfig

optional:
workflowConfigId <string> Required. The ID to use for the workflow config, which will become the final component of the workflow config's resource name."
  ([parent WorkflowConfig]
    (projects-locations-repositories-workflowConfigs-create
      parent
      WorkflowConfig
      nil))
  ([parent WorkflowConfig optional]
    {:method :post,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+parent}/workflowConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body WorkflowConfig}))

(defn projects-locations-repositories-workflowConfigs-patch
  "Updates a single WorkflowConfig.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workflowConfigs/patch

name <> 
WorkflowConfig:
WorkflowConfig

optional:
updateMask <string> Optional. Specifies the fields to be updated in the workflow config. If left unset, all fields will be updated."
  ([name WorkflowConfig]
    (projects-locations-repositories-workflowConfigs-patch
      name
      WorkflowConfig
      nil))
  ([name WorkflowConfig optional]
    {:method :patch,
     :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body WorkflowConfig}))

(defn projects-locations-repositories-workflowConfigs-delete
  "Deletes a single WorkflowConfig.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workflowConfigs/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-repositories-workflowInvocations-list
  "Lists WorkflowInvocations in a given Repository.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workflowInvocations/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of workflow invocations to return. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default.
orderBy <string> Optional. This field only supports ordering by `name`. If unspecified, the server will choose the ordering. If specified, the default order is ascending for the `name` field.
filter <string> Optional. Filter for the returned list."
  ([parent]
    (projects-locations-repositories-workflowInvocations-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+parent}/workflowInvocations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-workflowInvocations-get
  "Fetches a single WorkflowInvocation.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workflowInvocations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-repositories-workflowInvocations-create
  "Creates a new WorkflowInvocation in a given Repository.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workflowInvocations/create

parent <> 
WorkflowInvocation:
WorkflowInvocation"
  [parent WorkflowInvocation]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+parent}/workflowInvocations",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body WorkflowInvocation})

(defn projects-locations-repositories-workflowInvocations-delete
  "Deletes a single WorkflowInvocation.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workflowInvocations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://dataform.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-repositories-workflowInvocations-cancel
  "Requests cancellation of a running WorkflowInvocation.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workflowInvocations/cancel

name <> 
CancelWorkflowInvocationRequest:
CancelWorkflowInvocationRequest"
  [name CancelWorkflowInvocationRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CancelWorkflowInvocationRequest})

(defn projects-locations-repositories-workflowInvocations-query
  "Returns WorkflowInvocationActions in a given WorkflowInvocation.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/workflowInvocations/query

name <> 

optional:
pageSize <integer> Optional. Maximum number of workflow invocations to return. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default."
  ([name]
    (projects-locations-repositories-workflowInvocations-query
      name
      nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+name}:query",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-commentThreads-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/commentThreads/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-repositories-commentThreads-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/commentThreads/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-repositories-commentThreads-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-commentThreads-comments-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/commentThreads/comments/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-repositories-commentThreads-comments-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/repositories/commentThreads/comments/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-repositories-commentThreads-comments-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/collections/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-collections-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/collections/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-collections-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://dataform.googleapis.com/v1beta1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/dataform/docs/v1beta1/reference/rest/v1beta1/projects/locations/collections/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://dataform.googleapis.com/v1beta1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})
