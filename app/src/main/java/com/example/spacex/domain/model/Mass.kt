package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class Mass(
    @SerializedName("kg")
    val kg: Int,
    @SerializedName("lb")
    val lb: Int
)