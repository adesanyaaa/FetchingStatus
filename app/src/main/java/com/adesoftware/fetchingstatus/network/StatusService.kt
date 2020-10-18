package com.adesoftware.fetchingstatus.network

import com.adesoftware.fetchingstatus.model.FetchingData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface StatusService {
    @GET("status/")
    suspend fun getCustomPosts(
        @Query("url") url: String,
        @Query("responseCode") responseCode: Int,
        @Query("responseTime") responseTime: Double,
        @Query("class") classX: String
    ): Response<List<FetchingData>>
}