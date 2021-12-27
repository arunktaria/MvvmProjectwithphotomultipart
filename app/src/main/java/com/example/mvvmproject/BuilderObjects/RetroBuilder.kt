package com.example.mvvmproject.BuilderObjects

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroBuilder {



    fun getInstanceLogin() : Retrofit
    {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://35.80.198.152:9201/api/")
            .build()
    }

    fun getUsersDataInstance() : Retrofit
    {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://35.80.198.152:9201/api/")
            .build()
    }




}