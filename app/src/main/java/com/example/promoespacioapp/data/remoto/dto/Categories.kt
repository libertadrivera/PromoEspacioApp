package com.example.promoespacioapp.data.remoto.dto


import com.squareup.moshi.Json

data class Categories(
    @field:Json(name =  "id"                   ) var id                   : Int?                  = null,
    @field:Json(name =  "menuId"               ) var menuId               : Int?                  = null,
    @field:Json(name =  "categoryId"           ) var categoryId           : Int?                  = null,
    @field:Json(name =  "position"             ) var position             : Int?                  = null,
    @field:Json(name =  "section"              ) var section              : String?               = null,
    @field:Json(name =  "categories"           ) var categories           : List<com.example.promoespacioapp.domain.model.Categories> = listOf(),
    @field:Json(name =  "contents"             ) var contents             : List<Contents>? = listOf(),
    @field:Json(name =  "categoryName"         ) var categoryName         : String?               = null,
    @field:Json(name =  "categoryIcon"         ) var categoryIcon         : String?               = null,
    @field:Json(name =  "categoryDownloadLink" ) var categoryDownloadLink : String?               = null,
    @field:Json(name =  "categoryColor"        ) var categoryColor        : String?               = null

)
