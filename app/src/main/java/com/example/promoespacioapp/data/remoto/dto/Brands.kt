package com.example.promoespacioapp.data.remoto.dto

import com.squareup.moshi.Json

data class Brands(
    @field:Json(name =  "id"                   ) var id                   : Int?              = null,
    @field:Json(name =  "menuId"               ) var menuId               : Int?              = null,
    @field:Json(name =  "brandId"              ) var brandId              : Int?              = null,
    @field:Json(name =  "position"             ) var position             : Int?              = null,
    @field:Json(name =  "name"                 ) var name                 : String?           = null,
    @field:Json(name =  "description"          ) var description          : String?           = null,
    @field:Json(name =  "icon"                 ) var icon                 : String?           = null,
    @field:Json(name =  "downloadLink"         ) var downloadLink         : String?           = null,
    @field:Json(name =  "topIcon"              ) var topIcon              : String?           = null,
    @field:Json(name =  "topIconDownloadLink"  ) var topIconDownloadLink  : String?           = null,
    @field:Json(name =  "topVideo"             ) var topVideo             : String?           = null,
    @field:Json(name =  "topVideoDownloadLink" ) var topVideoDownloadLink : String?           = null,
    @field:Json(name =  "color"                ) var color                : String?           = null,
    @field:Json(name =  "hotels"               ) var hotels               : List<Hotels> = listOf(),
    @field:Json(name =  "createdAt"            ) var createdAt            : String?           = null,
    @field:Json(name =  "modifiedAt"           ) var modifiedAt           : String?           = null

)
