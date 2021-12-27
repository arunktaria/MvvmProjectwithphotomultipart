package com.example.mvvmproject.RoomEntity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_userdata")
class UserDataEntity  {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "id")
  var id=0


    @ColumnInfo(name = "doctor_name")
    var doctor_name:String?=null
        get() = doctor_name
        set(value) {field= value}

    @ColumnInfo(name = "first_name")
    var first_name:String?=null
        get() = first_name
        set(value) {field= value}

    @ColumnInfo(name = "code")
    var code:String?=null
        get() = code
        set(value) {field= value
        }

    @ColumnInfo(name = "mobile")
    var mobile:String?=null
        get() = mobile
        set(value) {field= value}

    @ColumnInfo(name = "dob")
    var dob:String?=null
        get() = dob
        set(value) {field= value}

    @ColumnInfo(name = "zip_code")
    var zip_code:String?=null
        get() = zip_code
        set(value) {field= value}

    @ColumnInfo(name = "country")
    var country:String?=null
        get() = country
        set(value) {field= value}

    @ColumnInfo(name = "state_id")
    var state_id:String?=null
        get() = state_id
        set(value) {field= value}

    @ColumnInfo(name = "state")
    var state:String?=null
        get() = state
        set(value) {field= value}

    @ColumnInfo(name = "status")
    var status:String?=null
        get() = status
        set(value) {field= value}

    @ColumnInfo(name = "last_name")
    var last_name:String?=null
        get() = last_name
        set(value) {field= value}

    @ColumnInfo(name = "email")
    var email:String?=null
        get() = email
        set(value) {field= value}


}