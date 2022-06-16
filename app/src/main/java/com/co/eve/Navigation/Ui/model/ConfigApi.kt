package com.co.eve.Navigation.Ui.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConfigApi(
    @Json(name = "app_benefits")
    val appBenefits: AppBenefits,
    @Json(name = "gender_selection")
        val genderSelection: GenderSelection,
    @Json(name = "is_invitation_mandatory")
    val isInvitationMandatory: Boolean,
    @Json(name = "login_methods")
    val loginMethods: List<String>,
    @Json(name = "terms_of_service_url")
    val termsOfServiceUrl: String
)