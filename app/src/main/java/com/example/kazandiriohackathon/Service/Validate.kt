package com.example.kazandiriohackathon.Service

import com.example.kazandiriohackathon.Model.Login.LoginResponse
import com.example.kazandiriohackathon.Model.Validate.ValidateRequest
import com.example.kazandiriohackathon.Model.Validate.ValidateResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface Validate {
    @Headers("Content-Type: application/json")
    @POST("/v1/auth/login/validate")
    fun validateUser(@Body requestBody: ValidateRequest): Call<ValidateResponse>
}