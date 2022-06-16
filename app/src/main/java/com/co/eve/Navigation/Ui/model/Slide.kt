package com.co.eve.Navigation.Ui.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Slide(
    @Json(name = "image_url")
    val imageUrl: String,
    @Json(name = "subtitle")
    val subtitle: String,
    @Json(name = "title")
    val title: String
)