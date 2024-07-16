(ns happyapi.google.sheets-v4
  "Google Sheets API
Reads and writes Google Sheets.
See: https://developers.google.com/sheets/"
  (:require [happyapi.providers.google :as client]))

(defn spreadsheets-create
  "Creates a spreadsheet, returning the newly created spreadsheet.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/create

Spreadsheet:
Spreadsheet"
  [Spreadsheet]
  (client/api-request
    {:method :post,
     :uri-template "https://sheets.googleapis.com/v4/spreadsheets",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/spreadsheets"],
     :body Spreadsheet}))

(defn spreadsheets-get
  "Returns the spreadsheet at the given ID. The caller must specify the spreadsheet ID. By default, data within grids is not returned. You can include grid data in one of 2 ways: * Specify a [field mask](https://developers.google.com/sheets/api/guides/field-masks) listing your desired fields using the `fields` URL parameter in HTTP * Set the includeGridData URL parameter to true. If a field mask is set, the `includeGridData` parameter is ignored For large spreadsheets, as a best practice, retrieve only the specific spreadsheet fields that you want. To retrieve only subsets of spreadsheet data, use the ranges URL parameter. Ranges are specified using [A1 notation](/sheets/api/guides/concepts#cell). You can define a single cell (for example, `A1`) or multiple cells (for example, `A1:D5`). You can also get cells from other sheets within the same spreadsheet (for example, `Sheet2!A1:C4`) or retrieve multiple ranges at once (for example, `?ranges=A1:D5&ranges=Sheet2!A1:C4`). Limiting the range returns only the portions of the spreadsheet that intersect the requested ranges.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/get

spreadsheetId <> 

optional:
ranges <string> The ranges to retrieve from the spreadsheet.
includeGridData <boolean> True if grid data should be returned. This parameter is ignored if a field mask was set in the request."
  ([spreadsheetId] (spreadsheets-get spreadsheetId nil))
  ([spreadsheetId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}",
       :uri-template-args {"spreadsheetId" spreadsheetId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.readonly"
        "https://www.googleapis.com/auth/spreadsheets"
        "https://www.googleapis.com/auth/spreadsheets.readonly"]})))

(defn spreadsheets-getByDataFilter
  "Returns the spreadsheet at the given ID. The caller must specify the spreadsheet ID. This method differs from GetSpreadsheet in that it allows selecting which subsets of spreadsheet data to return by specifying a dataFilters parameter. Multiple DataFilters can be specified. Specifying one or more data filters returns the portions of the spreadsheet that intersect ranges matched by any of the filters. By default, data within grids is not returned. You can include grid data one of 2 ways: * Specify a [field mask](https://developers.google.com/sheets/api/guides/field-masks) listing your desired fields using the `fields` URL parameter in HTTP * Set the includeGridData parameter to true. If a field mask is set, the `includeGridData` parameter is ignored For large spreadsheets, as a best practice, retrieve only the specific spreadsheet fields that you want.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/getByDataFilter

spreadsheetId <> 
GetSpreadsheetByDataFilterRequest:
GetSpreadsheetByDataFilterRequest"
  [spreadsheetId GetSpreadsheetByDataFilterRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}:getByDataFilter",
     :uri-template-args {"spreadsheetId" spreadsheetId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/spreadsheets"],
     :body GetSpreadsheetByDataFilterRequest}))

(defn spreadsheets-batchUpdate
  "Applies one or more updates to the spreadsheet. Each request is validated before being applied. If any request is not valid then the entire request will fail and nothing will be applied. Some requests have replies to give you some information about how they are applied. The replies will mirror the requests. For example, if you applied 4 updates and the 3rd one had a reply, then the response will have 2 empty replies, the actual reply, and another empty reply, in that order. Due to the collaborative nature of spreadsheets, it is not guaranteed that the spreadsheet will reflect exactly your changes after this completes, however it is guaranteed that the updates in the request will be applied together atomically. Your changes may be altered with respect to collaborator changes. If there are no collaborators, the spreadsheet should reflect your changes.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/batchUpdate

spreadsheetId <> 
BatchUpdateSpreadsheetRequest:
BatchUpdateSpreadsheetRequest"
  [spreadsheetId BatchUpdateSpreadsheetRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}:batchUpdate",
     :uri-template-args {"spreadsheetId" spreadsheetId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/spreadsheets"],
     :body BatchUpdateSpreadsheetRequest}))

(defn spreadsheets-values-batchUpdate
  "Sets values in one or more ranges of a spreadsheet. The caller must specify the spreadsheet ID, a valueInputOption, and one or more ValueRanges.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/values/batchUpdate

spreadsheetId <> 
BatchUpdateValuesRequest:
BatchUpdateValuesRequest"
  [spreadsheetId BatchUpdateValuesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}/values:batchUpdate",
     :uri-template-args {"spreadsheetId" spreadsheetId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/spreadsheets"],
     :body BatchUpdateValuesRequest}))

