package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class HeightWTrunk(
    @SerializedName("feet")
    val feet: Double,
    @SerializedName("meters")
    val meters: Double
)