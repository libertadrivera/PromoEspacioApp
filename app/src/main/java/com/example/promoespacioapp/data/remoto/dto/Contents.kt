package com.example.promoespacioapp.data.remoto.dto

import com.squareup.moshi.Json

data class Contents(
    @field:Json(name =  "id"           ) var id           : Int?     = null,
    @field:Json(name =  "parentId"     ) var parentId     : Int?     = null,
    @field:Json(name =  "parentType"   ) var parentType   : String?  = null,
    @field:Json(name =  "mimeType"     ) var mimeType     : String?  = null,
    @field:Json(name =  "filename"     ) var filename     : String?  = null,
    @field:Json(name =  "filepath"     ) var filepath     : String?  = null,
    @field:Json(name =  "downloadLink" ) var downloadLink : String?  = null,
    @field:Json(name =  "position"     ) var position     : Int?     = null,
    @field:Json(name =  "preview"      ) var preview      : Boolean? = null,
    @field:Json(name =  "createdAt"    ) var createdAt    : String?  = null,
    @field:Json(name =  "modifiedAt"   ) var modifiedAt   : String?  = null
)
