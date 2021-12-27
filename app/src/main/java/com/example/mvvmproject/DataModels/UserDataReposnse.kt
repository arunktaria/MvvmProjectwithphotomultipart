package com.example.mvvmproject.DataModels

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


 class UserDataReposnse
{

    var message:String ?=null

  var data: Data? = null

    class Data {

        var doctor_name: String? = null
        var first_name: String? = null
        var code: String? = null
        var mobile: String? = null
        var dob: String? = null
        var zip_code: String? = null
        var country: String? = null
        var state_id: String? = null
        var state: String? = null
        var status: String? = null
        var last_name: String? = null
        var address: String? = null
        var email: String? = null
        var patient_id: String? = null
        var city:String?=null
        var profile_photo:String?=null


    }


}