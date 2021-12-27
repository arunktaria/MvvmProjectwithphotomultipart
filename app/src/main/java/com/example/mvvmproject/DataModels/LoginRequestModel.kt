package com.example.mvvmproject.DataModels

data class LoginRequestModel(
    var email: String,
    var password: String,
    var user_type: String,
    var device_token: String? ="",
    var device_type: String? = "android",
    var version: String? = "",
    var handset: String? = "android"
)