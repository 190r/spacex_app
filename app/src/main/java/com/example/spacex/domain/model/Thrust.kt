package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class Thrust(
    @SerializedName("kN")
    val kN: Double,
    @SerializedName("lbf")
    val lbf: Int
)