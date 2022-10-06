package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class Diameter(
    @SerializedName("feet")
    val feet: Int,
    @SerializedName("meters")
    val meters: Double
)