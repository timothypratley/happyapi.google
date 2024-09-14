(ns happyapi.google.jobs-v4
  "Cloud Talent Solution API
Cloud Talent Solution provides the capability to create, read, update, and delete job postings, as well as search jobs based on keywords and filters. 
See: https://cloud.google.com/talent-solution/job-search/docs/")

(defn projects-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://jobs.googleapis.com/v4/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"]})

(defn projects-tenants-completeQuery
  "Completes the specified prefix with keyword suggestions. Intended for use by a job search auto-complete search box.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/completeQuery

tenant <> 

optional:
query <string> Required. The query used to generate suggestions. The maximum number of allowed characters is 255.
languageCodes <string> The list of languages of the query. This is the BCP-47 language code, such as \"en-US\" or \"sr-Latn\". For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47). The maximum number of allowed characters is 255.
pageSize <integer> Required. Completion result count. The maximum allowed page size is 10.
company <string> If provided, restricts completion to specified company. The format is \"projects/{project_id}/tenants/{tenant_id}/companies/{company_id}\", for example, \"projects/foo/tenants/bar/companies/baz\".
scope <string> The scope of the completion. The defaults is CompletionScope.PUBLIC.
type <string> The completion topic. The default is CompletionType.COMBINED."
  ([tenant] (projects-tenants-completeQuery tenant nil))
  ([tenant optional]
    {:method :get,
     :uri-template
     "https://jobs.googleapis.com/v4/{+tenant}:completeQuery",
     :uri-template-args {"tenant" tenant},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/jobs"]}))

(defn projects-tenants-create
  "Creates a new tenant entity.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/create

parent <> 
Tenant:
Tenant"
  [parent Tenant]
  {:method :post,
   :uri-template "https://jobs.googleapis.com/v4/{+parent}/tenants",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"],
   :body Tenant})

(defn projects-tenants-get
  "Retrieves specified tenant.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://jobs.googleapis.com/v4/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"]})

(defn projects-tenants-patch
  "Updates specified tenant.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/patch

name <> 
Tenant:
Tenant

optional:
updateMask <string> Strongly recommended for the best service experience. If update_mask is provided, only the specified fields in tenant are updated. Otherwise all the fields are updated. A field mask to specify the tenant fields to be updated. Only top level fields of Tenant are supported."
  ([name Tenant] (projects-tenants-patch name Tenant nil))
  ([name Tenant optional]
    {:method :patch,
     :uri-template "https://jobs.googleapis.com/v4/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/jobs"],
     :body Tenant}))

(defn projects-tenants-delete
  "Deletes specified tenant.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://jobs.googleapis.com/v4/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"]})

(defn projects-tenants-list
  "Lists all tenants associated with the project.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/list

parent <> 

optional:
pageSize <integer> The maximum number of tenants to be returned, at most 100. Default is 100 if a non-positive number is provided."
  ([parent] (projects-tenants-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template "https://jobs.googleapis.com/v4/{+parent}/tenants",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/jobs"]}))

(defn projects-tenants-companies-create
  "Creates a new company entity.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/companies/create

parent <> 
Company:
Company"
  [parent Company]
  {:method :post,
   :uri-template "https://jobs.googleapis.com/v4/{+parent}/companies",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"],
   :body Company})

(defn projects-tenants-companies-get
  "Retrieves specified company.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/companies/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://jobs.googleapis.com/v4/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"]})

(defn projects-tenants-companies-patch
  "Updates specified company.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/companies/patch

name <> 
Company:
Company

optional:
updateMask <string> Strongly recommended for the best service experience. If update_mask is provided, only the specified fields in company are updated. Otherwise all the fields are updated. A field mask to specify the company fields to be updated. Only top level fields of Company are supported."
  ([name Company] (projects-tenants-companies-patch name Company nil))
  ([name Company optional]
    {:method :patch,
     :uri-template "https://jobs.googleapis.com/v4/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/jobs"],
     :body Company}))

(defn projects-tenants-companies-delete
  "Deletes specified company. Prerequisite: The company has no jobs associated with it.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/companies/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://jobs.googleapis.com/v4/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"]})

