package com.example.mvvmproject.BaseApplication

import android.app.Application
import com.example.mvvmproject.BuilderObjects.RetroBuilder
import com.example.mvvmproject.Repository.Repository
import com.example.mvvmproject.RetroApi.RetrofitApi
import com.example.mvvmproject.Database.UserDatabase

class ApplicationMain : Application() {

    lateinit var repository: Repository
    override fun onCreate() {
        super.onCreate()

       //database= PostDatabaseBuilder.getInstanse(applicationContext)
    val retro=RetroBuilder.getInstanceLogin().create(RetrofitApi::class.java)
    val database=UserDatabase.getInstanse(this)
        repository=Repository(retro,database,applicationContext)
    }
}