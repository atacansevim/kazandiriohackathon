package com.example.kazandiriohackathon.ViewModel

import com.example.kazandiriohackathon.CustomOkHttpClient
import com.example.kazandiriohackathon.Model.Login.LoginRequest
import com.example.kazandiriohackathon.Model.Login.LoginResponse
import com.example.kazandiriohackathon.Model.Validate.ValidateRequest
import com.example.kazandiriohackathon.Model.Validate.ValidateResponse
import com.example.kazandiriohackathon.Service.Login
import com.example.kazandiriohackathon.Service.Validate
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoginController {

    val client = CustomOkHttpClient.client

    fun login(phoneNumber: String){
        val retrofit = Retrofit.Builder()
            .baseUrl("http://hackathon.kazandirio.io")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

        val loginRequest = retrofit.create(Login::class.java)
        val loginResponse = loginRequest.loginUser(LoginRequest("5069794589"))
        loginResponse.enqueue(object: Callback<LoginResponse> {
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                response.body()?.let {
                    it.body.isValid
                }
            }
            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                print("fail")
            }
        })
    }

    fun validate(phoneNumber: String, otpCode:String): String{
        val retrofit = Retrofit.Builder()
            .baseUrl("http://hackathon.kazandirio.io")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
        var token = ""
        val validateRequest = retrofit.create(Validate::class.java)
        val validateResponse = validateRequest.validateUser(ValidateRequest(phoneNumber,otpCode))
        validateResponse.enqueue(object: Callback<ValidateResponse> {
            override fun onResponse(call: Call<ValidateResponse>, response: Response<ValidateResponse>) {
                response.body()?.let {
                    token = it.body1.token
                }
            }
            override fun onFailure(call: Call<ValidateResponse>, t: Throwable) {
                token = ""
                print("fail")
            }
        })
        return token
    }
}