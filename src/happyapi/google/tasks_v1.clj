(ns happyapi.google.tasks-v1
  "Google Tasks API
The Google Tasks API lets you manage your tasks and task lists.
See: https://developers.google.com/tasks/"
  (:require [happyapi.providers.google :as client]))

(defn tasks-list
  "Returns all tasks in the specified task list. Does not return assigned tasks be default (from Docs, Chat Spaces). A user can have up to 20,000 non-hidden tasks per list and up to 100,000 tasks in total at a time.
https://developers.google.com/tasks/v1/reference/rest/v1/tasks/list

tasklist <> 

optional:
completedMin <string> Lower bound for a task's completion date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by completion date.
updatedMin <string> Lower bound for a task's last modification time (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by last modification time.
maxResults <integer> Maximum number of tasks returned on one page. Optional. The default is 20 (max allowed: 100).
completedMax <string> Upper bound for a task's completion date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by completion date.
showDeleted <boolean> Flag indicating whether deleted tasks are returned in the result. Optional. The default is False.
showAssigned <boolean> Optional. Flag indicating whether tasks assigned to the current user are returned in the result. Optional. The default is False.
showCompleted <boolean> Flag indicating whether completed tasks are returned in the result. Note that showHidden must also be True to show tasks completed in first party clients, such as the web UI and Google's mobile apps. Optional. The default is True.
dueMax <string> Upper bound for a task's due date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by due date.
dueMin <string> Lower bound for a task's due date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by due date.
showHidden <boolean> Flag indicating whether hidden tasks are returned in the result. Optional. The default is False."
  ([tasklist] (tasks-list tasklist nil))
  ([tasklist optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://tasks.googleapis.com/tasks/v1/lists/{tasklist}/tasks",
       :uri-template-args {"tasklist" tasklist},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tasks"
        "https://www.googleapis.com/auth/tasks.readonly"]})))

(defn tasks-delete
  "Deletes the specified task from the task list. If the task is assigned, both the assigned task and the original task (in Docs, Chat Spaces) are deleted. To delete the assigned task only, navigate to the assignment surface and unassign the task from there.
https://developers.google.com/tasks/v1/reference/rest/v1/tasks/delete

tasklist <> 
task <> "
  [tasklist task]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://tasks.googleapis.com/tasks/v1/lists/{tasklist}/tasks/{task}",
     :uri-template-args {"task" task, "tasklist" tasklist},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/tasks"]}))

(defn tasks-patch
  "Updates the specified task. This method supports patch semantics.
https://developers.google.com/tasks/v1/reference/rest/v1/tasks/patch

tasklist <> 
task <> 
Task:
Task"
  [tasklist task Task]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://tasks.googleapis.com/tasks/v1/lists/{tasklist}/tasks/{task}",
     :uri-template-args {"tasklist" tasklist, "task" task},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/tasks"],
     :body Task}))

