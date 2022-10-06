package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class SecondStage(
    @SerializedName("burn_time_sec")
    val burnTimeSec: Int,
    @SerializedName("engines")
    val engines: Int,
    @SerializedName("fuel_amount_tons")
    val fuelAmountTons: Int,
    @SerializedName("payloads")
    val payloads: Payloads,
    @SerializedName("reusable")
    val reusable: Boolean,
    @SerializedName("thrust")
    val thrust: ThrustX
)