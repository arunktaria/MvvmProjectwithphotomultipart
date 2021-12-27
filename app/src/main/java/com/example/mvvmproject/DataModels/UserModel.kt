package com.example.mvvmproject.DataModels

import androidx.room.Entity


 class UserModel {

        var email : String="piyush18@gmail.com"
            set(value) { field=value}
            get()=email
        var password : String="12345678"
            set(value) { field=value}
            get()=password


        var user_type : String="patient"
            set(value) { field=value}
            get()=user_type

        var device_token : String="sdfsdf"
            set(value) { field=value}
            get()=device_token

        var device_type : String="android"
            set(value) { field=value}
            get()=device_type

        var version : Double=1.1
            set(value) { field=value}
            get()=version

        var handset : String="android"
            set(value) { field=value}
            get()=handset



}