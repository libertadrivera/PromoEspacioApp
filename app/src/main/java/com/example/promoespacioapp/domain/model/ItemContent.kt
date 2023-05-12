package com.example.promoespacioapp.domain.model

data class ItemContent(
    val id: Int? = null,
    val parentId: Int? = null,
    val parentType: String? = null,
    val mimeType: Int? = null,
    val filename: String? = null,
    val filepath: String? = null,
    val downloadLink: String? = null,
    val position: Int? = null
)
