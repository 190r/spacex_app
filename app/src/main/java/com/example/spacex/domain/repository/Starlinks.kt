package com.example.spacex.domain.repository

import com.example.spacex.domain.model.Query
import com.example.spacex.domain.model.Ship
import com.example.spacex.domain.model.Starlink
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface Starlinks {

    @GET("v4/starlink")
    suspend fun getStarlinks(): List<Starlink>

    @GET("v4/starlink/{id}")
    suspend fun getStarlinksById(@Path("id") id: String): Starlink

    @POST("v4/starlink/query")
    suspend fun queryStarlinks(query: Query): List<Starlink>

}