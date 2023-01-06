package com.cacttuseducation.remotedatashowinginrecycleview.ui.twowaydatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TwoWayDataBindingViewModel : ViewModel() {
    var result = MutableLiveData(0)
    var etInputValue = MutableLiveData("")

    fun updateResult() {
        val value = etInputValue.value?.toInt()
        result.value = value?.let { result.value?.plus(it) }

    }

}