package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class TrunkVolume(
    @SerializedName("cubic_feet")
    val cubicFeet: Int,
    @SerializedName("cubic_meters")
    val cubicMeters: Int
)