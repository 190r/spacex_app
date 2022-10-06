package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class Height(
    @SerializedName("feet")
    val feet: Double,
    @SerializedName("meters")
    val meters: Int
)