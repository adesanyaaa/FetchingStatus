package com.adesoftware.fetchingstatus.repository

import com.adesoftware.fetchingstatus.model.FetchingData
import com.adesoftware.fetchingstatus.network.RetrofitClientInstance
import retrofit2.Response

class Repository {
    suspend fun getCustomPosts(url: String, responseCode: Int, responseTime: Double, classX: String):
            Response<List<FetchingData>> {
        return RetrofitClientInstance.service.getCustomPosts(url, responseCode, responseTime, classX)
    }
}