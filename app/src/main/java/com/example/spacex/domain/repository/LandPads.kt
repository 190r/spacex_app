package com.example.spacex.domain.repository

import com.example.spacex.domain.model.LandPad
import com.example.spacex.domain.model.Query
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface LandPads {

    @GET("v4/landpads")
    suspend fun getLandPads(): List<LandPad>

    @GET("v4/landpads/{id}")
    suspend fun getLandPadById(@Path("id") id: String): LandPad

    @POST("v4/landpads/query")
    suspend fun queryLandPads(query: Query): List<LandPad>

}