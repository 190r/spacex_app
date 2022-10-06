package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class ReturnPayloadMass(
    @SerializedName("kg")
    val kg: Int,
    @SerializedName("lb")
    val lb: Int
)