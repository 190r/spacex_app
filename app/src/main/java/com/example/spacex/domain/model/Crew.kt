package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class Crew(
    @SerializedName("agency")
    val agency: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("launches")
    val launches: List<String>,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("wikipedia")
    val wikipedia: String
)