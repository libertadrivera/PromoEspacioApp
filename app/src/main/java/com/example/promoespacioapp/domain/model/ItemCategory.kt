package com.example.promoespacioapp.domain.model

data class ItemCategory(
    val id: Int? = null,
    val parentId: Int? = null,
    val name: String? = null,
    val icon: String? = null,
    val downloadLink: String? = null,
    val color: String? = null,
    val position: Int? = null
)
