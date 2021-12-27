package com.example.mvvmproject.UI

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.Toast
import com.example.mvvmproject.R
import com.example.mvvmproject.databinding.BottomsheetlayoutBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class ChoosePhotoBottomSheet(context: Context,val activity: Activity) : BottomSheetDialog(context) {
lateinit var binding : BottomsheetlayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= BottomsheetlayoutBinding.inflate(layoutInflater)
       setContentView(binding.root)
        // setContentView(R.layout.bottomsheetlayout)

        val capturephoto=findViewById<ImageView>(R.id.capturephoto)


        capturephoto?.setOnClickListener {


            val intent= Intent()
            intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE)
            activity.startActivityForResult(intent,100)

        }

        binding.galleryphoto.setOnClickListener {
            val intent =Intent(Intent.ACTION_GET_CONTENT)
            intent.setType("image/*")
            activity.startActivityForResult(intent,101)
        }




    }


}