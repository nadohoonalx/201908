package com.lee.kioskour.mymain

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MyMainViewModelFactory(
    private val application: Application) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MyMainViewModel::class.java)) {
            return MyMainViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}