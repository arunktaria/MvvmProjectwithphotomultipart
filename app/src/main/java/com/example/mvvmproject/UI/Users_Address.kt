package com.example.mvvmproject.UI

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmproject.BaseApplication.ApplicationMain
import com.example.mvvmproject.ViewModels.ViewModelClass
import com.example.mvvmproject.Database.UserDatabase
import com.example.mvvmproject.R
import com.example.mvvmproject.ViewModels.Factories.ViewModelFactoryClass
import com.example.mvvmproject.databinding.UserAddressBinding

class Users_Address : AppCompatActivity() {
var TAG ="TAG"
    var database:UserDatabase?=null
    val context =this
     lateinit var binding :UserAddressBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= UserAddressBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lifecycleOwner=this

        val btnprofile=findViewById<ImageView>(R.id.personprofileitemimagebtn)
        btnprofile.setOnClickListener {
            startActivity(Intent(Users_Address@this, UserProfile::class.java))
        }




        val toolback=findViewById<ImageView>(R.id.toolbackbtn)
        toolback.setOnClickListener{
            startActivity(Intent(Users_Address@this,LoginActivity::class.java))
        }
        val btn:Button=findViewById(R.id.btncontinue)
        val appliction=(application as ApplicationMain).repository
        val viewmodel=ViewModelProvider(this, ViewModelFactoryClass(appliction,this)).get(ViewModelClass::class.java)

        viewmodel.getUserDatafromDb().observe(this, Observer {
            Log.d(TAG, "in user address "+it?.mobile)
            binding.usersdata=it
        })



        btn.setOnClickListener {
            Toast.makeText(MainActivity@this,"hello world",Toast.LENGTH_SHORT).show()

        }


    }
/*
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflator =MenuInflater(this)
        inflator.inflate(R.menu.profilemenu,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
           R.id.personmenuitem->
           {
               startActivity(Intent(Users_Address@this,UserProfile::class.java))
           }

        }


        return super.onOptionsItemSelected(item)
    }
*/

}