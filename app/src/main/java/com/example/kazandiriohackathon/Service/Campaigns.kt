package com.example.kazandiriohackathon.Service

import com.example.kazandiriohackathon.Model.Login.LoginRequest
import com.example.kazandiriohackathon.Model.Login.LoginResponse
import com.example.kazandiriohackathon.Model.campaigns.CampaingsReponse
import retrofit2.Call
import retrofit2.http.*

interface Campaigns {
        @Headers("Content-Type: application/json")
        @GET("/v1/campaigns")
        fun getCampaings(@Header("Authorization") token: String): Call<CampaingsReponse>
}