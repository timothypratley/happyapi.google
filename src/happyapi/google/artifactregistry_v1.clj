(ns happyapi.google.artifactregistry-v1
  "Artifact Registry API
Store and manage build artifacts in a scalable and integrated service built on Google infrastructure.
See: https://cloud.google.com/artifact-registry/docs"
  (:require [happyapi.providers.google :as client]))

(defn projects-getProjectSettings
  "Retrieves the Settings for the Project.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/getProjectSettings

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-updateProjectSettings
  "Updates the Settings for the Project.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/updateProjectSettings

name <> 
ProjectSettings:
ProjectSettings

optional:
updateMask <string> Field mask to support partial updates."
  ([name ProjectSettings]
    (projects-updateProjectSettings name ProjectSettings nil))
  ([name ProjectSettings optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ProjectSettings})))

(defn projects-locations-getVpcscConfig
  "Retrieves the VPCSC Config for the Project.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/getVpcscConfig

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-updateVpcscConfig
  "Updates the VPCSC Config for the Project.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/updateVpcscConfig

name <> 
VPCSCConfig:
VPCSCConfig

optional:
updateMask <string> Field mask to support partial updates."
  ([name VPCSCConfig]
    (projects-locations-updateVpcscConfig name VPCSCConfig nil))
  ([name VPCSCConfig optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body VPCSCConfig})))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-repositories-list
  "Lists repositories.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/list

parent <> 

optional:
pageSize <integer> The maximum number of repositories to return. Maximum page size is 1,000."
  ([parent] (projects-locations-repositories-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+parent}/repositories",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-repositories-get
  "Gets a repository.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-repositories-create
  "Creates a repository. The returned Operation will finish once the repository has been created. Its response will be the created Repository.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/create

parent <> 
Repository:
Repository

optional:
repositoryId <string> Required. The repository id to use for this repository."
  ([parent Repository]
    (projects-locations-repositories-create parent Repository nil))
  ([parent Repository optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+parent}/repositories",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Repository})))

(defn projects-locations-repositories-patch
  "Updates a repository.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/patch

name <> 
Repository:
Repository

optional:
updateMask <string> The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask"
  ([name Repository]
    (projects-locations-repositories-patch name Repository nil))
  ([name Repository optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Repository})))

(defn projects-locations-repositories-delete
  "Deletes a repository and all of its contents. The returned Operation will finish once the repository has been deleted. It will not have any Operation metadata and will return a google.protobuf.Empty response.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-setIamPolicy
  "Updates the IAM policy for a given resource.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-repositories-getIamPolicy
  "Gets the IAM policy for a given resource.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-repositories-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-repositories-testIamPermissions
  "Tests if the caller has a list of permissions on a resource.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-repositories-yumArtifacts-import
  "Imports Yum (RPM) artifacts. The returned Operation will complete once the resources are imported. Package, Version, and File resources are created based on the imported artifacts. Imported artifacts that conflict with existing resources are ignored.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/yumArtifacts/import

parent <> 
ImportYumArtifactsRequest:
ImportYumArtifactsRequest"
  [parent ImportYumArtifactsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+parent}/yumArtifacts:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ImportYumArtifactsRequest}))

(defn projects-locations-repositories-yumArtifacts-upload
  "Directly uploads a Yum artifact. The returned Operation will complete once the resources are uploaded. Package, Version, and File resources are created based on the imported artifact. Imported artifacts that conflict with existing resources are ignored.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/yumArtifacts/upload

parent <> 
UploadYumArtifactRequest:
UploadYumArtifactRequest"
  [parent UploadYumArtifactRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+parent}/yumArtifacts:create",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UploadYumArtifactRequest}))

(defn projects-locations-repositories-mavenArtifacts-list
  "Lists maven artifacts.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/mavenArtifacts/list

parent <> 

optional:
pageSize <integer> The maximum number of artifacts to return. Maximum page size is 1,000."
  ([parent]
    (projects-locations-repositories-mavenArtifacts-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+parent}/mavenArtifacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-repositories-mavenArtifacts-get
  "Gets a maven artifact.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/mavenArtifacts/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-repositories-aptArtifacts-import
  "Imports Apt artifacts. The returned Operation will complete once the resources are imported. Package, Version, and File resources are created based on the imported artifacts. Imported artifacts that conflict with existing resources are ignored.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/aptArtifacts/import

parent <> 
ImportAptArtifactsRequest:
ImportAptArtifactsRequest"
  [parent ImportAptArtifactsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+parent}/aptArtifacts:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ImportAptArtifactsRequest}))

