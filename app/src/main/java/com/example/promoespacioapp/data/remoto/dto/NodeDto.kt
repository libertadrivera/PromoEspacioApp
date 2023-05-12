package com.example.promoespacioapp.data.remoto.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi



//@JsonClass(generateAdapter = true)
data class NodeDto(
    @field:Json(name =  "id"           ) var id           : Int?                  = null,
    @field:Json(name =  "name"         ) var name         : String?               = null,
    @field:Json(name =  "description"  ) var description  : String?               = null,
    @field:Json(name =  "categories"   ) var categories   : List<Categories> = listOf(),
    @field:Json(name =  "brands"       ) var brands       :  List<Brands> = listOf(),
    @field:Json(name =  "downloadSize" ) var downloadSize : Int?                  = null,
    @field:Json(name =  "publishedOn"  ) var publishedOn  : String?               = null,
    @field:Json(name =  "createdAt"    ) var createdAt    : String?               = null,
    @field:Json(name =  "modifiedAt"   ) var modifiedAt   : String?               = null

)
