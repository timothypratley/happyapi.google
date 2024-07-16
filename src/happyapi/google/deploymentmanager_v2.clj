(ns happyapi.google.deploymentmanager-v2
  "Cloud Deployment Manager V2 API
The Google Cloud Deployment Manager v2 API provides services for configuring, deploying, and viewing Google Cloud services and APIs via templates which specify deployments of Cloud resources.
See: https://cloud.google.com/deployment-manager/docs"
  (:require [happyapi.providers.google :as client]))

(defn deployments-stop
  "Stops an ongoing operation. This does not roll back any work that has already been completed, but prevents any new work from being started.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/deployments/stop

project <> 
deployment <> 
DeploymentsStopRequest:
DeploymentsStopRequest"
  [project deployment DeploymentsStopRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments/{deployment}/stop",
     :uri-template-args {"project" project, "deployment" deployment},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/ndev.cloudman"],
     :body DeploymentsStopRequest}))

(defn deployments-list
  "Lists all deployments for a given project.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/deployments/list

project <> 

optional:
maxResults <integer> The maximum number of results per page that should be returned. If the number of available results is larger than `maxResults`, Compute Engine returns a `nextPageToken` that can be used to get the next page of results in subsequent list requests. Acceptable values are `0` to `500`, inclusive. (Default: `500`)
filter <string> A filter expression that filters resources listed in the response. Most Compute resources support two types of filter expressions: expressions that support regular expressions and expressions that follow API improvement proposal AIP-160. These two types of filter expressions cannot be mixed in one request. If you want to use AIP-160, your expression must specify the field name, an operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The operator must be either `=`, `!=`, `>`, `<`, `<=`, `>=` or `:`. For example, if you are filtering Compute Engine instances, you can exclude instances named `example-instance` by specifying `name != example-instance`. The `:*` comparison can be used to test whether a key has been defined. For example, to find all objects with `owner` label use: ``` labels.owner:* ``` You can also filter nested fields. For example, you could specify `scheduling.automaticRestart = false` to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels. To filter on multiple expressions, provide each separate expression within parentheses. For example: ``` (scheduling.automaticRestart = true) (cpuPlatform = \"Intel Skylake\") ``` By default, each expression is an `AND` expression. However, you can include `AND` and `OR` expressions explicitly. For example: ``` (cpuPlatform = \"Intel Skylake\") OR (cpuPlatform = \"Intel Broadwell\") AND (scheduling.automaticRestart = true) ``` If you want to use a regular expression, use the `eq` (equal) or `ne` (not equal) operator against a single un-parenthesized expression with or without quotes or against multiple parenthesized expressions. Examples: `fieldname eq unquoted literal` `fieldname eq 'single quoted literal'` `fieldname eq \"double quoted literal\"` `(fieldname1 eq literal) (fieldname2 ne \"literal\")` The literal value is interpreted as a regular expression using Google RE2 library syntax. The literal value must match the entire field. For example, to filter for instances that do not end with name \"instance\", you would use `name ne .*instance`. You cannot combine constraints on multiple fields using regular expressions.
orderBy <string> Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name. You can also sort results in descending order based on the creation timestamp using `orderBy=\"creationTimestamp desc\"`. This sorts results based on the `creationTimestamp` field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first. Currently, only sorting by `name` or `creationTimestamp desc` is supported."
  ([project] (deployments-list project nil))
  ([project optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments",
       :uri-template-args {"project" project},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.cloudman"
        "https://www.googleapis.com/auth/ndev.cloudman.readonly"]})))

(defn deployments-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/deployments/setIamPolicy

project <> 
resource <> 
GlobalSetPolicyRequest:
GlobalSetPolicyRequest"
  [project resource GlobalSetPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments/{resource}/setIamPolicy",
     :uri-template-args {"project" project, "resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/ndev.cloudman"],
     :body GlobalSetPolicyRequest}))

