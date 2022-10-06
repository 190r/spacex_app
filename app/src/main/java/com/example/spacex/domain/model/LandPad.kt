package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class LandPad(
    @SerializedName("details")
    val details: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("landing_attempts")
    val landingAttempts: Int,
    @SerializedName("landing_successes")
    val landingSuccesses: Int,
    @SerializedName("latitude")
    val latitude: Double,
    @SerializedName("launches")
    val launches: List<String>,
    @SerializedName("locality")
    val locality: String,
    @SerializedName("longitude")
    val longitude: Double,
    @SerializedName("name")
    val name: String,
    @SerializedName("region")
    val region: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("wikipedia")
    val wikipedia: String
)