(defn projects-tenants-companies-list
  "Lists all companies associated with the project.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/companies/list

parent <> 

optional:
pageSize <integer> The maximum number of companies to be returned, at most 100. Default is 100 if a non-positive number is provided.
requireOpenJobs <boolean> Set to true if the companies requested must have open jobs. Defaults to false. If true, at most page_size of companies are fetched, among which only those with open jobs are returned."
  ([parent] (projects-tenants-companies-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://jobs.googleapis.com/v4/{+parent}/companies",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/jobs"]}))

(defn projects-tenants-clientEvents-create
  "Report events issued when end user interacts with customer's application that uses Cloud Talent Solution. You may inspect the created events in [self service tools](https://console.cloud.google.com/talent-solution/overview). [Learn more](https://cloud.google.com/talent-solution/docs/management-tools) about self service tools.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/clientEvents/create

parent <> 
ClientEvent:
ClientEvent"
  [parent ClientEvent]
  {:method :post,
   :uri-template
   "https://jobs.googleapis.com/v4/{+parent}/clientEvents",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"],
   :body ClientEvent})

(defn projects-tenants-jobs-batchCreate
  "Begins executing a batch create jobs operation.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/jobs/batchCreate

parent <> 
BatchCreateJobsRequest:
BatchCreateJobsRequest"
  [parent BatchCreateJobsRequest]
  {:method :post,
   :uri-template
   "https://jobs.googleapis.com/v4/{+parent}/jobs:batchCreate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"],
   :body BatchCreateJobsRequest})

(defn projects-tenants-jobs-list
  "Lists jobs by filter.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/jobs/list

parent <> 

optional:
filter <string> Required. The filter string specifies the jobs to be enumerated. Supported operator: =, AND The fields eligible for filtering are: * `companyName` * `requisitionId` * `status` Available values: OPEN, EXPIRED, ALL. Defaults to OPEN if no value is specified. At least one of `companyName` and `requisitionId` must present or an INVALID_ARGUMENT error is thrown. Sample Query: * companyName = \"projects/foo/tenants/bar/companies/baz\" * companyName = \"projects/foo/tenants/bar/companies/baz\" AND requisitionId = \"req-1\" * companyName = \"projects/foo/tenants/bar/companies/baz\" AND status = \"EXPIRED\" * requisitionId = \"req-1\" * requisitionId = \"req-1\" AND status = \"EXPIRED\"
pageSize <integer> The maximum number of jobs to be returned per page of results. If job_view is set to JobView.JOB_VIEW_ID_ONLY, the maximum allowed page size is 1000. Otherwise, the maximum allowed page size is 100. Default is 100 if empty or a number < 1 is specified.
jobView <string> The desired job attributes returned for jobs in the search response. Defaults to JobView.JOB_VIEW_FULL if no value is specified."
  ([parent] (projects-tenants-jobs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template "https://jobs.googleapis.com/v4/{+parent}/jobs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/jobs"]}))

(defn projects-tenants-jobs-delete
  "Deletes the specified job. Typically, the job becomes unsearchable within 10 seconds, but it may take up to 5 minutes.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/jobs/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://jobs.googleapis.com/v4/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"]})

(defn projects-tenants-jobs-batchUpdate
  "Begins executing a batch update jobs operation.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/jobs/batchUpdate

parent <> 
BatchUpdateJobsRequest:
BatchUpdateJobsRequest"
  [parent BatchUpdateJobsRequest]
  {:method :post,
   :uri-template
   "https://jobs.googleapis.com/v4/{+parent}/jobs:batchUpdate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"],
   :body BatchUpdateJobsRequest})

(defn projects-tenants-jobs-patch
  "Updates specified job. Typically, updated contents become visible in search results within 10 seconds, but it may take up to 5 minutes.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/jobs/patch

name <> 
Job:
Job

optional:
updateMask <string> Strongly recommended for the best service experience. If update_mask is provided, only the specified fields in job are updated. Otherwise all the fields are updated. A field mask to restrict the fields that are updated. Only top level fields of Job are supported."
  ([name Job] (projects-tenants-jobs-patch name Job nil))
  ([name Job optional]
    {:method :patch,
     :uri-template "https://jobs.googleapis.com/v4/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/jobs"],
     :body Job}))

(defn projects-tenants-jobs-searchForAlert
  "Searches for jobs using the provided SearchJobsRequest. This API call is intended for the use case of targeting passive job seekers (for example, job seekers who have signed up to receive email alerts about potential job opportunities), it has different algorithmic adjustments that are designed to specifically target passive job seekers. This call constrains the visibility of jobs present in the database, and only returns jobs the caller has permission to search against.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/jobs/searchForAlert

parent <> 
SearchJobsRequest:
SearchJobsRequest"
  [parent SearchJobsRequest]
  {:method :post,
   :uri-template
   "https://jobs.googleapis.com/v4/{+parent}/jobs:searchForAlert",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"],
   :body SearchJobsRequest})

(defn projects-tenants-jobs-create
  "Creates a new job. Typically, the job becomes searchable within 10 seconds, but it may take up to 5 minutes.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/jobs/create

parent <> 
Job:
Job"
  [parent Job]
  {:method :post,
   :uri-template "https://jobs.googleapis.com/v4/{+parent}/jobs",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"],
   :body Job})

(defn projects-tenants-jobs-search
  "Searches for jobs using the provided SearchJobsRequest. This call constrains the visibility of jobs present in the database, and only returns jobs that the caller has permission to search against.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/jobs/search

parent <> 
SearchJobsRequest:
SearchJobsRequest"
  [parent SearchJobsRequest]
  {:method :post,
   :uri-template
   "https://jobs.googleapis.com/v4/{+parent}/jobs:search",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"],
   :body SearchJobsRequest})

(defn projects-tenants-jobs-get
  "Retrieves the specified job, whose status is OPEN or recently EXPIRED within the last 90 days.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/jobs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://jobs.googleapis.com/v4/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"]})

(defn projects-tenants-jobs-batchDelete
  "Begins executing a batch delete jobs operation.
https://cloud.google.com/talent-solution/job-search/docs/v4/reference/rest/v4/projects/tenants/jobs/batchDelete

parent <> 
BatchDeleteJobsRequest:
BatchDeleteJobsRequest"
  [parent BatchDeleteJobsRequest]
  {:method :post,
   :uri-template
   "https://jobs.googleapis.com/v4/{+parent}/jobs:batchDelete",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/jobs"],
   :body BatchDeleteJobsRequest})
