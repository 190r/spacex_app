package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class DragonX(
    @SerializedName("capsule")
    val capsule: Any?,
    @SerializedName("flight_time_sec")
    val flightTimeSec: Any?,
    @SerializedName("land_landing")
    val landLanding: Any?,
    @SerializedName("manifest")
    val manifest: Any?,
    @SerializedName("mass_returned_kg")
    val massReturnedKg: Any?,
    @SerializedName("mass_returned_lbs")
    val massReturnedLbs: Any?,
    @SerializedName("water_landing")
    val waterLanding: Any?
)