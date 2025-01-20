package com.example.primeaero.ui.uam

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class UAMViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "UAM Fragment"
    }
    val text: LiveData<String> = _text
}