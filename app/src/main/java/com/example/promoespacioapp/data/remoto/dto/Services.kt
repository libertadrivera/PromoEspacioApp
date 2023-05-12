package com.example.promoespacioapp.data.remoto.dto

import com.squareup.moshi.Json

data class Services(
    @field:Json(name =  "id"           ) var id           : Int?                = null,
    @field:Json(name =  "hotelId"      ) var hotelId      : Int?                = null,
    @field:Json(name =  "serviceId"    ) var serviceId    : Int?                = null,
    @field:Json(name =  "name"         ) var name         : String?             = null,
    @field:Json(name =  "icon"         ) var icon         : String?             = null,
    @field:Json(name =  "downloadLink" ) var downloadLink : String?             = null,
    @field:Json(name =  "color"        ) var color        : String?             = null,
    @field:Json(name =  "contents"     ) var contents     : List<Contents> = listOf(),
    @field:Json(name =  "position"     ) var position     : Int?                = null

)
