package com.adesoftware.fetchingstatus.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.adesoftware.fetchingstatus.model.FetchingData
import com.adesoftware.fetchingstatus.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class FetchingViewModel (private val repository: Repository): ViewModel() {
    var myCustomPosts: MutableLiveData<Response<List<FetchingData>>> = MutableLiveData()

    fun getCustomPosts(url: String, responseCode: Int, responseTime: Double, classX: String) {
        viewModelScope.launch {
            val response: Response<List<FetchingData>> = repository.getCustomPosts(url, responseCode, responseTime, classX)
            myCustomPosts.value = response
        }
    }
}