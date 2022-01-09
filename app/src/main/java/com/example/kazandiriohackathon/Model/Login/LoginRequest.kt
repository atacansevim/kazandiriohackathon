package com.example.kazandiriohackathon.Model.Login

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class LoginRequest(
    val phoneNumber: String
)