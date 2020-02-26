package com.example.qwerty.ui.main

import android.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = Transformations.map(_index) {
        "Hello world from section: $it"
    }

    val containerColor: LiveData<Int> =Transformations.map(_index) {

    when (it) {
    1 -> {
    Color.BLACK
    }
    2 -> {
        Color.BLUE
    }
    else -> {
    Color.GREEN
       }
     }
    }


    fun setIndex(index: Int) {
        _index.value = index
    }
}