(defn deployments-delete
  "Deletes a deployment and all of the resources in the deployment.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/deployments/delete

project <> 
deployment <> 

optional:
deletePolicy <string> Sets the policy to use for deleting resources."
  ([project deployment] (deployments-delete project deployment nil))
  ([project deployment optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments/{deployment}",
       :uri-template-args {"project" project, "deployment" deployment},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.cloudman"]})))

(defn deployments-update
  "Updates a deployment and all of the resources described by the deployment manifest.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/deployments/update

project <> 
deployment <> 
Deployment:
Deployment

optional:
createPolicy <string> Sets the policy to use for creating new resources.
deletePolicy <string> Sets the policy to use for deleting resources.
preview <boolean> If set to true, updates the deployment and creates and updates the \"shell\" resources but does not actually alter or instantiate these resources. This allows you to preview what your deployment will look like. You can use this intent to preview how an update would affect your deployment. You must provide a `target.config` with a configuration if this is set to true. After previewing a deployment, you can deploy your resources by making a request with the `update()` or you can `cancelPreview()` to remove the preview altogether. Note that the deployment will still exist after you cancel the preview and you must separately delete this deployment if you want to remove it."
  ([project deployment Deployment]
    (deployments-update project deployment Deployment nil))
  ([project deployment Deployment optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments/{deployment}",
       :uri-template-args {"project" project, "deployment" deployment},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.cloudman"],
       :body Deployment})))

(defn deployments-cancelPreview
  "Cancels and removes the preview currently associated with the deployment.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/deployments/cancelPreview

project <> 
deployment <> 
DeploymentsCancelPreviewRequest:
DeploymentsCancelPreviewRequest"
  [project deployment DeploymentsCancelPreviewRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments/{deployment}/cancelPreview",
     :uri-template-args {"project" project, "deployment" deployment},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/ndev.cloudman"],
     :body DeploymentsCancelPreviewRequest}))

(defn deployments-patch
  "Patches a deployment and all of the resources described by the deployment manifest.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/deployments/patch

project <> 
deployment <> 
Deployment:
Deployment

optional:
createPolicy <string> Sets the policy to use for creating new resources.
deletePolicy <string> Sets the policy to use for deleting resources.
preview <boolean> If set to true, updates the deployment and creates and updates the \"shell\" resources but does not actually alter or instantiate these resources. This allows you to preview what your deployment will look like. You can use this intent to preview how an update would affect your deployment. You must provide a `target.config` with a configuration if this is set to true. After previewing a deployment, you can deploy your resources by making a request with the `update()` or you can `cancelPreview()` to remove the preview altogether. Note that the deployment will still exist after you cancel the preview and you must separately delete this deployment if you want to remove it."
  ([project deployment Deployment]
    (deployments-patch project deployment Deployment nil))
  ([project deployment Deployment optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments/{deployment}",
       :uri-template-args {"project" project, "deployment" deployment},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.cloudman"],
       :body Deployment})))

(defn deployments-getIamPolicy
  "Gets the access control policy for a resource. May be empty if no such policy or resource exists.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/deployments/getIamPolicy

project <> 
resource <> 

optional:
optionsRequestedPolicyVersion <integer> Requested IAM Policy version."
  ([project resource] (deployments-getIamPolicy project resource nil))
  ([project resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments/{resource}/getIamPolicy",
       :uri-template-args {"project" project, "resource" resource},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.cloudman"]})))

(defn deployments-insert
  "Creates a deployment and all of the resources described by the deployment manifest.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/deployments/insert

project <> 
Deployment:
Deployment

optional:
preview <boolean> If set to true, creates a deployment and creates \"shell\" resources but does not actually instantiate these resources. This allows you to preview what your deployment looks like. After previewing a deployment, you can deploy your resources by making a request with the `update()` method or you can use the `cancelPreview()` method to cancel the preview altogether. Note that the deployment will still exist after you cancel the preview and you must separately delete this deployment if you want to remove it.
createPolicy <string> Sets the policy to use for creating new resources."
  ([project Deployment] (deployments-insert project Deployment nil))
  ([project Deployment optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments",
       :uri-template-args {"project" project},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.cloudman"],
       :body Deployment})))

(defn deployments-get
  "Gets information about a specific deployment.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/deployments/get

project <> 
deployment <> "
  [project deployment]
  (client/api-request
    {:method :get,
     :uri-template
     "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments/{deployment}",
     :uri-template-args {"project" project, "deployment" deployment},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/ndev.cloudman"
      "https://www.googleapis.com/auth/ndev.cloudman.readonly"]}))

(defn deployments-testIamPermissions
  "Returns permissions that a caller has on the specified resource.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/deployments/testIamPermissions

project <> 
resource <> 
TestPermissionsRequest:
TestPermissionsRequest"
  [project resource TestPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments/{resource}/testIamPermissions",
     :uri-template-args {"project" project, "resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/ndev.cloudman"],
     :body TestPermissionsRequest}))

