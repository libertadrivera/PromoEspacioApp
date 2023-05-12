package com.example.promoespacioapp.data.remoto.dto

import com.squareup.moshi.Json

data class Hotels(
    @field:Json(name =  "id"           ) var id           : Int?                = null,
    @field:Json(name =  "brandId"      ) var brandId      : Int?                = null,
    @field:Json(name =  "name"         ) var name         : String?             = null,
    @field:Json(name =  "icon"         ) var icon         : String?             = null,
    @field:Json(name =  "downloadLink" ) var downloadLink : String?             = null,
    @field:Json(name =  "position"     ) var position     : Int?                = null,
    @field:Json(name =  "services"     ) var services     : List<Services> = listOf(),
    @field:Json(name =  "createdAt"    ) var createdAt    : String?             = null,
    @field:Json(name =  "modifiedAt"   ) var modifiedAt   : String?             = null

)
