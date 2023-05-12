package com.example.promoespacioapp.presentation.menu

import com.example.promoespacioapp.data.remoto.dto.NodeDto

data class MenuState(
    val menuList: NodeDto? = null,
    val isLoading: Boolean? = true,
    val isError: String? = "",
)
