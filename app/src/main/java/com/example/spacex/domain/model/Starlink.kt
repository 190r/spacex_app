package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class Starlink(
    @SerializedName("height_km")
    val heightKm: Double,
    @SerializedName("id")
    val id: String,
    @SerializedName("latitude")
    val latitude: Double,
    @SerializedName("launch")
    val launch: String,
    @SerializedName("longitude")
    val longitude: Double,
    @SerializedName("spaceTrack")
    val spaceTrack: SpaceTrack,
    @SerializedName("velocity_kms")
    val velocityKms: Double,
    @SerializedName("version")
    val version: String
)