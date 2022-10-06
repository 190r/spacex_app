package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class PayloadVolume(
    @SerializedName("cubic_feet")
    val cubicFeet: Int,
    @SerializedName("cubic_meters")
    val cubicMeters: Int
)