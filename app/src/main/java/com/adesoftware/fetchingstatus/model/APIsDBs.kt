package com.adesoftware.fetchingstatus.model


import com.google.gson.annotations.SerializedName

data class APIsDBs(
    @SerializedName("Core​API")
    val core​API: Core​API,
    @SerializedName("Docuware​API")
    val docuware​API: Docuware​API,
    @SerializedName("Prime DB")
    val primeDB: PrimeDB,
    @SerializedName("Redis DB")
    val redisDB: RedisDB,
    @SerializedName("Redis Q HQAPI")
    val redisQHQAPI: RedisQHQAPI,
    @SerializedName("Redis Q Prime")
    val redisQPrime: RedisQPrime,
    @SerializedName("Redis Q WAPI")
    val redisQWAPI: RedisQWAPI,
    @SerializedName("WebAPI DB")
    val webAPIDB: WebAPIDB,
    @SerializedName("Web​API")
    val web​API: Web​API
)