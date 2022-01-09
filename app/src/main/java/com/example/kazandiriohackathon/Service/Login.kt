package com.example.kazandiriohackathon.Service

import com.example.kazandiriohackathon.Model.Login.LoginRequest
import com.example.kazandiriohackathon.Model.Login.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface Login {
    @Headers("Content-Type: application/json")
    @POST("/v1/auth/login")
    fun loginUser(@Body requestBody: LoginRequest): Call<LoginResponse>
}