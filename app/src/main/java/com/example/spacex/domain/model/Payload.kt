package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class Payload(
    @SerializedName("apoapsis_km")
    val apoapsisKm: Double,
    @SerializedName("arg_of_pericenter")
    val argOfPericenter: Double,
    @SerializedName("customers")
    val customers: List<String>,
    @SerializedName("dragon")
    val dragon: DragonX,
    @SerializedName("eccentricity")
    val eccentricity: Double,
    @SerializedName("epoch")
    val epoch: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("inclination_deg")
    val inclinationDeg: Double,
    @SerializedName("launch")
    val launch: String,
    @SerializedName("lifespan_years")
    val lifespanYears: Int,
    @SerializedName("longitude")
    val longitude: Any?,
    @SerializedName("manufacturers")
    val manufacturers: List<String>,
    @SerializedName("mass_kg")
    val massKg: Int,
    @SerializedName("mass_lbs")
    val massLbs: Double,
    @SerializedName("mean_anomaly")
    val meanAnomaly: Double,
    @SerializedName("mean_motion")
    val meanMotion: Double,
    @SerializedName("name")
    val name: String,
    @SerializedName("nationalities")
    val nationalities: List<String>,
    @SerializedName("norad_ids")
    val noradIds: List<Int>,
    @SerializedName("orbit")
    val orbit: String,
    @SerializedName("periapsis_km")
    val periapsisKm: Double,
    @SerializedName("period_min")
    val periodMin: Double,
    @SerializedName("raan")
    val raan: Double,
    @SerializedName("reference_system")
    val referenceSystem: String,
    @SerializedName("regime")
    val regime: String,
    @SerializedName("reused")
    val reused: Boolean,
    @SerializedName("semi_major_axis_km")
    val semiMajorAxisKm: Double,
    @SerializedName("type")
    val type: String
)