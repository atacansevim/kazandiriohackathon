package com.example.kazandiriohackathon.Model.Validate

import kotlinx.serialization.Serializable

@Serializable
data class ValidateRequest(
    val phoneNumber: String,
    val validationCode:String
)