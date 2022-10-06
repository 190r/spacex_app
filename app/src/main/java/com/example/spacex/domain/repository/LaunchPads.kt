package com.example.spacex.domain.repository

import com.example.spacex.domain.model.LaunchPad
import com.example.spacex.domain.model.Query
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface LaunchPads {

    @GET("v4/launchpads")
    suspend fun getLaunchPads(): List<LaunchPad>

    @GET("v4/launchpads/{id}")
    suspend fun getLaunchPadById(@Path("id") id: String): LaunchPad

    @POST("v4/launchpads/query")
    suspend fun queryLaunchPads(query: Query): List<LaunchPad>

}