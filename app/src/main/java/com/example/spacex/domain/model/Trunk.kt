package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class Trunk(
    @SerializedName("cargo")
    val cargo: Cargo,
    @SerializedName("trunk_volume")
    val trunkVolume: TrunkVolume
)