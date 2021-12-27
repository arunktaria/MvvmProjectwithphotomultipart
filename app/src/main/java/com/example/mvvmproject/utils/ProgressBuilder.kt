package com.example.mvvmproject.utils

import android.app.ProgressDialog
import android.content.Context
import android.widget.ProgressBar

class ProgressBuilder {
    var progressDialogs : ProgressDialog?=null
    fun show(context:Context,text:String)
{
     progressDialogs= ProgressDialog(context)
    progressDialogs!!.setMessage(text)
    progressDialogs!!.setCancelable(true)
 progressDialogs!!.show()
}
fun dismissDialog()
{
    progressDialogs?.dismiss()
}



}

