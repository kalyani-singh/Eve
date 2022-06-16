package com.co.eve.Navigation.Ui.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenderSelection(
    @Json(name = "hide_male")
    val hideMale: Boolean,
    @Json(name = "hide_trans_woman")
    val hideTransWoman: Boolean
)