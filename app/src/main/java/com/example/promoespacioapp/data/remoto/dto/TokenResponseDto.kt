package com.example.promoespacioapp.data.remoto.dto

import com.squareup.moshi.Json

data class TokenResponseDto(
    @field:Json(name =  "token"     ) var token     : String? = null,
    @field:Json(name =  "expiresAt" ) var expiresAt : String? = null
)
