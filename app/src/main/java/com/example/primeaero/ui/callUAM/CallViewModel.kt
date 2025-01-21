package com.example.primeaero.ui.callUAM

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CallViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Call Fragment"
    }
    val text: LiveData<String> = _text
}