(defn tasks-clear
  "Clears all completed tasks from the specified task list. The affected tasks will be marked as 'hidden' and no longer be returned by default when retrieving all tasks for a task list.
https://developers.google.com/tasks/v1/reference/rest/v1/tasks/clear

tasklist <> "
  [tasklist]
  (client/api-request
    {:method :post,
     :uri-template
     "https://tasks.googleapis.com/tasks/v1/lists/{tasklist}/clear",
     :uri-template-args {"tasklist" tasklist},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/tasks"]}))

(defn tasks-insert
  "Creates a new task on the specified task list. Tasks assigned from Docs or Chat Spaces cannot be inserted from Tasks Public API; they can only be created by assigning them from Docs or Chat Spaces. A user can have up to 20,000 non-hidden tasks per list and up to 100,000 tasks in total at a time.
https://developers.google.com/tasks/v1/reference/rest/v1/tasks/insert

tasklist <> 
Task:
Task

optional:
previous <string> Previous sibling task identifier. If the task is created at the first position among its siblings, this parameter is omitted. Optional.
parent <string> Parent task identifier. If the task is created at the top level, this parameter is omitted. An assigned task cannot be a parent task, nor can it have a parent. Setting the parent to an assigned task results in failure of the request. Optional."
  ([tasklist Task] (tasks-insert tasklist Task nil))
  ([tasklist Task optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://tasks.googleapis.com/tasks/v1/lists/{tasklist}/tasks",
       :uri-template-args {"tasklist" tasklist},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/tasks"],
       :body Task})))

(defn tasks-move
  "Moves the specified task to another position in the destination task list. If the destination list is not specified, the task is moved within its current list. This can include putting it as a child task under a new parent and/or move it to a different position among its sibling tasks. A user can have up to 2,000 subtasks per task.
https://developers.google.com/tasks/v1/reference/rest/v1/tasks/move

tasklist <> 
task <> 

optional:
destinationTasklist <string> Optional. Destination task list identifier. If set, the task is moved from tasklist to the destinationTasklist list. Otherwise the task is moved within its current list. Recurrent tasks cannot currently be moved between lists. Optional.
previous <string> New previous sibling task identifier. If the task is moved to the first position among its siblings, this parameter is omitted. Optional.
parent <string> New parent task identifier. If the task is moved to the top level, this parameter is omitted. Assigned tasks can not be set as parent task (have subtasks) or be moved under a parent task (become subtasks). Optional."
  ([tasklist task] (tasks-move tasklist task nil))
  ([tasklist task optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://tasks.googleapis.com/tasks/v1/lists/{tasklist}/tasks/{task}/move",
       :uri-template-args {"tasklist" tasklist, "task" task},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/tasks"]})))

(defn tasks-get
  "Returns the specified task.
https://developers.google.com/tasks/v1/reference/rest/v1/tasks/get

tasklist <> 
task <> "
  [tasklist task]
  (client/api-request
    {:method :get,
     :uri-template
     "https://tasks.googleapis.com/tasks/v1/lists/{tasklist}/tasks/{task}",
     :uri-template-args {"tasklist" tasklist, "task" task},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tasks"
      "https://www.googleapis.com/auth/tasks.readonly"]}))

(defn tasks-update
  "Updates the specified task.
https://developers.google.com/tasks/v1/reference/rest/v1/tasks/update

tasklist <> 
task <> 
Task:
Task"
  [tasklist task Task]
  (client/api-request
    {:method :put,
     :uri-template
     "https://tasks.googleapis.com/tasks/v1/lists/{tasklist}/tasks/{task}",
     :uri-template-args {"task" task, "tasklist" tasklist},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/tasks"],
     :body Task}))

(defn tasklists-delete
  "Deletes the authenticated user's specified task list. If the list contains assigned tasks, both the assigned tasks and the original tasks in the assignment surface (Docs, Chat Spaces) are deleted.
https://developers.google.com/tasks/v1/reference/rest/v1/tasklists/delete

tasklist <> "
  [tasklist]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://tasks.googleapis.com/tasks/v1/users/@me/lists/{tasklist}",
     :uri-template-args {"tasklist" tasklist},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/tasks"]}))

(defn tasklists-insert
  "Creates a new task list and adds it to the authenticated user's task lists. A user can have up to 2000 lists at a time.
https://developers.google.com/tasks/v1/reference/rest/v1/tasklists/insert

TaskList:
TaskList"
  [TaskList]
  (client/api-request
    {:method :post,
     :uri-template
     "https://tasks.googleapis.com/tasks/v1/users/@me/lists",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/tasks"],
     :body TaskList}))

(defn tasklists-update
  "Updates the authenticated user's specified task list.
https://developers.google.com/tasks/v1/reference/rest/v1/tasklists/update

tasklist <> 
TaskList:
TaskList"
  [tasklist TaskList]
  (client/api-request
    {:method :put,
     :uri-template
     "https://tasks.googleapis.com/tasks/v1/users/@me/lists/{tasklist}",
     :uri-template-args {"tasklist" tasklist},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/tasks"],
     :body TaskList}))

(defn tasklists-get
  "Returns the authenticated user's specified task list.
https://developers.google.com/tasks/v1/reference/rest/v1/tasklists/get

tasklist <> "
  [tasklist]
  (client/api-request
    {:method :get,
     :uri-template
     "https://tasks.googleapis.com/tasks/v1/users/@me/lists/{tasklist}",
     :uri-template-args {"tasklist" tasklist},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tasks"
      "https://www.googleapis.com/auth/tasks.readonly"]}))

(defn tasklists-list
  "Returns all the authenticated user's task lists. A user can have up to 2000 lists at a time.
https://developers.google.com/tasks/v1/reference/rest/v1/tasklists/list

optional:
maxResults <integer> Maximum number of task lists returned on one page. Optional. The default is 20 (max allowed: 100)."
  ([] (tasklists-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://tasks.googleapis.com/tasks/v1/users/@me/lists",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tasks"
        "https://www.googleapis.com/auth/tasks.readonly"]})))

(defn tasklists-patch
  "Updates the authenticated user's specified task list. This method supports patch semantics.
https://developers.google.com/tasks/v1/reference/rest/v1/tasklists/patch

tasklist <> 
TaskList:
TaskList"
  [tasklist TaskList]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://tasks.googleapis.com/tasks/v1/users/@me/lists/{tasklist}",
     :uri-template-args {"tasklist" tasklist},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/tasks"],
     :body TaskList}))
