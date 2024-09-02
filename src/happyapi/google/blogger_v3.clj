(ns happyapi.google.blogger-v3
  "Blogger API
The Blogger API provides access to posts, comments and pages of a Blogger blog.
See: https://developers.google.com/blogger/docs/3.0/getting_started"
  (:require [happyapi.providers.google :as client]))

(defn comments-get
  "Gets a comment by id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/comments/get

blogId <> 
postId <> 
commentId <> 

optional:
view <string> "
  ([blogId postId commentId]
    (comments-get blogId postId commentId nil))
  ([blogId postId commentId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/posts/{postId}/comments/{commentId}",
       :uri-template-args
       {"postId" postId, "blogId" blogId, "commentId" commentId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))

(defn comments-approve
  "Marks a comment as not spam by blog id, post id and comment id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/comments/approve

blogId <> 
postId <> 
commentId <> "
  [blogId postId commentId]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://blogger.googleapis.com/v3/blogs/{blogId}/posts/{postId}/comments/{commentId}/approve",
     :uri-template-args
     {"blogId" blogId, "commentId" commentId, "postId" postId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/blogger"]}))

(defn comments-delete
  "Deletes a comment by blog id, post id and comment id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/comments/delete

blogId <> 
postId <> 
commentId <> "
  [blogId postId commentId]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://blogger.googleapis.com/v3/blogs/{blogId}/posts/{postId}/comments/{commentId}",
     :uri-template-args
     {"blogId" blogId, "commentId" commentId, "postId" postId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/blogger"]}))

(defn comments-markAsSpam
  "Marks a comment as spam by blog id, post id and comment id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/comments/markAsSpam

blogId <> 
postId <> 
commentId <> "
  [blogId postId commentId]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://blogger.googleapis.com/v3/blogs/{blogId}/posts/{postId}/comments/{commentId}/spam",
     :uri-template-args
     {"postId" postId, "commentId" commentId, "blogId" blogId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/blogger"]}))

(defn comments-removeContent
  "Removes the content of a comment by blog id, post id and comment id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/comments/removeContent

blogId <> 
postId <> 
commentId <> "
  [blogId postId commentId]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://blogger.googleapis.com/v3/blogs/{blogId}/posts/{postId}/comments/{commentId}/removecontent",
     :uri-template-args
     {"blogId" blogId, "commentId" commentId, "postId" postId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/blogger"]}))

(defn comments-listByBlog
  "Lists comments by blog.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/comments/listByBlog

blogId <> 

optional:
maxResults <integer> 
fetchBodies <boolean> 
status <string> 
startDate <string> 
endDate <string> "
  ([blogId] (comments-listByBlog blogId nil))
  ([blogId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/comments",
       :uri-template-args {"blogId" blogId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))

(defn comments-list
  "Lists comments.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/comments/list

blogId <> 
postId <> 

optional:
startDate <string> 
maxResults <integer> 
status <string> 
fetchBodies <boolean> 
view <string> 
endDate <string> "
  ([blogId postId] (comments-list blogId postId nil))
  ([blogId postId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/posts/{postId}/comments",
       :uri-template-args {"postId" postId, "blogId" blogId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))

(defn pageViews-get
  "Gets page views by blog id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/pageViews/get

blogId <> 

optional:
range <string> "
  ([blogId] (pageViews-get blogId nil))
  ([blogId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/pageviews",
       :uri-template-args {"blogId" blogId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/blogger"]})))

(defn pages-publish
  "Publishes a page.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/pages/publish

blogId <> 
pageId <> "
  [blogId pageId]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://blogger.googleapis.com/v3/blogs/{blogId}/pages/{pageId}/publish",
     :uri-template-args {"pageId" pageId, "blogId" blogId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/blogger"]}))

(defn pages-update
  "Updates a page by blog id and page id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/pages/update

blogId <> 
pageId <> 
Page:
Page

optional:
publish <boolean> 
revert <boolean> "
  ([blogId pageId Page] (pages-update blogId pageId Page nil))
  ([blogId pageId Page optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/pages/{pageId}",
       :uri-template-args {"blogId" blogId, "pageId" pageId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/blogger"],
       :body Page})))

(defn pages-patch
  "Patches a page.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/pages/patch

blogId <> 
pageId <> 
Page:
Page

optional:
publish <boolean> 
revert <boolean> "
  ([blogId pageId Page] (pages-patch blogId pageId Page nil))
  ([blogId pageId Page optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/pages/{pageId}",
       :uri-template-args {"blogId" blogId, "pageId" pageId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/blogger"],
       :body Page})))

(defn pages-insert
  "Inserts a page.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/pages/insert

blogId <> 
Page:
Page

optional:
isDraft <boolean> "
  ([blogId Page] (pages-insert blogId Page nil))
  ([blogId Page optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/pages",
       :uri-template-args {"blogId" blogId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/blogger"],
       :body Page})))

(defn pages-revert
  "Reverts a published or scheduled page to draft state.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/pages/revert

blogId <> 
pageId <> "
  [blogId pageId]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://blogger.googleapis.com/v3/blogs/{blogId}/pages/{pageId}/revert",
     :uri-template-args {"blogId" blogId, "pageId" pageId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/blogger"]}))

(defn pages-list
  "Lists pages.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/pages/list

blogId <> 

optional:
fetchBodies <boolean> 
status <string> 
maxResults <integer> 
view <string> "
  ([blogId] (pages-list blogId nil))
  ([blogId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/pages",
       :uri-template-args {"blogId" blogId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))

(defn pages-delete
  "Deletes a page by blog id and page id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/pages/delete

blogId <> 
pageId <> 

optional:
useTrash <boolean> Move to Trash if possible"
  ([blogId pageId] (pages-delete blogId pageId nil))
  ([blogId pageId optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/pages/{pageId}",
       :uri-template-args {"blogId" blogId, "pageId" pageId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/blogger"]})))

(defn pages-get
  "Gets a page by blog id and page id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/pages/get

blogId <> 
pageId <> 

optional:
view <string> "
  ([blogId pageId] (pages-get blogId pageId nil))
  ([blogId pageId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/pages/{pageId}",
       :uri-template-args {"pageId" pageId, "blogId" blogId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))

(defn blogUserInfos-get
  "Gets one blog and user info pair by blog id and user id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/blogUserInfos/get

userId <> 
blogId <> 

optional:
maxPosts <integer> "
  ([userId blogId] (blogUserInfos-get userId blogId nil))
  ([userId blogId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/users/{userId}/blogs/{blogId}",
       :uri-template-args {"blogId" blogId, "userId" userId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))

(defn postUserInfos-get
  "Gets one post and user info pair, by post_id and user_id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/postUserInfos/get

userId <> 
blogId <> 
postId <> 

optional:
maxComments <integer> "
  ([userId blogId postId] (postUserInfos-get userId blogId postId nil))
  ([userId blogId postId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/users/{userId}/blogs/{blogId}/posts/{postId}",
       :uri-template-args
       {"postId" postId, "userId" userId, "blogId" blogId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))

(defn postUserInfos-list
  "Lists post and user info pairs.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/postUserInfos/list

userId <> 
blogId <> 

optional:
startDate <string> 
maxResults <integer> 
labels <string> 
orderBy <string> 
status <string> 
fetchBodies <boolean> 
view <string> 
endDate <string> "
  ([userId blogId] (postUserInfos-list userId blogId nil))
  ([userId blogId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/users/{userId}/blogs/{blogId}/posts",
       :uri-template-args {"blogId" blogId, "userId" userId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))

(defn blogs-getByUrl
  "Gets a blog by url.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/blogs/getByUrl

url <> 

optional:
view <string> "
  ([url] (blogs-getByUrl url nil))
  ([url optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://blogger.googleapis.com/v3/blogs/byurl",
       :uri-template-args {},
       :query-params (merge {"url" url} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))

(defn blogs-listByUser
  "Lists blogs by user.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/blogs/listByUser

userId <> 

optional:
fetchUserInfo <boolean> 
view <string> 
status <string> Default value of status is LIVE.
role <string> "
  ([userId] (blogs-listByUser userId nil))
  ([userId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/users/{userId}/blogs",
       :uri-template-args {"userId" userId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))

(defn blogs-get
  "Gets a blog by id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/blogs/get

blogId <> 

optional:
view <string> 
maxPosts <integer> "
  ([blogId] (blogs-get blogId nil))
  ([blogId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}",
       :uri-template-args {"blogId" blogId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))

(defn users-get
  "Gets one user by user_id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/users/get

userId <> "
  [userId]
  (client/*api-request*
    {:method :get,
     :uri-template "https://blogger.googleapis.com/v3/users/{userId}",
     :uri-template-args {"userId" userId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/blogger"
      "https://www.googleapis.com/auth/blogger.readonly"]}))

(defn posts-revert
  "Reverts a published or scheduled post to draft state.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/posts/revert

blogId <> 
postId <> "
  [blogId postId]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://blogger.googleapis.com/v3/blogs/{blogId}/posts/{postId}/revert",
     :uri-template-args {"postId" postId, "blogId" blogId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/blogger"]}))

(defn posts-list
  "Lists posts.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/posts/list

blogId <> 

optional:
fetchImages <boolean> 
startDate <string> 
maxResults <integer> 
labels <string> 
orderBy <string> 
status <string> 
sortOption <string> Sort direction applied to post list.
fetchBodies <boolean> 
view <string> 
endDate <string> "
  ([blogId] (posts-list blogId nil))
  ([blogId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/posts",
       :uri-template-args {"blogId" blogId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))

(defn posts-delete
  "Deletes a post by blog id and post id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/posts/delete

blogId <> 
postId <> 

optional:
useTrash <boolean> Move to Trash if possible"
  ([blogId postId] (posts-delete blogId postId nil))
  ([blogId postId optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/posts/{postId}",
       :uri-template-args {"postId" postId, "blogId" blogId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/blogger"]})))

(defn posts-getByPath
  "Gets a post by path.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/posts/getByPath

blogId <> 
path <> 

optional:
maxComments <integer> 
view <string> "
  ([blogId path] (posts-getByPath blogId path nil))
  ([blogId path optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/posts/bypath",
       :uri-template-args {"blogId" blogId},
       :query-params (merge {"path" path} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))

(defn posts-update
  "Updates a post by blog id and post id.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/posts/update

blogId <> 
postId <> 
Post:
Post

optional:
fetchBody <boolean> 
revert <boolean> 
maxComments <integer> 
fetchImages <boolean> 
publish <boolean> "
  ([blogId postId Post] (posts-update blogId postId Post nil))
  ([blogId postId Post optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/posts/{postId}",
       :uri-template-args {"blogId" blogId, "postId" postId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/blogger"],
       :body Post})))

(defn posts-patch
  "Patches a post.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/posts/patch

blogId <> 
postId <> 
Post:
Post

optional:
fetchImages <boolean> 
fetchBody <boolean> 
maxComments <integer> 
revert <boolean> 
publish <boolean> "
  ([blogId postId Post] (posts-patch blogId postId Post nil))
  ([blogId postId Post optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/posts/{postId}",
       :uri-template-args {"postId" postId, "blogId" blogId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/blogger"],
       :body Post})))

(defn posts-publish
  "Publishes a post.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/posts/publish

blogId <> 
postId <> 

optional:
publishDate <string> "
  ([blogId postId] (posts-publish blogId postId nil))
  ([blogId postId optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/posts/{postId}/publish",
       :uri-template-args {"blogId" blogId, "postId" postId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/blogger"]})))

(defn posts-insert
  "Inserts a post.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/posts/insert

blogId <> 
Post:
Post

optional:
fetchBody <boolean> 
fetchImages <boolean> 
isDraft <boolean> "
  ([blogId Post] (posts-insert blogId Post nil))
  ([blogId Post optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/posts",
       :uri-template-args {"blogId" blogId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/blogger"],
       :body Post})))

(defn posts-search
  "Searches for posts matching given query terms in the specified blog.
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/posts/search

blogId <> 
q <> 

optional:
orderBy <string> 
fetchBodies <boolean> "
  ([blogId q] (posts-search blogId q nil))
  ([blogId q optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/posts/search",
       :uri-template-args {"blogId" blogId},
       :query-params (merge {"q" q} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))

(defn posts-get
  "Gets a post by blog id and post id
https://developers.google.com/blogger/docs/3.0/getting_started/v3/reference/rest/v3/posts/get

blogId <> 
postId <> 

optional:
fetchImages <boolean> 
maxComments <integer> 
fetchBody <boolean> 
view <string> "
  ([blogId postId] (posts-get blogId postId nil))
  ([blogId postId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://blogger.googleapis.com/v3/blogs/{blogId}/posts/{postId}",
       :uri-template-args {"blogId" blogId, "postId" postId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/blogger"
        "https://www.googleapis.com/auth/blogger.readonly"]})))