(defn spreadsheets-values-update
  "Sets values in a range of a spreadsheet. The caller must specify the spreadsheet ID, range, and a valueInputOption.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/values/update

spreadsheetId <> 
range <> 
ValueRange:
ValueRange

optional:
valueInputOption <string> How the input data should be interpreted.
includeValuesInResponse <boolean> Determines if the update response should include the values of the cells that were updated. By default, responses do not include the updated values. If the range to write was larger than the range actually written, the response includes all values in the requested range (excluding trailing empty rows and columns).
responseValueRenderOption <string> Determines how values in the response should be rendered. The default render option is FORMATTED_VALUE.
responseDateTimeRenderOption <string> Determines how dates, times, and durations in the response should be rendered. This is ignored if response_value_render_option is FORMATTED_VALUE. The default dateTime render option is SERIAL_NUMBER."
  ([spreadsheetId range ValueRange]
    (spreadsheets-values-update spreadsheetId range ValueRange nil))
  ([spreadsheetId range ValueRange optional]
    (client/api-request
      {:method :put,
       :uri-template
       "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}/values/{range}",
       :uri-template-args
       {"spreadsheetId" spreadsheetId, "range" range},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/spreadsheets"],
       :body ValueRange})))

(defn spreadsheets-values-batchClear
  "Clears one or more ranges of values from a spreadsheet. The caller must specify the spreadsheet ID and one or more ranges. Only values are cleared -- all other properties of the cell (such as formatting and data validation) are kept.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/values/batchClear

spreadsheetId <> 
BatchClearValuesRequest:
BatchClearValuesRequest"
  [spreadsheetId BatchClearValuesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}/values:batchClear",
     :uri-template-args {"spreadsheetId" spreadsheetId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/spreadsheets"],
     :body BatchClearValuesRequest}))

(defn spreadsheets-values-batchClearByDataFilter
  "Clears one or more ranges of values from a spreadsheet. The caller must specify the spreadsheet ID and one or more DataFilters. Ranges matching any of the specified data filters will be cleared. Only values are cleared -- all other properties of the cell (such as formatting, data validation, etc..) are kept.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/values/batchClearByDataFilter

spreadsheetId <> 
BatchClearValuesByDataFilterRequest:
BatchClearValuesByDataFilterRequest"
  [spreadsheetId BatchClearValuesByDataFilterRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}/values:batchClearByDataFilter",
     :uri-template-args {"spreadsheetId" spreadsheetId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/spreadsheets"],
     :body BatchClearValuesByDataFilterRequest}))

(defn spreadsheets-values-batchGetByDataFilter
  "Returns one or more ranges of values that match the specified data filters. The caller must specify the spreadsheet ID and one or more DataFilters. Ranges that match any of the data filters in the request will be returned.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/values/batchGetByDataFilter

spreadsheetId <> 
BatchGetValuesByDataFilterRequest:
BatchGetValuesByDataFilterRequest"
  [spreadsheetId BatchGetValuesByDataFilterRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}/values:batchGetByDataFilter",
     :uri-template-args {"spreadsheetId" spreadsheetId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/spreadsheets"],
     :body BatchGetValuesByDataFilterRequest}))

(defn spreadsheets-values-batchGet
  "Returns one or more ranges of values from a spreadsheet. The caller must specify the spreadsheet ID and one or more ranges.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/values/batchGet

spreadsheetId <> 

optional:
ranges <string> The [A1 notation or R1C1 notation](/sheets/api/guides/concepts#cell) of the range to retrieve values from.
majorDimension <string> The major dimension that results should use. For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then requesting `ranges=[\"A1:B2\"],majorDimension=ROWS` returns `[[1,2],[3,4]]`, whereas requesting `ranges=[\"A1:B2\"],majorDimension=COLUMNS` returns `[[1,3],[2,4]]`.
valueRenderOption <string> How values should be represented in the output. The default render option is ValueRenderOption.FORMATTED_VALUE.
dateTimeRenderOption <string> How dates, times, and durations should be represented in the output. This is ignored if value_render_option is FORMATTED_VALUE. The default dateTime render option is SERIAL_NUMBER."
  ([spreadsheetId] (spreadsheets-values-batchGet spreadsheetId nil))
  ([spreadsheetId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}/values:batchGet",
       :uri-template-args {"spreadsheetId" spreadsheetId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.readonly"
        "https://www.googleapis.com/auth/spreadsheets"
        "https://www.googleapis.com/auth/spreadsheets.readonly"]})))

(defn spreadsheets-values-append
  "Appends values to a spreadsheet. The input range is used to search for existing data and find a \"table\" within that range. Values will be appended to the next row of the table, starting with the first column of the table. See the [guide](/sheets/api/guides/values#appending_values) and [sample code](/sheets/api/samples/writing#append_values) for specific details of how tables are detected and data is appended. The caller must specify the spreadsheet ID, range, and a valueInputOption. The `valueInputOption` only controls how the input data will be added to the sheet (column-wise or row-wise), it does not influence what cell the data starts being written to.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/values/append

spreadsheetId <> 
range <> 
ValueRange:
ValueRange

optional:
valueInputOption <string> How the input data should be interpreted.
insertDataOption <string> How the input data should be inserted.
includeValuesInResponse <boolean> Determines if the update response should include the values of the cells that were appended. By default, responses do not include the updated values.
responseValueRenderOption <string> Determines how values in the response should be rendered. The default render option is FORMATTED_VALUE.
responseDateTimeRenderOption <string> Determines how dates, times, and durations in the response should be rendered. This is ignored if response_value_render_option is FORMATTED_VALUE. The default dateTime render option is SERIAL_NUMBER."
  ([spreadsheetId range ValueRange]
    (spreadsheets-values-append spreadsheetId range ValueRange nil))
  ([spreadsheetId range ValueRange optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}/values/{range}:append",
       :uri-template-args
       {"spreadsheetId" spreadsheetId, "range" range},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/spreadsheets"],
       :body ValueRange})))

