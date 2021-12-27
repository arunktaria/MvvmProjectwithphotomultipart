package com.example.mvvmproject.RetroApi

import com.example.mvvmproject.DataModels.*
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface RetrofitApi {


    @POST("index.php?mod=login&act=do_login")
    suspend fun getLoginStatus(@Body userModel: LoginRequestModel): Response<UserDataReposnse>

    @POST("index.php?mod=Long_questionnaire&act=get_initial_questionnaire")
    suspend fun getUsersData(@Body patient_id: Fetch_UsersDetails): Response<User_Details>

    @Multipart
    @POST("index.php?mod=profile&act=set_patient_profile")
    suspend fun getUserUpdate(
        @Part("patient_id") patientid: RequestBody,
        @Part("email") emaill: RequestBody,
        @Part("first_name") first_namee: RequestBody,
        @Part("last_name") last_namee: RequestBody,
        @Part("dob") dobb: RequestBody,
        @Part("address") addresss: RequestBody,
        @Part("city") cityy: RequestBody,
        @Part("state_id") stateid: RequestBody,
        @Part("country_id") countryid: RequestBody,
        @Part("mobile") mobilee: RequestBody,
        @Part("zip_code") zip_codee: RequestBody,
        @Part profile_photo: MultipartBody.Part

    ): Response<UserDataReposnse>


}














/* @Part("patient_id") patient_id: RequestBody,
     @Part("email") email: RequestBody,
     @Part("first_name") first_name: RequestBody,
     @Part("last_name") last_name: RequestBody,
     @Part("dob") dob: RequestBody,
     @Part("address") address: RequestBody,
     @Part("city") city: RequestBody,
     @Part("state_id") state_id: RequestBody,
     @Part("country_id") country_id: RequestBody,
     @Part("mobile") mobile: RequestBody,
     @Part("zip_code") zip_code: RequestBody,
     @Part("profile_photo") imagee: MultipartBody.Part
*/






/* @Part patient_id: RequestBody,
        @Part email: RequestBody,
        @Part first_name: RequestBody,
        @Part last_name: RequestBody,
        @Part dob: RequestBody,
        @Part address: RequestBody,
        @Part city: RequestBody,
        @Part state_id: RequestBody,
        @Part country_id: RequestBody,
        @Part mobile: RequestBody,
        @Part zip_code: RequestBody,
        @Part("profile_photo") imagee: MultipartBody.Part
        */