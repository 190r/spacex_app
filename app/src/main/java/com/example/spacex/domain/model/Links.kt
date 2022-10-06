package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("elon_twitter")
    val elonTwitter: String,
    @SerializedName("flickr")
    val flickr: String,
    @SerializedName("twitter")
    val twitter: String,
    @SerializedName("website")
    val website: String
)