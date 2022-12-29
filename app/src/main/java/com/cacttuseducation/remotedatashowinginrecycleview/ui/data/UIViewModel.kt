package com.cacttuseducation.remotedatashowinginrecycleview.ui.data

import androidx.lifecycle.ViewModel

class UIViewModel : ViewModel() {
    private var count = 0

    fun getCount() : String {
        return count.toString()
    }

    fun increaseCount() {
        count++
    }
}