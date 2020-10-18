package com.adesoftware.fetchingstatus.model


import com.google.gson.annotations.SerializedName

data class FetchingData(
    @SerializedName("APIs & DBs")
    val aPIsDBs: APIsDBs,
    @SerializedName("Sites")
    val sites: Sites
)