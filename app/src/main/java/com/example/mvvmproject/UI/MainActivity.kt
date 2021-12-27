package com.example.mvvmproject.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmproject.BaseApplication.ApplicationMain
import com.example.mvvmproject.R
import com.example.mvvmproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.inflate(layoutInflater,R.layout.activity_login,null,false)
        setContentView(binding.root)

        startActivity(Intent(this, Users_Address::class.java))
        val recyclerView : RecyclerView=findViewById(R.id.recyclerview)
        recyclerView.layoutManager=LinearLayoutManager(this)

       val ob=(application as ApplicationMain).repository




    }
}