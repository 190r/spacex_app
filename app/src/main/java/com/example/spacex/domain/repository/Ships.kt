package com.example.spacex.domain.repository

import com.example.spacex.domain.model.Query
import com.example.spacex.domain.model.Ship
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface Ships {

    @GET("v4/rockets")
    suspend fun getRockets(): List<Ship>

    @GET("v4/rockets/{id}")
    suspend fun getRocketById(@Path("id") id: String): Ship

    @POST("v4/rockets/query")
    suspend fun queryRockets(query: Query): List<Ship>

}