package com.example.mvvmproject.Dao

import androidx.lifecycle.LiveData
import androidx.room.*


import com.example.mvvmproject.UserDataEntity2

@Dao
interface UserDao {

    @Insert
    suspend fun insertUserData(user : UserDataEntity2)


    @Query("delete from tbl_userdata")
    suspend fun delete()


    @Query("select * from tbl_userdata")
     fun getUserdata() : LiveData<UserDataEntity2>

     @Update
     suspend fun updateUserDb(userr : UserDataEntity2)

    @Query("select patient_id from tbl_userdata ")
    fun getUserId() : String


}