(defn manifests-get
  "Gets information about a specific manifest.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/manifests/get

project <> 
deployment <> 
manifest <> "
  [project deployment manifest]
  (client/api-request
    {:method :get,
     :uri-template
     "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments/{deployment}/manifests/{manifest}",
     :uri-template-args
     {"project" project, "deployment" deployment, "manifest" manifest},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/ndev.cloudman"
      "https://www.googleapis.com/auth/ndev.cloudman.readonly"]}))

(defn manifests-list
  "Lists all manifests for a given deployment.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/manifests/list

project <> 
deployment <> 

optional:
maxResults <integer> The maximum number of results per page that should be returned. If the number of available results is larger than `maxResults`, Compute Engine returns a `nextPageToken` that can be used to get the next page of results in subsequent list requests. Acceptable values are `0` to `500`, inclusive. (Default: `500`)
filter <string> A filter expression that filters resources listed in the response. Most Compute resources support two types of filter expressions: expressions that support regular expressions and expressions that follow API improvement proposal AIP-160. These two types of filter expressions cannot be mixed in one request. If you want to use AIP-160, your expression must specify the field name, an operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The operator must be either `=`, `!=`, `>`, `<`, `<=`, `>=` or `:`. For example, if you are filtering Compute Engine instances, you can exclude instances named `example-instance` by specifying `name != example-instance`. The `:*` comparison can be used to test whether a key has been defined. For example, to find all objects with `owner` label use: ``` labels.owner:* ``` You can also filter nested fields. For example, you could specify `scheduling.automaticRestart = false` to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels. To filter on multiple expressions, provide each separate expression within parentheses. For example: ``` (scheduling.automaticRestart = true) (cpuPlatform = \"Intel Skylake\") ``` By default, each expression is an `AND` expression. However, you can include `AND` and `OR` expressions explicitly. For example: ``` (cpuPlatform = \"Intel Skylake\") OR (cpuPlatform = \"Intel Broadwell\") AND (scheduling.automaticRestart = true) ``` If you want to use a regular expression, use the `eq` (equal) or `ne` (not equal) operator against a single un-parenthesized expression with or without quotes or against multiple parenthesized expressions. Examples: `fieldname eq unquoted literal` `fieldname eq 'single quoted literal'` `fieldname eq \"double quoted literal\"` `(fieldname1 eq literal) (fieldname2 ne \"literal\")` The literal value is interpreted as a regular expression using Google RE2 library syntax. The literal value must match the entire field. For example, to filter for instances that do not end with name \"instance\", you would use `name ne .*instance`. You cannot combine constraints on multiple fields using regular expressions.
orderBy <string> Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name. You can also sort results in descending order based on the creation timestamp using `orderBy=\"creationTimestamp desc\"`. This sorts results based on the `creationTimestamp` field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first. Currently, only sorting by `name` or `creationTimestamp desc` is supported."
  ([project deployment] (manifests-list project deployment nil))
  ([project deployment optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments/{deployment}/manifests",
       :uri-template-args {"project" project, "deployment" deployment},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.cloudman"
        "https://www.googleapis.com/auth/ndev.cloudman.readonly"]})))

(defn operations-get
  "Gets information about a specific operation.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/operations/get

project <> 
operation <> "
  [project operation]
  (client/api-request
    {:method :get,
     :uri-template
     "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/operations/{operation}",
     :uri-template-args {"project" project, "operation" operation},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/ndev.cloudman"
      "https://www.googleapis.com/auth/ndev.cloudman.readonly"]}))

