package com.example.kazandiriohackathon.Model.Login

import com.google.gson.annotations.SerializedName

data class LoginResponse (
    @SerializedName("body")
    val body: BodyResponse
)