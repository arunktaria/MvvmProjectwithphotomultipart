package com.example.mvvmproject.DataModels

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey
import okhttp3.MultipartBody
import java.io.File

class UserPofileUpdate {

    var patient_id: String?=null
    var email: String?=null
    var first_name: String?=null
    var last_name: String?=null
    var dob: String?=null
    var address: String?=null
    var city:String?=null
    var state_id: String?=null
    var country_id: String ?=null
    var mobile:String?=null
    var zip_code:String?=null

//  var profile_photo: MultipartBody.Part?=null


}