(defn projects-locations-repositories-aptArtifacts-upload
  "Directly uploads an Apt artifact. The returned Operation will complete once the resources are uploaded. Package, Version, and File resources are created based on the imported artifact. Imported artifacts that conflict with existing resources are ignored.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/aptArtifacts/upload

parent <> 
UploadAptArtifactRequest:
UploadAptArtifactRequest"
  [parent UploadAptArtifactRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+parent}/aptArtifacts:create",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UploadAptArtifactRequest}))

(defn projects-locations-repositories-files-list
  "Lists files.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/files/list

parent <> 

optional:
filter <string> An expression for filtering the results of the request. Filter rules are case insensitive. The fields eligible for filtering are: * `name` * `owner` An example of using a filter: * `name=\"projects/p1/locations/us-central1/repositories/repo1/files/a/b/*\"` --> Files with an ID starting with \"a/b/\". * `owner=\"projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/1.0\"` --> Files owned by the version `1.0` in package `pkg1`.
pageSize <integer> The maximum number of files to return. Maximum page size is 1,000.
orderBy <string> The field to order the results by."
  ([parent] (projects-locations-repositories-files-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+parent}/files",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-repositories-files-get
  "Gets a file.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/files/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-repositories-files-download
  "Download a file.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/files/download

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}:download",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-repositories-files-delete
  "Deletes a file and all of its content. It is only allowed on generic repositories. The returned operation will complete once the file has been deleted.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/files/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-kfpArtifacts-upload
  "Directly uploads a KFP artifact. The returned Operation will complete once the resource is uploaded. Package, Version, and File resources will be created based on the uploaded artifact. Uploaded artifacts that conflict with existing resources will be overwritten.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/kfpArtifacts/upload

parent <> 
UploadKfpArtifactRequest:
UploadKfpArtifactRequest"
  [parent UploadKfpArtifactRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+parent}/kfpArtifacts:create",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UploadKfpArtifactRequest}))

(defn projects-locations-repositories-npmPackages-list
  "Lists npm packages.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/npmPackages/list

parent <> 

optional:
pageSize <integer> The maximum number of artifacts to return. Maximum page size is 1,000."
  ([parent]
    (projects-locations-repositories-npmPackages-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+parent}/npmPackages",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-repositories-npmPackages-get
  "Gets a npm package.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/npmPackages/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-repositories-genericArtifacts-upload
  "Directly uploads a Generic artifact. The returned operation will complete once the resources are uploaded. Package, version, and file resources are created based on the uploaded artifact. Uploaded artifacts that conflict with existing resources will raise an `ALREADY_EXISTS` error.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/genericArtifacts/upload

parent <> 
UploadGenericArtifactRequest:
UploadGenericArtifactRequest"
  [parent UploadGenericArtifactRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+parent}/genericArtifacts:create",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UploadGenericArtifactRequest}))

(defn projects-locations-repositories-dockerImages-list
  "Lists docker images.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/dockerImages/list

parent <> 

optional:
pageSize <integer> The maximum number of artifacts to return. Maximum page size is 1,000.
orderBy <string> The field to order the results by."
  ([parent]
    (projects-locations-repositories-dockerImages-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+parent}/dockerImages",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-repositories-dockerImages-get
  "Gets a docker image.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/dockerImages/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-repositories-googetArtifacts-import
  "Imports GooGet artifacts. The returned Operation will complete once the resources are imported. Package, Version, and File resources are created based on the imported artifacts. Imported artifacts that conflict with existing resources are ignored.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/googetArtifacts/import

parent <> 
ImportGoogetArtifactsRequest:
ImportGoogetArtifactsRequest"
  [parent ImportGoogetArtifactsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+parent}/googetArtifacts:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ImportGoogetArtifactsRequest}))

(defn projects-locations-repositories-googetArtifacts-upload
  "Directly uploads a GooGet artifact. The returned Operation will complete once the resources are uploaded. Package, Version, and File resources are created based on the imported artifact. Imported artifacts that conflict with existing resources are ignored.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/googetArtifacts/upload

parent <> 
UploadGoogetArtifactRequest:
UploadGoogetArtifactRequest"
  [parent UploadGoogetArtifactRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+parent}/googetArtifacts:create",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UploadGoogetArtifactRequest}))

(defn projects-locations-repositories-goModules-upload
  "Directly uploads a Go module. The returned Operation will complete once the Go module is uploaded. Package, Version, and File resources are created based on the uploaded Go module.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/goModules/upload

parent <> 
UploadGoModuleRequest:
UploadGoModuleRequest"
  [parent UploadGoModuleRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+parent}/goModules:create",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UploadGoModuleRequest}))

(defn projects-locations-repositories-pythonPackages-list
  "Lists python packages.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/pythonPackages/list

parent <> 

optional:
pageSize <integer> The maximum number of artifacts to return. Maximum page size is 1,000."
  ([parent]
    (projects-locations-repositories-pythonPackages-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+parent}/pythonPackages",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-repositories-pythonPackages-get
  "Gets a python package.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/pythonPackages/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-repositories-packages-list
  "Lists packages.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/packages/list

parent <> 

optional:
pageSize <integer> The maximum number of packages to return. Maximum page size is 1,000."
  ([parent] (projects-locations-repositories-packages-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+parent}/packages",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-repositories-packages-get
  "Gets a package.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/packages/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-repositories-packages-delete
  "Deletes a package and all of its versions and tags. The returned operation will complete once the package has been deleted.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/packages/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-repositories-packages-patch
  "Updates a package.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/packages/patch

name <> 
Package:
Package

optional:
updateMask <string> The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask"
  ([name Package]
    (projects-locations-repositories-packages-patch name Package nil))
  ([name Package optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Package})))

(defn projects-locations-repositories-packages-versions-list
  "Lists versions.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/packages/versions/list

parent <> 

optional:
pageSize <integer> The maximum number of versions to return. Maximum page size is 1,000.
view <string> The view that should be returned in the response.
orderBy <string> Optional. The field to order the results by."
  ([parent]
    (projects-locations-repositories-packages-versions-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+parent}/versions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-repositories-packages-versions-get
  "Gets a version
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/packages/versions/get

name <> 

optional:
view <string> The view that should be returned in the response."
  ([name]
    (projects-locations-repositories-packages-versions-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-repositories-packages-versions-delete
  "Deletes a version and all of its content. The returned operation will complete once the version has been deleted.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/packages/versions/delete

name <> 

optional:
force <boolean> By default, a version that is tagged may not be deleted. If force=true, the version and any tags pointing to the version are deleted."
  ([name]
    (projects-locations-repositories-packages-versions-delete
      name
      nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-repositories-packages-versions-batchDelete
  "Deletes multiple versions across a repository. The returned operation will complete once the versions have been deleted.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/packages/versions/batchDelete

parent <> 
BatchDeleteVersionsRequest:
BatchDeleteVersionsRequest"
  [parent BatchDeleteVersionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+parent}/versions:batchDelete",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BatchDeleteVersionsRequest}))

(defn projects-locations-repositories-packages-tags-list
  "Lists tags.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/packages/tags/list

parent <> 

optional:
filter <string> An expression for filtering the results of the request. Filter rules are case insensitive. The fields eligible for filtering are: * `version` An example of using a filter: * `version=\"projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/1.0\"` --> Tags that are applied to the version `1.0` in package `pkg1`. * `name=\"projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/a%2Fb%2F*\"` --> tags with an ID starting with \"a/b/\". * `name=\"projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/*%2Fb%2Fc\"` --> tags with an ID ending with \"/b/c\". * `name=\"projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/*%2Fb%2F*\"` --> tags with an ID containing \"/b/\".
pageSize <integer> The maximum number of tags to return. Maximum page size is 1,000."
  ([parent]
    (projects-locations-repositories-packages-tags-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+parent}/tags",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-repositories-packages-tags-get
  "Gets a tag.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/packages/tags/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-repositories-packages-tags-create
  "Creates a tag.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/packages/tags/create

parent <> 
Tag:
Tag

optional:
tagId <string> The tag id to use for this repository."
  ([parent Tag]
    (projects-locations-repositories-packages-tags-create
      parent
      Tag
      nil))
  ([parent Tag optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+parent}/tags",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Tag})))

(defn projects-locations-repositories-packages-tags-patch
  "Updates a tag.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/packages/tags/patch

name <> 
Tag:
Tag

optional:
updateMask <string> The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask"
  ([name Tag]
    (projects-locations-repositories-packages-tags-patch name Tag nil))
  ([name Tag optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://artifactregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Tag})))

(defn projects-locations-repositories-packages-tags-delete
  "Deletes a tag.
https://cloud.google.com/artifact-registry/docs/v1/reference/rest/v1/projects/locations/repositories/packages/tags/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://artifactregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
