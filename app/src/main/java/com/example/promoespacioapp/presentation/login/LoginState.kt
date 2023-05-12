package com.example.promoespacioapp.presentation.login

import com.example.promoespacioapp.domain.model.UserToken


data class LoginState(
    val token_data: UserToken? = null,
    val isLoading: Boolean? = true,
    val isError: String? = "",

)
