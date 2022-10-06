package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class HeatShield(
    @SerializedName("dev_partner")
    val devPartner: String,
    @SerializedName("material")
    val material: String,
    @SerializedName("size_meters")
    val sizeMeters: Double,
    @SerializedName("temp_degrees")
    val tempDegrees: Int
)