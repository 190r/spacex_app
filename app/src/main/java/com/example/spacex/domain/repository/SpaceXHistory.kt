package com.example.spacex.domain.repository

import com.example.spacex.domain.model.History
import com.example.spacex.domain.model.Query
import com.example.spacex.domain.model.Ship
import com.example.spacex.domain.model.Starlink
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface SpaceXHistory {

    @GET("v4/starlink")
    suspend fun getHistoryItems(): List<History>

    @GET("v4/starlink/{id}")
    suspend fun getHistoryItemById(@Path("id") id: String): History

    @POST("v4/starlink/query")
    suspend fun queryHistoryItems(@Body query: Query): List<History>

}