(defn operations-list
  "Lists all operations for a project.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/operations/list

project <> 

optional:
maxResults <integer> The maximum number of results per page that should be returned. If the number of available results is larger than `maxResults`, Compute Engine returns a `nextPageToken` that can be used to get the next page of results in subsequent list requests. Acceptable values are `0` to `500`, inclusive. (Default: `500`)
filter <string> A filter expression that filters resources listed in the response. Most Compute resources support two types of filter expressions: expressions that support regular expressions and expressions that follow API improvement proposal AIP-160. These two types of filter expressions cannot be mixed in one request. If you want to use AIP-160, your expression must specify the field name, an operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The operator must be either `=`, `!=`, `>`, `<`, `<=`, `>=` or `:`. For example, if you are filtering Compute Engine instances, you can exclude instances named `example-instance` by specifying `name != example-instance`. The `:*` comparison can be used to test whether a key has been defined. For example, to find all objects with `owner` label use: ``` labels.owner:* ``` You can also filter nested fields. For example, you could specify `scheduling.automaticRestart = false` to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels. To filter on multiple expressions, provide each separate expression within parentheses. For example: ``` (scheduling.automaticRestart = true) (cpuPlatform = \"Intel Skylake\") ``` By default, each expression is an `AND` expression. However, you can include `AND` and `OR` expressions explicitly. For example: ``` (cpuPlatform = \"Intel Skylake\") OR (cpuPlatform = \"Intel Broadwell\") AND (scheduling.automaticRestart = true) ``` If you want to use a regular expression, use the `eq` (equal) or `ne` (not equal) operator against a single un-parenthesized expression with or without quotes or against multiple parenthesized expressions. Examples: `fieldname eq unquoted literal` `fieldname eq 'single quoted literal'` `fieldname eq \"double quoted literal\"` `(fieldname1 eq literal) (fieldname2 ne \"literal\")` The literal value is interpreted as a regular expression using Google RE2 library syntax. The literal value must match the entire field. For example, to filter for instances that do not end with name \"instance\", you would use `name ne .*instance`. You cannot combine constraints on multiple fields using regular expressions.
orderBy <string> Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name. You can also sort results in descending order based on the creation timestamp using `orderBy=\"creationTimestamp desc\"`. This sorts results based on the `creationTimestamp` field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first. Currently, only sorting by `name` or `creationTimestamp desc` is supported."
  ([project] (operations-list project nil))
  ([project optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/operations",
       :uri-template-args {"project" project},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.cloudman"
        "https://www.googleapis.com/auth/ndev.cloudman.readonly"]})))

(defn resources-get
  "Gets information about a single resource.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/resources/get

project <> 
deployment <> 
resource <> "
  [project deployment resource]
  (client/api-request
    {:method :get,
     :uri-template
     "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments/{deployment}/resources/{resource}",
     :uri-template-args
     {"project" project, "deployment" deployment, "resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/ndev.cloudman"
      "https://www.googleapis.com/auth/ndev.cloudman.readonly"]}))

