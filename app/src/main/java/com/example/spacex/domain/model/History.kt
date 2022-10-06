package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class History(
    @SerializedName("details")
    val details: String,
    @SerializedName("event_date_unix")
    val eventDateUnix: Int,
    @SerializedName("event_date_utc")
    val eventDateUtc: String,
    @SerializedName("links")
    val links: LinksX,
    @SerializedName("title")
    val title: String
)