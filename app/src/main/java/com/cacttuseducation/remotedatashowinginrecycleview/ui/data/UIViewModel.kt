package com.cacttuseducation.remotedatashowinginrecycleview.ui.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UIViewModel : ViewModel() {
     private var _count = MutableLiveData(0)
        val count : LiveData<Int>
        get() = _count

//    fun getCount() : LiveData<Int> {
//        return count
//    }

    fun increaseCountBy1() {
        _count.value = _count.value?.plus(1)
    }

    fun decreaseCountBy1() {
        _count.value = _count.value?.minus(1)
    }

    fun increaseCountBy5() {
        _count.value = _count.value?.plus(5)
    }

    fun decreaseCountBy5() {
        _count.value = _count.value?.minus(5)
    }
}