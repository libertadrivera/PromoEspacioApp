package com.example.promoespacioapp.domain.model

data class ItemDashboard(
    val itemType: String? = null, //Category-Brand
    val categoryId: Int? = null,
    val itemPosition: Int? = null,
    val itemSection: String? = null, //header-service-other: null para Brands
    val itemName: String? = null,
    val itemIcon: String? = null,
    val itemDownloadLink: String? = null,
    val itemColor: String? = null
)
