package com.example.promoespacioapp.data.remoto.dto

import com.squareup.moshi.Json

data class UserRequestDto(
    @field:Json(name =  "username"     ) var username     : String? = null,
    @field:Json(name =  "password" ) var password : String? = null
)
