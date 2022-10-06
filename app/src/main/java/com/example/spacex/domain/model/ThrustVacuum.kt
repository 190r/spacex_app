package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class ThrustVacuum(
    @SerializedName("kN")
    val kN: Int,
    @SerializedName("lbf")
    val lbf: Int
)