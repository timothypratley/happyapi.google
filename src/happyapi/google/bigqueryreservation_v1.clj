(ns happyapi.google.bigqueryreservation-v1
  "BigQuery Reservation API
A service to modify your BigQuery flat-rate reservations.
See: https://cloud.google.com/bigquery/"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-searchAssignments
  "Deprecated: Looks up assignments for a specified resource for a particular region. If the request is about a project: 1. Assignments created on the project will be returned if they exist. 2. Otherwise assignments created on the closest ancestor will be returned. 3. Assignments for different JobTypes will all be returned. The same logic applies if the request is about a folder. If the request is about an organization, then assignments created on the organization will be returned (organization doesn't have ancestors). Comparing to ListAssignments, there are some behavior differences: 1. permission on the assignee will be verified in this API. 2. Hierarchy lookup (project->folder->organization) happens in this API. 3. Parent here is `projects/*/locations/*`, instead of `projects/*/locations/*reservations/*`. **Note** \"-\" cannot be used for projects nor locations.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/searchAssignments

parent <> 

optional:
query <string> Please specify resource name as assignee in the query. Examples: * `assignee=projects/myproject` * `assignee=folders/123` * `assignee=organizations/456`
pageSize <integer> The maximum number of items to return per page."
  ([parent] (projects-locations-searchAssignments parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://bigqueryreservation.googleapis.com/v1/{+parent}:searchAssignments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-searchAllAssignments
  "Looks up assignments for a specified resource for a particular region. If the request is about a project: 1. Assignments created on the project will be returned if they exist. 2. Otherwise assignments created on the closest ancestor will be returned. 3. Assignments for different JobTypes will all be returned. The same logic applies if the request is about a folder. If the request is about an organization, then assignments created on the organization will be returned (organization doesn't have ancestors). Comparing to ListAssignments, there are some behavior differences: 1. permission on the assignee will be verified in this API. 2. Hierarchy lookup (project->folder->organization) happens in this API. 3. Parent here is `projects/*/locations/*`, instead of `projects/*/locations/*reservations/*`.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/searchAllAssignments

parent <> 

optional:
query <string> Please specify resource name as assignee in the query. Examples: * `assignee=projects/myproject` * `assignee=folders/123` * `assignee=organizations/456`
pageSize <integer> The maximum number of items to return per page."
  ([parent] (projects-locations-searchAllAssignments parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://bigqueryreservation.googleapis.com/v1/{+parent}:searchAllAssignments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-getBiReservation
  "Retrieves a BI reservation.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/getBiReservation

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://bigqueryreservation.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-updateBiReservation
  "Updates a BI reservation. Only fields specified in the `field_mask` are updated. A singleton BI reservation always exists with default size 0. In order to reserve BI capacity it needs to be updated to an amount greater than 0. In order to release BI capacity reservation size must be set to 0.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/updateBiReservation

name <> 
BiReservation:
BiReservation

optional:
updateMask <string> A list of fields to be updated in this request."
  ([name BiReservation]
    (projects-locations-updateBiReservation name BiReservation nil))
  ([name BiReservation optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://bigqueryreservation.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"],
       :body BiReservation})))

(defn projects-locations-reservations-create
  "Creates a new reservation resource.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/reservations/create

parent <> 
Reservation:
Reservation

optional:
reservationId <string> The reservation ID. It must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters."
  ([parent Reservation]
    (projects-locations-reservations-create parent Reservation nil))
  ([parent Reservation optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://bigqueryreservation.googleapis.com/v1/{+parent}/reservations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"],
       :body Reservation})))

(defn projects-locations-reservations-list
  "Lists all the reservations for the project in the specified location.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/reservations/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return per page."
  ([parent] (projects-locations-reservations-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://bigqueryreservation.googleapis.com/v1/{+parent}/reservations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-reservations-get
  "Returns information about the reservation.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/reservations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://bigqueryreservation.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-reservations-delete
  "Deletes a reservation. Returns `google.rpc.Code.FAILED_PRECONDITION` when reservation has assignments.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/reservations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://bigqueryreservation.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-reservations-patch
  "Updates an existing reservation resource.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/reservations/patch

name <> 
Reservation:
Reservation

optional:
updateMask <string> Standard field mask for the set of fields to be updated."
  ([name Reservation]
    (projects-locations-reservations-patch name Reservation nil))
  ([name Reservation optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://bigqueryreservation.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"],
       :body Reservation})))

(defn projects-locations-reservations-failoverReservation
  "Failover a reservation to the secondary location. The operation should be done in the current secondary location, which will be promoted to the new primary location for the reservation. Attempting to failover a reservation in the current primary location will fail with the error code `google.rpc.Code.FAILED_PRECONDITION`.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/reservations/failoverReservation

name <> 
FailoverReservationRequest:
FailoverReservationRequest"
  [name FailoverReservationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://bigqueryreservation.googleapis.com/v1/{+name}:failoverReservation",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body FailoverReservationRequest}))

(defn projects-locations-reservations-assignments-create
  "Creates an assignment object which allows the given project to submit jobs of a certain type using slots from the specified reservation. Currently a resource (project, folder, organization) can only have one assignment per each (job_type, location) combination, and that reservation will be used for all jobs of the matching type. Different assignments can be created on different levels of the projects, folders or organization hierarchy. During query execution, the assignment is looked up at the project, folder and organization levels in that order. The first assignment found is applied to the query. When creating assignments, it does not matter if other assignments exist at higher levels. Example: * The organization `organizationA` contains two projects, `project1` and `project2`. * Assignments for all three entities (`organizationA`, `project1`, and `project2`) could all be created and mapped to the same or different reservations. \"None\" assignments represent an absence of the assignment. Projects assigned to None use on-demand pricing. To create a \"None\" assignment, use \"none\" as a reservation_id in the parent. Example parent: `projects/myproject/locations/US/reservations/none`. Returns `google.rpc.Code.PERMISSION_DENIED` if user does not have 'bigquery.admin' permissions on the project using the reservation and the project that owns this reservation. Returns `google.rpc.Code.INVALID_ARGUMENT` when location of the assignment does not match location of the reservation.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/reservations/assignments/create

parent <> 
Assignment:
Assignment

optional:
assignmentId <string> The optional assignment ID. Assignment name will be generated automatically if this field is empty. This field must only contain lower case alphanumeric characters or dashes. Max length is 64 characters."
  ([parent Assignment]
    (projects-locations-reservations-assignments-create
      parent
      Assignment
      nil))
  ([parent Assignment optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://bigqueryreservation.googleapis.com/v1/{+parent}/assignments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"],
       :body Assignment})))

(defn projects-locations-reservations-assignments-list
  "Lists assignments. Only explicitly created assignments will be returned. Example: * Organization `organizationA` contains two projects, `project1` and `project2`. * Reservation `res1` exists and was created previously. * CreateAssignment was used previously to define the following associations between entities and reservations: `` and `` In this example, ListAssignments will just return the above two assignments for reservation `res1`, and no expansion/merge will happen. The wildcard \"-\" can be used for reservations in the request. In that case all assignments belongs to the specified project and location will be listed. **Note** \"-\" cannot be used for projects nor locations.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/reservations/assignments/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return per page."
  ([parent]
    (projects-locations-reservations-assignments-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://bigqueryreservation.googleapis.com/v1/{+parent}/assignments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-reservations-assignments-delete
  "Deletes a assignment. No expansion will happen. Example: * Organization `organizationA` contains two projects, `project1` and `project2`. * Reservation `res1` exists and was created previously. * CreateAssignment was used previously to define the following associations between entities and reservations: `` and `` In this example, deletion of the `` assignment won't affect the other assignment ``. After said deletion, queries from `project1` will still use `res1` while queries from `project2` will switch to use on-demand mode.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/reservations/assignments/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://bigqueryreservation.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-reservations-assignments-move
  "Moves an assignment under a new reservation. This differs from removing an existing assignment and recreating a new one by providing a transactional change that ensures an assignee always has an associated reservation.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/reservations/assignments/move

name <> 
MoveAssignmentRequest:
MoveAssignmentRequest"
  [name MoveAssignmentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://bigqueryreservation.googleapis.com/v1/{+name}:move",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body MoveAssignmentRequest}))

(defn projects-locations-reservations-assignments-patch
  "Updates an existing assignment. Only the `priority` field can be updated.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/reservations/assignments/patch

name <> 
Assignment:
Assignment

optional:
updateMask <string> Standard field mask for the set of fields to be updated."
  ([name Assignment]
    (projects-locations-reservations-assignments-patch
      name
      Assignment
      nil))
  ([name Assignment optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://bigqueryreservation.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"],
       :body Assignment})))

(defn projects-locations-capacityCommitments-create
  "Creates a new capacity commitment resource.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/capacityCommitments/create

parent <> 
CapacityCommitment:
CapacityCommitment

optional:
enforceSingleAdminProjectPerOrg <boolean> If true, fail the request if another project in the organization has a capacity commitment.
capacityCommitmentId <string> The optional capacity commitment ID. Capacity commitment name will be generated automatically if this field is empty. This field must only contain lower case alphanumeric characters or dashes. The first and last character cannot be a dash. Max length is 64 characters. NOTE: this ID won't be kept if the capacity commitment is split or merged."
  ([parent CapacityCommitment]
    (projects-locations-capacityCommitments-create
      parent
      CapacityCommitment
      nil))
  ([parent CapacityCommitment optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://bigqueryreservation.googleapis.com/v1/{+parent}/capacityCommitments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"],
       :body CapacityCommitment})))

(defn projects-locations-capacityCommitments-list
  "Lists all the capacity commitments for the admin project.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/capacityCommitments/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return."
  ([parent] (projects-locations-capacityCommitments-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://bigqueryreservation.googleapis.com/v1/{+parent}/capacityCommitments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-capacityCommitments-get
  "Returns information about the capacity commitment.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/capacityCommitments/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://bigqueryreservation.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-capacityCommitments-delete
  "Deletes a capacity commitment. Attempting to delete capacity commitment before its commitment_end_time will fail with the error code `google.rpc.Code.FAILED_PRECONDITION`.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/capacityCommitments/delete

name <> 

optional:
force <boolean> Can be used to force delete commitments even if assignments exist. Deleting commitments with assignments may cause queries to fail if they no longer have access to slots."
  ([name] (projects-locations-capacityCommitments-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://bigqueryreservation.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-capacityCommitments-patch
  "Updates an existing capacity commitment. Only `plan` and `renewal_plan` fields can be updated. Plan can only be changed to a plan of a longer commitment period. Attempting to change to a plan with shorter commitment period will fail with the error code `google.rpc.Code.FAILED_PRECONDITION`.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/capacityCommitments/patch

name <> 
CapacityCommitment:
CapacityCommitment

optional:
updateMask <string> Standard field mask for the set of fields to be updated."
  ([name CapacityCommitment]
    (projects-locations-capacityCommitments-patch
      name
      CapacityCommitment
      nil))
  ([name CapacityCommitment optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://bigqueryreservation.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"],
       :body CapacityCommitment})))

(defn projects-locations-capacityCommitments-split
  "Splits capacity commitment to two commitments of the same plan and `commitment_end_time`. A common use case is to enable downgrading commitments. For example, in order to downgrade from 10000 slots to 8000, you might split a 10000 capacity commitment into commitments of 2000 and 8000. Then, you delete the first one after the commitment end time passes.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/capacityCommitments/split

name <> 
SplitCapacityCommitmentRequest:
SplitCapacityCommitmentRequest"
  [name SplitCapacityCommitmentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://bigqueryreservation.googleapis.com/v1/{+name}:split",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body SplitCapacityCommitmentRequest}))

(defn projects-locations-capacityCommitments-merge
  "Merges capacity commitments of the same plan into a single commitment. The resulting capacity commitment has the greater commitment_end_time out of the to-be-merged capacity commitments. Attempting to merge capacity commitments of different plan will fail with the error code `google.rpc.Code.FAILED_PRECONDITION`.
https://cloud.google.com/bigquery/v1/reference/rest/v1/projects/locations/capacityCommitments/merge

parent <> 
MergeCapacityCommitmentsRequest:
MergeCapacityCommitmentsRequest"
  [parent MergeCapacityCommitmentsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://bigqueryreservation.googleapis.com/v1/{+parent}/capacityCommitments:merge",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body MergeCapacityCommitmentsRequest}))