(defn spreadsheets-values-clear
  "Clears values from a spreadsheet. The caller must specify the spreadsheet ID and range. Only values are cleared -- all other properties of the cell (such as formatting, data validation, etc..) are kept.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/values/clear

spreadsheetId <> 
range <> 
ClearValuesRequest:
ClearValuesRequest"
  [spreadsheetId range ClearValuesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}/values/{range}:clear",
     :uri-template-args {"spreadsheetId" spreadsheetId, "range" range},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/spreadsheets"],
     :body ClearValuesRequest}))

(defn spreadsheets-values-get
  "Returns a range of values from a spreadsheet. The caller must specify the spreadsheet ID and a range.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/values/get

spreadsheetId <> 
range <> 

optional:
majorDimension <string> The major dimension that results should use. For example, if the spreadsheet data in Sheet1 is: `A1=1,B1=2,A2=3,B2=4`, then requesting `range=Sheet1!A1:B2?majorDimension=ROWS` returns `[[1,2],[3,4]]`, whereas requesting `range=Sheet1!A1:B2?majorDimension=COLUMNS` returns `[[1,3],[2,4]]`.
valueRenderOption <string> How values should be represented in the output. The default render option is FORMATTED_VALUE.
dateTimeRenderOption <string> How dates, times, and durations should be represented in the output. This is ignored if value_render_option is FORMATTED_VALUE. The default dateTime render option is SERIAL_NUMBER."
  ([spreadsheetId range]
    (spreadsheets-values-get spreadsheetId range nil))
  ([spreadsheetId range optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}/values/{range}",
       :uri-template-args
       {"spreadsheetId" spreadsheetId, "range" range},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.readonly"
        "https://www.googleapis.com/auth/spreadsheets"
        "https://www.googleapis.com/auth/spreadsheets.readonly"]})))

(defn spreadsheets-values-batchUpdateByDataFilter
  "Sets values in one or more ranges of a spreadsheet. The caller must specify the spreadsheet ID, a valueInputOption, and one or more DataFilterValueRanges.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/values/batchUpdateByDataFilter

spreadsheetId <> 
BatchUpdateValuesByDataFilterRequest:
BatchUpdateValuesByDataFilterRequest"
  [spreadsheetId BatchUpdateValuesByDataFilterRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}/values:batchUpdateByDataFilter",
     :uri-template-args {"spreadsheetId" spreadsheetId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/spreadsheets"],
     :body BatchUpdateValuesByDataFilterRequest}))

(defn spreadsheets-developerMetadata-get
  "Returns the developer metadata with the specified ID. The caller must specify the spreadsheet ID and the developer metadata's unique metadataId.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/developerMetadata/get

spreadsheetId <> 
metadataId <> "
  [spreadsheetId metadataId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}/developerMetadata/{metadataId}",
     :uri-template-args
     {"spreadsheetId" spreadsheetId, "metadataId" metadataId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/spreadsheets"]}))

(defn spreadsheets-developerMetadata-search
  "Returns all developer metadata matching the specified DataFilter. If the provided DataFilter represents a DeveloperMetadataLookup object, this will return all DeveloperMetadata entries selected by it. If the DataFilter represents a location in a spreadsheet, this will return all developer metadata associated with locations intersecting that region.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/developerMetadata/search

spreadsheetId <> 
SearchDeveloperMetadataRequest:
SearchDeveloperMetadataRequest"
  [spreadsheetId SearchDeveloperMetadataRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}/developerMetadata:search",
     :uri-template-args {"spreadsheetId" spreadsheetId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/spreadsheets"],
     :body SearchDeveloperMetadataRequest}))

(defn spreadsheets-sheets-copyTo
  "Copies a single sheet from a spreadsheet to another spreadsheet. Returns the properties of the newly created sheet.
https://developers.google.com/sheets/v4/reference/rest/v4/spreadsheets/sheets/copyTo

spreadsheetId <> 
sheetId <> 
CopySheetToAnotherSpreadsheetRequest:
CopySheetToAnotherSpreadsheetRequest"
  [spreadsheetId sheetId CopySheetToAnotherSpreadsheetRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://sheets.googleapis.com/v4/spreadsheets/{spreadsheetId}/sheets/{sheetId}:copyTo",
     :uri-template-args
     {"spreadsheetId" spreadsheetId, "sheetId" sheetId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/spreadsheets"],
     :body CopySheetToAnotherSpreadsheetRequest}))
