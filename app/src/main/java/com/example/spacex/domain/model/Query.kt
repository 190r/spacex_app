package com.example.spacex.domain.model


import com.google.gson.annotations.SerializedName

data class Query(
    @SerializedName("options")
    val options: Options,
    @SerializedName("query")
    val query: QueryX
)