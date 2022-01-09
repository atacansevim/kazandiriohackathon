package com.example.kazandiriohackathon.Model.Validate

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable


data class ValidateBodyResponse(
    @SerializedName("token")
    val token:String
)