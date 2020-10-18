package com.adesoftware.fetchingstatus.model


import com.google.gson.annotations.SerializedName

data class Sites(
    @SerializedName("My Utilita")
    val myUtilita: MyUtilita,
    @SerializedName("Prime")
    val prime: Prime,
    @SerializedName("Utilita Business")
    val utilitaBusiness: UtilitaBusiness,
    @SerializedName("Utilita Extra")
    val utilitaExtra: UtilitaExtra,
    @SerializedName("Utilita Mobile")
    val utilitaMobile: UtilitaMobile,
    @SerializedName("Utilita Switch")
    val utilitaSwitch: UtilitaSwitch
)