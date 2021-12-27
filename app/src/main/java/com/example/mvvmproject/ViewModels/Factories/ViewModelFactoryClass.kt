package com.example.mvvmproject.ViewModels.Factories

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmproject.Repository.Repository
import com.example.mvvmproject.ViewModels.ViewModelClass

class ViewModelFactoryClass(val repository: Repository, val context : Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
    return ViewModelClass(repository,context) as T
    }
}