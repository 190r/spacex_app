package com.example.spacex.domain.repository

import com.example.spacex.domain.model.Query
import com.example.spacex.domain.model.Ship
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface Ships {

    @GET("v4/rockets")
    suspend fun getShipsList(): List<Ship>

    @GET("v4/rockets/{id}")
    suspend fun getShipById(@Path("id") id: String): Ship

    @POST("v4/rockets/query")
    suspend fun queryShips(@Body query: Query): List<Ship>

}