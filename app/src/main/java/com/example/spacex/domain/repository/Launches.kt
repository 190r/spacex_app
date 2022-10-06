package com.example.spacex.domain.repository

import com.example.spacex.domain.model.Launch
import com.example.spacex.domain.model.Query
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface Launches {

    @GET("v5/launches")
    suspend fun getLaunchPads(): List<Launch>

    @GET("v5/launches/{id}")
    suspend fun getLaunchPadById(@Path("id") id: String): Launch

    @POST("v5/launches/query")
    suspend fun queryLaunchPads(query: Query): List<Launch>

}