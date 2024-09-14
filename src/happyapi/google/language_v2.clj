(ns happyapi.google.language-v2
  "Cloud Natural Language API
Provides natural language understanding technologies, such as sentiment analysis, entity recognition, entity sentiment analysis, and other text annotations, to developers.
See: https://cloud.google.com/natural-language/")

(defn documents-analyzeSentiment
  "Analyzes the sentiment of the provided text.
https://cloud.google.com/natural-language/v2/reference/rest/v2/documents/analyzeSentiment

AnalyzeSentimentRequest:
AnalyzeSentimentRequest"
  [AnalyzeSentimentRequest]
  {:method :post,
   :uri-template
   "https://language.googleapis.com/v2/documents:analyzeSentiment",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-language"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body AnalyzeSentimentRequest})

(defn documents-classifyText
  "Classifies a document into categories.
https://cloud.google.com/natural-language/v2/reference/rest/v2/documents/classifyText

ClassifyTextRequest:
ClassifyTextRequest"
  [ClassifyTextRequest]
  {:method :post,
   :uri-template
   "https://language.googleapis.com/v2/documents:classifyText",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-language"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body ClassifyTextRequest})

(defn documents-analyzeEntities
  "Finds named entities (currently proper names and common nouns) in the text along with entity types, probability, mentions for each entity, and other properties.
https://cloud.google.com/natural-language/v2/reference/rest/v2/documents/analyzeEntities

AnalyzeEntitiesRequest:
AnalyzeEntitiesRequest"
  [AnalyzeEntitiesRequest]
  {:method :post,
   :uri-template
   "https://language.googleapis.com/v2/documents:analyzeEntities",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-language"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body AnalyzeEntitiesRequest})

(defn documents-annotateText
  "A convenience method that provides all features in one call.
https://cloud.google.com/natural-language/v2/reference/rest/v2/documents/annotateText

AnnotateTextRequest:
AnnotateTextRequest"
  [AnnotateTextRequest]
  {:method :post,
   :uri-template
   "https://language.googleapis.com/v2/documents:annotateText",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-language"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body AnnotateTextRequest})

(defn documents-moderateText
  "Moderates a document for harmful and sensitive categories.
https://cloud.google.com/natural-language/v2/reference/rest/v2/documents/moderateText

ModerateTextRequest:
ModerateTextRequest"
  [ModerateTextRequest]
  {:method :post,
   :uri-template
   "https://language.googleapis.com/v2/documents:moderateText",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-language"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body ModerateTextRequest})
