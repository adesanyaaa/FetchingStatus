package com.adesoftware.fetchingstatus.model


import com.google.gson.annotations.SerializedName

data class RedisDB(
    @SerializedName("class")
    val classX: String,
    @SerializedName("responseCode")
    val responseCode: Int,
    @SerializedName("responseTime")
    val responseTime: Double,
    @SerializedName("url")
    val url: Any
)