package com.example.kazandiriohackathon.Model.campaigns

import com.example.kazandiriohackathon.Model.Login.BodyResponse
import com.google.gson.annotations.SerializedName

class CampaingsReponse (
    @SerializedName("body")
    val body: CampaingsBodyResponse
)