package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class PressurizedCapsule(
    @SerializedName("payload_volume")
    val payloadVolume: PayloadVolume
)