package com.example.kazandiriohackathon.Model.Login

import com.google.gson.annotations.SerializedName

data class BodyResponse(
    @SerializedName("isValid")
    val isValid: String
)