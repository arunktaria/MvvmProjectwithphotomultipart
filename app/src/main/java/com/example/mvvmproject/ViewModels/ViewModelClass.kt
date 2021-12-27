package com.example.mvvmproject.ViewModels

import android.app.Activity
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bumptech.glide.Glide
import com.example.mvvmproject.DataModels.*
import com.example.mvvmproject.UserDataEntity2
import com.example.mvvmproject.Repository.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.MultipartBody

class ViewModelClass(val repository: Repository, val context: Context) : ViewModel() {

    val muLivedata=MutableLiveData<UserDataReposnse>()
    val userLiveData:LiveData<UserDataReposnse>
    get() = muLivedata

  fun getUserLogin(ob: LoginRequestModel)
  {
      CoroutineScope(Dispatchers.IO).launch {
          muLivedata.postValue(repository.getLoginStatusRepo(ob,context))
      }
  }



fun getUserDatafromDb() : LiveData<UserDataEntity2>
{
    return repository.database.getDao().getUserdata()
}



    val dataupdates=MutableLiveData<UserDataEntity2>()
    val tempdata:LiveData<UserDataEntity2>
    get()=dataupdates
    fun setUserUpdates(userData:UserPofileUpdate,activity : Activity,imagee:MultipartBody.Part)
    {
        var ob=UserDataEntity2()

        CoroutineScope(Dispatchers.IO).launch {
           val temp = repository.getUserUpdates(userData,imagee)
           val t=temp.data

            ob.apply {
                ob.patient_id=   t?.patient_id.toString()
                ob.first_name=  t?. first_name.toString()
                ob.mobile=     t?.mobile.toString()
                ob.dob=     t?.dob.toString()
                ob.zip_code=     t?.zip_code.toString()
                ob.state=   t?. state_id
                ob.last_name=     t?.last_name
                ob.email=     t?.email
                ob.address=     t?.address
                ob.city=     t?.city.toString()
                ob.state=   t?.state.toString()
                ob.profile_photo=t?.profile_photo
            }
             dataupdates.postValue(ob)
              }


       }

}