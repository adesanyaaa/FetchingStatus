package com.adesoftware.fetchingstatus.network

import com.adesoftware.fetchingstatus.util.Constant.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val service: StatusService by lazy {
        retrofit!!.create(StatusService::class.java)
    }
}