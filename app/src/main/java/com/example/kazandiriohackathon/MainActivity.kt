package com.example.kazandiriohackathon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kazandiriohackathon.Model.Login.LoginRequest
import com.example.kazandiriohackathon.Model.Login.LoginResponse
import com.example.kazandiriohackathon.Service.Login
import com.example.kazandiriohackathon.ViewModel.LoginController
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var peopleViewModel:LoginController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        peopleViewModel  = LoginController()

        peopleViewModel.login("5069794584")
        peopleViewModel.validate("5069794584", "12345")
    }
}