package com.example.mvvmproject

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tbl_userdata")
 class UserDataEntity2
{



    @ColumnInfo(name = "doctor_name")
    var doctor_name:String?=null

    @ColumnInfo(name = "patient_id")
    var patient_id:String?=null


    @ColumnInfo(name = "first_name")
var first_name:String?=null

@ColumnInfo(name = "code")
var code:String?=null

@ColumnInfo(name = "mobile")
var mobile:String?=null

@ColumnInfo(name = "dob")
var dob:String?=null

@ColumnInfo(name = "zip_code")
var zip_code:String?=null

@ColumnInfo(name = "country")
var country:String?=null

@ColumnInfo(name = "state_id")
var state_id:String?=null

@ColumnInfo(name = "state")
var state:String?=null

@ColumnInfo(name = "status")
var status:String?=null

@ColumnInfo(name = "last_name")
var last_name:String?=null

@ColumnInfo(name = "email")
var email:String?=null

    @ColumnInfo(name = "address")
var address:String?=null


    @ColumnInfo(name = "city")
var city:String?=null

    @ColumnInfo(name = "profile_photo")
    var profile_photo:String?=null


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int=0
}