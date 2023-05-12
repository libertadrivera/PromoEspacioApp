package com.example.promoespacioapp.domain.model

import com.example.promoespacioapp.data.remoto.dto.Contents
import com.squareup.moshi.Json

data class Categories(
    @field:Json(name =  "id"           ) var id           : Int?                = null,
    @field:Json(name =  "parentId"     ) var parentId     : Int?                = null,
    @field:Json(name =  "name"         ) var name         : String?             = null,
    @field:Json(name =  "icon"         ) var icon         : String?             = null,
    @field:Json(name =  "downloadLink" ) var downloadLink : String?             = null,
    @field:Json(name =  "color"        ) var color        : String?             = null,
    @field:Json(name =  "position"     ) var position     : Int?                = null,
    @field:Json(name =  "contents"     ) var contents     : List<Contents>? = listOf(),
    @field:Json(name =  "createdAt"    ) var createdAt    : String?             = null,
    @field:Json(name =  "modifiedAt"   ) var modifiedAt   : String?             = null

)
