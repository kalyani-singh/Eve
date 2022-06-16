package com.co.eve.Navigation.Ui.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AppBenefits(
    @Json(name = "enabled")
    val enabled: Boolean,
    @Json(name = "slides")
    val slides: List<Slide>
)