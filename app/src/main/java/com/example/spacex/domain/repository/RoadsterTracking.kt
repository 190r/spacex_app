package com.example.spacex.domain.repository

import com.example.spacex.domain.model.Query
import com.example.spacex.domain.model.Roadster
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RoadsterTracking {

    @GET("v4/roadster")
    suspend fun getRoadster(): Roadster

    @POST("v4/roadster/query")
    suspend fun queryRoadster(@Body query: Query): List<Roadster>

}