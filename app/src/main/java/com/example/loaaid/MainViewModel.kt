package com.example.loaaid

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _testText = MutableLiveData("test")
    val testText: LiveData<String> get() = _testText

    fun onClickTest(){

    }
}