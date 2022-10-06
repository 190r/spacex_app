package com.example.spacex.domain.repository

import com.example.spacex.domain.model.Query
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface Roadster {

    @GET("v4/roadster")
    suspend fun getRoadster(): Roadster

    @POST("v4/roadster/query")
    suspend fun queryRoadster(query: Query): List<Roadster>

}