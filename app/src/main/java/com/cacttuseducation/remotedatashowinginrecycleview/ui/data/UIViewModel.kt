package com.cacttuseducation.remotedatashowinginrecycleview.ui.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UIViewModel : ViewModel() {
      var count = MutableLiveData(0)
//        val count : LiveData<Int>
//        get() = _count

//    fun getCount() : LiveData<Int> {
//        return count
//    }

    fun increaseCountBy1() {
        count.value = count.value?.plus(1)
    }

    fun decreaseCountBy1() {
        count.value = count.value?.minus(1)
    }

    fun increaseCountBy5() {
        count.value = count.value?.plus(5)
    }

    fun decreaseCountBy5() {
        count.value = count.value?.minus(5)
    }
}