(defn resources-list
  "Lists all resources in a given deployment.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/resources/list

project <> 
deployment <> 

optional:
maxResults <integer> The maximum number of results per page that should be returned. If the number of available results is larger than `maxResults`, Compute Engine returns a `nextPageToken` that can be used to get the next page of results in subsequent list requests. Acceptable values are `0` to `500`, inclusive. (Default: `500`)
filter <string> A filter expression that filters resources listed in the response. Most Compute resources support two types of filter expressions: expressions that support regular expressions and expressions that follow API improvement proposal AIP-160. These two types of filter expressions cannot be mixed in one request. If you want to use AIP-160, your expression must specify the field name, an operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The operator must be either `=`, `!=`, `>`, `<`, `<=`, `>=` or `:`. For example, if you are filtering Compute Engine instances, you can exclude instances named `example-instance` by specifying `name != example-instance`. The `:*` comparison can be used to test whether a key has been defined. For example, to find all objects with `owner` label use: ``` labels.owner:* ``` You can also filter nested fields. For example, you could specify `scheduling.automaticRestart = false` to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels. To filter on multiple expressions, provide each separate expression within parentheses. For example: ``` (scheduling.automaticRestart = true) (cpuPlatform = \"Intel Skylake\") ``` By default, each expression is an `AND` expression. However, you can include `AND` and `OR` expressions explicitly. For example: ``` (cpuPlatform = \"Intel Skylake\") OR (cpuPlatform = \"Intel Broadwell\") AND (scheduling.automaticRestart = true) ``` If you want to use a regular expression, use the `eq` (equal) or `ne` (not equal) operator against a single un-parenthesized expression with or without quotes or against multiple parenthesized expressions. Examples: `fieldname eq unquoted literal` `fieldname eq 'single quoted literal'` `fieldname eq \"double quoted literal\"` `(fieldname1 eq literal) (fieldname2 ne \"literal\")` The literal value is interpreted as a regular expression using Google RE2 library syntax. The literal value must match the entire field. For example, to filter for instances that do not end with name \"instance\", you would use `name ne .*instance`. You cannot combine constraints on multiple fields using regular expressions.
orderBy <string> Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name. You can also sort results in descending order based on the creation timestamp using `orderBy=\"creationTimestamp desc\"`. This sorts results based on the `creationTimestamp` field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first. Currently, only sorting by `name` or `creationTimestamp desc` is supported."
  ([project deployment] (resources-list project deployment nil))
  ([project deployment optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/deployments/{deployment}/resources",
       :uri-template-args {"project" project, "deployment" deployment},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.cloudman"
        "https://www.googleapis.com/auth/ndev.cloudman.readonly"]})))

(defn types-list
  "Lists all resource types for Deployment Manager.
https://cloud.google.com/deployment-manager/docs/v2/reference/rest/v2/types/list

project <> 

optional:
maxResults <integer> The maximum number of results per page that should be returned. If the number of available results is larger than `maxResults`, Compute Engine returns a `nextPageToken` that can be used to get the next page of results in subsequent list requests. Acceptable values are `0` to `500`, inclusive. (Default: `500`)
filter <string> A filter expression that filters resources listed in the response. Most Compute resources support two types of filter expressions: expressions that support regular expressions and expressions that follow API improvement proposal AIP-160. These two types of filter expressions cannot be mixed in one request. If you want to use AIP-160, your expression must specify the field name, an operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The operator must be either `=`, `!=`, `>`, `<`, `<=`, `>=` or `:`. For example, if you are filtering Compute Engine instances, you can exclude instances named `example-instance` by specifying `name != example-instance`. The `:*` comparison can be used to test whether a key has been defined. For example, to find all objects with `owner` label use: ``` labels.owner:* ``` You can also filter nested fields. For example, you could specify `scheduling.automaticRestart = false` to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels. To filter on multiple expressions, provide each separate expression within parentheses. For example: ``` (scheduling.automaticRestart = true) (cpuPlatform = \"Intel Skylake\") ``` By default, each expression is an `AND` expression. However, you can include `AND` and `OR` expressions explicitly. For example: ``` (cpuPlatform = \"Intel Skylake\") OR (cpuPlatform = \"Intel Broadwell\") AND (scheduling.automaticRestart = true) ``` If you want to use a regular expression, use the `eq` (equal) or `ne` (not equal) operator against a single un-parenthesized expression with or without quotes or against multiple parenthesized expressions. Examples: `fieldname eq unquoted literal` `fieldname eq 'single quoted literal'` `fieldname eq \"double quoted literal\"` `(fieldname1 eq literal) (fieldname2 ne \"literal\")` The literal value is interpreted as a regular expression using Google RE2 library syntax. The literal value must match the entire field. For example, to filter for instances that do not end with name \"instance\", you would use `name ne .*instance`. You cannot combine constraints on multiple fields using regular expressions.
orderBy <string> Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name. You can also sort results in descending order based on the creation timestamp using `orderBy=\"creationTimestamp desc\"`. This sorts results based on the `creationTimestamp` field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first. Currently, only sorting by `name` or `creationTimestamp desc` is supported."
  ([project] (types-list project nil))
  ([project optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://deploymentmanager.googleapis.com/deploymentmanager/v2/projects/{project}/global/types",
       :uri-template-args {"project" project},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.cloudman"
        "https://www.googleapis.com/auth/ndev.cloudman.readonly"]})))
