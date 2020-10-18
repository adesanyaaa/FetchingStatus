package com.adesoftware.fetchingstatus.model


import com.google.gson.annotations.SerializedName

data class RedisQWAPI(
    @SerializedName("class")
    val classX: String,
    @SerializedName("responseCode")
    val responseCode: Int,
    @SerializedName("responseTime")
    val responseTime: Any,
    @SerializedName("url")
    val url: Any
)