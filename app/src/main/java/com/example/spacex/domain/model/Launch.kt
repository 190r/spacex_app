package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class Launch(
    @SerializedName("crew")
    val crew: List<String>
)