package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class CompositeFairing(
    @SerializedName("diameter")
    val diameter: DiameterX,
    @SerializedName("height")
    val height: HeightX
)