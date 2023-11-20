package com.example.youtube_api_hm_6mounth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var counter = 0

    private val _counterLV = MutableLiveData<Int>()
    val counterLV = _counterLV as LiveData<Int>

    fun inc() {
        counter += 1
        _counterLV.value = counter
    }

    fun dec() {
        counter -= 1
        _counterLV.value = counter
    }

}