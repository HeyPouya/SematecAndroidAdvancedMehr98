package com.sematec.sematecandroidadvancedmehr98.features.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel : ViewModel() {

    private val nameList = arrayListOf<String>()
    private val liveData = MutableLiveData<List<String>>()

    fun onNameAdded(name: String) {
        nameList.add(name)
        liveData.value = nameList
    }

    fun getLiveData(): LiveData<List<String>> = liveData
}